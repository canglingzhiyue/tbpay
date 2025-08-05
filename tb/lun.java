package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class lun extends lua implements lkg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-168401818);
        kge.a(-1554616187);
    }

    public lun(lud ludVar) {
        super(ludVar);
    }

    @Override // tb.lkg
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : e().l();
    }

    @Override // tb.lkg
    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : e().m();
    }
}
