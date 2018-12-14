package com.ctc.myspringboot.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.ctc.myspringboot.model.SysUser;

import java.util.List;

/**
 * @author ctc
 */
public interface SysUserService extends IService<SysUser> {
    IPage<SysUser> selectUserPage(Page<SysUser> page, Integer state);


    List<SysUser> listAll();

    Page<SysUser> selectUserPage(Page<SysUser> page);
}
