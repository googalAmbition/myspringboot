package com.ctc.myspringboot.service.sys;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ctc.myspringboot.model.sys.Menu;

import java.util.Set;

/**
 * @author ctc on 2018/12/22
 */
public interface MenuService extends IService<Menu> {
    Set<String> selectPermsByUserId(Integer userId);
}
