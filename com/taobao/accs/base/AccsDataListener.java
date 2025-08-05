package com.taobao.accs.base;

import com.taobao.accs.base.TaoBaseService;
import com.taobao.aranger.annotation.type.Callback;
import com.taobao.aranger.exception.IPCException;

@Callback
/* loaded from: classes.dex */
public interface AccsDataListener {
    void onAntiBrush(boolean z, TaoBaseService.ExtraInfo extraInfo) throws IPCException;

    void onBind(String str, int i, TaoBaseService.ExtraInfo extraInfo) throws IPCException;

    void onConnected(TaoBaseService.ConnectInfo connectInfo) throws IPCException;

    void onData(String str, String str2, String str3, byte[] bArr, TaoBaseService.ExtraInfo extraInfo) throws IPCException;

    void onDisconnected(TaoBaseService.ConnectInfo connectInfo) throws IPCException;

    void onResponse(String str, String str2, int i, byte[] bArr, TaoBaseService.ExtraInfo extraInfo) throws IPCException;

    void onSendData(String str, String str2, int i, TaoBaseService.ExtraInfo extraInfo) throws IPCException;

    void onUnbind(String str, int i, TaoBaseService.ExtraInfo extraInfo) throws IPCException;
}
