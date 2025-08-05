package com.taobao.tao.shop.rule.mtop;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes8.dex */
public class MtopTaobaoWirelessShopRouteProcessRequest implements IMTOPDataObject {
    private String API_NAME = "mtop.taobao.wireless.shop.route.process";
    private String VERSION = "1.0";
    private boolean NEED_ECODE = false;
    private boolean NEED_SESSION = true;
    private String sellerNick = null;
    private long sellerId = 0;
    private String matchedRuleSetName = null;
    private long shopId = 0;
    private String shopURL = null;
    private boolean miniappDowngrade = false;
    private boolean accessibility_downgrade = false;
    private String extParams = null;

    static {
        kge.a(-1432634318);
        kge.a(-350052935);
    }

    public void setExtParams(String str) {
        this.extParams = str;
    }

    public String getExtParams() {
        return this.extParams;
    }

    public void setAccessibility_downgrade(boolean z) {
        this.accessibility_downgrade = z;
    }

    public boolean isAccessibility_downgrade() {
        return this.accessibility_downgrade;
    }

    public boolean isMiniappDowngrade() {
        return this.miniappDowngrade;
    }

    public void setMiniappDowngrade(boolean z) {
        this.miniappDowngrade = z;
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

    public String getSellerNick() {
        return this.sellerNick;
    }

    public void setSellerNick(String str) {
        this.sellerNick = str;
    }

    public long getSellerId() {
        return this.sellerId;
    }

    public void setSellerId(long j) {
        this.sellerId = j;
    }

    public String getMatchedRuleSetName() {
        return this.matchedRuleSetName;
    }

    public void setMatchedRuleSetName(String str) {
        this.matchedRuleSetName = str;
    }

    public long getShopId() {
        return this.shopId;
    }

    public void setShopId(long j) {
        this.shopId = j;
    }

    public String getShopURL() {
        return this.shopURL;
    }

    public void setShopURL(String str) {
        this.shopURL = str;
    }
}
