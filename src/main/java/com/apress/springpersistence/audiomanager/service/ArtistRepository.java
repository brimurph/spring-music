package com.apress.springpersistence.audiomanager.service;

import com.apress.springpersistence.audiomanager.domain.Artist;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ArtistRepository extends PagingAndSortingRepository<Artist, Long> {
}
