package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.expressionv2.i;
import java.math.BigDecimal;
import java.util.List;

/* loaded from: classes5.dex */
public class hil extends fnl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1947163584);
    }

    @Override // tb.fnl, tb.fnp
    public Object a(List list, fpd fpdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("1fe05363", new Object[]{this, list, fpdVar});
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
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("184a7924", new Object[]{this, obj, obj2})).booleanValue() : ((obj instanceof BigDecimal) || (obj2 instanceof BigDecimal)) ? i.c(obj).compareTo(i.c(obj2)) == 0 : (i.e(obj) || i.e(obj2)) ? i.d(obj) == i.d(obj2) : i.b(obj) == i.b(obj2);
    }
}
