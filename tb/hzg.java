package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.datamodel.imp.DMComponent;
import com.taobao.android.ultron.datamodel.imp.ExtendBlock;
import com.taobao.android.ultron.datamodel.imp.b;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes6.dex */
public class hzg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(10734218);
    }

    public static boolean a(b bVar) {
        Map<String, ExtendBlock> A;
        Collection<ExtendBlock> values;
        Iterator<ExtendBlock> it;
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f99a0b6", new Object[]{bVar})).booleanValue();
        }
        if (bVar == null || (A = bVar.A()) == null || (values = A.values()) == null || values.isEmpty() || (it = values.iterator()) == null) {
            return false;
        }
        while (true) {
            if (!it.hasNext()) {
                z = true;
                break;
            }
            ExtendBlock next = it.next();
            if (next != null && next.getExtendBlock() != null && !((DMComponent) next.getExtendBlock()).hasMore()) {
                z = false;
                break;
            }
        }
        hzy.a("ComponentBizUtils", "hasMore", "hasMore = " + z);
        return z;
    }
}
