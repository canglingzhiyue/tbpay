package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.arch.flow.fatigue.a;
import com.taobao.bootimage.arch.flow.view.d;

/* loaded from: classes6.dex */
public class ssa extends sry {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1814935888);
    }

    @Override // tb.ssb
    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue();
        }
        return 105;
    }

    public ssa(sro sroVar, srk srkVar, a aVar, srw srwVar, d.a aVar2) {
        super(sroVar, srkVar, aVar, srwVar, aVar2);
    }

    @Override // tb.sry
    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        kej.a("2ARCH_DownLoadState", "handle: ");
        this.b.a(this.c, i2);
    }
}
