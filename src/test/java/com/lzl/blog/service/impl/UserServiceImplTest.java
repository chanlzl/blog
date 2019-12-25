package com.lzl.blog.service.impl;

import com.lzl.blog.entity.UserDetail;
import com.lzl.blog.util.MD5Util;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.SimpleDateFormat;

@RunWith(SpringRunner.class)
@SpringBootTest
class UserServiceImplTest {

    @Autowired
    private UserServiceImpl userService;

    @Test
    void saveUser() {
        long l = System.currentTimeMillis();
        //UserDetail userDetail = new UserDetail(2,"admins","ss",MD5Util.encypt("123456"),222222,"","","",l);
        //int count = userService.saveUser(userDetail);
        //System.out.println(count);
    }

    @Test
    void deleteUser() {
        int i = userService.deleteUser(2);
        System.out.println(i);
    }

    @Test
    void updateUser() {

    }

    @Test
    void selectUser() {
        UserDetail userDetail = userService.selectUser(1);
        System.out.println(userDetail.toString());
        boolean valid = MD5Util.valid("123456", userDetail.getPassword());
        System.out.println(valid);
        System.out.println("------------------");

    }
}