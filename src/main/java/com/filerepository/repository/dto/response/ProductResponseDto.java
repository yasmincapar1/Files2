package com.filerepository.repository.dto.response;

import com.fasterxml.jackson.annotation.JsonCreator;

public class ProductResponseDto {
    long id;
    String name;
    int price;
    @JsonCreator
    public ProductResponseDto(long id,String name,int price){
        this.id=id;
        this.name=name;
        this.price=price;

    }
    public long getId(){
        return id;

    }
    public void setId(long id){
        this.id=id;

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
