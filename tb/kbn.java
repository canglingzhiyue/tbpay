package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public class kbn implements kbi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(446799957);
        kge.a(2025623116);
    }

    @Override // tb.kbi
    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue();
        }
        return 1001;
    }
}
