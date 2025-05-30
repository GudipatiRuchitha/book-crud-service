package com.example.demo.Controller;

import com.example.demo.Model.model;
import com.example.demo.Service.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
public class controller {

    @Autowired
    private service bookService;

    @PostMapping
    public String createBook(@RequestBody model book) {
        bookService.createBook(book);
        return "Created successfully";
    }

    @GetMapping("/{id}")
    public model getBook(@PathVariable int id) {
        return bookService.getBook(id);
    }

    @PutMapping("/{id}")
    public String updateBook(@PathVariable int id, @RequestBody model book) {
        bookService.updateBook(id, book);
        return "Updated successfully";
    }

    @DeleteMapping("/{id}")
    public String deleteBook(@PathVariable int id) {
        bookService.deleteBook(id);
        return "Deleted successfully";
    }
}

