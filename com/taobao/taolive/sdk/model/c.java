package com.taobao.taolive.sdk.model;

import android.net.Uri;
import android.os.Message;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.taobao.taolive.room.utils.aw;
import com.taobao.taolive.sdk.model.d;
import com.taobao.taolive.sdk.model.message.TLiveMsg;
import com.taobao.taolive.sdk.utils.p;
import com.taobao.taolive.sdk.utils.u;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import tb.ddw;
import tb.kge;
import tb.pmd;
import tb.pnk;
import tb.pnn;
import tb.pnq;
import tb.pnr;
import tb.pns;
import tb.poj;
import tb.pow;
import tb.pqi;
import tb.pqj;

/* loaded from: classes8.dex */
public class c extends d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static HashMap<String, String> G = null;
    public static final String UT_PAGE_NAME = "Page_TaobaoLiveWatch";
    private static final String x;
    private int A;
    private int B;
    private boolean C;
    private boolean D;
    private boolean E;
    private String F;
    private pnr H;
    private boolean I;
    private String J;
    private String K;
    private String y;
    private String z;

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case 90991720:
                super.a();
                return null;
            case 92838762:
                super.c();
                return null;
            case 93762283:
                super.d();
                return null;
            case 96532846:
                super.g();
                return null;
            case 467600993:
                super.a((TLiveMsg) objArr[0]);
                return null;
            case 673877017:
                super.handleMessage((Message) objArr[0]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static /* synthetic */ String a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a2ce07d", new Object[]{cVar}) : cVar.F;
    }

    static {
        kge.a(2023800943);
        kge.a(-735385134);
        kge.a(-1192303951);
        x = c.class.getSimpleName();
        G = new HashMap<>();
    }

    private String w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3f74eee2", new Object[]{this});
        }
        if (!TextUtils.isEmpty(this.z)) {
            return this.y + "_" + this.z;
        }
        return this.y;
    }

    public c(int i, String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, d.a aVar) {
        this(i, str, str2, str3, z, z2, z3, z4, z5, z6, z7, null, aVar);
    }

    public c(int i, String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, pns pnsVar, d.a aVar) {
        super(i, str, str2, z, z2, z3, z4, pnsVar, aVar);
        this.A = 0;
        this.B = 0;
        this.C = false;
        this.D = false;
        this.E = false;
        this.F = "TBLiveMSG";
        this.H = new pnr() { // from class: com.taobao.taolive.sdk.model.c.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.pnr
            public void a(TLiveMsg tLiveMsg) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("1bdf0661", new Object[]{this, tLiveMsg});
                    return;
                }
                if (pmd.a().n() != null) {
                    pmd.a().n().a("taolive", "PMDispatcher", String.valueOf(tLiveMsg.type));
                }
                if (tLiveMsg == null) {
                    return;
                }
                if (tLiveMsg.type == 10101 && u.d()) {
                    c.this.m.a(tLiveMsg, 101, true);
                    pqi.a().a("Page_TaobaoLiveWatch", "PM_onDispatch_GoodItem", pqi.a().a(tLiveMsg));
                }
                if (!c.this.t) {
                    c.this.c(tLiveMsg);
                    if (tLiveMsg.type != 10101 || !u.d()) {
                        return;
                    }
                    c.this.m.a(tLiveMsg, 102, true);
                } else if (tLiveMsg.type != 10101 || !u.d()) {
                } else {
                    c.this.m.a(tLiveMsg, 102, false);
                    Map<String, String> a2 = pqi.a().a(tLiveMsg);
                    a2.put("status", "0");
                    a2.put("errorCode", "HoldMsg:" + new String(tLiveMsg.data));
                    pqi a3 = pqi.a();
                    a3.d("PM_STEP_HOLD_RETURN:" + JSON.toJSONString(a2));
                    pqi.a().a("liveroomItemMsg", JSON.toJSONString(a2), "PM_STEP_HOLD_RETURN", "PM_STEP_HOLD_RETURN");
                }
            }

            @Override // tb.pnr
            public void a(int i2, Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("d36ff2b7", new Object[]{this, new Integer(i2), obj});
                    return;
                }
                if (pmd.a().n() != null) {
                    pmd.a().n().a("taolive", "PMDispatcher", String.valueOf(i2), String.valueOf(i2));
                }
                c.a(c.this);
                if (i2 != -3006) {
                    return;
                }
                if (c.this.c == null) {
                    c cVar = c.this;
                    cVar.c = new f(cVar);
                }
                c.this.c.obtainMessage(1003).sendToTarget();
            }
        };
        this.I = false;
        String a2 = p.a("cdnMsgEnable", "false");
        this.y = str;
        this.z = str3;
        this.D = z6;
        this.g = z7 && com.taobao.taolive.sdk.utils.l.d(a2);
        this.E = z5;
        String c = u.c();
        if (!TextUtils.isEmpty(c)) {
            if (this.s == null) {
                this.s = new ArrayList();
            }
            for (String str4 : c.split(",")) {
                this.s.add(str4);
            }
        }
    }

    @Override // com.taobao.taolive.sdk.model.d
    public void a(TLiveMsg tLiveMsg) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bdf0661", new Object[]{this, tLiveMsg});
        } else if (TextUtils.isEmpty(tLiveMsg.topic) || !TextUtils.equals(tLiveMsg.topic, this.y) || this.C) {
            if (!TextUtils.equals(tLiveMsg.topic, this.y)) {
                this.m.a(this.f21848a, tLiveMsg, 502);
                g(tLiveMsg);
            }
            if (tLiveMsg.type != 10101 || !u.d()) {
                return;
            }
            this.m.a(tLiveMsg, 103, false);
            Map<String, String> a2 = pqi.a().a(tLiveMsg);
            a2.put("status", "0");
            a2.put("errorCode", "errorTopic:" + new String(tLiveMsg.data));
            pqi a3 = pqi.a();
            a3.d("PM_STEP_CHECK_TOPIC:" + JSON.toJSONString(a2));
            pqi.a().a("liveroomItemMsg", JSON.toJSONString(a2), "PM_STEP_CHECK_TOPIC", "PM_STEP_CHECK_TOPIC");
        } else {
            if (tLiveMsg.type == 10101 && u.d()) {
                this.m.a(tLiveMsg, 103, true);
            }
            if (tLiveMsg.type == 10181) {
                tLiveMsg.type = 10101;
            }
            super.a(tLiveMsg);
        }
    }

    @Override // com.taobao.taolive.sdk.model.d
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        super.a();
        if (u.av() || this.j != LiveEmbedType.SHOP_CARD || this.k) {
            b();
        }
        s();
    }

    @Override // com.taobao.taolive.sdk.model.d
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.I) {
        } else {
            this.J = UUID.randomUUID().toString();
            if (pmd.a().t() != null) {
                this.K = pmd.a().t().a("taolive", "EnableUseNewQueueMessageServiceAB", "bucketID", com.taobao.android.detail.ttdetail.constant.a.UN_KNOW);
            }
            pnk q = pmd.a().q();
            String b = q != null ? q.b() : "";
            this.m.a(this.f21848a, this.y, this.D ? 4 : 3);
            pnq pnqVar = new pnq() { // from class: com.taobao.taolive.sdk.model.c.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.pnq
                public void a(int i, Map<String, Object> map, Object... objArr) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8bad9c67", new Object[]{this, new Integer(i), map, objArr});
                        return;
                    }
                    c.a(c.this);
                    if (c.this.c == null) {
                        c cVar = c.this;
                        cVar.c = new f(cVar);
                    }
                    Message obtainMessage = c.this.c.obtainMessage(1001);
                    obtainMessage.arg1 = i;
                    obtainMessage.sendToTarget();
                }
            };
            this.m.a(this.E, u.K() ? this.f || this.E : this.E, new pnn() { // from class: com.taobao.taolive.sdk.model.c.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.pnn
                public Map<String, String> getHeartParams() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (Map) ipChange2.ipc$dispatch("ab918d32", new Object[]{this});
                    }
                    if (c.this.h == null) {
                        return null;
                    }
                    return c.this.h.getHeartParams();
                }
            });
            this.m.a(this.f21848a, this.y, this.z, b, this.f ? "33" : "tb", u.z() ? b(this.h) : null, pnqVar, new Object[0]);
            if (this.A == 0) {
                pqi.a().a("Page_TaobaoLiveWatch", "PM_startSubscribe", pqi.a().b());
            }
            a("subscribeMonitor", this.y);
            G.put(w(), toString());
            if (u.aP() && this.r) {
                pow.c().a(this.o, this.p, this.q, b(this.h));
            }
            this.I = true;
        }
    }

    private String b(pnn pnnVar) {
        String[] split;
        JSONObject parseObject;
        String str = "trackInfo";
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5a23f697", new Object[]{this, pnnVar});
        }
        if (pnnVar == null) {
            return null;
        }
        try {
            Map<String, String> heartParams = this.h.getHeartParams();
            if (heartParams == null) {
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("liveServerParams", (Object) pqj.b(heartParams.get("liveServerParams")));
            String str2 = heartParams.get("pmContext");
            if (str2 != null && (parseObject = JSONObject.parseObject(str2)) != null) {
                Iterator<Map.Entry<String, Object>> it = parseObject.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry<String, Object> next = it.next();
                    Iterator<Map.Entry<String, Object>> it2 = it;
                    String key = next.getKey();
                    Object value = next.getValue();
                    String str3 = str;
                    if (value instanceof String) {
                        jSONObject.put(key, (Object) ((String) value));
                    }
                    it = it2;
                    str = str3;
                }
            }
            String str4 = str;
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("spm-url", (Object) heartParams.get("spm-url"));
            jSONObject2.put("clickid", (Object) heartParams.get("clickid"));
            jSONObject2.put("livesource", (Object) heartParams.get("livesource"));
            jSONObject2.put("isAD", (Object) heartParams.get("isAD"));
            jSONObject2.put("supplement_flow_tag", (Object) heartParams.get("supplement_flow_tag"));
            if (p.a()) {
                jSONObject2.put("kandianid", (Object) heartParams.get("kandianid"));
                jSONObject2.put("watchid", (Object) heartParams.get("watchid"));
                jSONObject2.put(aw.PARAM_PVID, (Object) heartParams.get(aw.PARAM_PVID));
            }
            jSONObject2.put("liveAdParams", (Object) heartParams.get("liveAdParams"));
            jSONObject2.put("entry_source", (Object) heartParams.get("entry_source"));
            jSONObject2.put(aw.PARAM_PM_PARAMS, (Object) heartParams.get(aw.PARAM_PM_PARAMS));
            jSONObject2.put("liveToken", (Object) heartParams.get("liveToken"));
            jSONObject2.put("pmSession", (Object) this.J);
            jSONObject2.put("entryLiveSource", (Object) heartParams.get("entryLiveSource"));
            jSONObject2.put("product_type", (Object) heartParams.get("product_type"));
            if (v() && p.j()) {
                jSONObject2.put("officialLiveId", (Object) heartParams.get("officialLiveId"));
                jSONObject2.put("officialAccountId", (Object) heartParams.get("officialAccountId"));
            }
            if (p.s()) {
                jSONObject2.put("clientABTest", (Object) this.K);
            }
            TLog.logi(x, "liveClientParams:" + jSONObject2.toJSONString());
            jSONObject.put("liveClientParams", (Object) jSONObject2);
            jSONObject.put(aw.PARAM_IGNORE_PV, (Object) heartParams.get(aw.PARAM_IGNORE_PV));
            jSONObject.put("needEventWhenIgnorePv", (Object) "true");
            if (heartParams.containsKey(str4) && heartParams.get(str4) != null) {
                String decode = Uri.decode(heartParams.get(str4));
                if (!TextUtils.isEmpty(decode) && (split = decode.split("&")) != null) {
                    int length = split.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            break;
                        }
                        String str5 = split[i];
                        if (str5 != null && str5.startsWith("liveAlgoParams:")) {
                            String replace = str5.replace("liveAlgoParams:", "");
                            if (!TextUtils.isEmpty(replace)) {
                                JSONObject jSONObject3 = new JSONObject();
                                String[] split2 = replace.split("#");
                                for (String str6 : split2) {
                                    String[] split3 = str6.split(Constants.WAVE_SEPARATOR);
                                    if (split3 != null && split3.length >= 2) {
                                        jSONObject3.put(split3[0], (Object) split3[1]);
                                    }
                                }
                                jSONObject.put("liveAlgoParams", (Object) jSONObject3);
                            }
                        }
                        i++;
                    }
                }
            }
            return jSONObject.toJSONString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.taobao.taolive.sdk.model.d
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        super.c();
        if (this.I) {
            if (!toString().equals(G.get(w()))) {
                return;
            }
            G.remove(w());
            pnk q = pmd.a().q();
            this.m.b(this.f21848a, this.y, this.z, q != null ? q.b() : "", this.f ? "33" : "tb", u.z() ? b(this.h) : null, new pnq() { // from class: com.taobao.taolive.sdk.model.c.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.pnq
                public void a(int i, Map<String, Object> map, Object... objArr) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8bad9c67", new Object[]{this, new Integer(i), map, objArr});
                        return;
                    }
                    if (c.this.c == null) {
                        c cVar = c.this;
                        cVar.c = new f(cVar);
                    }
                    Message obtainMessage = c.this.c.obtainMessage(1002);
                    obtainMessage.arg1 = i;
                    obtainMessage.sendToTarget();
                }
            }, new Object[0]);
            a("unsubscribeMonitor", this.y);
            if (this.A == 0) {
                pqi.a().a("Page_TaobaoLiveWatch", "PM_startUnSubscribe", pqi.a().b());
            }
            if (u.aP() && this.r) {
                pow.c().d();
            }
            this.I = false;
        }
        t();
    }

    private void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
        } else if (i == 1000) {
            h();
            pmd.a().n().a("taolive", "PM_subscribe");
        } else {
            a(i);
            poj n = pmd.a().n();
            n.a("taolive", "PM_subscribe", "PM_subscribe_error", "result:" + i);
        }
    }

    private void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad401d78", new Object[]{this, new Integer(i)});
        } else if (i == 1000) {
            i();
        } else {
            b(i);
        }
    }

    @Override // com.taobao.taolive.sdk.model.d
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        super.d();
        if (!TextUtils.isEmpty(this.z)) {
            this.m.a(this.f21848a, this.z, this.H);
        } else {
            this.m.a(this.f21848a, (String) null, this.H);
        }
    }

    @Override // com.taobao.taolive.sdk.model.d
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else {
            this.m.c();
        }
    }

    @Override // com.taobao.taolive.sdk.model.d
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else {
            this.m.d();
        }
    }

    @Override // com.taobao.taolive.sdk.model.d
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        super.g();
        if (!TextUtils.isEmpty(this.z)) {
            if (!u.q()) {
                return;
            }
            this.m.a(this.f21848a, this.z, (pnr) null);
        } else if (!u.q()) {
        } else {
            this.m.a(this.f21848a, (String) null, (pnr) null);
        }
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        if (this.b != null) {
            this.b.onMessageReceived(1005, 0);
        }
        Map<String, String> b = pqi.a().b();
        b.put("status", "1");
        if (u.av() && this.j == LiveEmbedType.SHOP_CARD) {
            ddw.a().a("com.taobao.taolive.room.shop.card.subScribe");
        }
        if (this.A == 0) {
            pqi.a().a("Page_TaobaoLiveWatch", "PM_endSubscribe", b);
        } else {
            pqi.a().a("Page_TaobaoLiveWatch", "PM_endSubscribeRetry", b);
        }
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        Map<String, String> b = pqi.a().b();
        b.put("status", "0");
        b.put("errorCode", String.valueOf(i));
        if (this.A == 0) {
            pqi.a().a("Page_TaobaoLiveWatch", "PM_endSubscribe", b);
            pqi a2 = pqi.a();
            a2.d("PM_endSubscribe:" + i);
        } else {
            pqi.a().a("Page_TaobaoLiveWatch", "PM_endSubscribeRetry", b);
            pqi a3 = pqi.a();
            a3.d("PM_endSubscribeRetry:" + i);
        }
        int i2 = this.A;
        if (i2 < 3) {
            this.A = i2 + 1;
            a();
            return;
        }
        if (this.b != null) {
            this.b.onMessageReceived(100000, 0);
        }
        this.A = 0;
    }

    @Override // com.taobao.taolive.sdk.model.d, com.taobao.taolive.sdk.model.a
    public void handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            return;
        }
        switch (message.what) {
            case 1001:
                c(message.arg1);
                break;
            case 1002:
                d(message.arg1);
                break;
            case 1003:
                if (this.b != null) {
                    this.b.onMessageReceived(1027, null);
                    break;
                }
                break;
        }
        super.handleMessage(message);
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        Map<String, String> b = pqi.a().b();
        b.put("status", "1");
        if (this.B == 0) {
            pqi.a().a("Page_TaobaoLiveWatch", "PM_endUnSubscribe", b);
        } else {
            pqi.a().a("Page_TaobaoLiveWatch", "PM_endUnSubscribeRetry", b);
        }
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        Map<String, String> b = pqi.a().b();
        b.put("status", "0");
        b.put("errorCode", String.valueOf(i));
        if (this.A == 0) {
            pqi.a().a("Page_TaobaoLiveWatch", "PM_endUnSubscribe", b);
            pqi a2 = pqi.a();
            a2.d("PM_endUnSubscribe:" + i);
        } else {
            pqi.a().a("Page_TaobaoLiveWatch", "PM_endUnSubscribeRetry", b);
            pqi a3 = pqi.a();
            a3.d("PM_endUnSubscribeRetry:" + i);
        }
        int i2 = this.B;
        if (i2 < 3) {
            this.B = i2 + 1;
            c();
            return;
        }
        this.B = 0;
    }
}
