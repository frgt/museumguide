package edu.reptileminers.museumguide.db.repo;

import edu.reptileminers.museumguide.db.Audio;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface AudioRepository extends PagingAndSortingRepository<Audio, Long> {

}