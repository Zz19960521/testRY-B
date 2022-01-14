package com.ruoyi.inventory.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 出入库管理对象 mes_voucher
 * 
 * @author zhangz
 * @date 2021-12-30
 */
public class MesVoucher extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long voucherId;

    /** 单据名称 */
    @Excel(name = "单据名称")
    private String voucherName;

    /** 单据类型 1：出库 2：入库 */
    @Excel(name = "单据类型 1：出库 2：入库")
    private Long voucherType;

    public void setVoucherId(Long voucherId) 
    {
        this.voucherId = voucherId;
    }

    public Long getVoucherId() 
    {
        return voucherId;
    }
    public void setVoucherName(String voucherName) 
    {
        this.voucherName = voucherName;
    }

    public String getVoucherName() 
    {
        return voucherName;
    }
    public void setVoucherType(Long voucherType) 
    {
        this.voucherType = voucherType;
    }

    public Long getVoucherType() 
    {
        return voucherType;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("voucherId", getVoucherId())
            .append("voucherName", getVoucherName())
            .append("voucherType", getVoucherType())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
