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

/* loaded from: classes6.dex */
public class d implements c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final int f14846a = hashCode();
    private final Map<String, a> b = new HashMap();

    @Override // com.taobao.android.remoteso.status.c
    public <T> T a(j jVar, c.a<T> aVar) {
        T b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("d5c09834", new Object[]{this, jVar, aVar});
        }
        a a2 = a(jVar);
        synchronized (a2) {
            RSoStatus a3 = a.a(a2);
            RSoLog.c(this.f14846a + "status3 ->  on-status, " + a.b(a2) + ",  on " + a3);
            b = aVar.b(a3, a2);
            RSoStatus a4 = a.a(a2);
            if (a4 != a3) {
                Set<c.b> c = a.c(a2);
                if (c.size() > 0) {
                    RSoLog.c(this.f14846a + "status3 -> notify listener.size=  " + c.size() + ", " + a.b(a2) + "  to  " + a4.name() + ", " + c);
                    a(a4, c);
                }
            }
        }
        return b;
    }

    private void a(RSoStatus rSoStatus, Set<c.b> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e96567a5", new Object[]{this, rSoStatus, set});
            return;
        }
        Iterator<c.b> it = set.iterator();
        while (it.hasNext()) {
            try {
                if (it.next().a(rSoStatus)) {
                    it.remove();
                }
            } catch (Throwable th) {
                ikq.a("status3 -> notify listener", th);
            }
        }
    }

    private a a(j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("9007219b", new Object[]{this, jVar});
        }
        String str = jVar.a() + jVar.c();
        a aVar = this.b.get(str);
        if (aVar == null) {
            synchronized (this.b) {
                aVar = this.b.get(str);
                if (aVar == null) {
                    aVar = new a(this.f14846a, str);
                    this.b.put(str, aVar);
                }
            }
        }
        return aVar;
    }

    @Override // com.taobao.android.remoteso.status.c
    public void a(j jVar, c.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("233071d", new Object[]{this, jVar, bVar});
            return;
        }
        a a2 = a(jVar);
        RSoLog.c(this.f14846a + "status3 -> " + a.b(a2) + ", registerListener = " + bVar);
        synchronized (a2) {
            a.c(a2).add(bVar);
        }
    }

    /* loaded from: classes6.dex */
    public static class a implements c.InterfaceC0566c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final int f14847a;
        private final String b;
        private final Set<c.b> c = new HashSet();
        private RSoStatus d = RSoStatus.INITIALIZED;

        public static /* synthetic */ RSoStatus a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (RSoStatus) ipChange.ipc$dispatch("3a916ef", new Object[]{aVar}) : aVar.d;
        }

        public static /* synthetic */ String b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bef4e7e6", new Object[]{aVar}) : aVar.b;
        }

        public static /* synthetic */ Set c(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Set) ipChange.ipc$dispatch("15c7eb2a", new Object[]{aVar}) : aVar.c;
        }

        public a(int i, String str) {
            this.f14847a = i;
            this.b = str;
        }

        @Override // com.taobao.android.remoteso.status.c.InterfaceC0566c
        public void a(RSoStatus rSoStatus) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("36b3c7da", new Object[]{this, rSoStatus});
                return;
            }
            RSoLog.c(this.f14847a + "status3 ->  " + this.b + ", want change to " + rSoStatus);
            this.d = rSoStatus;
        }
    }
}
