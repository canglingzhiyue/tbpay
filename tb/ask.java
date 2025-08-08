package tb;

import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.alibaba.android.aura.datamodel.nextrpc.AURANextRPCEndpoint;
import com.alibaba.android.aura.datamodel.nextrpc.d;
import com.alibaba.android.aura.service.nextrpc.extension.IAURANextRPCPrefetchExtension;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;
import tb.ase;

/* loaded from: classes2.dex */
public class ask implements asm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final ConcurrentHashMap<String, asl> f25566a;

    public static /* synthetic */ ConcurrentHashMap a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ConcurrentHashMap) ipChange.ipc$dispatch("f779de7e", new Object[0]) : f25566a;
    }

    static {
        kge.a(-1372324976);
        kge.a(1312648979);
        f25566a = new ConcurrentHashMap<>();
    }

    @Override // tb.asm
    public ase.a a(AURANextRPCEndpoint aURANextRPCEndpoint) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ase.a) ipChange.ipc$dispatch("744d04eb", new Object[]{this, aURANextRPCEndpoint});
        }
        String key = aURANextRPCEndpoint.getKey();
        asl aslVar = new asl(key, aURANextRPCEndpoint);
        a aVar = new a(aslVar);
        aslVar.b(System.currentTimeMillis());
        if (b()) {
            f25566a.put(key, aslVar);
        }
        return aVar;
    }

    private asl c(AURANextRPCEndpoint aURANextRPCEndpoint) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (asl) ipChange.ipc$dispatch("7096dcdf", new Object[]{this, aURANextRPCEndpoint}) : f25566a.get(aURANextRPCEndpoint.getKey());
    }

    private boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        if (f25566a.size() >= 15) {
            c();
        }
        return f25566a.size() < 15;
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        for (Map.Entry<String, asl> entry : f25566a.entrySet()) {
            asl value = entry.getValue();
            if (System.currentTimeMillis() - value.e() > value.i()) {
                f25566a.remove(entry.getKey());
            }
        }
    }

    @Override // tb.asm
    public boolean a(AURANextRPCEndpoint aURANextRPCEndpoint, ase.a aVar, ase.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9398d7ae", new Object[]{this, aURANextRPCEndpoint, aVar, bVar})).booleanValue();
        }
        b bVar2 = new b(aURANextRPCEndpoint.getKey(), bVar);
        if (!b()) {
            bVar2.a("TYPE_FULL", b(aURANextRPCEndpoint));
            return false;
        }
        asl c2 = c(aURANextRPCEndpoint);
        if (c2 != null) {
            asj a2 = bVar2.a(aURANextRPCEndpoint, c2.a());
            if (a2.a()) {
                return b(aURANextRPCEndpoint, aVar, bVar2);
            }
            bVar2.a("TYPE_MISS", a(c2, a2.b()));
            return false;
        }
        bVar2.a(IAURANextRPCPrefetchExtension.PrefetchCallbackType.TYPE_NOT_FOUNT, b(aURANextRPCEndpoint));
        return false;
    }

    /* loaded from: classes2.dex */
    public static class b implements ase.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final ase.b f25568a;
        private final String b;

        static {
            kge.a(1974377127);
            kge.a(-1360675848);
        }

        public b(String str, ase.b bVar) {
            this.f25568a = bVar;
            this.b = str;
        }

        @Override // tb.ase.b
        public void a(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
            } else if (this.f25568a == null) {
            } else {
                ask.a().remove(this.b);
                this.f25568a.a(str, map);
            }
        }

        @Override // tb.ase.b
        public asj a(AURANextRPCEndpoint aURANextRPCEndpoint, AURANextRPCEndpoint aURANextRPCEndpoint2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (asj) ipChange.ipc$dispatch("1c2e2220", new Object[]{this, aURANextRPCEndpoint, aURANextRPCEndpoint2});
            }
            ase.b bVar = this.f25568a;
            if (bVar == null) {
                return null;
            }
            return bVar.a(aURANextRPCEndpoint, aURANextRPCEndpoint2);
        }
    }

    public boolean b(AURANextRPCEndpoint aURANextRPCEndpoint, ase.a aVar, ase.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7ca09caf", new Object[]{this, aURANextRPCEndpoint, aVar, bVar})).booleanValue();
        }
        asl c2 = c(aURANextRPCEndpoint);
        try {
            c2.f25570a.lock();
            if (!c2.b.get() && c2.c() == null) {
                c2.a(aVar);
                c2.d(System.currentTimeMillis());
                bVar.a("TYPE_MERGE", a(c2, null));
                return true;
            }
            c2.f25570a.unlock();
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - c2.e() > c2.i()) {
                c2.c(currentTimeMillis);
                bVar.a("TYPE_EXPIRE", a(c2, null));
                return false;
            }
            com.alibaba.android.aura.datamodel.nextrpc.a c3 = c2.c();
            if (c3 == null || aVar == null) {
                return true;
            }
            c2.c(System.currentTimeMillis());
            try {
                c2.f25570a.lock();
                if (c2.f()) {
                    aVar.a(c3, c2.d());
                    c2.a(aVar);
                } else {
                    aVar.a((ase.a) c3);
                }
                bVar.a("TYPE_HIT", a(c2, null));
                return true;
            } finally {
            }
        } finally {
        }
    }

    public static Map<String, String> b(AURANextRPCEndpoint aURANextRPCEndpoint) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("75792b81", new Object[]{aURANextRPCEndpoint});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("data_key", aURANextRPCEndpoint.getKey());
        return hashMap;
    }

    public static Map<String, String> a(asl aslVar, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("7c59939c", new Object[]{aslVar, map});
        }
        AURANextRPCEndpoint a2 = aslVar.a();
        HashMap hashMap = new HashMap();
        hashMap.put("data_key", a2.getKey());
        long j = -1;
        if (aslVar.j() != 0) {
            j = aslVar.j() - aslVar.g();
        }
        if (aslVar.h() != 0) {
            j = aslVar.h() - aslVar.g();
        }
        hashMap.put(IAURANextRPCPrefetchExtension.DATA_SAVE_TIME, String.valueOf(j));
        hashMap.put(IAURANextRPCPrefetchExtension.DATA_START_TIME, String.valueOf(aslVar.g()));
        hashMap.put(IAURANextRPCPrefetchExtension.DATA_HIT_TIME, String.valueOf(aslVar.h()));
        hashMap.put(IAURANextRPCPrefetchExtension.DATA_RESPONSE_TIME, String.valueOf(aslVar.e()));
        String b2 = bba.b(map);
        if (!StringUtils.isEmpty(b2)) {
            hashMap.put(IAURANextRPCPrefetchExtension.DATA_PARAM, b2);
        }
        return hashMap;
    }

    /* loaded from: classes2.dex */
    public static class a implements ase.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final asl f25567a;

        static {
            kge.a(-1885780290);
            kge.a(-1482680038);
        }

        public a(asl aslVar) {
            this.f25567a = aslVar;
        }

        @Override // tb.ase.a
        public <T extends com.alibaba.android.aura.datamodel.nextrpc.a> void a(T t) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6572dace", new Object[]{this, t});
            } else {
                c(t);
            }
        }

        @Override // tb.ase.a
        public void b(com.alibaba.android.aura.datamodel.nextrpc.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a8fdf88f", new Object[]{this, aVar});
            } else {
                b(aVar, null);
            }
        }

        @Override // tb.ase.a
        public <T extends com.alibaba.android.aura.datamodel.nextrpc.a> void a(T t, List<com.alibaba.android.aura.datamodel.nextrpc.a> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7c1e0bbf", new Object[]{this, t, list});
            } else {
                b(t, list);
            }
        }

        @Override // tb.ase.a
        public void a(List<com.alibaba.android.aura.datamodel.nextrpc.a> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            } else {
                b(null, list);
            }
        }

        private <T extends com.alibaba.android.aura.datamodel.nextrpc.a> void c(T t) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ec891650", new Object[]{this, t});
            } else {
                a(t, null, false);
            }
        }

        private <T extends com.alibaba.android.aura.datamodel.nextrpc.a> void b(T t, List<com.alibaba.android.aura.datamodel.nextrpc.a> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57df8780", new Object[]{this, t, list});
            } else {
                a(t, list, true);
            }
        }

        private <T extends com.alibaba.android.aura.datamodel.nextrpc.a> void a(T t, List<com.alibaba.android.aura.datamodel.nextrpc.a> list, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7a41ef5", new Object[]{this, t, list, new Boolean(z)});
                return;
            }
            a(this.f25567a, t);
            ReentrantLock reentrantLock = this.f25567a.f25570a;
            try {
                reentrantLock.lock();
                ase.a b = this.f25567a.b();
                if (b != null) {
                    a(b, t, list, z);
                } else {
                    b(t, list, z);
                }
            } catch (Throwable th) {
                try {
                    arc.a().b(th.getMessage());
                    baw.a(th);
                    hyw.a("EXCEPTION_FORM_(dataProcessHandle)", Log.getStackTraceString(th));
                } finally {
                    reentrantLock.unlock();
                }
            }
        }

        private void a(asl aslVar, com.alibaba.android.aura.datamodel.nextrpc.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8bdc8a04", new Object[]{this, aslVar, aVar});
            } else if (aVar == null) {
            } else {
                d i = aVar.i();
                i.g(aslVar.g());
                i.h(aslVar.j() != 0 ? aslVar.j() : aslVar.e());
            }
        }

        private <T extends com.alibaba.android.aura.datamodel.nextrpc.a> void a(ase.a aVar, T t, List<com.alibaba.android.aura.datamodel.nextrpc.a> list, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a36ea4f5", new Object[]{this, aVar, t, list, new Boolean(z)});
            } else if (!z) {
                aVar.a((ase.a) t);
            } else if (t != null) {
                aVar.a(t, list);
            } else {
                aVar.a(list);
            }
        }

        private <T extends com.alibaba.android.aura.datamodel.nextrpc.a> void b(T t, List<com.alibaba.android.aura.datamodel.nextrpc.a> list, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a4121b54", new Object[]{this, t, list, new Boolean(z)});
                return;
            }
            this.f25567a.b.compareAndSet(false, true);
            this.f25567a.a(z);
            ard a2 = arc.a();
            a2.b("PREFETCHcacheData[" + z + riy.ARRAY_END_STR + System.currentTimeMillis());
            this.f25567a.a(System.currentTimeMillis());
            if (t != null) {
                this.f25567a.a((asl) t);
            }
            if (list == null) {
                return;
            }
            this.f25567a.a(list);
        }
    }

    /* loaded from: classes2.dex */
    public static class c implements ase.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final ase.a[] f25569a;

        static {
            kge.a(-2049825535);
            kge.a(-1482680038);
        }

        public c(ase.a... aVarArr) {
            this.f25569a = aVarArr;
        }

        @Override // tb.ase.a
        public <T extends com.alibaba.android.aura.datamodel.nextrpc.a> void a(T t) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6572dace", new Object[]{this, t});
                return;
            }
            ase.a[] aVarArr = this.f25569a;
            if (aVarArr == null) {
                return;
            }
            for (ase.a aVar : aVarArr) {
                aVar.a((ase.a) t);
            }
        }

        @Override // tb.ase.a
        public void b(com.alibaba.android.aura.datamodel.nextrpc.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a8fdf88f", new Object[]{this, aVar});
                return;
            }
            ase.a[] aVarArr = this.f25569a;
            if (aVarArr == null) {
                return;
            }
            for (ase.a aVar2 : aVarArr) {
                aVar2.b(aVar);
            }
        }

        @Override // tb.ase.a
        public <T extends com.alibaba.android.aura.datamodel.nextrpc.a> void a(T t, List<com.alibaba.android.aura.datamodel.nextrpc.a> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7c1e0bbf", new Object[]{this, t, list});
                return;
            }
            ase.a[] aVarArr = this.f25569a;
            if (aVarArr == null) {
                return;
            }
            for (ase.a aVar : aVarArr) {
                aVar.a(t, list);
            }
        }

        @Override // tb.ase.a
        public void a(List<com.alibaba.android.aura.datamodel.nextrpc.a> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
                return;
            }
            ase.a[] aVarArr = this.f25569a;
            if (aVarArr == null) {
                return;
            }
            for (ase.a aVar : aVarArr) {
                aVar.a(list);
            }
        }
    }
}
