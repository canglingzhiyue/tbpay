package tb;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentContainer;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentData;
import com.alibaba.android.aura.f;
import com.alibaba.android.aura.q;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;

@AURAExtensionImpl(code = "tbwaitpay.impl.render.component.creator.recommend")
/* loaded from: classes6.dex */
public final class jtf extends atl {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String USER_CONTEXT_RECOMMEND = "userContextRecommend";
    private q d;
    private jtu e;

    static {
        kge.a(-2093193783);
    }

    public static /* synthetic */ Object ipc$super(jtf jtfVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1219783041) {
            super.onCreate((q) objArr[0], (f) objArr[1]);
            return null;
        } else if (hashCode != 563256106) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onDataChanged((AURAFlowData) objArr[0], (AURAGlobalData) objArr[1], (aqs) objArr[2]);
            return null;
        }
    }

    @Override // tb.atc
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "wait_pay_recommend";
    }

    @Override // tb.atc
    public String a(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e2c2912d", new Object[]{this, aURARenderComponent}) : "wait_pay_recommend";
    }

    @Override // tb.atl, tb.arl
    public void onCreate(q qVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b967f", new Object[]{this, qVar, fVar});
            return;
        }
        super.onCreate(qVar, fVar);
        this.d = qVar;
    }

    @Override // tb.atl, tb.ark
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, aqs aqsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21929b2a", new Object[]{this, aURAFlowData, aURAGlobalData, aqsVar});
        } else {
            super.onDataChanged(aURAFlowData, aURAGlobalData, aqsVar);
        }
    }

    @Override // tb.atc
    public View a(ViewGroup viewGroup, AURARenderComponentContainer aURARenderComponentContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("e8922edd", new Object[]{this, viewGroup, aURARenderComponentContainer});
        }
        jtu c = c();
        if (c == null) {
            return new View(viewGroup.getContext());
        }
        return c.a();
    }

    @Override // tb.atc
    public void a(AURARenderComponent aURARenderComponent, View view, int i) {
        AURARenderComponentData aURARenderComponentData;
        Map<String, Object> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ebad0c4", new Object[]{this, aURARenderComponent, view, new Integer(i)});
            return;
        }
        jtu c = c();
        if (c == null || (aURARenderComponentData = aURARenderComponent.data) == null || (map = aURARenderComponentData.fields) == null) {
            return;
        }
        c.a(a(new JSONObject(map)));
    }

    private JSONObject a(JSONObject jSONObject) {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("429586a8", new Object[]{this, jSONObject});
        }
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject == null || (jSONArray = jSONObject.getJSONArray("subAuctionIds")) == null || (jSONArray2 = jSONObject.getJSONArray("subCatIds")) == null) {
            return jSONObject2;
        }
        String a2 = a(JSONObject.parseArray(jSONArray.toJSONString(), String.class));
        if (!TextUtils.isEmpty(a2)) {
            jSONObject2.put("itemIds", (Object) a2);
        }
        String string = jSONObject.getString("mainOrderId");
        if (string == null) {
            string = "";
        }
        jSONObject2.put("orderId", (Object) string);
        String a3 = a(JSONObject.parseArray(jSONArray2.toJSONString(), String.class));
        if (!TextUtils.isEmpty(a3)) {
            jSONObject2.put("catIds", (Object) a3);
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject("data");
        if (jSONObject3 != null) {
            jSONObject2.put("statusCode", (Object) jSONObject3.getString("statusCode"));
        }
        jSONObject2.put("appid", (Object) 1639);
        return jSONObject2;
    }

    private String a(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("80c38867", new Object[]{this, list});
        }
        if (list == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (String str : list) {
            if (!TextUtils.isEmpty(str)) {
                sb.append(str);
                sb.append(",");
            }
        }
        if (sb.length() <= 0) {
            return null;
        }
        return sb.deleteCharAt(sb.length() - 1).toString();
    }

    private jtu c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jtu) ipChange.ipc$dispatch("1e69e0d1", new Object[]{this});
        }
        jtu jtuVar = this.e;
        if (jtuVar != null) {
            return jtuVar;
        }
        q qVar = this.d;
        if (qVar == null) {
            return null;
        }
        this.e = (jtu) qVar.a(USER_CONTEXT_RECOMMEND, jtu.class);
        return this.e;
    }
}
