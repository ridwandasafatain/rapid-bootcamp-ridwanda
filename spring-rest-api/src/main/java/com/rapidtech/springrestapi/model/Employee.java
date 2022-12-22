package com.rapidtech.springrestapi.model;

import com.rapidtech.springrestapi.entity.EmployeeEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private Long id;
    private String employeeName;
    private String address;
    private String gender;

    @Temporal(TemporalType.DATE)
    private Date dateOfBirth;

    private String placeOfBirth;
    private String city;
    private String country;
    private String postalCode;
    private String notes;

    public Employee(EmployeeEntity entity) {
        BeanUtils.copyProperties(entity,this);
    }
}
