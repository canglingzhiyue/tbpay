package tb;

import android.content.Context;
import com.alibaba.ability.localization.b;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.datamodel.nextrpc.a;
import com.alibaba.android.aura.f;
import com.alibaba.android.aura.q;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.purchase.aura.utils.d;
import com.taobao.android.waitpay.c;
import com.taobao.taobao.R;
import mtopsdk.mtop.domain.MtopResponse;

/* loaded from: classes6.dex */
public abstract class jte implements aro {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ERROR_DOMAIN = "AbsAURAErrorExtension";

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ boolean f29755a;
    private q b;
    private aqs c;
    private AURAGlobalData d;

    @Override // tb.arl
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }

    static {
        kge.a(1855533101);
        kge.a(389606329);
        f29755a = !jte.class.desiredAssertionStatus();
    }

    @Override // tb.ark
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, aqs aqsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21929b2a", new Object[]{this, aURAFlowData, aURAGlobalData, aqsVar});
            return;
        }
        this.c = aqsVar;
        this.d = aURAGlobalData;
    }

    public aqs a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (aqs) ipChange.ipc$dispatch("f02733b", new Object[]{this}) : this.c;
    }

    public q b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (q) ipChange.ipc$dispatch("c46eebf6", new Object[]{this}) : this.b;
    }

    @Override // tb.arl
    public void onCreate(q qVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b967f", new Object[]{this, qVar, fVar});
        } else {
            this.b = qVar;
        }
    }

    public void a(Context context, MtopResponse mtopResponse, String str, String str2, String str3, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6383203", new Object[]{this, context, mtopResponse, str, str2, str3, new Boolean(z), new Boolean(z2)});
            return;
        }
        c cVar = (c) this.b.a("userContextDateUpdate", c.class);
        if (!f29755a && cVar == null) {
            throw new AssertionError();
        }
        kqu kquVar = new kqu();
        kquVar.a(mtopResponse.getApi()).c(d.a(mtopResponse)).b(str).d(str2).e(str3);
        if (z2 && (str2.equals("-202AEC10001") || str2.equals("200AES20001"))) {
            kquVar.a(b.a(R.string.app_back), a("pop")).b(b.a(R.string.purchase_taobao_app_1029_1_19083), a("refresh"));
        }
        cVar.a(z ? kquVar.a() : kquVar.b());
    }

    private JSONArray a(String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("2cbc73a7", new Object[]{this, strArr});
        }
        JSONArray jSONArray = new JSONArray();
        for (String str : strArr) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", (Object) str);
            jSONArray.add(jSONObject);
        }
        return jSONArray;
    }

    public static boolean a(q qVar, a aVar) {
        c cVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4df911bb", new Object[]{qVar, aVar})).booleanValue();
        }
        if (qVar == null) {
            return false;
        }
        JSONObject a2 = a(aVar);
        if (bau.a(a2) || (cVar = (c) qVar.a("userContextDateUpdate", c.class)) == null) {
            return false;
        }
        cVar.a(a2);
        return true;
    }

    private static JSONObject a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f62cdee", new Object[]{aVar});
        }
        JSONObject f = aVar.f();
        if (bau.a(f)) {
            return null;
        }
        JSONObject jSONObject = f.getJSONObject("data");
        if (bau.a(jSONObject) || !bbf.a(jSONObject)) {
            return null;
        }
        return jSONObject;
    }
}
