package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes5.dex */
public class gga extends ggk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1716871904);
    }

    public gga() {
        a((short) 18);
    }

    public gga(Float f) {
        a((short) 18);
        this.f28317a = new ggt(f, (short) 18);
    }

    @Override // tb.ggk
    public ggk a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ggk) ipChange.ipc$dispatch("f0506f3", new Object[]{this});
        }
        gga ggaVar = new gga();
        a(ggaVar);
        return ggaVar;
    }
}
