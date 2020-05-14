package com.wenhao.mybatisstudydemo.mapper;

import com.wenhao.mybatisstudydemo.enity.User;

import java.util.List;

public interface UserMapper {

    List<User> findAllUser();

    User findByUserId(Long id);

}
