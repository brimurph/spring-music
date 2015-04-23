package com.apress.springpersistence.audiomanager.domain;

import lombok.*;
import java.util.Set;
import javax.persistence.*;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Track {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;
    private Integer duration;

    @ManyToOne
    private Album album;

    @ManyToMany
    private Set<Artist> artists;

}
