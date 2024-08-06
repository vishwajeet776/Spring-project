package com.book_store.book_APP.services;

import com.book_store.book_APP.Entities.Book;
import com.book_store.book_APP.Repo.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;

@Service
public class BookService {
    @Autowired
    BookRepo bookRepo;
    public Book addBook(Book book){
       return bookRepo.save(book);
    }

    public Book getBookByName(String name) {
       return bookRepo.findBookByTitle(name);
    }

    public void deleteBook(Integer id) {
        bookRepo.deleteById(id);
    }

    public Book UpdateBook(Book book) {
        return bookRepo.save(book);
    }
}
