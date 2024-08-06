package com.book_store.book_APP.controller;

import com.book_store.book_APP.Entities.Book;
import com.book_store.book_APP.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book/v1")

public class Book_Controller {
    @Autowired
    private final BookService bookService;

    public Book_Controller(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping("/addBook")
    public ResponseEntity<Book> addBook(@RequestBody Book book){
       Book saveedBook= bookService.addBook(book);
       return ResponseEntity.ok(saveedBook);
    }
    @GetMapping("/getBook/{name}")
    public ResponseEntity<Book> getBookByName(@PathVariable("name") String name){
       final Book bookByName= bookService.getBookByName(name);
       return ResponseEntity.ok(bookByName);
    }

    @PutMapping("/updateBook")
    public ResponseEntity<Book> updateBook (@RequestBody Book book){
        Book saveedBook= bookService.UpdateBook(book);
        return ResponseEntity.ok(saveedBook);
    }
    @DeleteMapping("/deleteBook/{id}")
    public ResponseEntity<Book> deleteBook (@PathVariable("id") Integer id){
        bookService.deleteBook(id);
        return ResponseEntity.ok().build();
    }

}
