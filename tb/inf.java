package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.ace.b;
import com.taobao.android.searchbaseframe.ace.model.JsonRpcRequest;

/* loaded from: classes6.dex */
public class inf extends ink {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-267979815);
    }

    @Override // tb.inl
    public Object a(JsonRpcRequest jsonRpcRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("c269392b", new Object[]{this, jsonRpcRequest});
        }
        String string = ((JSONObject) jsonRpcRequest.getParams()).getString("requestAlias");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        b.a(string);
        return null;
    }
}
