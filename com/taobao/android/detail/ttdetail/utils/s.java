package com.taobao.android.detail.ttdetail.utils;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public class s {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long ACCURACY = 10000;

    static {
        kge.a(-1447640016);
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        try {
            return a(Long.parseLong(str));
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a8219760", new Object[]{new Long(j)})).booleanValue();
        }
        if (j <= 0) {
            return false;
        }
        if (j >= 10000) {
            return true;
        }
        return Math.abs(Long.parseLong(ao.a())) % 10000 <= j;
    }
}
