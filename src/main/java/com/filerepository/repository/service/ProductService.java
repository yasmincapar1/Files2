package com.filerepository.repository.service;

import com.filerepository.repository.repository.IProductRepository;
import com.filerepository.repository.repository.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
@Autowired
        //if you want to be able to create the object you must add the Autowired annotation
    IProductRepository repository;
    //saving, you shouldnt add id information

    public void save(Product product){
        repository.save(product);

    }
    //update
    public void update(Product product){
        repository.save(product);

    }
    public void deleteProduct(long id){
        repository.deleteById(id);
    }
    public Product getById(long id){
        Product product = repository.findById(id).get(); return product;}

    public Product findById(long id){
        Optional<Product> product = repository.findById(id);
        if(product.isEmpty())
            return new Product();
        return product.get();
    }
    public List<Product> getUpperPrice(double price){
        List<Product> productList = repository.findByPriceGreaterThan(price);
        return productList;
    }

    public List<Product> findall(){
        return repository.findAll();

    }

}
