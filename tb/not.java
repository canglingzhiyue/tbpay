package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.meta.data.a;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.search.refactor.g;
import com.taobao.search.refactor.j;
import com.taobao.search.sf.datasource.c;
import kotlin.TypeCastException;
import kotlin.jvm.internal.q;
import tb.nwg;

/* loaded from: classes7.dex */
public final class not implements nwg.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final BaseCellBean f31614a;
    private final boolean b;
    private final c c;
    private final g d;

    static {
        kge.a(1849500649);
        kge.a(231191224);
    }

    public not(BaseCellBean cellBean, boolean z, c dataSource, g controller) {
        q.c(cellBean, "cellBean");
        q.c(dataSource, "dataSource");
        q.c(controller, "controller");
        this.f31614a = cellBean;
        this.b = z;
        this.c = dataSource;
        this.d = controller;
    }

    @Override // tb.nwg.b
    public ListStyle a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ListStyle) ipChange.ipc$dispatch("88014f65", new Object[]{this}) : this.b ? ListStyle.LIST : ListStyle.WATERFALL;
    }

    @Override // tb.nwg.b
    public nwh b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nwh) ipChange.ipc$dispatch("16ba169e", new Object[]{this});
        }
        nwh L = this.c.L();
        q.a((Object) L, "dataSource.negativeFeedbackReportManager");
        return L;
    }

    @Override // tb.nwg.b
    public void a(BaseCellBean newCell, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4793309", new Object[]{this, newCell, new Integer(i)});
            return;
        }
        q.c(newCell, "newCell");
        a aVar = this.f31614a.combo;
        if (aVar == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.taobao.search.refactor.ns.NSCombo");
        }
        ((noz) aVar).a(this.f31614a, newCell);
        g gVar = this.d;
        c cVar = this.c;
        if (cVar == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.taobao.search.refactor.MSDataSource");
        }
        com.taobao.android.meta.structure.childpage.g d = gVar.d((g) ((j) cVar));
        if (d == null) {
            return;
        }
        d.n();
    }
}
