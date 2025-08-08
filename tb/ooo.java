package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* loaded from: classes.dex */
public class ooo extends fnl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1817596623);
    }

    @Override // tb.fnl, tb.fnp
    public Object a(List list, fpd fpdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("1fe05363", new Object[]{this, list, fpdVar});
        }
        if (list != null && list.size() == 1 && (list.get(0) instanceof String)) {
            return Boolean.valueOf(StringUtils.equals((String) list.get(0), "Android"));
        }
        return null;
    }
}
