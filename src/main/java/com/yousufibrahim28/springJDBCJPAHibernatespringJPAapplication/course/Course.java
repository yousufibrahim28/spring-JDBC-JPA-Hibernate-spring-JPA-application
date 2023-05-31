package com.yousufibrahim28.springJDBCJPAHibernatespringJPAapplication.course;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
//@Entity(name = "Course") // you can pass a name if the table name is different
public class Course {
    @Id
    private long id;
    //@Column(name="name") // you can pass a name if the field name is different in the table
    private String name;
    //@Column(name="author")
    private String author;

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    public Course() {

    }

    public Course(long id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
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

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
