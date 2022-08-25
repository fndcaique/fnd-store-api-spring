package com.fndcaique.fndstoreapispring.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fndcaique.fndstoreapispring.dto.ProductDTO;
import com.fndcaique.fndstoreapispring.model.Product;
import com.fndcaique.fndstoreapispring.repository.ProductRepository;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/products")
@AllArgsConstructor
public class ProductController {

  // @Autowired
  private ProductRepository repository;

  @GetMapping
  public ResponseEntity<List<Product>> findAll() {
    return ResponseEntity.ok(repository.findAll());
  }

  @PostMapping
  public ResponseEntity<Product> create(@RequestBody(required = true) ProductDTO productDTO) {
    return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(productDTO.build()));
  }

  // todo
  // findAll ✅
  // create ✅
  // update
  // delete
  // findById
  // findByName

}
