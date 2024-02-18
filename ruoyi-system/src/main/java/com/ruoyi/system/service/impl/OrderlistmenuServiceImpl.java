package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.OrderlistmenuMapper;
import com.ruoyi.system.domain.Orderlistmenu;
import com.ruoyi.system.service.IOrderlistmenuService;

/**
 * @author zhouzx
 * @version 1.0
 * @date 2023/11/16
 */
@Service
public class OrderlistmenuServiceImpl implements IOrderlistmenuService
{
    @Autowired
    private OrderlistmenuMapper orderlistmenuMapper;

    /**
     * 查询菜单详情
     *
     * @param id 查询菜单详情主键
     * @return 查询菜单详情
     */
    @Override
    public Orderlistmenu selectOrderlistmenuById(Long id)
    {
        return orderlistmenuMapper.selectOrderlistmenuById(id);
    }

    /**
     * 查询菜单列表
     *
     * @param orderlistmenu  查询菜单列表参数
     * @return 查询菜单列表
     */
    @Override
    public List<Orderlistmenu> selectOrderlistmenuList(Orderlistmenu orderlistmenu)
    {
        return orderlistmenuMapper.selectOrderlistmenuList(orderlistmenu);
    }

    /**
     * 新增菜单
     *
     * @param orderlistmenu 新增菜单参数
     * @return 新增菜单结果
     */
    @Override
    public int insertOrderlistmenu(Orderlistmenu orderlistmenu)
    {
        return orderlistmenuMapper.insertOrderlistmenu(orderlistmenu);
    }

    /**
     * 修改菜单
     *
     * @param orderlistmenu 修改菜单参数
     * @return 修改菜单结果
     */
    @Override
    public int updateOrderlistmenu(Orderlistmenu orderlistmenu)
    {
        return orderlistmenuMapper.updateOrderlistmenu(orderlistmenu);
    }

    /**
     * 批量删除菜单
     *
     * @param ids 批量删除菜单主键
     * @return 批量删除菜单结果
     */
    @Override
    public int deleteOrderlistmenuByIds(Long[] ids)
    {
        return orderlistmenuMapper.deleteOrderlistmenuByIds(ids);
    }

    /**
     * 删除菜单信息
     *
     * @param id 删除菜单信息主键
     * @return 删除菜单信息结果
     */
    @Override
    public int deleteOrderlistmenuById(Long id)
    {
        return orderlistmenuMapper.deleteOrderlistmenuById(id);
    }
}
