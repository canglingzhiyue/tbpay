package tb;

import com.alibaba.android.aura.nodemodel.branch.AURABranchOperatorType;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public class aqo implements aqp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(898740001);
        kge.a(-2008982487);
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : AURABranchOperatorType.not;
    }

    @Override // tb.aqp
    public boolean a(boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a821d370", new Object[]{this, new Boolean(z)})).booleanValue() : !z;
    }
}
