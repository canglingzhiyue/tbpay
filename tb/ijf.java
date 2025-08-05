package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.api.RSoException;
import com.taobao.android.remoteso.index.RemoConfig;
import com.taobao.android.remoteso.index.SoIndexData;
import com.taobao.android.remoteso.index.SoInfo2;
import com.taobao.android.remoteso.index.c;
import com.taobao.android.remoteso.log.RSoLog;
import com.taobao.android.remoteso.resolver2.c;
import com.taobao.android.remoteso.resolver2.j;
import com.taobao.android.remoteso.resolver2.k;
import com.taobao.android.remoteso.resolver2.l;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import tb.iks;
import tb.nve;

/* loaded from: classes.dex */
public final class ijf implements ijy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Long f29068a = Long.valueOf(TimeUnit.SECONDS.toMillis(10));
    private final ijd b;
    private final c c;
    private final ijh d;
    private final ijr e;
    private final iix<String> f;
    private final iju g;
    private final nvf h;

    /* loaded from: classes6.dex */
    public static class a implements c.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final AtomicInteger f29075a;
        private final Runnable b;
        private volatile boolean c = true;

        public a(int i, Runnable runnable) {
            this.f29075a = new AtomicInteger(i);
            this.b = runnable;
        }

        @Override // com.taobao.android.remoteso.resolver2.c.a
        public void a(k kVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bc3202ab", new Object[]{this, kVar});
                return;
            }
            if (!kVar.i()) {
                RSoLog.c("prefetch -> found failed fetch, result=" + kVar);
                this.c = false;
            }
            if (this.f29075a.decrementAndGet() > 0) {
                return;
            }
            RSoLog.c("prefetch -> all request finished, waitingRequestCount <= 0, count=" + this.f29075a);
            if (!this.c) {
                return;
            }
            RSoLog.c("prefetch -> all result success, stop prefetch");
            this.b.run();
        }
    }

    public static /* synthetic */ com.taobao.android.remoteso.index.c a(ijf ijfVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.remoteso.index.c) ipChange.ipc$dispatch("66e04f38", new Object[]{ijfVar}) : ijfVar.c;
    }

    public static /* synthetic */ void a(ijf ijfVar, nve.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25ae2aa9", new Object[]{ijfVar, aVar});
        } else {
            ijfVar.a(aVar);
        }
    }

    public static /* synthetic */ boolean a(ijf ijfVar, j jVar, c.a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7c294821", new Object[]{ijfVar, jVar, aVar})).booleanValue() : ijfVar.a(jVar, aVar);
    }

    public static /* synthetic */ boolean a(ijf ijfVar, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("39337c61", new Object[]{ijfVar, str})).booleanValue() : ijfVar.a(str);
    }

    public static /* synthetic */ void b(ijf ijfVar, nve.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fdfc3ea", new Object[]{ijfVar, aVar});
        } else {
            ijfVar.b(aVar);
        }
    }

    public ijf(iju ijuVar, ijd ijdVar, com.taobao.android.remoteso.index.c cVar, ijh ijhVar, ijr ijrVar, iix<String> iixVar, nvf nvfVar) {
        this.g = ijuVar;
        this.b = ijdVar;
        this.c = cVar;
        this.d = ijhVar;
        this.e = ijrVar;
        this.f = iixVar;
        this.h = nvfVar;
    }

    @Override // tb.ijy
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        RSoLog.c("prefetch -> startPreFetch enter");
        if (this.b.a("key_prefetch_disabled", false)) {
            RSoLog.c("prefetch ->  prefetch disabled.");
            return;
        }
        int a2 = (int) this.b.a("key_prefetch_retry_count", 5L);
        new nve("prefetch-so", a2, this.b.a("key_prefetch_so_retry_interval", f29068a.longValue()), new iiv<nve.a, Void>() { // from class: tb.ijf.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.iiv
            public Void a(nve.a aVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (Void) ipChange2.ipc$dispatch("b8785bf", new Object[]{this, aVar});
                }
                ijf.a(ijf.this, aVar);
                return null;
            }
        }).a(0L);
        new nve("prefetch-assets", a2, this.b.a("key_prefetch_assets_retry_interval", 15000L), new iiv<nve.a, Void>() { // from class: tb.ijf.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.iiv
            public Void a(nve.a aVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (Void) ipChange2.ipc$dispatch("b8785bf", new Object[]{this, aVar});
                }
                ijf.b(ijf.this, aVar);
                return null;
            }
        }).a(0L);
    }

    private void a(final nve.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16e49f7e", new Object[]{this, aVar});
            return;
        }
        final long a2 = this.b.a("key_prefetch_request_interval", 1000L);
        Collection<String> b2 = iks.b(this.c.d(), new iks.a<String>() { // from class: tb.ijf.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.iks.a
            public boolean a(String str) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue() : ijf.a(ijf.this, str);
            }
        });
        if (b2.size() <= 0) {
            RSoLog.c("prefetch-so -> skipped, libNames.size() < 1");
            aVar.b.run();
            return;
        }
        final a aVar2 = new a(b2.size(), new Runnable() { // from class: tb.ijf.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                aVar.b.run();
                RSoLog.c("prefetch-so -> onStop, all request finished");
            }
        });
        this.f.a(b2, new iiv<String, Void>() { // from class: tb.ijf.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.iiv
            public Void a(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (Void) ipChange2.ipc$dispatch("90485a8b", new Object[]{this, str});
                }
                j b3 = l.b(ijf.a(ijf.this), str);
                if (b3 == null) {
                    RSoLog.c("prefetch-so -> skip " + str + ", info targetReq == null");
                    return null;
                }
                if (ijf.a(ijf.this, b3, aVar2)) {
                    iky.a(a2);
                }
                return null;
            }
        });
    }

    private void b(final nve.a aVar) {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70c009bf", new Object[]{this, aVar});
            return;
        }
        RSoLog.c("prefetch-assets ->  start index = " + aVar.f31784a);
        long a2 = this.b.a("key_prefetch_assets_request_group_size", 9L);
        long a3 = this.b.a("key_prefetch_assets_request_group_interval", 1100L);
        long a4 = this.b.a("key_prefetch_assets_request_interval", 100L);
        long a5 = this.b.a("key_prefetch_assets_pv_threshold", 10L);
        HashMap hashMap = new HashMap();
        List<RemoConfig> g = this.c.g();
        for (RemoConfig remoConfig : g) {
            String uri = remoConfig.getUri();
            if (ikw.b((CharSequence) uri)) {
                hashMap.put(uri, Integer.valueOf(remoConfig.getPv()));
            }
        }
        RSoLog.c("prefetch-assets ->  configs.size = " + g.size());
        PriorityQueue priorityQueue = new PriorityQueue();
        for (Map.Entry<String, SoIndexData.SoFileInfo> entry : this.c.c().getAssets().entrySet()) {
            String key = entry.getKey();
            SoIndexData.SoFileInfo value = entry.getValue();
            Integer num = (Integer) hashMap.get(key);
            if (num != null) {
                j = a3;
                if (num.intValue() >= a5) {
                    priorityQueue.add(new b(key, value, num.intValue()));
                }
            } else {
                j = a3;
            }
            a3 = j;
        }
        long j2 = a3;
        RSoLog.c("prefetch-assets -> nodes.size = " + priorityQueue.size());
        if (priorityQueue.isEmpty()) {
            aVar.b.run();
            RSoLog.c("prefetch-assets -> stopped, nodes.size = 0");
            return;
        }
        a aVar2 = new a(priorityQueue.size(), new Runnable() { // from class: tb.ijf.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                aVar.b.run();
                RSoLog.c("prefetch-assets -> onStop, all request finished");
            }
        });
        Iterator it = priorityQueue.iterator();
        int i = 0;
        while (it.hasNext()) {
            b bVar = (b) it.next();
            int i2 = i + 1;
            if (a(j.a(b.b(bVar), b.c(bVar), null), aVar2)) {
                iky.a(((long) i2) % a2 == 0 ? j2 : a4);
            }
            i = i2;
        }
    }

    private boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        if ("primary7.prof,primary80.prof,primary81.prof".contains(str)) {
            RSoLog.c("prefetch -> shouldPrefetch = false, VALUE_PREFETCH_BLACK_LIST contains lib = " + str);
            return false;
        } else if (this.b.a("black_list_prefetch_lib", "").contains(str)) {
            RSoLog.c("prefetch -> shouldPrefetch = false, in black list, lib = " + str);
            return false;
        } else if (this.d.a(str, false)) {
            RSoLog.c("prefetch -> shouldPrefetch = true, by RSoPrefetchRecorder, lib = " + str);
            return true;
        } else {
            SoInfo2 b2 = this.c.b(str);
            if (b2 == null || b2.ext.allowPreFetch) {
                return true;
            }
            RSoLog.c("prefetch -> shouldPrefetch = false, from soinfo2.allowPreFetch, lib = " + str);
            return false;
        }
    }

    private boolean a(j jVar, final c.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1d284eb6", new Object[]{this, jVar, aVar})).booleanValue();
        }
        RSoLog.c("prefetch -> resolveOne, do resolveOneResult ,  targetReq=" + jVar.a() + ",  callback=" + aVar);
        try {
            jVar.a("prefetch");
            k a2 = this.e.a(jVar);
            if (a2.i()) {
                aVar.a(a2);
                return false;
            }
            this.e.a(jVar, new c.a() { // from class: tb.ijf.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.remoteso.resolver2.c.a
                public void a(k kVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("bc3202ab", new Object[]{this, kVar});
                    } else {
                        aVar.a(kVar);
                    }
                }
            });
            return true;
        } catch (Throwable th) {
            ikq.a("prefetch->resolveOne", th);
            aVar.a(l.a(jVar, RSoException.error(6311, th), "prefetch-error"));
            RSoLog.b("prefetch -> resolveOne, resolve lib failed");
            return false;
        }
    }

    /* loaded from: classes6.dex */
    public static class b implements Comparable<b> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final String f29076a;
        private final SoIndexData.SoFileInfo b;
        private final int c;

        public static /* synthetic */ String b(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2c0b1c0a", new Object[]{bVar}) : bVar.f29076a;
        }

        public static /* synthetic */ SoIndexData.SoFileInfo c(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (SoIndexData.SoFileInfo) ipChange.ipc$dispatch("7181792d", new Object[]{bVar}) : bVar.b;
        }

        @Override // java.lang.Comparable
        public /* synthetic */ int compareTo(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6a4672d6", new Object[]{this, bVar})).intValue() : a(bVar);
        }

        public b(String str, SoIndexData.SoFileInfo soFileInfo, int i) {
            this.f29076a = str;
            this.b = soFileInfo;
            this.c = i;
        }

        public int a(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("96694508", new Object[]{this, bVar})).intValue() : Integer.compare(this.c, bVar.c);
        }
    }
}
