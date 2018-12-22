package com.ctc.myspringboot.controller.api;

import com.ctc.myspringboot.model.sys.User;
import com.ctc.myspringboot.service.sys.UserService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ctc
 */
@RestController
public class DemoController {

    @Autowired
    private UserService userService;

    @RequestMapping("/test")
    public String index(Model model){
        model.addAttribute("test","hello world");
        return "index";
    }

    /**
     * Swagger测试
     * @param id
     * @return
     */
    @ApiOperation(value = "根据id查询用户信息", notes = "查询数据库中某个的用户信息")
    @ApiImplicitParam(name = "id", value = "用户ID", paramType = "path", required = true, dataType = "string")
    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public User userJson(@PathVariable String id) {
        User user = userService.getById(id);
        return user;
    }
}
