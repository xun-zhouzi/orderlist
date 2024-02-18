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
import com.ruoyi.system.domain.Orderlistshop;
import com.ruoyi.system.service.IOrderlistshopService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * @author zhouzx
 * @version 1.0
 * @date 2023/11/22
 */
@RestController
@RequestMapping("/system/orderlistshop")
public class OrderlistshopController extends BaseController
{
    @Autowired
    private IOrderlistshopService orderlistshopService;

    /**
     * 查询店铺列表
     */
    @PreAuthorize("@ss.hasPermi('system:orderlistshop:list')")
    @GetMapping("/list")
    public TableDataInfo list(Orderlistshop orderlistshop)
    {
        startPage();
        List<Orderlistshop> list = orderlistshopService.selectOrderlistshopList(orderlistshop);
        return getDataTable(list);
    }

    /**
     * 导出店铺列表
     */
    @PreAuthorize("@ss.hasPermi('system:orderlistshop:export')")
    @Log(title = "导出店铺列表", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Orderlistshop orderlistshop)
    {
        List<Orderlistshop> list = orderlistshopService.selectOrderlistshopList(orderlistshop);
        ExcelUtil<Orderlistshop> util = new ExcelUtil<Orderlistshop>(Orderlistshop.class);
        util.exportExcel(response, list, "【请填写功能名称】数据");
    }

    /**
     * 获取店铺详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:orderlistshop:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(orderlistshopService.selectOrderlistshopById(id));
    }

    /**
     * 新增店铺
     */
    @PreAuthorize("@ss.hasPermi('system:orderlistshop:add')")
    @Log(title = "新增店铺", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Orderlistshop orderlistshop)
    {
        return toAjax(orderlistshopService.insertOrderlistshop(orderlistshop));
    }

    /**
     * 修改店铺
     */
    @PreAuthorize("@ss.hasPermi('system:orderlistshop:edit')")
    @Log(title = "修改店铺", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Orderlistshop orderlistshop)
    {
        return toAjax(orderlistshopService.updateOrderlistshop(orderlistshop));
    }

    /**
     * 删除店铺
     */
    @PreAuthorize("@ss.hasPermi('system:orderlistshop:remove')")
    @Log(title = "删除店铺", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(orderlistshopService.deleteOrderlistshopByIds(ids));
    }
}
