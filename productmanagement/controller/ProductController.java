package com.example.productmanagement.controller;

import com.example.productmanagement.model.Product;
import com.example.productmanagement.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @PostMapping
    public Product createProducte(@RequestBody Product product){
     return (Product) service.saveProduct(product);
    }

    @GetMapping
    public List<Product> getAllProducts(){
        return service.getAllProduct();
    }

   @GetMapping("/{id}")
    public Product getProduct(@PathVariable Long id){
        return service.getProductById(id);
   }

   @PutMapping("/{id}")
    public Product updateProduct(@PathVariable Long id, @RequestBody Product product){
        return service.updateProduct(id,product);
   }

   @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Long id){
       service.deleteProduct(id);
   }
}
