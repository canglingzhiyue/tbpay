package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.utils.UnifyLog;
import java.lang.reflect.Array;

/* loaded from: classes6.dex */
public class jpb implements jpi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-996386896);
        kge.a(-2038312859);
    }

    @Override // tb.jpi
    public boolean a(Object obj, Class<?> cls, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("310b307", new Object[]{this, obj, cls, str})).booleanValue() : cls.isArray();
    }

    @Override // tb.jpi
    public Object b(Object obj, Class<?> cls, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("57e69550", new Object[]{this, obj, cls, str});
        }
        try {
            return Array.get(obj, Integer.parseInt(str));
        } catch (Exception e) {
            UnifyLog.a(e.getMessage(), new String[0]);
            return null;
        }
    }
}
