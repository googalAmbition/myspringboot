package com.ctc.myspringboot.model.dict;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * sys_dict_data
 * @author 
 */
@TableName("sys_dict_data")
public class DictData implements Serializable {
    /**
     * 字典数据id
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 类型id
     */
    private Integer typeId;

    /**
     * 名称
     */
    private String name;

    /**
     * 创建日期
     */
    private Date createDate;

    /**
     * 创建人
     */
    private String createBy;

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        return "DictData{" +
                "id=" + id +
                ", typeId=" + typeId +
                ", name='" + name + '\'' +
                ", createDate=" + createDate +
                ", createBy='" + createBy + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
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
}