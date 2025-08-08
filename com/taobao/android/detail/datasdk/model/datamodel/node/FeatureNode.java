package com.taobao.android.detail.datasdk.model.datamodel.node;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.aqd;
import tb.dwy;
import tb.emu;
import tb.epv;
import tb.fgo;
import tb.fky;
import tb.jqm;
import tb.kge;

/* loaded from: classes4.dex */
public class FeatureNode extends DetailNode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "feature";
    public boolean UTABForceNewSku;
    public boolean abNewDetailRoute;
    public Boolean abNewDetailRouteBoolean;
    public boolean abNewDetailWhiteMode;
    public boolean abNewMainPicVideoMemPlay;
    public boolean allChannelNewDetailRoute;
    public Boolean allChannelNewDetailRouteBoolean;
    public boolean asyncLoadSearchInfo;
    public boolean autoShowCouponFloatPage;
    public boolean biz_degrade;
    public boolean bundleItem;
    public boolean creditBuy;
    public boolean customItem;
    public boolean customSkuImage;
    public boolean enableNewMainPic;
    public boolean enableNewSku;
    public final boolean enablePadLayout;
    private final boolean enabledDetail3Tab;
    public boolean forbiddenShowCouponFloatPage;
    public boolean forceNaviAlpha;
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
    public boolean hidePromotion;
    public boolean hideShopDsr;
    public boolean hideWangwang;
    public boolean immersiveAuraAnchor;
    public boolean industryDynamicLayout;
    public boolean industryMainPic;
    public boolean industryNaviTabLayout;
    public final boolean insideNewHeight;
    public boolean isCloudShopItem;
    public boolean isDamai;
    public final boolean isDetail3;
    public final boolean isDetail3HeaderPic;
    public boolean isDonateItem;
    public boolean isMakeUp;
    public boolean isTmallGlobal;
    public boolean isXinxuan;
    public boolean lightOffTrans;
    public boolean maoChaoCPU;
    public boolean nABundleItem;
    public boolean needOpenGradient;
    public boolean needVideoFlow;
    public boolean newAddress;
    public boolean newIndicator;
    public boolean newbuyShowSku;
    public final boolean oneProductMM;
    public final boolean oneProductMMDegrade;
    public boolean ontimePromise;
    public boolean openAddOnTools;
    public boolean openDetailAndNewBuy;
    public boolean promotion2019;
    public boolean renovation;
    public boolean secKill;
    public boolean series;
    public boolean shareGroup;
    public boolean showLiteAppRec;
    public boolean showSku;
    public boolean showSkuInGalleryView;
    public boolean showSkuThumbnail;
    public boolean showSubTitle;
    public boolean smAcitonAfterPurchase;
    public boolean switchToOldApp;
    public boolean useReplenishmentRemind;
    public boolean wlDescReformed;

    static {
        kge.a(-205159157);
    }

    public FeatureNode(JSONObject jSONObject) {
        super(jSONObject);
        this.showSkuInGalleryView = false;
        this.useReplenishmentRemind = false;
        this.biz_degrade = false;
        this.openAddOnTools = true;
        this.smAcitonAfterPurchase = false;
        this.series = false;
        this.hasSku = jSONObject.getBooleanValue("hasSku");
        this.showSku = jSONObject.getBooleanValue("showSku");
        this.ontimePromise = jSONObject.getBooleanValue("ontimePromise");
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
        this.bundleItem = false;
        this.nABundleItem = false;
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
        this.useReplenishmentRemind = jSONObject.getBooleanValue("buhuo");
        this.showSkuInGalleryView = jSONObject.getBooleanValue("showSkuProRate");
        this.biz_degrade = jSONObject.getBooleanValue("biz_degrade");
        this.series = jSONObject.getBooleanValue("series");
        this.showLiteAppRec = jSONObject.getBooleanValue("showLiteAppRec");
        this.openAddOnTools = jSONObject.getBooleanValue("openAddOnTools");
        this.smAcitonAfterPurchase = jSONObject.getBooleanValue("smAcitonAfterPurchase");
        this.creditBuy = jSONObject.getBooleanValue("creditBuy");
        this.isTmallGlobal = jSONObject.getBooleanValue("tmallHKDirectSaleDetail");
        this.promotion2019 = jSONObject.getBooleanValue("promotion2019");
        this.newIndicator = jSONObject.getBooleanValue("newIndicator");
        this.enableNewSku = jSONObject.getBooleanValue("openNewSku");
        this.maoChaoCPU = jSONObject.getBooleanValue("seriesFlag");
        this.UTABForceNewSku = jSONObject.getBooleanValue("UTABForceNewSku");
        this.hidePromotion = jSONObject.getBooleanValue("hidePromotion");
        this.customSkuImage = jSONObject.getBooleanValue("customSkuImage");
        this.enableNewMainPic = getEnableNewMainPicValue(jSONObject);
        this.forceNaviAlpha = jSONObject.getBooleanValue("forceNaviAlpha");
        this.abNewDetailRoute = jSONObject.getBooleanValue(fky.SP_KEY_AB_NEW_DETAIL_ROUTE);
        this.allChannelNewDetailRoute = jSONObject.getBooleanValue(fky.SP_KEY_ALL_CHANNEL_NEW_DETAIL_ROUTE);
        this.abNewDetailRouteBoolean = jSONObject.getBoolean(fky.SP_KEY_AB_NEW_DETAIL_ROUTE);
        this.allChannelNewDetailRouteBoolean = jSONObject.getBoolean(fky.SP_KEY_ALL_CHANNEL_NEW_DETAIL_ROUTE);
        this.abNewDetailWhiteMode = jSONObject.getBooleanValue("abNewDetailWhiteMode");
        this.abNewMainPicVideoMemPlay = jSONObject.getBooleanValue("abNewMainPicVideoMemPlay");
        this.autoShowCouponFloatPage = jSONObject.getBooleanValue("autoShowCouponFloatPage");
        this.forbiddenShowCouponFloatPage = jSONObject.getBooleanValue("forbiddenShowCouponFloatPage");
        this.openDetailAndNewBuy = jSONObject.getBooleanValue("openDetailAndNewBuy");
        this.immersiveAuraAnchor = jSONObject.getBooleanValue("immersiveAuraAnchor");
        this.newbuyShowSku = jSONObject.getBooleanValue("newbuyShowSku");
        this.industryDynamicLayout = jSONObject.getBooleanValue("industryDynamicLayout");
        this.asyncLoadSearchInfo = jSONObject.getBooleanValue("asyncLoadSearchInfo");
        this.industryNaviTabLayout = jSONObject.getBooleanValue("industryNaviTabLayout");
        this.industryMainPic = jSONObject.getBooleanValue("industryMainPic");
        this.lightOffTrans = jSONObject.getBooleanValue("blackPageUpgrade");
        this.oneProductMM = jSONObject.getBooleanValue("oneProductMM");
        this.oneProductMMDegrade = jSONObject.getBooleanValue("oneProductMMDegrade");
        this.isDetail3HeaderPic = jSONObject.getBooleanValue("detail3HeadPic");
        this.isDetail3 = jSONObject.getBooleanValue(dwy.KEY_DETAIL);
        this.enablePadLayout = jSONObject.getBooleanValue("enablePadLayout");
        this.enabledDetail3Tab = jSONObject.getBooleanValue("enabledDetail3Tab");
        this.insideNewHeight = jSONObject.getBooleanValue("insideNewHeight");
        emu.a("com.taobao.android.detail.datasdk.model.datamodel.node.FeatureNode");
    }

    private boolean getEnableNewMainPicValue(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8aad64c6", new Object[]{this, jSONObject})).booleanValue();
        }
        if (jSONObject.containsKey(fgo.ENABLE_NEW_MAIN_PIC)) {
            return jSONObject.getBooleanValue(fgo.ENABLE_NEW_MAIN_PIC);
        }
        return epv.h;
    }

    public boolean isEnabledDetail3Tab() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8daa43d5", new Object[]{this})).booleanValue();
        }
        if (!jqm.a()) {
            return this.enabledDetail3Tab;
        }
        return this.enabledDetail3Tab || StringUtils.equals(aqd.a("debug.tb.detail.newnav"), "1");
    }
}
