package com.jesus.curso.springboot.jpa.springboot_jpa.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity // -> obligatorio
@Table(name="persons") // -> opcional
public class Person {

    // mapeamos los datos 

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // -> identity autoincremental
    private Long id;

    private String name;
    private String lastname;

    @Column(name = "programming_language") // @Column -> nombre en la bbdd. Se omite si es el mismo nombre del attr 
    private String programmingLanguage;

    
    public Person(){} 

    public Person(Long id, String name, String lastname, String programmingLanguage) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.programmingLanguage = programmingLanguage;
    }

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
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public String getProgrammingLanguage() {
        return programmingLanguage;
    }
    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }
    
    
}