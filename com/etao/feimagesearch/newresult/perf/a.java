package com.etao.feimagesearch.newresult.perf;

import android.os.SystemClock;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.track.d;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.q;
import mtopsdk.mtop.util.MtopStatistics;
import mtopsdk.network.domain.NetworkStats;
import tb.kge;

/* loaded from: classes3.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static volatile long A;
    private static volatile long B;
    private static volatile long C;
    private static volatile long D;
    private static volatile long E;
    private static volatile long F;
    private static volatile long G;
    private static volatile long H;
    private static volatile long I;
    public static final a INSTANCE;
    private static volatile long J;
    private static volatile long K;
    private static volatile long L;
    private static volatile long M;
    private static volatile long N;
    private static volatile long O;
    private static volatile long P;
    private static volatile long Q;
    private static volatile long R;
    private static volatile long S;
    private static volatile long T;
    private static String U;
    private static volatile int V;
    private static volatile boolean W;
    private static volatile int X;
    private static volatile String Y;
    private static volatile String Z;

    /* renamed from: a  reason: collision with root package name */
    private static String f6856a;
    private static volatile int aa;
    private static volatile int ab;
    private static volatile String ac;
    private static volatile long ad;
    private static volatile long ae;
    private static volatile long af;
    private static volatile long ag;
    private static volatile long ah;
    private static String b;
    private static volatile long c;
    private static String d;
    private static volatile int e;
    private static volatile long f;
    private static volatile String g;
    private static volatile long h;
    private static volatile long i;
    private static volatile long j;
    private static volatile long k;
    private static volatile long l;
    private static volatile long m;
    private static volatile long n;
    private static volatile long o;
    private static volatile long p;
    private static volatile long q;
    private static volatile long r;
    private static volatile long s;
    private static volatile long t;
    private static volatile long u;
    private static volatile long v;
    private static volatile long w;
    private static volatile long x;
    private static volatile long y;
    private static volatile long z;

    static {
        kge.a(-747154852);
        INSTANCE = new a();
        e = -1;
        V = -1;
        X = -1;
        h = -1L;
        i = -1L;
        j = -1L;
        k = -1L;
        c = -1L;
        f = -1L;
        l = -1L;
        m = -1L;
        n = -1L;
        ab = -1;
        o = -1L;
        p = -1L;
        q = -1L;
        r = -1L;
        s = -1L;
        t = -1L;
        u = -1L;
        v = -1L;
        w = -1L;
        x = -1L;
        O = -1L;
        P = -1L;
        Q = -1L;
        S = -1L;
        I = -1L;
        J = -1L;
        K = -1L;
        L = -1L;
        M = -1L;
        T = -1L;
        af = -1L;
        ag = -1L;
        ah = -1L;
        y = -1L;
        z = -1L;
        A = -1L;
        B = -1L;
        C = -1L;
        D = -1L;
        E = -1L;
        F = -1L;
        R = -1L;
        G = -1L;
        H = -1L;
        ad = -1L;
        N = -1L;
        ae = -1L;
    }

    private a() {
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : f6856a;
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : b;
    }

    public final String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : d;
    }

    public final String g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this}) : U;
    }

    public final int e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[]{this})).intValue() : e;
    }

    public final String f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[]{this}) : g;
    }

    public final int R() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4990bcc", new Object[]{this})).intValue() : V;
    }

    public final boolean ai() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab633cb3", new Object[]{this})).booleanValue() : W;
    }

    public final int aj() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ab715423", new Object[]{this})).intValue() : X;
    }

    @JvmStatic
    public static final void a(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee2b490", new Object[]{str, str2, str3, str4});
            return;
        }
        f6856a = str;
        b = str2;
        d = str3;
        U = str4;
    }

    @JvmStatic
    public static final void a(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{new Boolean(z2)});
        } else {
            e = z2 ? 1 : 0;
        }
    }

    @JvmStatic
    public static final void a(String pagingBucket) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{pagingBucket});
            return;
        }
        q.c(pagingBucket, "pagingBucket");
        g = pagingBucket;
    }

    @JvmStatic
    public static final void c(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{new Boolean(z2)});
        } else {
            W = z2;
        }
    }

    @JvmStatic
    public static final void a(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{new Integer(i2)});
        } else {
            V = i2;
        }
    }

    @JvmStatic
    public static final void b(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{new Integer(i2)});
        } else {
            X = i2;
        }
    }

    public final long h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5cf10e3", new Object[]{this})).longValue() : h;
    }

    public final String ak() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("dfb410f", new Object[]{this}) : Y;
    }

    public final long i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5dd2864", new Object[]{this})).longValue() : j;
    }

    public final long j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5eb3fe5", new Object[]{this})).longValue() : k;
    }

    public final long c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5e", new Object[]{this})).longValue() : c;
    }

    public final long k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5f95766", new Object[]{this})).longValue() : l;
    }

    public final long l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6076ee7", new Object[]{this})).longValue() : m;
    }

    public final long m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6158668", new Object[]{this})).longValue() : n;
    }

    public final String al() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9480fbae", new Object[]{this}) : Z;
    }

    public final int am() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ab9b9aa6", new Object[]{this})).intValue() : aa;
    }

    public final int an() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("aba9b227", new Object[]{this})).intValue() : ab;
    }

    public final String ao() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("28122b8b", new Object[]{this}) : ac;
    }

    public final long n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6239de9", new Object[]{this})).longValue() : o;
    }

    public final long o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("631b56a", new Object[]{this})).longValue() : p;
    }

    public final long p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("63fcceb", new Object[]{this})).longValue() : q;
    }

    public final long q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("64de46c", new Object[]{this})).longValue() : r;
    }

    public final long r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("65bfbed", new Object[]{this})).longValue() : s;
    }

    public final long s() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("66a136e", new Object[]{this})).longValue() : t;
    }

    public final long t() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6782aef", new Object[]{this})).longValue() : u;
    }

    public final long u() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6864270", new Object[]{this})).longValue() : v;
    }

    public final long v() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("69459f1", new Object[]{this})).longValue() : w;
    }

    public final long w() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6a27172", new Object[]{this})).longValue() : x;
    }

    public final long ab() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ab00981c", new Object[]{this})).longValue() : O;
    }

    public final long ac() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ab0eaf9d", new Object[]{this})).longValue() : P;
    }

    public final long ad() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ab1cc71e", new Object[]{this})).longValue() : Q;
    }

    public final long af() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ab38f620", new Object[]{this})).longValue() : S;
    }

    public final long V() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4d169d1", new Object[]{this})).longValue() : I;
    }

    public final long W() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4df8152", new Object[]{this})).longValue() : J;
    }

    public final long X() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4ed98d3", new Object[]{this})).longValue() : K;
    }

    public final long Y() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4fbb054", new Object[]{this})).longValue() : L;
    }

    public final long Z() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("509c7d5", new Object[]{this})).longValue() : M;
    }

    public final long ag() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ab470da1", new Object[]{this})).longValue() : T;
    }

    @JvmStatic
    public static final void a(Long l2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ed6d4a7", new Object[]{l2});
        } else if (l2 == null) {
        } else {
            l2.longValue();
            h = l2.longValue();
        }
    }

    @JvmStatic
    public static final void b(String size) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{size});
            return;
        }
        q.c(size, "size");
        Y = size;
    }

    @JvmStatic
    public static final void b(Long l2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b6fca28", new Object[]{l2});
        } else if (l2 == null) {
        } else {
            l2.longValue();
            i = l2.longValue();
        }
    }

    @JvmStatic
    public static final void c(Long l2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7808bfa9", new Object[]{l2});
        } else if (l2 == null) {
        } else {
            l2.longValue();
            j = l2.longValue();
        }
    }

    @JvmStatic
    public static final void d(Long l2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84a1b52a", new Object[]{l2});
        } else if (l2 == null) {
        } else {
            l2.longValue();
            k = l2.longValue();
        }
    }

    @JvmStatic
    public static final void l(Long l2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9696132", new Object[]{l2});
        } else if (l2 == null) {
        } else {
            l2.longValue();
            c = l2.longValue();
        }
    }

    @JvmStatic
    public static final void g(Long l2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa6c95ad", new Object[]{l2});
        } else if (l2 == null) {
        } else {
            l2.longValue();
            n = l2.longValue();
        }
    }

    @JvmStatic
    public static final void c(String size) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{size});
            return;
        }
        q.c(size, "size");
        Z = size;
    }

    @JvmStatic
    public static final void c(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{new Integer(i2)});
        } else {
            aa = i2;
        }
    }

    @JvmStatic
    public static final void d(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad401d78", new Object[]{new Integer(i2)});
        } else {
            ab = i2;
        }
    }

    @JvmStatic
    public static final void d(String compressFormatType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{compressFormatType});
            return;
        }
        q.c(compressFormatType, "compressFormatType");
        ac = compressFormatType;
    }

    @JvmStatic
    public static final void h(Long l2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7058b2e", new Object[]{l2});
        } else if (l2 == null) {
        } else {
            l2.longValue();
            o = l2.longValue();
        }
    }

    @JvmStatic
    public static final void i(Long l2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c39e80af", new Object[]{l2});
        } else if (l2 == null) {
        } else {
            l2.longValue();
            p = l2.longValue();
        }
    }

    @JvmStatic
    public static final void a(MtopStatistics mtopStatistics) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d428be89", new Object[]{mtopStatistics});
        } else if (mtopStatistics == null) {
        } else {
            r = mtopStatistics.totalTime;
            NetworkStats networkStats = mtopStatistics.getNetworkStats();
            if (networkStats == null) {
                return;
            }
            s = networkStats.oneWayTime_ANet;
            w = networkStats.serverRT;
            v = networkStats.recvSize;
            u = networkStats.recDataTime;
            x = networkStats.sendSize;
        }
    }

    @JvmStatic
    public static final void j(Long l2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0377630", new Object[]{l2});
        } else if (l2 == null) {
        } else {
            l2.longValue();
            q = l2.longValue();
        }
    }

    @JvmStatic
    public static final void k(Long l2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcd06bb1", new Object[]{l2});
        } else if (l2 == null) {
        } else {
            l2.longValue();
            t = l2.longValue();
        }
    }

    private final void S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a7235a", new Object[]{this});
            return;
        }
        h = -1L;
        String str = null;
        Y = str;
        j = -1L;
        k = -1L;
        c = -1L;
        l = -1L;
        m = -1L;
        n = -1L;
        Z = str;
        ab = -1;
        aa = 0;
        ac = str;
        o = -1L;
        p = -1L;
        q = -1L;
        r = -1L;
        s = -1L;
        t = -1L;
        u = -1L;
        v = -1L;
        w = -1L;
        x = -1L;
        L = -1L;
        J = -1L;
        I = -1L;
        K = -1L;
        M = -1L;
        T = -1L;
    }

    public final long x() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6b088f3", new Object[]{this})).longValue() : y;
    }

    public final long y() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6bea074", new Object[]{this})).longValue() : z;
    }

    public final long z() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6ccb7f5", new Object[]{this})).longValue() : A;
    }

    public final long A() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3a97c3c", new Object[]{this})).longValue() : B;
    }

    public final long B() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3b793bd", new Object[]{this})).longValue() : C;
    }

    public final long C() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3c5ab3e", new Object[]{this})).longValue() : D;
    }

    public final long D() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3d3c2bf", new Object[]{this})).longValue() : E;
    }

    public final long E() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3e1da40", new Object[]{this})).longValue() : F;
    }

    public final long ae() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ab2ade9f", new Object[]{this})).longValue() : R;
    }

    public final long F() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3eff1c1", new Object[]{this})).longValue() : G;
    }

    public final long G() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3fe0942", new Object[]{this})).longValue() : H;
    }

    public final long ap() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("abc5e12a", new Object[]{this})).longValue() : ad;
    }

    public final long aa() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("aaf2809b", new Object[]{this})).longValue() : N;
    }

    public final long aq() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("abd3f8ab", new Object[]{this})).longValue() : ae;
    }

    @JvmStatic
    public static final void ar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abe21038", new Object[0]);
        } else {
            af = SystemClock.elapsedRealtime();
        }
    }

    @JvmStatic
    public static final void as() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abf027b9", new Object[0]);
        } else {
            ag = SystemClock.elapsedRealtime();
        }
    }

    @JvmStatic
    public static final void at() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abfe3f3a", new Object[0]);
        } else {
            ah = SystemClock.elapsedRealtime();
        }
    }

    @JvmStatic
    public static final void H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40c20cf", new Object[0]);
            return;
        }
        U();
        y = SystemClock.elapsedRealtime();
    }

    @JvmStatic
    public static final void I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41a3850", new Object[0]);
            return;
        }
        if (y <= 0 || SystemClock.elapsedRealtime() - y > 10000) {
            H();
        }
        z = SystemClock.elapsedRealtime();
    }

    @JvmStatic
    public static final void J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4284fd1", new Object[0]);
        } else {
            A = SystemClock.elapsedRealtime();
        }
    }

    @JvmStatic
    public static final void K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4366752", new Object[0]);
        } else {
            B = SystemClock.elapsedRealtime();
        }
    }

    @JvmStatic
    public static final void L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4447ed3", new Object[0]);
        } else {
            C = SystemClock.elapsedRealtime();
        }
    }

    @JvmStatic
    public static final void M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4529654", new Object[0]);
        } else {
            D = SystemClock.elapsedRealtime();
        }
    }

    @JvmStatic
    public static final void N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("460add5", new Object[0]);
        } else {
            E = SystemClock.elapsedRealtime();
        }
    }

    @JvmStatic
    public static final void O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46ec556", new Object[0]);
            return;
        }
        F = SystemClock.elapsedRealtime();
        R = System.currentTimeMillis();
    }

    @JvmStatic
    public static final void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{jSONObject});
        } else if (jSONObject == null) {
        } else {
            O = com.taobao.android.searchbaseframe.util.a.a(jSONObject, "irpHybridDataTransferEnd", 0L);
            P = com.taobao.android.searchbaseframe.util.a.a(jSONObject, "irpHybridPageProcessEnd", 0L);
            Q = com.taobao.android.searchbaseframe.util.a.a(jSONObject, "irpHybridListProcessEnd", 0L);
        }
    }

    @JvmStatic
    public static final void P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47cdcd7", new Object[0]);
            return;
        }
        G = SystemClock.elapsedRealtime();
        S = System.currentTimeMillis();
    }

    @JvmStatic
    public static final void Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48af458", new Object[0]);
            return;
        }
        H = SystemClock.elapsedRealtime();
        ad = SystemClock.uptimeMillis();
        b(false);
    }

    @JvmStatic
    public static final void a(d event) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63e35165", new Object[]{event});
            return;
        }
        q.c(event, "event");
        N = SystemClock.elapsedRealtime();
        ae = SystemClock.uptimeMillis();
        K = event.i;
        I = event.g;
        J = event.j;
        L = event.k;
        M = event.u - event.t;
        b(false);
    }

    @JvmStatic
    public static final void ah() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab55252e", new Object[0]);
        } else {
            T = SystemClock.elapsedRealtime();
        }
    }

    private final void T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b53adb", new Object[]{this});
            return;
        }
        y = -1L;
        z = -1L;
        A = -1L;
        B = -1L;
        C = -1L;
        D = -1L;
        E = -1L;
        G = -1L;
        H = -1L;
        ad = -1L;
        N = -1L;
        ae = -1L;
        R = -1L;
        O = -1L;
        Q = -1L;
        P = -1L;
        F = -1L;
        S = -1L;
    }

    @JvmStatic
    private static final void U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c3525c", new Object[0]);
            return;
        }
        String str = null;
        f6856a = str;
        b = str;
        d = str;
        e = -1;
        g = str;
        U = str;
        W = false;
        V = -1;
        X = -1;
        INSTANCE.S();
        INSTANCE.T();
    }

    @JvmStatic
    public static final void b(boolean z2) {
        IpChange ipChange = $ipChange;
        boolean z3 = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{new Boolean(z2)});
            return;
        }
        if (y > 0 || G <= 0) {
            long j2 = G - z;
            if (j2 >= 200 && j2 <= 10000) {
                z3 = false;
            }
        }
        if (z3) {
            U();
        } else if (!z2 && (H <= 0 || N <= 0)) {
        } else {
            b.a(INSTANCE);
            U();
        }
    }
}
