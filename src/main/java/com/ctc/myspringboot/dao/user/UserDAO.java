package com.ctc.myspringboot.dao.user;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ctc.myspringboot.model.user.Menu;
import com.ctc.myspringboot.model.user.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * SysUserDAO继承基类
 * @author ctc
 */
@Repository
public interface UserDAO extends BaseMapper<User> {


    List<Menu> selectMenusByUserId(Integer userId);
}