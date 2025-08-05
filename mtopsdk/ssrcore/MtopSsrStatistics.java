package mtopsdk.ssrcore;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.fulltrace.FullTraceAnalysis;
import com.taobao.analysis.v3.k;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import mtopsdk.common.util.MtopUtils;
import mtopsdk.common.util.StringUtils;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.stat.IUploadStats;
import mtopsdk.mtop.util.MtopSDKThreadPoolExecutorFactory;
import mtopsdk.network.domain.NetworkStats;

/* loaded from: classes9.dex */
public class MtopSsrStatistics implements Cloneable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static volatile AtomicBoolean aa = new AtomicBoolean(false);
    public long A;
    public long B;
    public long C;
    public long D;
    public long E;
    public long F;
    public NetworkStats H;
    public String K;
    public String L;
    public Object M;
    public String N;
    public String O;
    public String P;
    public long Q;
    public long R;
    public long S;
    public String T;
    public String U;
    public String V;
    public String W;
    public String X;
    public String Y;
    private a Z;
    private IUploadStats ab;
    public long ac;
    public long ad;
    public long ae;
    public long af;
    public long b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;
    public long k;
    public long l;
    public long m;
    public long n;
    public long o;
    public long p;
    public int q;
    public String r;
    public boolean s;
    public long u;
    public long v;
    public long w;
    public long x;
    public long y;
    public long z;

    /* renamed from: a  reason: collision with root package name */
    public boolean f25028a = true;
    public int t = 0;
    public String G = "";
    public int J = MtopUtils.createSsrIntSeqNo();
    public final String I = Mtop.Id.SSR + this.J;

    /* loaded from: classes9.dex */
    public interface RetType {
        public static final int NETWORK_ERROR = 1;
        public static final int SUCCESS = 0;

        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: classes9.dex */
        public @interface Definition {
        }
    }

    public static /* synthetic */ void a(MtopSsrStatistics mtopSsrStatistics) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29b95347", new Object[]{mtopSsrStatistics});
        } else {
            mtopSsrStatistics.h();
        }
    }

    public MtopSsrStatistics(IUploadStats iUploadStats) {
        this.ab = iUploadStats;
    }

    public long a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5c", new Object[]{this})).longValue() : System.nanoTime() / 1000000;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.w = a();
        long j = this.w;
        long j2 = this.u;
        this.b = j - j2;
        long j3 = this.v;
        long j4 = 0;
        this.d = j3 > j2 ? j3 - j2 : 0L;
        if (this.y == 0) {
            this.y = a();
        }
        if (this.p == 0) {
            this.p = a();
        }
        long j5 = this.p;
        long j6 = this.u;
        this.o = j5 - j6;
        this.af = this.ae - j6;
        long j7 = this.y;
        this.c = j7 - this.x;
        long j8 = this.z;
        if (j8 > j7) {
            j4 = j8 - j7;
        }
        this.h = j4;
        this.e = this.j - this.v;
        long j9 = this.x;
        this.f = j9 - this.k;
        this.g = this.w - this.z;
        this.Q = j9 - this.u;
        StringBuilder sb = new StringBuilder(128);
        sb.append("url=");
        sb.append(this.O);
        sb.append(",httpResponseStatus=");
        sb.append(this.q);
        sb.append(",retCode=");
        sb.append(this.r);
        sb.append(",retType=");
        sb.append(this.t);
        sb.append(",eagleEyeTraceId=");
        sb.append(this.L);
        sb.append(",ssrTotalTime=");
        sb.append(this.b);
        sb.append(",waitExecuteTime=");
        sb.append(this.d);
        sb.append(",waitExecute2BuildParamTime=");
        sb.append(this.e);
        sb.append(",buildParamsTime=");
        sb.append(this.i);
        sb.append(",buildParams2NetworkTime=");
        sb.append(this.f);
        sb.append(",networkTotalTime=");
        sb.append(this.c);
        sb.append(",waitCallbackTime=");
        sb.append(this.h);
        sb.append(",startCallBack2EndTime=");
        sb.append(this.g);
        sb.append(",computeSignTime=");
        sb.append(this.l);
        sb.append(",firstResponseTime=");
        sb.append(this.o);
        sb.append(",firstChunkDuration=");
        sb.append(this.af);
        sb.append(",firstChunkSize=");
        sb.append("firstChunkSize");
        sb.append(",tokenValid=");
        sb.append(this.T);
        sb.append(",serviceDomain=");
        sb.append(this.U);
        sb.append(",serviceIps=");
        sb.append(this.V);
        sb.append(",serviceUnit=");
        sb.append(this.W);
        sb.append(",serviceERCorrection=");
        sb.append(this.X);
        sb.append(",deviceLevel=");
        sb.append(this.Y);
        if (this.H != null) {
            sb.append(",");
            if (StringUtils.isBlank(this.H.netStatSum)) {
                sb.append(this.H.sumNetStat());
            } else {
                sb.append(this.H.netStatSum);
            }
        }
        this.G = sb.toString();
        if (this.f25028a) {
            if (MtopUtils.isMainThread()) {
                MtopSDKThreadPoolExecutorFactory.submit(new Runnable() { // from class: mtopsdk.ssrcore.MtopSsrStatistics.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            MtopSsrStatistics.a(MtopSsrStatistics.this);
                        }
                    }
                });
            } else {
                h();
            }
        }
        if (!TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            return;
        }
        TBSdkLog.i("ssr.MtopSsrStatistics", this.I, toString());
    }

    public NetworkStats c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (NetworkStats) ipChange.ipc$dispatch("6f46513d", new Object[]{this}) : this.H;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        this.f25028a = z;
        if (!this.f25028a) {
            return;
        }
        if (MtopUtils.isMainThread()) {
            MtopSDKThreadPoolExecutorFactory.submit(new Runnable() { // from class: mtopsdk.ssrcore.MtopSsrStatistics.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        MtopSsrStatistics.a(MtopSsrStatistics.this);
                    }
                }
            });
        } else {
            h();
        }
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else if (this.ab == null) {
        } else {
            if (aa.compareAndSet(false, true)) {
                i();
            }
            try {
                HashMap hashMap = new HashMap();
                hashMap.put(com.taobao.mtop.wvplugin.a.RESULT_KEY, this.r);
                hashMap.put("retType", String.valueOf(this.t));
                hashMap.put("httpResponseStatus", String.valueOf(this.q));
                hashMap.put("traceId", this.N);
                hashMap.put("serverTraceId", this.K);
                hashMap.put("eagleEyeTraceId", this.L);
                hashMap.put("url", this.O);
                hashMap.put("domain", this.P);
                hashMap.put("tokenValid", this.T);
                hashMap.put("serviceDomain", this.U);
                hashMap.put("serviceIps", this.V);
                hashMap.put("serviceUnit", this.W);
                hashMap.put("serviceERCorrection", this.X);
                hashMap.put("deviceLevel", this.Y);
                NetworkStats c = c();
                if (c != null) {
                    hashMap.put("connType", c.connectionType);
                    hashMap.put("isSSL", c.isSSL ? "1" : "0");
                    hashMap.put("retryTimes", String.valueOf(c.retryTimes));
                    hashMap.put("ip_port", c.ip_port);
                }
                HashMap hashMap2 = new HashMap();
                hashMap2.put("totalTime", Double.valueOf(this.b));
                hashMap2.put("networkExeTime", Double.valueOf(this.c));
                hashMap2.put("waitExecuteTime", Double.valueOf(this.d));
                hashMap2.put("waitCallbackTime", Double.valueOf(this.h));
                hashMap2.put("waitExecute2BuildParamTime", Double.valueOf(this.e));
                hashMap2.put("buildParamsTime", Double.valueOf(this.i));
                hashMap2.put("buildParams2NetworkTime", Double.valueOf(this.f));
                hashMap2.put("startCallBack2EndTime", Double.valueOf(this.g));
                hashMap2.put("signTime", Double.valueOf(this.l));
                hashMap2.put("callbackPocTime", Double.valueOf(this.R));
                hashMap2.put("allTime", Double.valueOf(this.S));
                hashMap2.put("requestPocTime", Double.valueOf(this.Q));
                hashMap2.put("firstResponseTime", Double.valueOf(this.o));
                hashMap2.put("firstChunkDuration", Double.valueOf(this.af));
                hashMap2.put("firstChunkSize", Double.valueOf(this.ad));
                if (c != null) {
                    hashMap2.put("processTime", Double.valueOf(c.processTime));
                    hashMap2.put("firstDataTime", Double.valueOf(c.firstDataTime));
                    hashMap2.put("recDataTime", Double.valueOf(c.recDataTime));
                    hashMap2.put("oneWayTime_ANet", Double.valueOf(c.oneWayTime_ANet));
                    hashMap2.put("serverRT", Double.valueOf(c.serverRT));
                    hashMap2.put("sendSize", Double.valueOf(c.sendSize));
                    hashMap2.put("revSize", Double.valueOf(c.recvSize));
                    hashMap2.put("dataSpeed", Double.valueOf(c.dataSpeed));
                }
                if (this.Z != null) {
                    hashMap2.put("mtopDispatchTime", Double.valueOf(this.Z.b));
                    hashMap2.put("bizCallbackTime", Double.valueOf(this.Z.c));
                    hashMap2.put("mtopReqTime", Double.valueOf(this.Z.f25031a));
                }
                if (this.ab != null) {
                    this.ab.onCommit("mtopsdk_ssr", "ssrStats", hashMap, hashMap2);
                }
            } catch (Throwable th) {
                try {
                    String str = this.I;
                    TBSdkLog.e("ssr.MtopSsrStatistics", str, "[commitStatData] commit mtopStats error ---" + th.toString());
                } finally {
                    this.f25028a = false;
                }
            }
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder(128);
        sb.append("MtopSsrStatistics ");
        sb.append(hashCode());
        sb.append("[SumStat(ms)]:");
        sb.append(this.G);
        if (this.Z != null) {
            sb.append(" [rbStatData]:");
            sb.append(this.Z);
        }
        return sb.toString();
    }

    public synchronized a d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("689fa4ad", new Object[]{this});
        }
        if (this.Z == null) {
            this.Z = new a();
        }
        return this.Z;
    }

    public Object clone() throws CloneNotSupportedException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("78b3604e", new Object[]{this}) : super.clone();
    }

    private void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        try {
            if (this.ab == null) {
                TBSdkLog.e("ssr.MtopSsrStatistics", this.I, "[registerMtopStats]register MtopStats error, uploadStats=null");
                return;
            }
            HashSet hashSet = new HashSet();
            hashSet.add("url");
            hashSet.add("domain");
            hashSet.add("httpResponseStatus");
            hashSet.add(com.taobao.mtop.wvplugin.a.RESULT_KEY);
            hashSet.add("retType");
            hashSet.add("traceId");
            hashSet.add("serverTraceId");
            hashSet.add("eagleEyeTraceId");
            hashSet.add("connType");
            hashSet.add("isSSL");
            hashSet.add("retryTimes");
            hashSet.add("ip_port");
            hashSet.add("tokenValid");
            hashSet.add("serviceDomain");
            hashSet.add("serviceIps");
            hashSet.add("serviceUnit");
            hashSet.add("serviceERCorrection");
            hashSet.add("deviceLevel");
            HashSet hashSet2 = new HashSet();
            hashSet2.add("totalTime");
            hashSet2.add("waitExecuteTime");
            hashSet2.add("waitExecute2BuildParamTime");
            hashSet2.add("buildParamsTime");
            hashSet2.add("buildParams2NetworkTime");
            hashSet2.add("networkExeTime");
            hashSet2.add("waitCallbackTime");
            hashSet2.add("startCallBack2EndTime");
            hashSet2.add("signTime");
            hashSet2.add("requestPocTime");
            hashSet2.add("callbackPocTime");
            hashSet2.add("allTime");
            hashSet2.add("firstResponseTime");
            hashSet2.add("firstChunkDuration");
            hashSet2.add("firstChunkSize");
            hashSet2.add("toMainThTime");
            hashSet2.add("mtopDispatchTime");
            hashSet2.add("bizCallbackTime");
            hashSet2.add("mtopReqTime");
            hashSet2.add("processTime");
            hashSet2.add("firstDataTime");
            hashSet2.add("recDataTime");
            hashSet2.add("revSize");
            hashSet2.add("sendSize");
            hashSet2.add("dataSpeed");
            hashSet2.add("oneWayTime_ANet");
            hashSet2.add("serverRT");
            if (this.ab != null) {
                this.ab.onRegister("mtopsdk_ssr", "ssrStats", hashSet, hashSet2, false);
            }
            String str = this.I;
            TBSdkLog.i("ssr.MtopSsrStatistics", str, "[registerMtopStats]register MtopStats executed.uploadStats=" + this.ab);
        } catch (Throwable th) {
            String str2 = this.I;
            TBSdkLog.e("ssr.MtopSsrStatistics", str2, "[registerMtopStats] register MtopStats error ---" + th.toString());
        }
    }

    /* loaded from: classes9.dex */
    public class a implements Cloneable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public long f25031a;
        public long b;
        public long c;

        private a() {
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            StringBuilder sb = new StringBuilder(64);
            sb.append(",mtopReqTime=");
            sb.append(this.f25031a);
            sb.append(",mtopDispatchTime=");
            sb.append(this.b);
            sb.append(",bizCallbackTime=");
            sb.append(this.c);
            return sb.toString();
        }

        public Object clone() throws CloneNotSupportedException {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("78b3604e", new Object[]{this}) : super.clone();
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (this.I == null) {
        } else {
            TBSdkLog.e("mtopsdk_ssr", this.I, "[falcoId:" + this.N + "] |start");
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else if (this.I == null) {
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("[falcoId:");
            sb.append(this.N);
            sb.append("] ");
            sb.append("|");
            sb.append("MtopSsrStatistics,");
            sb.append(this.G);
            TBSdkLog.e("mtopsdk_ssr", this.I, sb.toString());
            d.a(this.M, sb.toString());
        }
    }

    public void g() {
        String str;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else if (!Mtop.mIsFullTrackValid) {
        } else {
            f();
            try {
                com.taobao.analysis.fulltrace.b bVar = new com.taobao.analysis.fulltrace.b();
                bVar.f8567a = this.O;
                bVar.b = this.P;
                if (this.q != -8 && !this.s) {
                    if (this.t == 0) {
                        i = 1;
                    }
                    bVar.g = i;
                    bVar.h = this.A;
                    bVar.i = this.B;
                    bVar.r = this.C;
                    bVar.s = this.D;
                    bVar.t = this.E;
                    bVar.u = this.F;
                    bVar.G = this.L;
                    bVar.L = this.r;
                    bVar.U = this.l;
                    bVar.W = this.ac;
                    bVar.X = this.ad;
                    bVar.S = true;
                    FullTraceAnalysis.getInstance().commitRequest(this.N, "mtop_ssr", bVar);
                    if (this.M == null || !(this.M instanceof k)) {
                    }
                    k kVar = (k) this.M;
                    kVar.a(Long.valueOf(this.A));
                    kVar.b(Long.valueOf(this.B));
                    if (this.H != null) {
                        kVar.a(this.H.serverRT);
                    }
                    kVar.f(Long.valueOf(this.C));
                    kVar.g(Long.valueOf(this.D));
                    kVar.h(Long.valueOf(this.E));
                    kVar.i(Long.valueOf(this.F));
                    kVar.a("falcoId", this.N);
                    if (this.H != null) {
                        k.HOST.a(kVar, this.H.host);
                        k.PROTOCOL_TYPE.a(kVar, this.H.connectionType);
                        k.RETRY_TIMES.a(kVar, Integer.valueOf(this.H.retryTimes));
                    }
                    k.RET.a(kVar, Integer.valueOf(bVar.g));
                    k.BIZ_ID.a(kVar, bVar.d);
                    k.SERVER_TRACE_ID.a(kVar, this.L);
                    k.ERROR_CODE.a(kVar, this.r);
                    k.MTOP_SIGN_TIME.a(kVar, Long.valueOf(this.l));
                    k.MTOP_BIZ_FIRST_CHUNK_TIME.a(kVar, Long.valueOf(this.ac));
                    k.MTOP_BIZ_FIRST_CHUNK_INFLATE_SIZE.a(kVar, Long.valueOf(this.ad));
                    if (this.q != -8 && !this.s) {
                        str = this.t == 0 ? "succeed" : "failed";
                        kVar.b(str);
                        return;
                    }
                    str = "cancel";
                    kVar.b(str);
                    return;
                }
                bVar.g = 2;
                bVar.h = this.A;
                bVar.i = this.B;
                bVar.r = this.C;
                bVar.s = this.D;
                bVar.t = this.E;
                bVar.u = this.F;
                bVar.G = this.L;
                bVar.L = this.r;
                bVar.U = this.l;
                bVar.W = this.ac;
                bVar.X = this.ad;
                bVar.S = true;
                FullTraceAnalysis.getInstance().commitRequest(this.N, "mtop_ssr", bVar);
                if (this.M == null) {
                }
            } catch (Throwable unused) {
                TBSdkLog.e("mtopsdk_ssr", this.I, "FullTrack sdk version not compatible");
            }
        }
    }
}
