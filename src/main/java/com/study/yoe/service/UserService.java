package com.study.yoe.service;/*
 *   created by why on 2020/3/23
 */

import com.study.yoe.entity.User;
import com.study.yoe.mapper.UserMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserMapper um;
    private Logger logger = LoggerFactory.getLogger(UserService.class);

    public User getUserById(int id){
        return um.findById(id);
    }

    public List<User> getAllUsers(){
        logger.info("fing fuck you!!!");
        return um.find();
    }

    public Integer add(User user){
        return um.add(user);
    }

    public boolean delete(Integer userId){
        return um.delete(userId);
    }

    public boolean update(User user){
        return um.update(user);
    }
}
