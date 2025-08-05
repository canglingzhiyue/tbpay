package com.taobao.phenix.request;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.kge;
import tb.nec;
import tb.njd;
import tb.riy;

/* loaded from: classes7.dex */
public class ImageStatistics {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_BITMAP_DECODE = "decode";
    public static final String KEY_BITMAP_PROCESS = "bitmapProcess";
    public static final String KEY_BITMAP_SCALE = "scaleTime";
    public static final String KEY_DECODE_WAIT_SIZE = "decodeWaitSize";
    public static final String KEY_MASTER_WAIT_SIZE = "masterWaitSize";
    public static final String KEY_NETWORK_CONNECT = "connect";
    public static final String KEY_NETWORK_DOWNLOAD = "download";
    public static final String KEY_NETWORK_WAIT_SIZE = "networkWaitSize";
    public static final String KEY_READ_DISK_CACHE = "cacheLookup";
    public static final String KEY_READ_LOCAL_FILE = "localFile";
    public static final String KEY_READ_MEMORY_CACHE = "memoryLookup";
    public static final String KEY_SCHEDULE_TIME = "scheduleTime";
    public static final String KEY_TOTAL_TIME = "totalTime";
    public static final String KEY_WAIT_FOR_MAIN = "waitForMain";
    private final c A;
    private FromType B;
    private nec C;
    private int D;
    private Map<String, String> E;
    private Map<String, Integer> F;
    private long G;
    private int H;
    private int I;
    private int J;
    private int K;
    private int L;
    private int M;
    private boolean N;
    private int O;
    public long P;
    public boolean Q;

    /* renamed from: a  reason: collision with root package name */
    public String f18937a;
    public String b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;
    public boolean k;
    public long l;
    public long m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public String v;
    public Map<String, String> w;
    public Object x;
    private final boolean y;
    private boolean z;

    /* loaded from: classes7.dex */
    public enum FromType {
        FROM_UNKNOWN(-1),
        FROM_NETWORK(0),
        FROM_MEMORY_CACHE(1),
        FROM_DISK_CACHE(2),
        FROM_LARGE_SCALE(3),
        FROM_LOCAL_FILE(4),
        FROM_FAST_DISK_CACHE(5);
        
        public final int value;

        FromType(int i) {
            this.value = i;
        }
    }

    static {
        kge.a(952537266);
    }

    public ImageStatistics(c cVar, boolean z) {
        this.B = FromType.FROM_UNKNOWN;
        this.k = false;
        this.o = false;
        this.p = false;
        this.q = false;
        this.r = false;
        this.s = false;
        this.t = false;
        this.u = false;
        this.Q = false;
        this.A = cVar;
        this.y = z;
    }

    public ImageStatistics(c cVar) {
        this(cVar, false);
    }

    public long a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5c", new Object[]{this})).longValue() : this.G;
    }

    public void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
        } else {
            this.G = j;
        }
    }

    public FromType b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FromType) ipChange.ipc$dispatch("adc682e6", new Object[]{this}) : this.B;
    }

    public int c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : this.D;
    }

    public void a(FromType fromType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdddf401", new Object[]{this, fromType});
        } else {
            this.B = fromType;
        }
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.H = i;
        }
    }

    public int d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue() : this.H;
    }

    public int e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[]{this})).intValue() : this.I;
    }

    public int f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5b2e1e0", new Object[]{this})).intValue() : this.J;
    }

    public int g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c0f961", new Object[]{this})).intValue() : this.K;
    }

    public int h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5cf10e2", new Object[]{this})).intValue() : this.L;
    }

    public int i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5dd2863", new Object[]{this})).intValue() : this.M;
    }

    public int j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5eb3fe4", new Object[]{this})).intValue() : this.O;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (z) {
            this.I++;
        } else {
            this.J++;
        }
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else if (z) {
            this.K++;
        } else {
            this.L++;
        }
    }

    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
        } else if (z) {
            this.M++;
        } else {
            this.O++;
        }
    }

    public void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad405d49", new Object[]{this, new Boolean(z)});
        } else {
            this.N = z;
        }
    }

    public boolean k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[]{this})).booleanValue() : this.N;
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else {
            this.D = i;
        }
    }

    public Map<String, String> l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("7666dbe8", new Object[]{this}) : this.E;
    }

    public void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else {
            this.E = map;
        }
    }

    public void b(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41e3e87c", new Object[]{this, map});
        } else {
            this.w = map;
        }
    }

    public Map<String, String> m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("44113da9", new Object[]{this}) : this.w;
    }

    public nec n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nec) ipChange.ipc$dispatch("730d92e5", new Object[]{this});
        }
        if (this.C == null) {
            this.C = njd.a(this.A.l());
        }
        return this.C;
    }

    public void a(nec necVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f60749cc", new Object[]{this, necVar});
        } else {
            this.C = necVar;
        }
    }

    public Map<String, Integer> o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("df66012b", new Object[]{this}) : this.F;
    }

    public void c(Map<String, Integer> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2985bedb", new Object[]{this, map});
        } else {
            this.F = map;
        }
    }

    public c p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("e5da2f31", new Object[]{this}) : this.A;
    }

    public boolean q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("64de47c", new Object[]{this})).booleanValue() : this.z;
    }

    public boolean r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("65bfbfd", new Object[]{this})).booleanValue() : this.y;
    }

    public void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef535e8", new Object[]{this, new Boolean(z)});
        } else {
            this.z = z;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "ImageStatistics(FromType=" + this.B + ", Duplicated=" + this.z + ", Retrying=" + this.y + ", Size=" + this.D + ", Format=" + this.C + ", DetailCost=" + this.F + ", decideUrlTime=" + this.P + riy.BRACKET_END_STR;
    }
}
