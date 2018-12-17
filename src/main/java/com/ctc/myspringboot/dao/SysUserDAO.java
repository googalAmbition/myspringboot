package com.ctc.myspringboot.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ctc.myspringboot.model.SysUser;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * SysUserDAO继承基类
 */
@Repository
public interface SysUserDAO extends BaseMapper<SysUser> {

    @Select("SELECT * FROM sys_user")
    IPage<SysUser> selectPageVo(Page page, @Param("state") Integer state);

    @Select("select * from sys_user")
    List<SysUser> selectUserList(Page page);

    @Select("select * from sys_user")
    List<SysUser> getAll();

    SysUser selectByPrimaryKey(String id);

}