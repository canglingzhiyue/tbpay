package com.taobao.search.common.util;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.downgrade.Downgrade;
import com.taobao.downgrade.DowngradeStrategy;
import tb.kge;

/* loaded from: classes7.dex */
public final class n {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final n INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f19040a;
    private static boolean b;

    static {
        kge.a(-1229456216);
        INSTANCE = new n();
    }

    private n() {
    }

    public final boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : a("tbsearch_non_video");
    }

    public final boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : a("tbsearch_non_intelligent_end");
    }

    public final boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : a("tbsearch_dynamic_pic_degraded");
    }

    public final boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : a("tbsearch_fps_perf_v1");
    }

    public final boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue() : f19040a;
    }

    public final boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : b;
    }

    public final void h() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        DowngradeStrategy downgradeStrategy = Downgrade.getInstance().getDowngradeStrategy("search");
        kotlin.jvm.internal.q.a((Object) downgradeStrategy, "downgradeStrategy");
        if (kotlin.jvm.internal.q.a((Object) "degrade", (Object) downgradeStrategy.getTacticsPerformance()) && r.E()) {
            z = true;
        }
        f19040a = z;
        b = kotlin.jvm.internal.q.a((Object) "degrade", (Object) downgradeStrategy.getTacticsPerformance());
    }

    public final boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue();
        }
        DowngradeStrategy downgradeStrategy = Downgrade.getInstance().getDowngradeStrategy("search");
        kotlin.jvm.internal.q.a((Object) downgradeStrategy, "downgradeStrategy");
        return !kotlin.jvm.internal.q.a((Object) "degrade", (Object) downgradeStrategy.getTacticsPerformance()) || !d();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0028, code lost:
        if (com.taobao.android.searchbaseframe.chitu.c.b(r5, com.taobao.search.sf.j.f19452a) != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean a(java.lang.String r5) {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.search.common.util.n.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L1c
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r4
            r1[r3] = r5
            java.lang.String r5 = "f3a64c36"
            java.lang.Object r5 = r0.ipc$dispatch(r5, r1)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            return r5
        L1c:
            boolean r0 = com.taobao.search.common.util.c.a()
            if (r0 == 0) goto L2b
            tb.imn r0 = com.taobao.search.sf.j.f19452a     // Catch: java.lang.Exception -> L2a
            boolean r0 = com.taobao.android.searchbaseframe.chitu.c.b(r5, r0)     // Catch: java.lang.Exception -> L2a
            if (r0 == 0) goto L2b
        L2a:
            return r3
        L2b:
            boolean r5 = com.taobao.search.common.util.r.c(r5)
            if (r5 == 0) goto L32
            return r2
        L32:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.search.common.util.n.a(java.lang.String):boolean");
    }
}
