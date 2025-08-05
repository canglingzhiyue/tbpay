package com.alibaba.ut.abtest.push;

import com.alibaba.ut.abtest.internal.util.h;
import com.alibaba.ut.abtest.internal.util.p;
import com.android.alibaba.ip.runtime.IpChange;
import tb.cex;
import tb.kaw;

/* loaded from: classes3.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static b f4215a;

    private b() {
    }

    public static b a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("29bf2423", new Object[0]);
        }
        if (f4215a == null) {
            synchronized (b.class) {
                if (f4215a == null) {
                    f4215a = new b();
                }
            }
        }
        return f4215a;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        try {
            kaw.a().a(cex.a().c());
            com.alibaba.ut.abtest.internal.util.b.c();
        } catch (Throwable th) {
            h.c("ABAugeService", th.getMessage(), th);
        }
    }

    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        try {
            long nanoTime = System.nanoTime();
            boolean a2 = kaw.a().a("YiXiu", str, "dT1hbnQ");
            long nanoTime2 = System.nanoTime();
            com.alibaba.ut.abtest.internal.util.b.a(str, a2);
            com.alibaba.ut.abtest.internal.util.b.a(str, nanoTime2 - nanoTime);
            if (a2) {
                com.alibaba.ut.abtest.internal.util.b.b(com.alibaba.ut.abtest.internal.util.b.CROWD_EFFECTIVE_COUNTER, str);
            }
            com.alibaba.ut.abtest.internal.util.b.b(com.alibaba.ut.abtest.internal.util.b.CROWD_INVOKE_COUNTER, str);
            return a2;
        } catch (Throwable th) {
            h.c("ABAugeService", "isCrowd judge fail", th);
            return false;
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        try {
            h.f("ABAugeService", "【人群数据】取消更新人群数据。");
            p.a(1001);
        } catch (Throwable th) {
            h.c("ABAugeService", th.getMessage(), th);
        }
    }
}
