package edu.reptileminers.museumguide.db.repo;

import edu.reptileminers.museumguide.db.Article;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticleRepository extends PagingAndSortingRepository<Article, Long> {

    List<Article> findByTitle(@Param("title") String title);
}