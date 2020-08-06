package com.example.demo;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
//Ref. = https://medium.com/@proSbeginner/spring-boot-pagination-and-sorting-96aadbfc18b0
//Ref. = https://www.baeldung.com/spring-data-jpa-pagination-sorting
//Ref. = https://github.com/joker10130-dev/springboot/tree/step_05
public interface UserRepository extends PagingAndSortingRepository<User, Integer> {
    Page<User> findAll(Pageable pageable);
}