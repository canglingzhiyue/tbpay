package tb;

import android.app.Activity;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.datasource.impl.BaseTypedBean;
import com.taobao.android.searchbaseframe.datasource.impl.a;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseCellBean;
import com.taobao.android.searchbaseframe.nx3.bean.WeexCellBean;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.android.weex_framework.MUSAppMonitor;
import tb.iru;

/* loaded from: classes6.dex */
public abstract class inv<MODEL extends iru<? extends a<? extends BaseSearchResult, ?>>> extends isz<MODEL> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private imn b;

    static {
        kge.a(-1330569870);
    }

    public static /* synthetic */ Object ipc$super(inv invVar, String str, Object... objArr) {
        if (str.hashCode() == -603323580) {
            super.a((itd) objArr[0], ((Number) objArr[1]).intValue());
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public abstract itd a(ipq ipqVar);

    public abstract itd b(ipq ipqVar);

    @Override // tb.isz, android.support.v7.widget.RecyclerView.Adapter
    public /* synthetic */ void onBindViewHolder(itd itdVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1071b8aa", new Object[]{this, itdVar, new Integer(i)});
        } else {
            a(itdVar, i);
        }
    }

    public inv(ListStyle listStyle, Activity activity, ium iumVar, MODEL model, int i) {
        super(iumVar.getCore().h(), listStyle, activity, iumVar, i, model);
        this.b = iumVar.getCore();
    }

    @Override // tb.isz
    public void a(itd itdVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc0a0344", new Object[]{this, itdVar, new Integer(i)});
            return;
        }
        super.a(itdVar, i);
        BaseTypedBean b = b(i);
        if (b.xsearchIsDowngrade) {
            MUSAppMonitor.a(b.xsearchDowngradeInfo, b.type, "");
        }
        ((iru) g()).e().b();
    }

    @Override // tb.isz
    public itd a(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (itd) ipChange.ipc$dispatch("2329b686", new Object[]{this, viewGroup});
        }
        ipq ipqVar = new ipq(d(), e(), (iru) g(), c(), f());
        ipqVar.a(viewGroup);
        return b(ipqVar);
    }

    @Override // tb.isz
    public itd b(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (itd) ipChange.ipc$dispatch("9768eee5", new Object[]{this, viewGroup});
        }
        ipq ipqVar = new ipq(d(), e(), (iru) g(), c(), f());
        ipqVar.a(viewGroup);
        return a(ipqVar);
    }

    @Override // tb.isz
    public Object a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("9da1ccf7", new Object[]{this, new Integer(i)});
        }
        BaseSearchResult baseSearchResult = (BaseSearchResult) ((iru) g()).d().getTotalSearchResult();
        if (baseSearchResult != null) {
            return baseSearchResult.getCell(i);
        }
        return null;
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        BaseSearchResult baseSearchResult = (BaseSearchResult) ((iru) g()).d().getTotalSearchResult();
        if (baseSearchResult != null) {
            return baseSearchResult.hasSections();
        }
        return false;
    }

    @Override // tb.isz
    public BaseTypedBean b(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BaseTypedBean) ipChange.ipc$dispatch("f5482155", new Object[]{this, new Integer(i)}) : (BaseTypedBean) a(i);
    }

    @Override // tb.isz
    public boolean a(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a6251248", new Object[]{this, obj})).booleanValue() : obj instanceof WeexCellBean;
    }

    @Override // tb.isz
    public boolean b(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f056ab89", new Object[]{this, obj})).booleanValue() : obj instanceof MuiseCellBean;
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        BaseSearchResult baseSearchResult = (BaseSearchResult) ((iru) g()).d().getTotalSearchResult();
        if (baseSearchResult != null && !baseSearchResult.isFailed()) {
            return baseSearchResult.getCellsCount();
        }
        return 0;
    }
}
