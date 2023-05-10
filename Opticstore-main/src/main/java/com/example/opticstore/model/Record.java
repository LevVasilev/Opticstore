package com.example.opticstore.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="records")
@Data
public class Record {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String product;
    private int count;
    private int priceforone;
    private int cost;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    public Record() {
    }

    public Record(String product, int count, int priceforone,int cost, User user) {
        this.product = product;
        this.count = count;
        this.priceforone = priceforone;
        this.cost = cost;
        this.user = user;

    }
}
