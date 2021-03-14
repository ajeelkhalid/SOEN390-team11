package com.soen390.team11.entity;

import com.soen390.team11.constant.MachineryState;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class ProductMachinery {
    @Id
    @GenericGenerator(name="machineryId", strategy = "com.soen390.team11.generator.ProductMachineryIDGenerator")
    @GeneratedValue(generator="machineryId")
    private String id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private MachineryState status;

    @Column(nullable = false)
    private int timer;

    @OneToOne
    @JoinColumn(name = "product_id")
    private Product product;

    public ProductMachinery() {
    }

    public ProductMachinery(String name, MachineryState status, int timer, Product product) {
        this.name = name;
        this.status = status;
        this.timer = timer;
        this.product = product;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MachineryState getStatus() {
        return status;
    }

    public boolean setStatus(MachineryState status) {
        if (MachineryState.validateStateTransition(this.status, status)) {
            this.status = status;
            return true;
        }
        return false;
    }

    public int getTimer() {
        return timer;
    }

    public void setTimer(int timer) {
        this.timer = timer;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
