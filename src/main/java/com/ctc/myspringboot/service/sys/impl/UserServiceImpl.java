package com.ctc.myspringboot.service.sys.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ctc.myspringboot.dao.sys.UserDAO;
import com.ctc.myspringboot.model.sys.User;
import com.ctc.myspringboot.service.sys.UserService;
import org.springframework.stereotype.Service;

/**
 * @author ctc
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserDAO, User> implements UserService {

    @Override
    public User selectUserByName(String name) {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.eq("login_name", name);
        return baseMapper.selectOne(wrapper);
    }

    @Override
    public User selectUserByPhoneNumber(String name) {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.eq("phonenumber", name);
        return baseMapper.selectOne(wrapper);
    }

    @Override
    public User selectUserByEmail(String name){
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.eq("email", name);
        return baseMapper.selectOne(wrapper);
    }

}

