package com.taobao.taobaoavsdk.cache.library;

import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import anet.channel.util.HttpConstant;
import anet.channel.util.HttpHelper;
import anetwork.channel.Network;
import anetwork.channel.aidl.Connection;
import anetwork.channel.degrade.DegradableNetwork;
import anetwork.channel.entity.RequestImpl;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.media.MediaConstant;
import com.taobao.orange.OrangeConfig;
import com.taobao.taobaoavsdk.AVSDKLog;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import tb.kge;
import tb.oyu;
import tb.riy;

/* loaded from: classes8.dex */
public class k implements q {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int RANGE_END_VALUE_EXCEED_LENGTH = -2;
    public static final int RANGE_END_VALUE_INIT = -1;
    public static final int RANGE_END_VALUE_WITHOUT_CACAHE = -3;
    public static final int RANGE_START_VALUE_INIT = -1;
    private String D;
    private String E;
    private long F;
    private boolean G;
    private boolean H;
    private boolean Q;
    private String R;
    private int W;
    public String b;
    private volatile m c;
    private volatile d d;
    private volatile long e;
    private volatile String f;
    private volatile String g;
    private String h;
    private boolean i;
    private String j;
    private Network k;
    private l l;
    private String m;
    private String n;
    private String o;
    private int p;
    private int q;
    private int r;
    private g s;

    /* renamed from: a  reason: collision with root package name */
    public int f21330a = 1048576;
    private boolean t = true;
    private long u = -1;
    private long v = -1;
    private boolean w = false;
    private final int x = 416;
    private final String y = "collectRangeError";
    private final String z = "throwErrorInResponseCodeList";
    private String A = "";
    private boolean B = false;
    private long C = -2147483648L;
    private long I = 0;
    private long J = 0;
    private final String K = "checkM3u8Expire";
    private final String L = "en302AbsolutePath";
    private final String M = "enDownSysNet";
    private final String N = "enDownErrorSys";
    private boolean O = true;
    private boolean P = true;
    private boolean S = false;
    private long T = -1;
    private long U = -1;
    private final List<String> V = Arrays.asList("srtt", "minRtt", "connInFlight", "totalSize", "dataSpeed", "firstDataTime", "recDataTime");

