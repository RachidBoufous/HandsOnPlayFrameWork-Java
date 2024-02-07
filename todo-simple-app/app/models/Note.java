package models;


import io.ebean.Model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.security.Timestamp;

@Entity
public class Note extends Model {

    @Id
    @GeneratedValue()
    private Long Id;

    private String title;
    private String content;

    @CreatedTimestamp
    private Timestamp createdAt;

    @UpdatedTimestamp
    private Timestamp updatedAt;

    public Todo() {
        // Default constructor
    }

}
