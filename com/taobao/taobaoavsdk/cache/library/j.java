package com.taobao.taobaoavsdk.cache.library;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.media.MediaConstant;
import com.taobao.orange.OrangeConfig;
import com.taobao.statistic.CT;
import com.taobao.statistic.TBS;
import com.taobao.taobaoavsdk.AVSDKLog;
import com.taobao.taobaoavsdk.cache.library.k;
import java.io.File;
import java.io.IOException;
import java.net.Socket;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import tb.kge;
import tb.oyz;

/* loaded from: classes8.dex */
public final class j implements e, g, l {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final Deque<String> F;
    private static final Map<String, r> r;
    private boolean A;
    private int B;
    private boolean D;

    /* renamed from: a  reason: collision with root package name */
    public k f21328a;
    private final String c;
    private String d;
    private boolean e;
    private String f;
    private String g;
    private int h;
    private final i i;
    private volatile h j;
    private final b l;
    private final c m;
    private long n;
    private long o;
    private long p;
    private boolean q;
    private String s;
    private int t;
    private int u;
    private int v;
    private String x;
    private String y;
    private long z;
    private final AtomicInteger b = new AtomicInteger(0);
    private final List<b> k = new CopyOnWriteArrayList();
    private final Object G = new Object();
    private Map<String, String> w = new HashMap();
    private boolean C = false;
    private long E = 0;

    static {
        kge.a(1293157853);
        kge.a(524496622);
        kge.a(1800372017);
        kge.a(1071222038);
        r = new ConcurrentHashMap();
        F = new LinkedList();
    }

