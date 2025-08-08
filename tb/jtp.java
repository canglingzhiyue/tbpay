package tb;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.q;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.security.zim.msgchannel.ZimMessageChannel;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliNavInterface;
import com.taobao.android.fluid.framework.hostcontainer.pageinterface.page.FullPage;
import com.taobao.android.purchase.aura.c;
import com.taobao.android.purchase.aura.utils.d;
import com.taobao.android.purchase.core.utils.a;
import com.taobao.android.t;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.login4android.api.Login;
import com.taobao.tao.alipay.export.CashdeskConstants;
import com.taobao.tao.util.NavUrls;
import com.taobao.tao.util.TaoHelper;
import com.taobao.taobao.b;
import com.taobao.taobao.internal.PayRequest;
import com.taobao.taobao.internal.PayResultInfo;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;
import tb.iff;

/* loaded from: classes6.dex */
public class jtp implements dug {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Context f29759a;
    private final c b;
    private final com.taobao.android.waitpay.c c;

    static {
        kge.a(-686704402);
        kge.a(-28360605);
    }

    @Override // tb.dug
    public void a(q qVar, AURAGlobalData aURAGlobalData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2543f075", new Object[]{this, qVar, aURAGlobalData});
        }
    }

    public static /* synthetic */ Context a(jtp jtpVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("b11f19aa", new Object[]{jtpVar}) : jtpVar.f29759a;
    }

    public static /* synthetic */ void b(jtp jtpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de903733", new Object[]{jtpVar});
        } else {
            jtpVar.a();
        }
    }

    public jtp(Context context, c cVar, com.taobao.android.waitpay.c cVar2) {
        this.f29759a = context;
        this.b = cVar;
        this.c = cVar2;
    }

    @Override // tb.dug
    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if (jSONObject == null || jSONObject.isEmpty()) {
        } else {
            if (jSONObject.getBoolean("partSuccess").booleanValue()) {
                final iff a2 = a(qrh.f33047a, qrh.b, null, qrh.c, qrh.d);
                a2.a(new iff.b() { // from class: tb.jtp.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.iff.b
                    public void a(iff iffVar) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("ed8e834f", new Object[]{this, iffVar});
                            return;
                        }
                        a2.b();
                        a.a(jtp.a(jtp.this));
                    }
                });
                a2.a(new iff.a() { // from class: tb.jtp.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.iff.a
                    public void a(iff iffVar) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("ed8e834f", new Object[]{this, iffVar});
                            return;
                        }
                        a2.b();
                        jtp.b(jtp.this);
                    }
                });
                a2.a();
                return;
            }
            String string = jSONObject.getString("overrideUrl");
            if (!StringUtils.isEmpty(string)) {
                a(string, jSONObject);
                return;
            }
            String string2 = jSONObject.getString(CashdeskConstants.CASHIER_TYPE);
            Map<String, String> b = b(jSONObject);
            if (PayRequest.CALL_WEIXIN_SDK.equals(string2)) {
                a(string2, b);
            } else {
                a(b);
            }
        }
    }

    private void a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
            return;
        }
        b bVar = new b();
        PayRequest payRequest = new PayRequest();
        payRequest.setExtAttrMap(map);
        payRequest.setActionParams(map.get("signStr"));
        payRequest.setOrderIds(map.get("orderids"));
        payRequest.setSuccessUrl(map.get("backURL"));
        payRequest.setUnSuccessUrl(map.get("unSuccessUrl"));
        payRequest.setFrom(map.get("from"));
        payRequest.setNextAction(str);
        bVar.a((Activity) this.f29759a, payRequest, new com.taobao.taobao.internal.b() { // from class: tb.jtp.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taobao.internal.b
            public void a(String str2, PayResultInfo payResultInfo) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("aa92b52", new Object[]{this, str2, payResultInfo});
                } else {
                    fke.a(jtp.a(jtp.this));
                }
            }

            @Override // com.taobao.taobao.internal.b
            public void b(String str2, PayResultInfo payResultInfo) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5868a353", new Object[]{this, str2, payResultInfo});
                } else {
                    fke.a(jtp.a(jtp.this));
                }
            }

            @Override // com.taobao.taobao.internal.b
            public void c(String str2, PayResultInfo payResultInfo) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a6281b54", new Object[]{this, str2, payResultInfo});
                } else {
                    fke.a(jtp.a(jtp.this));
                }
            }
        });
    }

    private Map<String, String> b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("592eda1c", new Object[]{this, jSONObject});
        }
        HashMap hashMap = new HashMap();
        String str = "";
        String string = jSONObject.getString("nextUrl") == null ? str : jSONObject.getString("nextUrl");
        if (Login.getSid() != null) {
            str = Login.getSid();
        }
        hashMap.put("alipayURL", String.format(com.taobao.android.purchase.core.a.BUY_URL_FORMAT, string, str, TaoHelper.getTTID()));
        hashMap.put("from", "WaitPayDetail");
        hashMap.put("result", "1");
        hashMap.put("agednessVersion", com.taobao.android.tbelder.b.c() ? "true" : "false");
        String c = c(jSONObject);
        if (!StringUtils.isEmpty(c)) {
            hashMap.put("orderids", c);
        }
        if (!StringUtils.isEmpty(jSONObject.getString("signStr"))) {
            hashMap.put("signStr", jSONObject.getString("signStr"));
        }
        if (!StringUtils.isEmpty(jSONObject.getString("simplePay"))) {
            hashMap.put("simplepay", jSONObject.getString("simplePay"));
        }
        if (!StringUtils.isEmpty(jSONObject.getString(FullPage.PARAM_BACK2Tab2URL))) {
            hashMap.put("backURL", jSONObject.getString(FullPage.PARAM_BACK2Tab2URL));
        }
        if (!StringUtils.isEmpty(jSONObject.getString("unSuccessUrl"))) {
            hashMap.put("unSuccessUrl", jSONObject.getString("unSuccessUrl"));
        }
        b(hashMap);
        return hashMap;
    }

    private String c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6871249a", new Object[]{this, jSONObject});
        }
        JSONArray jSONArray = jSONObject.getJSONArray("orderIds");
        if (jSONArray == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < jSONArray.size(); i++) {
            if (i != 0) {
                sb.append(",");
            }
            sb.append(jSONArray.get(i));
        }
        return sb.toString();
    }

    @Override // tb.dug
    public void a(com.alibaba.android.aura.b bVar, boolean z) {
        Map<String, Object> c;
        MtopResponse g;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("607bd154", new Object[]{this, bVar, new Boolean(z)});
        } else if (bVar == null || z || !"AURANextRPCServiceDomain".equals(bVar.f()) || (c = bVar.c()) == null) {
        } else {
            Object obj = c.get("NextRPCRemoteResponse");
            if (!(obj instanceof com.alibaba.android.aura.datamodel.nextrpc.a) || (g = ((com.alibaba.android.aura.datamodel.nextrpc.a) obj).g()) == null) {
                return;
            }
            JSONObject a2 = a(bVar);
            String string = a2.getString("errorMsg");
            String string2 = a2.getString(ZimMessageChannel.K_RPC_RES_CODE);
            kqu kquVar = new kqu();
            kquVar.a(g.getApi()).c(d.a(g)).b(qrh.e).d(string2).e(string);
            this.c.a(kquVar.a());
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
            if (!StringUtils.isEmpty(str2)) {
                String string = jSONObject.getString(str2);
                if (!StringUtils.isEmpty(string)) {
                    bundle.putString(str2, string);
                }
            }
        }
        String a2 = a(str);
        AliNavInterface a3 = t.a().a(this.f29759a).a(bundle);
        if (!StringUtils.isEmpty(a2) && a2.contains("needbackpop=1")) {
            a3.b(idw.RESULT_CODE_CUSTOM_PAYMENT);
        }
        a3.a(str);
        if (StringUtils.isEmpty(a2) || !a2.contains("needpop=1")) {
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
        } catch (Exception e) {
            UnifyLog.d("TBBuySubmitCallback", e.toString());
            return null;
        }
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
        t.a().a(this.f29759a).b(idw.RESULT_CODE_CUSTOM_PAYMENT).a(buildUpon.build());
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
        iff iffVar = new iff(this.f29759a);
        if (!StringUtils.isEmpty(str)) {
            iffVar.a(str);
        }
        if (!StringUtils.isEmpty(str2)) {
            iffVar.b(str2);
        }
        if (!StringUtils.isEmpty(str3)) {
            iffVar.e(str3);
        }
        if (!StringUtils.isEmpty(str4)) {
            iffVar.g(str4);
        }
        if (!StringUtils.isEmpty(str5)) {
            iffVar.f(str5);
        }
        return iffVar;
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        Context context = this.f29759a;
        if (!(context instanceof Activity)) {
            return;
        }
        ((Activity) context).finish();
    }

    private JSONObject a(com.alibaba.android.aura.b bVar) {
        MtopResponse g;
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
        if ((obj instanceof com.alibaba.android.aura.datamodel.nextrpc.a) && (g = ((com.alibaba.android.aura.datamodel.nextrpc.a) obj).g()) != null) {
            String retMsg = g.getRetMsg();
            if (g.isNetworkError()) {
                retMsg = qrh.f;
            } else if (g.isApiLockedResult()) {
                retMsg = qrh.g;
            }
            String valueOf = StringUtils.isEmpty(g.getMappingCode()) ? String.valueOf(g.getResponseCode()) : g.getMappingCode();
            jSONObject.put("errorMsg", (Object) retMsg);
            jSONObject.put(ZimMessageChannel.K_RPC_RES_CODE, (Object) valueOf);
        }
        return jSONObject;
    }
}
