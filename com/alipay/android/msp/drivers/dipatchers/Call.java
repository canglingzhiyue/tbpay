package com.alipay.android.msp.drivers.dipatchers;

import com.alipay.android.msp.drivers.actions.Action;

/* loaded from: classes3.dex */
public interface Call {

    /* loaded from: classes3.dex */
    public interface Factory {
        Call newCall(Action action);
    }

    void enqueue(Callback callback);

    MspResponse execute();

    Action getAction();
}
