package com.jason.demo.service.user.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jason.demo.entity.user.User;
import com.jason.demo.mapper.user.UserMapper;
import com.jason.demo.service.user.UserServiceContract;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 用户服务实现类
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserServiceContract {

    @Override
    public List<User> queryUserAll() {
        System.out.println("hello");
        List<User> list=new ArrayList<>();
        return  list;
//        return this.list(null);
    }

    @Override
    public boolean addUser(User user) {
        return false;
    }

    @Override
    public User queryByName(String name) {

        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("name", name);

        User user = new User();

        return user;

//        List<User> userList = lsit(queryWrapper);
//
//        if (userList == null || userList.size() == 0) {
//            return null;
//        }
//
//        if (userList.size() > 1) {
//            log.error("queryCityByName结果有多个，name={}", name);
//        }
//
//        return userList.get(0);
    }
}
