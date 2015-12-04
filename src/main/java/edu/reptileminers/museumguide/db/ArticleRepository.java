package edu.reptileminers.museumguide.db;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ArticleRepository extends PagingAndSortingRepository<Article, Long> {

    List<Article> findByTitle(@Param("title") String title);
}