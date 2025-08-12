package com.example.productmanagement.service;

import com.example.productmanagement.model.Product;
import com.example.productmanagement.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductService {

    public final ProductRepository repo;

    public ProductService(ProductRepository repo) {
        this.repo = repo;
    }

    public Product saveProduct(Product product){
        return repo.save(product);
    }

    public List<Product> getAllProduct(){
        return repo.findAll();
    }

    public Product getProductById(Long id){
        return repo.findById(id).orElse(null);
    }

    public Product updateProduct(Long id, Product updateProduct){
        Product existing=repo.findById(id).orElse(null);
        if(existing!=null){
            existing.setName(updateProduct.getName());
            existing.setDescription((updateProduct.getDescription()));
            existing.setPrice(updateProduct.getPrice());
            return repo.save(existing);
        }
        return null;
    }

    public void deleteProduct(Long id){
         repo.deleteById(id);
    }
}
