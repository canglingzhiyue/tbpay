package com.alipay.android.msp.plugin.engine;

import android.app.Activity;

/* loaded from: classes3.dex */
public interface IOcrEngine {
    void finishOCRView();

    String startOCR(Activity activity, String str, int i);

    void stopOCR(String str);

    boolean supportOCR();
}
