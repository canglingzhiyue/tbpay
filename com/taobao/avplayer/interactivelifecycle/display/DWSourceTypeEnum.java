package com.taobao.avplayer.interactivelifecycle.display;

/* loaded from: classes6.dex */
public enum DWSourceTypeEnum {
    ITEMCART("item"),
    COUPON("coupon"),
    ALIPAYCOUPON("alipayCoupon"),
    CONTENTTAG("contentTag"),
    CONTENTTAGTRACE("contentTagTrace");
    
    private String value;

    DWSourceTypeEnum(String str) {
        this.value = str;
    }

    public String getValue() {
        return this.value;
    }
}
