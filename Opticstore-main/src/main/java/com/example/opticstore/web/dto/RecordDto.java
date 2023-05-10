package com.example.opticstore.web.dto;

import lombok.Data;

@Data
public class RecordDto {

    private String product;

    private int count;
    private int priceforone;

    private int cost;

    public RecordDto() {
    }

    public RecordDto(String product,int priceforone,int cost, int count) {
        super();
        this.product = product;
        this.count = count;
        this.priceforone = priceforone;
        this.cost = cost;
    }
}
