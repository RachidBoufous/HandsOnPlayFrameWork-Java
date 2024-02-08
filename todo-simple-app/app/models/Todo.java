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

    public Long getId() {
        return Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean getDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }


    // toString function
    public String toString() {
        return "Todo{" +
                "id=" + Id +
                ", content='" + content + '\'' +
                ", done=" + done +
                '}';
    }


}

