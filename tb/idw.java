package tb;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.ability.localization.b;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.q;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.security.zim.msgchannel.ZimMessageChannel;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliNavInterface;
import com.taobao.android.fluid.framework.hostcontainer.pageinterface.page.FullPage;
import com.taobao.android.order.bundle.constants.CoreConstants;
import com.taobao.android.purchase.aura.a;
import com.taobao.android.purchase.aura.c;
import com.taobao.android.purchase.aura.utils.d;
import com.taobao.android.purchase.aura.utils.e;
import com.taobao.android.purchase.core.Alipay;
import com.taobao.android.t;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.login4android.api.Login;
import com.taobao.tao.alipay.export.CashdeskConstants;
import com.taobao.tao.util.NavUrls;
import com.taobao.tao.util.TaoHelper;
import com.taobao.taobao.R;
import com.taobao.taobao.internal.PayRequest;
import com.taobao.taobao.internal.PayResultInfo;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;
import tb.iff;

/* loaded from: classes6.dex */
public class idw implements dug {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int RESULT_CODE_CUSTOM_PAYMENT = 4322;
    public static final int RESULT_CODE_STANDARD_PAYMENT = 4321;
    public static final String d;
    public static final String e;
    public static final String f;
    public static final String g;
    public static final String h;
    public static final String i;
    public static final String j;
    public static final String k;

    /* renamed from: a  reason: collision with root package name */
    private final Context f28951a;
    private final c b;
    private final a c;
    private AURAGlobalData l;

    public static /* synthetic */ Context a(idw idwVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("b12b5994", new Object[]{idwVar}) : idwVar.f28951a;
    }

