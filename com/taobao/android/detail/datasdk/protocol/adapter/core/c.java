package com.taobao.android.detail.datasdk.protocol.adapter.core;

import android.content.Context;
import android.graphics.drawable.Drawable;
import tb.epm;

/* loaded from: classes4.dex */
public interface c extends com.taobao.android.detail.datasdk.protocol.image.c {
    public static final int TYPE_DECORATE_CIRCLE = 1;
    public static final int TYPE_DECORATE_ORIGINAL = 2;

    /* loaded from: classes4.dex */
    public interface a {
        void a(Drawable drawable);
    }

    String a(String str, epm epmVar);

    void a(String str, Context context, int i, a aVar);
}
