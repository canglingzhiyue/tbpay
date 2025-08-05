package com.taobao.android.weex_uikit.ui;

import com.taobao.android.weex_framework.p;

/* loaded from: classes6.dex */
public interface d {
    void fireNativeEvent(String str, String str2);

    String getNativeState(String str, UINode uINode);

    void registerNativeStateListener(String str, UINode uINode, p.b bVar);

    void unregisterNativeStateListener(String str, UINode uINode, p.b bVar);
}
