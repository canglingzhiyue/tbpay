package com.uc.webview.internal.interfaces;

import android.webkit.ValueCallback;
import java.util.Set;

/* loaded from: classes9.dex */
public interface IGeolocationPermissions {
    void allow(String str);

    void clear(String str);

    void clearAll();

    void getAllowed(String str, ValueCallback<Boolean> valueCallback);

    void getOrigins(ValueCallback<Set<String>> valueCallback);
}
