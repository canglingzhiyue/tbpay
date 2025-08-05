package com.taobao.accs;

import com.taobao.aranger.annotation.type.Callback;
import com.taobao.aranger.exception.IPCException;

@Callback
/* loaded from: classes.dex */
public interface IHeartBeat {
    void onPingSuccess(String str) throws IPCException;

    void onPingTimeout(String str) throws IPCException;
}
