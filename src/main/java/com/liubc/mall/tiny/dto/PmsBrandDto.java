package com.liubc.mall.tiny.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author 刘宝琛
 * @Description
 * @Create 2020-11-24 23:13
 * @Version 1.0
 **/
@Data
public class PmsBrandDto implements Serializable {

    private Long id;

    private String name;

    /**
     * 首字母
     *
     * @mbggenerated
     */
    private String firstLetter;

    private Integer sort;

    /**
     * 是否为品牌制造商：0->不是；1->是
     *
     * @mbggenerated
     */
    private Integer factoryStatus;

    private Integer showStatus;

    /**
     * 产品数量
     *
     * @mbggenerated
     */
    private Integer productCount;

    /**
     * 产品评论数量
     *
     * @mbggenerated
     */
    private Integer productCommentCount;

    /**
     * 品牌logo
     *
     * @mbggenerated
     */
    private String logo;

    /**
     * 专区大图
     *
     * @mbggenerated
     */
    private String bigPic;

    /**
     * 品牌故事
     *
     * @mbggenerated
     */
    private String brandStory;
}
