package mtopsdk.network.impl;

import anetwork.channel.NetworkCallBack;
import anetwork.channel.NetworkEvent;
import anetwork.channel.aidl.ParcelableInputStream;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import mtopsdk.common.util.HeaderHandlerUtil;
import mtopsdk.common.util.HttpHeaderConstant;
import mtopsdk.common.util.StringUtils;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.global.SwitchConfig;
import mtopsdk.mtop.network.NetworkCallbackAdapter;
import mtopsdk.mtop.util.JsonUtil;
import mtopsdk.mtop.util.MtopSDKThreadPoolExecutorFactory;
import mtopsdk.network.domain.NetworkStats;
import mtopsdk.network.domain.b;
import tb.arr;
import tb.kge;
import tb.ryn;
import tb.ryp;
import tb.ryr;

/* loaded from: classes.dex */
public class d implements NetworkCallBack.FinishListener, NetworkCallBack.InputStreamListener, NetworkCallBack.ResponseCodeListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f25013a;
    public Map<String, List<String>> b;
    public final String c;
    public ryn h;
    public ryp i;
    private boolean k;
    private volatile boolean j = false;
    public NetworkEvent.FinishEvent d = null;
    public boolean e = false;
    public ByteArrayOutputStream f = null;
    private arr.a l = null;
    private arr.b<BaseOutDo> m = null;
    private long n = -1;
    private long o = -1;
    private boolean p = false;
    public int g = 0;

    static {
        kge.a(-209678754);
        kge.a(1776397793);
        kge.a(2011859359);
        kge.a(-501869850);
    }

    public static /* synthetic */ arr.a a(d dVar, arr.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (arr.a) ipChange.ipc$dispatch("8bff7dd2", new Object[]{dVar, aVar});
        }
        dVar.l = aVar;
        return aVar;
    }

    public static /* synthetic */ arr.b a(d dVar, arr.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (arr.b) ipChange.ipc$dispatch("7a828472", new Object[]{dVar, bVar});
        }
        dVar.m = bVar;
        return bVar;
    }

    public static /* synthetic */ boolean a(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("53028fc8", new Object[]{dVar})).booleanValue() : dVar.k;
    }

    public static /* synthetic */ arr.b b(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (arr.b) ipChange.ipc$dispatch("29986a22", new Object[]{dVar}) : dVar.m;
    }

    public static /* synthetic */ arr.a c(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (arr.a) ipChange.ipc$dispatch("8aeb06a2", new Object[]{dVar}) : dVar.l;
    }

    public d(ryn rynVar, ryp rypVar, String str) {
        boolean z = false;
        this.k = false;
        this.h = rynVar;
        this.i = rypVar;
        this.c = str;
        if (SwitchConfig.getInstance().isStreamJsonEnable() && rynVar.a().x) {
            z = true;
        }
        this.k = z;
        if (!this.k || rynVar.a().y == null) {
            return;
        }
        this.k = SwitchConfig.getInstance().isStreamJsonParseObjectEnable();
    }

    @Override // anetwork.channel.NetworkCallBack.ResponseCodeListener
    public boolean onResponseCode(int i, Map<String, List<String>> map, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("45b007d6", new Object[]{this, new Integer(i), map, obj})).booleanValue();
        }
        this.f25013a = i;
        this.b = map;
        try {
            String singleHeaderFieldByKey = HeaderHandlerUtil.getSingleHeaderFieldByKey(this.b, "content-length");
            if (StringUtils.isBlank(singleHeaderFieldByKey)) {
                singleHeaderFieldByKey = HeaderHandlerUtil.getSingleHeaderFieldByKey(this.b, HttpHeaderConstant.X_BIN_LENGTH);
            }
            if (StringUtils.isNotBlank(singleHeaderFieldByKey)) {
                this.g = Integer.parseInt(singleHeaderFieldByKey);
            }
        } catch (Exception unused) {
            TBSdkLog.e("mtopsdk.NetworkListenerAdapter", this.c, "[onResponseCode]parse Response HeaderField ContentLength error ");
        }
        ryp rypVar = this.i;
        if (rypVar instanceof NetworkCallbackAdapter) {
            ((NetworkCallbackAdapter) rypVar).onHeader();
        }
        return false;
    }

    @Override // anetwork.channel.NetworkCallBack.FinishListener
    public void onFinished(NetworkEvent.FinishEvent finishEvent, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a00910e8", new Object[]{this, finishEvent, obj});
            return;
        }
        synchronized (this) {
            this.d = finishEvent;
            if (this.e || !this.j) {
                a(finishEvent, obj);
            }
        }
    }

    @Override // anetwork.channel.NetworkCallBack.InputStreamListener
    public void onInputStreamGet(final ParcelableInputStream parcelableInputStream, final Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91cf6995", new Object[]{this, parcelableInputStream, obj});
            return;
        }
        this.j = true;
        MtopSDKThreadPoolExecutorFactory.submitRequestTask(new Runnable() { // from class: mtopsdk.network.impl.d.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Code restructure failed: missing block: B:37:0x00e4, code lost:
                if (r0 != null) goto L54;
             */
            /* JADX WARN: Code restructure failed: missing block: B:44:0x00fd, code lost:
                if (r0 == null) goto L41;
             */
            /* JADX WARN: Code restructure failed: missing block: B:45:0x00ff, code lost:
                r0.close();
             */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void run() {
                /*
                    Method dump skipped, instructions count: 310
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: mtopsdk.network.impl.d.AnonymousClass1.run():void");
            }
        });
    }

    public void a(final NetworkEvent.FinishEvent finishEvent, final Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("260f11f8", new Object[]{this, finishEvent, obj});
            return;
        }
        String str = this.c;
        MtopSDKThreadPoolExecutorFactory.submitCallbackTask(str != null ? str.hashCode() : hashCode(), new Runnable() { // from class: mtopsdk.network.impl.d.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    long currentTimeMillis = System.currentTimeMillis();
                    d.this.b(finishEvent, obj);
                    if (!TBSdkLog.isLogEnable(TBSdkLog.LogEnable.DebugEnable)) {
                        return;
                    }
                    String str2 = d.this.c;
                    TBSdkLog.d("mtopsdk.NetworkListenerAdapter", str2, "[callFinish] execute onFinishTask time[ms] " + (System.currentTimeMillis() - currentTimeMillis));
                } catch (Exception e) {
                    TBSdkLog.e("mtopsdk.NetworkListenerAdapter", d.this.c, "[callFinish]execute onFinishTask error.", e);
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r5v14, types: [mtopsdk.mtop.domain.BaseOutDo] */
    /* JADX WARN: Type inference failed for: r7v9, types: [mtopsdk.mtop.domain.BaseOutDo] */
    public void b(NetworkEvent.FinishEvent finishEvent, Object obj) {
        Exception e;
        BaseOutDo baseOutDo;
        JSONObject jSONObject;
        BaseOutDo baseOutDo2;
        JSONObject parse;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("903e9a17", new Object[]{this, finishEvent, obj});
        } else if (this.i == null) {
            TBSdkLog.e("mtopsdk.NetworkListenerAdapter", this.c, "[onFinishTask]networkCallback is null");
        } else {
            ByteArrayOutputStream byteArrayOutputStream = this.f;
            JSONObject jSONObject2 = null;
            final byte[] byteArray = byteArrayOutputStream != null ? byteArrayOutputStream.toByteArray() : null;
            if (this.k) {
                try {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (this.l != null) {
                        this.l.a();
                        jSONObject = this.l.b();
                    } else {
                        jSONObject = null;
                    }
                    try {
                        if (this.m != null) {
                            this.m.a();
                            jSONObject2 = this.m.b();
                        }
                        if (jSONObject2 != null || jSONObject != null) {
                            this.n = System.currentTimeMillis() - currentTimeMillis;
                            if (byteArray != null && byteArray.length > 0) {
                                this.o = byteArray.length;
                            }
                            TBSdkLog.e("mtopsdk.NetworkListenerAdapter", this.c, "[stream-json]cost = " + this.n + ", size = " + this.o);
                        }
                        JSONObject jSONObject3 = jSONObject;
                        baseOutDo2 = jSONObject2;
                        jSONObject2 = jSONObject3;
                    } catch (Exception e2) {
                        e = e2;
                        JSONObject jSONObject4 = jSONObject;
                        baseOutDo = jSONObject2;
                        jSONObject2 = jSONObject4;
                        this.p = true;
                        TBSdkLog.e("mtopsdk.NetworkListenerAdapter", this.c, "[stream-json]failed.", e);
                        baseOutDo2 = baseOutDo;
                        mtopsdk.network.domain.c cVar = new mtopsdk.network.domain.c() { // from class: mtopsdk.network.impl.d.3
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
                                byte[] bArr = byteArray;
                                if (bArr == null) {
                                    return 0L;
                                }
                                return bArr.length;
                            }

                            @Override // mtopsdk.network.domain.c
                            public byte[] c() throws IOException {
                                IpChange ipChange2 = $ipChange;
                                return ipChange2 instanceof IpChange ? (byte[]) ipChange2.ipc$dispatch("ab8ad2b3", new Object[]{this}) : byteArray;
                            }
                        };
                        NetworkStats a2 = ryr.a(finishEvent.getStatisticData());
                        a2.streamParseTime = this.n;
                        a2.streamParseSize = this.o;
                        a2.streamParseException = this.p;
                        this.i.onResponse(this.h, new b.a().a(this.h.a()).a(finishEvent.getHttpCode()).a(finishEvent.getDesc()).a(this.b).a(cVar).a(jSONObject2).a(baseOutDo2).a(a2).a());
                    }
                } catch (Exception e3) {
                    e = e3;
                    baseOutDo = null;
                }
            } else if (this.h.a().x) {
                long currentTimeMillis2 = System.currentTimeMillis();
                if (this.h.a().y != null) {
                    parse = null;
                    jSONObject2 = JsonUtil.parseObject(byteArray, this.h.a().y);
                } else {
                    parse = JsonUtil.parse(byteArray);
                }
                if (jSONObject2 != null || parse != null) {
                    this.n = System.currentTimeMillis() - currentTimeMillis2;
                    if (byteArray != null && byteArray.length > 0) {
                        this.o = byteArray.length;
                    }
                    TBSdkLog.e("mtopsdk.NetworkListenerAdapter", this.c, "[fast-json]cost = " + this.n + ", size = " + this.o);
                }
                baseOutDo2 = jSONObject2;
                jSONObject2 = parse;
            } else {
                baseOutDo2 = null;
            }
            mtopsdk.network.domain.c cVar2 = new mtopsdk.network.domain.c() { // from class: mtopsdk.network.impl.d.3
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
                    byte[] bArr = byteArray;
                    if (bArr == null) {
                        return 0L;
                    }
                    return bArr.length;
                }

                @Override // mtopsdk.network.domain.c
                public byte[] c() throws IOException {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (byte[]) ipChange2.ipc$dispatch("ab8ad2b3", new Object[]{this}) : byteArray;
                }
            };
            NetworkStats a22 = ryr.a(finishEvent.getStatisticData());
            a22.streamParseTime = this.n;
            a22.streamParseSize = this.o;
            a22.streamParseException = this.p;
            this.i.onResponse(this.h, new b.a().a(this.h.a()).a(finishEvent.getHttpCode()).a(finishEvent.getDesc()).a(this.b).a(cVar2).a(jSONObject2).a(baseOutDo2).a(a22).a());
        }
    }
}
