package tb;

import com.alibaba.android.ultron.engine.protocol.ComponentView;
import com.alibaba.android.ultron.engine.protocol.Container;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class bjj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1365621600);
    }

    public static Container a(bjp bjpVar) {
        bjh bjhVar;
        ComponentView i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Container) ipChange.ipc$dispatch("2e2452f8", new Object[]{bjpVar});
        }
        if (bjpVar.c()) {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, bjg> entry : bjpVar.d().c().entrySet()) {
                String key = entry.getKey();
                if ("insert".equals(entry.getValue().f25938a) && (bjhVar = bjpVar.d().e().get(key)) != null && (i = bjhVar.i()) != null) {
                    arrayList.add(i);
                }
            }
            Container container = new Container();
            container.data = arrayList;
            return container;
        }
        bjh a2 = bjpVar.a();
        ArrayList arrayList2 = new ArrayList();
        a(arrayList2, a2);
        Container container2 = new Container();
        container2.data = arrayList2;
        return container2;
    }

    private static void a(List<ComponentView> list, bjh bjhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("615f19a9", new Object[]{list, bjhVar});
            return;
        }
        ComponentView i = bjhVar.i();
        if (i != null) {
            list.add(i);
        }
        List<bjh> k = bjhVar.k();
        if (k == null || k.isEmpty()) {
            return;
        }
        for (bjh bjhVar2 : k) {
            a(list, bjhVar2);
        }
    }
}
