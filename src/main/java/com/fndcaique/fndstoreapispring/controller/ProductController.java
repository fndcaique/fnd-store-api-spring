package com.fndcaique.fndstoreapispring.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fndcaique.fndstoreapispring.model.Product;
import com.fndcaique.fndstoreapispring.repository.ProductRepository;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/products")
@AllArgsConstructor
public class ProductController {

  // @Autowired
  private ProductRepository repository;

  // public ProductController(ProductRepository repository) {
  // this.repository = repository;
  // }

  @GetMapping
  public List<Product> findAll() {
    return repository.findAll();
  }

  // todo
  // create
  // update
  // delete
  // findById
  // findByName

}
