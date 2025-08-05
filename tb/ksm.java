package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import java.util.List;

/* loaded from: classes7.dex */
public class ksm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1436268753);
    }

    public static boolean a(List<SectionModel> list, kso ksoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("713cb966", new Object[]{list, ksoVar})).booleanValue();
        }
        if (list == null || ksoVar == null) {
            return false;
        }
        return (ksoVar.b == -1 || ksoVar.b >= ksoVar.f30290a) && list.size() > ksoVar.f30290a;
    }
}
