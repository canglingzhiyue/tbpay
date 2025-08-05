package tb;

import android.app.Activity;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseTypedBean;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.search.searchdoor.sf.widgets.activate.data.bean.MuiseActivateCellBean;
import com.taobao.search.searchdoor.sf.widgets.activate.data.bean.WeexActivateCellBean;
import com.taobao.search.searchdoor.sf.widgets.e;
import java.util.ArrayList;
import java.util.List;
import tb.itb;

/* loaded from: classes7.dex */
public abstract class nqy<MODEL extends e, BEAN> extends isz<MODEL> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final ArrayList<BEAN> b;

    static {
        kge.a(1102738738);
    }

    @Override // tb.isz
    public /* synthetic */ itd a(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (itd) ipChange.ipc$dispatch("2329b686", new Object[]{this, viewGroup}) : c(viewGroup);
    }

    public nqy(itb itbVar, ListStyle listStyle, Activity activity, ium iumVar, MODEL model) {
        super(itbVar, listStyle, activity, iumVar, 0, model);
        this.b = new ArrayList<>();
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue() : this.b.size();
    }

    @Override // tb.isz
    public Object a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("9da1ccf7", new Object[]{this, new Integer(i)});
        }
        if (i >= getItemCount()) {
            return null;
        }
        return this.b.get(i);
    }

    public List<? extends BEAN> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("627608df", new Object[]{this}) : this.b;
    }

    public void a(List<? extends BEAN> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else if (list == null) {
        } else {
            this.b.clear();
            this.b.addAll(list);
            notifyDataSetChanged();
        }
    }

    public void a(int i, BEAN bean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d36ff2b7", new Object[]{this, new Integer(i), bean});
        } else if (i < 0 || i > this.b.size()) {
        } else {
            this.b.add(i, bean);
            notifyItemInserted(i);
        }
    }

    public void b(int i, BEAN bean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf718196", new Object[]{this, new Integer(i), bean});
        } else if (this.b.size() <= 0) {
            a(i, (int) bean);
        } else if (i < 0 || i >= this.b.size()) {
        } else {
            this.b.set(i, bean);
            notifyItemChanged(i);
        }
    }

    public jzd c(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jzd) ipChange.ipc$dispatch("ba8b229", new Object[]{this, viewGroup});
        }
        itb.b bVar = new itb.b();
        bVar.f29303a = d();
        bVar.f = g();
        bVar.e = f();
        bVar.d = c();
        bVar.b = e();
        bVar.c = viewGroup;
        return nqn.CREATOR.a(bVar);
    }

    @Override // tb.isz
    public itd b(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (itd) ipChange.ipc$dispatch("9768eee5", new Object[]{this, viewGroup}) : new nqm(d(), e(), c(), viewGroup, f(), (e) g());
    }

    @Override // tb.isz
    public BaseTypedBean b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseTypedBean) ipChange.ipc$dispatch("f5482155", new Object[]{this, new Integer(i)});
        }
        Object a2 = a(i);
        if (a2 instanceof WeexActivateCellBean) {
            return ((WeexActivateCellBean) a2).weexBean;
        }
        if (!(a2 instanceof MuiseActivateCellBean)) {
            return null;
        }
        return ((MuiseActivateCellBean) a2).muiseBean;
    }

    @Override // tb.isz
    public boolean a(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a6251248", new Object[]{this, obj})).booleanValue() : obj instanceof WeexActivateCellBean;
    }

    @Override // tb.isz
    public boolean b(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f056ab89", new Object[]{this, obj})).booleanValue() : obj instanceof MuiseActivateCellBean;
    }
}
