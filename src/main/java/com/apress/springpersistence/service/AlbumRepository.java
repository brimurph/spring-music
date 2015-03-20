package com.apress.springpersistence.service;

import com.apress.springpersistence.domain.Album;
import org.springframework.data.repository.PagingAndSortingRepository;

//@RepositoryRestResource(collectionResourceRel = "albums", path = "albums")
public interface AlbumRepository extends PagingAndSortingRepository<Album, Long> {
}
