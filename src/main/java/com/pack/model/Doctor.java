package com.pack.model;

import jakarta.persistence.*;

import java.util.List;


@Entity
@Table(name="doctor")
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String name;
    @Column
    private String loc;
    @Column
    private String spec;
    @OneToMany(targetEntity = BookSlot.class,cascade = CascadeType.ALL)
    @JoinColumn(name="do_fk",referencedColumnName = "id")
    private List<BookSlot> bookSlots;

    public List<BookSlot> getBookSlots() {
        return bookSlots;
    }

    public void setBookSlots(List<BookSlot> bookSlots) {
        this.bookSlots = bookSlots;
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

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }



}
