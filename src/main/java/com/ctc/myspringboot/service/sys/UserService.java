package com.ctc.myspringboot.service.sys;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ctc.myspringboot.model.sys.Menu;
import com.ctc.myspringboot.model.sys.User;

import java.util.List;

/**
 * @author ctc
 */
public interface UserService extends IService<User> {
    User selectUserByName(String name);

    User selectUserByPhoneNumber(String name);

    User selectUserByEmail(String name);

    List<Menu> selectMenuByUserId(Integer userId);
}
