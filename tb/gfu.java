package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes5.dex */
public class gfu extends ggk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(512386671);
    }

    public gfu() {
        a((short) 3);
    }

    public gfu(double d) {
        a((short) 3);
        this.f28317a = new ggp(d);
    }

    @Override // tb.ggk
    public ggk a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ggk) ipChange.ipc$dispatch("f0506f3", new Object[]{this});
        }
        gfu gfuVar = new gfu();
        a(gfuVar);
        return gfuVar;
    }
}
