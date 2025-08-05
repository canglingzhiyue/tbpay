package com.taobao.accs;

import com.taobao.aranger.annotation.type.Callback;
import com.taobao.aranger.exception.IPCException;

@Callback
/* loaded from: classes.dex */
public interface IAppReceiverV1 extends IAppReceiver {
    void onBindApp(int i, String str) throws IPCException;
}
