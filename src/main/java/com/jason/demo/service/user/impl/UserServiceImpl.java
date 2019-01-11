package com.jason.demo.service.user.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.jason.demo.base.ResponseData;
import com.jason.demo.entity.user.User;
import com.jason.demo.mapper.user.UserMapper;
import com.jason.demo.request.user.QueryByNameRequest;
import com.jason.demo.request.user.QueryUserAllRequest;
import com.jason.demo.response.PageResponse;
import com.jason.demo.response.user.QueryUserAllResponse;
import com.jason.demo.service.user.UserServiceContract;
import com.jason.demo.utils.ResponseUtil;
import org.springframework.stereotype.Service;

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
    public ResponseData<PageResponse<QueryUserAllResponse>> queryUserAll(QueryUserAllRequest queryUserAllRequest) {
        EntityWrapper<User> entityWrapper = new EntityWrapper<User>();
        Page<User> pageUser = new Page<User>(queryUserAllRequest.getPage(), queryUserAllRequest.getSize());
        Page<User> data = this.selectPage(pageUser, entityWrapper);

        return ResponseUtil.success(data);
    }

    @Override
    public boolean addUser(User user) {
        return false;
    }

    @Override
    public User queryByName(QueryByNameRequest queryByNameRequest) {

//        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
//        queryWrapper.eq("name", name);

        return null;
    }
}
