package com.miaosha.service;

import com.miaosha.error.BusinessException;
import com.miaosha.service.model.ItemModel;

import java.util.List;

/**
 * @program: miaosha
 * @description:
 * @author: wangzm
 * @create: 2020-05-06
 */
public interface ItemService {
    //创建商品
    ItemModel createItem(ItemModel itemModel) throws BusinessException;
    //商品列表浏览
    List<ItemModel> itemList();
    //商品详情浏览
    ItemModel getItemById(Integer id);
}
