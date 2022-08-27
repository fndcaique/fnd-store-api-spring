package com.fndcaique.fndstoreapispring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fndcaique.fndstoreapispring.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
  public List<Product> findByNameContains(String name);
}
