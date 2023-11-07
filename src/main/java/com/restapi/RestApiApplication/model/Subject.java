/**
 * Created By Krishna Shinde
 * Date : 07-11-2023
 * Time : 20:51
 * Project: RestApiApplication
 **/

package com.restapi.RestApiApplication.model;

import jakarta.persistence.*;

@Entity
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int marks;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
}
