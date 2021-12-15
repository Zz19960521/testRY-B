package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 职级对象 sys_level
 * 
 * @author ruoyi
 * @date 2021-12-14
 */
public class SysLevel extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 职级id */
    private Long levelId;

    /** 职级编码 */
    @Excel(name = "职级编码")
    private Long levelCode;

    /** 职级名称 */
    @Excel(name = "职级名称")
    private String levelName;

    /** 职级排序 */
    @Excel(name = "职级排序")
    private Long levelSort;

    public void setLevelId(Long levelId) 
    {
        this.levelId = levelId;
    }

    public Long getLevelId() 
    {
        return levelId;
    }
    public void setLevelCode(Long levelCode) 
    {
        this.levelCode = levelCode;
    }

    public Long getLevelCode() 
    {
        return levelCode;
    }
    public void setLevelName(String levelName) 
    {
        this.levelName = levelName;
    }

    public String getLevelName() 
    {
        return levelName;
    }
    public void setLevelSort(Long levelSort) 
    {
        this.levelSort = levelSort;
    }

    public Long getLevelSort() 
    {
        return levelSort;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("levelId", getLevelId())
            .append("levelCode", getLevelCode())
            .append("levelName", getLevelName())
            .append("levelSort", getLevelSort())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
