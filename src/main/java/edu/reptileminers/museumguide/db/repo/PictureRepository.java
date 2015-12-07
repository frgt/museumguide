package edu.reptileminers.museumguide.db.repo;

import edu.reptileminers.museumguide.db.Picture;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PictureRepository extends PagingAndSortingRepository<Picture, Long> {

}