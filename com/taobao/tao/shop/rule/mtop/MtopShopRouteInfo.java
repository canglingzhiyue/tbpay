package com.taobao.tao.shop.rule.mtop;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.taobao.themis.kernel.i;
import java.io.Serializable;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes8.dex */
public class MtopShopRouteInfo implements Serializable, IMTOPDataObject {
    private static final String RENDER_STYLE_DX = "DX";
    private static final String RENDER_STYLE_MINIAPP = "MINIAPP_STYLE";
    private static final String RENDER_STYLE_NATIVE = "NATIVE_STYLE";
    private static final String RENDER_STYLE_WEEX = "WEEX_STYLE";
    private String industryShop;
    private String isTmall;
    private String renderStyle;
    private JSONObject routeConfig;
    private String sellerId;
    private String shopId;
    private String shopTargetUrl;
    private JSONArray templateLists;

    static {
        kge.a(1147804940);
        kge.a(-350052935);
        kge.a(1028243835);
    }

    public String getIndustryShop() {
        return this.industryShop;
    }

    public void setIndustryShop(String str) {
        this.industryShop = str;
    }

    public JSONArray getTemplateLists() {
        return this.templateLists;
    }

    public void setTemplateLists(JSONArray jSONArray) {
        this.templateLists = jSONArray;
    }

    public String getRenderStyle() {
        return this.renderStyle;
    }

    public void setRenderStyle(String str) {
        this.renderStyle = str;
    }

    public String getShopTargetUrl() {
        return this.shopTargetUrl;
    }

    public void setShopTargetUrl(String str) {
        this.shopTargetUrl = str;
    }

    public String getSellerId() {
        return this.sellerId;
    }

    public void setSellerId(String str) {
        this.sellerId = str;
    }

    public String getShopId() {
        return this.shopId;
    }

    public void setShopId(String str) {
        this.shopId = str;
    }

    public String getIsTmall() {
        return this.isTmall;
    }

    public void setIsTmall(String str) {
        this.isTmall = str;
    }

    public void setRouteConfig(JSONObject jSONObject) {
        this.routeConfig = jSONObject;
    }

    public JSONObject getRouteConfig() {
        return this.routeConfig;
    }

    public boolean isWeexRenderStyle() {
        return RENDER_STYLE_WEEX.equals(this.renderStyle);
    }

    public boolean isNativeRenderStyle() {
        return RENDER_STYLE_NATIVE.equals(this.renderStyle);
    }

    public boolean isMiniAppRenderStyle() {
        String str = this.shopTargetUrl;
        return RENDER_STYLE_MINIAPP.equals(this.renderStyle) || (str != null ? str.contains(i.APP_ID) : false);
    }

    public boolean isDXRenderStyle() {
        return RENDER_STYLE_DX.equals(this.renderStyle);
    }

    public static boolean isMiniAppRenderStyle(String str) {
        return RENDER_STYLE_MINIAPP.equals(str);
    }
}
