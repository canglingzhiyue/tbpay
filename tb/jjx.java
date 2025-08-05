package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes6.dex */
public class jjx implements jka {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2087568503);
        kge.a(800696891);
    }

    @Override // tb.jka
    public boolean a(Object obj, Class<?> cls, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("310b307", new Object[]{this, obj, cls, str})).booleanValue() : obj instanceof Map;
    }

    @Override // tb.jka
    public Object b(Object obj, Class<?> cls, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("57e69550", new Object[]{this, obj, cls, str}) : ((Map) obj).get(str);
    }
}
