package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Array;

/* loaded from: classes5.dex */
public class fnv implements fnz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1982797755);
        kge.a(-816581254);
    }

    @Override // tb.fnz
    public boolean a(Object obj, Class<?> cls, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("310b307", new Object[]{this, obj, cls, str})).booleanValue() : cls.isArray();
    }

    @Override // tb.fnz
    public Object b(Object obj, Class<?> cls, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("57e69550", new Object[]{this, obj, cls, str});
        }
        try {
            return Array.get(obj, Integer.parseInt(str));
        } catch (Exception unused) {
            return null;
        }
    }
}
