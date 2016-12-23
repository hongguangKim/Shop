package com.xiaoguang.xtaobao.bean;

import java.util.ArrayList;
import java.util.List;

import cn.bmob.v3.BmobObject;
import cn.bmob.v3.listener.FindListener;
import cn.bmob.v3.listener.UpdateListener;

/**
 * 商品的实体类
 * Created by 11655 on 2016/10/23.
 */

public class Goods extends BmobObject {
    //商品名称
    private String goodsName;
    //商品类别id
    private String goodsTypeId;
    //商品的图片
    private List<String> goodsImgs;
    //商品的价格
    private double goodsPrice;
    //商品的发货地址
    private String goodsAddress;
    //收藏商品的人
    private List<String> loveUserIds;

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsTypeId() {
        return goodsTypeId;
    }

    public void setGoodsTypeId(String goodsTypeId) {
        this.goodsTypeId = goodsTypeId;
    }

    public List<String> getGoodsImgs() {
        if (goodsImgs==null){
            goodsImgs = new ArrayList<>();
        }
        return goodsImgs;
    }

    public void setGoodsImgs(List<String> goodsImgs) {
        this.goodsImgs = goodsImgs;
    }

    public double getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(double goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public String getGoodsAddress() {
        return goodsAddress;
    }

    public void setGoodsAddress(String goodsAddress) {
        this.goodsAddress = goodsAddress;
    }

    public List<String> getLoveUserIds() {
        if (loveUserIds==null){
            loveUserIds = new ArrayList<>();
        }
        return loveUserIds;
    }

    public void setLoveUserIds(List<String> loveUserIds) {
        this.loveUserIds = loveUserIds;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "goodsName='" + goodsName + '\'' +
                ", goodsTypeId='" + goodsTypeId + '\'' +
                ", goodsImgs=" + goodsImgs +
                ", goodsPrice=" + goodsPrice +
                ", goodsAddress='" + goodsAddress + '\'' +
                ", loveUserIds=" + loveUserIds +
                '}';
    }


    public void update(FindListener<Goods> findListener, String s, UpdateListener updateListener) {
    }
}
