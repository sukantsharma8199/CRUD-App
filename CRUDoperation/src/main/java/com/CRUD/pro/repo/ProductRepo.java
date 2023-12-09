package com.CRUD.pro.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.CRUD.pro.entity.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {
	Product findByName(String name);

}
