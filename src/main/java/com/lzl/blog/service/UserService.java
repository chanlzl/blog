package com.lzl.blog.service;

import com.lzl.blog.entity.UserDetail;

public interface UserService {

    int saveUser(UserDetail userDetail) throws Exception;

    int deleteUser(int userId);

    int updateUser(UserDetail userDetail);

    UserDetail selectUser(int userId);

    UserDetail selectByUserName(String username);

}
