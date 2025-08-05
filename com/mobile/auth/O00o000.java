package com.mobile.auth;

import com.alipay.android.msp.utils.ExceptionUtils;

/* loaded from: classes4.dex */
public class O00o000 {
    private int O000000o;
    private String O00000Oo;

    private O00o000(int i, String str) {
        this.O000000o = i;
        this.O00000Oo = str;
    }

    public static O00o000 O000000o(int i) {
        switch (i) {
            case 102102:
                return new O00o000(102102, "网络异常");
            case 102223:
                return new O00o000(102223, ExceptionUtils.ERROR_MSG_DATA_ERROR);
            case 102508:
                return new O00o000(102508, "数据网络切换失败");
            case 200025:
                return new O00o000(200025, "登录超时");
            case 200039:
                return new O00o000(200039, "电信取号接口失败");
            case 200050:
                return new O00o000(200050, "EOF异常");
            default:
                return new O00o000(i, "网络异常");
        }
    }

    public int O000000o() {
        return this.O000000o;
    }

    public String O00000Oo() {
        return this.O00000Oo;
    }
}
