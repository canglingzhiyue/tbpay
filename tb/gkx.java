package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.gateway.dinamic.expressionv2.h;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class gkx extends glo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1883900125);
    }

    @Override // tb.glo, tb.gmg
    public Object a(List list, gmf gmfVar) {
        Object[] objArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("efb2a7c9", new Object[]{this, list, gmfVar});
        }
        if (list != null && list.size() == 2) {
            Object obj = list.get(0);
            if (obj instanceof Map) {
                return ((Map) obj).get(list.get(1));
            }
            try {
                int a2 = h.a(list.get(1));
                if (obj instanceof List) {
                    objArr = ((List) obj).toArray();
                } else {
                    objArr = (Object[]) obj;
                }
                if (a2 < objArr.length) {
                    return objArr[a2];
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }
}
