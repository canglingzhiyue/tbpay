package com.unionpay;

import android.os.Bundle;
import android.os.Handler;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public final class d implements com.huawei.nfc.sdk.service.d {
    @Override // com.huawei.nfc.sdk.service.d
    public final void a(int i, Bundle bundle) {
        Handler handler;
        Handler handler2;
        Handler handler3;
        Handler.Callback callback;
        handler = a.W;
        if (handler == null) {
            callback = a.ac;
            Handler unused = a.W = new Handler(callback);
        }
        handler2 = a.W;
        handler3 = a.W;
        handler2.sendMessage(handler3.obtainMessage(1003, Integer.valueOf(i)));
    }
}
