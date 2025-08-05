package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.gateway.util.a;
import java.util.List;

/* loaded from: classes.dex */
public class glc extends glo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1227243589);
    }

    @Override // tb.glo, tb.gmg
    public Object a(List list, gmf gmfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("efb2a7c9", new Object[]{this, list, gmfVar});
        }
        a.a("IntLessEqual");
        if (list != null && list.size() == 2) {
            try {
                if (Integer.parseInt(list.get(0).toString()) <= Integer.parseInt(list.get(1).toString())) {
                    return true;
                }
            } catch (ClassCastException unused) {
                a.a("Integer cast error!");
            } catch (NumberFormatException unused2) {
                a.a("Input type  error!");
                return false;
            }
        }
        return false;
    }
}
