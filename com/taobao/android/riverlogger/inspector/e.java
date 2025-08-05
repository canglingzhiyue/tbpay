package com.taobao.android.riverlogger.inspector;

import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.kge;

/* loaded from: classes6.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static c f14914a;
    private static final Object b;
    private static final AtomicBoolean c;
    private static m d;

    static {
        kge.a(-1697372984);
        b = new Object();
        c = new AtomicBoolean(false);
    }

    public static c a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("db41e598", new Object[0]) : f14914a;
    }

    public static void a(c cVar) {
        boolean b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ec64652", new Object[]{cVar});
        } else if (cVar.f14907a) {
        } else {
            synchronized (b) {
                if (cVar instanceof m) {
                    if (d != null) {
                        d.c("connect new");
                    }
                    d = (m) cVar;
                }
                if (f14914a == null) {
                    f14914a = cVar;
                } else if (f14914a instanceof b) {
                    f14914a = ((b) f14914a).a(cVar);
                } else {
                    f14914a = new b(cVar, f14914a);
                }
                b2 = f14914a.b();
            }
            cVar.d();
            a.a(true, b2);
        }
    }

    public static void b(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e4fe053", new Object[]{cVar});
        } else if (f14914a == null) {
        } else {
            synchronized (b) {
                if (f14914a instanceof b) {
                    f14914a = ((b) f14914a).b(cVar);
                } else if (f14914a != cVar) {
                    return;
                } else {
                    f14914a = null;
                }
                if (cVar == d) {
                    d = null;
                }
                cVar.e();
                c cVar2 = f14914a;
                if (cVar2 == null) {
                    a.a(false, false);
                } else {
                    a.a(true, cVar2.b());
                }
            }
        }
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
            return;
        }
        m mVar = d;
        if (mVar == null) {
            return;
        }
        mVar.c(str);
    }

    public static void a(SharedPreferences sharedPreferences) {
        m a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25d7097c", new Object[]{sharedPreferences});
        } else if (f14914a != null || sharedPreferences == null || (a2 = m.a(sharedPreferences)) == null) {
        } else {
            a(a2);
            com.taobao.android.riverlogger.e.a(RVLLevel.Info, g.RVLModuleName).a("openRemote", a2.c()).a("server", (Object) a2.h()).a("persisted", (Object) true).a();
        }
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
            return;
        }
        c cVar = f14914a;
        if (cVar == null) {
            a.b(str, null);
        } else if (cVar.a(str) == null) {
            a.b(str, null);
        } else {
            StringBuilder sb = new StringBuilder();
            Iterator<l> it = cVar.a(str).iterator();
            while (it.hasNext()) {
                sb.append(it.next().c);
                sb.append('\n');
            }
            a.b(str, sb.toString());
        }
    }

    public static void b() {
        boolean contains;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
            return;
        }
        c cVar = f14914a;
        if (cVar == null) {
            a.a((Set<String>) null);
            contains = false;
        } else {
            Set<String> a2 = cVar.a();
            a.a(a2);
            contains = a2.contains("log");
        }
        AtomicBoolean atomicBoolean = c;
        if (!contains) {
            z = true;
        }
        if (!atomicBoolean.compareAndSet(z, contains)) {
            return;
        }
        if (contains) {
            com.taobao.android.riverlogger.e.a(d.instance);
        } else {
            com.taobao.android.riverlogger.e.b(d.instance);
        }
    }
}
