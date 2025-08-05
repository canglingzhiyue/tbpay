package tb;

import com.alibaba.android.aura.service.event.AURAEventKey;
import com.alibaba.android.ultron.event.base.e;
import com.alibaba.android.ultron.vfw.instance.d;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.model.b;
import java.util.List;

/* loaded from: classes4.dex */
public class eus {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static final void a(IDMComponent iDMComponent, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23ab0a89", new Object[]{iDMComponent, dVar});
        } else {
            a("exposureFrameItem", iDMComponent, dVar);
        }
    }

    public static final void b(IDMComponent iDMComponent, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cb6560a", new Object[]{iDMComponent, dVar});
        } else {
            a(AURAEventKey.exposureItem, iDMComponent, dVar);
        }
    }

    private static final void a(String str, IDMComponent iDMComponent, d dVar) {
        List<b> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2bff253", new Object[]{str, iDMComponent, dVar});
        } else if (iDMComponent.getEventMap() != null && (list = iDMComponent.getEventMap().get(str)) != null) {
            if (iDMComponent.getExtMap() != null) {
                if (iDMComponent.getExtMap().get("exposureCount") != null) {
                    return;
                }
                iDMComponent.getExtMap().put("exposureCount", 1);
            }
            for (b bVar : list) {
                if (bVar != null) {
                    e a2 = dVar.d().a().a(bVar.getType());
                    a2.a(bVar);
                    a2.a(iDMComponent);
                    dVar.d().a(a2);
                }
            }
        }
    }
}
