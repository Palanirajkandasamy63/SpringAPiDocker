package com.example.SpringApi.bean;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity //(name="course1") we can change the name of db
public class Course {
    @Id
    @GeneratedValue
    private long id;
    //@column(name="course1name") we can change the values in database name
    private String name;
    private String author;

    public Course( long id,String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }
    public Course() {} //this is to have defult construtor for an entity
    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }
}
