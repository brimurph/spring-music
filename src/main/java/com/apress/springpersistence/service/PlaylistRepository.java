package com.apress.springpersistence.service;

import com.apress.springpersistence.domain.Playlist;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PlaylistRepository extends PagingAndSortingRepository<Playlist, Long> {
}
