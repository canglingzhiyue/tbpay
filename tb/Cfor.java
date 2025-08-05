package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.expressionv2.i;
import java.util.List;

/* renamed from: tb.for  reason: invalid class name */
/* loaded from: classes.dex */
public class Cfor extends fnl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1119571935);
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
        Boolean valueOf = Boolean.valueOf(i.a(list.get(0).toString()));
        if ((valueOf instanceof Boolean) && valueOf.booleanValue()) {
            return list.get(1);
        }
        return null;
    }
}
