package tb;

import android.app.Activity;
import android.graphics.Color;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.meta.data.MetaResult;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.datasource.impl.a;
import com.taobao.android.searchbaseframe.datasource.impl.bean.TabBean;
import com.taobao.android.xsearchplugin.muise.f;
import com.taobao.search.mmd.datasource.bean.SFPromotionBean;
import com.taobao.search.musie.tab.TbTabView;
import com.taobao.search.musie.tab.d;
import com.taobao.search.musie.tab.e;
import com.taobao.tao.Globals;
import com.taobao.tao.util.DensityUtil;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public class ntf extends ius<List<TabBean>, TbTabView, iru<? extends a<? extends BaseSearchResult, ?>>> implements com.taobao.search.musie.tab.a, htk, itl, nvk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final int f31748a;
    private static final int b;
    private static final int c;
    private static final int d;
    private static final int e;
    private static final int f;
    private final d g;
    private final d h;
    private final d i;
    private TbTabView j;
    private d k;
    private d l;
    private com.taobao.search.musie.tab.a m;
    private boolean n;

    public static /* synthetic */ Object ipc$super(ntf ntfVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.itl
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        }
    }

    @Override // tb.itl
    public void a(boolean z, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1901d4", new Object[]{this, new Boolean(z), new Float(f2)});
        }
    }

    @Override // tb.iut
    public String getLogTag() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("55d7c1cd", new Object[]{this}) : "NSTabWidget";
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

    public static /* synthetic */ TbTabView a(ntf ntfVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TbTabView) ipChange.ipc$dispatch("595824d3", new Object[]{ntfVar}) : ntfVar.j;
    }

    @Override // tb.iup, tb.iui
    public /* synthetic */ void bindWithData(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2491dd0", new Object[]{this, obj});
        } else {
            a((List) obj);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.taobao.search.musie.tab.TbTabView, android.view.View] */
    @Override // tb.ius
    public /* synthetic */ TbTabView onCreateView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("ebecba09", new Object[]{this}) : a();
    }

    static {
        kge.a(-1424519029);
        kge.a(-1153904934);
        kge.a(-608431992);
        kge.a(1191729677);
        kge.a(733709958);
        f31748a = DensityUtil.dip2px(Globals.getApplication(), 42.0f);
        b = DensityUtil.dip2px(Globals.getApplication(), 18.0f);
        c = DensityUtil.dip2px(Globals.getApplication(), 16.0f);
        d = Color.parseColor("#FF5500");
        e = Color.parseColor("#111111");
        f = DensityUtil.dip2px(Globals.getApplication(), 17.0f);
    }

    public ntf(Activity activity, ium iumVar, iru<? extends a<? extends BaseSearchResult, ?>> iruVar, ViewGroup viewGroup, iur iurVar) {
        super(activity, iumVar, iruVar, viewGroup, iurVar);
        this.g = new d.a().b(c).a(e).a();
        this.h = new d.a().b(c).a(-1).a();
        this.i = new d.a().b(b).a(d).a(true).a();
        this.k = this.g;
        this.l = this.i;
        this.n = false;
        nvj nvjVar = (nvj) getModel().e().b(nvj.CONFIG_KEY);
        if (nvjVar != null) {
            nvjVar.a(this);
        }
        if (b()) {
            this.k = this.h;
        }
    }

    public void a(List<TabBean> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else if (list == null || list.isEmpty()) {
            this.j.setVisibility(8);
        } else {
            ArrayList arrayList = new ArrayList(list.size());
            for (TabBean tabBean : list) {
                arrayList.add(new e(tabBean.showText));
            }
            this.j.setTabs(arrayList);
        }
    }

    public TbTabView a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TbTabView) ipChange.ipc$dispatch("cd6555c3", new Object[]{this});
        }
        this.j = new TbTabView(getActivity());
        this.j.setLayoutParams(new ViewGroup.LayoutParams(-1, f31748a));
        this.j.setFillViewport(true);
        this.j.setPadding(0, 0);
        this.j.setItemInset(f);
        this.j.setStyle(this.k, this.l);
        this.j.setTabClickListener(this);
        return this.j;
    }

    private boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        if (!(getActivity() instanceof f)) {
            return false;
        }
        return ((f) getActivity()).g();
    }

    @Override // com.taobao.search.musie.tab.a
    public void onTabClick(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75f7b8aa", new Object[]{this, new Integer(i)});
            return;
        }
        com.taobao.search.musie.tab.a aVar = this.m;
        if (aVar == null) {
            return;
        }
        aVar.onTabClick(i);
    }

    public void a(com.taobao.search.musie.tab.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e8768ae", new Object[]{this, aVar});
        } else {
            this.m = aVar;
        }
    }

    @Override // tb.nvk
    public void a(SFPromotionBean sFPromotionBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c019e54d", new Object[]{this, sFPromotionBean});
            return;
        }
        if (!b()) {
            this.k.a(sFPromotionBean.d);
        }
        this.l.a(sFPromotionBean.e);
        TbTabView tbTabView = this.j;
        if (tbTabView == null) {
            return;
        }
        tbTabView.setStyle(this.k, this.l);
    }

    @Override // tb.htk
    public void a(MetaResult<? extends htg> metaResult, final ViewPager viewPager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be0b43f3", new Object[]{this, metaResult, viewPager});
            return;
        }
        a(metaResult.getTabs());
        if (!this.n) {
            this.n = true;
            viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() { // from class: tb.ntf.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.support.v4.view.ViewPager.OnPageChangeListener
                public void onPageScrollStateChanged(int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i)});
                    }
                }

                @Override // android.support.v4.view.ViewPager.OnPageChangeListener
                public void onPageScrolled(int i, float f2, int i2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i), new Float(f2), new Integer(i2)});
                    }
                }

                @Override // android.support.v4.view.ViewPager.OnPageChangeListener
                public void onPageSelected(int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
                    } else {
                        ntf.a(ntf.this).setTabSelected(i);
                    }
                }
            });
            a(new com.taobao.search.musie.tab.a() { // from class: tb.ntf.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.search.musie.tab.a
                public void onTabClick(int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("75f7b8aa", new Object[]{this, new Integer(i)});
                    } else {
                        viewPager.setCurrentItem(i, true);
                    }
                }
            });
        }
        if (metaResult.getTabs() == null) {
            return;
        }
        int size = metaResult.getTabs().size();
        for (int i = 0; i < size; i++) {
            if (metaResult.getTabs().get(i).isSelected) {
                if (i <= 0) {
                    return;
                }
                viewPager.setCurrentItem(i, false);
                return;
            }
        }
    }

    @Override // tb.itl
    public void aG_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89b4c520", new Object[]{this});
        } else {
            ((TbTabView) getView()).setVisibility(0);
        }
    }

    @Override // tb.itl
    public void aH_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b699dbf", new Object[]{this});
        } else {
            ((TbTabView) getView()).setVisibility(8);
        }
    }
}
