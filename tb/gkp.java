package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.gateway.util.a;
import java.util.List;

/* loaded from: classes.dex */
public class gkp extends glo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-822495126);
    }

    @Override // tb.glo, tb.gmg
    public Object a(List list, gmf gmfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("efb2a7c9", new Object[]{this, list, gmfVar});
        }
        a.a("DoubleEqual");
        if (list != null && list.size() == 2) {
            try {
                if (Math.abs(Double.parseDouble(list.get(0).toString()) - Double.parseDouble(list.get(1).toString())) < 1.0E-9d) {
                    return true;
                }
            } catch (NumberFormatException unused) {
                a.a("double cast error!");
            }
        }
        return false;
    }
}
