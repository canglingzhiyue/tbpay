package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public class ixv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Map<String, ixw> f29400a = new HashMap();

    static {
        kge.a(239001740);
    }

    public Map<String, ixw> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("a014a89d", new Object[]{this}) : this.f29400a;
    }
}
