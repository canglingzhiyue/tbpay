package com.etao.feimagesearch.util;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import tb.com;
import tb.kge;

/* loaded from: classes4.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1499223564);
    }

    public static int a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a821884b", new Object[]{new Float(f)})).intValue();
        }
        Application b = com.b();
        if (b != null) {
            return (int) (f * b.getResources().getDisplayMetrics().density);
        }
        return 0;
    }

    public static float b(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a9d660e7", new Object[]{new Float(f)})).floatValue();
        }
        Application b = com.b();
        if (b != null) {
            return f * b.getResources().getDisplayMetrics().density;
        }
        return 0.0f;
    }
}
