package com.ruoyi.inventory.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.inventory.mapper.MesVoucherMapper;
import com.ruoyi.inventory.domain.MesVoucher;
import com.ruoyi.inventory.service.IMesVoucherService;

/**
 * 出入库管理Service业务层处理
 * 
 * @author zhangz
 * @date 2021-12-30
 */
@Service
public class MesVoucherServiceImpl implements IMesVoucherService 
{
    @Autowired
    private MesVoucherMapper mesVoucherMapper;

    /**
     * 查询出入库管理
     * 
     * @param voucherId 出入库管理主键
     * @return 出入库管理
     */
    @Override
    public MesVoucher selectMesVoucherByVoucherId(Long voucherId)
    {
        return mesVoucherMapper.selectMesVoucherByVoucherId(voucherId);
    }

    /**
     * 查询出入库管理列表
     * 
     * @param mesVoucher 出入库管理
     * @return 出入库管理
     */
    @Override
    public List<MesVoucher> selectMesVoucherList(MesVoucher mesVoucher)
    {
        return mesVoucherMapper.selectMesVoucherList(mesVoucher);
    }

    /**
     * 新增出入库管理
     * 
     * @param mesVoucher 出入库管理
     * @return 结果
     */
    @Override
    public int insertMesVoucher(MesVoucher mesVoucher)
    {
        mesVoucher.setCreateTime(DateUtils.getNowDate());
        return mesVoucherMapper.insertMesVoucher(mesVoucher);
    }

    /**
     * 修改出入库管理
     * 
     * @param mesVoucher 出入库管理
     * @return 结果
     */
    @Override
    public int updateMesVoucher(MesVoucher mesVoucher)
    {
        mesVoucher.setUpdateTime(DateUtils.getNowDate());
        return mesVoucherMapper.updateMesVoucher(mesVoucher);
    }

    /**
     * 批量删除出入库管理
     * 
     * @param voucherIds 需要删除的出入库管理主键
     * @return 结果
     */
    @Override
    public int deleteMesVoucherByVoucherIds(Long[] voucherIds)
    {
        return mesVoucherMapper.deleteMesVoucherByVoucherIds(voucherIds);
    }

    /**
     * 删除出入库管理信息
     * 
     * @param voucherId 出入库管理主键
     * @return 结果
     */
    @Override
    public int deleteMesVoucherByVoucherId(Long voucherId)
    {
        return mesVoucherMapper.deleteMesVoucherByVoucherId(voucherId);
    }
}
