package com.taobao.tao.shop.rule.mtop;

import com.alibaba.fastjson.JSONObject;
import com.taobao.themis.kernel.i;
import java.io.Serializable;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes8.dex */
public class MtopTaobaoWirelessShopRouteProcessResponseData implements Serializable, IMTOPDataObject {
    private static final String RENDER_STYLE_DX = "DX";
    private static final String RENDER_STYLE_MINIAPP = "MINIAPP_STYLE";
    private static final String RENDER_STYLE_NATIVE = "NATIVE_STYLE";
    private static final String RENDER_STYLE_WEEX = "WEEX_STYLE";
    private String isTmall;
    private String renderStyle;
    private String sellerId;
    private String shopId;
    private MtopShopRouteInfo shopRouteInfo;
    private JSONObject shopStructure;
    private String shopTargetUrl;

    static {
        kge.a(-265276472);
        kge.a(-350052935);
        kge.a(1028243835);
    }

    public void setShopRouteInfo(MtopShopRouteInfo mtopShopRouteInfo) {
        this.shopRouteInfo = mtopShopRouteInfo;
    }

    public void setShopStructure(JSONObject jSONObject) {
        this.shopStructure = jSONObject;
    }

    public JSONObject getShopStructure() {
        return this.shopStructure;
    }

    public MtopShopRouteInfo getShopRouteInfo() {
        return this.shopRouteInfo;
    }

    public String getRenderStyle() {
        MtopShopRouteInfo shopRouteInfo;
        if (this.renderStyle == null && (shopRouteInfo = getShopRouteInfo()) != null) {
            return shopRouteInfo.getRenderStyle();
        }
        return this.renderStyle;
    }

    public void setRenderStyle(String str) {
        this.renderStyle = str;
        MtopShopRouteInfo shopRouteInfo = getShopRouteInfo();
        if (shopRouteInfo != null) {
            shopRouteInfo.setRenderStyle(str);
        }
    }

    public String getShopTargetUrl() {
        MtopShopRouteInfo shopRouteInfo;
        if (this.shopTargetUrl == null && (shopRouteInfo = getShopRouteInfo()) != null) {
            return shopRouteInfo.getShopTargetUrl();
        }
        return this.shopTargetUrl;
    }

    public void setShopTargetUrl(String str) {
        this.shopTargetUrl = str;
        MtopShopRouteInfo shopRouteInfo = getShopRouteInfo();
        if (shopRouteInfo != null) {
            shopRouteInfo.setShopTargetUrl(str);
        }
    }

    public String getSellerId() {
        MtopShopRouteInfo shopRouteInfo;
        if (this.sellerId == null && (shopRouteInfo = getShopRouteInfo()) != null) {
            return shopRouteInfo.getSellerId();
        }
        return this.sellerId;
    }

    public void setSellerId(String str) {
        this.sellerId = str;
        MtopShopRouteInfo shopRouteInfo = getShopRouteInfo();
        if (shopRouteInfo != null) {
            shopRouteInfo.setSellerId(str);
        }
    }

    public String getShopId() {
        MtopShopRouteInfo shopRouteInfo;
        if (this.shopId == null && (shopRouteInfo = getShopRouteInfo()) != null) {
            return shopRouteInfo.getShopId();
        }
        return this.shopId;
    }

    public void setShopId(String str) {
        this.shopId = str;
        MtopShopRouteInfo shopRouteInfo = getShopRouteInfo();
        if (shopRouteInfo != null) {
            shopRouteInfo.setShopId(str);
        }
    }

    public String getIsTmall() {
        MtopShopRouteInfo shopRouteInfo;
        if (this.isTmall == null && (shopRouteInfo = getShopRouteInfo()) != null) {
            return shopRouteInfo.getIsTmall();
        }
        return this.isTmall;
    }

    public void setIsTmall(String str) {
        this.isTmall = str;
        MtopShopRouteInfo shopRouteInfo = getShopRouteInfo();
        if (shopRouteInfo != null) {
            shopRouteInfo.setIsTmall(str);
        }
    }

    public boolean isWeexRenderStyle() {
        MtopShopRouteInfo shopRouteInfo;
        if (this.renderStyle == null && (shopRouteInfo = getShopRouteInfo()) != null) {
            return RENDER_STYLE_WEEX.equals(shopRouteInfo.getRenderStyle());
        }
        return RENDER_STYLE_WEEX.equals(this.renderStyle);
    }

    public boolean isNativeRenderStyle() {
        MtopShopRouteInfo shopRouteInfo;
        if (this.renderStyle == null && (shopRouteInfo = getShopRouteInfo()) != null) {
            return RENDER_STYLE_NATIVE.equals(shopRouteInfo.getRenderStyle());
        }
        return RENDER_STYLE_NATIVE.equals(this.renderStyle);
    }

    public boolean isMiniAppRenderStyle() {
        boolean contains;
        String shopTargetUrl;
        MtopShopRouteInfo shopRouteInfo = getShopRouteInfo();
        String str = this.shopTargetUrl;
        if (str != null) {
            contains = str.contains(i.APP_ID);
        } else {
            contains = (shopRouteInfo == null || (shopTargetUrl = shopRouteInfo.getShopTargetUrl()) == null) ? false : shopTargetUrl.contains(i.APP_ID);
        }
        return (this.renderStyle != null || shopRouteInfo == null) ? RENDER_STYLE_MINIAPP.equals(this.renderStyle) || contains : RENDER_STYLE_MINIAPP.equals(shopRouteInfo.getRenderStyle()) || contains;
    }

    public boolean isDXRenderStyle() {
        MtopShopRouteInfo shopRouteInfo;
        if (this.renderStyle == null && (shopRouteInfo = getShopRouteInfo()) != null) {
            return shopRouteInfo.isDXRenderStyle();
        }
        return RENDER_STYLE_DX.equals(this.renderStyle);
    }

    public static boolean isDXRenderStyle(String str) {
        return RENDER_STYLE_DX.equals(str);
    }

    public static boolean isMiniAppRenderStyle(String str) {
        return RENDER_STYLE_MINIAPP.equals(str);
    }
}
