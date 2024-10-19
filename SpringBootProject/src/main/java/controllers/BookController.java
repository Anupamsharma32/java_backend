package controllers;


import entities.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import services.BookService;

import java.util.List;
import java.util.Optional;

@RestController
public class BookController {




    @Autowired
    private BookService bookService;
    @GetMapping("/books")

    public ResponseEntity<List<Book>> getBooks() {
        List<Book> list = bookService.getAllBook();

        if(list.size()<=0){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }else{
            return ResponseEntity.status(HttpStatus.CREATED).body(list);
        }
    }

    @PostMapping("/books")
    public Book addBook(@RequestBody Book book){
        this.bookService.addBook(book);
        return book;

    }
    // delete book handler
    @DeleteMapping("/books/{bookid}")
    public void deleteBook(@PathVariable("bookid") int bid){
        this.bookService.deleteBook(bid);

    }
    //update book handler

    @PutMapping("/books/{bookId}")
    public Book updateBook(@RequestBody Book book,@PathVariable("bookId") int bid){
        this.bookService.updateBook(book,bid);
        return book;


    }

}

