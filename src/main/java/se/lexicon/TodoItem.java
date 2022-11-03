package se.lexicon;

import java.time.LocalDate;
import java.time.LocalTime;

public class TodoItem {

    private int id;
    private String title;
    private String description;
    private  String deadLine;
    
    private boolean done;
    private Person creator;


    public TodoItem(int id, String title, String description, boolean done, Person creator) {
        setId(id);
        this.title = title;
        this.description = description;
        this.done = done;
        this.creator = creator;
        this.deadLine = deadLine;
    }
     

  
   
    

    public String getDeadLine() {
        return deadLine;
    }

    public void setDeadline() {
        this.deadLine = deadLine;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id == 0)
            throw new IllegalStateException("ID cannot be 0");
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public Person getCreator() {
        return creator;
    }

    public void setCreator(Person creator) {
        this.creator = creator;
    }
}

