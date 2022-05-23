package com.robin.springcloudconfigappmodule.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class Student {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    //Create a Student table
    public void createTable()
    {
        var query="CREATE TABLE student(id SERIAL PRIMARY KEY, name VARCHAR(255) NOT NULL, city VARCHAR(255))";
        int update = this.jdbcTemplate.update(query);
        System.out.println(update);
    }

    //public List<Student> getAllStudents()
    public void getAllStudents()
    {
        System.out.println("Get All Students Called");
/*        var query = "SELECT * FROM student";
        return this.jdbcTemplate.query(query,new BeanPropertyRowMapper(Student.class));
*/
    }
}