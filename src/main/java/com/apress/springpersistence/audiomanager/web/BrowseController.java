package com.apress.springpersistence.audiomanager.web;

import com.apress.springpersistence.audiomanager.domain.Playlist;
import com.apress.springpersistence.audiomanager.service.PlaylistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Resources;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/browse")
public class BrowseController {

    @Autowired
    private PlaylistRepository playlistRepository;

    @Transactional(readOnly = true)
    @RequestMapping(value = "/popular/playlists", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    HttpEntity<Resources<Playlist>> showPopularPlaylists() {
        Resources<Playlist> resources = new Resources<Playlist>(this.playlistRepository.findAll());
        return new ResponseEntity<Resources<Playlist>>(resources, HttpStatus.OK);
    }

}
