package edu.reptileminers.museumguide.db.data;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MuseumRepository extends PagingAndSortingRepository<Museum, Long> {

    List<Museum> findByName(@Param("name") String name);
}