package com.kunal.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kunal.model.Books;

@Repository
public interface BooksRepository extends CrudRepository<Books, Integer> {

}
