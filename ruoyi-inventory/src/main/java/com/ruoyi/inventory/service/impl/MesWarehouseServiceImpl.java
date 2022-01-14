package com.ruoyi.inventory.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.inventory.mapper.MesWarehouseMapper;
import com.ruoyi.inventory.domain.MesWarehouse;
import com.ruoyi.inventory.service.IMesWarehouseService;

/**
 * 仓库管理Service业务层处理
 * 
 * @author zhangz
 * @date 2021-12-30
 */
@Service
public class MesWarehouseServiceImpl implements IMesWarehouseService 
{
    @Autowired
    private MesWarehouseMapper mesWarehouseMapper;

    /**
     * 查询仓库管理
     * 
     * @param warehouseId 仓库管理主键
     * @return 仓库管理
     */
    @Override
    public MesWarehouse selectMesWarehouseByWarehouseId(Long warehouseId)
    {
        return mesWarehouseMapper.selectMesWarehouseByWarehouseId(warehouseId);
    }

    /**
     * 查询仓库管理列表
     * 
     * @param mesWarehouse 仓库管理
     * @return 仓库管理
     */
    @Override
    public List<MesWarehouse> selectMesWarehouseList(MesWarehouse mesWarehouse)
    {
        return mesWarehouseMapper.selectMesWarehouseList(mesWarehouse);
    }

    /**
     * 新增仓库管理
     * 
     * @param mesWarehouse 仓库管理
     * @return 结果
     */
    @Override
    public int insertMesWarehouse(MesWarehouse mesWarehouse)
    {
        mesWarehouse.setCreateTime(DateUtils.getNowDate());
        return mesWarehouseMapper.insertMesWarehouse(mesWarehouse);
    }

    /**
     * 修改仓库管理
     * 
     * @param mesWarehouse 仓库管理
     * @return 结果
     */
    @Override
    public int updateMesWarehouse(MesWarehouse mesWarehouse)
    {
        mesWarehouse.setUpdateTime(DateUtils.getNowDate());
        return mesWarehouseMapper.updateMesWarehouse(mesWarehouse);
    }

    /**
     * 批量删除仓库管理
     * 
     * @param warehouseIds 需要删除的仓库管理主键
     * @return 结果
     */
    @Override
    public int deleteMesWarehouseByWarehouseIds(Long[] warehouseIds)
    {
        return mesWarehouseMapper.deleteMesWarehouseByWarehouseIds(warehouseIds);
    }

    /**
     * 删除仓库管理信息
     * 
     * @param warehouseId 仓库管理主键
     * @return 结果
     */
    @Override
    public int deleteMesWarehouseByWarehouseId(Long warehouseId)
    {
        return mesWarehouseMapper.deleteMesWarehouseByWarehouseId(warehouseId);
    }
}