    /* loaded from: classes8.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public l f21332a;
        public g b;
        public String c;
        public String d;
        public String e;
        public boolean f;
        public String g;
        public String h;
        public int i;
        public String j;
        public int k;
        public int l;
        public int m;
        public String n;
        public String o;
        public long p;
        public boolean q;
        public int r;

        static {
            kge.a(-2088160999);
        }
    }

    static {
        kge.a(1366459734);
        kge.a(-1675289593);
    }

    public k(k kVar) {
        this.e = -2147483648L;
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.W = -1;
        this.b = kVar.b;
        this.g = kVar.g;
        this.e = kVar.e;
        this.h = kVar.h;
        this.i = kVar.i;
        this.j = kVar.j;
        this.l = kVar.l;
        this.n = kVar.n;
        this.o = kVar.o;
        this.p = kVar.p;
        this.q = kVar.q;
        this.r = kVar.r;
        this.s = kVar.s;
        this.D = kVar.D;
        this.E = kVar.E;
        this.f = kVar.f;
        this.F = kVar.F;
        this.G = kVar.G;
        this.W = kVar.W;
        i();
    }

    public k(b bVar) {
        this.e = -2147483648L;
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.W = -1;
        this.b = (String) n.a(bVar.c);
        this.g = bVar.e;
        this.h = bVar.d;
        this.i = bVar.f;
        this.e = bVar.i;
        this.j = bVar.g;
        this.l = bVar.f21332a;
        this.n = bVar.h;
        this.o = bVar.j;
        this.p = bVar.k;
        this.q = bVar.l;
        this.r = bVar.m;
        this.s = bVar.b;
        this.D = bVar.n;
        this.E = bVar.o;
        this.F = bVar.p;
        this.G = bVar.q;
        this.W = bVar.r;
        i();
    }

    private void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        this.t = com.taobao.taobaoavsdk.util.b.a(OrangeConfig.getInstance().getConfig("DWInteractive", "sendPlayToken", "true"));
        this.B = com.taobao.taobaoavsdk.util.b.a(OrangeConfig.getInstance().getConfig("DWInteractive", "collectRangeError", "true"));
        this.A = OrangeConfig.getInstance().getConfig("DWInteractive", "throwErrorInResponseCodeList", MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264);
        this.O = com.taobao.taobaoavsdk.util.b.a(OrangeConfig.getInstance().getConfig("DWInteractive", "checkM3u8Expire", "false"));
        this.P = com.taobao.taobaoavsdk.util.b.a(OrangeConfig.getInstance().getConfig("DWInteractive", "en302AbsolutePath", "true"));
        this.H = com.taobao.taobaoavsdk.util.b.a(OrangeConfig.getInstance().getConfig("DWInteractive", "enRangeEndParam", "true"));
        this.Q = com.taobao.taobaoavsdk.util.b.a(OrangeConfig.getInstance().getConfig("DWInteractive", "enDownSysNet", "true"));
        this.R = OrangeConfig.getInstance().getConfig("DWInteractive", "enDownErrorSys", "[\"-202\"]");
        if (this.i && oyu.f32496a != null) {
            this.k = new DegradableNetwork(oyu.f32496a);
        } else {
            this.i = false;
        }
        int i = this.W;
        if (i > 0 && i <= 1048576) {
            this.f21330a = i;
        } else {
            this.f21330a = 1048576;
        }
    }

    @Override // com.taobao.taobaoavsdk.cache.library.q
    public synchronized long a() throws ProxyCacheException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5c", new Object[]{this})).longValue();
        }
        l();
        if (this.e == -2147483648L) {
            j();
        }
        return this.e;
    }

    public synchronized long b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dd", new Object[]{this})).longValue();
        }
        l();
        return this.e;
    }

    private boolean a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821939f", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (i >= 0) {
            if (!com.taobao.taobaoavsdk.util.b.b("" + i, this.A)) {
                return false;
            }
        }
        return true;
    }

    private boolean b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9d66c3e", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (this.Q) {
            if (com.taobao.taobaoavsdk.util.b.b("" + i, this.R)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.taobao.taobaoavsdk.cache.library.q
    public void a(long j, boolean z) throws ProxyCacheException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1206f8", new Object[]{this, new Long(j), new Boolean(z)});
            return;
        }
        try {
            if (this.i) {
                this.S = false;
                this.d = new d(a(j, -1, z));
                if (b(this.d.c())) {
                    this.S = true;
                    this.d = new d(b(j, -1, z));
                } else if (a(this.d.c())) {
                    throw new ProxyCacheException("Error opening connection for " + this.b + " with offset " + j + " error");
                }
            } else {
                this.d = new d(b(j, -1, z));
            }
            this.g = this.d.a("Content-Type");
            if (this.e == -1 || this.e == -2147483648L) {
                long j2 = this.e;
                this.e = this.d.a("Content-Length", -1);
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "open oldLength " + j2 + ", length=" + this.e);
                if (this.e > 0) {
                    k();
                }
            }
            this.c = this.d.b();
        } catch (Exception e) {
            throw new ProxyCacheException("Error opening connection for " + this.b + " with offset " + j + " error message:" + e.getMessage(), e);
        }
    }

    @Override // com.taobao.taobaoavsdk.cache.library.q
    public synchronized void c() throws ProxyCacheException {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        if (this.c != null) {
            try {
                this.c.a();
                this.U = System.currentTimeMillis();
                this.c = null;
            } catch (Exception e) {
                AVSDKLog.e("HttpUrlSource", " HttpUrlSource inputStream close error:" + e.getMessage());
            }
        }
        if (this.d == null) {
            return;
        }
        try {
            this.d.d();
            StringBuilder sb = new StringBuilder();
            sb.append("playToken=");
            sb.append(this.j);
            sb.append(",");
            sb.append(this.d.a());
            sb.append(",url=");
            sb.append(this.b);
            sb.append(",length=");
            sb.append(this.e);
            sb.append(",rangestart=");
            sb.append(this.u);
            sb.append(",rangeend=");
            sb.append(this.v);
            sb.append(",usecache=");
            sb.append(this.w);
            sb.append(",videoid=");
            sb.append(this.D);
            sb.append(",videodefine=");
            sb.append(this.E);
            sb.append(",errorLength=");
            sb.append(this.C);
            sb.append(",headtime=");
            sb.append(this.I);
            sb.append(",redirect=");
            sb.append(this.J);
            sb.append(",down2sys=");
            sb.append(this.S ? "1" : "0");
            sb.append(",useNet=");
            if (this.i) {
                i = 1;
            }
            sb.append(i);
            sb.append(",beginTime=");
            sb.append(this.T);
            sb.append(",endTime=");
            sb.append(this.U);
            this.m = sb.toString();
            if (Boolean.valueOf(com.taobao.taobaoavsdk.util.b.a(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_ENABLE_COMMIT_NET_CUT_INFO, "true"))).booleanValue()) {
                a(this.d);
            }
            this.d = null;
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "HttpUrlSource.close " + this + ", " + this.m);
        } catch (Exception e2) {
            throw new ProxyCacheException("Error disconnecting HttpUrlConnection", e2);
        }
    }

    @Override // com.taobao.taobaoavsdk.cache.library.q
    public int a(byte[] bArr) throws ProxyCacheException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c196722", new Object[]{this, bArr})).intValue();
        }
        if (this.c == null) {
            throw new ProxyCacheException("Error reading data from " + this.b + ": connection is absent!");
        }
        try {
            return this.c.a(bArr);
        } catch (InterruptedIOException e) {
            throw new InterruptedProxyCacheException("Reading source " + this.b + " is interrupted", e);
        } catch (Exception e2) {
            throw new ProxyCacheException("Error reading data from " + this.b, e2);
        }
    }

    private void j() throws ProxyCacheException {
        d dVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        d dVar2 = null;
        try {
            try {
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "fetchContentInfo start");
                long currentTimeMillis = System.currentTimeMillis();
                try {
                    if (this.i) {
                        dVar = new d(c(-1));
                        try {
                            if (b(dVar.c())) {
                                this.S = true;
                                this.i = false;
                                dVar2 = new d(e(10000));
                                this.g = dVar2.a("Content-Type");
                                this.e = dVar2.a("Content-Length", -1);
                                this.f = dVar2.a("Expires");
                                this.I = System.currentTimeMillis() - currentTimeMillis;
                                this.s.a("HeadRequetTime", String.valueOf(this.I));
                                k();
                                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "fetchContentInfo end, Head Request time is " + this.I);
                                dVar2.d();
                                this.m = "playToken=" + this.j + "," + dVar2.a() + ",url=" + this.b;
                                return;
                            }
                        } catch (Exception e) {
                            e = e;
                            dVar2 = dVar;
                            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "fetchContentInfo error " + e.toString());
                            if (dVar2 == null) {
                                return;
                            }
                            try {
                                dVar2.d();
                                this.m = "playToken=" + this.j + "," + dVar2.a() + ",url=" + this.b;
                                return;
                            } catch (Exception e2) {
                                e2.printStackTrace();
                                return;
                            }
                        } catch (Throwable th) {
                            th = th;
                            dVar2 = dVar;
                            if (dVar2 != null) {
                                try {
                                    dVar2.d();
                                    this.m = "playToken=" + this.j + "," + dVar2.a() + ",url=" + this.b;
                                } catch (Exception e3) {
                                    e3.printStackTrace();
                                }
                            }
                            throw th;
                        }
                    } else {
                        dVar = new d(e(10000));
                    }
                    dVar2.d();
                    this.m = "playToken=" + this.j + "," + dVar2.a() + ",url=" + this.b;
                    return;
                } catch (Exception e4) {
                    e4.printStackTrace();
                    return;
                }
                dVar2 = dVar;
                this.g = dVar2.a("Content-Type");
                this.e = dVar2.a("Content-Length", -1);
                this.f = dVar2.a("Expires");
                this.I = System.currentTimeMillis() - currentTimeMillis;
                this.s.a("HeadRequetTime", String.valueOf(this.I));
                k();
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "fetchContentInfo end, Head Request time is " + this.I);
            } catch (Exception e5) {
                e = e5;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        l lVar = this.l;
        if (lVar == null) {
            return;
        }
        lVar.a(this.b, this.e, this.g);
    }

    private void l() {
        r a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        l lVar = this.l;
        if (lVar == null || (a2 = lVar.a(this.b)) == null || TextUtils.isEmpty(a2.b()) || a2.a() == -2147483648L || this.e == a2.a()) {
            return;
        }
        this.g = a2.b();
        this.e = a2.a();
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.B;
    }

    private void a(int i, long j) throws ProxyCacheException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c115689", new Object[]{this, new Integer(i), new Long(j)});
        } else if (!d() || i != 416) {
        } else {
            this.C = this.e;
            this.e = -2147483648L;
            this.g = "";
            j();
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "update length from " + this.C + " to " + this.e);
            if (j < this.e) {
                return;
            }
            throw new ProxyCacheException("offset " + j + " is larger than length " + this.e);
        }
    }

    public long e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5a4ca60", new Object[]{this})).longValue();
        }
        if (this.v < -1 && this.e > 0) {
            return this.e;
        }
        long j = this.v - this.u;
        if (j <= 0) {
            return 0L;
        }
        return j + 1;
    }

    private Connection a(long j, int i, boolean z) throws ProxyCacheException, RemoteException {
        String str;
        int i2;
        String str2;
        int i3;
        boolean z2 = z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Connection) ipChange.ipc$dispatch("4717d4a9", new Object[]{this, new Long(j), new Integer(i), new Boolean(z2)});
        }
        long j2 = j;
        this.w = !z2;
        String str3 = this.b;
        if (this.k == null) {
            this.k = new DegradableNetwork(oyu.f32496a);
        }
        int i4 = 0;
        while (true) {
            RequestImpl requestImpl = new RequestImpl(str3);
            if (this.G) {
                requestImpl.setExtProperty("x-preload", "true");
            }
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "openConnection1 " + str3 + ", " + this);
            if (j2 < 0) {
                j2 = 0;
            }
            long j3 = -1;
            if (!z2) {
                if (b() > 0) {
                    str = str3;
                    if (this.f21330a + j2 < b()) {
                        j3 = (this.f21330a + j2) - 1;
                    }
                    i2 = i4;
                    long j4 = j3;
                    if (this.f21330a != 1048576) {
                        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "openConnection1 with tbnet: the reset MAX_EXTEND_DATA_REQUIRE=" + this.f21330a + ", end=" + j4);
                    }
                    j3 = a(j4);
                } else {
                    str = str3;
                    i2 = i4;
                }
                long j5 = j3;
                if (j5 < 0) {
                    if (com.taobao.taobaoavsdk.util.b.a(OrangeConfig.getInstance().getConfig("DWInteractive", "forceSegmented1M", "true"))) {
                        long j6 = (this.f21330a + j2) - 1;
                        requestImpl.addHeader(HttpConstant.RANGE, HttpConstant.RANGE_PRE + j2 + "-" + j6);
                        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "addRange bytes=" + j2 + "-" + j6);
                        this.v = j6;
                    } else {
                        requestImpl.addHeader(HttpConstant.RANGE, HttpConstant.RANGE_PRE + j2 + "-");
                        this.v = -2L;
                    }
                } else {
                    requestImpl.addHeader(HttpConstant.RANGE, HttpConstant.RANGE_PRE + j2 + "-" + j5);
                    AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "addRange bytes=" + j2 + "-" + j5);
                    this.v = j5;
                }
                this.u = j2;
            } else {
                str = str3;
                i2 = i4;
                if (j2 > 0) {
                    if (com.taobao.taobaoavsdk.util.b.a(OrangeConfig.getInstance().getConfig("DWInteractive", "segmentedDownload", "true"))) {
                        if (com.taobao.taobaoavsdk.util.b.a(OrangeConfig.getInstance().getConfig("DWInteractive", "forceSegmented1M", "true"))) {
                            long j7 = (this.f21330a + j2) - 1;
                            requestImpl.addHeader(HttpConstant.RANGE, HttpConstant.RANGE_PRE + j2 + "-" + j7);
                            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "addRange bytes=" + j2 + "-" + j7);
                            this.v = j7;
                        } else {
                            if (b() > 0) {
                                if (this.f21330a + j2 < b()) {
                                    j3 = (this.f21330a + j2) - 1;
                                }
                                long j8 = j3;
                                if (this.f21330a != 1048576) {
                                    AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "openConnection1 with tbnet: the reset MAX_EXTEND_DATA_REQUIRE=" + this.f21330a + ", end=" + j8);
                                }
                                j3 = a(j8);
                            }
                            long j9 = j3;
                            if (j9 < 0) {
                                requestImpl.addHeader(HttpConstant.RANGE, HttpConstant.RANGE_PRE + j2 + "-");
                                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "addRange bytes=" + j2 + "-");
                                this.v = -2L;
                            } else {
                                requestImpl.addHeader(HttpConstant.RANGE, HttpConstant.RANGE_PRE + j2 + "-" + j9);
                                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "addRange bytes=" + j2 + "-" + j9);
                                this.v = j9;
                            }
                        }
                    } else {
                        requestImpl.addHeader(HttpConstant.RANGE, HttpConstant.RANGE_PRE + j2 + "-");
                        this.v = -3L;
                    }
                    this.u = j2;
                }
            }
            if (!TextUtils.isEmpty(this.h)) {
                requestImpl.addHeader(HttpConstant.USER_AGENT, this.h);
            }
            if (i > 0) {
                requestImpl.setConnectTimeout(i);
                requestImpl.setReadTimeout(i);
                requestImpl.setFollowRedirects(true);
            }
            int i5 = this.p;
            if (i5 > 0) {
                requestImpl.setConnectTimeout(i5);
            }
            int i6 = this.q;
            if (i6 > 0) {
                requestImpl.setReadTimeout(i6);
            }
            int i7 = this.r;
            if (i7 > 0) {
                requestImpl.setRetryTime(i7);
            }
            if (!TextUtils.isEmpty(this.o)) {
                requestImpl.setBizId(this.o);
            }
            if (this.t && !TextUtils.isEmpty(this.j)) {
                requestImpl.addHeader("f-biz-req-id", this.j);
            }
            this.T = System.currentTimeMillis();
            Connection connection = this.k.getConnection(requestImpl, null);
            int statusCode = connection.getStatusCode();
            a(statusCode, j2);
            boolean z3 = statusCode == 301 || statusCode == 302 || statusCode == 303;
            if (z3) {
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "openConnection " + this.J);
                this.J = this.J + 1;
                str2 = new d(connection).a(HttpConstant.LOCATION);
                if (this.P) {
                    str2 = a(str, str2);
                }
                this.b = str2;
                i3 = i2 + 1;
                connection.cancel();
            } else {
                String str4 = str;
                if (this.s != null) {
                    try {
                        String singleHeaderFieldByKey = HttpHelper.getSingleHeaderFieldByKey(connection.getConnHeadFields(), HttpConstant.X_CACHE);
                        if (!TextUtils.isEmpty(singleHeaderFieldByKey)) {
                            this.s.a(HttpConstant.X_CACHE, singleHeaderFieldByKey);
                        }
                    } catch (Exception unused) {
                    }
                }
                str2 = str4;
                i3 = i2;
            }
            if (i3 > 5) {
                throw new ProxyCacheException("Too many redirects: " + i3);
            } else if (!z3) {
                return connection;
            } else {
                z2 = z;
                str3 = str2;
                i4 = i3;
            }
        }
    }

    private Connection c(int i) throws ProxyCacheException, RemoteException {
        Connection connection;
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Connection) ipChange.ipc$dispatch("c46119dd", new Object[]{this, new Integer(i)});
        }
        if (this.k == null) {
            this.k = new DegradableNetwork(oyu.f32496a);
        }
        int i2 = 0;
        do {
            RequestImpl requestImpl = new RequestImpl(this.b);
            requestImpl.setMethod("HEAD");
            if (i > 0) {
                requestImpl.setConnectTimeout(i);
                requestImpl.setReadTimeout(i);
            }
            if (!TextUtils.isEmpty(this.h)) {
                requestImpl.addHeader(HttpConstant.USER_AGENT, this.h);
            }
            connection = this.k.getConnection(requestImpl, null);
            int statusCode = connection.getStatusCode();
            z = statusCode == 301 || statusCode == 302 || statusCode == 303;
            if (z) {
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "getConnectionHead1 302 " + this.J);
                this.J = this.J + 1;
                String a2 = new d(connection).a(HttpConstant.LOCATION);
                if (this.P) {
                    a2 = a(this.b, a2);
                }
                this.b = a2;
                this.b = this.b;
                i2++;
                connection.cancel();
            } else if (statusCode == 403 || statusCode == 404) {
                return null;
            }
            if (i2 > 5) {
                throw new ProxyCacheException("Too many redirects: " + i2);
            }
        } while (z);
        return connection;
    }

    private long a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a8219750", new Object[]{this, new Long(j)})).longValue();
        }
        long j2 = this.F;
        return (j2 >= 2147483647L || j2 <= 0 || !this.H) ? j : Math.min(j2, j);
    }

    private HttpURLConnection b(long j, int i, boolean z) throws IOException, ProxyCacheException {
        int i2;
        long j2;
        long j3;
        boolean z2 = z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpURLConnection) ipChange.ipc$dispatch("7b366493", new Object[]{this, new Long(j), new Integer(i), new Boolean(z2)});
        }
        long j4 = j;
        String str = this.b;
        int i3 = 0;
        while (true) {
            Uri parse = Uri.parse(str);
            if (!TextUtils.isEmpty(this.n) && !str.startsWith("https")) {
                str = str.replaceFirst(parse.getHost(), this.n);
            }
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "openConnection " + str + ", " + this);
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            if (j4 < 0) {
                j4 = 0;
            }
            if (!z2) {
                if (b() > 0) {
                    long j5 = ((long) this.f21330a) + j4 >= b() ? -1L : (this.f21330a + j4) - 1;
                    i2 = i3;
                    if (this.f21330a != 1048576) {
                        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "openConnection1: the reset MAX_EXTEND_DATA_REQUIRE=" + this.f21330a + ", end=" + j5);
                    }
                    j3 = a(j5);
                    j2 = 0;
                } else {
                    i2 = i3;
                    j2 = 0;
                    j3 = -1;
                }
                if (j3 < j2) {
                    httpURLConnection.setRequestProperty(HttpConstant.RANGE, HttpConstant.RANGE_PRE + j4 + "-");
                } else {
                    httpURLConnection.setRequestProperty(HttpConstant.RANGE, HttpConstant.RANGE_PRE + j4 + "-" + j3);
                }
            } else {
                i2 = i3;
                if (j4 > 0) {
                    httpURLConnection.setRequestProperty(HttpConstant.RANGE, HttpConstant.RANGE_PRE + j4 + "-");
                }
            }
            if (i > 0) {
                httpURLConnection.setConnectTimeout(i);
                httpURLConnection.setReadTimeout(i);
            }
            if (!TextUtils.isEmpty(this.n)) {
                httpURLConnection.setRequestProperty(HttpConstant.HOST, parse.getHost());
            }
            if (!TextUtils.isEmpty(this.h)) {
                httpURLConnection.setRequestProperty(HttpConstant.USER_AGENT, this.h);
            }
            int responseCode = httpURLConnection.getResponseCode();
            a(responseCode, j4);
            boolean z3 = responseCode == 301 || responseCode == 302 || responseCode == 303;
            if (z3) {
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "openConnection " + this.J);
                this.J = this.J + 1;
                String headerField = httpURLConnection.getHeaderField(HttpConstant.LOCATION);
                if (this.P) {
                    headerField = a(str, headerField);
                }
                this.b = headerField;
                httpURLConnection.disconnect();
                String str2 = headerField;
                i3 = i2 + 1;
                str = str2;
            } else {
                i3 = i2;
            }
            if (i3 > 5) {
                throw new ProxyCacheException("Too many redirects: " + i3);
            } else if (!z3) {
                return httpURLConnection;
            } else {
                z2 = z;
            }
        }
    }

    private String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{this, str, str2}) : (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) ? str : str2.startsWith("/") ? com.taobao.taobaoavsdk.util.b.a(str, str2) : str2;
    }

    private HttpURLConnection e(int i) throws IOException, ProxyCacheException {
        HttpURLConnection httpURLConnection;
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpURLConnection) ipChange.ipc$dispatch("7a2f5908", new Object[]{this, new Integer(i)});
        }
        String str = this.b;
        int i2 = 0;
        do {
            Uri parse = Uri.parse(str);
            if (!TextUtils.isEmpty(this.n)) {
                str = str.replaceFirst(parse.getHost(), this.n);
            }
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setRequestMethod("HEAD");
            if (i > 0) {
                httpURLConnection.setConnectTimeout(i);
                httpURLConnection.setReadTimeout(i);
            }
            if (!TextUtils.isEmpty(this.n)) {
                httpURLConnection.setRequestProperty(HttpConstant.HOST, parse.getHost());
            }
            if (!TextUtils.isEmpty(this.h)) {
                httpURLConnection.setRequestProperty(HttpConstant.USER_AGENT, this.h);
            }
            int responseCode = httpURLConnection.getResponseCode();
            z = responseCode == 301 || responseCode == 302 || responseCode == 303;
            if (z) {
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "getConnectionHead 302 " + this.J);
                this.J = this.J + 1;
                String headerField = httpURLConnection.getHeaderField(HttpConstant.LOCATION);
                if (this.P) {
                    headerField = a(str, headerField);
                }
                this.b = headerField;
                i2++;
                httpURLConnection.disconnect();
                str = headerField;
            } else if (responseCode == 403 || responseCode == 404) {
                return null;
            }
            if (i2 > 5) {
                throw new ProxyCacheException("Too many redirects: " + i2);
            }
        } while (z);
        return httpURLConnection;
    }

    public synchronized String f() throws ProxyCacheException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("50938a53", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.g)) {
            l();
        }
        if (TextUtils.isEmpty(this.g)) {
            j();
        }
        return this.g;
    }

    public synchronized String m() throws ProxyCacheException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fe3ba4ac", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.g)) {
            l();
        }
        return this.g;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "HttpUrlSource{url='" + this.b + riy.BLOCK_END_STR;
    }

    public String g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this}) : this.m;
    }

    public int h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5cf10e2", new Object[]{this})).intValue() : this.f21330a;
    }

    private void a(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82af57ff", new Object[]{this, dVar});
        } else if (dVar != null) {
            try {
                String a2 = dVar.a();
                if (TextUtils.isEmpty(a2)) {
                    return;
                }
                String[] split = a2.split(",");
                JSONObject jSONObject = new JSONObject();
                for (String str : split) {
                    String[] split2 = str.split("=");
                    String str2 = split2[0];
                    long c = com.taobao.taobaoavsdk.util.b.c(split2[1]);
                    if (this.V.contains(str2)) {
                        jSONObject.put(str2, (Object) Long.valueOf(c));
                    }
                }
                jSONObject.put("startTime", (Object) Long.valueOf(this.T));
                jSONObject.put("duration", (Object) Long.valueOf(Math.max(this.U - this.T, -1L)));
                if (!a(jSONObject)) {
                    return;
                }
                oyu.a(jSONObject);
            } catch (Exception e) {
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "getNetInfoForVideoABR failed!" + e.toString());
            }
        }
    }

    private boolean a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("266fb8c", new Object[]{this, jSONObject})).booleanValue();
        }
        if (jSONObject != null) {
            try {
                Double d = jSONObject.getDouble("totalSize");
                if (d != null && d.doubleValue() < oyu.q) {
                    return false;
                }
                Double d2 = jSONObject.getDouble("dataSpeed");
                if (d2 != null && d != null && d2.equals(d)) {
                    return false;
                }
                Double d3 = jSONObject.getDouble("firstDataTime");
                if (d3 != null) {
                    if (d3.equals(0)) {
                        return false;
                    }
                }
            } catch (Exception unused) {
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "isNetCutInfoValid judge failed and catch.");
            }
        }
        return true;
    }

    /* loaded from: classes8.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public b f21331a = new b();

        static {
            kge.a(683779629);
        }

        public a a(l lVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("3d28f552", new Object[]{this, lVar});
            }
            this.f21331a.f21332a = lVar;
            return this;
        }

        public a a(g gVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("380528cd", new Object[]{this, gVar});
            }
            this.f21331a.b = gVar;
            return this;
        }

        public a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("f3b80277", new Object[]{this, str});
            }
            this.f21331a.c = str;
            return this;
        }

        public a b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("72190656", new Object[]{this, str});
            }
            this.f21331a.d = str;
            return this;
        }

        public a c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("f07a0a35", new Object[]{this, str});
            }
            this.f21331a.e = str;
            return this;
        }

        public a a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("518e647d", new Object[]{this, new Boolean(z)});
            }
            this.f21331a.f = z;
            return this;
        }

        public a d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("6edb0e14", new Object[]{this, str});
            }
            this.f21331a.g = str;
            return this;
        }

        public a e(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("ed3c11f3", new Object[]{this, str});
            }
            this.f21331a.h = str;
            return this;
        }

        public a a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("5fdb652e", new Object[]{this, new Integer(i)});
            }
            this.f21331a.i = i;
            return this;
        }

        public a f(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("6b9d15d2", new Object[]{this, str});
            }
            this.f21331a.j = str;
            return this;
        }

        public a b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("d5558b6f", new Object[]{this, new Integer(i)});
            }
            this.f21331a.k = i;
            return this;
        }

        public a c(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("4acfb1b0", new Object[]{this, new Integer(i)});
            }
            this.f21331a.l = i;
            return this;
        }

        public a d(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("c049d7f1", new Object[]{this, new Integer(i)});
            }
            this.f21331a.m = i;
            return this;
        }

        public a g(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("e9fe19b1", new Object[]{this, str});
            }
            this.f21331a.n = str;
            return this;
        }

        public a h(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("685f1d90", new Object[]{this, str});
            }
            this.f21331a.o = str;
            return this;
        }

        public a a(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("22c7ce8d", new Object[]{this, new Long(j)});
            }
            this.f21331a.p = j;
            return this;
        }

        public a b(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("c7088abe", new Object[]{this, new Boolean(z)});
            }
            this.f21331a.q = z;
            return this;
        }

        public a e(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("35c3fe32", new Object[]{this, new Integer(i)});
            }
            this.f21331a.r = i;
            return this;
        }

        public k a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (k) ipChange.ipc$dispatch("4b3420de", new Object[]{this}) : new k(this.f21331a);
        }
    }
}
