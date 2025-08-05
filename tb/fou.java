package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* loaded from: classes.dex */
public class fou extends fnl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1110164311);
    }

    @Override // tb.fnl, tb.fnp
    public Object a(List list, fpd fpdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("1fe05363", new Object[]{this, list, fpdVar});
        }
        if (list == null || list.size() <= 1) {
            return null;
        }
        int size = list.size();
        Object obj = list.get(0);
        if (obj == null || !(obj instanceof String)) {
            return null;
        }
        for (int i = 1; i < size; i++) {
            Object obj2 = list.get(i);
            if (obj2 != null && (obj2 instanceof String)) {
                obj = obj.toString().concat(obj2.toString());
            }
        }
        return obj.toString();
    }
}
