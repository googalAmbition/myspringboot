package com.ctc.myspringboot.service.dict.impl;
/**
 * @author ctc
 * @date 2019-01-15 17:07
 */

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ctc.myspringboot.condition.dict.DictTypeCondition;
import com.ctc.myspringboot.dao.dict.DictTypeMapper;
import com.ctc.myspringboot.model.dict.DictType;
import com.ctc.myspringboot.service.dict.DictTypeService;
import org.springframework.stereotype.Service;

@Service
public class DictTypeServiceImpl extends ServiceImpl<DictTypeMapper, DictType> implements DictTypeService {


    @Override
    public IPage listByCondition(DictTypeCondition condition, Integer pag, Integer limit) {
        Page page = new Page(pag, limit);
        return baseMapper.selectMapsPage(page, condition.wrapper());
    }
}