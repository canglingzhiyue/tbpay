package tb;

import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.util.i;
import com.taobao.android.task.Coordinator;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.jvm.internal.q;

/* loaded from: classes7.dex */
public final class npo<T> implements npn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private iud<T> f31626a;
    private boolean b;
    private boolean c;
    private iud<? super Throwable> d;
    private LinkedList<iud<T>> e = new LinkedList<>();
    private final npq f;
    private final npp<T> g;
    private final nul h;

    /* loaded from: classes7.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Throwable b;

        public a(Throwable th) {
            this.b = th;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            iud b = npo.b(npo.this);
            if (b == null) {
                q.a();
            }
            b.a(this.b);
        }
    }

    /* loaded from: classes7.dex */
    public static final class b extends i {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Object b;

        public b(Object obj) {
            this.b = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.taobao.android.searchbaseframe.util.i
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else {
                npo.e(npo.this).a(this.b);
            }
        }
    }

    /* loaded from: classes7.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (npo.a(npo.this) == null) {
                iud b = npo.b(npo.this);
                if (b == null) {
                    return;
                }
                b.a(new NullPointerException("request is null"));
            } else {
                try {
                    nno a2 = nnn.a(npo.a(npo.this).f31631a, npo.c(npo.this));
                    q.a((Object) a2, "SearchMtopUtil.syncRequest(mtopInfo, tLogTracker)");
                    if (npo.d(npo.this) == null) {
                        npo.a(npo.this, a2);
                        npo.b(npo.this, a2);
                        return;
                    }
                    Object a3 = npo.d(npo.this).a(a2.f, npo.c(npo.this));
                    npo.a(npo.this, a3);
                    npo.b(npo.this, a3);
                } catch (Throwable th) {
                    npo.a(npo.this, th);
                }
            }
        }
    }

    static {
        kge.a(-898937087);
        kge.a(59606641);
    }

    public npo(npq npqVar, npp<T> nppVar, nul nulVar) {
        this.f = npqVar;
        this.g = nppVar;
        this.h = nulVar;
    }

    public static final /* synthetic */ npq a(npo npoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (npq) ipChange.ipc$dispatch("643ade4c", new Object[]{npoVar}) : npoVar.f;
    }

    public static final /* synthetic */ void a(npo npoVar, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f9733e7", new Object[]{npoVar, obj});
        } else {
            npoVar.b((npo) obj);
        }
    }

    public static final /* synthetic */ void a(npo npoVar, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9433300a", new Object[]{npoVar, th});
        } else {
            npoVar.a(th);
        }
    }

    public static final /* synthetic */ iud b(npo npoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (iud) ipChange.ipc$dispatch("4bda8002", new Object[]{npoVar}) : npoVar.d;
    }

    public static final /* synthetic */ void b(npo npoVar, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("647ffc28", new Object[]{npoVar, obj});
        } else {
            npoVar.a((npo) obj);
        }
    }

    public static final /* synthetic */ nul c(npo npoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (nul) ipChange.ipc$dispatch("337e9d34", new Object[]{npoVar}) : npoVar.h;
    }

    public static final /* synthetic */ npp d(npo npoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (npp) ipChange.ipc$dispatch("1b20614a", new Object[]{npoVar}) : npoVar.g;
    }

    public static final /* synthetic */ iud e(npo npoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (iud) ipChange.ipc$dispatch("2c0031f", new Object[]{npoVar});
        }
        iud<T> iudVar = npoVar.f31626a;
        if (iudVar == null) {
            q.b("onFinish");
        }
        return iudVar;
    }

    public final npn a(iud<T> onNext, iud<? super Throwable> iudVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (npn) ipChange.ipc$dispatch("16c57442", new Object[]{this, onNext, iudVar});
        }
        q.c(onNext, "onNext");
        this.f31626a = onNext;
        this.d = iudVar;
        d();
        return this;
    }

    private final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            Coordinator.execute(new c());
        }
    }

    public final npo<T> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (npo) ipChange.ipc$dispatch("1e6ba28f", new Object[]{this});
        }
        this.c = true;
        return this;
    }

    private final void a(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, t});
        } else if (this.b) {
        } else {
            if (this.c) {
                new Handler(Looper.getMainLooper()).post(new b(t));
                return;
            }
            try {
                iud<T> iudVar = this.f31626a;
                if (iudVar == null) {
                    q.b("onFinish");
                }
                iudVar.a(t);
            } catch (Throwable unused) {
            }
        }
    }

    private final void a(Throwable th) {
        iud<? super Throwable> iudVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb9ad88d", new Object[]{this, th});
        } else if (this.b || (iudVar = this.d) == null) {
        } else {
            if (this.c) {
                new Handler(Looper.getMainLooper()).post(new a(th));
                return;
            }
            if (iudVar == null) {
                q.a();
            }
            iudVar.a(th);
        }
    }

    private final void b(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f056ab85", new Object[]{this, t});
        } else if (this.b) {
        } else {
            Iterator<iud<T>> it = this.e.iterator();
            while (it.hasNext()) {
                it.next().a(t);
            }
        }
    }

    public final npo<T> a(iud<T> consumer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (npo) ipChange.ipc$dispatch("7c504a19", new Object[]{this, consumer});
        }
        q.c(consumer, "consumer");
        this.e.add(consumer);
        return this;
    }

    @Override // tb.npn
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.b = true;
        }
    }

    @Override // tb.npn
    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.b;
    }
}
