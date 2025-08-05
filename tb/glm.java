package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.gateway.dinamic.expressionv2.h;
import com.taobao.android.gateway.util.a;
import java.util.List;

/* loaded from: classes.dex */
public class glm extends glo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1314935159);
    }

    @Override // tb.glo, tb.gmg
    public Object a(List list, gmf gmfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("efb2a7c9", new Object[]{this, list, gmfVar});
        }
        a.a("TripleEvaluation");
        if (list != null && list.size() == 3) {
            try {
                if (h.a(list.get(0).toString())) {
                    return (String) list.get(1);
                }
                return (String) list.get(2);
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }
}
