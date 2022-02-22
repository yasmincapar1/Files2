package com.filerepository.repository.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@NoArgsConstructor
//creates empty constructor
@AllArgsConstructor
//creates parameterized constructor
@Entity
@Table(name="tblurun")
public class Product {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    long id;
    String name;
    int price;
    int state;
}
