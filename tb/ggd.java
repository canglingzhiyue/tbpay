package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* loaded from: classes5.dex */
public class ggd extends ggk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2009323196);
    }

    public ggd() {
    }

    public ggd(List<Object> list) {
        a((short) 8);
        this.f28317a = new ggt(list, (short) 8);
    }

    @Override // tb.ggk
    public ggk a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ggk) ipChange.ipc$dispatch("f0506f3", new Object[]{this});
        }
        ggd ggdVar = new ggd();
        a(ggdVar);
        return ggdVar;
    }
}
