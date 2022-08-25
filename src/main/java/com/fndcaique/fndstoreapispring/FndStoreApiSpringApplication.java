package com.fndcaique.fndstoreapispring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.fndcaique.fndstoreapispring.model.Product;
import com.fndcaique.fndstoreapispring.repository.ProductRepository;

@SpringBootApplication
public class FndStoreApiSpringApplication {

  public static void main(String[] args) {
    SpringApplication.run(FndStoreApiSpringApplication.class, args);
  }

  @Bean
  CommandLineRunner initDatabase(ProductRepository productRepository) {
    return args -> {
      productRepository.deleteAll();

      Product product = new Product();
      product.setName("Product 1");
      product.setQuantity(10);

      productRepository.save(product);
    };
  }
}
