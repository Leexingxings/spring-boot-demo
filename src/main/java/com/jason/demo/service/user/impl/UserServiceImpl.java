package com.jason.demo.service.user.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.jason.demo.base.ResponseData;
import com.jason.demo.entity.user.User;
import com.jason.demo.mapper.user.UserMapper;
import com.jason.demo.response.PageResponse;
import com.jason.demo.response.user.QueryUserAllResponse;
import com.jason.demo.service.user.UserServiceContract;
import com.jason.demo.utils.ResponseUtil;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * 用户服务实现类
 *
 * @author jason
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserServiceContract {

    /**
     * 查询所有用户
     *
     * @return ResponseData
     */
    @Override
    public ResponseData<PageResponse<QueryUserAllResponse>> queryUserAll(int pageNum, int size) {
        EntityWrapper<User> entityWrapper = new EntityWrapper<User>();
        Page<User> pageUser = new Page<User>(pageNum, size);
        Page<User> data = this.selectPage(pageUser, entityWrapper);

        return ResponseUtil.success(data);
    }

    @Override
    public boolean addUser(User user) {
        return false;
    }

    @Override
    public User queryByName(String name) {

//        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
//        queryWrapper.eq("name", name);

        return null;

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
