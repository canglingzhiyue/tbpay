package com.ut.mini.exposure;

import com.android.alibaba.ip.runtime.IpChange;
import tb.apr;
import tb.kge;

/* loaded from: classes.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f24109a;

    static {
        kge.a(72586619);
        f24109a = false;
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else if (!f24109a) {
        } else {
            apr.c();
        }
    }

    public static void a(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82c81dbf", new Object[]{str, objArr});
        } else if (!f24109a) {
        } else {
            apr.b(str, objArr);
        }
    }

    public static void b(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a2d52de", new Object[]{str, objArr});
        } else if (!f24109a) {
        } else {
            apr.c(str, objArr);
        }
    }

    public static void a(String str, Throwable th, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4328134e", new Object[]{str, th, objArr});
        } else if (!f24109a) {
        } else {
            apr.b(str, th, objArr);
        }
    }
}
