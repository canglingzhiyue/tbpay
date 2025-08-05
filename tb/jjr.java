package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Array;

/* loaded from: classes6.dex */
public class jjr implements jka {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-24038502);
        kge.a(800696891);
    }

    @Override // tb.jka
    public boolean a(Object obj, Class<?> cls, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("310b307", new Object[]{this, obj, cls, str})).booleanValue() : cls.isArray();
    }

    @Override // tb.jka
    public Object b(Object obj, Class<?> cls, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("57e69550", new Object[]{this, obj, cls, str});
        }
        try {
            return Array.get(obj, Integer.parseInt(str));
        } catch (Exception e) {
            jjy.a(e.getMessage());
            return null;
        }
    }
}
