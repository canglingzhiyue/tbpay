package com.taobao.android.detail.ttdetail.utils;

import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import tb.eyx;
import tb.kge;

/* loaded from: classes5.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1011198084);
    }

    public static void a(eyx eyxVar, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a1e2692", new Object[]{eyxVar, runnable});
        } else if (runnable == null) {
        } else {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                runnable.run();
            } else {
                eyxVar.b().a(runnable);
            }
        }
    }
}
