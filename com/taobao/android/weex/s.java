package com.taobao.android.weex;

import android.content.Context;

/* loaded from: classes6.dex */
public interface s {

    /* loaded from: classes6.dex */
    public interface a {
        WeexInstance a(Context context);

        void a();

        void b(WeexEventTarget weexEventTarget, String str, WeexValue weexValue);

        void b(String str, Object obj);
    }

    void a(a aVar);
}
