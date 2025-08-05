package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* loaded from: classes.dex */
public class foy extends fnl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2114100666);
    }

    @Override // tb.fnl, tb.fnp
    public Object a(List list, fpd fpdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("1fe05363", new Object[]{this, list, fpdVar});
        }
        fpa.a("TrimEvaluation");
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
            fpa.a("String cast error!");
            return null;
        }
    }
}
