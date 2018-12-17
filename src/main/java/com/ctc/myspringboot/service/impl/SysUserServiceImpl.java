package com.ctc.myspringboot.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ctc.myspringboot.dao.SysUserDAO;
import com.ctc.myspringboot.model.SysUser;
import com.ctc.myspringboot.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ctc
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserDAO, SysUser> implements SysUserService {

    @Autowired
    private SysUserDAO sysUserDAO;

    @Override
    public IPage<SysUser> selectUserPage(Page<SysUser> page, Integer state) {
        // 不进行 count sql 优化，解决 MP 无法自动优化 SQL 问题，这时候你需要自己查询 count 部分
        // page.setOptimizeCountSql(false);
        // 当 total 为非 0 时(默认为 0),分页插件不会进行 count 查询
        // 要点!! 分页返回的对象与传入的对象是同一个
//        Page<SysUser> p = sysUserDAO.selectPageVo(page,state);
        return sysUserDAO.selectPageVo(page, state);
    }

    @Override
    public List<SysUser> listAll() {
        return sysUserDAO.getAll();
    }

    @Override
    public Page<SysUser> selectUserPage(Page<SysUser> page) {
        page.setRecords(sysUserDAO.selectUserList(page));
        return page;
    }
}

