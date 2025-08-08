package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.ace.b;
import com.taobao.android.searchbaseframe.ace.model.AceStrategy;
import com.taobao.android.searchbaseframe.ace.model.AceSubStrategy;
import com.taobao.android.searchbaseframe.ace.model.JsonRpcRequest;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public class inj extends ink {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1010990714);
    }

    public static /* synthetic */ Object ipc$super(inj injVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.inl
    public Object a(JsonRpcRequest jsonRpcRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("c269392b", new Object[]{this, jsonRpcRequest});
        }
        JSONObject jSONObject = (JSONObject) jsonRpcRequest.getParams();
        String string = jSONObject.getString("name");
        Map<String, String> a2 = inr.a(jSONObject.getJSONObject("params"));
        AceStrategy aceStrategy = new AceStrategy();
        aceStrategy.setId(jSONObject.getIntValue("id"));
        aceStrategy.setName(string);
        aceStrategy.setParams(a2);
        aceStrategy.setStrategyMap(a(jSONObject.getJSONArray("subStrategies")));
        b.a(aceStrategy);
        return null;
    }

    private Map<String, AceSubStrategy> a(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("edb7bbc5", new Object[]{this, jSONArray});
        }
        if (jSONArray == null) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap();
        for (int i = 0; i < jSONArray.size(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            String string = jSONObject.getString("requestAlias");
            if (!StringUtils.isEmpty(string)) {
                String string2 = jSONObject.getString("id");
                Map<String, String> a2 = inr.a(jSONObject.getJSONObject("requestParams"));
                AceSubStrategy aceSubStrategy = new AceSubStrategy();
                aceSubStrategy.setId(string2);
                aceSubStrategy.setStrategyType("strategy");
                aceSubStrategy.setRequestParams(a2);
                aceSubStrategy.setUrl(jSONObject.getString("url"));
                hashMap.put(string, aceSubStrategy);
            }
        }
        return hashMap;
    }
}
