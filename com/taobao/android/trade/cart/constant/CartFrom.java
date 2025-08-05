package com.taobao.android.trade.cart.constant;

import com.alibaba.android.icart.core.QueryParamsManager;
import tb.jjp;

/* loaded from: classes6.dex */
public enum CartFrom {
    TMALL_CLIENT("tmall_client"),
    JHS_CLIENT("jhs_client"),
    TSM_NATIVE_TAOBAO(QueryParamsManager.TMALL_MARKET_CART_FROM),
    TSM_NATIVE_TAOBAO_CROSS_STORE("tsm_native_taobao$cross_store"),
    TSM_NATIVE_TMALL("tsm_native_tmall"),
    TAOBAO_CLIENT(QueryParamsManager.DEFAULT_CART_FROM),
    TAOBAO_CLIENT_CROSS_STORE("taobao_client$cross_store"),
    YUNOS_HOME_FRIDGE("yunos_home_fridge"),
    DEFAULT_CLIENT("default_client"),
    DEFAULT_CLIENT_CROSS_STORE("default_client$cross_store");
    
    private String value;

    CartFrom(String str) {
        this.value = str;
    }

    public static CartFrom parseCartFrom(String str) {
        CartFrom[] values;
        if (!jjp.a(str)) {
            for (CartFrom cartFrom : values()) {
                if (cartFrom.getValue().equals(str)) {
                    return cartFrom;
                }
            }
        }
        return DEFAULT_CLIENT;
    }

    public String getValue() {
        return this.value;
    }
}
