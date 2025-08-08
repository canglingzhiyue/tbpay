package tb;

import android.content.Context;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.bean.TabBean;
import com.taobao.android.searchbaseframe.uikit.NxTabLayout;
import com.taobao.android.xsearchplugin.muise.f;
import com.taobao.search.common.util.q;
import com.taobao.search.mmd.datasource.bean.SFPromotionBean;
import com.taobao.search.mmd.util.e;
import com.taobao.taobao.R;

/* loaded from: classes8.dex */
public class nxh extends iuf<TabLayout, ird> implements TabLayout.b, ire {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f31828a;
    private NxTabLayout b;
    private ViewPager c;
    private SFPromotionBean d;
    private String e = null;
    private String g = null;
    private SFPromotionBean h = null;

    static {
        kge.a(137886963);
        kge.a(-2053650166);
        kge.a(-1918434938);
    }

    public static /* synthetic */ Object ipc$super(nxh nxhVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.support.design.widget.TabLayout.b
    public void onTabReselected(TabLayout.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("802b1091", new Object[]{this, dVar});
        }
    }

    public static /* synthetic */ NxTabLayout a(nxh nxhVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (NxTabLayout) ipChange.ipc$dispatch("8645bef1", new Object[]{nxhVar}) : nxhVar.b;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.support.design.widget.TabLayout, java.lang.Object] */
    @Override // tb.iuj
    public /* synthetic */ TabLayout b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("43b9c269", new Object[]{this}) : a();
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [android.support.design.widget.TabLayout, java.lang.Object] */
    @Override // tb.iuj
    public /* synthetic */ TabLayout b(Context context, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c01d4bb4", new Object[]{this, context, viewGroup}) : a(context, viewGroup);
    }

