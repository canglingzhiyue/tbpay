package tb;

import com.alibaba.android.ultron.vfw.instance.d;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.datamodel.imp.b;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class bot implements d.c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public d.c f26025a;

    static {
        kge.a(-1356029535);
        kge.a(-312919124);
    }

    public bot(d.c cVar) {
        this.f26025a = cVar;
    }

    @Override // com.alibaba.android.ultron.vfw.instance.d.c
    public void a(List<IDMComponent> list, bnv bnvVar, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57c33db", new Object[]{this, list, bnvVar, bVar});
            return;
        }
        d.c cVar = this.f26025a;
        if (cVar == null) {
            return;
        }
        cVar.a(list, bnvVar, bVar);
    }
}
