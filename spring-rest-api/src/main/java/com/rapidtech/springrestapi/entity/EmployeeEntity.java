package com.rapidtech.springrestapi.entity;

import com.rapidtech.springrestapi.model.Employee;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "employee_tab")
@Entity
public class EmployeeEntity {
    @Id
    @TableGenerator(name = "employee_id_generator", table = "sequence_tab",
            pkColumnName = "gen_name", valueColumnName = "gen_value",
            pkColumnValue="employee_id", initialValue=0, allocationSize=0)
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "employee_id_generator")
    private Long id;
    @Column(name = "employee_name", length = 100, nullable = false)
    private String employeeName;
    @Column(name = "address", length = 200)
    private String address;

    @Column(name = "gender", length = 10, nullable = false)
    private String gender;

    @Temporal(TemporalType.DATE)
    @Column(name = "date_of_birth")
    private Date dateOfBirth;

    @Column(name = "place_of_birth")
    private String placeOfBirth;

    @Column(name = "city", length = 100)
    private String city;

    @Column(name = "country", length = 100)
    private String country;

    @Column(name = "postal_code", length = 10)
    private String postalCode;

    @Column(name = "notes", length = 250)
    private String notes;

    @OneToMany(mappedBy = "employee")
    private Set<PurchaseOrderEntity> purchaseOrders = new HashSet<>();


    public EmployeeEntity(Employee model) {
        BeanUtils.copyProperties(model,this);
    }
}
