package com.cafedead.learn.service;

import com.cafedead.learn.dao.entity.User;

/**
 * Created by jiaofucheng
 * 2021 -04 -13 -上午12:06
 */
public interface IUserService {
    public User selectUser(long userId);
}
