package tb;

import android.support.v4.app.FrameMetricsAggregator;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.util.k;
import com.taobao.taolive.room.utils.aw;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.q;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class nrc extends npp<nrb> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-306771122);
    }

    public static /* synthetic */ Object ipc$super(nrc nrcVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [tb.nrb, java.lang.Object] */
    @Override // tb.npp
    public /* synthetic */ nrb b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("43b9c269", new Object[]{this}) : a();
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [tb.nrb, java.lang.Object] */
    @Override // tb.npp
    public /* synthetic */ nrb b(JSONObject jSONObject, nul nulVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("6b4445f2", new Object[]{this, jSONObject, nulVar}) : a(jSONObject, nulVar);
    }

    public nrb a(JSONObject jSONObject, nul nulVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nrb) ipChange.ipc$dispatch("aae082e7", new Object[]{this, jSONObject, nulVar});
        }
        nrb nrbVar = new nrb(null, null, null, 7, null);
        if (jSONObject == null) {
            nul.Companion.a(nulVar, "DataConvert", "-1", "JSON is empty");
            return nrbVar;
        }
        HashMap hashMap = new HashMap();
        String optString = jSONObject.optString(aw.PARAM_PVID);
        String optString2 = jSONObject.optString("tpp_trace");
        HashMap hashMap2 = hashMap;
        hashMap2.put("pvId", optString);
        hashMap2.put("tppTrace", optString2);
        JSONObject optJSONObject = jSONObject.optJSONObject("result");
        if (optJSONObject == null) {
            hashMap2.put("errCode", "-1");
            hashMap2.put("errMsg", "inner result is empty");
            nul.Companion.b(nulVar, "DataConvert", hashMap2);
            return nrbVar;
        }
        String optString3 = optJSONObject.optString(k.KEY_SUGGEST_RN);
        String optString4 = optJSONObject.optString("data_from");
        hashMap2.put("suggestRn", optString3);
        hashMap2.put("dataFrom", optString4);
        JSONObject optJSONObject2 = optJSONObject.optJSONObject("result");
        if (optJSONObject2 == null) {
            hashMap2.put("errCode", "-1");
            hashMap2.put("errMsg", "bgwords result is empty");
            nul.Companion.b(nulVar, "DataConvert", hashMap2);
            return nrbVar;
        }
        nrbVar.a(optString3);
        nrbVar.b(optString4);
        a(optJSONObject2, nrbVar);
        if (nrbVar.a() != null) {
            List<nra> a2 = nrbVar.a();
            if (a2 == null) {
                q.a();
            }
            nra nraVar = a2.get(0);
            if (nraVar != null && !StringUtils.isEmpty(nraVar.a())) {
                hashMap2.put("displayText", nraVar.a());
                hashMap2.put("searchText", nraVar.b());
            }
        }
        nul.Companion.a(nulVar, "DataConvert", hashMap2);
        return nrbVar;
    }

    private final void a(JSONObject jSONObject, nrb nrbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffbde2e8", new Object[]{this, jSONObject, nrbVar});
            return;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("hintq_rolling");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        int length = optJSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                arrayList.add(a(optJSONObject));
            }
        }
        nrbVar.a(arrayList);
    }

    private final nra a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nra) ipChange.ipc$dispatch("ddc64bf3", new Object[]{this, jSONObject});
        }
        nra nraVar = new nra(null, null, null, null, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
        nraVar.f(jSONObject.optString("darkIconUrl"));
        nraVar.a(jSONObject.optString("displayText"));
        nraVar.d(jSONObject.optString("iconHeight"));
        nraVar.g(jSONObject.optString("iconUrl"));
        nraVar.e(jSONObject.optString("iconWidth"));
        nraVar.b(jSONObject.optString("recallType"));
        nraVar.h(jSONObject.optString("roughScore"));
        nraVar.c(jSONObject.optString("searchText"));
        nraVar.a(new LinkedHashMap());
        JSONArray optJSONArray = jSONObject.optJSONArray("searchparams");
        if (optJSONArray != null && optJSONArray.length() > 0) {
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    String optString = optJSONObject.optString("key");
                    if (!StringUtils.isEmpty(optString)) {
                        String optString2 = optJSONObject.optString("value");
                        Map<String, String> c = nraVar.c();
                        if (c != null) {
                            c.put(optString, optString2);
                        }
                    }
                }
            }
        }
        return nraVar;
    }

    public nrb a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (nrb) ipChange.ipc$dispatch("f085dc0", new Object[]{this}) : new nrb(null, null, null, 7, null);
    }
}
