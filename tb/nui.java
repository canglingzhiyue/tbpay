package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.r;
import com.taobao.search.searchdoor.activate.hotspot.b;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.q;
import tb.jvm;

/* loaded from: classes8.dex */
public final class nui implements nuh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final r f31771a = new r();

    static {
        kge.a(-466916756);
        kge.a(1769048620);
    }

    public nui() {
        this.f31771a.b(b.PRELOAD_KEY);
        this.f31771a.a("taobao://tbsearch_preload");
    }

    @Override // tb.nuh
    public void a(List<nuk> tasks) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, tasks});
            return;
        }
        q.c(tasks, "tasks");
        ArrayList arrayList = new ArrayList();
        for (nuk nukVar : tasks) {
            arrayList.add(new jvm.b(nukVar.a(), nukVar.c(), nukVar.b()));
        }
        b(arrayList);
    }

    private final void b(List<? extends jvm.b> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d39e1eda", new Object[]{this, list});
        } else {
            dpl.a().b(list, 10000L, this.f31771a);
        }
    }
}
