package com.BeFit.Befit.model;

import javax.persistence.*;

@Entity
@Table (name = "Gymmember")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String Name;
    private int PRBench;


    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getPRBench() {
        return PRBench;
    }

    public void setPRBench(int PRBench) {
        this.PRBench = PRBench;
    }
}
