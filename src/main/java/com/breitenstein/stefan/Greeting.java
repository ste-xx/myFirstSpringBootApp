package com.breitenstein.stefan;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by sonste on 05.09.2016.
 */
@Entity
public class Greeting {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private String content;

    public Greeting() {

    }

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }



    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setContent(String content) {
        this.content = content;
    }
}