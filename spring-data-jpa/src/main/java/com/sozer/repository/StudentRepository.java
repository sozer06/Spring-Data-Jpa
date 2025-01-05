package com.sozer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sozer.entities.Student;


@Repository
public interface StudentRepository  extends JpaRepository<Student, Integer>{

}
