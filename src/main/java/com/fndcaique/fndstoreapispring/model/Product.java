package com.fndcaique.fndstoreapispring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

// @Getter // cria getters para todos os atributos da classe
// @Setter // cria setters para todos os atributos da classe
@Data // equivalente ao getter + setter e mais
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
// @Table(name = "product")
public class Product {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @Column(length = 50, nullable = false)
  private String name;

  private Integer quantity;
}
