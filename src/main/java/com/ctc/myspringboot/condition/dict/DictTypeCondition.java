package com.ctc.myspringboot.condition.dict;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ctc.myspringboot.model.dict.DictType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang3.StringUtils;

/**
 * @author ctc
 * @date 2019-01-15 17:25
 */
@ApiModel(value = "")
public class DictTypeCondition {

    private QueryWrapper<DictType> wrapper = new QueryWrapper<>();

    @ApiModelProperty(value = "类型名称（模糊查询）")
    private String name;

    public QueryWrapper wrapper(){
        if (StringUtils.isNotBlank(name)){
            wrapper.like("name", name);
        }
        return wrapper;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

