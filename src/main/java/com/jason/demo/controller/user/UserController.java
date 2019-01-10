package com.jason.demo.controller.user;

import com.jason.demo.base.ResponseData;
import com.jason.demo.constants.BaseConstant;
import com.jason.demo.response.PageResponse;
import com.jason.demo.response.user.QueryUserAllResponse;
import com.jason.demo.service.user.UserServiceContract;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

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

    /**
     * 查询所有用户
     *
     * @return ResponseData
     */
    @ApiOperation(nickname = "queryUserAll",value = "查询所有用户")
    @RequestMapping(method = RequestMethod.GET, value = "/queryUserAll")
    public ResponseData<PageResponse<QueryUserAllResponse>> queryUserAll(
            @RequestParam(value = "page", required = false, defaultValue = BaseConstant.PAGE) int page,
            @RequestParam(value = "size", required = false, defaultValue = BaseConstant.PAGE_SIZE) int size
    ) {
        return userServiceContract.queryUserAll(page, size);
    }

//    @ApiOperation(nickname = "queryByName",value = "根据名称查找用户")
//    @RequestMapping(method = RequestMethod.GET, value = "/queryByName")
////    public ResponseData queryByName(@Valid GetUserListRequest GetUserListRequest, BindingResult result) {
//
//    }
}
