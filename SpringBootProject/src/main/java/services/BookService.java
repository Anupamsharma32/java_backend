package services;

import dao.BookRepository;
import entities.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Component
public class BookService {


    @Autowired
    private BookRepository bookRepository;
    public List<Book> getAllBooks(){
        List<Book> list=(List<Book>) this.bookRepository.findAll();
        return list;
    }

     public Book getBookById(int id){
        Book book=null;
        try{
            book=this.bookRepository.findById(id);

        }catch(Exception e){
            e.printStackTrace();

        }
        return book;
     }
     public Book addBook(Book b){
        Book result=bookRepository.save(b);
        return result;
     }

    public List<Book> getAllBook(){
           List<Book> list=(List<Book>) this.bookRepository.findAll();
           return list;
    }

     public void deleteBook(int id){
        bookRepository.deleteById(id);
     }

     public void updateBook(Book book,int bookId){
        book.setId(bookId);
        bookRepository.save(book);
     }
































//    private static List<Book> list = new ArrayList<>();
//    static{
//        list.add(new Book(2,"New1","x"));
//        list.add(new Book(3,"New2","y"));
//        list.add(new Book(4,"New3","z"));
//
//    }
//
//    public List<Book> getAllBook(){
//        return list;
//    }
//    public Book getBookById(int id){
//        Book book=null;
//        book=list.stream().filter(e->e.getId()==id).findFirst().get();
//        return book;
//    }
//    //adding the book
//    public void addBook(Book b){
//        list.add(b);
//
//    }
//    public  void deleteBook(int bid){
//        list=list.stream().filter(book -> {
//            if(book.getId()!=bid){
//                return true;
//            }
//            else {
//                return false;
//            }
//        }).collect(Collectors.toList());
//
//
//    }
//
//    //update the book
//
//    public void updateBook(Book book,int id){
//        list=list.stream().map(b->{
//            if(b.getId()==id){
//                b.setTitle(book.getTitle());
//
//                b.setAuthor(book.getAuthor());
//            }
//            return b;
//        }).collect(Collectors.toList());
//    }
}
