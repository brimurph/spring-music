package com.apress.springpersistence.audiomanager.service;

import com.apress.springpersistence.audiomanager.domain.Playlist;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PlaylistRepository extends PagingAndSortingRepository<Playlist, Long> {
}
