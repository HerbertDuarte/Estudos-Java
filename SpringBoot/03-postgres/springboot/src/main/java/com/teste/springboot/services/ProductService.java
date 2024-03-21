package com.teste.springboot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teste.springboot.dtos.ProductDto;
import com.teste.springboot.models.ProductModel;
import com.teste.springboot.repositories.ProductRespository;

@Service
public class ProductService {
 
 @Autowired
 private ProductRespository productRepository;

 public List<ProductModel> list(){
  return productRepository.findAll();
 }

 public ProductModel save(ProductDto product){

  ProductModel productToSave = new ProductModel();
  productToSave.setName(product.getName());
  productToSave.setPrice(product.getPrice());

  return productRepository.save(productToSave);

 }
}
