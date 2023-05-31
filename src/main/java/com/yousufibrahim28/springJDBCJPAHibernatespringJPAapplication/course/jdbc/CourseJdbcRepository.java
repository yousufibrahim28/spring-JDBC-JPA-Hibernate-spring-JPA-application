package com.yousufibrahim28.springJDBCJPAHibernatespringJPAapplication.course.jdbc;

import com.yousufibrahim28.springJDBCJPAHibernatespringJPAapplication.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepository {

    @Autowired
    private JdbcTemplate springJdbcTemplate;

    private static String INSERT_QUERY =
            """
                        insert into course (id, name, author)
                         values(?,?,?);    
            """;

    private static String DELETE_QUERY =
            """
                Delete from course where id=?; 
            """;

    private static String SELECT_QUERY =
            """
                select * from course where id=?; 
            """;

    public void insert(Course course) {
        springJdbcTemplate.update(INSERT_QUERY,course.getId(),course.getName(),course.getAuthor());
    }

    public void deleteById(Course course) {
        springJdbcTemplate.update(DELETE_QUERY,course.getId());
    }

    public Course findById(Course course) {
        // Result -> Bean => Row Mapper =>
        return springJdbcTemplate.queryForObject(SELECT_QUERY, new BeanPropertyRowMapper<>(Course.class), course.getId());
    }
}
