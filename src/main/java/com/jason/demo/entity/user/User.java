package com.jason.demo.entity.user;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.io.Serializable;

/**
 * 用户表
 */
@Data
@TableName("users")
public class User extends Model<User> {
    /**
     * 自增ID
     */
    private Long id;

    /**
     * 名称
     */
    private String name;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 邮箱
     */
    private String email;

    @Override
    protected Serializable pkVal() {
        return this.id;
    }
}
