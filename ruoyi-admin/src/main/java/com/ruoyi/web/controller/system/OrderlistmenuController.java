package com.ruoyi.web.controller.system;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.system.domain.Orderlistmenu;
import com.ruoyi.system.service.IOrderlistmenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @author zhouzx
 * @version 1.0
 * @date 2023/11/16
 */
@RestController
@RequestMapping("/system/orderlistmenu")
public class OrderlistmenuController extends BaseController
{
    @Autowired
    private IOrderlistmenuService orderlistmenuService;

    /**
     * 查询菜单列表（分页）
     */
    @PreAuthorize("@ss.hasPermi('system:orderlistmenu:list')")
    @GetMapping("/list")
    public TableDataInfo list(Orderlistmenu orderlistmenu)
    {
        startPage();
        List<Orderlistmenu> list = orderlistmenuService.selectOrderlistmenuList(orderlistmenu);
        return getDataTable(list);
    }

    /**
    * 查询全部菜单列表（不分页）
    */
    @PreAuthorize("@ss.hasPermi('system:orderlistshop:list')")
    @GetMapping("/allInfo")
    public AjaxResult allInfo(Orderlistmenu orderlistmenu)
    {
        List<Orderlistmenu> list = orderlistmenuService.selectOrderlistmenuList(orderlistmenu);
        return success(list);
    }

    /**
     * 导出菜单列表
     */
    @PreAuthorize("@ss.hasPermi('system:orderlistmenu:export')")
    @Log(title = "导出菜单列表", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Orderlistmenu orderlistmenu)
    {
        List<Orderlistmenu> list = orderlistmenuService.selectOrderlistmenuList(orderlistmenu);
        ExcelUtil<Orderlistmenu> util = new ExcelUtil<Orderlistmenu>(Orderlistmenu.class);
        util.exportExcel(response, list, "【请填写功能名称】数据");
    }

    /**
     * 获取菜单详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:orderlistmenu:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(orderlistmenuService.selectOrderlistmenuById(id));
    }

    /**
     * 新增菜单
     */
    @PreAuthorize("@ss.hasPermi('system:orderlistmenu:add')")
    @Log(title = "新增菜单", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Orderlistmenu orderlistmenu)
    {
        return toAjax(orderlistmenuService.insertOrderlistmenu(orderlistmenu));
    }

    /**
     * 修改菜单
     */
    @PreAuthorize("@ss.hasPermi('system:orderlistmenu:edit')")
    @Log(title = "修改菜单", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Orderlistmenu orderlistmenu)
    {
        return toAjax(orderlistmenuService.updateOrderlistmenu(orderlistmenu));
    }

    /**
     * 删除菜单
     */
    @PreAuthorize("@ss.hasPermi('system:orderlistmenu:remove')")
    @Log(title = "删除菜单", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(orderlistmenuService.deleteOrderlistmenuByIds(ids));
    }
}
