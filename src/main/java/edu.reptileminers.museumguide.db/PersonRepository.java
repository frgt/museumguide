package edu.reptileminers.museumguide.db.data;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PersonRepository extends PagingAndSortingRepository<Person, Long> {

    List<Person> findByFirstName(@Param("firstName") String firstName);

    List<Person> findByLastName(@Param("lastName") String lastName);

}