package com.alipay.android.msp.pay.results;

import com.huawei.hms.support.api.entity.core.JosStatusCodes;
import tv.danmaku.ijk.media.player.TaobaoMediaPlayer;

/* loaded from: classes3.dex */
public enum ResultStatus {
    SUCCEEDED(9000, "支付成功"),
    FAILED(4000, "系统繁忙，请稍后再试"),
    PARAMS_ERROR(4001, "参数错误"),
    CANCELED(6001, "支付未完成"),
    NETWORK_ERROR(6002, "网络连接异常"),
    PAY_NETWORK_ERROR(6004, "支付网络连接异常"),
    PAY_IGNORE_CODE(6006, "支付正常退出，业务无需关注结果码"),
    ACTIVITY_NOT_START_EXIT(6007, "支付未完成"),
    PAY_EXCEPTION_CODE(7001, "支付被动退出，业务无需关注结果码"),
    PAY_WAITING(JosStatusCodes.RTN_CODE_COMMON_ERROR, "支付结果确认中"),
    FRONT_CHANNEL_SEL(10000, "前置渠道切换成功"),
    START_ACTIVITY_FAILED(TaobaoMediaPlayer.FFP_PROP_INT64_DISABLE_HLS_DISCON, "外部商户远程启动支付页面失败");
    
    private String memo;
    private int status;

    ResultStatus(int i, String str) {
        this.status = i;
        this.memo = str;
    }

    public static ResultStatus getResultState(int i) {
        return i != 4001 ? i != 6004 ? i != 6006 ? i != 8000 ? i != 9000 ? i != 10000 ? i != 17000 ? i != 6001 ? i != 6002 ? FAILED : NETWORK_ERROR : CANCELED : START_ACTIVITY_FAILED : FRONT_CHANNEL_SEL : SUCCEEDED : PAY_WAITING : PAY_IGNORE_CODE : PAY_NETWORK_ERROR : PARAMS_ERROR;
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
