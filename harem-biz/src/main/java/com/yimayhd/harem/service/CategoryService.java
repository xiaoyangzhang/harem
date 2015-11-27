package com.yimayhd.harem.service;

import com.yimayhd.ic.client.model.domain.item.CategoryDO;

import java.util.List;

/**
 * Created by Administrator on 2015/11/25.
 */
public interface CategoryService {
    /**
     * 获取品类根列表
     * @return 品类根列表
     * @throws Exception
     */
    List<CategoryDO> getCategoryDOList()throws Exception;

    /**
     * 根据父id获取子品类列表
     * @param parentId 品类ID
     * @return 品类列表
     * @throws Exception
     */
    List<CategoryDO> getCategoryDOList(long parentId)throws Exception;

    /**
     * 根据品类id获取品类
     * @param id 品类ID
     * @return 品类
     * @throws Exception
     */
    CategoryDO getCategoryById(long id)throws Exception;

}