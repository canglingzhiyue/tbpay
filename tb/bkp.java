package tb;

import com.alibaba.android.ultron.ext.vlayout.VirtualLayoutManager;
import com.alibaba.android.ultron.ext.vlayout.c;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* loaded from: classes2.dex */
public class bkp extends bnn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public VirtualLayoutManager f25955a;

    static {
        kge.a(1372680553);
        kge.a(766180776);
    }

    public bkp(bny bnyVar, VirtualLayoutManager virtualLayoutManager) {
        super(bnyVar);
        this.f25955a = virtualLayoutManager;
    }

    public void a(List<c> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else {
            this.f25955a.a(list);
        }
    }
}
