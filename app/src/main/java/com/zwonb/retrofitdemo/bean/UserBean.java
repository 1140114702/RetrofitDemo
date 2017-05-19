package com.zwonb.retrofitdemo.bean;

import java.util.List;

/**
 * Created by zyb on 2017/5/18.
 */

public class UserBean {

    /**
     * ydCode : 100
     * ydMsg :
     * ydBody : {"adList":[{"adImg":"http://elifeadmin.ed68.cn/data/upload/576a3fa488590.png","adUrl":"http://ceshi.yidont.com/game/se","adType":2}],"shopList":[{"productId":"29","productImg":"http://admin.yidont.com/admin/elifeadmin/data/upload/57e099174c26b.jpg","productTitle":"斯伯丁室外篮球","productRate":60,"productUrl":"http://admin.yidont.com/admin/elifeadmin/index.html"}]}
     */

    private String ydCode;
    private String ydMsg;
    private YdBodyBean ydBody;

    public String getYdCode() {
        return ydCode;
    }

    public void setYdCode(String ydCode) {
        this.ydCode = ydCode;
    }

    public String getYdMsg() {
        return ydMsg;
    }

    public void setYdMsg(String ydMsg) {
        this.ydMsg = ydMsg;
    }

    public YdBodyBean getYdBody() {
        return ydBody;
    }

    public void setYdBody(YdBodyBean ydBody) {
        this.ydBody = ydBody;
    }

    public static class YdBodyBean {
        private List<AdListBean> adList;
        private List<ShopListBean> shopList;

        public List<AdListBean> getAdList() {
            return adList;
        }

        public void setAdList(List<AdListBean> adList) {
            this.adList = adList;
        }

        public List<ShopListBean> getShopList() {
            return shopList;
        }

        public void setShopList(List<ShopListBean> shopList) {
            this.shopList = shopList;
        }

        public static class AdListBean {
            /**
             * adImg : http://elifeadmin.ed68.cn/data/upload/576a3fa488590.png
             * adUrl : http://ceshi.yidont.com/game/se
             * adType : 2
             */

            private String adImg;
            private String adUrl;
            private int adType;

            public String getAdImg() {
                return adImg;
            }

            public void setAdImg(String adImg) {
                this.adImg = adImg;
            }

            public String getAdUrl() {
                return adUrl;
            }

            public void setAdUrl(String adUrl) {
                this.adUrl = adUrl;
            }

            public int getAdType() {
                return adType;
            }

            public void setAdType(int adType) {
                this.adType = adType;
            }
        }

        public static class ShopListBean {
            /**
             * productId : 29
             * productImg : http://admin.yidont.com/admin/elifeadmin/data/upload/57e099174c26b.jpg
             * productTitle : 斯伯丁室外篮球
             * productRate : 60
             * productUrl : http://admin.yidont.com/admin/elifeadmin/index.html
             */

            private String productId;
            private String productImg;
            private String productTitle;
            private int productRate;
            private String productUrl;

            public String getProductId() {
                return productId;
            }

            public void setProductId(String productId) {
                this.productId = productId;
            }

            public String getProductImg() {
                return productImg;
            }

            public void setProductImg(String productImg) {
                this.productImg = productImg;
            }

            public String getProductTitle() {
                return productTitle;
            }

            public void setProductTitle(String productTitle) {
                this.productTitle = productTitle;
            }

            public int getProductRate() {
                return productRate;
            }

            public void setProductRate(int productRate) {
                this.productRate = productRate;
            }

            public String getProductUrl() {
                return productUrl;
            }

            public void setProductUrl(String productUrl) {
                this.productUrl = productUrl;
            }
        }
    }
}
