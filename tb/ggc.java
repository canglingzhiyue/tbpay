package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes5.dex */
public class ggc extends ggk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(537339315);
    }

    public ggc() {
    }

    public ggc(Integer num) {
        a((short) 11);
        this.f28317a = new ggt(num, (short) 11);
    }

    @Override // tb.ggk
    public ggk a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ggk) ipChange.ipc$dispatch("f0506f3", new Object[]{this});
        }
        ggc ggcVar = new ggc();
        a(ggcVar);
        return ggcVar;
    }
}
