package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.gateway.util.a;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class gld extends glo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1074036735);
    }

    @Override // tb.glo, tb.gmg
    public Object a(List list, gmf gmfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("efb2a7c9", new Object[]{this, list, gmfVar});
        }
        a.a("LengthEvaluation");
        if (list == null || list.size() != 1) {
            return null;
        }
        Object obj = list.get(0);
        try {
            if (obj instanceof String) {
                return String.valueOf(((String) obj).length());
            }
            if (obj instanceof Object[]) {
                return String.valueOf(((Object[]) obj).length);
            }
            if (obj instanceof Map) {
                return String.valueOf(((Map) obj).size());
            }
            if (!(obj instanceof List)) {
                return null;
            }
            return String.valueOf(((List) obj).size());
        } catch (ClassCastException unused) {
            a.a("String cast error!");
            return null;
        }
    }
}
