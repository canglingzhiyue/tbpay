package tb;

import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* loaded from: classes2.dex */
public class asu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1367826266);
    }

    public static void a(AURARenderComponent aURARenderComponent, List<AURARenderComponent> list, aqx<AURARenderComponent, Boolean> aqxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("566211ec", new Object[]{aURARenderComponent, list, aqxVar});
        } else if (aURARenderComponent == null) {
            hyw.a("WARNING_DO_FLAT", "rootRenderComponent is null");
        } else {
            a(aURARenderComponent, list, null, aqxVar, null);
        }
    }

    public static void a(AURARenderComponent aURARenderComponent, List<AURARenderComponent> list, List<AURARenderComponent> list2, aqx<AURARenderComponent, Boolean> aqxVar, aqx<AURARenderComponent, Boolean> aqxVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a1f5405", new Object[]{aURARenderComponent, list, list2, aqxVar, aqxVar2});
            return;
        }
        Boolean a2 = aqxVar.a(aURARenderComponent);
        if (a2 != null && a2.booleanValue()) {
            list.add(aURARenderComponent);
            return;
        }
        if (aqxVar2 != null && list2 != null && aqxVar2.a(aURARenderComponent).booleanValue()) {
            list2.add(aURARenderComponent);
        }
        List<AURARenderComponent> list3 = aURARenderComponent.children;
        if (list3 == null) {
            return;
        }
        for (AURARenderComponent aURARenderComponent2 : list3) {
            if (aURARenderComponent2 == null) {
                hyw.a("DO_FLAT_EXCEPTION", "childComponent is null");
            } else {
                a(aURARenderComponent2, list, list2, aqxVar, aqxVar2);
            }
        }
    }
}
