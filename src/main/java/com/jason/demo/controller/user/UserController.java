package com.jason.demo.controller.user;

import com.jason.demo.base.ResponseData;
import com.jason.demo.constants.ResponseCode;
import com.jason.demo.controller.BaseController;
import com.jason.demo.request.user.AddUserRequest;
import com.jason.demo.request.user.QueryByNameRequest;
import com.jason.demo.request.user.QueryUserAllRequest;
import com.jason.demo.response.PageResponse;
import com.jason.demo.response.user.QueryByNameResponse;
import com.jason.demo.response.user.QueryUserAllResponse;
import com.jason.demo.service.user.UserServiceContract;
import io.swagger.annotations.*;
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
public class UserController extends BaseController {

    @Autowired
    private UserServiceContract userServiceContract;

    /**
     * 查询所有用户
     *
     * @return ResponseData
     */
    @ApiOperation(nickname = "queryUserAll", value = "查询所有用户")
    @RequestMapping(method = RequestMethod.GET, value = "/queryUserAll")
    public ResponseData<PageResponse<QueryUserAllResponse>> queryUserAll(@Valid QueryUserAllRequest queryUserAllRequest, BindingResult result) {
        if (result.hasErrors()) {
            return this.getErrorResponse(result);
        }

        return userServiceContract.queryUserAll(queryUserAllRequest);
    }

    /**
     * 根据名称查找用户
     *
     * @return ResponseData
     */
    @ApiOperation(nickname = "queryByName", value = "根据名称查找用户")
    @RequestMapping(method = RequestMethod.GET, value = "/queryByName")
    public ResponseData<QueryByNameResponse> queryByName(@Valid QueryByNameRequest queryByNameRequest, BindingResult result) {
        if (result.hasErrors()) {
            return this.getErrorResponse(result);
        }

        return userServiceContract.queryByName(queryByNameRequest);
    }

    /**
     * 添加用户
     *
     * @param addUserRequest
     * @param result
     * @return
     */
    @ApiOperation(nickname = "addUser", value = "添加用户")
    @RequestMapping(method = RequestMethod.POST, value = "/addUser")
    public ResponseData addUser(@RequestBody @Valid AddUserRequest addUserRequest, BindingResult result) {
        if (result.hasErrors()) {
            return this.getErrorResponse(result);
        }

        try {
            return userServiceContract.addUser(addUserRequest);

        } catch (Exception e) {
            e.printStackTrace();
            return ResponseData.build(
                    ResponseCode.CREATE_FAILURE.getValue(),
                    ResponseCode.CREATE_FAILURE.getMessage()
            );
        }
    }
}
