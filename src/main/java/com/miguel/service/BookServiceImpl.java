package com.miguel.service;

import com.miguel.dao.BookMapper;
import com.miguel.pojo.Books;

import java.util.List;

public class BookServiceImpl implements BookService{

    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    public int addBook(Books books) {
        return bookMapper.addBook(books);
    }

    public int deleteBookById(int bookID) {
        return bookMapper.deleteBookById(bookID);
    }

    public int updateBook(Books books) {
        System.out.println("BookServiceImpl: updateBook=>" + books);
        return bookMapper.updateBook(books);
    }

    public Books getBookById(int bookID) {
        return bookMapper.getBookById(bookID);
    }

    public List<Books> getAllBook() {
        return bookMapper.getAllBook();
    }

    public Books queryBookByName(String bookName) {
        return bookMapper.queryBookByName(bookName);
    }
}
