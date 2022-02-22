package com.filerepository.repository.repository;


import com.filerepository.repository.repository.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
//this annotaion must be added
public interface IProductRepository extends JpaRepository<Product,Long>{//write class and id
    //the id parameter is long
    List<Product> findByPriceGreaterThan(double price);
    List<Product> findByStateEquals(int state);
    List<Product> findByPriceGreaterThanAndStateEquals(double price,int state);

}
