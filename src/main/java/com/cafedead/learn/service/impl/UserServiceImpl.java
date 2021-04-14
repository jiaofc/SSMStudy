package com.cafedead.learn.service.impl;

import com.cafedead.learn.dao.entity.User;
import com.cafedead.learn.dao.mapper.IUserDaoMapper;
import com.cafedead.learn.service.IUserService;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * Created by jiaofucheng
 * 2021 -04 -13 -上午12:06
 */
@Service
public class UserServiceImpl implements IUserService {
    @Resource
    private IUserDaoMapper userDao;

    @Override
    public User selectUser(long userId){
        return this.userDao.selectUser(userId);
    }
}
