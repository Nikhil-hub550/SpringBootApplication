package com.upgrad.technicalblogpost.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="posts")
public class Post {
    public Post(){
        System.out.println("*********** Post ***********");
    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private Integer id;

    @Column(name="title")
    private String title;

    @Column(name="body")
    private String body;

    @Transient
    private Date date;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="user_id")
    private User user;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Category> categories= new ArrayList<Category>();

    @Transient
    private String javaBlog;
    @Transient
    private String springBLog;

    public String getJavaBlog() {
        return javaBlog;
    }
      //getter and setter
    public void setJavaBlog(String javaBlog) {
        this.javaBlog = javaBlog;
    }

    public String getSpringBLog() {
        return springBLog;
    }

    public void setSpringBLog(String springBLog) {
        this.springBLog = springBLog;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
