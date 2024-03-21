package com.teste.springboot.dtos;

import com.teste.springboot.models.ProductModel;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.math.BigDecimal;

public class ProductDto extends ProductModel { 
 @NotBlank
 private String name;
 @NotNull
 private BigDecimal price;
 
 public String getName() {
  return name;
 }
 public void setName(String name) {
  this.name = name;
 }
 public BigDecimal getPrice() {
  return price;
 }
 public void setPrice(BigDecimal price) {
  this.price = price;
 }
}