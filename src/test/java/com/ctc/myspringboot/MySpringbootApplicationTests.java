package com.ctc.myspringboot;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ctc.myspringboot.dao.SysUserDAO;
import com.ctc.myspringboot.model.SysUser;
import com.ctc.myspringboot.service.SysUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MySpringbootApplicationTests {

    @Autowired
    private SysUserDAO sysUserDAO;

    @Autowired
    private SysUserService sysUserService;

    /**
     * Dao测试
     */
    @Test
    public void contextLoads() {
        SysUser sysUser = sysUserDAO.selectById("0");
        System.out.println(sysUser);
    }

    /**
     * Wrapper查询测试
     */
    @Test
    public void userServiceWrapperTest() {
        QueryWrapper<SysUser> wrapper = new QueryWrapper<>();
        wrapper.eq("parent_id", "0");
        List<SysUser> list = sysUserService.list(wrapper);
        for (SysUser user : list) {
            System.out.println(user);
        }
    }

    /**
     * 分页测试
     */
    @Test
    public void userServiceTest() {

        Page<SysUser> page = new Page<>(1, 5);
        page = sysUserService.selectUserPage(page);
        for (SysUser user : page.getRecords()) {
            System.out.println(user);
        }
        System.out.println(page.getTotal());
    }

}

