package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.expressionv2.i;
import java.util.List;

/* loaded from: classes.dex */
public class fot extends fnl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1043608839);
    }

    @Override // tb.fnl, tb.fnp
    public Object a(List list, fpd fpdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("1fe05363", new Object[]{this, list, fpdVar});
        }
        fpa.a("OrEvaluation");
        if (list != null && list.size() > 1) {
            int size = list.size();
            try {
                boolean a2 = i.a(list.get(0).toString());
                for (int i = 1; i < size; i++) {
                    boolean a3 = i.a(list.get(i).toString());
                    if (!a2 && !a3) {
                        a2 = false;
                    }
                    a2 = true;
                }
                return Boolean.valueOf(a2);
            } catch (ClassCastException unused) {
                fpa.a("boolean cast error!");
            }
        }
        return null;
    }
}
