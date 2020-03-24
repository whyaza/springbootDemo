package com.study.yoe.controller;/*
 *   created by why on 2020/3/23
 */

import com.study.yoe.entity.User;
import com.study.yoe.pojo.ResultBean;
import com.study.yoe.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("user")
public class usercontroller {

    private Logger logging = LoggerFactory.getLogger(usercontroller.class);

    @Autowired
    UserService us;

    @GetMapping("lookall")
    public List<User> lookall(){
        return us.getAllUsers();
    }

    @GetMapping("lookById/{id}")
    public User lookById(@PathVariable("id") int id){
        //int a = 1 /0;
        System.out.println("look by id "+ id);
        return us.getUserById(id);
    }

    @PostMapping("add")
    public Integer insertUser(@Valid User user) throws BindException {
        /*if(bindingResult.hasErrors()){
            List<FieldError> fieldErrors =
                    bindingResult.getFieldErrors();
            for (FieldError fieldError : fieldErrors) {
                String message = fieldError.getDefaultMessage();
                String field = fieldError.getField();
                //这样就可以罗列出有问题的字段和错误提示信息
                System.out.println(field+":"+message);
            }
            return -500;
        }*/
        logging.info("添加controller ..");
        return us.add(user);
    }

    @DeleteMapping("delete/{id}")
    public boolean deleteUser(@PathVariable("id")int id){
        return us.delete(id);
    }

    @PutMapping("update")
    public boolean updateUser(User user){
        return us.update(user);
    }
}
