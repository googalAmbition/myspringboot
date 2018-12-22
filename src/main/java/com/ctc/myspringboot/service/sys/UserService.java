package com.ctc.myspringboot.service.sys;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ctc.myspringboot.model.sys.User;

/**
 * @author ctc
 */
public interface UserService extends IService<User> {
    User selectUserByName(String name);

    User selectUserByPhoneNumber(String name);

    User selectUserByEmail(String name);
}
