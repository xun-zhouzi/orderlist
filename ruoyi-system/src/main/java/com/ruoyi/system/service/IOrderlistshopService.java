package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.Orderlistshop;

/**
 * @author zhouzx
 * @version 1.0
 * @date 2023/11/22
 */
public interface IOrderlistshopService
{
    /**
     * 查询店铺详情
     *
     * @param id 查询店铺详情主键
     * @return 查询店铺详情
     */
    public Orderlistshop selectOrderlistshopById(Long id);

    /**
     * 查询店铺列表
     *
     * @param orderlistshop 查询店铺列表参数
     * @return 查询店铺列表集合
     */
    public List<Orderlistshop> selectOrderlistshopList(Orderlistshop orderlistshop);

    /**
     * 新增店铺
     *
     * @param orderlistshop 新增店铺参数
     * @return 新增店铺结果
     */
    public int insertOrderlistshop(Orderlistshop orderlistshop);

    /**
     * 修改店铺
     *
     * @param orderlistshop 修改店铺参数
     * @return 修改店铺结果
     */
    public int updateOrderlistshop(Orderlistshop orderlistshop);

    /**
     * 批量删除店铺
     *
     * @param ids 批量删除店铺主键集合
     * @return 批量删除店铺结果
     */
    public int deleteOrderlistshopByIds(Long[] ids);

    /**
     * 删除店铺信息
     *
     * @param id 删除店铺信息主键
     * @return 删除店铺信息结果
     */
    public int deleteOrderlistshopById(Long id);
}
