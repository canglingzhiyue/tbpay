package com.taobao.adaemon;

import com.taobao.aranger.annotation.type.Callback;
import com.taobao.aranger.exception.IPCException;

@Callback
/* loaded from: classes.dex */
public interface IRemoteProcessHandler {
    boolean clearActivityStack() throws IPCException;

    long getLiveTime() throws IPCException;

    String getMainProcCpuCost() throws IPCException;

    boolean isBgFromHomePage() throws IPCException;

    boolean isProcessLive() throws IPCException;

    boolean isTinyProcess() throws IPCException;

    void tryDumpMainProc(long j, long j2) throws IPCException;
}
