package tb;

import com.alibaba.android.ultron.vfw.instance.d;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.datamodel.imp.b;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class bor extends bot {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2086133986);
    }

    public static /* synthetic */ Object ipc$super(bor borVar, String str, Object... objArr) {
        if (str.hashCode() == 92025819) {
            super.a((List) objArr[0], (bnv) objArr[1], (b) objArr[2]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public bor(d.c cVar) {
        super(cVar);
    }

    @Override // tb.bot, com.alibaba.android.ultron.vfw.instance.d.c
    public void a(List<IDMComponent> list, bnv bnvVar, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57c33db", new Object[]{this, list, bnvVar, bVar});
            return;
        }
        super.a(list, bnvVar, bVar);
        if (list == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (IDMComponent iDMComponent : bnvVar.f()) {
            if (iDMComponent != null && iDMComponent.getFields() != null) {
                bos.a(iDMComponent, arrayList);
            }
        }
        bnvVar.b(arrayList);
    }
}
