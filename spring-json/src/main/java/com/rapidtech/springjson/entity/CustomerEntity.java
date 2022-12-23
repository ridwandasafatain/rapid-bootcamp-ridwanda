package com.rapidtech.springjson.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
import java.util.ArrayList;
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

    @JsonIgnore
    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<AddressEntity> address = new ArrayList<>();

    @JsonIgnore
    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<SchoolEntity> schools = new ArrayList<>();

    public CustomerEntity(CustomerDetail model) {
        BeanUtils.copyProperties(model, this);
    }

    public void addAddress(AddressEntity address){
        this.address.add(address);
        address.setCustomer(this);
    }
    public void addAddressList(List<Address> models){
        for(Address address : models){
            this.addAddress(new AddressEntity(address));
        }
    }

    public void addSchool(SchoolEntity schoolEntity){
        this.schools.add(schoolEntity);
        schoolEntity.setCustomer(this);
    }
    public void addSchoolList(List<School> models){
        for(School school : models){
            this.addSchool(new SchoolEntity(school));
        }
    }

    public CustomerEntity(Long id, String fullName, String gender) {
        this.id = id;
        this.fullName = fullName;
        this.gender = gender;
    }
}
