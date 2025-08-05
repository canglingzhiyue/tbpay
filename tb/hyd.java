package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.bundle.ultron.view.DetailBundleLineComponent;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.List;

/* loaded from: classes6.dex */
public class hyd implements hzj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1598796764);
        kge.a(-1642766143);
    }

    @Override // tb.hzj
    public void a(IDMComponent iDMComponent, List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc3e9cdd", new Object[]{this, iDMComponent, list});
        } else if (iDMComponent == null || list == null) {
        } else {
            String string = iDMComponent.getFields().getString("cornerType");
            if ("both".equals(string) || "top".equals(string)) {
                list.add(new DetailBundleLineComponent());
                list.add(iDMComponent);
                return;
            }
            list.add(iDMComponent);
        }
    }
}
