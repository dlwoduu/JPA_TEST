package com.example.jpatest.entity;


import lombok.*;


import javax.persistence.*;
import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class GrandParent {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private int age;


    @OneToMany(mappedBy = "grandParent", cascade = CascadeType.MERGE)
    private List<Parent> parents;
}
