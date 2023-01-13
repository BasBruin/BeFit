package com.BeFit.Befit.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;
    private String GroupName;
    private String Description;


    @OneToMany(targetEntity = User.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "Gymmember_fk", referencedColumnName = "ID")
    private List<User> Groupmembers;

    public Group() {
    }
}