    public TabLayout a(Context context, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TabLayout) ipChange.ipc$dispatch("511bdd2b", new Object[]{this, context, viewGroup});
        }
        this.b = (NxTabLayout) LayoutInflater.from(context).inflate(R.layout.tbsearch_nx_tab, viewGroup, false);
        this.b.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return this.b;
    }

    public TabLayout a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TabLayout) ipChange.ipc$dispatch("98141bf4", new Object[]{this}) : this.b;
    }

    @Override // tb.ire
    public void a(ViewPager viewPager, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e50fce40", new Object[]{this, viewPager, new Boolean(z)});
            return;
        }
        TabLayout a2 = a();
        a2.setTabMode(0);
        a2.addOnTabSelectedListener(this);
        a2.setupWithViewPager(viewPager);
        this.c = viewPager;
    }

    @Override // tb.ire
    public void cZ_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13ed4f6f", new Object[]{this});
        } else {
            this.b.setVisibility(8);
        }
    }

    @Override // tb.ire
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            this.b.setVisibility(0);
        }
    }

    @Override // tb.ire
    public void e() {
        TabBean a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        LayoutInflater from = LayoutInflater.from(this.b.getContext());
        boolean h = h();
        if (from == null) {
            return;
        }
        final int i = 0;
        for (int i2 = 0; i2 < this.b.getTabCount(); i2++) {
            TabLayout.d tabAt = this.b.getTabAt(i2);
            if (tabAt != null && (a2 = q().a(tabAt)) != null) {
                nxj nxjVar = new nxj(from, this.b.getContext(), ((iru) ((nxg) q()).getWidget().getModel()).f().getBooleanParam(noa.KEY_SEARCH_ELDER_HOME_OPEN));
                tabAt.a(nxjVar);
                tabAt.a((View) nxjVar.f31830a);
                ViewGroup viewGroup = (ViewGroup) nxjVar.f31830a.getParent();
                viewGroup.setClipChildren(false);
                viewGroup.setClipToPadding(false);
                ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                if (layoutParams instanceof LinearLayout.LayoutParams) {
                    ((LinearLayout.LayoutParams) layoutParams).weight = 1.0f;
                }
                if ("img".equals(a2.showType)) {
                    a(a2, nxjVar);
                } else {
                    if (h) {
                        nxjVar.a(a2.showText, a2.isSelected ? this.d.e : -1);
                    } else {
                        nxjVar.a(a2.showText, a2.isSelected ? this.d.e : this.d.d);
                    }
                    nxjVar.a(a2.isSelected);
                }
                if (a2.isSelected) {
                    i = i2;
                }
            }
        }
        this.b.post(new Runnable() { // from class: tb.nxh.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                TabLayout.d tabAt2 = nxh.a(nxh.this).getTabAt(i);
                if (tabAt2 == null) {
                    return;
                }
                tabAt2.f();
            }
        });
    }

    private void a(TabBean tabBean, nxj nxjVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0e4a8b0", new Object[]{this, tabBean, nxjVar});
            return;
        }
        int i = tabBean.isSelected ? this.d.e : this.d.d;
        if (h()) {
            i = tabBean.isSelected ? this.d.e : -1;
        }
        if (!StringUtils.isEmpty(tabBean.templateImage)) {
            str = tabBean.templateImage;
            if (h()) {
                if (tabBean.isSelected) {
                    nxjVar.c.setColorFilter(i);
                } else {
                    nxjVar.c.clearColorFilter();
                }
            } else {
                nxjVar.c.setColorFilter(i);
            }
        } else {
            str = tabBean.isSelected ? tabBean.activeImage : tabBean.normalImage;
            nxjVar.a(tabBean.showText, i);
        }
        nxjVar.a(tabBean.isSelected);
        if (StringUtils.isEmpty(str)) {
            return;
        }
        nxjVar.a(str, tabBean.imageWidth, tabBean.imageHeight, tabBean.showText);
    }

    @Override // android.support.design.widget.TabLayout.b
    public void onTabSelected(TabLayout.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6b72ea4", new Object[]{this, dVar});
            return;
        }
        TabBean a2 = q().a(dVar);
        if (a2 == null) {
            q.b("MySrpTabView", "onTabSelected: fail to get tab bean");
            return;
        }
        a2.isSelected = true;
        this.f31828a = a2.param;
        if (!StringUtils.isEmpty(a2.bizName)) {
            e.a(a2.bizName);
        }
        if (((nxj) dVar.a()) == null) {
            return;
        }
        boolean h = h();
        SFPromotionBean sFPromotionBean = this.d;
        SFPromotionBean sFPromotionBean2 = this.h;
        if (sFPromotionBean2 != null) {
            sFPromotionBean = sFPromotionBean2;
        }
        for (int i = 0; i < this.b.getTabCount(); i++) {
            TabLayout.d tabAt = this.b.getTabAt(i);
            if (tabAt != null) {
                TabBean a3 = q().a(tabAt);
                nxj nxjVar = (nxj) tabAt.a();
                if (nxjVar != null) {
                    if ("img".equals(a3.showType)) {
                        a(a3, nxjVar);
                    } else {
                        if (h) {
                            nxjVar.a(a3.showText, a3.isSelected ? sFPromotionBean.e : -1);
                        } else {
                            nxjVar.a(a3.showText, a3.isSelected ? sFPromotionBean.e : sFPromotionBean.d);
                        }
                        nxjVar.a(a3.isSelected);
                    }
                }
            }
        }
    }

    @Override // android.support.design.widget.TabLayout.b
    public void onTabUnselected(TabLayout.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbd0156b", new Object[]{this, dVar});
            return;
        }
        TabBean a2 = q().a(dVar);
        if (a2 == null) {
            q.b("MySrpTabView", "onTabUnselected: fail to get tab bean");
            return;
        }
        a2.isSelected = false;
        nxj nxjVar = (nxj) dVar.a();
        if (nxjVar == null) {
            return;
        }
        if ("img".equals(a2.showType)) {
            a(a2, nxjVar);
            return;
        }
        nxjVar.a(a2.showText, this.d.d);
        nxjVar.a(a2.isSelected);
    }

    public void a(SFPromotionBean sFPromotionBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c019e54d", new Object[]{this, sFPromotionBean});
            return;
        }
        this.d = sFPromotionBean;
        if (this.h != null) {
            return;
        }
        b(this.d);
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        SFPromotionBean sFPromotionBean = new SFPromotionBean();
        sFPromotionBean.f19160a = 10001;
        sFPromotionBean.c = -1;
        sFPromotionBean.b = null;
        int color = this.f.getResources().getColor(R.color.tbsearch_srp_tab_text_unselected);
        int color2 = this.f.getResources().getColor(R.color.tbsearch_tab_selected);
        sFPromotionBean.d = color;
        sFPromotionBean.e = color2;
        this.h = sFPromotionBean;
        b(sFPromotionBean);
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        this.h = null;
        b(this.d);
    }

    private boolean h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue() : (this.b.getContext() instanceof f) && ((f) this.b.getContext()).g();
    }

    private void b(SFPromotionBean sFPromotionBean) {
        TabBean a2;
        nxj nxjVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c61db0ac", new Object[]{this, sFPromotionBean});
        } else if (sFPromotionBean != null) {
            boolean h = h();
            for (int i = 0; i < this.b.getTabCount(); i++) {
                TabLayout.d tabAt = this.b.getTabAt(i);
                if (tabAt != null && (a2 = q().a(tabAt)) != null && (nxjVar = (nxj) tabAt.a()) != null) {
                    if ("img".equals(a2.showType)) {
                        a(a2, nxjVar);
                    } else if (h) {
                        nxjVar.a(a2.showText, a2.isSelected ? sFPromotionBean.e : -1);
                    } else {
                        nxjVar.a(a2.showText, a2.isSelected ? sFPromotionBean.e : sFPromotionBean.d);
                    }
                }
            }
        }
    }
}
