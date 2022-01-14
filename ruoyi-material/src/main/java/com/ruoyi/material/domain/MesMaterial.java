package com.ruoyi.material.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 基础物料对象 mes_material
 * 
 * @author zhangz
 * @date 2021-12-29
 */
public class MesMaterial extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 物料id */
    private Long materialId;

    /** 物料名称 */
    @Excel(name = "物料名称")
    private String materialName;

    /** 单位 */
    @Excel(name = "单位")
    private String materialUnit;

    /** 规格 */
    @Excel(name = "规格")
    private String materialSpecifications;

    /** 备注 */
    @Excel(name = "备注")
    private String materialRemark;

    public void setMaterialId(Long materialId) 
    {
        this.materialId = materialId;
    }

    public Long getMaterialId() 
    {
        return materialId;
    }
    public void setMaterialName(String materialName) 
    {
        this.materialName = materialName;
    }

    public String getMaterialName() 
    {
        return materialName;
    }
    public void setMaterialUnit(String materialUnit) 
    {
        this.materialUnit = materialUnit;
    }

    public String getMaterialUnit() 
    {
        return materialUnit;
    }
    public void setMaterialSpecifications(String materialSpecifications) 
    {
        this.materialSpecifications = materialSpecifications;
    }

    public String getMaterialSpecifications() 
    {
        return materialSpecifications;
    }
    public void setMaterialRemark(String materialRemark) 
    {
        this.materialRemark = materialRemark;
    }

    public String getMaterialRemark() 
    {
        return materialRemark;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("materialId", getMaterialId())
            .append("materialName", getMaterialName())
            .append("materialUnit", getMaterialUnit())
            .append("materialSpecifications", getMaterialSpecifications())
            .append("materialRemark", getMaterialRemark())
            .toString();
    }
}
