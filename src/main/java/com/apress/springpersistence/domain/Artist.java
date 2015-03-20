package com.apress.springpersistence.domain;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Artist {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;

    //@OneToMany(mappedBy = "artist")
    @ManyToMany
    private Set<Album> albums;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(Set<Album> albums) {
        this.albums = albums;
    }

}
