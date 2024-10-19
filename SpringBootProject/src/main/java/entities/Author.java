package entities;


import jakarta.persistence.*;

@Entity
@Table(name="author")
public class Author {
    Author(){

    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int authorId;
    @Column(name="first_name")
    private String fname;
    private String lname;
    private String language;

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public String getFname() {
        return fname;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }
}
