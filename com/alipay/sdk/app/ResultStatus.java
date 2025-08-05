package com.alipay.sdk.app;

import com.huawei.hms.support.api.entity.core.JosStatusCodes;

/* loaded from: classes3.dex */
public enum ResultStatus {
    SUCCEEDED(9000, "处理成功"),
    FAILED(4000, "系统繁忙，请稍后再试"),
    CANCELED(6001, "用户取消"),
    NETWORK_ERROR(6002, "网络连接异常"),
    PARAMS_ERROR(4001, "参数错误"),
    DOUBLE_REQUEST(5000, "重复请求"),
    ALIPAY_NOT_INSTALLED(5001, "未安装支付宝"),
    PAY_WAITTING(JosStatusCodes.RTN_CODE_COMMON_ERROR, "支付结果确认中");
    
    private String memo;
    private int status;

    ResultStatus(int i, String str) {
        this.status = i;
        this.memo = str;
    }

    public static ResultStatus getResultState(int i) {
        return i != 4001 ? i != 8000 ? i != 9000 ? i != 5000 ? i != 5001 ? i != 6001 ? i != 6002 ? FAILED : NETWORK_ERROR : CANCELED : ALIPAY_NOT_INSTALLED : DOUBLE_REQUEST : SUCCEEDED : PAY_WAITTING : PARAMS_ERROR;
    }

    public final String getMemo() {
        return this.memo;
    }

    public final int getStatus() {
        return this.status;
    }

    public final void setMemo(String str) {
        this.memo = str;
    }

    public final void setStatus(int i) {
        this.status = i;
    }
}
