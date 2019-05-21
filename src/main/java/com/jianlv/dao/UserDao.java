package com.jianlv.dao;

import com.jianlv.domain.User;

/**
 * @author 杜奕明
 * @date 2019/5/21 19:48
 */
public interface UserDao {

    /**
     * 根据用户的openid查找用户的所有信息
     *
     * @param openid openid
     * @return 查到的用户
     */
    User getUserByOpenid(String openid);
}
