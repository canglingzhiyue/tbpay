package com.taobao.android.tbuprofen.plugin;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public abstract class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-849714472);
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        }
    }

    public void a(String str, int i, StackTraceElement[] stackTraceElementArr, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26eac75c", new Object[]{this, str, new Integer(i), stackTraceElementArr, str2});
        }
    }

    public void a(String str, String str2, String str3, long j, StackTraceElement[] stackTraceElementArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b315f37f", new Object[]{this, str, str2, str3, new Long(j), stackTraceElementArr});
        }
    }

    public void a(Throwable th, StackTraceElement stackTraceElement, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2e26f53", new Object[]{this, th, stackTraceElement, str});
        }
    }
}
