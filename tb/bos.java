package tb;

import com.alibaba.android.ultron.vfw.viewholder.BundleLineComponent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.List;

/* loaded from: classes2.dex */
public class bos {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-877421008);
    }

    public static void a(IDMComponent iDMComponent, List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc3e9cdd", new Object[]{iDMComponent, list});
        } else if (iDMComponent == null || list == null) {
        } else {
            String string = iDMComponent.getFields().getString("cornerType");
            if (!"both".equals(string) && !"top".equals(string)) {
                list.add(iDMComponent);
                return;
            }
            list.add(new BundleLineComponent());
            list.add(iDMComponent);
        }
    }
}
