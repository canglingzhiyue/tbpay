package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.gateway.dinamic.expressionv2.h;
import java.util.List;

/* loaded from: classes.dex */
public class gle extends glo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2042753652);
    }

    @Override // tb.glo, tb.gmg
    public Object a(List list, gmf gmfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("efb2a7c9", new Object[]{this, list, gmfVar});
        }
        if (list == null || list.size() != 2) {
            return null;
        }
        Boolean valueOf = Boolean.valueOf(h.a(list.get(0).toString()));
        if ((valueOf instanceof Boolean) && valueOf.booleanValue()) {
            return list.get(1);
        }
        return null;
    }
}
