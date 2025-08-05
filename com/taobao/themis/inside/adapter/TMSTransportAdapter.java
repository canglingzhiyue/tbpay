package com.taobao.themis.inside.adapter;

import android.app.Application;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.LocaleList;
import android.text.TextUtils;
import anet.channel.request.ByteArrayEntry;
import anetwork.channel.NetworkCallBack;
import anetwork.channel.NetworkEvent;
import anetwork.channel.Response;
import anetwork.channel.aidl.ParcelableInputStream;
import anetwork.channel.degrade.DegradableNetwork;
import anetwork.channel.entity.RequestImpl;
import anetwork.channel.statist.StatisticData;
import anetwork.channel.util.RequestConstant;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.security.realidentity.o;
import com.alibaba.security.realidentity.u2;
import com.alipay.android.msp.framework.dynfun.TplMsg;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.alipay.mobile.common.transport.utils.HeaderConstant;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.input.InputFrame3;
import com.taobao.themis.kernel.adapter.IEnvironmentService;
import com.taobao.themis.kernel.adapter.ITransportAdapter;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.i;
import com.taobao.themis.open.ability.calendar.TMSCalendarBridge;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.p;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.kml;
import tb.kmm;
import tb.kmo;
import tb.kmq;
import tb.qpt;
import tb.qpw;
import tb.qpx;
import tb.qpy;
import tb.qpz;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00142\u00020\u0001:\u0002\u0014\u0015B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\n\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0002J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000f\u001a\u00020\fH\u0016J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002¨\u0006\u0016"}, d2 = {"Lcom/taobao/themis/inside/adapter/TMSTransportAdapter;", "Lcom/taobao/themis/kernel/adapter/ITransportAdapter;", "()V", "addDownload", "", "downloadRequest", "Lcom/taobao/themis/kernel/network/download/TMSDownloadRequest;", "downloadCallback", "Lcom/taobao/themis/kernel/network/download/TMSDownloadCallback;", "asyncHttpRequest", "Lcom/taobao/themis/kernel/network/http/RVHttpResponse;", "rvHttpRequest", "Lcom/taobao/themis/kernel/network/http/RVHttpRequest;", "getLanguageString", "", com.taobao.themis.open.permission.check.a.HTTPREQUET, "syncHttpRequest", "wrapResponse", InputFrame3.TYPE_RESPONSE, "Lanetwork/channel/Response;", "Companion", "NetCallback", "themis_inside_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class TMSTransportAdapter implements ITransportAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    /* renamed from: a  reason: collision with root package name */
    private static int f22458a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\"\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/taobao/themis/inside/adapter/TMSTransportAdapter$NetCallback;", "Lanetwork/channel/NetworkCallBack$FinishListener;", "Lanetwork/channel/NetworkCallBack$ResponseCodeListener;", "Lanetwork/channel/NetworkCallBack$InputStreamListener;", "()V", "themis_inside_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static abstract class b implements NetworkCallBack.FinishListener, NetworkCallBack.InputStreamListener, NetworkCallBack.ResponseCodeListener {
        static {
            kge.a(478182913);
            kge.a(-501869850);
            kge.a(1776397793);
            kge.a(2011859359);
        }
    }

    static {
        kge.a(-1519804349);
        kge.a(-1848275117);
        Companion = new a(null);
    }

    @Override // com.taobao.themis.kernel.adapter.ITransportAdapter
    public qpz httpRequest(qpy httpRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qpz) ipChange.ipc$dispatch("1be2947", new Object[]{this, httpRequest});
        }
        q.d(httpRequest, "httpRequest");
        String a2 = httpRequest.a(i.CDN_REQUEST_TYPE);
        q.b(a2, "httpRequest.getExtParams…nstants.CDN_REQUEST_TYPE)");
        f22458a++;
        if (httpRequest.d() != null) {
            Map<String, String> d2 = httpRequest.d();
            q.b(d2, "httpRequest.headers");
            d2.put("triverRequestId", String.valueOf(f22458a));
        }
        if (TextUtils.equals("async", a2)) {
            return a(httpRequest);
        }
        Map<String, String> d3 = httpRequest.d();
        if (q.a((Object) "true", (Object) (d3 != null ? d3.get("x-miniapp-big-file") : null))) {
            return a(httpRequest);
        }
        return b(httpRequest);
    }

    private final qpz a(qpy qpyVar) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        int i = 2;
        if (ipChange instanceof IpChange) {
            return (qpz) ipChange.ipc$dispatch("b44b8d", new Object[]{this, qpyVar});
        }
        long currentTimeMillis = System.currentTimeMillis();
        TMSLogger.b("TMSTransportAdapter", "http request , url:" + qpyVar.b());
        Application applicationContext = ((IEnvironmentService) qpt.a(IEnvironmentService.class)).getApplicationContext();
        q.b(applicationContext, "TMSAdapterManager.getNot…).getApplicationContext()");
        Application application = applicationContext;
        RequestImpl requestImpl = new RequestImpl(qpyVar.b());
        requestImpl.setBizId("windmill");
        String c2 = qpyVar.c();
        byte[] e = qpyVar.e();
        if (qpyVar.d() != null) {
            for (String str : qpyVar.d().keySet()) {
                requestImpl.addHeader(str, qpyVar.d().get(str));
            }
        }
        requestImpl.addHeader(HeaderConstant.HEADER_KEY_ACCEPT_LANGUAGE, a());
        if (TextUtils.isEmpty(c2)) {
            c2 = "GET";
        }
        requestImpl.setMethod(c2);
        requestImpl.setCharset("UTF-8");
        String retryTimeStr = qpyVar.a(u2.k);
        if (!TextUtils.isEmpty(retryTimeStr)) {
            try {
                q.b(retryTimeStr, "retryTimeStr");
                i = Integer.parseInt(retryTimeStr);
            } catch (Exception e2) {
                TMSLogger.b("TMSTransportAdapter", "parse retryTime error", e2);
            }
        }
        requestImpl.setRetryTime(i);
        int i2 = 15000;
        try {
            if (qpyVar.f() > 0) {
                i2 = (int) qpyVar.f();
            }
        } catch (Exception unused) {
        }
        requestImpl.setReadTimeout(i2);
        requestImpl.setConnectTimeout(i2);
        String a2 = qpyVar.a("cookie");
        if (!TextUtils.isEmpty(a2)) {
            requestImpl.addHeader("Cookie", a2);
        } else {
            requestImpl.setExtProperty(RequestConstant.KEEP_CUSTOM_COOKIE, "true");
        }
        if (e != null) {
            if (e.length == 0) {
                z = true;
            }
            if (!z) {
                requestImpl.setBodyEntry(new ByteArrayEntry(e));
            }
        }
        DegradableNetwork degradableNetwork = new DegradableNetwork(application);
        CountDownLatch countDownLatch = new CountDownLatch(1);
        qpz qpzVar = new qpz();
        HandlerThread handlerThread = new HandlerThread("TriverTransportThread");
        handlerThread.start();
        degradableNetwork.asyncSend(requestImpl, null, null, new d(new Handler(handlerThread.getLooper()), qpzVar, qpyVar, currentTimeMillis, countDownLatch));
        try {
            countDownLatch.await(30L, TimeUnit.SECONDS);
        } catch (InterruptedException e3) {
            TMSLogger.b("TMSTransportAdapter", "asyncHttpRequest error", e3);
        }
        handlerThread.quit();
        TMSLogger.b("TMSTransportAdapter", "asyncHttpRequest finish");
        return qpzVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000G\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\rH\u0016J2\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0018\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00180\u00162\u0006\u0010\f\u001a\u00020\rH\u0016R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\u0019"}, d2 = {"com/taobao/themis/inside/adapter/TMSTransportAdapter$asyncHttpRequest$1", "Lcom/taobao/themis/inside/adapter/TMSTransportAdapter$NetCallback;", "mBos", "Ljava/io/ByteArrayOutputStream;", "getMBos", "()Ljava/io/ByteArrayOutputStream;", "setMBos", "(Ljava/io/ByteArrayOutputStream;)V", "onFinished", "", "finishEvent", "Lanetwork/channel/NetworkEvent$FinishEvent;", o.b, "", "onInputStreamGet", "parcelableInputStream", "Lanetwork/channel/aidl/ParcelableInputStream;", "onResponseCode", "", com.alibaba.analytics.core.sync.q.MSGTYPE_INTERVAL, "", "map", "", "", "", "themis_inside_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class d extends b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Handler f22460a;
        public final /* synthetic */ qpz b;
        public final /* synthetic */ qpy c;
        public final /* synthetic */ long d;
        public final /* synthetic */ CountDownLatch e;
        private ByteArrayOutputStream f;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 1})
        /* loaded from: classes9.dex */
        public static final class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public final /* synthetic */ NetworkEvent.FinishEvent b;

            public a(NetworkEvent.FinishEvent finishEvent) {
                this.b = finishEvent;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                if (d.this.a() != null) {
                    qpz qpzVar = d.this.b;
                    ByteArrayOutputStream a2 = d.this.a();
                    q.a(a2);
                    qpzVar.a(new ByteArrayInputStream(a2.toByteArray()));
                }
                d.this.b.a(this.b.getHttpCode());
                StatisticData statisticData = this.b.getStatisticData();
                if (200 != d.this.b.a()) {
                    HashMap hashMap = new HashMap();
                    HashMap hashMap2 = hashMap;
                    hashMap2.put("networkErrorUrl", d.this.c.b());
                    hashMap2.put("desc", this.b.getDesc());
                    if (statisticData != null) {
                        try {
                            hashMap.put("connectionType", statisticData.connectionType);
                            hashMap.put("dataSpeed", Long.valueOf(statisticData.dataSpeed));
                            hashMap.put("host", statisticData.host);
                            hashMap.put("ip_port", statisticData.ip_port);
                            hashMap.put("isSSL", Boolean.valueOf(statisticData.isSSL));
                            hashMap.put("resultCode", Integer.valueOf(statisticData.resultCode));
                            hashMap.put("rtt", Long.valueOf(statisticData.rtt));
                            hashMap.put("sendSize", Long.valueOf(statisticData.sendSize));
                            hashMap.put("totalSize", Long.valueOf(statisticData.totalSize));
                            hashMap.put("cacheTime", Long.valueOf(statisticData.cacheTime));
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                    }
                    HashMap hashMap3 = new HashMap();
                    String appId = d.this.c.a("appId");
                    d.this.c.a("sessionId");
                    q.b(appId, "appId");
                    hashMap3.put("appId", appId);
                    String a3 = d.this.c.a(qpy.PLUGIN_ID);
                    q.b(a3, "rvHttpRequest.getExtPara…(RVHttpRequest.PLUGIN_ID)");
                    hashMap3.put(qpy.PLUGIN_ID, a3);
                } else {
                    long currentTimeMillis = System.currentTimeMillis() - d.this.d;
                    TMSLogger.b("TMSTransportAdapter", "http request end, url:" + d.this.c.b() + ", duration:" + currentTimeMillis);
                }
                d.this.e.countDown();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 1})
        /* loaded from: classes9.dex */
        public static final class b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public final /* synthetic */ ParcelableInputStream b;

            public b(ParcelableInputStream parcelableInputStream) {
                this.b = parcelableInputStream;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    d.this.a(new ByteArrayOutputStream(this.b.length() > 0 ? this.b.length() : 20480));
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int read = this.b.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        ByteArrayOutputStream a2 = d.this.a();
                        q.a(a2);
                        a2.write(bArr, 0, read);
                    }
                    this.b.close();
                    if (d.this.a() == null) {
                        return;
                    }
                    ByteArrayOutputStream a3 = d.this.a();
                    q.a(a3);
                    a3.close();
                } catch (Exception e) {
                    TMSLogger.b("TMSTransportAdapter", "asyncHttpRequest error", e);
                }
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 1})
        /* loaded from: classes9.dex */
        public static final class c implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public final /* synthetic */ Map b;

            public c(Map map) {
                this.b = map;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    d.this.b.a(this.b);
                }
            }
        }

        public d(Handler handler, qpz qpzVar, qpy qpyVar, long j, CountDownLatch countDownLatch) {
            this.f22460a = handler;
            this.b = qpzVar;
            this.c = qpyVar;
            this.d = j;
            this.e = countDownLatch;
        }

        public final ByteArrayOutputStream a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ByteArrayOutputStream) ipChange.ipc$dispatch("cc621f23", new Object[]{this}) : this.f;
        }

        public final void a(ByteArrayOutputStream byteArrayOutputStream) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1e4cb923", new Object[]{this, byteArrayOutputStream});
            } else {
                this.f = byteArrayOutputStream;
            }
        }

        @Override // anetwork.channel.NetworkCallBack.InputStreamListener
        public void onInputStreamGet(ParcelableInputStream parcelableInputStream, Object o) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("91cf6995", new Object[]{this, parcelableInputStream, o});
                return;
            }
            q.d(parcelableInputStream, "parcelableInputStream");
            q.d(o, "o");
            this.f22460a.post(new b(parcelableInputStream));
        }

        @Override // anetwork.channel.NetworkCallBack.FinishListener
        public void onFinished(NetworkEvent.FinishEvent finishEvent, Object o) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a00910e8", new Object[]{this, finishEvent, o});
                return;
            }
            q.d(finishEvent, "finishEvent");
            q.d(o, "o");
            this.f22460a.post(new a(finishEvent));
        }

        @Override // anetwork.channel.NetworkCallBack.ResponseCodeListener
        public boolean onResponseCode(int i, Map<String, ? extends List<String>> map, Object o) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("45b007d6", new Object[]{this, new Integer(i), map, o})).booleanValue();
            }
            q.d(map, "map");
            q.d(o, "o");
            this.f22460a.post(new c(map));
            return false;
        }
    }

    private final qpz b(qpy qpyVar) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        int i = 2;
        if (ipChange instanceof IpChange) {
            return (qpz) ipChange.ipc$dispatch("e85621ec", new Object[]{this, qpyVar});
        }
        long currentTimeMillis = System.currentTimeMillis();
        TMSLogger.b("TMSTransportAdapter", "http request , url:" + qpyVar.b());
        Object a2 = qpt.a(IEnvironmentService.class);
        q.b(a2, "TMSAdapterManager.getNot…nmentService::class.java)");
        Application applicationContext = ((IEnvironmentService) a2).getApplicationContext();
        q.b(applicationContext, "TMSAdapterManager.getNot….java).applicationContext");
        Application application = applicationContext;
        RequestImpl requestImpl = new RequestImpl(qpyVar.b());
        requestImpl.setBizId("windmill");
        String c2 = qpyVar.c();
        byte[] e = qpyVar.e();
        if (qpyVar.d() != null) {
            for (String str : qpyVar.d().keySet()) {
                requestImpl.addHeader(str, qpyVar.d().get(str));
            }
        }
        requestImpl.addHeader(HeaderConstant.HEADER_KEY_ACCEPT_LANGUAGE, a());
        if (TextUtils.isEmpty(c2)) {
            c2 = "GET";
        }
        requestImpl.setMethod(c2);
        requestImpl.setCharset("UTF-8");
        String retryTimeStr = qpyVar.a(u2.k);
        if (!TextUtils.isEmpty(retryTimeStr)) {
            try {
                q.b(retryTimeStr, "retryTimeStr");
                i = Integer.parseInt(retryTimeStr);
            } catch (Exception e2) {
                TMSLogger.b("TMSTransportAdapter", "parse retryTime error", e2);
            }
        }
        requestImpl.setRetryTime(i);
        int i2 = 15000;
        try {
            if (qpyVar.f() > 0) {
                i2 = (int) qpyVar.f();
            }
        } catch (Exception unused) {
        }
        requestImpl.setReadTimeout(i2);
        requestImpl.setConnectTimeout(i2);
        String a3 = qpyVar.a("cookie");
        if (!TextUtils.isEmpty(a3)) {
            requestImpl.addHeader("Cookie", a3);
        } else {
            requestImpl.setExtProperty(RequestConstant.KEEP_CUSTOM_COOKIE, "true");
        }
        if (e != null) {
            if (e.length == 0) {
                z = true;
            }
            if (!z) {
                requestImpl.setBodyEntry(new ByteArrayEntry(e));
            }
        }
        Response syncSend = new DegradableNetwork(application).syncSend(requestImpl, null);
        if (syncSend != null) {
            qpz a4 = a(syncSend);
            if (200 != syncSend.getStatusCode()) {
                HashMap hashMap = new HashMap();
                HashMap hashMap2 = hashMap;
                hashMap2.put("networkErrorUrl", qpyVar.b());
                hashMap2.put("desc", syncSend.getDesc());
                try {
                    StatisticData statisticData = syncSend.getStatisticData();
                    if (statisticData != null) {
                        hashMap.put("connectionType", statisticData.connectionType);
                        hashMap.put("dataSpeed", Long.valueOf(statisticData.dataSpeed));
                        hashMap.put("host", statisticData.host);
                        hashMap.put("ip_port", statisticData.ip_port);
                        hashMap.put("isSSL", Boolean.valueOf(statisticData.isSSL));
                        hashMap.put("resultCode", Integer.valueOf(statisticData.resultCode));
                        hashMap.put("rtt", Long.valueOf(statisticData.rtt));
                        hashMap.put("sendSize", Long.valueOf(statisticData.sendSize));
                        hashMap.put("totalSize", Long.valueOf(statisticData.totalSize));
                        hashMap.put("cacheTime", Long.valueOf(statisticData.cacheTime));
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
                HashMap hashMap3 = new HashMap();
                String appId = qpyVar.a("appId");
                qpyVar.a("sessionId");
                q.b(appId, "appId");
                hashMap3.put("appId", appId);
                String a5 = qpyVar.a(qpy.PLUGIN_ID);
                q.b(a5, "rvHttpRequest.getExtPara…(RVHttpRequest.PLUGIN_ID)");
                hashMap3.put(qpy.PLUGIN_ID, a5);
            } else {
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                TMSLogger.b("TMSTransportAdapter", "http request end, url:" + qpyVar.b() + ", duration:" + currentTimeMillis2);
            }
            TMSLogger.b("TMSTransportAdapter", "syncHttpRequest finish");
            return a4;
        }
        TMSLogger.d("TMSTransportAdapter", "syncHttpRequest finish");
        return null;
    }

    @Override // com.taobao.themis.kernel.adapter.ITransportAdapter
    public void addDownload(qpx downloadRequest, qpw qpwVar) {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fafcc1f", new Object[]{this, downloadRequest, qpwVar});
            return;
        }
        q.d(downloadRequest, "downloadRequest");
        long currentTimeMillis = System.currentTimeMillis();
        TMSLogger.b("TMSTransportAdapter", "download request , url:" + downloadRequest.b());
        kmm kmmVar = new kmm();
        kmo kmoVar = new kmo(downloadRequest.b());
        if (downloadRequest.d() != null) {
            JSONObject d2 = downloadRequest.d();
            q.b(d2, "downloadRequest.headers");
            if (d2.containsKey("content-length")) {
                try {
                    j = d2.getLongValue("content-length");
                } catch (Exception e) {
                    e.printStackTrace();
                    j = 0;
                }
                if (j != 0) {
                    kmoVar.b = j;
                }
            }
        }
        kmmVar.f30166a = p.c(kmoVar);
        kmmVar.b = new kmq();
        kmmVar.b.f30169a = TMSCalendarBridge.namespace;
        kmmVar.b.h = downloadRequest.a();
        if (!downloadRequest.c()) {
            kmmVar.b.r = 0;
        }
        com.taobao.downloader.b.a().a(kmmVar, new c(qpwVar, currentTimeMillis, downloadRequest));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0005H\u0016J\u001c\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0007H\u0016J\u001a\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J$\u0010\u0012\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016¨\u0006\u0017"}, d2 = {"com/taobao/themis/inside/adapter/TMSTransportAdapter$addDownload$1", "Lcom/taobao/downloader/request/DownloadListener;", "onDownloadError", "", "path", "", "errorCode", "", "errorMsg", "onDownloadFinish", "url", "onDownloadProgress", com.alibaba.analytics.core.sync.q.MSGTYPE_INTERVAL, "onDownloadStateChange", "s", TplMsg.VALUE_T_NATIVE_RETURN, "", "onFinish", "onNetworkLimit", "param", "Lcom/taobao/downloader/request/Param;", "networkLimitCallback", "Lcom/taobao/downloader/request/DownloadListener$NetworkLimitCallback;", "themis_inside_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class c implements kml {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ qpw f22459a;
        public final /* synthetic */ long b;
        public final /* synthetic */ qpx c;

        @Override // tb.kml
        public void onDownloadProgress(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("49af8908", new Object[]{this, new Integer(i)});
            }
        }

        @Override // tb.kml
        public void onDownloadStateChange(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("98fdb789", new Object[]{this, str, new Boolean(z)});
            }
        }

        @Override // tb.kml
        public void onFinish(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6a109f1b", new Object[]{this, new Boolean(z)});
            }
        }

        @Override // tb.kml
        public void onNetworkLimit(int i, kmq kmqVar, kml.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6919023a", new Object[]{this, new Integer(i), kmqVar, aVar});
            }
        }

        public c(qpw qpwVar, long j, qpx qpxVar) {
            this.f22459a = qpwVar;
            this.b = j;
            this.c = qpxVar;
        }

        @Override // tb.kml
        public void onDownloadError(String str, int i, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cc722e3b", new Object[]{this, str, new Integer(i), str2});
                return;
            }
            TMSLogger.d("TMSTransportAdapter", "download request end, path: " + str + ", errorCode: " + i + ", errorMsg: " + str2);
        }

        @Override // tb.kml
        public void onDownloadFinish(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("43d7a315", new Object[]{this, str, str2});
                return;
            }
            long currentTimeMillis = System.currentTimeMillis() - this.b;
            TMSLogger.b("TMSTransportAdapter", "download request end, url:" + this.c.b() + ", duration:" + currentTimeMillis);
        }
    }

    private final String a() {
        Locale locale;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                locale = LocaleList.getDefault().get(0);
                q.b(locale, "LocaleList.getDefault()[0]");
            } else {
                locale = Locale.getDefault();
                q.b(locale, "Locale.getDefault()");
            }
            String str = locale.getLanguage() + "-" + locale.getCountry();
            if (q.a((Object) "zh", (Object) locale.getLanguage())) {
                return str + ",zh;q=0.8,en-US;q=0.5,en;q=0.3";
            }
            return str + "," + locale.getLanguage() + ";q=0.8,en-US;q=0.5,en;q=0.3";
        } catch (Exception unused) {
            return "zh-CN,zh;q=0.8,en-US;q=0.5,en;q=0.3";
        }
    }

    private final qpz a(Response response) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qpz) ipChange.ipc$dispatch("3a370c1", new Object[]{this, response});
        }
        qpz qpzVar = new qpz();
        qpzVar.a(response.getConnHeadFields());
        qpzVar.a(response.getStatusCode());
        if (response.getBytedata() != null) {
            qpzVar.a(new ByteArrayInputStream(response.getBytedata()));
        }
        return qpzVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/taobao/themis/inside/adapter/TMSTransportAdapter$Companion;", "", "()V", RPCDataItems.SWITCH_TAG_LOG, "", "sRequestId", "", "themis_inside_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a {
        static {
            kge.a(457987019);
        }

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.o oVar) {
            this();
        }
    }
}