    public static /* synthetic */ void b(idw idwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbfd151d", new Object[]{idwVar});
        } else {
            idwVar.a();
        }
    }

    static {
        kge.a(929576527);
        kge.a(-28360605);
        d = b.a(R.string.purchase_taobao_app_1029_1_19068);
        e = b.a(R.string.purchase_taobao_app_1029_1_19072);
        f = b.a(R.string.app_view);
        g = b.a(R.string.purchase_action_back);
        h = b.a(R.string.app_purchase_fail);
        i = b.a(R.string.purchase_taobao_app_1029_1_19071);
        j = b.a(R.string.purchase_taobao_app_1029_1_19076);
        k = b.a(R.string.purchase_taobao_app_1029_1_19074);
    }

    public idw(Context context, c cVar, a aVar) {
        this.f28951a = context;
        this.b = cVar;
        this.c = aVar;
    }

    @Override // tb.dug
    public void a(q qVar, AURAGlobalData aURAGlobalData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2543f075", new Object[]{this, qVar, aURAGlobalData});
        } else {
            this.l = aURAGlobalData;
        }
    }

    @Override // tb.dug
    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if (jSONObject == null || jSONObject.isEmpty()) {
        } else {
            if (jSONObject.getBoolean("partSuccess").booleanValue()) {
                final iff a2 = a(d, e, null, f, g);
                a2.a(new iff.b() { // from class: tb.idw.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.iff.b
                    public void a(iff iffVar) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("ed8e834f", new Object[]{this, iffVar});
                            return;
                        }
                        a2.b();
                        com.taobao.android.purchase.core.utils.a.a(idw.a(idw.this));
                    }
                });
                a2.a(new iff.a() { // from class: tb.idw.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.iff.a
                    public void a(iff iffVar) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("ed8e834f", new Object[]{this, iffVar});
                            return;
                        }
                        a2.b();
                        idw.b(idw.this);
                    }
                });
                a2.a();
                return;
            }
            String string = jSONObject.getString("overrideUrl");
            if (!TextUtils.isEmpty(string)) {
                a(string, jSONObject);
                return;
            }
            String b = b();
            String string2 = jSONObject.getString(CashdeskConstants.CASHIER_TYPE);
            Map<String, String> a3 = a(jSONObject, b);
            if (PayRequest.CALL_WEIXIN_SDK.equals(string2)) {
                a(string2, a3);
            } else {
                a(a3);
            }
        }
    }

    private void a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
            return;
        }
        com.taobao.taobao.b bVar = new com.taobao.taobao.b();
        PayRequest payRequest = new PayRequest();
        payRequest.setExtAttrMap(map);
        payRequest.setActionParams(map.get("signStr"));
        payRequest.setOrderIds(map.get("orderids"));
        payRequest.setSuccessUrl(map.get("backURL"));
        payRequest.setUnSuccessUrl(map.get("unSuccessUrl"));
        payRequest.setFrom(map.get("from"));
        payRequest.setNextAction(str);
        bVar.a((Activity) this.f28951a, payRequest, new com.taobao.taobao.internal.b() { // from class: tb.idw.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taobao.internal.b
            public void a(String str2, PayResultInfo payResultInfo) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("aa92b52", new Object[]{this, str2, payResultInfo});
                } else {
                    fke.a(idw.a(idw.this));
                }
            }

            @Override // com.taobao.taobao.internal.b
            public void b(String str2, PayResultInfo payResultInfo) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5868a353", new Object[]{this, str2, payResultInfo});
                } else {
                    fke.a(idw.a(idw.this));
                }
            }

            @Override // com.taobao.taobao.internal.b
            public void c(String str2, PayResultInfo payResultInfo) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a6281b54", new Object[]{this, str2, payResultInfo});
                } else {
                    fke.a(idw.a(idw.this));
                }
            }
        });
    }

    private String b() {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
        }
        AURAGlobalData aURAGlobalData = this.l;
        if (aURAGlobalData != null && (jSONObject = (JSONObject) aURAGlobalData.get("aura_data_protocol_json", JSONObject.class)) != null && (jSONObject2 = jSONObject.getJSONObject("global")) != null && (jSONObject3 = jSONObject2.getJSONObject("paymentData")) != null) {
            return jSONObject3.getString("selOptions");
        }
        return null;
    }

    @Override // tb.dug
    public void a(com.alibaba.android.aura.b bVar, boolean z) {
        Map<String, Object> c;
        MtopResponse g2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("607bd154", new Object[]{this, bVar, new Boolean(z)});
        } else if (bVar == null || z || !"AURANextRPCServiceDomain".equals(bVar.f()) || (c = bVar.c()) == null) {
        } else {
            Object obj = c.get("NextRPCRemoteResponse");
            if (!(obj instanceof com.alibaba.android.aura.datamodel.nextrpc.a) || (g2 = ((com.alibaba.android.aura.datamodel.nextrpc.a) obj).g()) == null) {
                return;
            }
            String retCode = g2.getRetCode();
            JSONObject a2 = a(g2);
            JSONObject a3 = a(bVar);
            String string = a3.getString("errorMsg");
            String string2 = a3.getString(ZimMessageChannel.K_RPC_RES_CODE);
            if ("BUYER_ALIPAY_NOT_FOUND".equals(retCode)) {
                if (a2 != null) {
                    Alipay.a(this.f28951a, a2);
                }
                a();
            } else if (b(retCode, a2)) {
                if (a2 != null) {
                    a(this.f28951a, bVar, a2);
                }
            } else if (e.d() && (this.f28951a instanceof Activity)) {
                kqu kquVar = new kqu();
                kquVar.a(g2.getApi()).c(d.a(g2)).b(h).d(string2).e(string);
                this.c.dataUpdate(kquVar.a());
            } else {
                final iff a4 = a(h, string, string2, null, null);
                a4.a(new iff.b() { // from class: tb.idw.4
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.iff.b
                    public void a(iff iffVar) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("ed8e834f", new Object[]{this, iffVar});
                            return;
                        }
                        a4.b();
                        idw.b(idw.this);
                    }
                });
                a4.a();
            }
            com.taobao.android.purchase.core.utils.c.a(string2, string);
        }
    }

    private void a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6635bcfe", new Object[]{this, str, jSONObject});
            return;
        }
        Bundle bundle = new Bundle();
        for (String str2 : jSONObject.keySet()) {
            if (!TextUtils.isEmpty(str2)) {
                String string = jSONObject.getString(str2);
                if (!TextUtils.isEmpty(string)) {
                    bundle.putString(str2, string);
                }
            }
        }
        String a2 = a(str);
        AliNavInterface a3 = t.a().a(this.f28951a).a(bundle);
        if (!TextUtils.isEmpty(a2) && a2.contains("needbackpop=1")) {
            a3.b(RESULT_CODE_CUSTOM_PAYMENT);
        }
        a3.a(str);
        if (TextUtils.isEmpty(a2) || !a2.contains("needpop=1")) {
            return;
        }
        a();
    }

    private String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        try {
            return new URI(str).getQuery();
        } catch (Exception e2) {
            UnifyLog.d("TBBuySubmitCallback", e2.toString());
            return null;
        }
    }

    private Map<String, String> a(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("91342e07", new Object[]{this, jSONObject, str});
        }
        HashMap hashMap = new HashMap();
        String str2 = "";
        String string = jSONObject.getString("nextUrl") == null ? str2 : jSONObject.getString("nextUrl");
        if (Login.getSid() != null) {
            str2 = Login.getSid();
        }
        hashMap.put("alipayURL", String.format(com.taobao.android.purchase.core.a.BUY_URL_FORMAT, string, str2, TaoHelper.getTTID()));
        hashMap.put("from", com.taobao.android.purchase.core.a.UT_PAGE_NAME);
        hashMap.put("result", "1");
        hashMap.put("agednessVersion", com.taobao.android.tbelder.b.c() ? "true" : "false");
        if (!TextUtils.isEmpty(jSONObject.getString(CoreConstants.IN_PARAM_BIZ_ORDER_ID))) {
            hashMap.put("orderids", jSONObject.getString(CoreConstants.IN_PARAM_BIZ_ORDER_ID));
        }
        if (!TextUtils.isEmpty(jSONObject.getString("signStr"))) {
            hashMap.put("signStr", jSONObject.getString("signStr"));
        }
        if (!TextUtils.isEmpty(jSONObject.getString("simplePay"))) {
            hashMap.put("simplepay", jSONObject.getString("simplePay"));
        }
        if (!TextUtils.isEmpty(jSONObject.getString(FullPage.PARAM_BACK2Tab2URL))) {
            hashMap.put("backURL", jSONObject.getString(FullPage.PARAM_BACK2Tab2URL));
        }
        if (!TextUtils.isEmpty(jSONObject.getString("unSuccessUrl"))) {
            hashMap.put("unSuccessUrl", jSONObject.getString("unSuccessUrl"));
        }
        b(hashMap);
        a(hashMap, str);
        return hashMap;
    }

    private void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            return;
        }
        Uri.Builder buildUpon = Uri.parse(NavUrls.NAV_URL_ALIPAY).buildUpon();
        for (String str : map.keySet()) {
            buildUpon.appendQueryParameter(str, map.get(str));
        }
        t.a().a(this.f28951a).b(4321).a(buildUpon.build());
    }

    private void a(Map<String, String> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7b3cea7", new Object[]{this, map, str});
            return;
        }
        AURAGlobalData aURAGlobalData = this.l;
        if (aURAGlobalData == null) {
            return;
        }
        JSONObject jSONObject = (JSONObject) aURAGlobalData.get("linkagePerformance", JSONObject.class);
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (!TextUtils.isEmpty(str)) {
            jSONObject.put("paymentType", (Object) str);
        }
        if (jSONObject.isEmpty()) {
            return;
        }
        map.put("option", jSONObject.toString());
    }

    private void b(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41e3e87c", new Object[]{this, map});
            return;
        }
        Map<String, String> a2 = this.b.a();
        if (a2 == null) {
            return;
        }
        map.putAll(a2);
    }

    private iff a(String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (iff) ipChange.ipc$dispatch("4d104923", new Object[]{this, str, str2, str3, str4, str5});
        }
        iff iffVar = new iff(this.f28951a);
        if (!TextUtils.isEmpty(str)) {
            iffVar.a(str);
        }
        if (!TextUtils.isEmpty(str2)) {
            iffVar.b(str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            iffVar.e(str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            iffVar.g(str4);
        }
        if (!TextUtils.isEmpty(str5)) {
            iffVar.f(str5);
        }
        return iffVar;
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            fke.a(this.f28951a);
        }
    }

    private JSONObject a(com.alibaba.android.aura.b bVar) {
        MtopResponse g2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("7ffbca0", new Object[]{this, bVar});
        }
        JSONObject jSONObject = new JSONObject();
        Map<String, Object> c = bVar.c();
        if (c == null) {
            return jSONObject;
        }
        Object obj = c.get("NextRPCRemoteResponse");
        if ((obj instanceof com.alibaba.android.aura.datamodel.nextrpc.a) && (g2 = ((com.alibaba.android.aura.datamodel.nextrpc.a) obj).g()) != null) {
            String retMsg = g2.getRetMsg();
            if (g2.isNetworkError()) {
                retMsg = i;
            } else if (g2.isApiLockedResult()) {
                retMsg = j;
            }
            String valueOf = TextUtils.isEmpty(g2.getMappingCode()) ? String.valueOf(g2.getResponseCode()) : g2.getMappingCode();
            jSONObject.put("errorMsg", (Object) retMsg);
            jSONObject.put(ZimMessageChannel.K_RPC_RES_CODE, (Object) valueOf);
        }
        return jSONObject;
    }

    private JSONObject a(MtopResponse mtopResponse) {
        byte[] bytedata;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("afae854d", new Object[]{this, mtopResponse});
        }
        if (mtopResponse == null || (bytedata = mtopResponse.getBytedata()) == null) {
            return null;
        }
        try {
            return JSONObject.parseObject(new String(bytedata, "utf-8"));
        } catch (Exception unused) {
            return null;
        }
    }

    private boolean b(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("676c0fe1", new Object[]{this, str, jSONObject})).booleanValue() : "F-10008-11-16-006".equals(str) && jSONObject != null && (jSONObject2 = jSONObject.getJSONObject("data")) != null && !TextUtils.isEmpty(jSONObject2.getString("errorTipUrl"));
    }

    private void a(final Context context, com.alibaba.android.aura.b bVar, final JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("568de478", new Object[]{this, context, bVar, jSONObject});
            return;
        }
        JSONObject a2 = a(bVar);
        final iff a3 = a(h, a2.getString("errorMsg"), a2.getString(ZimMessageChannel.K_RPC_RES_CODE), k, null);
        a3.a(new iff.b() { // from class: tb.idw.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.iff.b
            public void a(iff iffVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ed8e834f", new Object[]{this, iffVar});
                    return;
                }
                a3.b();
                idw.b(idw.this);
                t.a().a(context).a(jSONObject.getJSONObject("data").getString("errorTipUrl"));
            }
        });
        a3.a();
    }
}
