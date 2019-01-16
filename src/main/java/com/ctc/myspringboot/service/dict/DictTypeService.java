package com.ctc.myspringboot.service.dict;
/**
 * @author ctc
 * @date 2019-01-15 17:06
 */

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.ctc.myspringboot.condition.dict.DictTypeCondition;
import com.ctc.myspringboot.model.dict.DictType;

public interface DictTypeService extends IService<DictType> {

    /**
     * 字典类型-按条件分页查询
     * @param condition
     * @param pag
     * @param limit
     * @return
     */
    IPage listByCondition(DictTypeCondition condition, Integer pag, Integer limit);
}