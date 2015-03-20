package com.apress.springpersistence.service;

import com.apress.springpersistence.domain.Artist;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ArtistRepository extends PagingAndSortingRepository<Artist, Long> {
}
