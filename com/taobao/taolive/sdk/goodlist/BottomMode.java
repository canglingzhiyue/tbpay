package com.taobao.taolive.sdk.goodlist;

/* loaded from: classes8.dex */
public enum BottomMode {
    ADDCART("ADDCART"),
    BUYNOW("BUYNOW"),
    CONFIRM("CONFIRM"),
    ADDCART_AND_BUYNOW("ADDCART_AND_BUYNOW");
    
    private String mValue;

    BottomMode(String str) {
        this.mValue = str;
    }

    public static BottomMode getBottomMode(String str) {
        if (ADDCART.mValue.equalsIgnoreCase(str)) {
            return ADDCART;
        }
        if (BUYNOW.mValue.equalsIgnoreCase(str)) {
            return BUYNOW;
        }
        if (CONFIRM.mValue.equalsIgnoreCase(str)) {
            return CONFIRM;
        }
        if (!ADDCART_AND_BUYNOW.mValue.equalsIgnoreCase(str)) {
            return null;
        }
        return ADDCART_AND_BUYNOW;
    }

    public String getValue() {
        return this.mValue;
    }
}
