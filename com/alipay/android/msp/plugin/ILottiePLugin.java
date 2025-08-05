package com.alipay.android.msp.plugin;

import android.content.Context;
import android.view.View;

/* loaded from: classes3.dex */
public interface ILottiePLugin {
    View CreateLottieView(Context context);

    void setAnimation(int i);

    void setAnimation(String str);

    void setAutoplay(boolean z);

    void setLoop(boolean z);

    void startAnimation();

    void stopAnimation();
}
