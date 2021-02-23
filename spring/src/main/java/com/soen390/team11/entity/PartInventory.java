package com.soen390.team11.entity;

import javax.persistence.*;

@Entity(name = "part_inventory")
public class PartInventory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String location;

    @Column
    private int quantity;

    @Column
    private Long partid;

    public PartInventory() {
    }

    public PartInventory(String location, int quantity, Long partid) {
        this.location = location;
        this.quantity = quantity;
        this.partid = partid;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Long getPartid() {
        return partid;
    }

    public void setPartid(Long partid) {
        this.partid = partid;
    }
}
