package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.gateway.util.a;
import java.util.List;

/* loaded from: classes.dex */
public class gll extends glo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1728238725);
    }

    @Override // tb.glo, tb.gmg
    public Object a(List list, gmf gmfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("efb2a7c9", new Object[]{this, list, gmfVar});
        }
        a.a("TrimEvaluation");
        if (list == null || list.size() != 1) {
            return null;
        }
        try {
            String valueOf = String.valueOf(list.get(0));
            if (valueOf.length() == 0) {
                return null;
            }
            return valueOf.trim();
        } catch (ClassCastException unused) {
            a.a("String cast error!");
            return null;
        }
    }
}
