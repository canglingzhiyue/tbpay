package tb;

import com.alibaba.android.ultron.vfw.instance.d;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.datamodel.imp.b;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public class hzl extends bot {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private hzj b;

    static {
        kge.a(835435173);
    }

    public static /* synthetic */ Object ipc$super(hzl hzlVar, String str, Object... objArr) {
        if (str.hashCode() == 92025819) {
            super.a((List) objArr[0], (bnv) objArr[1], (b) objArr[2]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public hzl(d.c cVar, hzj hzjVar) {
        super(cVar);
        this.b = hzjVar;
    }

    @Override // tb.bot, com.alibaba.android.ultron.vfw.instance.d.c
    public void a(List<IDMComponent> list, bnv bnvVar, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57c33db", new Object[]{this, list, bnvVar, bVar});
            return;
        }
        super.a(list, bnvVar, bVar);
        if (list == null || bnvVar == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (IDMComponent iDMComponent : bnvVar.f()) {
            if (iDMComponent != null && iDMComponent.getFields() != null) {
                hzj hzjVar = this.b;
                if (hzjVar != null) {
                    hzjVar.a(iDMComponent, arrayList);
                } else {
                    bos.a(iDMComponent, arrayList);
                }
            }
        }
        bnvVar.b(arrayList);
    }
}
