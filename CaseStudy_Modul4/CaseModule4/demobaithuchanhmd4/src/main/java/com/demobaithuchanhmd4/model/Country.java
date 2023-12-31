package com.demobaithuchanhmd4.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Data
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
}
