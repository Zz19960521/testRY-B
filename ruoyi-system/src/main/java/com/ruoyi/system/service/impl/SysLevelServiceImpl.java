package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SysLevelMapper;
import com.ruoyi.system.domain.SysLevel;
import com.ruoyi.system.service.ISysLevelService;

/**
 * 职级Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-12-14
 */
@Service
public class SysLevelServiceImpl implements ISysLevelService 
{
    @Autowired
    private SysLevelMapper sysLevelMapper;

    /**
     * 查询职级
     * 
     * @param levelId 职级主键
     * @return 职级
     */
    @Override
    public SysLevel selectSysLevelByLevelId(Long levelId)
    {
        return sysLevelMapper.selectSysLevelByLevelId(levelId);
    }

    /**
     * 查询职级列表
     * 
     * @param sysLevel 职级
     * @return 职级
     */
    @Override
    public List<SysLevel> selectSysLevelList(SysLevel sysLevel)
    {
        return sysLevelMapper.selectSysLevelList(sysLevel);
    }

    /**
     * 新增职级
     * 
     * @param sysLevel 职级
     * @return 结果
     */
    @Override
    public int insertSysLevel(SysLevel sysLevel)
    {
        sysLevel.setCreateTime(DateUtils.getNowDate());
        return sysLevelMapper.insertSysLevel(sysLevel);
    }

    /**
     * 修改职级
     * 
     * @param sysLevel 职级
     * @return 结果
     */
    @Override
    public int updateSysLevel(SysLevel sysLevel)
    {
        sysLevel.setUpdateTime(DateUtils.getNowDate());
        return sysLevelMapper.updateSysLevel(sysLevel);
    }

    /**
     * 批量删除职级
     * 
     * @param levelIds 需要删除的职级主键
     * @return 结果
     */
    @Override
    public int deleteSysLevelByLevelIds(Long[] levelIds)
    {
        return sysLevelMapper.deleteSysLevelByLevelIds(levelIds);
    }

    /**
     * 删除职级信息
     * 
     * @param levelId 职级主键
     * @return 结果
     */
    @Override
    public int deleteSysLevelByLevelId(Long levelId)
    {
        return sysLevelMapper.deleteSysLevelByLevelId(levelId);
    }
}
