package com.jason.demo.service.user;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jason.demo.entity.user.User;

import java.util.List;

/**
 * 用户服务类接口
 *
 * @author jason
 */
public interface UserServiceContract extends IService<User> {

    /**
     * 查看所有用户
     *
     * @return List<User>
     */
    List<User> queryUserAll();

    boolean addUser(User user);

    User queryByName(String name);
}
