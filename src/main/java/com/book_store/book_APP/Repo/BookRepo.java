package com.book_store.book_APP.Repo;

import com.book_store.book_APP.Entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Book,Integer> {
    public Book findBookByTitle(String title);

}
