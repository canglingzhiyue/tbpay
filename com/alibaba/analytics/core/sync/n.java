package com.alibaba.analytics.core.sync;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.aob;
import tb.aor;
import tb.apr;
import tb.kge;

/* loaded from: classes.dex */
public class n extends UploadLog {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static n j;
    private int d = 0;
    private boolean e = false;
    private int f = 0;
    private volatile boolean g = false;
    private List<com.alibaba.analytics.core.model.a> h = new ArrayList();
    private List<com.alibaba.analytics.core.model.a> i = new ArrayList();

    public static /* synthetic */ Object ipc$super(n nVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    static {
        kge.a(-1612665949);
        j = null;
    }

    public static n b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n) ipChange.ipc$dispatch("df5ff17a", new Object[0]);
        }
        if (j == null) {
            synchronized (n.class) {
                if (j == null) {
                    j = new n();
                }
            }
        }
        return j;
    }

    public void a(com.alibaba.analytics.core.model.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3084a2", new Object[]{this, aVar});
            return;
        }
        synchronized (this) {
            if (this.h.size() >= 300) {
                for (int i = 99; i >= 0; i--) {
                    this.h.remove(i);
                }
            }
            this.h.add(aVar);
        }
        q.a().a("r");
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        synchronized (this) {
            this.h.removeAll(this.i);
            this.i.clear();
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        apr.c();
        try {
            if (com.alibaba.analytics.core.config.p.a().c()) {
                return;
            }
            e();
        } catch (Throwable th) {
            apr.b(null, th, new Object[0]);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0064, code lost:
        r4.g = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void e() {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.alibaba.analytics.core.sync.n.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L12
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r3] = r4
            java.lang.String r2 = "5a4ca6c"
            r0.ipc$dispatch(r2, r1)
            return
        L12:
            tb.apr.c()
            tb.aob r0 = tb.aob.a()
            android.content.Context r0 = r0.k()
            boolean r0 = com.alibaba.analytics.core.network.NetworkUtil.a(r0)
            if (r0 != 0) goto L24
            return
        L24:
            com.alibaba.analytics.core.sync.UploadLog$NetworkStatus r0 = com.alibaba.analytics.core.sync.UploadLog.NetworkStatus.ALL
            com.alibaba.analytics.core.sync.UploadLog$NetworkStatus r1 = r4.c
            if (r0 == r1) goto L51
            com.alibaba.analytics.core.sync.UploadLog$NetworkStatus r0 = r4.c
            com.alibaba.analytics.core.sync.UploadLog$NetworkStatus r1 = r4.a()
            if (r0 == r1) goto L51
            r0 = 4
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "current networkstatus"
            r0[r3] = r1
            com.alibaba.analytics.core.sync.UploadLog$NetworkStatus r1 = r4.a()
            r0[r2] = r1
            r1 = 2
            java.lang.String r2 = "mAllowedNetworkStatus"
            r0[r1] = r2
            r1 = 3
            com.alibaba.analytics.core.sync.UploadLog$NetworkStatus r2 = r4.c
            r0[r1] = r2
            java.lang.String r1 = "network not match,return"
            tb.apr.c(r1, r0)
            return
        L51:
            boolean r0 = r4.g
            if (r0 != 0) goto L82
            r4.g = r2
            r0 = 0
        L58:
            int r1 = r4.f2095a     // Catch: java.lang.Throwable -> L75
            if (r0 >= r1) goto L70
            java.util.List<com.alibaba.analytics.core.model.a> r1 = r4.h     // Catch: java.lang.Throwable -> L75
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L75
            if (r1 != 0) goto L67
            r4.g = r3     // Catch: java.lang.Throwable -> L75
            goto L70
        L67:
            boolean r1 = r4.f()     // Catch: java.lang.Throwable -> L75
            if (r1 != 0) goto L70
            int r0 = r0 + 1
            goto L58
        L70:
            r4.g = r3
            return
        L73:
            r0 = move-exception
            goto L7f
        L75:
            r0 = move-exception
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L73
            tb.apr.b(r1, r0, r2)     // Catch: java.lang.Throwable -> L73
            r4.g = r3
            return
        L7f:
            r4.g = r3
            throw r0
        L82:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.analytics.core.sync.n.e():void");
    }

    private boolean f() throws Exception {
        byte[] bArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue();
        }
        apr.c();
        Map<String, String> g = g();
        if (g == null || g.size() == 0) {
            this.g = false;
            return true;
        }
        try {
            bArr = a.a(g);
        } catch (Exception e) {
            apr.b(null, e, new Object[0]);
            bArr = null;
        }
        if (bArr == null) {
            apr.b("", "packRequest is null");
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (l.a()) {
            h c = j.a().c();
            apr.b("UploadLogFromCache", "CreateSession tnet host", c.a(), "port", Integer.valueOf(c.b()), "type", Integer.valueOf(c.c()));
            if (c.c() == 1) {
                aor.a().a(true);
            } else {
                aor.a().a(false);
            }
        }
        b a2 = l.a(bArr);
        boolean a3 = a2.a();
        if (a3) {
            aob.a().c();
            this.e = true;
            this.f = 0;
            d();
            try {
                a(a2.e);
            } catch (Exception e2) {
                apr.b((String) null, e2);
            }
        } else {
            this.f++;
            if (aob.a().d()) {
                return true;
            }
        }
        if (apr.a()) {
            apr.b("", "isSendSuccess", Boolean.valueOf(a3), "cost time", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        }
        try {
            Thread.sleep(100L);
        } catch (Throwable th) {
            apr.c(null, "thread sleep interrupted", th);
        }
        return false;
    }

    private Map<String, String> g() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("7212f323", new Object[]{this});
        }
        if (this.h.size() == 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            this.i.clear();
            int e = com.alibaba.analytics.core.config.p.a().e() * 1000;
            long currentTimeMillis = System.currentTimeMillis();
            i = 0;
            for (int i2 = 0; i2 < this.h.size(); i2++) {
                com.alibaba.analytics.core.model.a aVar = this.h.get(i2);
                if (currentTimeMillis - Long.parseLong(aVar.e) > e) {
                    arrayList.add(aVar);
                } else {
                    this.i.add(aVar);
                    StringBuilder sb = (StringBuilder) hashMap.get("" + aVar.b());
                    if (sb == null) {
                        sb = new StringBuilder();
                        hashMap.put("" + aVar.b(), sb);
                    } else {
                        sb.append((char) 1);
                        i++;
                    }
                    String a2 = this.h.get(i2).a();
                    sb.append(a2);
                    i += a2.length();
                }
            }
            if (!arrayList.isEmpty()) {
                this.h.removeAll(arrayList);
            }
        }
        HashMap hashMap2 = new HashMap();
        this.d = i;
        for (String str : hashMap.keySet()) {
            hashMap2.put(str, ((StringBuilder) hashMap.get(str)).toString());
        }
        if (apr.a()) {
            apr.b("", "mUploadByteSize", Integer.valueOf(this.d), "count", Integer.valueOf(this.i.size()), "timeoutLogs count", Integer.valueOf(arrayList.size()));
        }
        return hashMap2;
    }
}
