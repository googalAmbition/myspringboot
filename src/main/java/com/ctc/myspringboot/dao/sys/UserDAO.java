package com.ctc.myspringboot.dao.sys;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ctc.myspringboot.model.sys.Menu;
import com.ctc.myspringboot.model.sys.User;
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