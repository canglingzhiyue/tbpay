package com.alipay.sdk.m.b;

import com.huawei.hms.support.api.entity.core.JosStatusCodes;

/* loaded from: classes3.dex */
public enum b {
    SUCCEEDED(9000, "处理成功"),
    FAILED(4000, "系统繁忙，请稍后再试"),
    CANCELED(6001, "用户取消"),
    NETWORK_ERROR(6002, "网络连接异常"),
    ACTIVITY_NOT_START_EXIT(6007, "支付未完成"),
    PARAMS_ERROR(4001, "参数错误"),
    DOUBLE_REQUEST(5000, "重复请求"),
    PAY_WAITTING(JosStatusCodes.RTN_CODE_COMMON_ERROR, "支付结果确认中");
    

    /* renamed from: a  reason: collision with root package name */
    private int f6153a;
    private String b;

    b(int i, String str) {
        this.f6153a = i;
        this.b = str;
    }

    public static b a(int i) {
        return i != 4001 ? i != 5000 ? i != 8000 ? i != 9000 ? i != 6001 ? i != 6002 ? FAILED : NETWORK_ERROR : CANCELED : SUCCEEDED : PAY_WAITTING : DOUBLE_REQUEST : PARAMS_ERROR;
    }

    public String a() {
        return this.b;
    }

    public void a(String str) {
        this.b = str;
    }

    public int b() {
        return this.f6153a;
    }

    public void b(int i) {
        this.f6153a = i;
    }
}
