package tb;

import android.app.Activity;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.b;
import com.taobao.android.searchbaseframe.datasource.impl.BaseTypedBean;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.search.sf.a;
import com.taobao.search.sf.datasource.CommonSearchResult;
import com.taobao.search.sf.datasource.c;
import com.taobao.search.sf.widgets.list.listcell.baseauction.SFAuctionBaseCellBean;
import com.taobao.uikit.feature.view.TRecyclerView;
import java.util.Map;

/* loaded from: classes8.dex */
public abstract class nvx<BEAN extends SFAuctionBaseCellBean> extends itd<BEAN, a> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private long f31802a;

    static {
        kge.a(-970483382);
    }

    public static /* synthetic */ Object ipc$super(nvx nvxVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 107615098) {
            super.s();
            return null;
        } else if (hashCode != 108538619) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.t();
            return null;
        }
    }

    public Map<String, String> E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2171f781", new Object[]{this});
        }
        return null;
    }

    public Map<String, String> G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("bcc6bb03", new Object[]{this});
        }
        return null;
    }

    public nvx(View view, Activity activity, ium iumVar, ListStyle listStyle, int i, a aVar) {
        super(view, activity, iumVar, listStyle, i, aVar);
    }

    @Override // tb.itd
    public void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6782afb", new Object[]{this});
            return;
        }
        super.t();
        if (l() == 0) {
            return;
        }
        this.f31802a = System.currentTimeMillis();
        c d = j() != null ? j().d() : null;
        ntm.a((BaseCellBean) l(), ((SFAuctionBaseCellBean) l()).auctionBaseBean, ((SFAuctionBaseCellBean) l()).pageInfo, d, m(), G(), E());
        com.taobao.search.jarvis.c.a(((SFAuctionBaseCellBean) l()).auctionBaseBean, m(), d, this.itemView);
        if (d == null || !(getParent() instanceof b)) {
            return;
        }
        ((b) getParent()).a(m(), (BaseTypedBean) l(), (CommonSearchResult) d.getTotalSearchResult(), d);
    }

    @Override // tb.itd
    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a137a", new Object[]{this});
            return;
        }
        super.s();
        if (l() == 0) {
            return;
        }
        com.taobao.search.jarvis.c.a(((SFAuctionBaseCellBean) l()).auctionBaseBean, this.itemView);
        c d = j() != null ? j().d() : null;
        if (d == null || !(getParent() instanceof b)) {
            return;
        }
        ((b) getParent()).a(m(), (BaseTypedBean) l(), System.currentTimeMillis() - this.f31802a, (CommonSearchResult) d.getTotalSearchResult(), d);
    }

    public final int F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3eff1c0", new Object[]{this})).intValue();
        }
        try {
            return getLayoutPosition() - ((TRecyclerView) ((iny) getParent()).B()).getHeaderViewsCount();
        } catch (Throwable unused) {
            return getLayoutPosition();
        }
    }
}
