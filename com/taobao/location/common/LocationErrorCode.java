package com.taobao.location.common;

import tb.mln;

/* loaded from: classes7.dex */
public enum LocationErrorCode {
    SUCCESS(100, "定位成功"),
    FAIL(201, "定位失败"),
    FAIL_ALL(202, "尝试所有定位失败"),
    FAIL_LOCATION_TIMEOUT(203, "定位服务超时"),
    FAIL_INVALID_OPTION(210, "定位参数OPTION不可为空"),
    FAIL_UNAVALIABLE_SERVICE(211, "绑定服务失败, 服务绑定异常"),
    FAIL_INVALID_LOOPER(212, "回调提供的looper不合法"),
    FAIL_BIND_SERVICE_NO_CONTEXT(mln.ON_FRAGMENT_DESTROYED, "绑定服务失败, context为空"),
    FAIL_BIND_SERVICE_NO_SERVICE_CONNECTION(214, "绑定服务失败, 服务连接为空");
    
    public final int code;
    public final String desc;

    LocationErrorCode(int i, String str) {
        this.code = i;
        this.desc = str;
    }

    public int getCode() {
        return this.code;
    }

    public String getDesc() {
        return this.desc;
    }
}
