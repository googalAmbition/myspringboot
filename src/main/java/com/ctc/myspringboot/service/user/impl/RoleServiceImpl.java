package com.ctc.myspringboot.service.user.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ctc.myspringboot.common.utils.StringUtils;
import com.ctc.myspringboot.dao.user.RoleDao;
import com.ctc.myspringboot.model.user.Role;
import com.ctc.myspringboot.service.user.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author ctc on 2018/12/22
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleDao, Role> implements RoleService {

    @Autowired
    private RoleDao roleDao;

    @Override
    public Set<String> selectRoleKeys(Integer userId) {
        List<Role> perms = roleDao.selectRolesByUserId(userId);
        Set<String> permsSet = new HashSet<>();
        for (Role role : perms) {
            if (StringUtils.isNotNull(role)){
                permsSet.addAll(Arrays.asList(role.getRoleKey().trim().split(",")));
            }
        }
        return permsSet;
    }
}
