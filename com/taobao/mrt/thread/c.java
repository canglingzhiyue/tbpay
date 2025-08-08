package com.taobao.mrt.thread;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mrt.task.MRTJobRefuseReason;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import tb.kge;

/* loaded from: classes7.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static c f18262a;
    private long b = 90000;
    private Set<String> c = new HashSet();
    private int d = 0;
    private HashSet<a> e = new HashSet<>();

    /* loaded from: classes7.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final d f18264a;
        public final String b;
        public long c;
        public String d;
        public String e;

        static {
            kge.a(-1826563168);
        }

        public a(String str, String str2, long j, d dVar, String str3) {
            this.d = str;
            this.e = str2;
            this.c = j;
            this.f18264a = dVar;
            this.b = str3;
        }
    }

    public static /* synthetic */ int a(c cVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("21ca22e", new Object[]{cVar, new Integer(i)})).intValue();
        }
        cVar.d = i;
        return i;
    }

    public static /* synthetic */ HashSet a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashSet) ipChange.ipc$dispatch("f6f26e5", new Object[]{cVar}) : cVar.e;
    }

    public static /* synthetic */ long b(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("cf31b55b", new Object[]{cVar})).longValue() : cVar.b;
    }

    public static /* synthetic */ Set c(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Set) ipChange.ipc$dispatch("6779fa75", new Object[]{cVar}) : cVar.c;
    }

    public static /* synthetic */ int d(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d08b0c98", new Object[]{cVar})).intValue() : cVar.d;
    }

    static {
        kge.a(-961128045);
        f18262a = new c();
    }

    private c() {
        b();
    }

    public static c a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("76f5f2c8", new Object[0]) : f18262a;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        this.c.add(str);
        com.taobao.mrt.utils.a.b("MRTThreadMonitor", "task " + str + " execute timeout");
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            com.taobao.mrt.thread.a.a().a(new Runnable() { // from class: com.taobao.mrt.thread.c.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        try {
                            HashSet<a> hashSet = new HashSet();
                            long currentTimeMillis = System.currentTimeMillis();
                            Iterator it = c.a(c.this).iterator();
                            while (it.hasNext()) {
                                a aVar = (a) it.next();
                                if (currentTimeMillis - aVar.c > c.b(c.this)) {
                                    com.taobao.mrt.utils.a.c("MRTThreadMonitor", "任务:" + aVar.d + "执行超时");
                                    hashSet.add(aVar);
                                    c.c(c.this).add(aVar.d);
                                }
                            }
                            if (hashSet.size() > 0) {
                                c.a(c.this).removeAll(hashSet);
                                c.a(c.this, c.d(c.this) + hashSet.size());
                            }
                            for (a aVar2 : hashSet) {
                                aVar2.f18264a.a(aVar2.b);
                                com.taobao.mrt.utils.c.a(null, aVar2.d, "", aVar2.e, "", 151, 0, 1, 0L, 0L, 0L, 0L);
                            }
                        } finally {
                            com.taobao.mrt.thread.a.a().a(this, 5000);
                        }
                    } catch (Throwable unused) {
                        com.taobao.mrt.utils.a.c("MRTThreadMonitor", "monitor task exception");
                    }
                }
            }, 1000);
        }
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("403eafeb", new Object[]{this, aVar});
        } else if (aVar == null || StringUtils.isEmpty(aVar.b)) {
        } else {
            this.e.add(aVar);
        }
    }

    public void b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c86eefca", new Object[]{this, aVar});
        } else if (aVar == null || StringUtils.isEmpty(aVar.b)) {
        } else {
            this.e.remove(aVar);
        }
    }

    public MRTJobRefuseReason b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MRTJobRefuseReason) ipChange.ipc$dispatch("17d6d1b5", new Object[]{this, str});
        }
        if (this.d >= 4) {
            return MRTJobRefuseReason.MRTJobRefuseThreadExceed;
        }
        if (StringUtils.isEmpty(str)) {
            return MRTJobRefuseReason.MRTJobRefuseReasonNone;
        }
        if (com.taobao.mrt.c.c()) {
            return MRTJobRefuseReason.MRTJobRefuseReasonNone;
        }
        synchronized (this.c) {
            if (this.c.contains(str)) {
                return MRTJobRefuseReason.MRTJobRefuseReasonBug;
            }
            return MRTJobRefuseReason.MRTJobRefuseReasonNone;
        }
    }
}
