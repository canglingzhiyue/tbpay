package com.taobao.taolive.sdk.goodlist;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes8.dex */
public class q {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SKU_ADD_CART = "5";
    public static final String SKU_ADD_CART_AND_DETAIL = "4";
    public static final String SKU_ADD_CART_WITH_SURE = "1";
    public static final String SKU_BUY = "2";
    public static final String SKU_SURE_AND_DETAIL = "3";

    static {
        kge.a(1813702628);
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        if (StringUtils.equals(BottomMode.ADDCART.getValue(), str)) {
            return "5";
        }
        if (StringUtils.equals(BottomMode.BUYNOW.getValue(), str)) {
            return "2";
        }
        if (StringUtils.equals(BottomMode.ADDCART_AND_BUYNOW.getValue(), str)) {
        }
        return "4";
    }
}
