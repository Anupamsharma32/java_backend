package entities;


import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;

@Entity

public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "book_id")
    private int id;
    private String title;

    @OneToOne(cascade = CascadeType.ALL)
    @Autowired

    private Author author;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Book() {
    }

    public Book(int id, String title, Author author) {
        this.id=id;
        this.title=title;
        this.author=author;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
