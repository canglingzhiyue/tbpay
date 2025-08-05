package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.monitor.c;
import com.taobao.android.dinamicx.p;
import java.util.List;

/* loaded from: classes.dex */
public class fnt extends fnl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2051803059);
    }

    @Override // tb.fnl, tb.fnp
    public Object a(List list, fpd fpdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("1fe05363", new Object[]{this, list, fpdVar});
        }
        if (list != null && list.size() != 0) {
            if (p.a() && list.size() == 1 && list.get(0) != null) {
                return String.valueOf(gbg.c(DinamicXEngine.i(), p.b(gbg.a(DinamicXEngine.i(), String.valueOf(list.get(0)), 0))));
            }
            c a2 = c.a();
            if (list.size() == 1 && (list.get(0) instanceof Number)) {
                return a2.a((Double) list.get(0));
            }
            if (list.size() == 2 && (list.get(0) instanceof Number) && (list.get(1) instanceof Number)) {
                return a2.a((Double) list.get(0), (Double) list.get(1));
            }
            if (list.size() == 5 && (list.get(0) instanceof Number) && (list.get(1) instanceof Number) && (list.get(2) instanceof Number) && (list.get(3) instanceof Number) && (list.get(4) instanceof Number)) {
                return a2.a((Double) list.get(0), (Double) list.get(1), (Double) list.get(2), (Double) list.get(3), (Double) list.get(4));
            }
            if (list.size() == 1 && list.get(0) != null) {
                return a2.a(String.valueOf(list.get(0)));
            }
            if (list.size() == 2 && list.get(0) != null && list.get(1) != null) {
                return a2.a(String.valueOf(list.get(0)), String.valueOf(list.get(1)));
            }
            if (list.size() == 5) {
                return a2.a(String.valueOf(list.get(0)), String.valueOf(list.get(1)), String.valueOf(list.get(2)), String.valueOf(list.get(3)), String.valueOf(list.get(4)));
            }
        }
        return null;
    }
}
