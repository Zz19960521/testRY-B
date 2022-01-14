package com.ruoyi.inventory.service;

import java.util.List;
import com.ruoyi.inventory.domain.MesWarehouse;

/**
 * 仓库管理Service接口
 * 
 * @author zhangz
 * @date 2021-12-30
 */
public interface IMesWarehouseService 
{
    /**
     * 查询仓库管理
     * 
     * @param warehouseId 仓库管理主键
     * @return 仓库管理
     */
    public MesWarehouse selectMesWarehouseByWarehouseId(Long warehouseId);

    /**
     * 查询仓库管理列表
     * 
     * @param mesWarehouse 仓库管理
     * @return 仓库管理集合
     */
    public List<MesWarehouse> selectMesWarehouseList(MesWarehouse mesWarehouse);

    /**
     * 新增仓库管理
     * 
     * @param mesWarehouse 仓库管理
     * @return 结果
     */
    public int insertMesWarehouse(MesWarehouse mesWarehouse);

    /**
     * 修改仓库管理
     * 
     * @param mesWarehouse 仓库管理
     * @return 结果
     */
    public int updateMesWarehouse(MesWarehouse mesWarehouse);

    /**
     * 批量删除仓库管理
     * 
     * @param warehouseIds 需要删除的仓库管理主键集合
     * @return 结果
     */
    public int deleteMesWarehouseByWarehouseIds(Long[] warehouseIds);

    /**
     * 删除仓库管理信息
     * 
     * @param warehouseId 仓库管理主键
     * @return 结果
     */
    public int deleteMesWarehouseByWarehouseId(Long warehouseId);
}
