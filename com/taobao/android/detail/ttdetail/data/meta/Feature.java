package com.taobao.android.detail.ttdetail.data.meta;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.utils.n;
import tb.dwy;
import tb.kge;

@MappingKey(key = "feature")
/* loaded from: classes4.dex */
public class Feature extends Meta {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final boolean bundleItem;
    private final boolean customItem;
    private final boolean detail3;
    private final boolean detail3EnableSmallWindow;
    private final boolean detail3HeadPic;
    private final boolean detail3SkuPriceLinkage;
    private final boolean detail3VideoAutoPlay;
    private final boolean detail3VideoCompress;
    private final boolean detailNewLightOff;
    private final boolean enableBuyNowTouchDown;
    private final boolean enableNewStructure;
    private final boolean finalUltron;
    private final boolean guessYouLikeNewStyle;
    private final boolean headerPicFlow;
    private final boolean headerPicScrollCycle;
    private final boolean hideMainPicLocator;
    private final boolean industryDynamicLayout;
    private final boolean insideDowngrade;
    private final boolean insideNewHeight;
    private final boolean isDonateItem;
    private final boolean lightoffPageFindSimilar;
    private final boolean newbuyShowSku;
    private final boolean oneProductMM;
    private final boolean oneProductMMDegrade;
    private final boolean openDetailAndAddCartAndBuyNow;
    private final boolean openDetailAndNewBuy;
    private final boolean showSku;
    private final boolean skuSilentAction;
    private final boolean smAcitonAfterPurchase;

    static {
        kge.a(-719757474);
    }

    public Feature(JSONObject jSONObject) {
        super(jSONObject);
        this.finalUltron = jSONObject.getBooleanValue("finalUltron");
        this.bundleItem = jSONObject.getBooleanValue("bundleItem");
        this.detail3 = jSONObject.getBooleanValue(dwy.KEY_DETAIL);
        this.insideDowngrade = jSONObject.getBooleanValue("insideDowngrade");
        this.isDonateItem = jSONObject.getBooleanValue("isDonateItem");
        this.detail3VideoAutoPlay = jSONObject.getBooleanValue("detail3VideoAutoPlay");
        this.showSku = jSONObject.getBooleanValue("showSku");
        this.skuSilentAction = jSONObject.getBooleanValue("skuSilentAction");
        this.detail3HeadPic = jSONObject.getBooleanValue("detail3HeadPic");
        Boolean bool = jSONObject.getBoolean("newbuyShowSku");
        this.newbuyShowSku = bool == null || bool.booleanValue();
        this.detail3VideoCompress = jSONObject.getBooleanValue("detail3VideoCompress");
        this.detail3EnableSmallWindow = jSONObject.getBooleanValue(n.ENABLE_SMALL_WINDOW);
        this.headerPicFlow = jSONObject.getBooleanValue("headerPicFlow");
        this.detailNewLightOff = jSONObject.getBooleanValue("detailNewLightOff");
        this.oneProductMM = jSONObject.getBooleanValue("oneProductMM");
        this.oneProductMMDegrade = jSONObject.getBooleanValue("oneProductMMDegrade");
        this.detail3SkuPriceLinkage = jSONObject.getBooleanValue("detail3SkuPriceLinkage");
        this.enableNewStructure = jSONObject.getBooleanValue("enableNewStructure");
        this.enableBuyNowTouchDown = jSONObject.getBooleanValue("enableBuyNowTouchDown");
        this.openDetailAndNewBuy = jSONObject.getBooleanValue("openDetailAndNewBuy");
        this.openDetailAndAddCartAndBuyNow = jSONObject.getBooleanValue("openDetailAndAddCartAndBuyNow");
        this.industryDynamicLayout = jSONObject.getBooleanValue("industryDynamicLayout");
        this.hideMainPicLocator = jSONObject.getBooleanValue("hideMainPicLocator");
        this.guessYouLikeNewStyle = jSONObject.getBooleanValue("guessYouLikeNewStyle");
        this.insideNewHeight = jSONObject.getBooleanValue("insideNewHeight");
        this.lightoffPageFindSimilar = jSONObject.getBooleanValue("lightoffPageFindSimilar");
        this.headerPicScrollCycle = jSONObject.getBooleanValue("headerPicScrollCycle");
        this.customItem = jSONObject.getBooleanValue("customItem");
        this.smAcitonAfterPurchase = jSONObject.getBooleanValue("smAcitonAfterPurchase");
    }

