package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public class lhe implements llg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final llf f30599a;

    static {
        kge.a(1885711670);
        kge.a(-477758498);
    }

    public lhe(llf llfVar) {
        this.f30599a = llfVar;
    }

    @Override // tb.llg
    public llf a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (llf) ipChange.ipc$dispatch("f075ef8", new Object[]{this}) : this.f30599a;
    }
}
