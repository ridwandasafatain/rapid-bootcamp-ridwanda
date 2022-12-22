package com.rapidtech.springrestapi.entity;

import com.rapidtech.springrestapi.model.PurchaseOrderDetail;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "po_detail_tab")

public class PurchaseOrderDetailEntity {
    @Id
    @TableGenerator(name = "po_detail_id_generator", table = "sequence_tab",
            pkColumnName = "gen_name", valueColumnName = "gen_value",
            pkColumnValue="product_id", initialValue=0, allocationSize=0)
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "po_detail_id_generator")
    private Long id;

    @Column(name = "po_id", nullable = false)
    private Long poId;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "po_id", insertable = false, updatable = false)
    private PurchaseOrderEntity purchaseOrder;


    @Column(name = "product_id", nullable = false)
    private Integer productId;

    @Column(name = "quantity", nullable = false)
    private Double quantity;

    @Column(name = "price", nullable = false)
    private Double price;

    @Column(name = "sub_amount", nullable = false)
    private Double subAmount;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "product_id", insertable = false, updatable = false)
    private ProductEntity product;


    public PurchaseOrderDetailEntity(PurchaseOrderDetail model) {
        BeanUtils.copyProperties(model, this);
    }
}
