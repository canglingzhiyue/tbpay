package tb;

import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.umf.datamodel.service.rule.a;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class bbg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2128926960);
    }

    public static a a(String str, AURARenderComponent aURARenderComponent, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("7a1088cf", new Object[]{str, aURARenderComponent, map});
        }
        a aVar = new a();
        aVar.f2839a = str;
        aVar.b = aURARenderComponent.key;
        aVar.c.f2137a = new HashMap();
        if (map != null) {
            aVar.c.f2137a.putAll(map);
        }
        aVar.d.f2137a = new HashMap();
        aVar.d.b = new HashMap();
        aVar.d.c = new HashMap();
        if (aURARenderComponent.data != null) {
            if (aURARenderComponent.data.fields != null) {
                aVar.d.f2137a.putAll(aURARenderComponent.data.fields);
            }
            if (aURARenderComponent.data.events != null) {
                aVar.d.b.putAll(aURARenderComponent.data.events);
            }
            if (aURARenderComponent.data.localFields != null) {
                aVar.d.c.putAll(aURARenderComponent.data.localFields);
            }
        }
        return aVar;
    }
}
