package com.jason.demo.mapper.user;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jason.demo.entity.user.User;
import java.util.List;

/**
 * 用户表 Mapper 接口
 *
 * @author jason
 */
public interface UserMapper extends BaseMapper<User> {

    /**
     * 获取分页记录
     * @param name
     * @return
     */
   List<User> selectUserList(String name);
}
