package com.taobao.android.tscheduleprotocol;

import java.io.Serializable;

/* loaded from: classes6.dex */
public interface ScheduleCacheCallBack extends Serializable {

    /* loaded from: classes6.dex */
    public enum ScheduleCacheCallBackType {
        SUCCESS,
        FAILED,
        CANCEL,
        EXPIRE,
        FULL
    }

    void onFinish(ScheduleCacheCallBackType scheduleCacheCallBackType, Object obj, Object... objArr);
}
