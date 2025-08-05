package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.search.refactor.g;
import com.taobao.search.refactor.j;
import com.taobao.search.sf.datasource.c;
import tb.nwg;

/* loaded from: classes7.dex */
public class nou implements nwg.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private c f31615a;
    private BaseCellBean b;
    private g c;

    static {
        kge.a(2078586585);
        kge.a(231191224);
    }

    public nou(c cVar, BaseCellBean baseCellBean, g gVar) {
        this.f31615a = cVar;
        this.b = baseCellBean;
        this.c = gVar;
    }

    @Override // tb.nwg.b
    public ListStyle a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ListStyle) ipChange.ipc$dispatch("88014f65", new Object[]{this}) : this.f31615a.getUIListStyle();
    }

    @Override // tb.nwg.b
    public nwh b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (nwh) ipChange.ipc$dispatch("16ba169e", new Object[]{this}) : this.f31615a.L();
    }

    @Override // tb.nwg.b
    public void a(BaseCellBean baseCellBean, int i) {
        BaseCellBean baseCellBean2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4793309", new Object[]{this, baseCellBean, new Integer(i)});
        } else if (this.f31615a.isMetaMode()) {
            if (this.c == null || (baseCellBean2 = this.b) == null || baseCellBean2.combo == null) {
                return;
            }
            this.b.combo.a(this.b, baseCellBean);
            com.taobao.android.meta.structure.childpage.g d = this.c.d((g) ((j) this.f31615a));
            if (d == null) {
                return;
            }
            d.n();
        } else {
            this.f31615a.replaceCellToTotal(baseCellBean, i);
        }
    }
}
