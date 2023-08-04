package com.demobaithuchanhmd4.model;

import lombok.*;

import javax.persistence.*;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Data
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @ManyToOne
    private Country country;
    private double area;
    private double population;
    private double GDP;
    @Column(columnDefinition = "LONGTEXT")
    private String description;

}
