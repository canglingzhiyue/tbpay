package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.p;
import java.util.List;

/* loaded from: classes.dex */
public class fns extends fnl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-927128218);
    }

    @Override // tb.fnl, tb.fnp
    public Object a(List list, fpd fpdVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("1fe05363", new Object[]{this, list, fpdVar}) : Boolean.valueOf(p.a());
    }
}
