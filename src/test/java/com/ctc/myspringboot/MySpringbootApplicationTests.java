package com.ctc.myspringboot;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ctc.myspringboot.dao.sys.UserDAO;
import com.ctc.myspringboot.model.sys.User;
import com.ctc.myspringboot.service.sys.UserService;
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
    private UserDAO userDAO;

    @Autowired
    private UserService userService;

    /**
     * Dao测试
     */
    @Test
    public void contextLoads() {
        User user = userDAO.selectById("0");
        System.out.println(user);
    }

    /**
     * Wrapper查询测试
     */
    @Test
    public void userServiceWrapperTest() {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.eq("parent_id", "0");
        List<User> list = userService.list(wrapper);
        for (User user : list) {
            System.out.println(user);
        }
    }


}

