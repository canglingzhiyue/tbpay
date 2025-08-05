package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.messagekit.base.d;

/* loaded from: classes8.dex */
public class olz extends oma {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int b;

    static {
        kge.a(39115039);
    }

    public olz(int i) {
        this.b = i;
    }

    @Override // tb.oma
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        a(this.b).b();
        if (!d.a().h().a(this.b).c().b(null, omg.b)) {
            return;
        }
        a(this.b).f();
    }

    @Override // tb.oma
    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue();
        }
        return 1;
    }
}
