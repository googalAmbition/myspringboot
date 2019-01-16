package com.ctc.myspringboot.service.user;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ctc.myspringboot.model.user.Role;

import java.util.Set;

/**
 * @author ctc on 2018/12/22
 */
public interface RoleService extends IService<Role> {

     Set<String> selectRoleKeys(Integer userId);
}
