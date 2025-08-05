package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.messagekit.base.monitor.b;
import java.util.List;

/* loaded from: classes8.dex */
public class oly extends oma {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private List<b> b;

    static {
        kge.a(1011020556);
    }

    public oly(List<b> list) {
        this.b = list;
    }

    @Override // tb.oma
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        List<b> list = this.b;
        if (list == null || list.size() <= 0) {
            return;
        }
        a(this.b.get(0).a()).a(this.b);
    }

    @Override // tb.oma
    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue();
        }
        return 5;
    }
}
