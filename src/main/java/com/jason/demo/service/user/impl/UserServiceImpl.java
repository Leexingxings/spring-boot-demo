package com.jason.demo.service.user.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jason.demo.base.ResponseData;
import com.jason.demo.entity.user.User;
import com.jason.demo.mapper.user.UserMapper;
import com.jason.demo.request.user.AddUserRequest;
import com.jason.demo.request.user.QueryByNameRequest;
import com.jason.demo.request.user.QueryUserAllRequest;
import com.jason.demo.response.PageResponse;
import com.jason.demo.response.user.QueryByNameResponse;
import com.jason.demo.response.user.QueryUserAllResponse;
import com.jason.demo.service.user.UserServiceContract;
import com.jason.demo.utils.ResponseUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
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

    private static Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    /**
     * 查询所有用户
     *
     * @param queryUserAllRequest 查询数据
     * @return ResponseData<PageResponse   <   QueryUserAllResponse>>
     */
    @Override
    public ResponseData<PageResponse<QueryUserAllResponse>> queryUserAll(QueryUserAllRequest queryUserAllRequest) {
        logger.info("开始进行数据库查询操作...");
        Page<User> pageUser = new Page<User>(queryUserAllRequest.getPage(), queryUserAllRequest.getSize());
        HashMap<String, String> map = new HashMap<String, String>();
        IPage<User> data = baseMapper.selectUserPageVo(pageUser, map);

        return ResponseUtil.success(data);
    }

    /**
     * 根据名称查询用户
     *
     * @param queryByNameRequest 查询数据
     * @return ResponseData<QueryByNameResponse>
     */
    @Override
    public ResponseData<QueryByNameResponse> queryByName(QueryByNameRequest queryByNameRequest) {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("name", queryByNameRequest.getName());
        List<User> data = this.list(queryWrapper);

        return ResponseUtil.success(data);
    }

    /**
     * 添加用户
     *
     * @param addUserRequest 添加用户数据
     * @return ResponseData
     */
    @Override
    public ResponseData addUser(AddUserRequest addUserRequest) {

        User user = new User();
        BeanUtils.copyProperties(addUserRequest, user);
        // 检测用户名是否重复
        QueryWrapper<User> queryByName = new QueryWrapper<>();
        queryByName.eq("name", user.getName());

        User nameRes = this.getOne(queryByName);
        if (nameRes != null) {
            return ResponseUtil.fail("已存在相同名称");
        }
        this.save(user);

        return ResponseUtil.success();
    }
}
