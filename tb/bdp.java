package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.model.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class bdp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final bbz f25820a;
    private final bcb b;

    static {
        kge.a(-1884327445);
    }

    public bdp(bbz bbzVar) {
        this.f25820a = bbzVar;
        this.b = bbzVar.n();
    }

    public List<IDMComponent> a(List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b71fabce", new Object[]{this, list});
        }
        ArrayList arrayList = new ArrayList();
        if (list != null && !list.isEmpty()) {
            for (IDMComponent iDMComponent : list) {
                if ("header".equals(iDMComponent.getPosition()) || "footer".equals(iDMComponent.getPosition())) {
                    arrayList.add(iDMComponent);
                }
                if ("empty".equals(iDMComponent.getTag())) {
                    arrayList.add(iDMComponent);
                }
            }
        }
        return arrayList;
    }

    public List<IDMComponent> b(List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("2b5ee42d", new Object[]{this, list});
        }
        ArrayList arrayList = new ArrayList();
        if (list != null && !list.isEmpty()) {
            for (IDMComponent iDMComponent : list) {
                if ("header".equals(iDMComponent.getPosition()) || "footer".equals(iDMComponent.getPosition())) {
                    arrayList.add(iDMComponent);
                }
            }
        }
        return arrayList;
    }

    public void a(b bVar) {
        List<IDMComponent> a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("396016f7", new Object[]{this, bVar});
            return;
        }
        IDMComponent iDMComponent = null;
        if (bVar == null) {
            a2 = this.b.w().a(this.b.e());
        } else {
            a2 = bei.a(this.b, bVar);
        }
        if (a2 == null) {
            return;
        }
        Iterator<IDMComponent> it = a2.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            IDMComponent next = it.next();
            if ("empty".equals(next.getTag())) {
                iDMComponent = next;
                break;
            }
        }
        if (iDMComponent == null) {
            return;
        }
        iDMComponent.getData().put("status", (Object) "normal");
        this.f25820a.x().a(a(a2));
    }
}
