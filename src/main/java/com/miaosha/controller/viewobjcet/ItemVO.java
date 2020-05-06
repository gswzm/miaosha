package com.miaosha.controller.viewobjcet;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

/**
 * @program: miaosha
 * @description:
 * @author: wangzm
 * @create: 2020-05-06
 */
public class ItemVO {
    private Integer id;

    //商品名
    private String title;

    //商品的价格
    private BigDecimal price;

    //商品的库存
    private Integer stock;

    //商品的描述
    private String description;
    //商品的销量
    private Integer sales;
    //商品描述图片url
    private String imgUrl;
}
