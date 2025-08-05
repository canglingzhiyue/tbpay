package com.taobao.android.detail.sdk.model.node;

import com.alibaba.fastjson.JSONObject;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class FeatureNode extends DetailNode {
    public boolean bundleItem;
    public boolean customItem;
    public boolean hasAddCartCoudan;
    public boolean hasAddTmallCartCoudan;
    public boolean hasCartRecommend;
    public boolean hasCombo;
    public boolean hasCoupon;
    public boolean hasMeal;
    public boolean hasMobileDesc;
    public boolean hasQualification;
    public boolean hasSeat;
    public boolean hasSku;
    public boolean hideShopDsr;
    public boolean hideWangwang;
    public boolean isCloudShopItem;
    public boolean isDamai;
    public boolean isDonateItem;
    public boolean isMakeUp;
    public boolean isXinxuan;
    public boolean nABundleItem;
    public boolean needOpenGradient;
    public boolean needVideoFlow;
    public boolean newAddress;
    public boolean renovation;
    public boolean secKill;
    public boolean series;
    public boolean shareGroup;
    public boolean showLiteAppRec;
    public boolean showSku;
    public boolean showSkuInGalleryView;
    public boolean showSkuThumbnail;
    public boolean showSubTitle;
    public boolean switchToOldApp;
    public boolean useReplenishmentRemind;
    public boolean wlDescReformed;

    static {
        kge.a(233686289);
    }

    public FeatureNode(JSONObject jSONObject) {
        super(jSONObject);
        this.showSkuInGalleryView = false;
        this.useReplenishmentRemind = false;
        this.series = false;
        this.hasSku = jSONObject.getBooleanValue("hasSku");
        this.showSku = jSONObject.getBooleanValue("showSku");
        this.hasCombo = jSONObject.getBooleanValue("hasCombo");
        this.hasMeal = jSONObject.getBooleanValue("hasMeal");
        this.hasCoupon = jSONObject.getBooleanValue("hasCoupon");
        this.secKill = jSONObject.getBooleanValue("secKill");
        this.hideWangwang = jSONObject.getBooleanValue("hideWangwang");
        this.switchToOldApp = jSONObject.getBooleanValue("switchToOldApp");
        this.hideShopDsr = jSONObject.getBooleanValue("hideShopDsr");
        this.hasAddCartCoudan = jSONObject.getBooleanValue("hasAddCartCoudan");
        this.hasAddTmallCartCoudan = jSONObject.getBooleanValue("hasAddTmallCartCoudan");
        this.hasQualification = jSONObject.getBooleanValue("hasQualification");
        this.hasMobileDesc = jSONObject.getBooleanValue("hasMobileDesc");
        this.isMakeUp = jSONObject.getBooleanValue("makeup");
        this.wlDescReformed = jSONObject.getBooleanValue("wlDescReformed");
        this.hasCartRecommend = jSONObject.getBooleanValue("hasCartRecommend");
        this.bundleItem = jSONObject.getBooleanValue("bundleItem");
        this.nABundleItem = jSONObject.getBooleanValue("nabundleItem");
        this.renovation = jSONObject.getBooleanValue("renovation");
        this.needOpenGradient = jSONObject.getBooleanValue("openGradient");
        this.showSubTitle = jSONObject.getBooleanValue("showSubTitle");
        this.isDonateItem = jSONObject.getBooleanValue("isDonateItem");
        this.shareGroup = jSONObject.getBooleanValue("shareGroup");
        this.customItem = jSONObject.getBooleanValue("customItem");
        this.isXinxuan = jSONObject.getBooleanValue("isXinxuan");
        this.needVideoFlow = jSONObject.getBooleanValue("needVideoFlow");
        this.newAddress = jSONObject.getBooleanValue("newAddress");
        this.isDamai = jSONObject.getBooleanValue("isDamai");
        this.hasSeat = jSONObject.getBooleanValue("hasSeat");
        this.isCloudShopItem = jSONObject.getBooleanValue("isCloudShopItem");
        this.showSkuThumbnail = jSONObject.getBooleanValue("showSkuThumbnail");
        this.showSkuInGalleryView = jSONObject.getBooleanValue("showSkuProRate");
        this.useReplenishmentRemind = jSONObject.getBooleanValue("buhuo");
        this.series = jSONObject.getBooleanValue("series");
        this.showLiteAppRec = jSONObject.getBooleanValue("showLiteAppRec");
        tpc.a("com.taobao.android.detail.sdk.model.node.FeatureNode");
    }
}
