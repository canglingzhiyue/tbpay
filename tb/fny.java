package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes5.dex */
public class fny implements fnz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1597489960);
        kge.a(-816581254);
    }

    @Override // tb.fnz
    public boolean a(Object obj, Class<?> cls, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("310b307", new Object[]{this, obj, cls, str})).booleanValue() : obj instanceof Map;
    }

    @Override // tb.fnz
    public Object b(Object obj, Class<?> cls, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("57e69550", new Object[]{this, obj, cls, str}) : ((Map) obj).get(str);
    }
}
