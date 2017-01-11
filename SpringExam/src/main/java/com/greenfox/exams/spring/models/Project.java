package com.greenfox.exams.spring.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Anna on 17/01/11.
 */
@Entity
@Table(name="projects")
@NoArgsConstructor
@Getter
@Setter
public class Project {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String typeOfTech;

    public Project(String name, String typeOfTech) {
        this.name = name;
        this.typeOfTech = typeOfTech;
    }
}
