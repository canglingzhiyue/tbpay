package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* loaded from: classes5.dex */
public class fnx implements fnz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1682064388);
        kge.a(-816581254);
    }

    @Override // tb.fnz
    public boolean a(Object obj, Class<?> cls, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("310b307", new Object[]{this, obj, cls, str})).booleanValue() : obj instanceof List;
    }

    @Override // tb.fnz
    public Object b(Object obj, Class<?> cls, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("57e69550", new Object[]{this, obj, cls, str});
        }
        List list = (List) obj;
        try {
            if (!TextUtils.isEmpty(str) && list != null && list.size() > 0) {
                return list.get(Integer.parseInt(str));
            }
            return null;
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
    }
}
