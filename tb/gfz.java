package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes5.dex */
public class gfz extends ggk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(26050486);
    }

    public gfz() {
        a((short) 17);
    }

    public gfz(float f) {
        a((short) 17);
        this.f28317a = new ggq(f);
    }

    @Override // tb.ggk
    public ggk a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ggk) ipChange.ipc$dispatch("f0506f3", new Object[]{this});
        }
        gfz gfzVar = new gfz();
        a(gfzVar);
        return gfzVar;
    }
}
