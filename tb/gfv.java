package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes5.dex */
public class gfv extends ggk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1946976423);
    }

    public gfv() {
        a((short) 13);
    }

    public gfv(Double d) {
        a((short) 13);
        this.f28317a = new ggt(d, (short) 13);
    }

    @Override // tb.ggk
    public ggk a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ggk) ipChange.ipc$dispatch("f0506f3", new Object[]{this});
        }
        gfv gfvVar = new gfv();
        a(gfvVar);
        return gfvVar;
    }
}
