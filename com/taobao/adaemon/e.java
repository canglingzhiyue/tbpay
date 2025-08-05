package com.taobao.adaemon;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kar;
import tb.kge;

/* loaded from: classes.dex */
public class e extends kar {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final e f8339a;

    @Override // tb.kar
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "__adaemon";
    }

    static {
        kge.a(-1175550019);
        f8339a = new e();
    }

    public static void a(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5cd3435", new Object[]{str, str2, objArr});
        } else {
            f8339a.c(str, str2, objArr);
        }
    }

    public static void b(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbd0ff94", new Object[]{str, str2, objArr});
        } else {
            f8339a.d(str, str2, objArr);
        }
    }

    public static void a(String str, String str2, Throwable th, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4f0c298", new Object[]{str, str2, th, objArr});
        } else {
            f8339a.b(str, str2, th, objArr);
        }
    }
}
