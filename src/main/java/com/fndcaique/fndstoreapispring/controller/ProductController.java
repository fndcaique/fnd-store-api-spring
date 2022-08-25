package com.fndcaique.fndstoreapispring.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

  @GetMapping(value = "/{id}")
  public ResponseEntity<Object> findById(@PathVariable(required = true) int id) {
    if (!repository.existsById(id)) {
      return ResponseEntity.notFound().build();
    }
    return ResponseEntity.ok(repository.findById(id));
  }

  @PostMapping
  public ResponseEntity<Product> create(@RequestBody(required = true) ProductDTO productDTO) {
    return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(productDTO.build()));
  }

  @PatchMapping(value = "/{id}")
  public ResponseEntity<Object> update(@PathVariable(required = true) int id,
      @RequestBody(required = true) ProductDTO productDTO) {
    if (!repository.existsById(id)) {
      return ResponseEntity.notFound().build();
    }
    Product updatedProduct = productDTO.build().setId(id);

    return ResponseEntity.ok(repository.save(updatedProduct));
  }

  @DeleteMapping(value = "/{id}")
  public ResponseEntity<Object> removeById(@PathVariable(required = true) int id) {
    if (!repository.existsById(id)) {
      return ResponseEntity.notFound().build();
    }
    repository.deleteById(id);
    return ResponseEntity.ok().build();
  }

  // todo
  // findAll ✅
  // create ✅ // without validation
  // update ✅ // without validation
  // delete ✅
  // findById ✅
  // findByName

}
