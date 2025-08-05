package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.viewmodel.main.b;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class eqe {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-348615765);
        emu.a("com.taobao.android.detail.datasdk.utils.UltronDataUtils");
    }

    public static List<b> a(eox eoxVar, epk epkVar, List<IDMComponent> list, com.taobao.android.detail.datasdk.model.datamodel.node.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("2b287f82", new Object[]{eoxVar, epkVar, list, bVar});
        }
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                b a2 = eoxVar.a(list.get(i), bVar);
                if (a2 != null) {
                    arrayList.add(a2);
                }
            } catch (Throwable unused) {
            }
        }
        return epkVar != null ? epkVar.a(arrayList) : arrayList;
    }
}
