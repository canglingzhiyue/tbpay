package com.taobao.adaemon;

import com.taobao.aranger.annotation.type.Callback;
import com.taobao.aranger.exception.IPCException;

@Callback
/* loaded from: classes.dex */
public interface ITrigger {
    public static final String TYPE_SYS_SCHEDULE = "sys_schedule";

    void onTrigger(String str) throws IPCException;
}
