package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* loaded from: classes.dex */
public class fop extends fnl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(869563408);
    }

    @Override // tb.fnl, tb.fnp
    public Object a(List list, fpd fpdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("1fe05363", new Object[]{this, list, fpdVar});
        }
        fpa.a("IntLessEqual");
        if (list != null && list.size() == 2) {
            try {
                if (Integer.parseInt(list.get(0).toString()) <= Integer.parseInt(list.get(1).toString())) {
                    return true;
                }
            } catch (ClassCastException unused) {
                fpa.a("Integer cast error!");
            } catch (NumberFormatException unused2) {
                fpa.a("Input type  error!");
                return false;
            }
        }
        return false;
    }
}
