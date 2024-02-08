package models;



import io.ebean.Model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Todo extends Model {

    @Id
    @GeneratedValue()
    private Long Id;
    private String content;
    private boolean done;

    public Todo() {
        done = false;
    }

}

