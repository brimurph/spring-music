package com.apress.springpersistence.audiomanager.domain;

import lombok.*;
import java.util.Set;
import javax.persistence.*;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Album {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;

    @OneToMany(mappedBy = "album")
    private Set<Track> tracks;

    @ManyToMany
    private Set<Artist> artists;

}
