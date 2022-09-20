package com.fndcaique.fndstoreapispring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FndStoreApiSpringApplication {

  public static void main(String[] args) {
    SpringApplication.run(FndStoreApiSpringApplication.class, args);
  }

  // @Bean
  // CommandLineRunner initDatabase(ProductRepository productRepository) {
  // return args -> {
  // productRepository.deleteAll();

  // Product product = new Product();
  // product.setName("Product 1");
  // product.setQuantity(10);

  // productRepository.save(product);
  // };
  // }
}
