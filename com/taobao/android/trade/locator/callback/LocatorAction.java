package com.taobao.android.trade.locator.callback;

/* loaded from: classes6.dex */
public enum LocatorAction {
    LOCATOR("locator"),
    OPEN_URL("url"),
    ACTION("action");
    
    private String desc;

    LocatorAction(String str) {
        this.desc = str;
    }

    public String getDesc() {
        return this.desc;
    }
}
