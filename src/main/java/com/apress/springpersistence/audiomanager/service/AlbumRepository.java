package com.apress.springpersistence.audiomanager.service;

import com.apress.springpersistence.audiomanager.domain.Album;
import org.springframework.data.repository.PagingAndSortingRepository;

//@RepositoryRestResource(collectionResourceRel = "albums", path = "albums")
public interface AlbumRepository extends PagingAndSortingRepository<Album, Long> {
}
