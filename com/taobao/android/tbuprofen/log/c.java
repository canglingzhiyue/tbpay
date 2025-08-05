package com.taobao.android.tbuprofen.log;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tbuprofen.d;
import tb.kge;

/* loaded from: classes.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static TBPLogLevel f15492a;
    private static d b;

    static {
        kge.a(1853300558);
        f15492a = TBPLogLevel.DEBUG;
        b = new b();
    }

    public static void a(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f392fcc", new Object[]{dVar});
        } else if (dVar == null) {
        } else {
            b = dVar;
            f15492a = dVar.a();
        }
    }

    public static void a(String str, Throwable th, String str2, Object... objArr) {
        d dVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee268404", new Object[]{str, th, str2, objArr});
        } else if (f15492a.ordinal() < TBPLogLevel.ERROR.ordinal() || (dVar = b) == null) {
        } else {
            dVar.a(str, th, str2, objArr);
        }
    }

    public static void a(String str, String str2, Object... objArr) {
        d dVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5cd3435", new Object[]{str, str2, objArr});
        } else if (f15492a.ordinal() < TBPLogLevel.ERROR.ordinal() || (dVar = b) == null) {
        } else {
            dVar.a(str, str2, objArr);
        }
    }

    public static void b(String str, String str2, Object... objArr) {
        d dVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbd0ff94", new Object[]{str, str2, objArr});
        } else if (f15492a.ordinal() < TBPLogLevel.WARNING.ordinal() || (dVar = b) == null) {
        } else {
            dVar.b(str, str2, objArr);
        }
    }

    public static void c(String str, String str2, Object... objArr) {
        d dVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d4caf3", new Object[]{str, str2, objArr});
        } else if (f15492a.ordinal() < TBPLogLevel.INFO.ordinal() || (dVar = b) == null) {
        } else {
            dVar.c(str, str2, objArr);
        }
    }

    public static void d(String str, String str2, Object... objArr) {
        d dVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d89652", new Object[]{str, str2, objArr});
        } else if (f15492a.ordinal() < TBPLogLevel.DEBUG.ordinal() || (dVar = b) == null) {
        } else {
            dVar.d(str, str2, objArr);
        }
    }

    public static void e(String str, String str2, Object... objArr) {
        d dVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddc61b1", new Object[]{str, str2, objArr});
        } else if (f15492a.ordinal() < TBPLogLevel.VERBOSE.ordinal() || (dVar = b) == null) {
        } else {
            dVar.e(str, str2, objArr);
        }
    }
}
