package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes5.dex */
public class ggg extends ggk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(765041206);
    }

    public ggg() {
    }

    public ggg(Map<String, Object> map) {
        a((short) 9);
        this.f28317a = new ggt(map, (short) 9);
    }

    @Override // tb.ggk
    public ggk a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ggk) ipChange.ipc$dispatch("f0506f3", new Object[]{this});
        }
        ggg gggVar = new ggg();
        a(gggVar);
        return gggVar;
    }
}
