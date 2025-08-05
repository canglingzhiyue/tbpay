package tb;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.meta.data.MetaResult;
import com.taobao.android.meta.structure.page.c;
import com.taobao.android.searchbaseframe.datasource.impl.bean.TabBean;
import java.util.List;

/* loaded from: classes6.dex */
public class ira extends iue<ire, irc> implements ird {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ise<Void, ira> CREATOR;

    /* renamed from: a  reason: collision with root package name */
    public List<TabBean> f29243a;

    public static /* synthetic */ Object ipc$super(ira iraVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    static {
        kge.a(-2109483398);
        kge.a(-1674712221);
        CREATOR = new ise<Void, ira>() { // from class: tb.ira.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.ise
            public ira a(Void r4) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (ira) ipChange.ipc$dispatch("228447bf", new Object[]{this, r4}) : new ira();
            }
        };
    }

    @Override // tb.iuh
    public void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        getWidget().attachToContainer();
        getIView().cZ_();
    }

    @Override // tb.ird
    public void a(ViewPager viewPager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2029c714", new Object[]{this, viewPager});
            return;
        }
        List<TabBean> list = null;
        if (viewPager.getAdapter() instanceof c) {
            list = ((MetaResult) ((iru) getWidget().getModel()).c().getTotalSearchResult()).getTabs();
        }
        this.f29243a = list;
        ire iView = getIView();
        if (list == null || list.size() == 0 || list.size() == 1) {
            iView.cZ_();
            return;
        }
        iView.a(viewPager, a(list));
        iView.d();
        iView.e();
    }

    @Override // tb.ird
    public TabBean a(TabLayout.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TabBean) ipChange.ipc$dispatch("899391ec", new Object[]{this, dVar});
        }
        if (dVar != null) {
            return a(dVar.d());
        }
        return null;
    }

    private TabBean a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TabBean) ipChange.ipc$dispatch("adeef353", new Object[]{this, new Integer(i)});
        }
        List<TabBean> list = this.f29243a;
        if (list != null && i < list.size()) {
            return this.f29243a.get(i);
        }
        return null;
    }

    public boolean a(List<TabBean> list) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c705295d", new Object[]{this, list})).booleanValue() : list.size() > 5;
    }
}
