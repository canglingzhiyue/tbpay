package com.alipay.android.msp.utils;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.alipay.android.msp.pay.results.H5PayResult;

/* loaded from: classes3.dex */
public class CusResultReceiver extends ResultReceiver {
    private final H5PayResult mH5PayResult;

    public CusResultReceiver(Handler handler, H5PayResult h5PayResult) {
        super(handler);
        this.mH5PayResult = h5PayResult;
    }

    @Override // android.os.ResultReceiver
    protected void onReceiveResult(int i, Bundle bundle) {
        H5PayResult.fromBundle(bundle, this.mH5PayResult);
        synchronized (this.mH5PayResult) {
            this.mH5PayResult.notify();
        }
    }
}
