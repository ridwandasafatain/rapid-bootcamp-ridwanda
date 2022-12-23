package com.rapidtech.springjson.entity;

import com.rapidtech.springjson.model.Address;
import com.rapidtech.springjson.model.CustomerDetail;
import com.rapidtech.springjson.model.CustomerReq;
import com.rapidtech.springjson.model.School;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "customer_tab")
public class CustomerEntity {
    @Id
    @TableGenerator(name = "id_generator", table = "sequence_tab",
            pkColumnName = "gen_name", valueColumnName = "gen_value",
            pkColumnValue="customer_id", initialValue=0, allocationSize=0)
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "id_generator")
    private Long id;
    @Column(name = "full_name", length = 100, nullable = false)
    private String fullName;
    @Column(name = "gender", length = 50, nullable = false)
    private String gender;
    @Column(name = "date_of_birth")
    @Temporal(TemporalType.DATE)
    private Date dateOfBirth;
    @Column(name = "place_of_birth", nullable = false)
    private String placeOfBirth;

    @OneToMany(mappedBy = "customer")
    private Set<AddressEntity> address;

    @OneToMany(mappedBy = "customer")
    private Set<SchoolEntity> schools;

    public CustomerEntity(CustomerReq model) {
        BeanUtils.copyProperties(model,this);
    }
}
