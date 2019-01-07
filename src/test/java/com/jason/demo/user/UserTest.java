package com.jason.demo.user;

import com.jason.demo.entity.user.User;
import com.jason.demo.mapper.user.UserMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTest {

    @Resource
    private UserMapper userMapper;

    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ----"));
//        List<User> userList = userMapper.selectList(null);


        Map<String, Object> map = new HashMap<>();
        map.put("name", "Adriel West");
        map.put("age", 0);

        List<User> userList = userMapper.selectByMap(map);
        System.out.println(userList);

//        Assert.assertEquals(5, userList.size());
//        userList.forEach(System.out::println);
    }

}

