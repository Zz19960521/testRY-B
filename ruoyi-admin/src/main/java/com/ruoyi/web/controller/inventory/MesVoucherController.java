package com.ruoyi.web.controller.inventory;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.inventory.domain.MesVoucher;
import com.ruoyi.inventory.service.IMesVoucherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 出入库管理Controller
 * 
 * @author zhangz
 * @date 2021-12-30
 */
@RestController
@RequestMapping("/inventory/voucher")
public class MesVoucherController extends BaseController
{
    @Autowired
    private IMesVoucherService mesVoucherService;

    /**
     * 查询出入库管理列表
     */
    @PreAuthorize("@ss.hasPermi('inventory:voucher:list')")
    @GetMapping("/list")
    public TableDataInfo list(MesVoucher mesVoucher)
    {
        startPage();
        List<MesVoucher> list = mesVoucherService.selectMesVoucherList(mesVoucher);
        return getDataTable(list);
    }

    /**
     * 导出出入库管理列表
     */
    @PreAuthorize("@ss.hasPermi('inventory:voucher:export')")
    @Log(title = "出入库管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, MesVoucher mesVoucher)
    {
        List<MesVoucher> list = mesVoucherService.selectMesVoucherList(mesVoucher);
        ExcelUtil<MesVoucher> util = new ExcelUtil<MesVoucher>(MesVoucher.class);
        util.exportExcel(response, list, "出入库管理数据");
    }

    /**
     * 获取出入库管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('inventory:voucher:query')")
    @GetMapping(value = "/{voucherId}")
    public AjaxResult getInfo(@PathVariable("voucherId") Long voucherId)
    {
        return AjaxResult.success(mesVoucherService.selectMesVoucherByVoucherId(voucherId));
    }

    /**
     * 新增出入库管理
     */
    @PreAuthorize("@ss.hasPermi('inventory:voucher:add')")
    @Log(title = "出入库管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody MesVoucher mesVoucher)
    {
        return toAjax(mesVoucherService.insertMesVoucher(mesVoucher));
    }

    /**
     * 修改出入库管理
     */
    @PreAuthorize("@ss.hasPermi('inventory:voucher:edit')")
    @Log(title = "出入库管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody MesVoucher mesVoucher)
    {
        return toAjax(mesVoucherService.updateMesVoucher(mesVoucher));
    }

    /**
     * 删除出入库管理
     */
    @PreAuthorize("@ss.hasPermi('inventory:voucher:remove')")
    @Log(title = "出入库管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{voucherIds}")
    public AjaxResult remove(@PathVariable Long[] voucherIds)
    {
        return toAjax(mesVoucherService.deleteMesVoucherByVoucherIds(voucherIds));
    }
}
