package com.taobao.wireless.trade.mcart.sdk.co.mtop;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes9.dex */
public class MtopTradeAddBagRequest implements IMTOPDataObject {
    protected String cartFrom;
    private String exParams;
    private String feature;
    private String itemId;
    private long quantity;
    private String skuId;
    private String API_NAME = "mtop.trade.addBag";
    private String VERSION = "3.1";
    private boolean NEED_ECODE = true;
    private boolean NEED_SESSION = true;

    static {
        kge.a(1545734896);
        kge.a(-350052935);
    }

    public String getCartFrom() {
        return this.cartFrom;
    }

    public void setCartFrom(String str) {
        this.cartFrom = str;
    }

    public String getItemId() {
        return this.itemId;
    }

    public void setItemId(String str) {
        this.itemId = str;
    }

    public String getSkuId() {
        return this.skuId;
    }

    public void setSkuId(String str) {
        this.skuId = str;
    }

    public long getQuantity() {
        return this.quantity;
    }

    public void setQuantity(long j) {
        this.quantity = j;
    }

    public String getExParams() {
        return this.exParams;
    }

    public void setExParams(String str) {
        this.exParams = str;
    }

    public String getFeature() {
        return this.feature;
    }

    public void setFeature(String str) {
        this.feature = str;
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
        return "MtopTradeAddBagRequest{API_NAME='" + this.API_NAME + "', VERSION='" + this.VERSION + "', NEED_ECODE=" + this.NEED_ECODE + ", NEED_SESSION=" + this.NEED_SESSION + ", feature='" + this.feature + "', itemId='" + this.itemId + "', skuId='" + this.skuId + "', quantity=" + this.quantity + ", exParams='" + this.exParams + "', cartFrom='" + this.cartFrom + "'}";
    }
}
