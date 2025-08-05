package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.expressionv2.i;
import java.util.List;

/* loaded from: classes.dex */
public class foz extends fnl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-131202686);
    }

    @Override // tb.fnl, tb.fnp
    public Object a(List list, fpd fpdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("1fe05363", new Object[]{this, list, fpdVar});
        }
        fpa.a("TripleEvaluation");
        if (list != null && list.size() == 3) {
            try {
                if (i.a(list.get(0).toString())) {
                    return (String) list.get(1);
                }
                return (String) list.get(2);
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }
}
