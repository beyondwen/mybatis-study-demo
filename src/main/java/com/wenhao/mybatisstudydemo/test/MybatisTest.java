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
        //System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        String resource = "mybatis-config.xml";
        Reader reader = Resources.getResourceAsReader(resource);
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(reader);
        SqlSession sqlSession1 = build.openSession();
        UserMapper mapper = sqlSession1.getMapper(UserMapper.class);
        //List<User> allUser = mapper.findAllUser();
        User byUserId = mapper.findByUserId(1L);
        sqlSession1.close();
       /* User user = new User();
        user.setId(26L);
        user.setUsername("test");
        user.setPassword("test");
        mapper.updateUser(user);*/
        SqlSession sqlSession2 = build.openSession();
        UserMapper mapper1 = sqlSession2.getMapper(UserMapper.class);
        User byUserId1 = mapper1.findByUserId(1L);
        //System.out.println(allUser);
        System.out.println("======");
        System.out.println(byUserId);
        System.out.println(byUserId1);
    }
}
