package com.ruoyi.material.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.material.mapper.MesMaterialMapper;
import com.ruoyi.material.domain.MesMaterial;
import com.ruoyi.material.service.IMesMaterialService;

/**
 * 基础物料Service业务层处理
 * 
 * @author zhangz
 * @date 2021-12-29
 */
@Service
public class MesMaterialServiceImpl implements IMesMaterialService 
{
    @Autowired
    private MesMaterialMapper mesMaterialMapper;

    /**
     * 查询基础物料
     * 
     * @param materialId 基础物料主键
     * @return 基础物料
     */
    @Override
    public MesMaterial selectMesMaterialByMaterialId(Long materialId)
    {
        return mesMaterialMapper.selectMesMaterialByMaterialId(materialId);
    }

    /**
     * 查询基础物料列表
     * 
     * @param mesMaterial 基础物料
     * @return 基础物料
     */
    @Override
    public List<MesMaterial> selectMesMaterialList(MesMaterial mesMaterial)
    {
        return mesMaterialMapper.selectMesMaterialList(mesMaterial);
    }

    /**
     * 新增基础物料
     * 
     * @param mesMaterial 基础物料
     * @return 结果
     */
    @Override
    public int insertMesMaterial(MesMaterial mesMaterial)
    {
        return mesMaterialMapper.insertMesMaterial(mesMaterial);
    }

    /**
     * 修改基础物料
     * 
     * @param mesMaterial 基础物料
     * @return 结果
     */
    @Override
    public int updateMesMaterial(MesMaterial mesMaterial)
    {
        return mesMaterialMapper.updateMesMaterial(mesMaterial);
    }

    /**
     * 批量删除基础物料
     * 
     * @param materialIds 需要删除的基础物料主键
     * @return 结果
     */
    @Override
    public int deleteMesMaterialByMaterialIds(Long[] materialIds)
    {
        return mesMaterialMapper.deleteMesMaterialByMaterialIds(materialIds);
    }

    /**
     * 删除基础物料信息
     * 
     * @param materialId 基础物料主键
     * @return 结果
     */
    @Override
    public int deleteMesMaterialByMaterialId(Long materialId)
    {
        return mesMaterialMapper.deleteMesMaterialByMaterialId(materialId);
    }
}
