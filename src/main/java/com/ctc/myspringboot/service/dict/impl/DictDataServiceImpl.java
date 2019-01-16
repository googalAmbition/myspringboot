package com.ctc.myspringboot.service.dict.impl;
/**
 * @author ctc
 * @date 2019-01-15 17:08
 */

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ctc.myspringboot.dao.dict.DictDataMapper;
import com.ctc.myspringboot.model.dict.DictData;
import com.ctc.myspringboot.service.dict.DictDataService;
import org.springframework.stereotype.Service;

@Service
public class DictDataServiceImpl extends ServiceImpl<DictDataMapper, DictData> implements DictDataService {
}