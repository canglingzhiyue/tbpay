package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.messagekit.base.d;
import com.taobao.tao.messagekit.base.monitor.b;
import java.util.List;

/* loaded from: classes8.dex */
public class omc extends oma {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private List<b> b;

    static {
        kge.a(-799001986);
    }

    public omc(List<b> list) {
        this.b = list;
    }

    @Override // tb.oma
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        for (b bVar : this.b) {
            d.a().h().b(bVar.a()).a(bVar);
        }
    }

    @Override // tb.oma
    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue();
        }
        return 2;
    }
}
