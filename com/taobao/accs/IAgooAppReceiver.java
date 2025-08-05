package com.taobao.accs;

import com.taobao.aranger.annotation.type.Callback;
import com.taobao.aranger.exception.IPCException;

@Callback
/* loaded from: classes.dex */
public interface IAgooAppReceiver extends IAppReceiverV1 {
    String getAppkey() throws IPCException;

    @Override // com.taobao.accs.IAppReceiverV1
    void onBindApp(int i, String str) throws IPCException;
}
