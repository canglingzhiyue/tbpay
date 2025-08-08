package mtopsdk.network.impl;

import mtopsdk.common.util.StringUtils;
import android.util.Pair;
import anetwork.channel.NetworkCallBack;
import anetwork.channel.NetworkEvent;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import mtopsdk.common.util.HeaderHandlerUtil;
import mtopsdk.common.util.HttpHeaderConstant;
import mtopsdk.common.util.StringUtils;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.global.SwitchConfig;
import mtopsdk.mtop.network.StreamNetworkCallbackAdapter;
import mtopsdk.mtop.util.ErrorConstant;
import mtopsdk.mtop.util.JsonUtil;
import mtopsdk.mtop.util.MtopSDKThreadPoolExecutorFactory;
import mtopsdk.network.domain.NetworkStats;
import mtopsdk.network.domain.b;
import tb.arr;
import tb.kge;
import tb.ryn;
import tb.ryp;
import tb.ryq;
import tb.ryr;
import tb.rys;
import tb.ryt;

/* loaded from: classes9.dex */
public class e implements NetworkCallBack.FinishListener, NetworkCallBack.ProgressListener, NetworkCallBack.ResponseCodeListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private byte[] A;
    private int B;
    private Map<String, List<String>> C;
    private a E;
    private ryt.a G;
    private boolean H;
    private arr.a I;
    public ryn b;
    public ryp c;
    private final String h;
    private int i;
    private volatile boolean n;
    private int z;
    private final AtomicInteger d = new AtomicInteger(0);
    private final AtomicInteger e = new AtomicInteger(0);
    private final AtomicBoolean f = new AtomicBoolean(false);
    private final boolean g = false;
    private volatile boolean j = false;
    private volatile boolean k = false;
    private volatile boolean l = false;
    private volatile boolean m = false;
    private volatile long o = 0;
    private volatile long p = 0;
    private volatile long q = 0;
    private volatile long r = 0;
    private volatile long s = 0;
    private volatile long t = 0;
    private volatile long u = 0;
    private AtomicInteger v = new AtomicInteger(0);
    private AtomicInteger w = new AtomicInteger(0);
    private AtomicBoolean x = new AtomicBoolean(false);
    private AtomicLong y = new AtomicLong(0);
    private ByteArrayOutputStream D = null;
    private String F = "";
    private long J = -1;
    private long K = -1;
    private boolean L = false;

    /* renamed from: a  reason: collision with root package name */
    public int f25017a = 0;

    static {
        kge.a(-1424780994);
        kge.a(1776397793);
        kge.a(-324998464);
        kge.a(-501869850);
    }

    public static /* synthetic */ int a(e eVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d5df333", new Object[]{eVar, new Integer(i)})).intValue();
        }
        eVar.z = i;
        return i;
    }

    public static /* synthetic */ int a(e eVar, byte[] bArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9e68fc1d", new Object[]{eVar, bArr})).intValue() : eVar.b(bArr);
    }

    public static /* synthetic */ long a(e eVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d5df6f5", new Object[]{eVar, new Long(j)})).longValue();
        }
        eVar.o = j;
        return j;
    }

    public static /* synthetic */ ByteArrayOutputStream a(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ByteArrayOutputStream) ipChange.ipc$dispatch("43a0bd9e", new Object[]{eVar}) : eVar.D;
    }

    public static /* synthetic */ ByteArrayOutputStream a(e eVar, ByteArrayOutputStream byteArrayOutputStream) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ByteArrayOutputStream) ipChange.ipc$dispatch("d65c04c3", new Object[]{eVar, byteArrayOutputStream});
        }
        eVar.D = byteArrayOutputStream;
        return byteArrayOutputStream;
    }

    public static /* synthetic */ arr.a a(e eVar, arr.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (arr.a) ipChange.ipc$dispatch("d6311713", new Object[]{eVar, aVar});
        }
        eVar.I = aVar;
        return aVar;
    }

    public static /* synthetic */ ryt.a a(e eVar, ryt.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ryt.a) ipChange.ipc$dispatch("2d92aa93", new Object[]{eVar, aVar});
        }
        eVar.G = aVar;
        return aVar;
    }

    public static /* synthetic */ void a(e eVar, byte[] bArr, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a828fa0a", new Object[]{eVar, bArr, new Integer(i), new Integer(i2)});
        } else {
            eVar.a(bArr, i, i2);
        }
    }

    public static /* synthetic */ void a(e eVar, byte[] bArr, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("953fc61b", new Object[]{eVar, bArr, map});
        } else {
            eVar.a(bArr, map);
        }
    }

    public static /* synthetic */ long b(e eVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e0aa294", new Object[]{eVar, new Long(j)})).longValue();
        }
        eVar.r = j;
        return j;
    }

    public static /* synthetic */ AtomicBoolean b(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("2e5350e4", new Object[]{eVar}) : eVar.x;
    }

    public static /* synthetic */ long c(e eVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("eb74e33", new Object[]{eVar, new Long(j)})).longValue();
        }
        eVar.s = j;
        return j;
    }

    public static /* synthetic */ AtomicInteger c(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicInteger) ipChange.ipc$dispatch("bbe791cf", new Object[]{eVar}) : eVar.w;
    }

    public static /* synthetic */ AtomicBoolean d(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("f4aab766", new Object[]{eVar}) : eVar.f;
    }

    public static /* synthetic */ long e(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f842961b", new Object[]{eVar})).longValue() : eVar.o;
    }

    public static /* synthetic */ long f(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("21927a9c", new Object[]{eVar})).longValue() : eVar.r;
    }

    public static /* synthetic */ boolean g(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4ae25f2d", new Object[]{eVar})).booleanValue() : eVar.n;
    }

    public static /* synthetic */ byte[] h(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("12163273", new Object[]{eVar}) : eVar.A;
    }

    public static /* synthetic */ int i(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9d82281e", new Object[]{eVar})).intValue() : eVar.z;
    }

    public static /* synthetic */ String j(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a9455574", new Object[]{eVar}) : eVar.h;
    }

    public static /* synthetic */ long k(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f021f121", new Object[]{eVar})).longValue() : eVar.s;
    }

    public static /* synthetic */ ryt.a l(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ryt.a) ipChange.ipc$dispatch("2bb7e8e", new Object[]{eVar}) : eVar.G;
    }

    public static /* synthetic */ boolean m(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("42c1ba33", new Object[]{eVar})).booleanValue() : eVar.H;
    }

    public static /* synthetic */ arr.a n(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (arr.a) ipChange.ipc$dispatch("a7fac7f8", new Object[]{eVar}) : eVar.I;
    }

    public static /* synthetic */ Map o(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("7b1aba6", new Object[]{eVar}) : eVar.C;
    }

    public static /* synthetic */ String p(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("212a72e", new Object[]{eVar}) : eVar.F;
    }

    public static /* synthetic */ AtomicInteger q(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicInteger) ipChange.ipc$dispatch("284b5f5d", new Object[]{eVar}) : eVar.d;
    }

    public static /* synthetic */ AtomicInteger r(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicInteger) ipChange.ipc$dispatch("b77129e", new Object[]{eVar}) : eVar.e;
    }

    public static /* synthetic */ boolean s(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3aa11539", new Object[]{eVar})).booleanValue() : eVar.l;
    }

    public static /* synthetic */ void t(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63f0f9b6", new Object[]{eVar});
        } else {
            eVar.b();
        }
    }

    public static /* synthetic */ int u(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8d40de2a", new Object[]{eVar})).intValue() : eVar.i;
    }

    public e(ryn rynVar, ryp rypVar, String str, int i) {
        boolean z = false;
        this.i = 10000;
        this.n = false;
        this.b = rynVar;
        this.c = rypVar;
        this.h = str;
        if (i > 0) {
            this.i = i;
        }
        this.n = SwitchConfig.getInstance().isOptStreamParse();
        if (SwitchConfig.getInstance().isStreamJsonEnable() && this.b.a().x && this.b.a().y == null) {
            z = true;
        }
        this.H = z;
    }

    @Override // anetwork.channel.NetworkCallBack.ResponseCodeListener
    public boolean onResponseCode(int i, Map<String, List<String>> map, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("45b007d6", new Object[]{this, new Integer(i), map, obj})).booleanValue();
        }
        this.B = i;
        this.C = map;
        TBSdkLog.e("mtopsdk.StreamNetworkListenerAdapter", this.h, "[onResponseCode]Read head");
        try {
            String singleHeaderFieldByKey = HeaderHandlerUtil.getSingleHeaderFieldByKey(this.C, "content-length");
            if (StringUtils.isBlank(singleHeaderFieldByKey)) {
                singleHeaderFieldByKey = HeaderHandlerUtil.getSingleHeaderFieldByKey(this.C, HttpHeaderConstant.X_BIN_LENGTH);
            }
            if (StringUtils.isNotBlank(singleHeaderFieldByKey)) {
                this.f25017a = Integer.parseInt(singleHeaderFieldByKey);
            }
            this.j = StringUtils.equals("1", HeaderHandlerUtil.getSingleHeaderFieldByKey(this.C, "x-used-stream"));
        } catch (Exception unused) {
            TBSdkLog.e("mtopsdk.StreamNetworkListenerAdapter", this.h, "[onResponseCode]parse Response HeaderField ContentLength error ");
        }
        ryp rypVar = this.c;
        if (rypVar instanceof StreamNetworkCallbackAdapter) {
            ((StreamNetworkCallbackAdapter) rypVar).onHeader();
        }
        return false;
    }

    @Override // anetwork.channel.NetworkCallBack.FinishListener
    public void onFinished(final NetworkEvent.FinishEvent finishEvent, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a00910e8", new Object[]{this, finishEvent, obj});
            return;
        }
        this.u = System.currentTimeMillis() - this.t;
        String str = this.h;
        TBSdkLog.e("mtopsdk.StreamNetworkListenerAdapter", str, "[onFinished] isNeedCallFinish = false, isStreamReceived = " + this.k);
        String str2 = this.h;
        MtopSDKThreadPoolExecutorFactory.submitStreamRequestTask(str2 != null ? str2.hashCode() : hashCode(), new Runnable() { // from class: mtopsdk.network.impl.e.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                rys.a(e.a(e.this));
                e.this.a(finishEvent);
            }
        });
    }

    @Override // anetwork.channel.NetworkCallBack.ProgressListener
    public void onDataReceived(NetworkEvent.ProgressEvent progressEvent, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e27ec0e9", new Object[]{this, progressEvent, obj});
            return;
        }
        if (this.t <= 0) {
            this.t = System.currentTimeMillis();
        }
        if (!this.k) {
            this.k = true;
        }
        byte[] copyOf = Arrays.copyOf(progressEvent.getBytedata(), progressEvent.getSize());
        if (!this.j) {
            c(copyOf);
        } else {
            a(copyOf);
        }
    }

    private void a(final byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c19672f", new Object[]{this, bArr});
        } else if (this.f.get()) {
        } else {
            if (this.D == null) {
                this.D = new ByteArrayOutputStream(bArr.length);
            }
            String str = this.h;
            MtopSDKThreadPoolExecutorFactory.submitStreamRequestTask(str != null ? str.hashCode() : hashCode(), new Runnable() { // from class: mtopsdk.network.impl.e.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    int max;
                    ryt.b bVar;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    if (!e.b(e.this).get()) {
                        e.c(e.this).getAndAdd(1);
                    }
                    if (e.d(e.this).get()) {
                        return;
                    }
                    try {
                        if (e.e(e.this) <= 0) {
                            e.a(e.this, System.currentTimeMillis());
                        }
                        e.a(e.this, e.a(e.this, bArr));
                        if (e.f(e.this) <= 0) {
                            e.b(e.this, System.currentTimeMillis());
                        }
                        if (e.g(e.this)) {
                            while (true) {
                                if (e.l(e.this) == null) {
                                    e.a(e.this, new ryt.a());
                                }
                                max = Math.max(0, e.l(e.this).d ? (e.i(e.this) - bArr.length) - 1 : e.i(e.this) - bArr.length);
                                ryt.a(e.h(e.this), max, e.i(e.this) - max, e.l(e.this));
                                int i = e.l(e.this).f33425a;
                                if (i == -1) {
                                    break;
                                }
                                if (e.n(e.this) != null && (bVar = e.l(e.this).f.get(ResponseProtocolType.DATA)) != null) {
                                    e.n(e.this).a(e.h(e.this), max, (bVar.b + bVar.c) - max);
                                }
                                String j = e.j(e.this);
                                TBSdkLog.e("mtopsdk.StreamNetworkListenerAdapter", j, "[------findNewlineIndex] index = " + i);
                                if (e.k(e.this) <= 0 && e.f(e.this) >= 0) {
                                    e.c(e.this, System.currentTimeMillis() - e.f(e.this));
                                }
                                e.a(e.this, e.h(e.this), e.l(e.this).f);
                                e.this.a(e.h(e.this), i + 2);
                                e.l(e.this).a();
                            }
                            if (!e.m(e.this) || e.l(e.this).b == null || !StringUtils.equals(e.l(e.this).b.f33426a, ResponseProtocolType.DATA)) {
                                return;
                            }
                            if (e.n(e.this) != null) {
                                e.n(e.this).a(e.h(e.this), max, e.i(e.this) - max);
                                return;
                            }
                            TBSdkLog.e("mtopsdk.StreamNetworkListenerAdapter", e.j(e.this), "[parseStreamData]create json stream chain.");
                            e.a(e.this, arr.b());
                            e.n(e.this).a(e.h(e.this), e.l(e.this).b.b, e.i(e.this) - e.l(e.this).b.b);
                            return;
                        }
                        while (true) {
                            int a2 = ryt.a(e.h(e.this), Math.max(0, (e.i(e.this) - bArr.length) - 2), e.i(e.this));
                            if (a2 == -1) {
                                return;
                            }
                            String j2 = e.j(e.this);
                            TBSdkLog.e("mtopsdk.StreamNetworkListenerAdapter", j2, "[------findNewlineIndex] index = " + a2);
                            if (e.k(e.this) <= 0 && e.f(e.this) >= 0) {
                                e.c(e.this, System.currentTimeMillis() - e.f(e.this));
                            }
                            e.a(e.this, e.h(e.this), 0, a2);
                            e.this.a(e.h(e.this), a2 + 2);
                        }
                    } catch (Throwable th) {
                        TBSdkLog.e("mtopsdk.StreamNetworkListenerAdapter", e.j(e.this), "[parseStreamData1]Read data failed.", th);
                        e.a(e.this, (ByteArrayOutputStream) null);
                    }
                }
            });
        }
    }

    private int b(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("90ffa263", new Object[]{this, bArr})).intValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (this.A == null) {
            this.A = new byte[16384];
            this.z = 0;
        }
        int length = this.z + bArr.length;
        if (this.A.length < length) {
            if (!this.x.get()) {
                this.v.getAndAdd(1);
            }
            byte[] bArr2 = new byte[Math.max(length, this.A.length + 16384)];
            byte[] bArr3 = this.A;
            System.arraycopy(bArr3, 0, bArr2, 0, bArr3.length);
            this.A = bArr2;
        }
        System.arraycopy(bArr, 0, this.A, this.z, bArr.length);
        this.z += bArr.length;
        if (!this.x.get()) {
            this.y.getAndAdd(System.currentTimeMillis() - currentTimeMillis);
        }
        return this.z;
    }

    private void a(byte[] bArr, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb6ab7cf", new Object[]{this, bArr, new Integer(i), new Integer(i2)});
            return;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis();
            List<Pair<Integer, Integer>> b = ryt.b(bArr, i, i2);
            String str = this.h;
            TBSdkLog.e("mtopsdk.StreamNetworkListenerAdapter", str, "[------parseAndCallback] index = " + b.size());
            if (b.size() <= 0) {
                return;
            }
            for (Pair<Integer, Integer> pair : b) {
                a(bArr, pair);
            }
            if (this.q <= 0) {
                this.q = System.currentTimeMillis() - currentTimeMillis;
            }
            a();
        } catch (Throwable th) {
            TBSdkLog.e("mtopsdk.StreamNetworkListenerAdapter", this.h, "[parseAndCallback] failed.", th);
        }
    }

    private void a(byte[] bArr, Map<String, ryt.b> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21255076", new Object[]{this, bArr, map});
        } else if (!map.isEmpty()) {
            try {
                long currentTimeMillis = System.currentTimeMillis();
                for (Map.Entry<String, ryt.b> entry : map.entrySet()) {
                    ryt.b value = entry.getValue();
                    a(bArr, entry.getKey(), value.b, value.c);
                }
                if (this.q <= 0) {
                    this.q = System.currentTimeMillis() - currentTimeMillis;
                }
                a();
            } catch (Throwable th) {
                TBSdkLog.e("mtopsdk.StreamNetworkListenerAdapter", this.h, "[parseAndCallback] failed.", th);
            }
        }
    }

    public void a(byte[] bArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2713f1b4", new Object[]{this, bArr, new Integer(i)});
            return;
        }
        int i2 = this.z;
        if (i >= i2) {
            this.z = 0;
            return;
        }
        int i3 = i2 - i;
        System.arraycopy(bArr, i, bArr, 0, i3);
        this.z = i3;
    }

    private void a(byte[] bArr, Pair<Integer, Integer> pair) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("267d454b", new Object[]{this, bArr, pair});
            return;
        }
        Pair<String, Pair<Integer, Integer>> a2 = ryt.a(bArr, pair);
        if (a2 == null) {
            return;
        }
        Pair pair2 = (Pair) a2.second;
        a(bArr, (String) a2.first, ((Integer) pair2.first).intValue(), ((Integer) pair2.second).intValue());
    }

    private void a(byte[] bArr, String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16a53959", new Object[]{this, bArr, str, new Integer(i), new Integer(i2)});
        } else if (StringUtils.equals(str, ResponseProtocolType.ID)) {
            this.F = new String(bArr, i, i2);
            String str2 = this.h;
            TBSdkLog.e("mtopsdk.StreamNetworkListenerAdapter", str2, "[parseSseProtocol] id: " + this.F);
            this.d.incrementAndGet();
        } else if (StringUtils.equals(str, ResponseProtocolType.EVENT)) {
            if (ryt.a(ResponseEventType.EVENT_TRAILER.getBytes(), bArr, i, i2)) {
                String str3 = this.h;
                TBSdkLog.e("mtopsdk.StreamNetworkListenerAdapter", str3, "[parseSseProtocol] event trailer: id: " + this.F);
                this.l = true;
                a aVar = this.E;
                if (aVar == null) {
                    return;
                }
                aVar.b();
            } else if (!ryt.a(ResponseEventType.EVENT_RESPONSE.getBytes(), bArr, i, i2)) {
            } else {
                String str4 = this.h;
                TBSdkLog.e("mtopsdk.StreamNetworkListenerAdapter", str4, "[parseSseProtocol] event response id: " + this.F);
                this.m = true;
                this.e.incrementAndGet();
            }
        } else if (!StringUtils.equals(str, ResponseProtocolType.DATA)) {
        } else {
            if ((!this.m && !this.l) || i2 <= 0) {
                return;
            }
            String str5 = this.h;
            TBSdkLog.e("mtopsdk.StreamNetworkListenerAdapter", str5, "[parseSseProtocol] validate data: id: " + this.F);
            this.D.write(bArr, i, i2);
        }
    }

    private void a() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        String str = this.h;
        TBSdkLog.e("mtopsdk.StreamNetworkListenerAdapter", str, "[callbackDataAndResetStatus] id: " + this.F);
        this.D.flush();
        byte[] byteArray = this.D.toByteArray();
        a(byteArray, d(byteArray));
        this.D.reset();
        this.m = false;
        if (this.E == null) {
            this.E = new a();
            this.E.a();
        } else if (this.l) {
        } else {
            this.E.c();
        }
    }

    private void c(final byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5e5ddb1", new Object[]{this, bArr});
            return;
        }
        String str = this.h;
        MtopSDKThreadPoolExecutorFactory.submitStreamRequestTask(str != null ? str.hashCode() : hashCode(), new Runnable() { // from class: mtopsdk.network.impl.e.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                if (e.m(e.this)) {
                    if (e.n(e.this) == null) {
                        e.a(e.this, arr.b());
                    }
                    arr.a n = e.n(e.this);
                    byte[] bArr2 = bArr;
                    n.a(bArr2, 0, bArr2.length);
                }
                e.a(e.this, bArr);
            }
        });
    }

    public void a(NetworkEvent.FinishEvent finishEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("512b11c", new Object[]{this, finishEvent});
        } else if (this.f.get()) {
            TBSdkLog.e("mtopsdk.StreamNetworkListenerAdapter", this.h, "[callFinish] read timeout finish.");
        } else {
            a aVar = this.E;
            if (aVar != null) {
                aVar.b();
            }
            try {
                long currentTimeMillis = System.currentTimeMillis();
                b(finishEvent);
                if (!TBSdkLog.isLogEnable(TBSdkLog.LogEnable.DebugEnable)) {
                    return;
                }
                String str = this.h;
                TBSdkLog.d("mtopsdk.StreamNetworkListenerAdapter", str, "[callFinish] execute onFinishTask time[ms] " + (System.currentTimeMillis() - currentTimeMillis));
            } catch (Exception e) {
                TBSdkLog.e("mtopsdk.StreamNetworkListenerAdapter", this.h, "[callFinish]execute onFinishTask error.", e);
            }
        }
    }

    private JSONObject d(byte[] bArr) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f29a7c12", new Object[]{this, bArr});
        }
        JSONObject jSONObject2 = null;
        if (this.H) {
            long currentTimeMillis = System.currentTimeMillis();
            arr.a aVar = this.I;
            if (aVar == null) {
                jSONObject = JsonUtil.parseWithJson2(bArr);
            } else {
                aVar.a();
                try {
                    jSONObject = this.I.b();
                } catch (Exception e) {
                    this.L = true;
                    TBSdkLog.e("mtopsdk.StreamNetworkListenerAdapter", this.h, "[stream-json]error.", e);
                    jSONObject = null;
                }
                this.I = null;
            }
            jSONObject2 = jSONObject;
            if (jSONObject2 != null && this.J < 0) {
                this.J = System.currentTimeMillis() - currentTimeMillis;
                if (bArr != null && bArr.length > 0) {
                    this.K = bArr.length;
                }
                TBSdkLog.e("mtopsdk.StreamNetworkListenerAdapter", this.h, "[stream-json]cost = " + this.J + ", size = " + this.K);
            }
        } else if (this.b.a().x && this.b.a().y == null) {
            long currentTimeMillis2 = System.currentTimeMillis();
            jSONObject2 = JsonUtil.parse(bArr);
            if (jSONObject2 != null && this.J < 0) {
                this.J = System.currentTimeMillis() - currentTimeMillis2;
                if (bArr != null && bArr.length > 0) {
                    this.K = bArr.length;
                }
                TBSdkLog.e("mtopsdk.StreamNetworkListenerAdapter", this.h, "[fast-json]cost = " + this.J + ", size = " + this.K);
            }
        }
        return jSONObject2;
    }

    public void b(NetworkEvent.FinishEvent finishEvent) {
        final byte[] bArr;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3edd52fb", new Object[]{this, finishEvent});
        } else if (this.c == null) {
            TBSdkLog.e("mtopsdk.StreamNetworkListenerAdapter", this.h, "[onFinishTask]networkCallback is null");
        } else {
            ryq ryqVar = null;
            if (!this.j) {
                byte[] bArr2 = this.A;
                if (bArr2 != null) {
                    int length = bArr2.length;
                    int i = this.z;
                    if (length != i) {
                        bArr = Arrays.copyOf(bArr2, i);
                        jSONObject = d(bArr);
                    }
                }
                bArr = this.A;
                jSONObject = d(bArr);
            } else {
                bArr = this.D != null ? new byte[0] : null;
                arr.a aVar = this.I;
                if (aVar != null) {
                    aVar.a();
                    this.I = null;
                }
                jSONObject = null;
            }
            mtopsdk.network.domain.c cVar = new mtopsdk.network.domain.c() { // from class: mtopsdk.network.impl.e.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // mtopsdk.network.domain.c
                public InputStream b() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (InputStream) ipChange2.ipc$dispatch("97efb06c", new Object[]{this});
                    }
                    return null;
                }

                @Override // mtopsdk.network.domain.c
                public long a() throws IOException {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Number) ipChange2.ipc$dispatch("56c6c5c", new Object[]{this})).longValue();
                    }
                    byte[] bArr3 = bArr;
                    if (bArr3 == null) {
                        return 0L;
                    }
                    return bArr3.length;
                }

                @Override // mtopsdk.network.domain.c
                public byte[] c() throws IOException {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (byte[]) ipChange2.ipc$dispatch("ab8ad2b3", new Object[]{this}) : bArr;
                }
            };
            if (this.j) {
                ryqVar = new ryq();
                ryqVar.f33423a = this.d.get();
                ryqVar.b = this.e.get();
                ryqVar.j = this.u;
            }
            if (this.C == null) {
                this.C = new HashMap();
            }
            if (StringUtils.isEmpty(HeaderHandlerUtil.getSingleHeaderFieldByKey(this.C, HttpHeaderConstant.X_RETCODE))) {
                this.C.put(HttpHeaderConstant.X_RETCODE, new ArrayList(Collections.singleton(ErrorConstant.ERRCODE_SYS_STREAM_UNKNOWN_ERROR)));
            }
            NetworkStats a2 = ryr.a(finishEvent.getStatisticData());
            a2.streamParseTime = this.J;
            a2.streamParseSize = this.K;
            a2.streamParseException = this.L;
            this.c.onResponse(this.b, new b.a().a(this.b.a()).a(finishEvent.getHttpCode()).a(finishEvent.getDesc()).a(this.C).a(cVar).a(ryqVar).a(jSONObject).a(a2).a());
        }
    }

    private void a(byte[] bArr, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba72b5a1", new Object[]{this, bArr, jSONObject});
        } else if (bArr == null || bArr.length == 0) {
            TBSdkLog.e("mtopsdk.StreamNetworkListenerAdapter", this.h, "[onReceiveData] bytes is null.");
        } else if (this.f.get()) {
            TBSdkLog.e("mtopsdk.StreamNetworkListenerAdapter", this.h, "[onReceiveData] read timeout finish.");
        } else if (this.l) {
            f a2 = f.a(new String(bArr));
            String a3 = a2.a();
            String b = a2.b();
            if (this.C == null) {
                this.C = new HashMap();
            }
            if (!StringUtils.isEmpty(a3)) {
                this.C.put(HttpHeaderConstant.X_RETCODE, new ArrayList(Collections.singleton(a3)));
            }
            if (StringUtils.isEmpty(b)) {
                return;
            }
            this.C.put(HttpHeaderConstant.X_BIN_LENGTH, new ArrayList(Collections.singleton(b)));
        } else {
            if (this.p <= 0 && this.o > 0) {
                this.p = System.currentTimeMillis() - this.o;
            }
            if (!this.x.get()) {
                this.x.set(true);
            }
            ryq ryqVar = new ryq();
            ryqVar.c = this.F;
            ryqVar.d = this.p;
            ryqVar.e = this.q;
            ryqVar.f = this.v.get();
            ryqVar.h = this.w.get();
            ryqVar.g = this.y.get();
            ryqVar.i = this.s;
            mtopsdk.network.domain.b a4 = new b.a().a(this.b.a()).a(this.B).a(new HashMap(this.C)).a(bArr).a(jSONObject).a(ryqVar).a();
            ryp rypVar = this.c;
            if (!(rypVar instanceof StreamNetworkCallbackAdapter)) {
                return;
            }
            ((StreamNetworkCallbackAdapter) rypVar).onReceiveData(a4);
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        String str = this.h;
        MtopSDKThreadPoolExecutorFactory.submitStreamRequestTask(str != null ? str.hashCode() : hashCode(), new Runnable() { // from class: mtopsdk.network.impl.e.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                ryq ryqVar = new ryq();
                ryqVar.c = e.p(e.this);
                ryqVar.f33423a = e.q(e.this).get();
                ryqVar.b = e.r(e.this).get();
                e.this.c.onResponse(e.this.b, new b.a().a(e.this.b.a()).a(-9).a(e.o(e.this)).a(new byte[0]).a(ryqVar).a());
            }
        });
    }

    /* loaded from: classes9.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private volatile long b;
        private volatile boolean c;

        static {
            kge.a(-1869335908);
            kge.a(-1390502639);
        }

        private a() {
            this.b = 0L;
            this.c = false;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (this.c || e.s(e.this) || System.currentTimeMillis() < this.b) {
            } else {
                e.d(e.this).set(true);
                TBSdkLog.e("mtopsdk.StreamNetworkListenerAdapter", e.j(e.this), "[BodyTimeoutChecker] read timeout.");
                e.t(e.this);
            }
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else {
                a(e.u(e.this));
            }
        }

        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            } else {
                this.c = true;
            }
        }

        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            } else {
                this.b = System.currentTimeMillis() + e.u(e.this);
            }
        }

        private void a(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
                return;
            }
            this.b = System.currentTimeMillis() + j;
            MtopSDKThreadPoolExecutorFactory.getSsrScheduledExecutorService().schedule(this, j, TimeUnit.MILLISECONDS);
        }
    }
}
