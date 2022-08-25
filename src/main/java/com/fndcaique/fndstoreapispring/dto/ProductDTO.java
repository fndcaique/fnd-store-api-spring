package com.fndcaique.fndstoreapispring.dto;

import com.fndcaique.fndstoreapispring.model.Product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO {
  private String name;
  private Integer quantity;

  public Product build() {
    return new Product()
        .setName(this.name)
        .setQuantity(this.quantity);
  }
}
