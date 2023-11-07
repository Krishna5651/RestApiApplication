/**
 * Created By Krishna Shinde
 * Date : 07-11-2023
 * Time : 20:51
 * Project: RestApiApplication
 **/

package com.restapi.RestApiApplication.repository;

import com.restapi.RestApiApplication.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StudentRepo extends JpaRepository<Student,Long> {
    Optional<Student> findByName(String name);
}
