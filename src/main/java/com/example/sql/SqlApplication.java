package com.example.sql;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.Resource;
import java.time.LocalDateTime;

@SpringBootApplication
@MapperScan("com.example.sql")
public class SqlApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SqlApplication.class, args);
    }

    @Resource
    private SqlDao sqlDao;

    @Override
    public void run(String... args) throws Exception {
        User user = new User();
        user.setId(1L);
        user.setName("zhangsan");
        user.setTime(LocalDateTime.now());

        sqlDao.update(user);
    }
}
