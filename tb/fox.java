package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* loaded from: classes.dex */
public class fox extends fnl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-535852771);
    }

    @Override // tb.fnl, tb.fnp
    public Object a(List list, fpd fpdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("1fe05363", new Object[]{this, list, fpdVar});
        }
        if (list == null || list.size() != 1) {
            return null;
        }
        Object obj = list.get(0);
        if (!(obj instanceof String)) {
            return null;
        }
        return ((String) obj).toUpperCase();
    }
}
