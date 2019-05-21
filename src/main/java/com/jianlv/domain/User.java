package com.jianlv.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 存储用户
 *
 * @author 杜奕明
 * @date 2019/5/21 19:44
 */
@Data
public class User implements Serializable {

    private String openid;

    /**
     * 用户的计划表
     */
    private List<Schedule> schedules;

    /**
     * 用户好友
     */
    private List<User> friends;
}
