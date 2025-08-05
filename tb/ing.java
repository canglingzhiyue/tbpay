package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.ace.b;
import com.taobao.android.searchbaseframe.ace.model.JsonRpcRequest;

/* loaded from: classes6.dex */
public class ing extends ink {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1177717758);
    }

    @Override // tb.inl
    public Object a(JsonRpcRequest jsonRpcRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("c269392b", new Object[]{this, jsonRpcRequest});
        }
        b.b();
        return null;
    }
}
