package com.alibaba.ut.abtest.internal.debug;

import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.q;
import android.text.TextUtils;
import com.alibaba.evo.internal.bucketing.model.ExperimentV5;
import com.alibaba.ut.abtest.internal.bucketing.HighPriorityExperimentStorage;
import com.alibaba.ut.abtest.internal.util.g;
import com.alibaba.ut.abtest.internal.util.h;
import com.alibaba.ut.abtest.internal.util.k;
import com.alibaba.ut.abtest.internal.util.p;
import com.alibaba.ut.abtest.pipeline.Response;
import com.alibaba.ut.abtest.pipeline.accs.EvoAccsService;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.cex;
import tb.cfe;
import tb.kge;
import tb.riy;

/* loaded from: classes.dex */
public class c implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final BlockingQueue<d> f4193a;
    private static final AtomicBoolean b;
    private a c;
    private final Set<Long> d = new HashSet();
    private final Object e = new Object();
    private int f = 5;
    private Map<String, Object> g;

    private String a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9064aa65", new Object[]{this, new Integer(i)}) : i != 5 ? i != 6 ? "release" : "beta" : EvoAccsService.ACCS_BETA_SINGLE;
    }

    public static /* synthetic */ AtomicBoolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("49f1dfa8", new Object[0]) : b;
    }

    public static /* synthetic */ void a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("133bf9b5", new Object[]{cVar});
        } else {
            cVar.c();
        }
    }

    static {
        kge.a(520324515);
        kge.a(2098059491);
        f4193a = new LinkedBlockingQueue();
        b = new AtomicBoolean(false);
    }

    public c() {
        try {
            q.a(DebugWindVanePlugin.API_SERVER_NAME, (Class<? extends e>) DebugWindVanePlugin.class);
            b();
            String a2 = k.b().a("ab_mock_switches", "");
            if (TextUtils.isEmpty(a2)) {
                return;
            }
            this.g = g.a(a2);
        } catch (Throwable th) {
            com.alibaba.ut.abtest.internal.util.b.a("DebugServiceImpl.constructor", th);
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (cex.a().j().v()) {
            String a2 = k.b().a("debug_whitelist", "");
            if (h.a()) {
                h.a("DebugServiceImpl", "【白名单数据】本设备白名单实验分组(缓存)：" + a2);
            }
            if (TextUtils.isEmpty(a2)) {
                return;
            }
            String[] split = a2.split(",");
            try {
                synchronized (this.e) {
                    for (String str : split) {
                        if (!TextUtils.isEmpty(str)) {
                            this.d.add(Long.valueOf(Long.parseLong(str)));
                        }
                    }
                }
            } catch (Exception e) {
                com.alibaba.ut.abtest.internal.util.b.a("DebugServiceImpl.restoreWhitelist", e);
            }
        }
    }

    @Override // com.alibaba.ut.abtest.internal.debug.b
    public void a(int i, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c27e0c3", new Object[]{this, new Integer(i), str, str2, str3, str4});
        } else if (this.c == null) {
        } else {
            try {
                d dVar = new d();
                dVar.a(System.currentTimeMillis());
                dVar.a(str);
                dVar.c(str2);
                StringBuilder sb = new StringBuilder();
                sb.append(riy.ARRAY_START_STR);
                sb.append(i == 0 ? "主" : String.valueOf(i));
                sb.append("进程]");
                sb.append(str4);
                dVar.b(sb.toString());
                f4193a.offer(dVar);
                if (!b.compareAndSet(false, true)) {
                    return;
                }
                p.a(new Runnable() { // from class: com.alibaba.ut.abtest.internal.debug.c.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        try {
                            c.a(c.this);
                        } catch (Exception e) {
                            com.alibaba.ut.abtest.internal.util.b.a("DebugServiceImpl.reportLog", e);
                        }
                        c.a().set(false);
                    }
                });
            } catch (Throwable th) {
                com.alibaba.ut.abtest.internal.util.b.a("DebugServiceImpl.reportLog", th);
            }
        }
    }

    private synchronized void c() {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        try {
            ArrayList arrayList = new ArrayList();
            while (z) {
                d poll = f4193a.poll(2L, TimeUnit.SECONDS);
                if (poll != null) {
                    arrayList.add(poll);
                    if (arrayList.size() > this.f) {
                        a(arrayList);
                        arrayList.clear();
                    }
                } else {
                    z = false;
                }
            }
            if (arrayList.size() > 0) {
                a(arrayList);
            }
        } catch (InterruptedException e) {
            com.alibaba.ut.abtest.internal.util.b.a("DebugServiceImpl.handleLogDataQueue", e);
        }
    }

    private void a(List<d> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            return;
        }
        a aVar = this.c;
        com.alibaba.ut.abtest.pipeline.c a2 = cfe.a(list, aVar == null ? "" : aVar.a());
        Response a3 = cex.a().l().a(a2);
        if (a3 == null) {
            h.c("DebugServiceImpl", "Response is null, request=" + a2);
        } else if (a3.isSuccess()) {
        } else {
            h.c("DebugServiceImpl", "Response is failure, code=" + a3.getCode() + ", message=" + a3.getMessage() + ", httpCode=" + a3.getHttpResponseCode() + ", request=" + a2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x015b  */
    @Override // com.alibaba.ut.abtest.internal.debug.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(com.alibaba.ut.abtest.internal.debug.Debug r6) {
        /*
            Method dump skipped, instructions count: 404
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ut.abtest.internal.debug.c.a(com.alibaba.ut.abtest.internal.debug.Debug):void");
    }

    @Override // com.alibaba.ut.abtest.internal.debug.b
    public void a(Set<Long> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64b95557", new Object[]{this, set});
            return;
        }
        synchronized (this.e) {
            this.d.clear();
        }
        if (set == null || set.isEmpty()) {
            if (!cex.a().j().v()) {
                return;
            }
            k.b().b("debug_whitelist", "");
            return;
        }
        synchronized (this.e) {
            this.d.addAll(set);
        }
        StringBuilder sb = new StringBuilder();
        for (Long l : set) {
            if (sb.length() > 0) {
                sb.append(",");
            }
            if (l != null) {
                sb.append(l);
                ExperimentV5 a2 = com.alibaba.ut.abtest.internal.bucketing.c.a().a(l.longValue());
                if (a2 != null && a2.isHighPriorityWork()) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(a2);
                    new HighPriorityExperimentStorage().a(cex.a().j().w()).a(a(a2.getExpPublishType())).a(arrayList).a(2).a().b();
                }
            }
        }
        if (cex.a().j().v()) {
            k.b().b("debug_whitelist", sb.toString());
        }
        h.f("DebugServiceImpl", "【白名单数据】本设备白名单实验分组：" + sb.toString());
    }

    @Override // com.alibaba.ut.abtest.internal.debug.b
    public boolean a(long j) {
        boolean contains;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a8219760", new Object[]{this, new Long(j)})).booleanValue();
        }
        synchronized (this.e) {
            contains = this.d.contains(Long.valueOf(j));
        }
        return contains;
    }

    @Override // com.alibaba.ut.abtest.internal.debug.b
    public Object a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("17307540", new Object[]{this, str});
        }
        Map<String, Object> map = this.g;
        if (map != null) {
            return map.get(str);
        }
        return null;
    }
}
