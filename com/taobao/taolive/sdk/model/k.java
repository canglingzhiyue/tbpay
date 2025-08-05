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
import com.taobao.taolive.sdk.model.i;
import com.taobao.taolive.sdk.model.message.TLiveMsg;
import com.taobao.taolive.sdk.utils.n;
import com.taobao.taolive.sdk.utils.p;
import com.taobao.taolive.sdk.utils.u;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import tb.ddw;
import tb.kge;
import tb.pmd;
import tb.pnk;
import tb.pnn;
import tb.pnr;
import tb.pns;
import tb.pow;
import tb.pqi;
import tb.pqj;

/* loaded from: classes8.dex */
public class k extends d implements i.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG;
    public static final String UT_PAGE_NAME = "Page_TaobaoLiveWatch";
    private boolean A;
    private String B;
    private String C;
    private pnr D;
    private boolean E;
    private String F;
    private String x;
    private String y;
    private boolean z;

    public static /* synthetic */ Object ipc$super(k kVar, String str, Object... objArr) {
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

    @Override // com.taobao.taolive.sdk.model.i.a
    public void b(int i, i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f51fc8f", new Object[]{this, new Integer(i), iVar});
        }
    }

    @Override // com.taobao.taolive.sdk.model.i.a
    public void b(i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c353983e", new Object[]{this, iVar});
        }
    }

    public static /* synthetic */ String a(k kVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6ef48c85", new Object[]{kVar}) : kVar.B;
    }

    static {
        kge.a(2100043472);
        kge.a(667421175);
        TAG = k.class.getSimpleName();
    }

    public k(int i, String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, d.a aVar) {
        this(i, str, str2, str3, z, z2, z3, z4, z5, z6, z7, null, aVar);
    }

    public k(int i, String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, pns pnsVar, d.a aVar) {
        super(i, str, str2, z, z2, z3, z4, pnsVar, aVar);
        this.z = false;
        this.A = false;
        this.B = "TBLiveMSG";
        this.D = new pnr() { // from class: com.taobao.taolive.sdk.model.k.1
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
                    k.this.m.a(tLiveMsg, 101, true);
                    pqi.a().a("Page_TaobaoLiveWatch", "PM_onDispatch_GoodItem", pqi.a().a(tLiveMsg));
                }
                if (!k.this.t) {
                    k.this.c(tLiveMsg);
                    if (tLiveMsg.type != 10101 || !u.d()) {
                        return;
                    }
                    k.this.m.a(tLiveMsg, 102, true);
                } else if (tLiveMsg.type != 10101 || !u.d()) {
                } else {
                    k.this.m.a(tLiveMsg, 102, false);
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
                k.a(k.this);
                if (i2 != -3006) {
                    return;
                }
                if (k.this.c == null) {
                    k kVar = k.this;
                    kVar.c = new f(kVar);
                }
                k.this.c.obtainMessage(1003).sendToTarget();
            }
        };
        this.E = false;
        String a2 = p.a("cdnMsgEnable", "false");
        this.x = str;
        this.y = str3;
        this.z = z6;
        this.g = z7 && com.taobao.taolive.sdk.utils.l.d(a2);
        this.A = z5;
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
        } else if (TextUtils.isEmpty(tLiveMsg.topic) || !TextUtils.equals(tLiveMsg.topic, this.x)) {
            if (!TextUtils.equals(tLiveMsg.topic, this.x)) {
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
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.E) {
        } else {
            String str = TAG;
            n.a(str, "Message: subscribe start mTopic = " + this.x);
            pnk q = pmd.a().q();
            String b = q != null ? q.b() : "";
            this.m.a(this.f21848a, this.x, this.z ? 4 : 3);
            pns pnsVar = this.m;
            boolean z2 = this.A;
            if (!u.K()) {
                z = this.A;
            } else if (this.f || this.A) {
                z = true;
            }
            pnsVar.a(z2, z, new pnn() { // from class: com.taobao.taolive.sdk.model.k.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.pnn
                public Map<String, String> getHeartParams() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (Map) ipChange2.ipc$dispatch("ab918d32", new Object[]{this});
                    }
                    if (k.this.h == null) {
                        return null;
                    }
                    return k.this.h.getHeartParams();
                }
            });
            this.C = i.n();
            if (pmd.a().t() != null) {
                this.F = pmd.a().t().a("taolive", "EnableUseNewQueueMessageServiceAB", "bucketID", com.taobao.android.detail.ttdetail.constant.a.UN_KNOW);
            }
            g.a().a(new j(this.x, this.f21848a, this.y, b, this.f, b(this.h), this.C, this, this.m));
            a("subscribeMonitor", this.x);
            if (u.aP() && this.r) {
                pow.c().a(this.o, this.p, this.q, b(this.h));
            }
            this.E = true;
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
            jSONObject2.put("pmSession", (Object) this.C);
            jSONObject2.put("entryLiveSource", (Object) heartParams.get("entryLiveSource"));
            jSONObject2.put("product_type", (Object) heartParams.get("product_type"));
            if (v() && p.j()) {
                jSONObject2.put("officialLiveId", (Object) heartParams.get("officialLiveId"));
                jSONObject2.put("officialAccountId", (Object) heartParams.get("officialAccountId"));
            }
            if (p.s()) {
                jSONObject2.put("clientABTest", (Object) this.F);
            }
            TLog.logi(TAG, "liveClientParams:" + jSONObject2.toJSONString());
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
        } catch (Exception unused) {
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
        if (this.E) {
            String str = TAG;
            n.a(str, "Message: unSubscribe start mTopic = " + this.x);
            pnk q = pmd.a().q();
            g.a().b(new l(this.x, this.f21848a, this.y, q != null ? q.b() : "", this.f, b(this.h), this.C, this, this.m));
            a("unsubscribeMonitor", this.x);
            if (u.aP() && this.r) {
                pow.c().d();
            }
            this.E = false;
        }
        t();
    }

    @Override // com.taobao.taolive.sdk.model.d
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        super.d();
        if (!TextUtils.isEmpty(this.y)) {
            this.m.a(this.f21848a, this.y, this.D);
        } else {
            this.m.a(this.f21848a, (String) null, this.D);
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
        if (!TextUtils.isEmpty(this.y)) {
            if (!u.q()) {
                return;
            }
            this.m.a(this.f21848a, this.y, (pnr) null);
        } else if (!u.q()) {
        } else {
            this.m.a(this.f21848a, (String) null, (pnr) null);
        }
    }

    @Override // com.taobao.taolive.sdk.model.d, com.taobao.taolive.sdk.model.a
    public void handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            return;
        }
        if (message.what == 1003 && this.b != null) {
            this.b.onMessageReceived(1027, null);
        }
        super.handleMessage(message);
    }

    @Override // com.taobao.taolive.sdk.model.i.a
    public void a(i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afabc4bd", new Object[]{this, iVar});
            return;
        }
        if (this.b != null) {
            this.b.onMessageReceived(1005, 0);
        }
        if (this.j != LiveEmbedType.SHOP_CARD) {
            return;
        }
        ddw.a().a("com.taobao.taolive.room.shop.card.subScribe");
    }

    @Override // com.taobao.taolive.sdk.model.i.a
    public void a(int i, i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dff5ff0", new Object[]{this, new Integer(i), iVar});
        } else if (this.b == null) {
        } else {
            this.b.onMessageReceived(100000, 0);
        }
    }
}
