package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.ace.model.JsonRpcRequest;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public class inn implements ino<JsonRpcRequest> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, inm<JsonRpcRequest>> f29167a = new HashMap();

    static {
        kge.a(-1417745549);
        kge.a(915592518);
    }

    @Override // tb.ino
    public inm<JsonRpcRequest> a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (inm) ipChange.ipc$dispatch("7c70b32c", new Object[]{this, str}) : this.f29167a.get(str);
    }

    @Override // tb.ino
    public void a(String str, inm<JsonRpcRequest> inmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dece3ba", new Object[]{this, str, inmVar});
        } else {
            this.f29167a.put(str, inmVar);
        }
    }
}
