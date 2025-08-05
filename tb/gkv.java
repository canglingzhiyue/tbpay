package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.gateway.dinamic.expressionv2.h;
import java.math.BigDecimal;
import java.util.List;

/* loaded from: classes.dex */
public class gkv extends glo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2049664261);
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
        Object obj = list.get(0);
        Object obj2 = list.get(1);
        if (obj == null && obj2 == null) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        if (obj.getClass().equals(obj2.getClass())) {
            return Boolean.valueOf(obj.equals(obj2));
        }
        if ((obj instanceof Number) && (obj2 instanceof Number)) {
            return Boolean.valueOf(a(obj, obj2));
        }
        return Boolean.valueOf(obj.equals(obj2));
    }

    public boolean a(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("184a7924", new Object[]{this, obj, obj2})).booleanValue() : ((obj instanceof BigDecimal) || (obj2 instanceof BigDecimal)) ? h.c(obj).compareTo(h.c(obj2)) == 0 : (h.e(obj) || h.e(obj2)) ? h.d(obj) == h.d(obj2) : h.b(obj) == h.b(obj2);
    }
}
