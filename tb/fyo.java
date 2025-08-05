package tb;

import android.os.Handler;
import android.os.Looper;
import android.util.LruCache;
import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes5.dex */
public abstract class fyo<ExposeKey, ExposeData> implements fyr<ExposeKey, ExposeData> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DEFAULT_CACHE_SIZE = 8;
    public static final long DEFAULT_EXPOSE_DELAY = 0;

    /* renamed from: a  reason: collision with root package name */
    public Handler f28219a;
    public LruCache<ExposeKey, a<ExposeData>> c;
    public String h;
    public final Map<ExposeKey, a<ExposeData>> b = new HashMap();
    public final Map<ExposeKey, ExposeData> d = new LinkedHashMap();
    public Map<ExposeKey, a<ExposeData>> e = new HashMap();
    public final Set<ExposeKey> f = new HashSet();
    public final Set<ExposeKey> g = new LinkedHashSet();

    /* loaded from: classes5.dex */
    public static class a<ExposeData> {

        /* renamed from: a  reason: collision with root package name */
        public ExposeData f28221a;
        public String b;
        public boolean c;
        public Runnable d;

        static {
            kge.a(-672688082);
        }

        public a(ExposeData exposedata, String str, boolean z, Runnable runnable) {
            this.f28221a = exposedata;
            this.b = str;
            this.c = z;
            this.d = runnable;
        }
    }

    static {
        kge.a(-1683958654);
        kge.a(-566386313);
    }

    public abstract void a(List<Pair<ExposeKey, ExposeData>> list, String str);

    public abstract boolean a(ExposeKey exposekey, ExposeData exposedata, String str, Map<ExposeKey, ExposeData> map);

    public boolean c(ExposeKey exposekey, ExposeData exposedata, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3b7b3470", new Object[]{this, exposekey, exposedata, str})).booleanValue();
        }
        return false;
    }

    public void d(ExposeKey exposekey, ExposeData exposedata, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c31012d", new Object[]{this, exposekey, exposedata, str});
        }
    }

    public abstract void e(ExposeKey exposekey, ExposeData exposedata, String str);

    public long f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5b2e1e1", new Object[]{this})).longValue();
        }
        return 0L;
    }

    public int g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c0f961", new Object[]{this})).intValue();
        }
        return 8;
    }

    @Override // tb.fyr
    public void a(ExposeKey exposekey, ExposeData exposedata, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a0f9aea", new Object[]{this, exposekey, exposedata, str});
        } else {
            a((fyo<ExposeKey, ExposeData>) exposekey, (ExposeKey) exposedata, str, false, f());
        }
    }

    public void b(ExposeKey exposekey, ExposeData exposedata, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ac567ab", new Object[]{this, exposekey, exposedata, str});
        } else {
            a((fyo<ExposeKey, ExposeData>) exposekey, (ExposeKey) exposedata, str, false, 0L);
        }
    }

    @Override // tb.fyr
    public void a(ExposeKey exposekey, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65cbb30e", new Object[]{this, exposekey, str});
        } else {
            a((fyo<ExposeKey, ExposeData>) exposekey, str, true);
        }
    }

    @Override // tb.fyr
    public void a(ExposeKey exposekey, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53ab6186", new Object[]{this, exposekey, str, new Boolean(z)});
            return;
        }
        ExposeData b = b(exposekey, str);
        a((fyo<ExposeKey, ExposeData>) exposekey, (a) this.b.remove(exposekey));
        if (!z) {
            return;
        }
        d(exposekey, b, str);
    }

    public ExposeData b(ExposeKey exposekey, String str) {
        a<ExposeData> remove;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExposeData) ipChange.ipc$dispatch("2e0f3903", new Object[]{this, exposekey, str});
        }
        if (!n() || (remove = this.c.remove(exposekey)) == null) {
            return null;
        }
        a((fyo<ExposeKey, ExposeData>) exposekey, (a) remove);
        return remove.f28221a;
    }

    @Override // tb.fyr
    public void a(ExposeKey exposekey, ExposeData exposedata) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("184a7920", new Object[]{this, exposekey, exposedata});
        } else {
            this.d.put(exposekey, exposedata);
        }
    }

    @Override // tb.fyr
    public void c(ExposeKey exposekey, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f0c0910", new Object[]{this, exposekey, str});
        } else {
            this.d.remove(exposekey);
        }
    }

    @Override // tb.fyr
    public Map<ExposeKey, ExposeData> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a014a89d", new Object[]{this});
        }
        HashMap hashMap = new HashMap(this.d);
        this.d.clear();
        return hashMap;
    }

    @Override // tb.fyr
    public Map<ExposeKey, ExposeData> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("6dbf0a5e", new Object[]{this}) : new HashMap(this.d);
    }

    @Override // tb.fyr
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        for (Map.Entry<ExposeKey, ExposeData> entry : this.d.entrySet()) {
            a((fyo<ExposeKey, ExposeData>) entry.getKey(), (ExposeKey) entry.getValue(), str);
        }
    }

    @Override // tb.fyr
    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else if (n()) {
            for (Map.Entry<ExposeKey, ExposeData> entry : this.d.entrySet()) {
                a((fyo<ExposeKey, ExposeData>) entry.getKey(), (ExposeKey) entry.getValue(), false, str).run();
            }
        }
    }

    @Override // tb.fyr
    public void a(String str, List<ExposeKey> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1aa3523", new Object[]{this, str, list});
        } else if (m()) {
            if (!DinamicXEngine.j()) {
                return;
            }
            fuw.d("DXExposure", "isBatchExposing skip");
        } else {
            this.h = str;
            if (DinamicXEngine.j()) {
                fuw.d("DXExposure", "start batchTriggerExpose");
            }
            if (list != null && !list.isEmpty()) {
                for (ExposeKey exposekey : list) {
                    ExposeData exposedata = this.d.get(exposekey);
                    if (exposedata != null) {
                        a((fyo<ExposeKey, ExposeData>) exposekey, (ExposeKey) exposedata, str, true, f());
                    }
                }
            } else {
                for (Map.Entry<ExposeKey, ExposeData> entry : this.d.entrySet()) {
                    a((fyo<ExposeKey, ExposeData>) entry.getKey(), (ExposeKey) entry.getValue(), str, true, f());
                }
            }
            if (!this.e.isEmpty()) {
                return;
            }
            this.h = null;
            if (!DinamicXEngine.j()) {
                return;
            }
            fuw.d("DXExposure", "end batchTriggerExpose pendingTasks.isEmpty");
        }
    }

    @Override // tb.fyr
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (n() && this.c.size() != 0) {
            try {
                for (Map.Entry<ExposeKey, a<ExposeData>> entry : this.c.snapshot().entrySet()) {
                    b(entry.getKey(), entry.getValue().f28221a, entry.getValue().b);
                }
            } catch (Throwable unused) {
            }
        }
    }

    @Override // tb.fyr
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (n()) {
        } else {
            this.f28219a = i();
            this.c = j();
        }
    }

    @Override // tb.fyr
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (!n()) {
        } else {
            this.f28219a = null;
        }
    }

    public Looper h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Looper) ipChange.ipc$dispatch("dfd36004", new Object[]{this}) : Looper.getMainLooper();
    }

    public Handler i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("90235056", new Object[]{this}) : new Handler(h());
    }

    public LruCache<ExposeKey, a<ExposeData>> j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LruCache) ipChange.ipc$dispatch("870a53e2", new Object[]{this}) : new LruCache<>(g());
    }

    private void a(ExposeKey exposekey, ExposeData exposedata, String str, boolean z, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4aaa6da", new Object[]{this, exposekey, exposedata, str, new Boolean(z), new Long(j)});
        } else if (!n()) {
        } else {
            a((fyo<ExposeKey, ExposeData>) exposekey, (a) this.b.remove(exposekey));
            b(exposekey, exposedata, str, z, j);
        }
    }

    private void b(ExposeKey exposekey, ExposeData exposedata, String str, boolean z, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f20475b", new Object[]{this, exposekey, exposedata, str, new Boolean(z), new Long(j)});
            return;
        }
        Runnable a2 = a((fyo<ExposeKey, ExposeData>) exposekey, (ExposeKey) exposedata, z, str);
        a<ExposeData> aVar = new a<>(exposedata, str, z, a2);
        this.b.put(exposekey, aVar);
        this.f28219a.postDelayed(a2, j);
        if (!z) {
            return;
        }
        if (DinamicXEngine.j()) {
            fuw.d("DXExposure", "batch postExposeTask at key: " + exposekey);
        }
        this.e.put(exposekey, aVar);
    }

    private void a(ExposeKey exposekey, a<ExposeData> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe16635b", new Object[]{this, exposekey, aVar});
        } else if (aVar == null) {
        } else {
            this.f28219a.removeCallbacks(aVar.d);
            if (!aVar.c || !m() || exposekey == null) {
                return;
            }
            this.f.add(exposekey);
            k();
        }
    }

    private boolean n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6239df9", new Object[]{this})).booleanValue() : this.f28219a != null;
    }

    public Runnable a(final ExposeKey exposekey, final ExposeData exposedata, final boolean z, final String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Runnable) ipChange.ipc$dispatch("ff9ce656", new Object[]{this, exposekey, exposedata, new Boolean(z), str}) : new Runnable() { // from class: tb.fyo.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (!z) {
                    fyo.this.a((Runnable) this, (AnonymousClass1) exposekey, exposedata, false, str);
                } else {
                    if (DinamicXEngine.j()) {
                        fuw.d("DXExposure", "batch beforeDataExpose exposed at key: " + exposekey);
                    }
                    fyo.this.f.add(exposekey);
                    fyo.this.a((Runnable) this, (AnonymousClass1) exposekey, exposedata, true, str);
                    fyo.this.k();
                }
            }
        };
    }

    public void a(Runnable runnable, ExposeKey exposekey, ExposeData exposedata, boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59af6640", new Object[]{this, runnable, exposekey, exposedata, new Boolean(z), str});
            return;
        }
        this.b.remove(exposekey);
        if (c(exposekey, exposedata, str)) {
            return;
        }
        if (!a((fyo<ExposeKey, ExposeData>) exposekey, (ExposeKey) exposedata, str, (Map<fyo<ExposeKey, ExposeData>, ExposeKey>) o())) {
            this.c.put(exposekey, new a<>(exposedata, str, z, runnable));
            return;
        }
        b(exposekey, exposedata, z, str);
        b(exposekey, str);
    }

    public void b(ExposeKey exposekey, ExposeData exposedata, boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3ddcddd", new Object[]{this, exposekey, exposedata, new Boolean(z), str});
        } else if (z) {
            if (DinamicXEngine.j()) {
                fuw.d("DXExposure", "batch onDataExpose success at key: " + exposekey);
            }
            this.g.add(exposekey);
        } else {
            e(exposekey, exposedata, str);
        }
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
        } else if (l()) {
            ArrayList arrayList = new ArrayList();
            for (ExposeKey exposekey : this.g) {
                a<ExposeData> aVar = this.e.get(exposekey);
                if (aVar != null) {
                    arrayList.add(new Pair<>(exposekey, aVar.f28221a));
                }
            }
            if (DinamicXEngine.j()) {
                fuw.d("DXExposure", "finished onBatchDataExpose batchSize: " + arrayList.size());
            }
            a((List) arrayList, this.h);
            this.e.clear();
            this.f.clear();
            this.g.clear();
            this.h = null;
        }
    }

    public boolean l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[]{this})).booleanValue() : this.f.equals(this.e.keySet()) && !this.e.isEmpty();
    }

    public boolean m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6158678", new Object[]{this})).booleanValue() : this.h != null;
    }

    private Map<ExposeKey, ExposeData> o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("df66012b", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry<ExposeKey, a<ExposeData>> entry : this.c.snapshot().entrySet()) {
            hashMap.put(entry.getKey(), entry.getValue().f28221a);
        }
        return hashMap;
    }
}
