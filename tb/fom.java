package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* loaded from: classes.dex */
public class fom extends fnl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2121020463);
    }

    @Override // tb.fnl, tb.fnp
    public Object a(List list, fpd fpdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("1fe05363", new Object[]{this, list, fpdVar});
        }
        fpa.a("IntGreater");
        if (list != null && list.size() == 2) {
            try {
                if (Integer.parseInt(list.get(0).toString()) > Integer.parseInt(list.get(1).toString())) {
                    return true;
                }
            } catch (NumberFormatException unused) {
                fpa.a("Integer cast error!");
            }
        }
        return false;
    }
}
