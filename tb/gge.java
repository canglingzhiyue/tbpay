package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes5.dex */
public class gge extends ggk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1472778598);
    }

    public gge() {
    }

    public gge(long j) {
        a((short) 2);
        this.f28317a = new ggs(j);
    }

    @Override // tb.ggk
    public ggk a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ggk) ipChange.ipc$dispatch("f0506f3", new Object[]{this});
        }
        gge ggeVar = new gge();
        a(ggeVar);
        return ggeVar;
    }
}
