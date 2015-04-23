package com.apress.springpersistence.audiomanager.domain;

import lombok.*;
import java.util.Set;
import javax.persistence.*;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Playlist {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;

    @ManyToOne
    private Person person;

    @ManyToMany
    private Set<Track> tracks;

}
