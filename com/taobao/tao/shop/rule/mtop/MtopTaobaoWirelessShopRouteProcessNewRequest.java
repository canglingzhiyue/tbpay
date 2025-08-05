package com.taobao.tao.shop.rule.mtop;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes8.dex */
public class MtopTaobaoWirelessShopRouteProcessNewRequest implements IMTOPDataObject {
    private String API_NAME = "mtop.taobao.wireless.shop.single.page.get";
    private String VERSION = "1.0";
    private boolean NEED_ECODE = false;
    private boolean NEED_SESSION = true;
    public String sellerId = null;
    public String shopId = null;
    public String pathInfo = null;
    public String pageId = null;

    static {
        kge.a(1134459980);
        kge.a(-350052935);
    }

    public String getAPI_NAME() {
        return this.API_NAME;
    }

    public void setAPI_NAME(String str) {
        this.API_NAME = str;
    }

    public String getVERSION() {
        return this.VERSION;
    }

    public void setVERSION(String str) {
        this.VERSION = str;
    }

    public boolean isNEED_ECODE() {
        return this.NEED_ECODE;
    }

    public void setNEED_ECODE(boolean z) {
        this.NEED_ECODE = z;
    }

    public boolean isNEED_SESSION() {
        return this.NEED_SESSION;
    }

    public void setNEED_SESSION(boolean z) {
        this.NEED_SESSION = z;
    }

    public String toString() {
        return "MtopTaobaoWirelessShopRouteProcessNewRequest{API_NAME='" + this.API_NAME + "', VERSION='" + this.VERSION + "', sellerId='" + this.sellerId + "', shopId='" + this.shopId + "', pathInfo='" + this.pathInfo + "', pageId='" + this.pageId + "'}";
    }
}
