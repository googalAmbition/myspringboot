package com.ctc.myspringboot.dao.sys;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ctc.myspringboot.model.sys.Role;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author ctc on 2018/12/22
 */
@Repository
public interface RoleDao extends BaseMapper<Role> {

    List<Role> selectRolesByUserId(@Param("userId") Integer userId);

}
