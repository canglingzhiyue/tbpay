package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes.dex */
public class glx implements gly {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1248505422);
        kge.a(-83321120);
    }

    @Override // tb.gly
    public boolean a(Object obj, Class<?> cls, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("310b307", new Object[]{this, obj, cls, str})).booleanValue() : obj instanceof Map;
    }

    @Override // tb.gly
    public Object b(Object obj, Class<?> cls, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("57e69550", new Object[]{this, obj, cls, str}) : ((Map) obj).get(str);
    }
}
