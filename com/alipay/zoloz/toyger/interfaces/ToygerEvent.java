package com.alipay.zoloz.toyger.interfaces;

import android.view.KeyEvent;

/* loaded from: classes3.dex */
public interface ToygerEvent {
    void commandFinished();

    boolean onWindowFocusChanged(boolean z);

    boolean ontActivityEvent(int i, KeyEvent keyEvent);
}
