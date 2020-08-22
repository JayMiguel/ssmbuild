package com.miguel.service;

import com.miguel.pojo.Books;

import java.util.List;

public interface BookService {

    int addBook(Books books);

    int deleteBookById(int bookID);

    int updateBook(Books books);

    Books getBookById(int bookID);

    List<Books> getAllBook();
}
