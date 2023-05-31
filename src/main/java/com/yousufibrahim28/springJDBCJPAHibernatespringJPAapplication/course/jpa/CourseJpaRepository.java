package com.yousufibrahim28.springJDBCJPAHibernatespringJPAapplication.course.jpa;

import com.yousufibrahim28.springJDBCJPAHibernatespringJPAapplication.course.Course;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
@Transactional // This is required for JPA since ORM is in action
public class CourseJpaRepository {
    @PersistenceContext
    // @Autowired we can use a specific annotation like above
    private EntityManager entityManager;

    public void insert(Course course) {
        entityManager.merge(course);
    }

    public Course findById(Course course) {
        return entityManager.find(Course.class, course.getId());
    }

    public void deleteById(Course course) {
        Course course1 = entityManager.find(Course.class, course.getId());
        entityManager.remove(course1);
    }

}
