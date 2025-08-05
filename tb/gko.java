package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.gateway.dinamic.expressionv2.h;
import com.taobao.android.gateway.util.a;
import java.util.List;

/* loaded from: classes.dex */
public class gko extends glo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1883894622);
    }

    @Override // tb.glo, tb.gmg
    public Object a(List list, gmf gmfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("efb2a7c9", new Object[]{this, list, gmfVar});
        }
        a.a("AndEvaluation");
        if (list != null && list.size() > 1) {
            int size = list.size();
            try {
                boolean a2 = h.a(list.get(0).toString());
                for (int i = 1; i < size; i++) {
                    a2 = a2 && h.a(list.get(i).toString());
                }
                return Boolean.valueOf(a2);
            } catch (ClassCastException unused) {
                a.a("boolean cast error!");
            }
        }
        return null;
    }
}
