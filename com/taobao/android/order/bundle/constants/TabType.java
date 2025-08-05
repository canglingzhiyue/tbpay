package com.taobao.android.order.bundle.constants;

/* loaded from: classes6.dex */
public enum TabType {
    ALL("all"),
    WAIT_PAY("waitPay"),
    WAIT_SEND("waitSend"),
    WAIT_CONFIRM("waitConfirm"),
    REFUND("reFund"),
    WAIT_RATE("waitRate");
    
    private String value;

    TabType(String str) {
        this.value = str;
    }

    public String getValue() {
        return this.value;
    }
}
