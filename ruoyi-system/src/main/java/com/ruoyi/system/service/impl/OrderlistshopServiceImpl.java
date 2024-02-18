package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.OrderlistshopMapper;
import com.ruoyi.system.domain.Orderlistshop;
import com.ruoyi.system.service.IOrderlistshopService;

/**
 * @author zhouzx
 * @version 1.0
 * @date 2023/11/22
 */
@Service
public class OrderlistshopServiceImpl implements IOrderlistshopService
{
    @Autowired
    private OrderlistshopMapper orderlistshopMapper;

    /**
     * 查询店铺
     *
     * @param id 查询店铺主键
     * @return 查询店铺
     */
    @Override
    public Orderlistshop selectOrderlistshopById(Long id)
    {
        return orderlistshopMapper.selectOrderlistshopById(id);
    }

    /**
     * 查询店铺列表
     *
     * @param orderlistshop 查询店铺列表参数
     * @return 查询店铺列表
     */
    @Override
    public List<Orderlistshop> selectOrderlistshopList(Orderlistshop orderlistshop)
    {
        return orderlistshopMapper.selectOrderlistshopList(orderlistshop);
    }

    /**
     * 新增店铺
     *
     * @param orderlistshop 新增店铺参数
     * @return 新增店铺结果
     */
    @Override
    public int insertOrderlistshop(Orderlistshop orderlistshop)
    {
        return orderlistshopMapper.insertOrderlistshop(orderlistshop);
    }

    /**
     * 修改店铺
     *
     * @param orderlistshop 修改店铺参数
     * @return 修改店铺结果
     */
    @Override
    public int updateOrderlistshop(Orderlistshop orderlistshop)
    {
        return orderlistshopMapper.updateOrderlistshop(orderlistshop);
    }

    /**
     * 批量删除店铺
     *
     * @param ids 批量删除店铺主键
     * @return 批量删除店铺结果
     */
    @Override
    public int deleteOrderlistshopByIds(Long[] ids)
    {
        return orderlistshopMapper.deleteOrderlistshopByIds(ids);
    }

    /**
     * 删除店铺信息
     *
     * @param id 删除店铺信息主键
     * @return 删除店铺信息结果
     */
    @Override
    public int deleteOrderlistshopById(Long id)
    {
        return orderlistshopMapper.deleteOrderlistshopById(id);
    }
}
