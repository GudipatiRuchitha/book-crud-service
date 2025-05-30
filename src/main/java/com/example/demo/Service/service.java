package com.example.demo.Service;

import com.example.demo.Model.model;
import com.example.demo.Repository.repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class service {

    @Autowired
    private repo bookRepo;

    public void createBook(model book) {
        bookRepo.save(book);
    }

    public model getBook(int id) {
        Optional<model> optionalBook = bookRepo.findById(id);
        return optionalBook.orElse(null);
    }

    public void updateBook(int id, model book) {
        Optional<model> optionalBook = bookRepo.findById(id);
        if (optionalBook.isPresent()) {
            model existingBook = optionalBook.get();
            existingBook.setName(book.getName());
            existingBook.setAuthor(book.getAuthor());
            bookRepo.save(existingBook);
        }
    }

    public void deleteBook(int id) {
        bookRepo.deleteById(id);
    }
}
