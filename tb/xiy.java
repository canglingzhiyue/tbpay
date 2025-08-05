package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class xiy implements ezm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1758106717);
        kge.a(1967244270);
    }

    public Map<String, String> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6dbf0a5e", new Object[]{this});
        }
        return null;
    }
}
