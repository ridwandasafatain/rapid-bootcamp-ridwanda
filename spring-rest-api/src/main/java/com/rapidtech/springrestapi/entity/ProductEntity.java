package com.rapidtech.springrestapi.entity;

import com.rapidtech.springrestapi.model.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "product_tab")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductEntity {
    @Id
    @TableGenerator(name = "id_generator", table = "sequence_tab",
            pkColumnName = "gen_name", valueColumnName = "gen_value",
            pkColumnValue="product_id", initialValue=0, allocationSize=0)
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "id_generator")
    private Integer id;

    @Column(name = "name_product", length = 30, nullable = false)
    private String name;

    @Column(name = "code_product", length = 100, nullable = false)
    private String code;

    @Column(name = "price")
    private Double price;

    @Column(name = "category_id", nullable = false)
    private int categoryId;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "category_id", insertable = false, updatable = false)
    private CategoryEntity category;

    @Column(name = "supplier_id", nullable = false)
    private Long supplierId;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "supplier_id", insertable = false, updatable = false)
    private SupplierEntity supplier;

    @OneToMany(mappedBy = "product")
    private Set<PurchaseOrderDetailEntity> purchaseOrderDetails = new HashSet<>();


    public ProductEntity(Product model) {
        BeanUtils.copyProperties(model, this);
        /*
        this.code = model.getCode();
        this.name = model.getName();
        this.price = model.getPrice();
        this.categoryId = model.getCategoryId();
         */
    }

}
