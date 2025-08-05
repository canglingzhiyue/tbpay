package com.unionpay.b;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.unionpay.tsmservice.mi.mini.ITsmCallback;
import com.unionpay.tsmservice.mi.mini.result.QueryVendorPayStatusResult;

/* loaded from: classes9.dex */
public final class j extends ITsmCallback.Stub {

    /* renamed from: a  reason: collision with root package name */
    private int f24021a = 4000;
    private Handler b;

    public j(Handler handler) {
        this.b = handler;
    }

    @Override // com.unionpay.tsmservice.mi.mini.ITsmCallback
    public final void onError(String str, String str2) {
        com.unionpay.utils.j.c("uppay", "errorCode:" + str + ", errorDesc:" + str2);
        Handler handler = this.b;
        int i = this.f24021a;
        handler.sendMessage(Message.obtain(handler, 1, i, 0, str + str2));
    }

    @Override // com.unionpay.tsmservice.mi.mini.ITsmCallback
    public final void onResult(Bundle bundle) {
        if (this.f24021a != 4000) {
            return;
        }
        com.unionpay.utils.j.c("uppay-spay", "query vendor pay status callback");
        bundle.setClassLoader(QueryVendorPayStatusResult.class.getClassLoader());
        Bundle queryVendorPayStatusResult = ((QueryVendorPayStatusResult) bundle.get("result")).getQueryVendorPayStatusResult();
        Handler handler = this.b;
        handler.sendMessage(Message.obtain(handler, 4000, queryVendorPayStatusResult));
    }
}
