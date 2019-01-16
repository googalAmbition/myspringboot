package com.ctc.myspringboot.service.user.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ctc.myspringboot.common.utils.TreeUtils;
import com.ctc.myspringboot.dao.user.UserDAO;
import com.ctc.myspringboot.model.user.Menu;
import com.ctc.myspringboot.model.user.User;
import com.ctc.myspringboot.service.user.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

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

    @Override
    public List<Menu> selectMenuByUserId(Integer userId) {
        List<Menu> menus = baseMapper.selectMenusByUserId(userId);
        return TreeUtils.getChildPerms(menus, 0);
    }

}

