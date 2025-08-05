package com.taobao.android.remoteso.status;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.log.RSoLog;
import com.taobao.android.remoteso.resolver2.j;
import com.taobao.android.remoteso.status.c;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import tb.ikq;

/* loaded from: classes.dex */
public class b implements c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final int f14844a = hashCode();
    private final Map<String, RSoStatus> b = new HashMap();
    private final Map<String, Set<c.b>> c = new HashMap();

    public static /* synthetic */ int a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a7e87a0b", new Object[]{bVar})).intValue() : bVar.f14844a;
    }

    public static /* synthetic */ Map b(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("4a630b4e", new Object[]{bVar}) : bVar.b;
    }

    @Override // com.taobao.android.remoteso.status.c
    public <T> T a(j jVar, c.a<T> aVar) {
        T b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("d5c09834", new Object[]{this, jVar, aVar});
        }
        final String b2 = b(jVar);
        synchronized (this.b) {
            c.InterfaceC0566c interfaceC0566c = new c.InterfaceC0566c() { // from class: com.taobao.android.remoteso.status.b.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.remoteso.status.c.InterfaceC0566c
                public void a(RSoStatus rSoStatus) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("36b3c7da", new Object[]{this, rSoStatus});
                        return;
                    }
                    RSoLog.c(b.a(b.this) + "status2 ->  " + b2 + ", want change to " + rSoStatus);
                    b.b(b.this).put(b2, rSoStatus);
                }
            };
            RSoStatus rSoStatus = this.b.get(b2);
            if (rSoStatus == null) {
                rSoStatus = RSoStatus.INITIALIZED;
            }
            RSoLog.c(this.f14844a + "status2 ->  on-status, " + b2 + ",  on " + rSoStatus);
            b = aVar.b(rSoStatus, interfaceC0566c);
            RSoStatus rSoStatus2 = this.b.get(b2);
            if (rSoStatus2 != null && rSoStatus2 != rSoStatus) {
                Set<c.b> a2 = a(jVar);
                if (a2.size() > 0) {
                    a(jVar, rSoStatus2, a2);
                }
            }
        }
        return b;
    }

    private void a(j jVar, RSoStatus rSoStatus, Set<c.b> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecbf5041", new Object[]{this, jVar, rSoStatus, set});
            return;
        }
        RSoLog.c(this.f14844a + "status2 -> notify listener.  " + set.size() + ",  " + b(jVar) + "  to  " + rSoStatus.name() + ", " + set);
        Iterator<c.b> it = set.iterator();
        while (it.hasNext()) {
            try {
                if (it.next().a(rSoStatus)) {
                    it.remove();
                }
            } catch (Throwable th) {
                ikq.a("status2 -> notify listener", th);
            }
        }
    }

    @Override // com.taobao.android.remoteso.status.c
    public void a(j jVar, c.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("233071d", new Object[]{this, jVar, bVar});
            return;
        }
        RSoLog.c(this.f14844a + "status2 -> " + b(jVar) + ", registerListener = " + bVar);
        synchronized (this.b) {
            a(jVar).add(bVar);
        }
    }

    private Set<c.b> a(j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("ea39753b", new Object[]{this, jVar});
        }
        String b = b(jVar);
        Set<c.b> set = this.c.get(b);
        if (set != null) {
            return set;
        }
        HashSet hashSet = new HashSet();
        this.c.put(b, hashSet);
        return hashSet;
    }

    private static String b(j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8f74cc15", new Object[]{jVar});
        }
        return jVar.a() + jVar.c();
    }
}
