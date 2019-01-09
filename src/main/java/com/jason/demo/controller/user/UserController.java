package com.jason.demo.controller.user;

import com.jason.demo.entity.user.User;
import com.jason.demo.service.user.UserServiceContract;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 用户控制器
 *
 * @author jason
 */
@RequestMapping(value = "/api/user", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
@Api(tags = "用户管理")
@RestController
public class UserController {

    @Autowired
    private UserServiceContract userServiceContract;

    @RequestMapping(method = RequestMethod.GET, value = "/queryUserAll")
    public List<User> queryUserAll() {
        return userServiceContract.queryUserAll();
    }
}
