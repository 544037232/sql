package com.example.sql;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author pricess.wang
 * @date 2019/12/11 17:04
 */
@Data
public class User implements Serializable {

    private Long id;

    private String name;

    private LocalDateTime time;

}
