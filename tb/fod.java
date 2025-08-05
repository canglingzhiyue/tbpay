package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* loaded from: classes.dex */
public class fod extends fnl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-853113531);
    }

    @Override // tb.fnl, tb.fnp
    public Object a(List list, fpd fpdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("1fe05363", new Object[]{this, list, fpdVar});
        }
        fpa.a("DoubleGreater");
        if (list != null && list.size() == 2) {
            try {
                if (Double.parseDouble(list.get(0).toString()) - Double.parseDouble(list.get(1).toString()) >= 1.0E-9d) {
                    return true;
                }
            } catch (NumberFormatException unused) {
                fpa.a("double cast error!");
            }
        }
        return false;
    }
}
