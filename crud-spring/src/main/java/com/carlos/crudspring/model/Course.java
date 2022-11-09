package com.carlos.crudspring.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Data
@Entity

public class Course {

    @Id //indica que será a primary key
    @GeneratedValue(strategy = GenerationType.AUTO) //indica que será gerado um valor aleatório
    @JsonProperty("_id")
    private Long id;

    @Column(length = 200, nullable = false)
    private String name;

    @Column(length = 10, nullable = false)
    private String category;
}