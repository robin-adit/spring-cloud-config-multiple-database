package com.robin.springcloudconfigappmodule;

import com.robin.springcloudconfigappmodule.repository.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class SpringCloudConfigAppModule implements CommandLineRunner
 {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConfigAppModule.class, args);
	}

    @Autowired
    private Student student;

     @Override
     public void run(String... args) throws Exception {
        //this.student.createTable();
         this.student.getAllStudents();
     }
 }
