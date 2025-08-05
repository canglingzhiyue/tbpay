package com.taobao.monitor.adapter;

import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.am;
import com.taobao.monitor.ProcedureGlobal;
import com.taobao.monitor.impl.util.h;
import com.taobao.monitor.procedure.g;
import com.taobao.monitor.procedure.p;
import com.taobao.monitor.procedure.r;
import com.taobao.monitor.procedure.s;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import tb.mpi;

/* loaded from: classes.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, a> f18143a = new HashMap();
    private static Map<String, g> b = new HashMap();
    private static boolean c = true;

    public static /* synthetic */ boolean a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821d370", new Object[]{new Boolean(z)})).booleanValue();
        }
        c = z;
        return z;
    }

    public static /* synthetic */ boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : c;
    }

    public static /* synthetic */ Map c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("3b696c1f", new Object[0]) : b;
    }

    public static /* synthetic */ Map d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("913cde0", new Object[0]) : f18143a;
    }

    /* loaded from: classes.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private long f18146a;
        private long b;
        private long c;
        private long d;
        private boolean e;
        private String f;

        private a() {
        }

        public static /* synthetic */ long a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c6c38b3", new Object[]{aVar})).longValue() : aVar.f18146a;
        }

        public static /* synthetic */ long a(a aVar, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("811b55d9", new Object[]{aVar, new Long(j)})).longValue();
            }
            aVar.f18146a = j;
            return j;
        }

        public static /* synthetic */ String a(a aVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("4cfc2ef7", new Object[]{aVar, str});
            }
            aVar.f = str;
            return str;
        }

        public static /* synthetic */ boolean a(a aVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("811b91f9", new Object[]{aVar, new Boolean(z)})).booleanValue();
            }
            aVar.e = z;
            return z;
        }

        public static /* synthetic */ long b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("20140c34", new Object[]{aVar})).longValue() : aVar.c;
        }

        public static /* synthetic */ long b(a aVar, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("e26df278", new Object[]{aVar, new Long(j)})).longValue();
            }
            aVar.c = j;
            return j;
        }

        public static /* synthetic */ long c(a aVar, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("43c08f17", new Object[]{aVar, new Long(j)})).longValue();
            }
            aVar.b = j;
            return j;
        }

        public static /* synthetic */ boolean c(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("33bbdfc5", new Object[]{aVar})).booleanValue() : aVar.e;
        }

        public static /* synthetic */ long d(a aVar, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("a5132bb6", new Object[]{aVar, new Long(j)})).longValue();
            }
            aVar.d = j;
            return j;
        }

        public static /* synthetic */ String d(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2eeed9e", new Object[]{aVar}) : aVar.f;
        }

        public static /* synthetic */ long e(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5b0b86b7", new Object[]{aVar})).longValue() : aVar.b;
        }

        public static /* synthetic */ long f(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6eb35a38", new Object[]{aVar})).longValue() : aVar.d;
        }
    }

    public static void a(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
            return;
        }
        final long a2 = h.a();
        final long currentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
        final String name = Thread.currentThread().getName();
        final boolean z = Thread.currentThread() == Looper.getMainLooper().getThread();
        a(new Runnable() { // from class: com.taobao.monitor.adapter.c.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (c.b()) {
                    if (c.d().keySet().contains(str)) {
                        return;
                    }
                    a aVar = new a();
                    a.a(aVar, a2);
                    a.b(aVar, currentThreadTimeMillis);
                    a.a(aVar, z);
                    a.a(aVar, name);
                    c.d().put(str, aVar);
                } else {
                    p a3 = new p.a().b(false).a(false).c(false).a(s.f18233a.d()).a();
                    r rVar = r.f18232a;
                    g a4 = rVar.a("/" + str, a3);
                    c.c().put(str, a4);
                    a4.b();
                    a4.a("taskStart", a2);
                    a4.a("cpuStartTime", currentThreadTimeMillis);
                    a4.a(am.THREAD_NAME, name);
                    a4.a("isMainThread", Boolean.valueOf(z));
                }
            }
        });
    }

    public static void a(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{str, map});
        } else {
            b(str, null, map);
        }
    }

    public static void a(String str, String str2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84162689", new Object[]{str, str2, map});
        } else {
            b(str, str2, map);
        }
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
        } else {
            b(str, null, null);
        }
    }

    private static void b(final String str, final String str2, final Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("854c7968", new Object[]{str, str2, map});
            return;
        }
        final long a2 = h.a();
        final long currentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
        a(new Runnable() { // from class: com.taobao.monitor.adapter.c.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (c.b()) {
                    if (!c.d().keySet().contains(str)) {
                        return;
                    }
                    a aVar = (a) c.d().get(str);
                    a.c(aVar, a2);
                    a.d(aVar, currentThreadTimeMillis);
                } else {
                    g gVar = (g) c.c().get(str);
                    a aVar2 = (a) c.d().get(str);
                    if (gVar == null && aVar2 != null) {
                        p a3 = new p.a().b(false).a(false).c(false).a(s.f18233a.d()).a();
                        r rVar = r.f18232a;
                        gVar = rVar.a("/" + str, a3);
                        gVar.b();
                        gVar.a("taskStart", a.a(aVar2));
                        gVar.a("cpuStartTime", a.b(aVar2));
                        gVar.a("isMainThread", Boolean.valueOf(a.c(aVar2)));
                        gVar.a(am.THREAD_NAME, a.d(aVar2));
                        c.d().remove(str);
                    }
                    if (gVar == null) {
                        return;
                    }
                    gVar.a("taskEnd", a2);
                    gVar.a("cpuEndTime", currentThreadTimeMillis);
                    if (!TextUtils.isEmpty(str2)) {
                        gVar.a("errorType", str2);
                    }
                    Map map2 = map;
                    if (map2 != null && map2.size() > 0) {
                        try {
                            for (Map.Entry entry : map.entrySet()) {
                                String valueOf = String.valueOf(entry.getKey());
                                if (!TextUtils.isEmpty(valueOf)) {
                                    gVar.a(valueOf, entry.getValue());
                                }
                            }
                        } catch (Throwable th) {
                            mpi.c("TBAPMAdapterSubTaskManager", th);
                        }
                    }
                    gVar.d();
                    c.c().remove(str);
                }
            }
        });
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else {
            a(new Runnable() { // from class: com.taobao.monitor.adapter.c.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    Iterator it = c.d().entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        String str = (String) entry.getKey();
                        a aVar = (a) entry.getValue();
                        if (a.e(aVar) != 0) {
                            p a2 = new p.a().b(false).a(false).c(false).a(s.f18233a.d()).a();
                            r rVar = r.f18232a;
                            g a3 = rVar.a("/" + str, a2);
                            a3.b();
                            a3.a("taskStart", a.a(aVar));
                            a3.a("cpuStartTime", a.b(aVar));
                            a3.a("isMainThread", Boolean.valueOf(a.c(aVar)));
                            a3.a(am.THREAD_NAME, a.d(aVar));
                            a3.a("taskEnd", a.e(aVar));
                            a3.a("cpuEndTime", a.f(aVar));
                            a3.d();
                            it.remove();
                        }
                    }
                    c.a(false);
                }
            });
        }
    }

    private static void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{runnable});
        } else {
            ProcedureGlobal.a().c().post(runnable);
        }
    }
}
