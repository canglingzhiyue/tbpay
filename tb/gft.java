package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes5.dex */
public class gft extends ggk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1041852995);
    }

    public gft() {
        a((short) 5);
    }

    public gft(String str) {
        a((short) 5);
        this.f28317a = new ggt(str, (short) 4);
    }

    @Override // tb.ggk
    public ggk a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ggk) ipChange.ipc$dispatch("f0506f3", new Object[]{this});
        }
        gft gftVar = new gft();
        a(gftVar);
        return gftVar;
    }
}
