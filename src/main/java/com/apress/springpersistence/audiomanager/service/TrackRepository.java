package com.apress.springpersistence.audiomanager.service;

import com.apress.springpersistence.audiomanager.domain.Track;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface TrackRepository extends PagingAndSortingRepository<Track, Long> {
}
