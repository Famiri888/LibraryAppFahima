package com.LibraryApp.entities;

import jakarta.persistence.*;

@Entity
public class Books {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String authors;
    private String title;
    private String published;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinTable (name = "users")
    private Users users;

    public Books(long id, String authors, String title, String published, Users users) {
        this.id = id;
        this.authors = authors;
        this.title = title;
        this.published = published;
        this.users = users;
    }
        public Books(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublished() {
        return published;
    }

    public void setPublished(String published) {
        this.published = published;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "Books{" +
                "id=" + id +
                ", authors='" + authors + '\'' +
                ", title='" + title + '\'' +
                ", published='" + published + '\'' +
                ", users=" + users +
                '}';
    }
}


