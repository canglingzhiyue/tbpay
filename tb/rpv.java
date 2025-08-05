package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes9.dex */
public class rpv extends rpn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(714271767);
    }

    @Override // tb.rpn
    public String getNodeType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("35374867", new Object[]{this}) : "tap_node";
    }
}
