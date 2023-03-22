package com.mockito.crud.person.infraestructure.repository;

import com.mockito.crud.person.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends JpaRepository<Person,Integer> {
    @Query(value = "SELECT * FROM PERSONS WHERE NAME = ? ",nativeQuery = true)
    public List<Person> findByName(String name);
}
