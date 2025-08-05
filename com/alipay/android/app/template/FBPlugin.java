package com.alipay.android.app.template;

import android.content.Context;
import android.view.View;

/* loaded from: classes3.dex */
public interface FBPlugin {
    View createView(Context context);

    String getEncryptValue();

    boolean onLoadFinish();

    void setNode(long j);

    boolean setRect(float f, float f2, float f3, float f4);

    boolean updateAttr(String str, String str2);

    boolean updateCSS(String str, String str2);

    boolean updateEvent(String str, String str2);

    boolean updateFunc(String str, String str2);
}
