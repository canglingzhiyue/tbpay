package com.taobao.adaemon;

import com.taobao.aranger.annotation.method.AutoRecover;
import com.taobao.aranger.annotation.type.ServiceName;
import com.taobao.aranger.exception.IPCException;

@ServiceName("com.taobao.adaemon.ProcessController")
/* loaded from: classes.dex */
public interface IpcChannel {
    void registerProcessToRemote(String str, IRemoteProcessHandler iRemoteProcessHandler) throws IPCException;

    @AutoRecover
    void registerTriggerToRemote(ITrigger iTrigger) throws IPCException;

    void unregisterProcessToRemote(String str) throws IPCException;

    @AutoRecover
    void updateLifecycleToRemote(String str, boolean z, String str2) throws IPCException;

    @AutoRecover
    void updateMemoryEventToRemote(String str, int i) throws IPCException;
}
