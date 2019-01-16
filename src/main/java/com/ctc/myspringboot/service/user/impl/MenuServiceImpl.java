package com.ctc.myspringboot.service.user.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ctc.myspringboot.common.utils.StringUtils;
import com.ctc.myspringboot.dao.user.MenuDao;
import com.ctc.myspringboot.model.user.Menu;
import com.ctc.myspringboot.service.user.MenuService;
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
public class MenuServiceImpl extends ServiceImpl<MenuDao, Menu> implements MenuService {

    @Autowired
    private MenuDao menuDao;

    @Override
    public Set<String> selectPermsByUserId(Integer userId) {
        List<String> perms = menuDao.selectPermsByUserId(userId);
        Set<String> permSet = new HashSet<>();
        for (String per : perms) {
            if (StringUtils.isNotEmpty(perms)) {
                permSet.addAll(Arrays.asList(per.trim().split(",")));
            }
        }

        return permSet;
    }

}
