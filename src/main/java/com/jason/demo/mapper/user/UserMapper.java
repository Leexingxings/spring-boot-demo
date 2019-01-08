package com.jason.demo.mapper.user;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jason.demo.entity.user.User;
import javafx.scene.control.Pagination;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 用户表 Mapper 接口
 */
public interface UserMapper extends BaseMapper<User> {

    /**
     * 获取分页记录
     * @param page
     * @param name
     * @return
     */
    @Select("selectUserList")
    List<User> selectUserList(Pagination page, String name);
}
