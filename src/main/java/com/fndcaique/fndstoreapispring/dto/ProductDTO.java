package com.fndcaique.fndstoreapispring.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import com.fndcaique.fndstoreapispring.model.Product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO {
  @NotBlank
  @Pattern(regexp = "[a-zA-Z]+.*")
  private String name;

  @NotNull(message = "must not be null and must be a number")
  @Min(value = 0)
  private Integer quantity;

  public Product build() {
    return new Product()
        .setName(this.name)
        .setQuantity(this.quantity);
  }
}
