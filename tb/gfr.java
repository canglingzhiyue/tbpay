package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes5.dex */
public class gfr extends ggk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-842889726);
    }

    public gfr() {
    }

    public gfr(boolean z) {
        a((short) 15);
        this.f28317a = new ggo(z);
    }

    @Override // tb.ggk
    public ggk a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ggk) ipChange.ipc$dispatch("f0506f3", new Object[]{this});
        }
        gfr gfrVar = new gfr();
        a(gfrVar);
        return gfrVar;
    }
}
