package com.alipay.android.msp.framework.hardwarepay.old.base;

import android.content.Context;

/* loaded from: classes3.dex */
public interface IHardwarePay {
    void cancel();

    String createRequestJson(int i, int i2, String str);

    void execute(Context context, int i, Object... objArr);

    void init(Context context, int i, Object... objArr);
}
