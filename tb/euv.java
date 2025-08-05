package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.node.b;
import com.taobao.android.detail.mainpic.g;

/* loaded from: classes4.dex */
public class euv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static boolean a(g gVar) {
        b A;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("200e2b7f", new Object[]{gVar})).booleanValue();
        }
        if (euo.c() && gVar != null && (A = gVar.A()) != null) {
            return A.n();
        }
        return false;
    }
}
