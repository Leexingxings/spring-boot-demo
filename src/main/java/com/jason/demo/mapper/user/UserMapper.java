package com.jason.demo.mapper.user;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.jason.demo.entity.user.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.HashMap;
import java.util.List;

/**
 * 用户表 Mapper 接口
 *
 * @author jason
 */
public interface UserMapper extends BaseMapper<User> {

    /**
     * 获取所有记录
     *
     * @param name
     * @return
     */
    List<User> selectUserList(String name);

    /**
     * 分页获取记录
     *
     * @param page 分页
     * @param map hashmap
     * @return IPage<User>
     */
    IPage<User> selectUserPageVo(Page page, HashMap<String, String> map);
}
