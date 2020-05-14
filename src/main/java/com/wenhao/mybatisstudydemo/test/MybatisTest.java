package com.wenhao.mybatisstudydemo.test;

import com.wenhao.mybatisstudydemo.enity.User;
import com.wenhao.mybatisstudydemo.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

public class MybatisTest {

    public static void main(String[] args) throws IOException {
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        String resource = "mybatis-config.xml";
        Reader reader = Resources.getResourceAsReader(resource);
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(reader);
        SqlSession sqlSession = build.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        //List<User> allUser = mapper.findAllUser();
        User byUserId = mapper.findByUserId(26L);
        User user = new User();
        user.setId(26L);
        user.setUsername("test");
        user.setPassword("test");
        mapper.updateUser(user);
        User byUserId1 = mapper.findByUserId(26L);
        //System.out.println(allUser);
        System.out.println("======");
        System.out.println(byUserId);
        System.out.println(byUserId1);
    }
}
