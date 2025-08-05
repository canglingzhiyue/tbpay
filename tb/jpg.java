package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes6.dex */
public class jpg implements jpi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1644099085);
        kge.a(-2038312859);
    }

    @Override // tb.jpi
    public boolean a(Object obj, Class<?> cls, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("310b307", new Object[]{this, obj, cls, str})).booleanValue() : obj instanceof Map;
    }

    @Override // tb.jpi
    public Object b(Object obj, Class<?> cls, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("57e69550", new Object[]{this, obj, cls, str}) : ((Map) obj).get(str);
    }
}
