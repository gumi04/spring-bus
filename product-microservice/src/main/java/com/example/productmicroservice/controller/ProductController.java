package com.example.productmicroservice.controller;


import com.example.productmicroservice.constants.Contants;
import com.example.productmicroservice.entity.ProductEntity;
import com.example.productmicroservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/products")
public class ProductController {

  @Autowired
  private Contants contants;


  @Autowired
  private ProductRepository repository;


  @ResponseStatus(HttpStatus.OK)
  @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
  public List<ProductEntity> getAllProducts() {
    return repository.findAll();
  }



  @ResponseStatus(HttpStatus.OK)
  @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
  public ProductEntity saveProduct(@RequestBody ProductEntity product) {
    return repository.save(product);
  }

  @ResponseStatus(HttpStatus.OK)
  @GetMapping("/properti")
  public Map<String, String> getProperti(){
    Map<String, String> map = new HashMap<>();
    map.put("valor", contants.getPropertirRemota());
    return map;
  }
}
