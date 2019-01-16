package com.ctc.myspringboot.dao.user;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ctc.myspringboot.model.user.Menu;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author ctc on 2018/12/22
 */
@Repository
public interface MenuDao extends BaseMapper<Menu> {

    List<String> selectPermsByUserId(Integer userId);
}
