package tb;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.Base64;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.util.i;
import com.taobao.taolive.message_sdk.cdn.CDNMessage;
import com.taobao.taolive.message_sdk.cdn.CDNMessageResponse;
import com.taobao.taolive.message_sdk.cdn.a;
import com.taobao.taolive.message_sdk.cdn.b;
import com.taobao.taolive.message_sdk.cdn.mtopget.CDNMessageGetResponse;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.adapter.network.d;
import com.taobao.taolive.sdk.model.message.TLiveMsg;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes8.dex */
public class pep extends peo implements a, d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String c = "pep";
    private b d;
    private com.taobao.taolive.message_sdk.cdn.mtopget.a e;
    private HandlerThread f;
    private Handler g;
    private final Object h;
    private long i;
    private int j;
    private AtomicBoolean k;
    private AtomicBoolean l;

    public static /* synthetic */ Object ipc$super(pep pepVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void a(pep pepVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f976e3dd", new Object[]{pepVar});
        } else {
            pepVar.g();
        }
    }

    public static /* synthetic */ void b(pep pepVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7f9ea5e", new Object[]{pepVar});
        } else {
            pepVar.c();
        }
    }

    public pep(pee peeVar, peg pegVar) {
        super(peeVar, pegVar);
        this.f = null;
        this.h = new Object();
        this.k = new AtomicBoolean(false);
        this.l = new AtomicBoolean(false);
        this.j = peeVar.b.d;
    }

    @Override // com.taobao.taolive.message_sdk.cdn.a
    public void a(String str, String str2, String str3, String str4, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c38a06c", new Object[]{this, str, str2, str3, str4, obj});
        } else if (!this.f32574a.c()) {
            String str5 = "onSuccess[" + this.f32574a.f32564a + riy.BRACKET_START_STR + "cdn)]:" + obj;
            per.a(per.MODULE_POINT_CDN_RECEIVE, per.ERROR_CODE_NO_RUNNING, str5);
            pex.a(c, str5);
        } else {
            try {
                if (obj instanceof String) {
                    a(String.valueOf(obj), str, true);
                    per.a(per.MODULE_POINT_CDN_RECEIVE);
                    return;
                }
                String str6 = "onError[parse]:object instanceof String url " + str;
                per.a(per.MODULE_POINT_CDN_RECEIVE, per.ERROR_CODE_DATA_ERROR, str6);
                a(11002, (Object) null, str6);
            } catch (Exception e) {
                String str7 = "onError[parse]:" + e + " url " + str;
                per.a(per.MODULE_POINT_CDN_RECEIVE, per.ERROR_CODE_DATA_ERROR, str7);
                a(11002, e, str7);
            }
        }
    }

    private void a(String str, String str2, boolean z) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dbad4d8", new Object[]{this, str, str2, new Boolean(z)});
            return;
        }
        synchronized (this.h) {
            try {
                pex.a(c, "onSuccess[fetchCDNData]:" + str + " url " + str2);
                CDNMessageResponse cDNMessageResponse = (CDNMessageResponse) JSON.parseObject(str, CDNMessageResponse.class);
                JSONObject parseObject = JSON.parseObject(str);
                if (z && parseObject.containsKey("endTime")) {
                    this.i = cDNMessageResponse.endTime;
                }
                if (parseObject.containsKey("pullInterval") && cDNMessageResponse.pullInterval > 0) {
                    this.j = cDNMessageResponse.pullInterval;
                }
                if (parseObject.containsKey("subTypeColorRate")) {
                    this.f32574a.i.a(cDNMessageResponse.subTypeColorRate);
                }
                if (parseObject.containsKey("pullPolicy")) {
                    if (cDNMessageResponse.pullPolicy.isEmpty()) {
                        if (this.k.get()) {
                            this.k.set(false);
                            if (this.g != null) {
                                this.g.removeMessages(1000);
                                this.g.sendEmptyMessageDelayed(1000, 1000L);
                            }
                        }
                    } else if (cDNMessageResponse.pullPolicy.equals("SHORT")) {
                        if (this.k.get()) {
                            this.k.set(false);
                            if (this.g != null) {
                                this.g.removeMessages(1001);
                                this.g.sendEmptyMessage(1001);
                            }
                        }
                    } else {
                        this.k.set(cDNMessageResponse.pullPolicy.equals("LONG") && !this.f32574a.b.j);
                    }
                    pex.a(c, "parseData ,isLongPull: " + this.k.get());
                    if (this.k.get() && !this.l.get()) {
                        this.g.removeMessages(1000);
                        this.g.sendEmptyMessage(1000);
                    }
                }
                if (cDNMessageResponse.payloads != null && !cDNMessageResponse.payloads.isEmpty()) {
                    Iterator<CDNMessage> it = cDNMessageResponse.payloads.iterator();
                    while (it.hasNext()) {
                        CDNMessage next = it.next();
                        TLiveMsg tLiveMsg = new TLiveMsg();
                        tLiveMsg.data = Base64.decode(next.getData(), 0);
                        tLiveMsg.type = next.getSubType();
                        tLiveMsg.bizCode = this.f32574a.d;
                        tLiveMsg.messageId = next.getMsgId();
                        tLiveMsg.sendFullTags = this.f32574a.i.a(this.f32574a.c, next.getMsgId(), next.getSubType());
                        tLiveMsg.timestamp = next.getPushTime();
                        tLiveMsg.topic = next.getTopic();
                        int i = z ? 1 : 3;
                        String str3 = z ? "cdn" : "MTOP";
                        this.f32574a.i.a(i, str3, tLiveMsg, this.f32574a);
                        if (this.b != null) {
                            this.b.a(str3, tLiveMsg);
                        } else {
                            pex.a(c, "onSuccess[OnErrorListener is null]:" + this.f32574a.f32564a + " " + tLiveMsg + " url " + str2);
                        }
                    }
                } else {
                    pex.a(c, "onSuccess[Payloads is null]:" + this.f32574a.f32564a + " url " + str2);
                }
            } catch (Exception e) {
                String str4 = c;
                pex.a(str4, "Exception: " + (i.b.MEASURE_PARSEDATA + e.toString()));
            }
        }
    }

    @Override // com.taobao.taolive.message_sdk.cdn.a
    public void b(String str, String str2, String str3, String str4, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b47ee0ad", new Object[]{this, str, str2, str3, str4, obj});
            return;
        }
        try {
            if (this.k.get()) {
                this.k.set(false);
                if (this.g != null) {
                    this.g.removeMessages(1000);
                    this.g.sendEmptyMessageDelayed(1000, 1000L);
                }
            }
            String str5 = "onError:" + obj.toString() + " url " + str;
            per.a(per.MODULE_POINT_CDN_RECEIVE, per.ERROR_CODE_LISTENER_ERROR, str5);
            a(11001, obj, str5);
            if (!this.f32574a.c() || !this.f32574a.b.i) {
                return;
            }
            if (this.e == null) {
                this.e = new com.taobao.taolive.message_sdk.cdn.mtopget.a(this, this.f32574a.d);
            }
            this.e.a(str2, str3, str4);
        } catch (Exception e) {
            String str6 = c;
            pex.a(str6, "Exception: " + ("onError" + e.toString()));
        }
    }

    private void a(int i, Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da87cc1", new Object[]{this, new Integer(i), obj, str});
            return;
        }
        try {
            pex.a(c, str);
            if (this.b != null) {
                this.b.a(i, obj);
                return;
            }
            pex.a(c, "onError[OnErrorListener is null]:" + this.f32574a.f32564a);
        } catch (Exception e) {
            String str2 = c;
            pex.a(str2, "Exception: " + ("onErrorLog" + e.toString()));
        }
    }

    public void a(peh pehVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f97340e5", new Object[]{this, pehVar});
            return;
        }
        try {
            if (this.f != null) {
                return;
            }
            this.f = new HandlerThread("CDN Message Thread");
            this.f.start();
            this.g = new Handler(this.f.getLooper()) { // from class: tb.pep.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.os.Handler
                public void handleMessage(Message message) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("282a8c19", new Object[]{this, message});
                        return;
                    }
                    int i = message.what;
                    if (i == 1000) {
                        pep.a(pep.this);
                        pep.b(pep.this);
                    } else if (i != 1001) {
                    } else {
                        pep.b(pep.this);
                    }
                }
            };
            this.d = new b(this, this.f32574a.b.l);
            d();
        } catch (Exception e) {
            String str = c;
            pex.a(str, "Exception: " + ("subscribe: " + e.toString()));
        }
    }

    public void b(peh pehVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7f64766", new Object[]{this, pehVar});
            return;
        }
        synchronized (this.h) {
            try {
                f();
                if (this.d != null) {
                    this.d.a();
                    this.d = null;
                }
                if (this.e != null) {
                    this.e.a();
                    this.e = null;
                }
                this.b = null;
            } catch (Exception e) {
                String str = c;
                pex.a(str, "Exception: " + (dlv.API_UNSUBSCRIBE + e.toString()));
            }
        }
    }

    @Override // tb.peo
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.l.set(true);
        pex.a(c, "onAppInBackground, stopFetchCDNData");
        e();
    }

    @Override // tb.peo
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.l.set(false);
        pex.a(c, "onAppInBackground, startFetchCDNData");
        d();
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.g == null) {
        } else {
            String str = c;
            pex.a(str, "postFetchCDNData ,isLongPull: " + this.k.get());
            if (this.k.get()) {
                return;
            }
            this.g.removeMessages(1000);
            this.g.sendEmptyMessageDelayed(1000, this.j * 1000);
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        try {
            if (this.g == null) {
                return;
            }
            this.g.removeMessages(1000);
            this.k.set(false);
            long a2 = pmd.a().w().a() / 1000;
            long j = a2 - this.j;
            pex.a(c, "startFetchCDNData currentTime:" + a2 + " ,cdnFetchMSGLast: " + j + " ,cdnFetchMSGIntervalService: " + this.j + " ,mLastPullTime: " + this.i + " ,(mLastPullTime - cdnFetchMSGLast):" + (this.i - j));
            if (this.i > 0 && this.i > j) {
                this.g.sendEmptyMessageDelayed(1000, (this.i - j) * 1000);
            } else {
                this.g.sendEmptyMessage(1000);
            }
        } catch (Exception e) {
            String str = c;
            pex.a(str, "Exception: " + ("startFetchCDNData" + e.toString()));
        }
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        Handler handler = this.g;
        if (handler == null) {
            return;
        }
        handler.removeMessages(1000);
        this.g.removeMessages(1001);
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        try {
            if (this.g != null) {
                this.g.removeMessages(1000);
                this.g.removeMessages(1001);
                this.g.removeCallbacksAndMessages(null);
            }
            if (this.f == null) {
                return;
            }
            this.f.quit();
            this.f = null;
        } catch (Exception e) {
            String str = c;
            pex.a(str, "Exception: " + ("destroyFetchCDNData" + e.toString()));
        }
    }

    private void g() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        synchronized (this.h) {
            try {
                if (this.d != null) {
                    long a2 = pmd.a().w().a() / 1000;
                    long j = a2 - this.f32574a.b.e;
                    long j2 = 0;
                    if (this.i > 0) {
                        j2 = Math.max(j, this.i);
                    }
                    if (this.k.get()) {
                        this.d.a(this.f32574a.b.l + this.f32574a.b.t);
                        str = this.f32574a.b.g;
                    } else {
                        this.d.a(this.f32574a.b.l);
                        str = this.f32574a.b.f;
                    }
                    String str2 = str + this.f32574a.e + "/" + j2 + "/" + a2;
                    if (this.f32574a.b.h) {
                        str2 = str2 + "?deviceId=" + this.f32574a.c;
                    }
                    pex.b(c, "fetchCDNData ,isLongPull: " + this.k.get() + " ,URL: " + str2 + " ,lastPullTime: " + j2 + " ,currentTime: " + a2);
                    if (this.d != null) {
                        this.d.a(str2, this.f32574a.e, String.valueOf(j2), String.valueOf(a2));
                    }
                }
            } catch (Exception e) {
                String str3 = "onError[parse]:" + e.toString();
                pex.a(c, "fetchCDNData Exception:" + str3);
                per.a(per.MODULE_POINT_CDN_RECEIVE, per.ERROR_CODE_DATA_ERROR, str3);
            }
        }
    }

    @Override // com.taobao.taolive.sdk.adapter.network.d
    public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
            return;
        }
        try {
            if (!(netBaseOutDo instanceof CDNMessageGetResponse)) {
                return;
            }
            a(((CDNMessageGetResponse) netBaseOutDo).mo1437getData(), netBaseOutDo.getApi(), false);
        } catch (Exception unused) {
            String str = c;
            pex.a(str, "onError[MtopGet_parseData]:" + i + " " + netResponse + " " + obj);
        }
    }

    @Override // com.taobao.taolive.sdk.adapter.network.d
    public void onError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
            return;
        }
        String str = c;
        pex.a(str, "onError[MtopGet]:" + i + " " + netResponse + " " + obj);
    }

    @Override // com.taobao.taolive.sdk.adapter.network.d
    public void onSystemError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
            return;
        }
        String str = c;
        pex.a(str, "onError[MtopGet_onSystemError]:" + i + " " + netResponse + " " + obj);
    }
}
