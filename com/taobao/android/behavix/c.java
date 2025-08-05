package com.taobao.android.behavix;

import android.view.View;

/* loaded from: classes.dex */
public interface c {
    void commitEnter(String str, String str2, Object obj, String... strArr);

    void commitLeave(String str, String str2, Object obj, String... strArr);

    void commitLeave(String str, String str2, String str3, Object obj, String... strArr);

    void commitRequest(String str, String str2, String str3, String... strArr);

    @Deprecated
    void commitTap(String str, String str2, String str3, String str4, String... strArr);

    void trackAppear(String str, String str2, String str3, View view, String... strArr);

    void trackDisAppear(String str, String str2, String str3, View view, String... strArr);

    void trackScrollEnd(String str, String str2, int i, int i2, String... strArr);

    void trackScrollStart(String str, String str2, int i, int i2, String... strArr);
}
