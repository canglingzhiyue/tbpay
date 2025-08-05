package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes6.dex */
public class jxr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1840851620);
    }

    public static void a(irr irrVar, ins insVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9e97691", new Object[]{irrVar, insVar});
        } else {
            a(irrVar, insVar, null);
        }
    }

    public static void a(irr irrVar, ins insVar, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f2c50d4", new Object[]{irrVar, insVar, map});
            return;
        }
        jxs jxsVar = new jxs(irrVar.getActivity(), irrVar, (iru) irrVar.getModel());
        jxsVar.a(map);
        if (insVar != null) {
            insVar.a(jxsVar);
        }
        irrVar.subscribeEvent(jxsVar);
        irrVar.subscribeScopeEvent(jxsVar, "childPageWidget");
        ((iru) irrVar.getModel()).d().subscribe(jxsVar);
    }
}
