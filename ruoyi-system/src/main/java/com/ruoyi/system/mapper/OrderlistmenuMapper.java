package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.Orderlistmenu;

/**
 * @author zhouzx
 * @version 1.0
 * @date 2023/11/16
 */
public interface OrderlistmenuMapper
{
    /**
     * 查询菜单详情
     *
     * @param id 查询菜单详情主键
     * @return 查询菜单详情
     */
    public Orderlistmenu selectOrderlistmenuById(Long id);

    /**
     * 查询查询菜单列表
     *
     * @param orderlistmenu 查询查询菜单列表参数
     * @return 查询查询菜单列表集合
     */
    public List<Orderlistmenu> selectOrderlistmenuList(Orderlistmenu orderlistmenu);

    /**
     * 新增菜单
     *
     * @param orderlistmenu 新增菜单参数
     * @return 新增菜单结果
     */
    public int insertOrderlistmenu(Orderlistmenu orderlistmenu);

    /**
     * 修改菜单
     *
     * @param orderlistmenu 修改菜单参数
     * @return 修改菜单结果
     */
    public int updateOrderlistmenu(Orderlistmenu orderlistmenu);

    /**
     * 删除菜单
     *
     * @param id 删除菜单主键
     * @return 删除菜单结果
     */
    public int deleteOrderlistmenuById(Long id);

    /**
     * 批量删除菜单
     *
     * @param ids 批量删除菜单主键集合
     * @return 批量删除菜单结果
     */
    public int deleteOrderlistmenuByIds(Long[] ids);
}
