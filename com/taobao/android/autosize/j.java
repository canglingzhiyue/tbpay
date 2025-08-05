package com.taobao.android.autosize;

import android.app.Application;
import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import tb.isn;
import tb.itq;
import tb.iuq;

/* loaded from: classes4.dex */
public class j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{application, hashMap});
            return;
        }
        if ((Build.VERSION.SDK_INT > 18 && l.d(application)) || l.b(application)) {
            iuq.a();
            iuq.a(application);
        }
        if (l.d(application)) {
            itq.b();
        }
        isn.a();
        isn.a(application);
    }
}
