package com.students.studentcrm;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.students.studentcrm.mapper")
@SpringBootApplication
public class StudentCrmApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentCrmApplication.class, args);
    }

}
