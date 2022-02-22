package com.filerepository.repository.dto.request;

import com.fasterxml.jackson.annotation.JsonCreator;

public class ProductRequestDto {
    String name;
    int price;

    @JsonCreator//dto lari alip veririken
    public ProductRequestDto(String name, int price){
        this.name=name;
        this.price=price;
    }
    public String getName(){
        return name;

    }
    public void setName(String name){
        this.name=name;

    }

    public int getPrice(){
        return price;

    }
    public void setPrice(){
        this.price=price;

    }

}
