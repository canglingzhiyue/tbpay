package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes5.dex */
public class ggf extends ggk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1683634692);
    }

    public ggf() {
    }

    public ggf(Long l) {
        a((short) 12);
        this.f28317a = new ggt(l, (short) 12);
    }

    @Override // tb.ggk
    public ggk a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ggk) ipChange.ipc$dispatch("f0506f3", new Object[]{this});
        }
        ggf ggfVar = new ggf();
        a(ggfVar);
        return ggfVar;
    }
}
