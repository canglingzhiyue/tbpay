package com.taobao.android.interactive_common;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes5.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static long f12928a;

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
            return;
        }
        String str2 = str + " " + (System.currentTimeMillis() - f12928a);
    }
}
