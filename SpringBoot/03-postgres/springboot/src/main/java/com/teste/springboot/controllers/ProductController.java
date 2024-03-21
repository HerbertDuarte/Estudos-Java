package com.teste.springboot.controllers;

import org.springframework.web.bind.annotation.RestController;
import com.teste.springboot.dtos.ProductDto;
import com.teste.springboot.models.ProductModel;
import com.teste.springboot.services.ProductService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/product")
public class ProductController {

 @Autowired()
 private ProductService productService;

 @GetMapping()
 public ResponseEntity<List<ProductModel>> getMethodName() {
     return ResponseEntity.status(HttpStatus.OK).body(productService.list());
 }

 @PostMapping()
 public ResponseEntity<ProductModel> create(@RequestBody @Valid ProductDto body) {

  return ResponseEntity.status(HttpStatus.CREATED).body(productService.save(body));

 }

}
