package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.gateway.util.a;
import java.util.List;

/* loaded from: classes.dex */
public class gkt extends glo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1283542191);
    }

    @Override // tb.glo, tb.gmg
    public Object a(List list, gmf gmfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("efb2a7c9", new Object[]{this, list, gmfVar});
        }
        a.a("DoubleLessEqual");
        if (list != null && list.size() == 2) {
            try {
                double parseDouble = Double.parseDouble(list.get(1).toString()) - Double.parseDouble(list.get(0).toString());
                if (1.0E-9d <= parseDouble || Math.abs(parseDouble) < 1.0E-9d) {
                    return true;
                }
            } catch (NumberFormatException unused) {
                a.a("double cast error!");
            }
        }
        return false;
    }
}
