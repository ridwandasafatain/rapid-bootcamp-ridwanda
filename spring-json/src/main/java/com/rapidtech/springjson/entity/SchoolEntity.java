package com.rapidtech.springjson.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.rapidtech.springjson.model.School;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "school_tab")
public class SchoolEntity {
    @Id
    @TableGenerator(name = "id_generator", table = "sequence_tab",
            pkColumnName = "gen_name", valueColumnName = "gen_value",
            pkColumnValue="school_id", initialValue=0, allocationSize=0)
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "id_generator")
    private Long id;
    @Column(name = "school_title", length = 10, nullable = false)
    private String title;
    @Column(name = "school_name", length = 100, nullable = false)
    private String name;
    @Column(name = "school_level", length = 50, nullable = false)
    private String level;

    @Column(name = "customer_id", insertable = false, updatable = false)
    private Long customerId;
    @JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "customer_id", nullable = false)
    private CustomerEntity customer;

    public SchoolEntity(School model) {
        BeanUtils.copyProperties(model, this);
    }
}
