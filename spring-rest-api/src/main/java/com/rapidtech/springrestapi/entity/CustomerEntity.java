package com.rapidtech.springrestapi.entity;

import com.rapidtech.springrestapi.model.Customer;
import com.rapidtech.springrestapi.model.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

import javax.persistence.*;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "customer_tab")

public class CustomerEntity {
    @Id
    @TableGenerator(name = "id_generator", table = "sequence_tab",
            pkColumnName = "gen_name", valueColumnName = "gen_value",
            pkColumnValue="customer_id", initialValue=0, allocationSize=0)
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "id_generator")
    private Integer id;

    @Column(name = "customer_name", length = 100)
    private String fullName;

    @Column(name = "customer_address", length = 200)
    private String address;

    @Column(name = "customer_city", length = 20)
    private String city;

    @Column(name = "customer_gender", length = 15)
    private String gender;

    @Column(name = "customer_date_birth")
    private Date dateOfBirth;

    @Column(name = "customer_place_birth")
    private String dateOfPlace;

    public CustomerEntity(Customer model) {
        BeanUtils.copyProperties(model, this);
    }

}
