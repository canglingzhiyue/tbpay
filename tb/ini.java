package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.ace.b;
import com.taobao.android.searchbaseframe.ace.model.AceSubStrategy;
import com.taobao.android.searchbaseframe.ace.model.JsonRpcRequest;
import java.util.HashMap;

/* loaded from: classes6.dex */
public class ini extends ink {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-975963567);
    }

    @Override // tb.inl
    public Object a(JsonRpcRequest jsonRpcRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("c269392b", new Object[]{this, jsonRpcRequest});
        }
        JSONObject jSONObject = (JSONObject) jsonRpcRequest.getParams();
        String string = jSONObject.getString("id");
        String string2 = jSONObject.getString("type");
        String string3 = jSONObject.getString("requestAlias");
        if (!StringUtils.isEmpty(string) && !StringUtils.isEmpty(string2) && !StringUtils.isEmpty(string3)) {
            AceSubStrategy aceSubStrategy = new AceSubStrategy();
            aceSubStrategy.setId(string);
            aceSubStrategy.setStrategyType(string2);
            aceSubStrategy.setRequestParams(new HashMap());
            b.a(string3, aceSubStrategy);
        }
        return null;
    }
}
