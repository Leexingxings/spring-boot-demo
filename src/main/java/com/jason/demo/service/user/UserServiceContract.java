package com.jason.demo.service.user;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jason.demo.base.ResponseData;
import com.jason.demo.entity.user.User;
import com.jason.demo.request.user.QueryByNameRequest;
import com.jason.demo.request.user.QueryUserAllRequest;
import com.jason.demo.response.PageResponse;
import com.jason.demo.response.user.QueryUserAllResponse;

/**
 * 用户服务类接口
 *
 * @author jason
 */
public interface UserServiceContract extends IService<User> {

    /**
     * 查看所有用户
     *
     * @param queryUserAllRequest 查询数据
     *
     * @return ResponseData
     */
    ResponseData<PageResponse<QueryUserAllResponse>> queryUserAll(QueryUserAllRequest queryUserAllRequest);

    /**
     * 根据名称获取记录
     *
     * @param queryByNameRequest 查询数据
     *
     * @return ResponseData
     */
    ResponseData queryByName(QueryByNameRequest queryByNameRequest);

    boolean addUser(User user);
}
