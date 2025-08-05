package com.taobao.accs.asp;

import com.taobao.aranger.annotation.method.AutoRecover;
import com.taobao.aranger.annotation.type.ServiceName;
import com.taobao.aranger.exception.IPCException;

@ServiceName("com.taobao.accs.asp.PrefsIPCChannel")
/* loaded from: classes.dex */
public interface IPrefsChannel {
    @AutoRecover
    void commitToDiskRemote(ModifiedRecord modifiedRecord) throws IPCException;

    void registerDataListenerRemote(String str, OnDataUpdateListener onDataUpdateListener) throws IPCException;
}
