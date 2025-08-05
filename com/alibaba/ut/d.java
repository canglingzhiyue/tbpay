package com.alibaba.ut;

import android.content.Context;
import android.webkit.ValueCallback;

/* loaded from: classes3.dex */
public interface d {
    Context a();

    void a(Object obj, String str);

    void a(String str, ValueCallback<String> valueCallback);

    boolean a(Runnable runnable);
}
