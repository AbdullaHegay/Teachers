package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "main_1")
public class Main {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fullname;
    private String subject;
    private int classes;

    public Main() {
    }

    public Main(String fullname, String subject, int classes) {
        this.id = id;
        this.fullname = fullname;
        this.subject = subject;
        this.classes = classes;
    }

    public Long getId() {
        return id;
    }

    public String getFullname() {
        return fullname;
    }

    public String getSubject() {
        return subject;
    }

    public int getClasses() {
        return classes;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setClasses(int classes) {
        this.classes = classes;
    }

}
