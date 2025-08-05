package tb;

import com.alibaba.android.aura.datamodel.nextrpc.AURANextRPCEndpoint;
import com.alibaba.android.aura.datamodel.nextrpc.a;
import com.alibaba.android.aura.datamodel.nextrpc.c;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import tb.ase;

/* loaded from: classes2.dex */
public class asl {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int MAX_PREFETCH_EXPIRE_TIME = 15000;
    public List<a> d;
    private final String e;
    private long f;
    private final AURANextRPCEndpoint j;
    private ase.a k;
    private a m;
    private c n;

    /* renamed from: a  reason: collision with root package name */
    public ReentrantLock f25570a = new ReentrantLock();
    public AtomicBoolean b = new AtomicBoolean(false);
    public volatile long c = 0;
    private long g = 0;
    private long h = 0;
    private long i = 0;
    private final AtomicBoolean l = new AtomicBoolean(false);

    static {
        kge.a(1409593343);
    }

    public asl(String str, AURANextRPCEndpoint aURANextRPCEndpoint) {
        this.f = 5000L;
        this.e = str;
        this.j = a(aURANextRPCEndpoint);
        long a2 = aURANextRPCEndpoint.getNextRPCPrefetch().a();
        if (a2 != 0) {
            this.f = a2;
        }
    }

    private AURANextRPCEndpoint a(AURANextRPCEndpoint aURANextRPCEndpoint) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURANextRPCEndpoint) ipChange.ipc$dispatch("be62e0e", new Object[]{this, aURANextRPCEndpoint});
        }
        AURANextRPCEndpoint.a e = new AURANextRPCEndpoint.a().a(aURANextRPCEndpoint.isPostMethod()).c(aURANextRPCEndpoint.isNeedEncode()).b(aURANextRPCEndpoint.isNeedSession()).a(aURANextRPCEndpoint.getApi()).b(aURANextRPCEndpoint.getVersion()).e(aURANextRPCEndpoint.useMainThread());
        Map<String, String> dataParams = aURANextRPCEndpoint.getDataParams();
        if (dataParams != null) {
            e.b(new HashMap(dataParams));
        }
        Map<String, String> requestHeaders = aURANextRPCEndpoint.getRequestHeaders();
        if (requestHeaders != null) {
            e.a(new HashMap(requestHeaders));
        }
        return e.a();
    }

    public AURANextRPCEndpoint a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AURANextRPCEndpoint) ipChange.ipc$dispatch("3f200d1", new Object[]{this}) : this.j;
    }

    public ase.a b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ase.a) ipChange.ipc$dispatch("3a25e18d", new Object[]{this}) : this.k;
    }

    public void a(ase.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31c2a668", new Object[]{this, aVar});
        } else {
            this.k = aVar;
        }
    }

    public <T extends a> T c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("fa682c92", new Object[]{this});
        }
        T t = (T) this.m;
        return t != null ? t : this.n;
    }

    public <T extends a> void a(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6572dace", new Object[]{this, t});
        } else if (t instanceof c) {
            c cVar = (c) t;
            if (cVar.h() == 1) {
                this.n = cVar;
            } else {
                this.n.a(jot.a(this.n.f(), t.f()));
            }
        } else {
            this.m = t;
        }
    }

    public List<a> d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("195b8bfc", new Object[]{this}) : this.d;
    }

    public void a(List<a> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else if (list == null) {
        } else {
            if (this.d == null) {
                this.d = new ArrayList();
            }
            this.d.addAll(list);
        }
    }

    public long e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca60", new Object[]{this})).longValue() : this.c;
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : this.l.get();
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.l.set(z);
        }
    }

    public void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
        } else if (this.c != 0) {
        } else {
            this.c = j;
        }
    }

    public long g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c0f962", new Object[]{this})).longValue() : this.g;
    }

    public void b(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66ffb", new Object[]{this, new Long(j)});
        } else {
            this.g = j;
        }
    }

    public long h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5cf10e3", new Object[]{this})).longValue() : this.h;
    }

    public void c(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b489a", new Object[]{this, new Long(j)});
        } else {
            this.h = j;
        }
    }

    public long i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5dd2864", new Object[]{this})).longValue() : this.f;
    }

    public long j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5eb3fe5", new Object[]{this})).longValue() : this.i;
    }

    public void d(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad402139", new Object[]{this, new Long(j)});
        } else {
            this.i = j;
        }
    }
}
