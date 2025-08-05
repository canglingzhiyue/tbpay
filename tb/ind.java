package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.ace.b;
import com.taobao.android.searchbaseframe.ace.model.JsonRpcRequest;
import com.taobao.search.rainbow.a;

/* loaded from: classes6.dex */
public class ind extends ink {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-776937353);
    }

    @Override // tb.inl
    public Object a(JsonRpcRequest jsonRpcRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("c269392b", new Object[]{this, jsonRpcRequest});
        }
        b.a();
        a.d();
        JsonRpcRequest obtainMessage = JsonRpcRequest.obtainMessage("notify.ABTest");
        obtainMessage.setParams(new JSONObject());
        imp.a().b(obtainMessage);
        return null;
    }
}
