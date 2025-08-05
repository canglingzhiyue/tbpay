package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes5.dex */
public class ggb extends ggk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1831646775);
    }

    public ggb() {
    }

    public ggb(int i) {
        a((short) 1);
        this.f28317a = new ggr(i);
    }

    @Override // tb.ggk
    public ggk a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ggk) ipChange.ipc$dispatch("f0506f3", new Object[]{this});
        }
        ggb ggbVar = new ggb();
        a(ggbVar);
        return ggbVar;
    }
}
