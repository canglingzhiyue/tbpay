package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes5.dex */
public class ggi extends ggk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(257952431);
    }

    @Override // tb.ggk
    public /* synthetic */ ggk a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ggk) ipChange.ipc$dispatch("f0506f3", new Object[]{this}) : b();
    }

    public ggi() {
    }

    public ggi(String str) {
        a((short) 4);
        this.f28317a = new ggt(str, (short) 4);
    }

    public ggi b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ggi) ipChange.ipc$dispatch("16b6ac14", new Object[]{this});
        }
        ggi ggiVar = new ggi();
        a(ggiVar);
        return ggiVar;
    }
}
