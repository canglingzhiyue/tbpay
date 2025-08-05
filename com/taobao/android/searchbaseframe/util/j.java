package com.taobao.android.searchbaseframe.util;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import tb.imo;
import tb.kge;

/* loaded from: classes6.dex */
public class j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(255638979);
    }

    public static int a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a821884b", new Object[]{new Float(f)})).intValue();
        }
        Context c = imo.c();
        if (c != null) {
            return (int) (f * c.getResources().getDisplayMetrics().density);
        }
        return 0;
    }

    public static float b(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a9d660e7", new Object[]{new Float(f)})).floatValue();
        }
        Context c = imo.c();
        if (c != null) {
            return f * c.getResources().getDisplayMetrics().density;
        }
        return 0.0f;
    }

    public static int c(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ab8b3989", new Object[]{new Float(f)})).intValue();
        }
        Context c = imo.c();
        if (c != null) {
            return (int) (f / c.getResources().getDisplayMetrics().density);
        }
        return 0;
    }

    public static float d(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ad401225", new Object[]{new Float(f)})).floatValue();
        }
        Context c = imo.c();
        if (c != null) {
            return f / c.getResources().getDisplayMetrics().density;
        }
        return 0.0f;
    }
}
