package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public class sds extends lua implements sdm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1030008985);
        kge.a(1926717944);
    }

    public sds(lud ludVar) {
        super(ludVar);
    }

    @Override // tb.sdm
    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : e().q();
    }

    @Override // tb.sdm
    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : e().s();
    }
}
