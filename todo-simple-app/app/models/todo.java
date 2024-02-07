package models;



import io.ebean.Model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.security.Timestamp;

@Entity
public class todo extends Model {

    @Id
    @GeneratedValue()
    private Long Id;

    private String title;
    private String content;



    public todo() {
        // Default constructor
    }

}

