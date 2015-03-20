package com.apress.springpersistence.service;

import com.apress.springpersistence.domain.Track;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface TrackRepository extends PagingAndSortingRepository<Track, Long> {
}
