package com.ruoyi.web.controller.material;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.material.domain.MesMaterial;
import com.ruoyi.material.service.IMesMaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 基础物料Controller
 * 
 * @author zhangz
 * @date 2021-12-29
 */
@RestController
@RequestMapping("/material/material")
public class MesMaterialController extends BaseController
{
    @Autowired
    private IMesMaterialService mesMaterialService;

    /**
     * 查询基础物料列表
     */
    @PreAuthorize("@ss.hasPermi('material:material:list')")
    @GetMapping("/list")
    public TableDataInfo list(MesMaterial mesMaterial)
    {
        startPage();
        List<MesMaterial> list = mesMaterialService.selectMesMaterialList(mesMaterial);
        return getDataTable(list);
    }

    /**
     * 导出基础物料列表
     */
    @PreAuthorize("@ss.hasPermi('material:material:export')")
    @Log(title = "基础物料", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, MesMaterial mesMaterial)
    {
        List<MesMaterial> list = mesMaterialService.selectMesMaterialList(mesMaterial);
        ExcelUtil<MesMaterial> util = new ExcelUtil<MesMaterial>(MesMaterial.class);
        util.exportExcel(response, list, "基础物料数据");
    }

    /**
     * 获取基础物料详细信息
     */
    @PreAuthorize("@ss.hasPermi('material:material:query')")
    @GetMapping(value = "/{materialId}")
    public AjaxResult getInfo(@PathVariable("materialId") Long materialId)
    {
        return AjaxResult.success(mesMaterialService.selectMesMaterialByMaterialId(materialId));
    }

    /**
     * 新增基础物料
     */
    @PreAuthorize("@ss.hasPermi('material:material:add')")
    @Log(title = "基础物料", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody MesMaterial mesMaterial)
    {
        return toAjax(mesMaterialService.insertMesMaterial(mesMaterial));
    }

    /**
     * 修改基础物料
     */
    @PreAuthorize("@ss.hasPermi('material:material:edit')")
    @Log(title = "基础物料", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody MesMaterial mesMaterial)
    {
        return toAjax(mesMaterialService.updateMesMaterial(mesMaterial));
    }

    /**
     * 删除基础物料
     */
    @PreAuthorize("@ss.hasPermi('material:material:remove')")
    @Log(title = "基础物料", businessType = BusinessType.DELETE)
	@DeleteMapping("/{materialIds}")
    public AjaxResult remove(@PathVariable Long[] materialIds)
    {
        return toAjax(mesMaterialService.deleteMesMaterialByMaterialIds(materialIds));
    }
}
