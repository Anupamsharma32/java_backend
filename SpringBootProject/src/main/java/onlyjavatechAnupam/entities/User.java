package onlyjavatechAnupam.entities;




import jakarta.persistence.*;

//import javax.persistence.*;

@Entity
public class User {
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", status='" + status + '\'' +
                '}';
    }



    public User(){
        super();
    }

    public User(String name, String city, String status) {
        super();
        this.id=id;
        this.name = name;
        this.city = city;
        this.status = status;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String city;

    private String status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for city
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    // Getter and Setter for status
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


}