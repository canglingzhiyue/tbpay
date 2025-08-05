package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.core.component.EmptyComponent;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.datamodel.imp.f;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public class hzh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1319718088);
    }

    public static boolean a(jny jnyVar) {
        List<IDMComponent> b;
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("efbcbb07", new Object[]{jnyVar})).booleanValue();
        }
        if (jnyVar == null || (b = jnyVar.b()) == null) {
            return false;
        }
        Iterator<IDMComponent> it = b.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            IDMComponent next = it.next();
            if (next != null) {
                String b2 = f.b(next);
                if (!"footer".equals(b2) && !"header".equals(b2)) {
                    z = true;
                    break;
                }
            }
        }
        if (z) {
            return false;
        }
        b.add(new EmptyComponent());
        return true;
    }
}
