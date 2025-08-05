package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.gateway.dinamic.expressionv2.h;
import java.util.List;

/* loaded from: classes.dex */
public class glj extends glo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-289218117);
    }

    @Override // tb.glo, tb.gmg
    public Object a(List list, gmf gmfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("efb2a7c9", new Object[]{this, list, gmfVar});
        }
        String str = null;
        if (list == null) {
            return null;
        }
        if (list.size() == 3) {
            Object obj = list.get(0);
            int a2 = h.a(list.get(1));
            int a3 = h.a(list.get(2));
            String valueOf = String.valueOf(obj);
            if (a3 < 0 || a2 + 1 > valueOf.length()) {
                return "";
            }
            if (a2 < 0) {
                a2 = 0;
            }
            int i = a3 + a2;
            if (i > obj.toString().length()) {
                str = valueOf.substring(a2);
            }
            return i + (-1) < obj.toString().length() ? ((String) obj).substring(a2, i) : str;
        } else if (list.size() != 2) {
            return null;
        } else {
            Object obj2 = list.get(0);
            int a4 = h.a(list.get(1));
            String valueOf2 = String.valueOf(obj2);
            if (a4 + 1 > valueOf2.length()) {
                return "";
            }
            if (a4 < 0) {
                a4 = 0;
            }
            return valueOf2.substring(a4);
        }
    }
}
