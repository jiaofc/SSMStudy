package com.cafedead.learn.dao.mapper;

import com.cafedead.learn.dao.entity.User;

/**
 * Created by jiaofucheng
 * 2021 -04 -13 -上午12:05
 */
public interface IUserDaoMapper {
    User selectUser(long id);
}
