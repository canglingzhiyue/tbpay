package com.taobao.android.order.bundle.constants;

/* loaded from: classes6.dex */
public enum OrderType {
    ORDERSEARCH("OrderSearch"),
    ORDERFILTER("OrderFilter"),
    ORDERLIST("OrderList");
    
    private String value;

    OrderType(String str) {
        this.value = str;
    }

    public String getValue() {
        return this.value;
    }
}
