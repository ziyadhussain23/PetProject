package com.example.petproject;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.hibernate.annotations.processing.SQL;
import org.springframework.format.annotation.DateTimeFormat;



import java.util.Date;

@Entity
public class pet {


    String name;
    String owner;
    String species;
    char sex;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    Date birth;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    Date death;
    @Id
    //@GeneratedValue(strategy = GenerationType)
    private int id;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Date getDeath() {
        return death;
    }

    public void setDeath(Date death) {
        this.death = death;
    }




    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}

