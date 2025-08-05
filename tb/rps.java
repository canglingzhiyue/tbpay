package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes9.dex */
public class rps extends rpn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(451573494);
    }

    @Override // tb.rpn
    public String getNodeType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("35374867", new Object[]{this}) : "pv_node";
    }
}
