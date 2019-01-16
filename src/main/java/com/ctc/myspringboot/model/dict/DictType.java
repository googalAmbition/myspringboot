package com.ctc.myspringboot.model.dict;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiParam;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

/**
 * sys_dict_type
 *
 * @author
 */
@ApiModel(value = "字典类型")
@TableName("sys_dict_type")
public class DictType implements Serializable {
    /**
     * 字典类型id
     */
    @ApiParam(hidden = true)
    @ApiModelProperty(value = "字典类型id")
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 类型名称
     */
    @NotNull(message = "类型名称不能为空")
    @ApiModelProperty(value = "类型名称")
    private String name;

    /**
     * 创建日期
     */
    @ApiParam(hidden = true)
    @ApiModelProperty(value = "创建日期")
    private Date createDate;

    /**
     * 创建人
     */
    @NotNull(message = "创建人id不能为空")
    @ApiModelProperty(value = "创建人ID")
    private String createBy;

    @TableField(exist = false)
    private Set<DictData> dataSet;

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        return "DictType{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", createDate=" + createDate +
                ", createBy='" + createBy + '\'' +
                ", dataSet=" + dataSet +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Set<DictData> getDataSet() {
        return dataSet;
    }

    public void setDataSet(Set<DictData> dataSet) {
        this.dataSet = dataSet;
    }
}