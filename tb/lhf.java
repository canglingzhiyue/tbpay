package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public class lhf implements llf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final int f30600a;
    private final int b;

    static {
        kge.a(1048364526);
        kge.a(1396353375);
    }

    public lhf(int i, int i2) {
        this.f30600a = i;
        this.b = i2;
    }

    @Override // tb.llf
    public int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.f30600a;
    }

    @Override // tb.llf
    public int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.b;
    }
}
