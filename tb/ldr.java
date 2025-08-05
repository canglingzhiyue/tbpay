package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class ldr implements lkk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ldq f30507a;

    static {
        kge.a(644791836);
        kge.a(-592549198);
    }

    @Override // tb.lkk
    public lkn a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lkn) ipChange.ipc$dispatch("f075c2f", new Object[]{this});
        }
        if (this.f30507a == null) {
            this.f30507a = new ldq();
        }
        return this.f30507a;
    }
}
