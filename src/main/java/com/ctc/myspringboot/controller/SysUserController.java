package com.ctc.myspringboot.controller;

import com.ctc.myspringboot.model.SysUser;
import com.ctc.myspringboot.service.SysUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author ctc
 */
@RestController
@RequestMapping("/api")
@Api("swaggerDemoController相关的api")
public class SysUserController {

    @Autowired
    private SysUserService sysUserService;

    /**
     * Swagger测试
     * @param id
     * @return
     */
    @ApiOperation(value = "根据id查询用户信息", notes = "查询数据库中某个的用户信息")
    @ApiImplicitParam(name = "id", value = "用户ID", paramType = "path", required = true, dataType = "string")
    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public SysUser userJson(@PathVariable String id) {
        SysUser user = sysUserService.getById(id);
        return user;
    }
}

