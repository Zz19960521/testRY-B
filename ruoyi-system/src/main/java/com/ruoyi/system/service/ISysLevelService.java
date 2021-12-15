package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.SysLevel;

/**
 * 职级Service接口
 * 
 * @author ruoyi
 * @date 2021-12-14
 */
public interface ISysLevelService 
{
    /**
     * 查询职级
     * 
     * @param levelId 职级主键
     * @return 职级
     */
    public SysLevel selectSysLevelByLevelId(Long levelId);

    /**
     * 查询职级列表
     * 
     * @param sysLevel 职级
     * @return 职级集合
     */
    public List<SysLevel> selectSysLevelList(SysLevel sysLevel);

    /**
     * 新增职级
     * 
     * @param sysLevel 职级
     * @return 结果
     */
    public int insertSysLevel(SysLevel sysLevel);

    /**
     * 修改职级
     * 
     * @param sysLevel 职级
     * @return 结果
     */
    public int updateSysLevel(SysLevel sysLevel);

    /**
     * 批量删除职级
     * 
     * @param levelIds 需要删除的职级主键集合
     * @return 结果
     */
    public int deleteSysLevelByLevelIds(Long[] levelIds);

    /**
     * 删除职级信息
     * 
     * @param levelId 职级主键
     * @return 结果
     */
    public int deleteSysLevelByLevelId(Long levelId);
}
