package com.yousufibrahim28.springJDBCJPAHibernatespringJPAapplication.course;

import com.yousufibrahim28.springJDBCJPAHibernatespringJPAapplication.course.Course;
import com.yousufibrahim28.springJDBCJPAHibernatespringJPAapplication.course.jdbc.CourseJdbcRepository;
import com.yousufibrahim28.springJDBCJPAHibernatespringJPAapplication.course.jpa.CourseJpaRepository;
import com.yousufibrahim28.springJDBCJPAHibernatespringJPAapplication.course.springdatajpa.CourseSpringDataJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

// Command line runner is used to execute anything when the application is initialized

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

//    @Autowired
//    private CourseJdbcRepository repository;

//    @Autowired
//    private CourseJpaRepository repository;

    @Autowired
    private CourseSpringDataJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {

        Course course1 = new Course(1, "Learn AWS Spring Data JPA", "Jeff Bezos");
        Course course2 = new Course(2, "Learn Azure Spring Data JPA", "Satya Nadella");
        Course course3 = new Course(3, "Learn GCP Spring Data JPA", "Sundar Pichai");

        repository.save(course1);
        repository.save(course2);
        repository.save(course3);

        repository.deleteById((course3.getId()));

        System.out.println(repository.findById(course1.getId()));
        System.out.println(repository.findById(course2.getId()));

        System.out.println(repository.findAll());
        System.out.println(repository.count());
        System.out.println(repository.findByAuthor("Jeff Bezos"));
        System.out.println(repository.findByAuthor(""));
        System.out.println(repository.findByName("Learn Azure Spring Data JPA"));

    }
}
