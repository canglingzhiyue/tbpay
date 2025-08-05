package com.taobao.accs;

import com.taobao.aranger.annotation.type.Callback;
import com.taobao.aranger.exception.IPCException;
import java.util.Map;

@Callback
/* loaded from: classes.dex */
public interface IAppReceiver {
    Map<String, String> getAllServices() throws IPCException;

    String getService(String str) throws IPCException;

    void onBindApp(int i) throws IPCException;

    void onBindUser(String str, int i) throws IPCException;

    void onData(String str, String str2, byte[] bArr) throws IPCException;

    void onSendData(String str, int i) throws IPCException;

    void onUnbindApp(int i) throws IPCException;

    void onUnbindUser(int i) throws IPCException;
}
