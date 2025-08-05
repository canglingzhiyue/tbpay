package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.utils.UnifyLog;
import java.util.List;

/* loaded from: classes5.dex */
public class gor extends gmv<goq> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1867352623);
    }

    public gor(gmv gmvVar) {
        super(gmvVar);
    }

    @Override // tb.gmv
    public boolean a(goq goqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eaa8a5b3", new Object[]{this, goqVar})).booleanValue();
        }
        int e = goqVar.e();
        int d = goqVar.d();
        List<IDMComponent> c = goqVar.c();
        if (e < 0 || e >= c.size()) {
            UnifyLog.d("DragVerifySwapHandler", "canSwap pos error|fromAdapterPos", String.valueOf(d), "|tryTargetAdapterPos|", String.valueOf(e), "|voList|", String.valueOf(c.size()));
            return false;
        }
        return b(goqVar);
    }
}
