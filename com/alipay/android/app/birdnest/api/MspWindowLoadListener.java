package com.alipay.android.app.birdnest.api;

import android.os.Bundle;
import android.view.View;

/* loaded from: classes3.dex */
public interface MspWindowLoadListener {
    void onCloseWindow(View view, Bundle bundle);

    void onWindowLoadFail(int i, Bundle bundle);

    void onWindowLoadSuccess(View view, Bundle bundle);

    void onWindowResize(int i, int i2, Bundle bundle);
}
