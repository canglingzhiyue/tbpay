package tb;

import android.content.Context;
import com.alibaba.ability.localization.b;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.f;
import com.alibaba.android.aura.q;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.buy.internal.a;
import com.taobao.android.purchase.aura.utils.d;
import com.taobao.android.purchase.aura.utils.e;
import com.taobao.taobao.R;
import mtopsdk.mtop.domain.MtopResponse;
import tb.iff;

/* loaded from: classes6.dex */
public abstract class idc implements aro {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ERROR_DOMAIN = "TaobaoPurchaseExt";

    /* renamed from: a  reason: collision with root package name */
    private q f28919a;
    private aqs b;
    private AURAGlobalData c;

    static {
        kge.a(672306678);
        kge.a(389606329);
    }

    @Override // tb.arl
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }

    @Override // tb.ark
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, aqs aqsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21929b2a", new Object[]{this, aURAFlowData, aURAGlobalData, aqsVar});
            return;
        }
        this.b = aqsVar;
        this.c = aURAGlobalData;
    }

    public aqs a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (aqs) ipChange.ipc$dispatch("f02733b", new Object[]{this}) : this.b;
    }

    public q b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (q) ipChange.ipc$dispatch("c46eebf6", new Object[]{this}) : this.f28919a;
    }

    public AURAGlobalData c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AURAGlobalData) ipChange.ipc$dispatch("3d599e80", new Object[]{this}) : this.c;
    }

    @Override // tb.arl
    public void onCreate(q qVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b967f", new Object[]{this, qVar, fVar});
        } else {
            this.f28919a = qVar;
        }
    }

    public void a(final Context context, MtopResponse mtopResponse, String str, String str2, String str3, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6383203", new Object[]{this, context, mtopResponse, str, str2, str3, new Boolean(z), new Boolean(z2)});
            return;
        }
        a aVar = (a) this.f28919a.a(a.class.getSimpleName(), a.class);
        if (e.d() && aVar != null) {
            kqu kquVar = new kqu();
            kquVar.a(mtopResponse.getApi()).c(d.a(mtopResponse)).b(str).d(str2).e(str3);
            if (z2 && "true".equals(e.a("enableRefresh", "true")) && (str2.equals("-202AEC10001") || str2.equals("200AES20001"))) {
                kquVar.a(b.a(R.string.purchase_action_back), a("pop")).b(b.a(R.string.purchase_taobao_app_1029_1_19078), a("refresh"));
            }
            aVar.a(z ? kquVar.a() : kquVar.b());
            return;
        }
        iff iffVar = new iff(context);
        iffVar.a(str);
        iffVar.b(str3);
        iffVar.e(str2);
        iffVar.a(new iff.b() { // from class: tb.idc.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.iff.b
            public void a(iff iffVar2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ed8e834f", new Object[]{this, iffVar2});
                    return;
                }
                iffVar2.b();
                fke.a(context);
            }
        });
        iffVar.a();
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
}
