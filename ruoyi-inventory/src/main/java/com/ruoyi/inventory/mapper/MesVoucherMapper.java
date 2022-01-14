package com.ruoyi.inventory.mapper;

import java.util.List;
import com.ruoyi.inventory.domain.MesVoucher;

/**
 * 出入库管理Mapper接口
 * 
 * @author zhangz
 * @date 2021-12-30
 */
public interface MesVoucherMapper 
{
    /**
     * 查询出入库管理
     * 
     * @param voucherId 出入库管理主键
     * @return 出入库管理
     */
    public MesVoucher selectMesVoucherByVoucherId(Long voucherId);

    /**
     * 查询出入库管理列表
     * 
     * @param mesVoucher 出入库管理
     * @return 出入库管理集合
     */
    public List<MesVoucher> selectMesVoucherList(MesVoucher mesVoucher);

    /**
     * 新增出入库管理
     * 
     * @param mesVoucher 出入库管理
     * @return 结果
     */
    public int insertMesVoucher(MesVoucher mesVoucher);

    /**
     * 修改出入库管理
     * 
     * @param mesVoucher 出入库管理
     * @return 结果
     */
    public int updateMesVoucher(MesVoucher mesVoucher);

    /**
     * 删除出入库管理
     * 
     * @param voucherId 出入库管理主键
     * @return 结果
     */
    public int deleteMesVoucherByVoucherId(Long voucherId);

    /**
     * 批量删除出入库管理
     * 
     * @param voucherIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteMesVoucherByVoucherIds(Long[] voucherIds);
}
