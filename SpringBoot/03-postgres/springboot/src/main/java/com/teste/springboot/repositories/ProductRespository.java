package com.teste.springboot.repositories;

import java.util.UUID;
import com.teste.springboot.models.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRespository extends JpaRepository<ProductModel, UUID>{
 
}
