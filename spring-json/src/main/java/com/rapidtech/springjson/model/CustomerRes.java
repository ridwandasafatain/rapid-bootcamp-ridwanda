package com.rapidtech.springjson.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Access;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerRes {
    private List<CustomerDetail> data;
    private Integer successSave;
    private Integer failedSave;
}
