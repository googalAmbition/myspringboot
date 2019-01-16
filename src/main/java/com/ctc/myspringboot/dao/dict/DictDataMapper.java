package com.ctc.myspringboot.dao.dict;
/**
 * @author ctc
 * @date 2019-01-15 17:02
 */

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ctc.myspringboot.model.dict.DictData;
import org.springframework.stereotype.Repository;

@Repository
public interface DictDataMapper extends BaseMapper<DictData> {
}