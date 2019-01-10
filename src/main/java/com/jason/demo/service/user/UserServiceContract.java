package com.jason.demo.service.user;

import com.baomidou.mybatisplus.service.IService;
import com.jason.demo.base.ResponseData;
import com.jason.demo.constants.BaseConstant;
import com.jason.demo.entity.user.User;
import com.jason.demo.response.PageResponse;
import com.jason.demo.response.user.QueryUserAllResponse;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 用户服务类接口
 *
 * @author jason
 */
public interface UserServiceContract extends IService<User> {

    /**
     * 查看所有用户
     *
     * @return ResponseData
     */
    ResponseData<PageResponse<QueryUserAllResponse>> queryUserAll(
            @RequestParam(value = "page", required = false, defaultValue = BaseConstant.PAGE) int page,
            @RequestParam(value = "size", required = false, defaultValue = BaseConstant.PAGE_SIZE) int size
    );

    boolean addUser(User user);

    User queryByName(String name);
}