    public boolean isFinalUltron() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e49efe0b", new Object[]{this})).booleanValue() : this.finalUltron;
    }

    public boolean isBundleItem() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6f12b88a", new Object[]{this})).booleanValue() : this.bundleItem;
    }

    public boolean isDetail3() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2f364203", new Object[]{this})).booleanValue() : this.detail3;
    }

    public boolean isInsideDowngrade() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d014725a", new Object[]{this})).booleanValue() : this.insideDowngrade;
    }

    public boolean isDonateItem() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7f599577", new Object[]{this})).booleanValue() : this.isDonateItem;
    }

    public boolean isDetail3VideoAutoPlay() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b0f32611", new Object[]{this})).booleanValue() : this.detail3VideoAutoPlay;
    }

    public boolean isShowSku() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("43a0dde1", new Object[]{this})).booleanValue() : this.showSku;
    }

    public boolean isDetail3HeadPic() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c065227d", new Object[]{this})).booleanValue() : this.detail3HeadPic;
    }

    public boolean isNewbuyShowSku() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("168d789b", new Object[]{this})).booleanValue() : this.newbuyShowSku;
    }

    public boolean isSkuSilentAction() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f8ecafa9", new Object[]{this})).booleanValue() : this.skuSilentAction;
    }

    public boolean isDetail3VideoCompress() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a13b9c70", new Object[]{this})).booleanValue() : this.detail3VideoCompress;
    }

    public boolean isDetail3EnableSmallWindow() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8ffdaa47", new Object[]{this})).booleanValue() : this.detail3EnableSmallWindow;
    }

    public boolean isHeaderPicFlow() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b11eb18c", new Object[]{this})).booleanValue() : this.headerPicFlow;
    }

    public boolean isDetailNewLightOff() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d892e2a9", new Object[]{this})).booleanValue() : this.detailNewLightOff;
    }

    public boolean isOneProductMM() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("923d305e", new Object[]{this})).booleanValue() : this.oneProductMM;
    }

    public boolean isOneProductMMDegrade() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9e978e2e", new Object[]{this})).booleanValue() : this.oneProductMMDegrade;
    }

    public boolean isDetail3SkuPriceLinkage() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8119ba6c", new Object[]{this})).booleanValue() : this.detail3SkuPriceLinkage;
    }

    public boolean isEnableBuyNowTouchDown() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ee152f6f", new Object[]{this})).booleanValue() : this.enableBuyNowTouchDown;
    }

    public boolean isEnableNewStructure() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("eb2f0c2b", new Object[]{this})).booleanValue() : this.enableNewStructure;
    }

    public boolean isOpenDetailAndNewBuy() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b48fb783", new Object[]{this})).booleanValue() : this.openDetailAndNewBuy;
    }

    public boolean isOpenDetailAndAddCartAndBuyNow() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("fa44dd03", new Object[]{this})).booleanValue() : this.openDetailAndAddCartAndBuyNow;
    }

    public boolean isIndustryDynamicLayout() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f644e00c", new Object[]{this})).booleanValue() : this.industryDynamicLayout;
    }

    public boolean isGuessYouLikeNewStyle() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2e655765", new Object[]{this})).booleanValue() : this.guessYouLikeNewStyle;
    }

    public boolean isHideMainPicLocator() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("136d26fc", new Object[]{this})).booleanValue() : this.hideMainPicLocator;
    }

    public boolean isInsideNewHeight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6f427cc", new Object[]{this})).booleanValue() : this.insideNewHeight;
    }

    public boolean isLightoffPageFindSimilar() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d0ac060b", new Object[]{this})).booleanValue() : this.lightoffPageFindSimilar;
    }

    public boolean isHeaderPicScrollCycle() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e6b713f1", new Object[]{this})).booleanValue() : this.headerPicScrollCycle;
    }

    public boolean isCustomItem() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("44b3b479", new Object[]{this})).booleanValue() : this.customItem;
    }

    public boolean isSmAcitonAfterPurchase() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("20764938", new Object[]{this})).booleanValue() : this.smAcitonAfterPurchase;
    }
}
