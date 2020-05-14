package com.wenhao.mybatisstudydemo.mapper;

import com.wenhao.mybatisstudydemo.enity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {

    List<User> findAllUser();

    User findByUserId(Long id);

    int updateUser(@Param("user") User user);

}
