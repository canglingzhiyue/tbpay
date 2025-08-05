package tb;

import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.o;
import com.alibaba.android.umf.datamodel.b;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class brr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(6128556);
    }

    @Deprecated
    public static Map<String, Object> a(b bVar, AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("1c0e7b67", new Object[]{bVar, aURARenderComponent});
        }
        if (bVar == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(o.a.KEY_USER_CONTEXT_RENDER_COMPONENT, aURARenderComponent);
        hashMap.put(o.a.KEY_USER_CONTEXT_UMF_RUNTIME_CONTEXT, bVar);
        return hashMap;
    }
}
