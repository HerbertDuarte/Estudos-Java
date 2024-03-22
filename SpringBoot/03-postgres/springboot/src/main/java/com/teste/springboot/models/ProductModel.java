package com.teste.springboot.models;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
 
@Entity
@Table(name = "tb_products")
public class ProductModel implements Serializable {

 private static final long SerialVersionUID = 1L;

 @Id
 @GeneratedValue(strategy = GenerationType.AUTO)
 private UUID id;

 @Column(nullable = false)
 private String name;

 @Column(nullable = false) 
 private BigDecimal price;

 public UUID getId() {
  return id;
 }
 
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
