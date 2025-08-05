package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.ace.model.JsonRpcRequest;
import com.taobao.search.rainbow.a;
import java.util.Map;

/* loaded from: classes6.dex */
public class inh extends ink {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1870364486);
    }

    @Override // tb.inl
    public Object a(JsonRpcRequest jsonRpcRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("c269392b", new Object[]{this, jsonRpcRequest});
        }
        Map<String, String> map = null;
        for (Map.Entry<String, Object> entry : ((JSONObject) jsonRpcRequest.getParams()).entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value != null) {
                map = a.a(key, value.toString());
            }
        }
        if (map != null) {
            JsonRpcRequest obtainMessage = JsonRpcRequest.obtainMessage("notify.ABTest");
            obtainMessage.setParams((JSON) JSON.toJSON(map));
            imp.a().b(obtainMessage);
        }
        return null;
    }
}
