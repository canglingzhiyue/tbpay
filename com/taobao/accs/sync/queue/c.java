package com.taobao.accs.sync.queue;

import android.text.TextUtils;
import android.util.Pair;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.tao.powermsg.outter.PowerMsg4WW;
import com.xiaomi.mipush.sdk.Constants;
import java.util.AbstractQueue;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import tb.dcf;
import tb.dch;
import tb.dci;
import tb.dcj;
import tb.dck;
import tb.dcl;
import tb.kge;

/* loaded from: classes.dex */
public class c<T extends dch> extends AbstractQueue<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public dcj f8284a;
    private PreQueue b;
    private SyncQueue c;
    private final String d;
    private final String e;
    private final int f;
    private final boolean g;
    private final a h;
    private Pair<Integer, Integer> i;
    private volatile int k;
    private final Object j = new Object();
    private volatile boolean l = false;
    private final b m = new b() { // from class: com.taobao.accs.sync.queue.c.3
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.accs.sync.queue.b
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            dcl.a("SyncExecutor", "preQueue.onTimeout()", new Object[0]);
            synchronized (c.c(c.this)) {
                c.b(c.this).incrementSeq();
                c.h(c.this);
            }
        }
    };

    static {
        kge.a(-1716775530);
    }

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public T c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("1e66e533", new Object[]{this});
        }
        return null;
    }

    public T d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("26188a92", new Object[]{this});
        }
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Iterator) ipChange.ipc$dispatch("8f345362", new Object[]{this});
        }
        return null;
    }

    public static /* synthetic */ int a(c cVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("af7b65fa", new Object[]{cVar, new Integer(i)})).intValue();
        }
        cVar.k = i;
        return i;
    }

    public static /* synthetic */ boolean a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c3989c80", new Object[]{cVar})).booleanValue() : cVar.l;
    }

    public static /* synthetic */ SyncQueue b(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SyncQueue) ipChange.ipc$dispatch("909dd27a", new Object[]{cVar}) : cVar.c;
    }

    public static /* synthetic */ Object c(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("ae04b6f4", new Object[]{cVar}) : cVar.j;
    }

    public static /* synthetic */ int d(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f822dbb2", new Object[]{cVar})).intValue() : cVar.k;
    }

    public static /* synthetic */ a e(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("953c032c", new Object[]{cVar}) : cVar.h;
    }

    public static /* synthetic */ int f(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c5d45b34", new Object[]{cVar})).intValue() : cVar.f;
    }

    public static /* synthetic */ boolean g(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2cad1b06", new Object[]{cVar})).booleanValue() : cVar.g;
    }

    public static /* synthetic */ void h(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9385dac3", new Object[]{cVar});
        } else {
            cVar.g();
        }
    }

    public static /* synthetic */ String i(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b3db329c", new Object[]{cVar}) : cVar.d;
    }

    public static /* synthetic */ String j(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e1b3ccfb", new Object[]{cVar}) : cVar.e;
    }

    @Override // java.util.Queue
    public /* synthetic */ boolean offer(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4209ae03", new Object[]{this, obj})).booleanValue() : a((c<T>) ((dch) obj));
    }

    @Override // java.util.Queue
    public /* synthetic */ Object peek() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("85bdd710", new Object[]{this}) : d();
    }

    @Override // java.util.Queue
    public /* synthetic */ Object poll() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("ebae572c", new Object[]{this}) : c();
    }

    public c(String str, String str2, int i, int i2, long j, boolean z, a aVar) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || aVar == null) {
            throw new IllegalArgumentException("SyncExecutor.arguments are illegal");
        }
        this.f8284a = new dcj(GlobalClientInfo.getContext());
        this.d = str;
        this.e = str2;
        this.k = Math.max(0, i - 1);
        this.f = i2 <= 1 ? Integer.MAX_VALUE : i2;
        this.g = z;
        this.h = aVar;
        a(j);
        e();
        f();
        this.f8284a.a(str);
    }

    private void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
            return;
        }
        this.c = new SyncQueue(this.k, dcf.comparator);
        this.b = new PreQueue(this.k, dcf.comparator);
        this.b.setTimeout(j, this.m);
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        dci.a(this.d + Constants.WAVE_SEPARATOR + this.e).execute(new Runnable() { // from class: com.taobao.accs.sync.queue.c.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                boolean z;
                Throwable th;
                dch dchVar;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                while (true) {
                    boolean z2 = true;
                    while (!c.a(c.this)) {
                        try {
                            dchVar = (dch) c.b(c.this).poll(3L, TimeUnit.SECONDS);
                        } catch (Throwable th2) {
                            z = z2;
                            th = th2;
                        }
                        if (dchVar != null) {
                            try {
                                synchronized (c.c(c.this)) {
                                    if (dchVar.f() <= c.d(c.this)) {
                                        dcl.a("SyncExecutor", "give up msg", "outputSeq", Integer.valueOf(c.d(c.this)), dck.COL_SEQ, Integer.valueOf(dchVar.f()));
                                    } else if (c.e(c.this).c(dchVar)) {
                                        c.a(c.this, dchVar.f());
                                        if (c.d(c.this) % c.f(c.this) == 1) {
                                            dcl.a("SyncExecutor", "dynamic delete", PowerMsg4WW.KEY_END_SEQ, Integer.valueOf(c.d(c.this)));
                                            if (c.g(c.this)) {
                                                c.this.f8284a.a(dchVar.d(), dchVar.e(), dchVar.f());
                                            }
                                        }
                                    } else {
                                        dcl.a("SyncExecutor", "callback.onSync() err", new Object[0]);
                                    }
                                    c.h(c.this);
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                z = true;
                            }
                        } else if (z2) {
                            try {
                                c.this.a();
                                z2 = false;
                            } catch (Throwable th4) {
                                th = th4;
                                z = false;
                            }
                        }
                        dcl.a("SyncExecutor", "getSyncQueueScheduler.execute err", th, new Object[0]);
                        z2 = z;
                    }
                    return;
                }
            }
        });
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else {
            dci.b().execute(new Runnable() { // from class: com.taobao.accs.sync.queue.c.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    List<dch> a2 = c.this.f8284a.a(c.i(c.this), c.j(c.this), c.d(c.this), Integer.MAX_VALUE);
                    if (a2 != null) {
                        for (dch dchVar : a2) {
                            c.this.a((c) dchVar);
                        }
                    }
                    c.e(c.this).c(c.i(c.this), c.j(c.this));
                }
            });
        }
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        dch dchVar = (dch) this.b.peek();
        dcl.a("SyncExecutor", "checkPreQueue", "next", dchVar);
        if (dchVar == null) {
            return;
        }
        if (this.c.isNext(dchVar)) {
            this.c.offer(this.b.poll());
            return;
        }
        this.b.updateTimeout();
        if (!h()) {
            return;
        }
        a();
    }

    private boolean h() {
        int curSeq;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue();
        }
        if (this.i == null || (curSeq = this.c.getCurSeq() + 1) < ((Integer) this.i.first).intValue() || curSeq > ((Integer) this.i.second).intValue()) {
            return true;
        }
        dcl.b("SyncExecutor", "pull repeat", "start", Integer.valueOf(this.c.getCurSeq() + 1), "pullRange.end", this.i.second);
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("32697bfb", new Object[]{this})).intValue() : this.b.size() + this.c.size();
    }

    public boolean a(final T t) {
        boolean offer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e4dcea73", new Object[]{this, t})).booleanValue();
        }
        if (TextUtils.isEmpty(this.e) || !this.e.equals(t.e())) {
            dcl.a("SyncExecutor", "offer failed", "mStream", this.e, "msgStream", t.e());
            return false;
        } else if (t.f() <= this.k) {
            dcl.a("SyncExecutor", "offer failed", "outputSeq", Integer.valueOf(this.k), "t.seq", Integer.valueOf(t.f()));
            return false;
        } else {
            synchronized (this.j) {
                if (this.c.isNext(t)) {
                    offer = this.c.offer((dch) t);
                } else {
                    if (!this.b.isEmpty() && this.b.isNext(t)) {
                        offer = this.b.offer((dch) t);
                    }
                    offer = this.b.offer((dch) t);
                    if (h()) {
                        a();
                    }
                }
            }
            if (this.g && offer && t.c()) {
                if (t.b() != null) {
                    dci.c().execute(new Runnable() { // from class: com.taobao.accs.sync.queue.c.4
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            t.a(c.e(c.this).a(t.d(), t.b()));
                            c.this.f8284a.a(t);
                        }
                    });
                } else {
                    this.f8284a.a(t);
                }
            }
            return offer;
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        int curSeq = this.c.getCurSeq() + 1;
        dch dchVar = (dch) this.b.peek();
        int f = dchVar == null ? Integer.MAX_VALUE : dchVar.f() - 1;
        if (curSeq > f) {
            dcl.a("SyncExecutor", "pull illegalArgs", "start", Integer.valueOf(curSeq), "end", Integer.valueOf(f));
            return;
        }
        int min = Math.min(f, curSeq + 49);
        this.i = Pair.create(Integer.valueOf(curSeq), Integer.valueOf(min));
        this.h.b(this.d, this.e, curSeq, min);
        dcl.a("SyncExecutor", "start pull", "serviceId", this.d, "streamId", this.e, "start", Integer.valueOf(curSeq), "end", Integer.valueOf(min));
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.l = true;
        synchronized (this.j) {
            this.b.clear();
            this.c.clear();
        }
        this.f8284a.a(this.d, this.e, Integer.MAX_VALUE);
    }

    public List<dch> a(String str, String str2, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("187c3feb", new Object[]{this, str, str2, new Integer(i), new Integer(i2)});
        }
        dcl.a("SyncExecutor", "biz query()", new Object[0]);
        return this.f8284a.a(str, str2, i, i2);
    }
}
