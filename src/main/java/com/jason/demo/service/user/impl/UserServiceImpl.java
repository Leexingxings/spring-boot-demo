package com.jason.demo.service.user.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
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

import java.util.HashMap;
import java.util.Map;

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
        Page<User> pageUser = new Page<User>(queryUserAllRequest.getPage(), queryUserAllRequest.getSize());
        HashMap<String, String> map = new HashMap<String, String>();
        IPage<User> data = baseMapper.selectUserPageVo(pageUser, map);

        return ResponseUtil.success(data);
    }

    @Override
    public ResponseData queryByName(QueryByNameRequest queryByNameRequest) {
//        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
//        queryWrapper.eq("name", name);

        return null;
    }

    @Override
    public boolean addUser(User user) {
        return false;
    }
}
