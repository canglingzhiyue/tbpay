package com.alibaba.appmonitor.pool;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static a b;

    /* renamed from: a  reason: collision with root package name */
    private Map<Class<? extends b>, c<? extends b>> f2890a = new HashMap();

    static {
        kge.a(574680482);
        kge.a(2120484231);
        b = new a();
    }

    public static a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("1abf7996", new Object[0]) : b;
    }

    private a() {
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public <T extends com.alibaba.appmonitor.pool.b> T a(java.lang.Class<T> r2, java.lang.Object... r3) {
        /*
            r1 = this;
            com.alibaba.appmonitor.pool.c r0 = r1.a(r2)
            com.alibaba.appmonitor.pool.b r0 = r0.a()
            if (r0 != 0) goto L11
            java.lang.Object r2 = r2.newInstance()     // Catch: java.lang.Exception -> L11
            com.alibaba.appmonitor.pool.b r2 = (com.alibaba.appmonitor.pool.b) r2     // Catch: java.lang.Exception -> L11
            goto L12
        L11:
            r2 = r0
        L12:
            if (r2 == 0) goto L17
            r2.fill(r3)
        L17:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.appmonitor.pool.a.a(java.lang.Class, java.lang.Object[]):com.alibaba.appmonitor.pool.b");
    }

    public <T extends b> void a(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4abdb735", new Object[]{this, t});
        } else if (t == null) {
        } else {
            a(t.getClass()).a(t);
        }
    }

    private synchronized <T extends b> c<T> a(Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("4bf95881", new Object[]{this, cls});
        }
        c<T> cVar = (c<T>) this.f2890a.get(cls);
        if (cVar == null) {
            cVar = new c<>();
            this.f2890a.put(cls, cVar);
        }
        return cVar;
    }
}
