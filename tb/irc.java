package tb;

import android.app.Activity;
import android.support.design.widget.CoordinatorLayout;
import android.support.v4.view.ViewPager;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.meta.data.MetaResult;
import com.taobao.android.searchbaseframe.business.srp.c;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.datasource.impl.a;

/* loaded from: classes6.dex */
public class irc extends irr<CoordinatorLayout, ire, ird, iru<? extends a<? extends BaseSearchResult, ?>>, Void> implements htk, irf, itl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2128435278);
        kge.a(-2139233431);
        kge.a(1191729677);
        kge.a(733709958);
    }

    @Override // tb.itl
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        }
    }

    @Override // tb.itl
    public void a(boolean z, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1901d4", new Object[]{this, new Boolean(z), new Float(f)});
        }
    }

    @Override // tb.iut
    public String getLogTag() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("55d7c1cd", new Object[]{this}) : "BaseSrpTabWidget";
    }

    @Override // tb.itl
    public com.taobao.android.searchbaseframe.meta.uikit.header.behavior.a h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.searchbaseframe.meta.uikit.header.behavior.a) ipChange.ipc$dispatch("26ed9943", new Object[]{this});
        }
        return null;
    }

    @Override // tb.itl
    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.itl
    public int j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5eb3fe4", new Object[]{this})).intValue();
        }
        return 0;
    }

    @Override // tb.iun
    public /* synthetic */ iuh d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (iuh) ipChange.ipc$dispatch("261b13ff", new Object[]{this}) : a();
    }

    @Override // tb.iun
    public /* synthetic */ iuj f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (iuj) ipChange.ipc$dispatch("357e5efb", new Object[]{this}) : b();
    }

    public irc(Activity activity, ium iumVar, iru<? extends a<? extends BaseSearchResult, ?>> iruVar, ViewGroup viewGroup, iur iurVar) {
        super(activity, iumVar, iruVar, viewGroup, iurVar);
    }

    public ird a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ird) ipChange.ipc$dispatch("f061823", new Object[]{this}) : ((c) c().m().b()).d.a(null);
    }

    public ire b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ire) ipChange.ipc$dispatch("16b7bda1", new Object[]{this}) : ((c) c().m().b()).b.a(null);
    }

    @Override // tb.htk
    public void a(MetaResult<? extends htg> metaResult, ViewPager viewPager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be0b43f3", new Object[]{this, metaResult, viewPager});
        } else {
            ((ird) K()).a(viewPager);
        }
    }

    @Override // tb.itl
    public void aG_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89b4c520", new Object[]{this});
        } else {
            ((CoordinatorLayout) getView()).setVisibility(0);
        }
    }

    @Override // tb.itl
    public void aH_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b699dbf", new Object[]{this});
        } else {
            ((CoordinatorLayout) getView()).setVisibility(8);
        }
    }
}
