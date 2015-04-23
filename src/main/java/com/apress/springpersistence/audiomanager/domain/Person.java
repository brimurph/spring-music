package com.apress.springpersistence.audiomanager.domain;

import lombok.*;
import java.util.Set;
import javax.persistence.*;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;

    @OneToMany(mappedBy = "person")
    private Set<Playlist> playlists;

}
