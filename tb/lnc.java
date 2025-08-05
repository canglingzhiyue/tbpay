package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class lnc extends lna {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(912680722);
    }

    @Override // tb.lna
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "infoFlowBizParams_";
    }

    public lnc(String str) {
        super(str);
    }
}
