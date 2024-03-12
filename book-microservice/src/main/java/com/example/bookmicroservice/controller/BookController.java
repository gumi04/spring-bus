package com.example.bookmicroservice.controller;

import com.example.bookmicroservice.constants.Contants;
import com.example.bookmicroservice.entity.BookEntity;
import com.example.bookmicroservice.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/books")
public class BookController {

    @Autowired
    private Contants contants;


    @Autowired
    private BookRepository repository;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<BookEntity> getAllProducts() {
        return repository.findAll();
    }


    @ResponseStatus(HttpStatus.OK)
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public BookEntity saveProduct(@RequestBody BookEntity book) {
        return repository.save(book);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/properti")
    public Map<String, String> getProperti(){
        Map<String, String> map = new HashMap<>();
        map.put("valor", contants.getPropertirRemota());
        return map;
    }

}
