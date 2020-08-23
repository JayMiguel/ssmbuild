package com.miguel.dao;

import com.miguel.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookMapper {

    int addBook(Books books);

    int deleteBookById(@Param("bookID") int id);

    int updateBook(Books books);

    Books getBookById(@Param("bookID")int id);

    List<Books> getAllBook();

    Books queryBookByName(String bookName);
}
