package com.ruoyi.web.controller.inventory;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.inventory.domain.MesWarehouse;
import com.ruoyi.inventory.service.IMesWarehouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 仓库管理Controller
 * 
 * @author zhangz
 * @date 2021-12-30
 */
@RestController
@RequestMapping("/inventory/warehouse")
public class MesWarehouseController extends BaseController
{
    @Autowired
    private IMesWarehouseService mesWarehouseService;

    /**
     * 查询仓库管理列表
     */
    @PreAuthorize("@ss.hasPermi('inventory:warehouse:list')")
    @GetMapping("/list")
    public TableDataInfo list(MesWarehouse mesWarehouse)
    {
        startPage();
        List<MesWarehouse> list = mesWarehouseService.selectMesWarehouseList(mesWarehouse);
        return getDataTable(list);
    }

    /**
     * 导出仓库管理列表
     */
    @PreAuthorize("@ss.hasPermi('inventory:warehouse:export')")
    @Log(title = "仓库管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, MesWarehouse mesWarehouse)
    {
        List<MesWarehouse> list = mesWarehouseService.selectMesWarehouseList(mesWarehouse);
        ExcelUtil<MesWarehouse> util = new ExcelUtil<MesWarehouse>(MesWarehouse.class);
        util.exportExcel(response, list, "仓库管理数据");
    }

    /**
     * 获取仓库管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('inventory:warehouse:query')")
    @GetMapping(value = "/{warehouseId}")
    public AjaxResult getInfo(@PathVariable("warehouseId") Long warehouseId)
    {
        return AjaxResult.success(mesWarehouseService.selectMesWarehouseByWarehouseId(warehouseId));
    }

    /**
     * 新增仓库管理
     */
    @PreAuthorize("@ss.hasPermi('inventory:warehouse:add')")
    @Log(title = "仓库管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody MesWarehouse mesWarehouse)
    {
        return toAjax(mesWarehouseService.insertMesWarehouse(mesWarehouse));
    }

    /**
     * 修改仓库管理
     */
    @PreAuthorize("@ss.hasPermi('inventory:warehouse:edit')")
    @Log(title = "仓库管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody MesWarehouse mesWarehouse)
    {
        return toAjax(mesWarehouseService.updateMesWarehouse(mesWarehouse));
    }

    /**
     * 删除仓库管理
     */
    @PreAuthorize("@ss.hasPermi('inventory:warehouse:remove')")
    @Log(title = "仓库管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{warehouseIds}")
    public AjaxResult remove(@PathVariable Long[] warehouseIds)
    {
        return toAjax(mesWarehouseService.deleteMesWarehouseByWarehouseIds(warehouseIds));
    }
}
