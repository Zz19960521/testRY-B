package com.ruoyi.material.mapper;

import java.util.List;
import com.ruoyi.material.domain.MesMaterial;

/**
 * 基础物料Mapper接口
 * 
 * @author zhangz
 * @date 2021-12-29
 */
public interface MesMaterialMapper 
{
    /**
     * 查询基础物料
     * 
     * @param materialId 基础物料主键
     * @return 基础物料
     */
    public MesMaterial selectMesMaterialByMaterialId(Long materialId);

    /**
     * 查询基础物料列表
     * 
     * @param mesMaterial 基础物料
     * @return 基础物料集合
     */
    public List<MesMaterial> selectMesMaterialList(MesMaterial mesMaterial);

    /**
     * 新增基础物料
     * 
     * @param mesMaterial 基础物料
     * @return 结果
     */
    public int insertMesMaterial(MesMaterial mesMaterial);

    /**
     * 修改基础物料
     * 
     * @param mesMaterial 基础物料
     * @return 结果
     */
    public int updateMesMaterial(MesMaterial mesMaterial);

    /**
     * 删除基础物料
     * 
     * @param materialId 基础物料主键
     * @return 结果
     */
    public int deleteMesMaterialByMaterialId(Long materialId);

    /**
     * 批量删除基础物料
     * 
     * @param materialIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteMesMaterialByMaterialIds(Long[] materialIds);
}
