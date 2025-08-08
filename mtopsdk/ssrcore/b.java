package mtopsdk.ssrcore;

import android.os.Handler;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.fulltrace.FullTraceAnalysis;
import com.taobao.analysis.v3.FalcoGlobalTracer;
import com.taobao.analysis.v3.r;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import mtopsdk.common.util.MtopUtils;
import mtopsdk.common.util.StringUtils;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.common.MtopNetworkProp;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.util.MtopSDKThreadPoolExecutorFactory;
import mtopsdk.ssrcore.callback.SsrCallbackImpl;
import mtopsdk.ssrcore.util.SsrLoginOption;
import tb.mtc;
import tb.mtj;
import tb.mtk;
import tb.mys;
import tb.ryi;
import tb.rzf;
import tb.rzq;

/* loaded from: classes9.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static AtomicInteger h = new AtomicInteger(0);

    /* renamed from: a  reason: collision with root package name */
    public MtopSsrStatistics f25033a;
    private final String f;
    private Mtop i;
    private mtj j;
    private volatile boolean k;
    private rzq l;
    private mtc m;
    private c o;
    private ConcurrentHashMap<String, b> p;
    public final MtopNetworkProp b = new MtopNetworkProp();
    private AtomicBoolean g = new AtomicBoolean(false);
    public int c = 0;
    public long d = 0;
    private String n = SsrLoginOption.SILENT_UI;
    public int e = 0;

    public static /* synthetic */ AtomicBoolean a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("71d22952", new Object[]{bVar}) : bVar.g;
    }

    public static /* synthetic */ mtj b(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (mtj) ipChange.ipc$dispatch("f86ab8b2", new Object[]{bVar}) : bVar.j;
    }

    public static /* synthetic */ mtc c(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (mtc) ipChange.ipc$dispatch("d53801a", new Object[]{bVar}) : bVar.m;
    }

    public static /* synthetic */ Mtop d(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Mtop) ipChange.ipc$dispatch("8428c0e0", new Object[]{bVar}) : bVar.i;
    }

    private b(Mtop mtop, mtj mtjVar, String str) {
        this.i = mtop;
        this.j = mtjVar;
        this.b.ttid = str;
        this.f25033a = new MtopSsrStatistics(mtop.getMtopConfig().uploadStats);
        this.f = j();
    }

    public static b a(Mtop mtop, mtj mtjVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("234889d8", new Object[]{mtop, mtjVar}) : a(mtop, mtjVar, (String) null);
    }

    public static b a(Mtop mtop, mtj mtjVar, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("fed495a2", new Object[]{mtop, mtjVar, str}) : new b(mtop, mtjVar, str);
    }

    private String j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6aaa74cf", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder(16);
        sb.append(Mtop.Id.SSR);
        sb.append(h.incrementAndGet());
        sb.append('.');
        sb.append(this.f25033a.I);
        return sb.toString();
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f;
    }

    public b a(mtc mtcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("4f75c426", new Object[]{this, mtcVar});
        }
        this.m = mtcVar;
        return this;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.j == null) {
            TBSdkLog.e("ssr.SsrBusiness", this.f, "SsrRequest is null");
        } else {
            if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                String str = this.f;
                TBSdkLog.i("ssr.SsrBusiness", str, "startRequest " + this.j);
            }
            this.k = false;
            this.f25033a.f25028a = false;
            this.d = System.currentTimeMillis();
            this.l = k();
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        mtj mtjVar = this.j;
        if (mtjVar == null || mtjVar.e <= 0) {
            return;
        }
        MtopSDKThreadPoolExecutorFactory.getSsrScheduledExecutorService().schedule(new Runnable() { // from class: mtopsdk.ssrcore.b.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (!b.a(b.this).compareAndSet(false, true) || b.this.e()) {
                } else {
                    b.this.d();
                    mtopsdk.ssrcore.util.b.a(b.b(b.this), b.c(b.this), b.this.b.handler, new mtk.a().a(417).a("SSRE_TIMEOUT").b("请求超时").a());
                }
            }
        }, this.j.e, TimeUnit.MILLISECONDS);
    }

    private rzq k() {
        String createRequest;
        mys a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rzq) ipChange.ipc$dispatch("5bfac4cb", new Object[]{this});
        }
        MtopSsrStatistics mtopSsrStatistics = this.f25033a;
        mtopSsrStatistics.u = mtopSsrStatistics.a();
        final c l = l();
        this.o = l;
        l.i = new rzq(null, l);
        try {
            if (Mtop.mIsFullTrackValid) {
                if (!StringUtils.isEmpty(this.b.fullTraceId)) {
                    createRequest = this.b.fullTraceId;
                } else {
                    createRequest = FullTraceAnalysis.getInstance().createRequest("mtop_ssr");
                }
                r rVar = FalcoGlobalTracer.get();
                if (rVar != null) {
                    r.a a3 = rVar.a("mtop_ssr", "MTOP_SSR_UnknownScene");
                    if (this.b.openTraceContext != null && !this.b.openTraceContext.isEmpty() && (a2 = rVar.a(this.b.openTraceContext)) != null) {
                        a3.a(a2);
                    }
                    l.d.M = a3.d();
                }
                if (!StringUtils.isEmpty(createRequest)) {
                    l.d.N = createRequest;
                    l.d.e();
                    d.a(l.d, l.g.f31244a);
                }
            }
            if (!MtopUtils.isMainThread() && this.i.isInited()) {
                l.d.v = this.f25033a.a();
                d.a(l.d);
                ryi ryiVar = this.i.getMtopConfig().mFilterManager;
                if (ryiVar instanceof rzf) {
                    ((rzf) ryiVar).a(null, l);
                }
                mtopsdk.ssrcore.util.b.a(ryiVar, l);
                return l.i;
            }
            MtopSDKThreadPoolExecutorFactory.getRequestThreadPoolExecutor().submit(new Runnable() { // from class: mtopsdk.ssrcore.b.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    d.a(l.d);
                    l.d.v = b.this.f25033a.a();
                    b.d(b.this).checkMtopSDKInit();
                    ryi ryiVar2 = b.d(b.this).getMtopConfig().mFilterManager;
                    if (ryiVar2 instanceof rzf) {
                        ((rzf) ryiVar2).a(null, l);
                    }
                    mtopsdk.ssrcore.util.b.a(ryiVar2, l);
                }
            });
            return l.i;
        } catch (Throwable unused) {
            return l.i;
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            TBSdkLog.i("ssr.SsrBusiness", this.f, this.j.f31244a);
        }
        ConcurrentHashMap<String, b> concurrentHashMap = this.p;
        if (concurrentHashMap != null && concurrentHashMap.size() > 0) {
            this.p.remove(this.j.f31244a);
        }
        this.k = true;
        rzq rzqVar = this.l;
        if (rzqVar == null) {
            return;
        }
        try {
            rzqVar.a();
        } catch (Throwable th) {
            TBSdkLog.w("ssr.SsrBusiness", this.f, this.j.f31244a, th);
        }
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : this.k;
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            TBSdkLog.i("ssr.SsrBusiness", this.f, this.j.f31244a);
        }
        this.c++;
        d();
        b();
    }

    public int g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c0f961", new Object[]{this})).intValue() : this.c;
    }

    private c l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("f7a521bc", new Object[]{this});
        }
        c cVar = new c();
        cVar.j = this.i;
        MtopSsrStatistics mtopSsrStatistics = this.f25033a;
        cVar.d = mtopSsrStatistics;
        cVar.b = mtopSsrStatistics.I;
        cVar.g = this.j;
        cVar.f25036a = this.b;
        cVar.k = new SsrCallbackImpl(this);
        cVar.h = this;
        if (StringUtils.isBlank(cVar.f25036a.ttid)) {
            cVar.f25036a.ttid = this.i.getTtid();
        }
        return cVar;
    }

    public void a(mtj mtjVar, int i, Map<String, List<String>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af425877", new Object[]{this, mtjVar, new Integer(i), map});
            return;
        }
        this.g.compareAndSet(false, true);
        if (this.k) {
            TBSdkLog.w("ssr.SsrBusiness", this.f, "doResponse request is cancelled,don't callback listener.");
            return;
        }
        mtc mtcVar = this.m;
        if (mtcVar == null) {
            return;
        }
        mtcVar.onResponse(mtjVar, i, map);
    }

    public void a(mtj mtjVar, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f00b3dc", new Object[]{this, mtjVar, bArr});
            return;
        }
        this.g.compareAndSet(false, true);
        if (this.k) {
            TBSdkLog.w("ssr.SsrBusiness", this.f, "doReceiveData request is cancelled,don't callback listener.");
            return;
        }
        mtc mtcVar = this.m;
        if (mtcVar == null) {
            return;
        }
        mtcVar.onReceiveData(mtjVar, bArr);
    }

    public void a(mtk mtkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f52974b4", new Object[]{this, mtkVar});
            return;
        }
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("doFinish request=");
            sb.append(this.j);
            if (mtkVar != null) {
                sb.append(", retCode=");
                sb.append(mtkVar.b);
            }
            TBSdkLog.i("ssr.SsrBusiness", this.f, sb.toString());
        }
        if (this.k) {
            TBSdkLog.w("ssr.SsrBusiness", this.f, "doFinish request is cancelled,don't callback listener.");
            return;
        }
        this.g.compareAndSet(false, true);
        mtc mtcVar = this.m;
        if (mtcVar != null) {
            if (mtkVar != null) {
                if (mtkVar.f31246a == 200 && (StringUtils.isEmpty(mtkVar.b) || StringUtils.equals(mtkVar.b, "SUCCESS"))) {
                    this.m.onFinish(this.j);
                } else {
                    this.m.onError(this.j, mtkVar);
                }
            } else {
                mtcVar.onError(this.j, mtkVar);
            }
            long a2 = this.f25033a.a();
            MtopSsrStatistics mtopSsrStatistics = this.f25033a;
            mtopSsrStatistics.R = a2 - mtopSsrStatistics.y;
            MtopSsrStatistics mtopSsrStatistics2 = this.f25033a;
            mtopSsrStatistics2.S = a2 - mtopSsrStatistics2.u;
        }
        ConcurrentHashMap<String, b> concurrentHashMap = this.p;
        if (concurrentHashMap == null || concurrentHashMap.size() <= 0) {
            return;
        }
        this.p.remove(this.j.f31244a);
    }

    public b a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("ab910e47", new Object[]{this, map});
        }
        if (map != null && !map.isEmpty()) {
            if (this.b.requestHeaders != null) {
                this.b.requestHeaders.putAll(map);
            } else {
                this.b.requestHeaders = map;
            }
        }
        return this;
    }

    public b h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("cedebc99", new Object[]{this});
        }
        this.b.wuaFlag = 4;
        return this;
    }

    public b a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("ad14cd1c", new Object[]{this, str});
        }
        this.n = str;
        return this;
    }

    public b a(Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("8594b02", new Object[]{this, handler});
        }
        this.b.handler = handler;
        return this;
    }

    public String i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e424ba30", new Object[]{this}) : this.n;
    }

    public void a(ConcurrentHashMap<String, b> concurrentHashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("347f5c38", new Object[]{this, concurrentHashMap});
        } else {
            this.p = concurrentHashMap;
        }
    }
}
