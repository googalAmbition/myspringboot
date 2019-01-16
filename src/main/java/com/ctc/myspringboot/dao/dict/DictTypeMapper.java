package com.ctc.myspringboot.dao.dict;
/**
 * @author ctc
 * @date 2019-01-15 17:03
 */

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ctc.myspringboot.model.dict.DictType;
import org.springframework.stereotype.Repository;

@Repository
public interface DictTypeMapper extends BaseMapper<DictType> {

    DictType selectById(Integer id);
}