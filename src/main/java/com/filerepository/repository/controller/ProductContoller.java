package com.filerepository.repository.controller;


import com.filerepository.repository.dto.request.ProductRequestDto;
import com.filerepository.repository.repository.entity.Product;
import com.filerepository.repository.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/product")
public class ProductContoller {
    @Autowired
    ProductService productService;

    @GetMapping("/addproduct")
    public void addproduct(){
        //initialising the database
        productService.save(Product.builder().name("username1").price(12345).state(1).build());
        productService.save(Product.builder().name("username2").price(12789).state(1).build());



    }
    @GetMapping("/updateproduct")
    public void saveProduct(){
        productService.update(Product.builder().id(2L).name("password4").price(1200).state(1).build());
        //if id is given then will update whatever is in id location 2 with this product
        //if id is not given


    }

    @GetMapping("/getbyid")
    public ResponseEntity<Product> getById(long id){
        return ResponseEntity.ok(productService.getById(id));}


    @GetMapping("/findbyid")
    public ResponseEntity<Product> findById(long id){

        return ResponseEntity.ok(productService.findById(id));
    }
    @GetMapping("/findbypass")
    public ResponseEntity<List<Product>> findByPrice(int price){
        return ResponseEntity.ok(productService.getUpperPrice(price));}

    @GetMapping("/greetings")
    public String greetings(){

        return "<p style='background-color:red'> HELLO </p>";
    }



    //localhost:8099/product/getallfromdatabase
    @GetMapping("/getallfromdatabase")
    public ResponseEntity<List<Product>> getallfromdatabase(){
        return ResponseEntity.ok(productService.findall());

    }
    public ResponseEntity<Void> save(ProductRequestDto dto){
        return ResponseEntity.ok().build();

    }


    @GetMapping("/deleteproduct")
    public ResponseEntity<String> deleteProduct(long id){
        try{
        productService.deleteProduct(id);
        return ResponseEntity.ok("Ok");
        }catch(Exception e){
            return ResponseEntity.ok("There was a problem...: "+e.toString());

        }


    }

    @GetMapping("/sayfa")
    public String sayfa(){
        return "<p style='background-color:red'<p> Hello</p>";

    }
    @PostMapping("/save")//by using response entity that gives us feedback
    public ResponseEntity<String> save(String name, int price){
        productService.save(
                Product.builder().name(name).price(price).build()
        );//enables you to save the product
        return ResponseEntity.ok("Ok");
    }


}