    public j(String str, c cVar, i iVar) {
        this.D = true;
        this.c = (String) n.a(str);
        this.m = (c) n.a(cVar);
        this.l = new a(str, this.k);
        this.i = iVar;
        this.D = com.taobao.taobaoavsdk.util.b.a(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_ENABLE_COMMIT_EVENT_TRACK_ON_19997, "true"));
    }

    public void a(f fVar, Socket socket) throws ProxyCacheException, IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7767fb12", new Object[]{this, fVar, socket});
            return;
        }
        if (fVar != null) {
            this.d = fVar.d;
            this.e = fVar.e;
            this.f = fVar.f;
            this.g = fVar.g;
            this.h = fVar.h;
            this.s = fVar.n;
            this.t = fVar.k;
            this.u = fVar.l;
            this.v = fVar.m;
            this.x = fVar.p;
            this.y = fVar.q;
            this.z = fVar.i;
            this.A = fVar.j;
            this.B = fVar.r;
        }
        i();
        try {
            this.b.incrementAndGet();
            this.j.b(fVar, socket);
        } finally {
            this.j.a(fVar, this.C, this.i);
            j();
        }
    }

    public void b(f fVar, Socket socket) throws ProxyCacheException, IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba66ab1", new Object[]{this, fVar, socket});
            return;
        }
        if (fVar != null) {
            this.d = fVar.d;
            this.e = fVar.e;
            this.f = fVar.f;
            this.g = fVar.g;
            this.h = fVar.h;
            this.s = fVar.n;
            this.t = fVar.k;
            this.u = fVar.l;
            this.v = fVar.m;
            this.x = fVar.p;
            this.y = fVar.q;
            this.z = fVar.i;
            this.B = fVar.r;
        }
        i();
        try {
            this.b.incrementAndGet();
            this.j.a(fVar, socket);
        } finally {
            j();
        }
    }

    private void h() {
        String g;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else if (this.j == null || this.j.f21320a == null) {
        } else {
            try {
                g = this.j.f21320a.g();
            } catch (Exception e) {
                AVSDKLog.e("TBNetStatistic", "commitTBNetData error:" + e.getMessage());
            }
            if (StringUtils.isEmpty(g)) {
                return;
            }
            String[] split = g.split(",");
            if (this.D) {
                TBS.Ext.commitEvent("Page_Video", 19997, "Page_Video_Button-TBNetStatistic", "", "", split);
            } else {
                TBS.Adv.ctrlClicked("Page_Video", CT.Button, "TBNetStatistic", split);
            }
            AVSDKLog.d("TBNetStatistic", g);
            try {
                String[] strArr = {"play_token=" + this.f, "read_from_download=" + (this.n - this.o), "read_from_cache=" + this.o};
                if (this.D) {
                    TBS.Ext.commitEvent("Page_VideoCache", 19997, "Page_VideoCache_Button-PlayerCache", "", "", strArr);
                } else {
                    TBS.Adv.ctrlClicked("Page_VideoCache", CT.Button, "PlayerCache", strArr);
                }
            } catch (Throwable unused) {
            }
        }
    }

    private synchronized void i() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        } else {
            this.j = this.j == null ? l() : this.j;
        }
    }

    private synchronized void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        if (this.b.decrementAndGet() <= 0 && this.j != null) {
            h();
            this.j.a((b) null);
            this.j.a((e) null);
            this.j.a();
            this.j = null;
        }
    }

    public synchronized void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.C = true;
        this.k.clear();
        if (this.j != null) {
            this.j.a((b) null);
            this.j.a((e) null);
            this.j.a();
        }
        this.b.set(0);
    }

    private void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        k.a aVar = new k.a();
        aVar.a((l) this);
        aVar.a((g) this);
        aVar.a(this.c);
        aVar.b(this.d);
        aVar.c(p.a(this.c));
        aVar.a(this.e);
        aVar.d(this.f);
        aVar.e(this.g);
        aVar.a(this.h);
        aVar.f(this.s);
        aVar.b(this.t);
        aVar.c(this.u);
        aVar.d(this.v);
        aVar.g(this.x);
        aVar.h(this.y);
        aVar.a(this.z);
        aVar.b(this.A);
        aVar.e(this.B);
        this.f21328a = aVar.a();
    }

    private h l() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h) ipChange.ipc$dispatch("ab5ca796", new Object[]{this});
        }
        k();
        h hVar = new h(this.f21328a, new oyz(this.m.a(this.c), this.m.c), this.i);
        hVar.a(this.l);
        hVar.a(this);
        return hVar;
    }

    @Override // com.taobao.taobaoavsdk.cache.library.e
    public void a(int i, int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2619b90c", new Object[]{this, new Integer(i), new Integer(i2), new Boolean(z)});
            return;
        }
        this.n += i;
        this.o += i2;
        this.q = z;
    }

    @Override // com.taobao.taobaoavsdk.cache.library.e
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.p += i;
        }
    }

    @Override // com.taobao.taobaoavsdk.cache.library.l
    public void a(String str, long j, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa210a1c", new Object[]{this, str, new Long(j), str2});
            return;
        }
        synchronized (this.G) {
            if (!StringUtils.isEmpty(str) && r != null && this.m != null && this.m.b != null) {
                String a2 = this.m.b.a(str);
                if (StringUtils.isEmpty(a2)) {
                    return;
                }
                r rVar = new r();
                rVar.a(j);
                rVar.a(str2);
                if (r.size() >= 15) {
                    r.remove(F.removeLast());
                }
                r.put(a2, rVar);
                F.addFirst(a2);
            }
        }
    }

    @Override // com.taobao.taobaoavsdk.cache.library.l
    public r a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r) ipChange.ipc$dispatch("114d72ad", new Object[]{this, str});
        }
        synchronized (this.G) {
            if (!StringUtils.isEmpty(str) && r != null && !r.isEmpty() && this.m != null && this.m.b != null) {
                String a2 = this.m.b.a(str);
                if (StringUtils.isEmpty(a2)) {
                    return null;
                }
                r rVar = r.get(a2);
                if (rVar != null) {
                    F.remove(a2);
                    F.addFirst(a2);
                }
                return rVar;
            }
            return null;
        }
    }

    @Override // com.taobao.taobaoavsdk.cache.library.g
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        this.w.put(str, str2);
        if (!"HeadRequetTime".equals(str)) {
            return;
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "onInfo fetchContentInfo :" + str2);
        this.E = (long) Integer.valueOf(str2).intValue();
    }

    public Map<String, String> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("6dbf0a5e", new Object[]{this}) : this.w;
    }

    public long c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5e", new Object[]{this})).longValue() : this.o;
    }

    public long d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2df", new Object[]{this})).longValue() : this.n - this.o;
    }

    public long e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca60", new Object[]{this})).longValue() : this.p;
    }

    public long m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6158668", new Object[]{this})).longValue();
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "enter client getHeadRequestTime!");
        return this.E;
    }

    public long f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5b2e1e1", new Object[]{this})).longValue();
        }
        if (!this.q) {
            return 0L;
        }
        return this.n - this.o;
    }

    public String g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this}) : (this.j == null || this.j.f21320a == null) ? "" : this.j.f21320a.g();
    }

    /* loaded from: classes8.dex */
    public static final class a extends Handler implements b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final String f21329a;
        private final List<b> b;

        static {
            kge.a(2010815387);
            kge.a(37388522);
        }

        public a(String str, List<b> list) {
            super(Looper.getMainLooper());
            this.f21329a = str;
            this.b = list;
        }

        @Override // com.taobao.taobaoavsdk.cache.library.b
        public void a(File file, String str, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c808403a", new Object[]{this, file, str, new Integer(i)});
                return;
            }
            Message obtainMessage = obtainMessage();
            obtainMessage.arg1 = i;
            obtainMessage.obj = file;
            sendMessage(obtainMessage);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            for (b bVar : this.b) {
                bVar.a((File) message.obj, this.f21329a, message.arg1);
            }
        }
    }
}
