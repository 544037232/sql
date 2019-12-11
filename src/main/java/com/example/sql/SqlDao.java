package com.example.sql;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

/**
 * @author pricess.wang
 * @date 2019/12/11 17:01
 */
public interface SqlDao {

    @Insert("insert into user values(#{user.id},#{user.name},#{user.time})")
    void insert(@Param("user") User user);

    @Update("UPDATE user SET name=#{user.name}, time=#{user.time} WHERE id=#{user.id} ")
    void update(@Param("user") User user);
}
