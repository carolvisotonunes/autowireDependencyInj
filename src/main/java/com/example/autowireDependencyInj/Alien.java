package com.example.autowireDependencyInj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Alien {
    private int id;
    private String name;
    private String tech;
    @Autowired// search the obj by type
    @Qualifier("lap1")// search by name
    private Laptop laptop;

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public Alien() {
        System.out.printf("object created.....");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    public void show(){
        System.out.println("in show");
        laptop.compile();
    }

}
