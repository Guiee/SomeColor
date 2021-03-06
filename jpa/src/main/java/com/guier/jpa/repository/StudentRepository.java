package com.guier.jpa.repository;

import com.guier.jpa.pojo.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Long>,JpaRepository<Student, Long> {
}
