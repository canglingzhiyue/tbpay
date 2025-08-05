package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.gateway.dinamic.expressionv2.h;
import com.taobao.android.gateway.util.a;
import java.util.List;

/* loaded from: classes.dex */
public class glf extends glo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1883907162);
    }

    @Override // tb.glo, tb.gmg
    public Object a(List list, gmf gmfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("efb2a7c9", new Object[]{this, list, gmfVar});
        }
        a.a("NotEvaluation");
        if (list == null) {
            return null;
        }
        if (list.size() == 1) {
            return Boolean.valueOf(!h.a(list.get(0).toString()));
        }
        return list.size() == 0 ? true : null;
    }
}
