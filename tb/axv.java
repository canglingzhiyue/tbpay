package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes2.dex */
public class axv implements axw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1781861160);
        kge.a(-1221441238);
    }

    @Override // tb.axw
    public boolean a(Object obj, Class<?> cls, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("310b307", new Object[]{this, obj, cls, str})).booleanValue() : obj instanceof Map;
    }

    @Override // tb.axw
    public Object b(Object obj, Class<?> cls, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("57e69550", new Object[]{this, obj, cls, str}) : ((Map) obj).get(str);
    }
}
