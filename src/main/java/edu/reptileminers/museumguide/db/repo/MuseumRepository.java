package edu.reptileminers.museumguide.db.repo;

import edu.reptileminers.museumguide.db.Museum;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MuseumRepository extends PagingAndSortingRepository<Museum, Long> {

    List<Museum> findByName(@Param("name") String name);
}