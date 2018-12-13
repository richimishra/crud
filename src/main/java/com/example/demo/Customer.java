package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {

        @Column(name = "name")
        String name;
        @Id
        @Column(name = "id")
        Integer id;


    public Customer() {
    }

    public Customer(String name, Integer id) {
            this.name = name;
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getId() {
            return id;
        }

    public void setId(Integer id) {
        this.id = id;
    }
}
