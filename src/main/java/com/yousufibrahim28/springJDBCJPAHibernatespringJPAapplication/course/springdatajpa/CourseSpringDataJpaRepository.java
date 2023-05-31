package com.yousufibrahim28.springJDBCJPAHibernatespringJPAapplication.course.springdatajpa;

import com.yousufibrahim28.springJDBCJPAHibernatespringJPAapplication.course.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

// This is all is required to connect and interact with the DB
// we can write custom methods
public interface CourseSpringDataJpaRepository extends JpaRepository<Course,Long> {

    // custom method, just use a naming convention set by spring
    // here for finding a data by author name
    // the naming convention is findByAuthor Author is the field name in the course entity
    List<Course> findByAuthor(String author);
    List<Course> findByName(String name);

}
