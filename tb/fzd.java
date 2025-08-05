package tb;

import android.os.Handler;
import android.util.LruCache;
import android.util.Pair;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;
import tb.fyo;

/* loaded from: classes5.dex */
public class fzd<ExposeKey, ExposeData> extends fyo<ExposeKey, ExposeData> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final fza<ExposeKey, ExposeData> i;
    private final fzc<ExposeKey, ExposeData> j;
    private final fzb<ExposeKey, ExposeData> k;
    private final fyz<ExposeKey, ExposeData> l;
    private final long m;
    private final Handler n;
    private final int o;
    private final LruCache<ExposeKey, fyo.a<ExposeData>> p;

    static {
        kge.a(1007083745);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object ipc$super(fzd fzdVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2029366302:
                return super.j();
            case -1876733866:
                return super.i();
            case 95609313:
                return new Long(super.f());
            case 96532833:
                return new Integer(super.g());
            case 997930096:
                return new Boolean(super.c(objArr[0], objArr[1], (String) objArr[2]));
            case 1278279981:
                super.d(objArr[0], objArr[1], (String) objArr[2]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public fzd(fzc<ExposeKey, ExposeData> fzcVar, fza<ExposeKey, ExposeData> fzaVar, fzb<ExposeKey, ExposeData> fzbVar, fyz<ExposeKey, ExposeData> fyzVar, long j, Handler handler, int i, LruCache<ExposeKey, fyo.a<ExposeData>> lruCache) {
        this.i = fzaVar;
        this.j = fzcVar;
        this.k = fzbVar;
        this.l = fyzVar;
        this.m = j;
        this.n = handler;
        this.o = i;
        this.p = lruCache;
    }

    @Override // tb.fyo
    public boolean c(ExposeKey exposekey, ExposeData exposedata, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3b7b3470", new Object[]{this, exposekey, exposedata, str})).booleanValue();
        }
        fza<ExposeKey, ExposeData> fzaVar = this.i;
        if (fzaVar != null) {
            return fzaVar.a(exposekey, exposedata, str);
        }
        return super.c(exposekey, exposedata, str);
    }

    @Override // tb.fyo
    public boolean a(ExposeKey exposekey, ExposeData exposedata, String str, Map<ExposeKey, ExposeData> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cd2fcf5f", new Object[]{this, exposekey, exposedata, str, map})).booleanValue();
        }
        fzc<ExposeKey, ExposeData> fzcVar = this.j;
        if (fzcVar == null) {
            return false;
        }
        return fzcVar.a(exposekey, exposedata, str, map);
    }

    @Override // tb.fyo
    public void e(ExposeKey exposekey, ExposeData exposedata, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ce6cdee", new Object[]{this, exposekey, exposedata, str});
            return;
        }
        fzb<ExposeKey, ExposeData> fzbVar = this.k;
        if (fzbVar == null) {
            return;
        }
        fzbVar.b(exposekey, exposedata, str);
    }

    @Override // tb.fyo
    public void a(List<Pair<ExposeKey, ExposeData>> list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c6e0ee3", new Object[]{this, list, str});
            return;
        }
        fzb<ExposeKey, ExposeData> fzbVar = this.k;
        if (fzbVar == null) {
            return;
        }
        fzbVar.a(list, str);
    }

    @Override // tb.fyo
    public void d(ExposeKey exposekey, ExposeData exposedata, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c31012d", new Object[]{this, exposekey, exposedata, str});
            return;
        }
        fyz<ExposeKey, ExposeData> fyzVar = this.l;
        if (fyzVar != null) {
            fyzVar.c(exposekey, exposedata, str);
        } else {
            super.d(exposekey, exposedata, str);
        }
    }

    @Override // tb.fyo
    public long f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5b2e1e1", new Object[]{this})).longValue();
        }
        long j = this.m;
        return j > 0 ? j : super.f();
    }

    @Override // tb.fyo
    public int g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c0f961", new Object[]{this})).intValue();
        }
        int i = this.o;
        return i > 0 ? i : super.g();
    }

    @Override // tb.fyo
    public Handler i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("90235056", new Object[]{this});
        }
        Handler handler = this.n;
        return handler != null ? handler : super.i();
    }

    @Override // tb.fyo
    public LruCache<ExposeKey, fyo.a<ExposeData>> j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LruCache) ipChange.ipc$dispatch("870a53e2", new Object[]{this});
        }
        LruCache<ExposeKey, fyo.a<ExposeData>> lruCache = this.p;
        return lruCache != null ? lruCache : super.j();
    }

    /* loaded from: classes5.dex */
    public static class a<ExposeKey, ExposeData> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private fza<ExposeKey, ExposeData> f28225a;
        private fzc<ExposeKey, ExposeData> b;
        private fzb<ExposeKey, ExposeData> c;
        private fyz<ExposeKey, ExposeData> d;
        private long e;
        private Handler f;
        private int g;
        private LruCache<ExposeKey, fyo.a<ExposeData>> h;

        static {
            kge.a(334710456);
            kge.a(1401098574);
        }

        public a<ExposeKey, ExposeData> a(fzc<ExposeKey, ExposeData> fzcVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("986ae50", new Object[]{this, fzcVar});
            }
            this.b = fzcVar;
            return this;
        }

        public a<ExposeKey, ExposeData> a(fza<ExposeKey, ExposeData> fzaVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("2c80a14e", new Object[]{this, fzaVar});
            }
            this.f28225a = fzaVar;
            return this;
        }

        public a<ExposeKey, ExposeData> a(fzb<ExposeKey, ExposeData> fzbVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("1b03a7cf", new Object[]{this, fzbVar});
            }
            this.c = fzbVar;
            return this;
        }

        public a<ExposeKey, ExposeData> a(fyz<ExposeKey, ExposeData> fyzVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("956e7a48", new Object[]{this, fyzVar});
            }
            this.d = fyzVar;
            return this;
        }

        public a<ExposeKey, ExposeData> a(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("dcac6abd", new Object[]{this, new Long(j)});
            }
            this.e = j;
            return this;
        }

        public a<ExposeKey, ExposeData> a(Handler handler) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("4b7fee01", new Object[]{this, handler});
            }
            this.f = handler;
            return this;
        }

        public a<ExposeKey, ExposeData> a(LruCache<ExposeKey, fyo.a<ExposeData>> lruCache) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("9fe0c220", new Object[]{this, lruCache});
            }
            this.h = lruCache;
            return this;
        }

        public fzd<ExposeKey, ExposeData> a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (fzd) ipChange.ipc$dispatch("f04d90e", new Object[]{this}) : new fzd<>(this.b, this.f28225a, this.c, this.d, this.e, this.f, this.g, this.h);
        }
    }
}
