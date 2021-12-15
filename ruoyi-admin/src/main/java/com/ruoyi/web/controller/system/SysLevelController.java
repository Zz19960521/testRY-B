package com.ruoyi.web.controller.system;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.SysLevel;
import com.ruoyi.system.service.ISysLevelService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 职级Controller
 * 
 * @author ruoyi
 * @date 2021-12-14
 */
@RestController
@RequestMapping("/system/level")
public class SysLevelController extends BaseController
{
    @Autowired
    private ISysLevelService sysLevelService;

    /**
     * 查询职级列表
     */
    @PreAuthorize("@ss.hasPermi('system:level:list')")
    @GetMapping("/list")
    public TableDataInfo list(SysLevel sysLevel)
    {
        startPage();
        List<SysLevel> list = sysLevelService.selectSysLevelList(sysLevel);
        return getDataTable(list);
    }

    /**
     * 导出职级列表
     */
    @PreAuthorize("@ss.hasPermi('system:level:export')")
    @Log(title = "职级", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SysLevel sysLevel)
    {
        List<SysLevel> list = sysLevelService.selectSysLevelList(sysLevel);
        ExcelUtil<SysLevel> util = new ExcelUtil<SysLevel>(SysLevel.class);
        util.exportExcel(response, list, "职级数据");
    }

    /**
     * 获取职级详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:level:query')")
    @GetMapping(value = "/{levelId}")
    public AjaxResult getInfo(@PathVariable("levelId") Long levelId)
    {
        return AjaxResult.success(sysLevelService.selectSysLevelByLevelId(levelId));
    }

    /**
     * 新增职级
     */
    @PreAuthorize("@ss.hasPermi('system:level:add')")
    @Log(title = "职级", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SysLevel sysLevel)
    {
        return toAjax(sysLevelService.insertSysLevel(sysLevel));
    }

    /**
     * 修改职级
     */
    @PreAuthorize("@ss.hasPermi('system:level:edit')")
    @Log(title = "职级", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SysLevel sysLevel)
    {
        return toAjax(sysLevelService.updateSysLevel(sysLevel));
    }

    /**
     * 删除职级
     */
    @PreAuthorize("@ss.hasPermi('system:level:remove')")
    @Log(title = "职级", businessType = BusinessType.DELETE)
	@DeleteMapping("/{levelIds}")
    public AjaxResult remove(@PathVariable Long[] levelIds)
    {
        return toAjax(sysLevelService.deleteSysLevelByLevelIds(levelIds));
    }
}
