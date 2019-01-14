package com.jason.demo.service.user.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jason.demo.base.ResponseData;
import com.jason.demo.entity.user.User;
import com.jason.demo.mapper.user.UserMapper;
import com.jason.demo.request.user.QueryByNameRequest;
import com.jason.demo.request.user.QueryUserAllRequest;
import com.jason.demo.response.PageResponse;
import com.jason.demo.response.user.QueryByNameResponse;
import com.jason.demo.response.user.QueryUserAllResponse;
import com.jason.demo.service.user.UserServiceContract;
import com.jason.demo.utils.ResponseUtil;
import org.springframework.stereotype.Service;

import java.util.HashMap;
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
     * @param queryUserAllRequest 查询数据
     *
     * @return
     */
    @Override
    public ResponseData<PageResponse<QueryUserAllResponse>> queryUserAll(QueryUserAllRequest queryUserAllRequest) {
        Page<User> pageUser = new Page<User>(queryUserAllRequest.getPage(), queryUserAllRequest.getSize());
        HashMap<String, String> map = new HashMap<String, String>();
        IPage<User> data = baseMapper.selectUserPageVo(pageUser, map);

        return ResponseUtil.success(data);
    }

    /**
     * 根据名称查询用户
     *
     * @param queryByNameRequest 查询数据
     *
     * @return
     */
    @Override
    public ResponseData<QueryByNameResponse> queryByName(QueryByNameRequest queryByNameRequest) {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("name", queryByNameRequest.getName());
        List<User> data = this.list(queryWrapper);

        return ResponseUtil.success(data);
    }

    @Override
    public boolean addUser(User user) {
        return false;
    }
}
