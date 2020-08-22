package com.miguel;

import com.miguel.pojo.Books;
import com.miguel.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTest {

    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookService = context.getBean("BookServiceImpl", BookService.class);
        List<Books> allBook = bookService.getAllBook();
        for (Books books : allBook) {
            System.out.println(books);
        }
    }
}
