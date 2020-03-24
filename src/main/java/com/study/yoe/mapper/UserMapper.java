package com.study.yoe.mapper;/*
 *   created by why on 2020/3/23
 */

import com.study.yoe.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

    boolean delete(Integer id);
    boolean update(User user);

    Integer add(User user);
    List<User> find();
    User findById(int id);
}
