package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public class pnc implements pnd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Map<String, Boolean> f32769a = new HashMap();

    static {
        kge.a(-1162461603);
        kge.a(816436263);
    }

    @Override // tb.pnd
    public Map<String, Boolean> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a014a89d", new Object[]{this});
        }
        this.f32769a.put("isTBLiveAPP", false);
        return this.f32769a;
    }
}
