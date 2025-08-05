package tb;

import android.app.Activity;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.util.r;
import com.taobao.search.searchdoor.sf.widgets.SearchDoorContext;
import com.taobao.search.searchdoor.sf.widgets.activate.data.bean.ActivateTypedBean;
import com.taobao.search.searchdoor.sf.widgets.activate.data.bean.b;
import com.taobao.uikit.feature.view.TRecyclerView;
import java.util.List;

/* loaded from: classes7.dex */
public class nqf extends nqd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1454475819);
    }

    @Override // tb.nqd
    public void a(List<ActivateTypedBean> list, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85fa6ea5", new Object[]{this, list, bVar});
        }
    }

    public nqf(Activity activity, ium iumVar, SearchDoorContext searchDoorContext, ViewGroup viewGroup, iur iurVar) {
        super(activity, iumVar, searchDoorContext, viewGroup, iurVar);
    }

    @Override // tb.nqd
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (r.c()) {
        } else {
            a(this.f31639a.i(), this.f31639a.j(), this.f31639a.c());
        }
    }

    @Override // tb.nqd
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        if (this.f31639a.e()) {
            this.f31639a.b(true);
            onHistoryUpdated(this.b.b());
        } else {
            this.f31639a.b(false);
        }
        if (getView() == 0) {
            return;
        }
        ((TRecyclerView) getView()).setVisibility(0);
    }
}
