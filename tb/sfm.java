package tb;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.homepage.utils.HomePageUtility;
import com.taobao.homepage.utils.f;
import com.taobao.homepage.view.manager.lifecycle.listener.d;
import com.taobao.homepage.view.manager.searchbar.impl.bgview.HomeSearchBarBgView;
import com.taobao.homepage.view.manager.searchbar.impl.searchview.SearchBarView;
import com.taobao.homepage.view.widgets.bgcontainer.a;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.tao.Globals;
import com.taobao.tao.topmultitab.c;
import com.taobao.tao.util.DensityUtil;
import com.taobao.tao.util.SystemBarDecorator;
import com.taobao.taobao.R;

/* loaded from: classes7.dex */
public class sfm implements ohv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DEFAULT_SEARCHBAR_CONTAINER_HEIGHT = 77;
    public static final float STATUS_HEIGHT_DP_FLOAT;
    public static final int STATUS_HEIGHT_PX;
    public static final String S_ITEM = "item";

    /* renamed from: a  reason: collision with root package name */
    private ViewTreeObserver.OnGlobalLayoutListener f33523a;
    private final tgv b;
    private final lbq c;
    private final tgw d;
    private final tgu e;
    private final RelativeLayout f;
    private final law g;
    private d h;
    private int i;

    public static /* synthetic */ tgv a(sfm sfmVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (tgv) ipChange.ipc$dispatch("9612bca5", new Object[]{sfmVar}) : sfmVar.b;
    }

    public static /* synthetic */ tgw b(sfm sfmVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (tgw) ipChange.ipc$dispatch("7db49323", new Object[]{sfmVar}) : sfmVar.d;
    }

    public static /* synthetic */ void c(sfm sfmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dba83520", new Object[]{sfmVar});
        } else {
            sfmVar.r();
        }
    }

    public static /* synthetic */ void d(sfm sfmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca2b3ba1", new Object[]{sfmVar});
        } else {
            sfmVar.f();
        }
    }

    public static /* synthetic */ void e(sfm sfmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8ae4222", new Object[]{sfmVar});
        } else {
            sfmVar.j();
        }
    }

    static {
        kge.a(-744370045);
        kge.a(-1499684984);
        STATUS_HEIGHT_PX = SystemBarDecorator.getStatusBarHeight(Globals.getApplication());
        STATUS_HEIGHT_DP_FLOAT = f.a(Globals.getApplication(), STATUS_HEIGHT_PX);
    }

    public sfm(RelativeLayout relativeLayout, lbq lbqVar) {
        this.c = lbqVar;
        this.f = relativeLayout;
        this.i = relativeLayout.getHeight();
        this.g = a(lbqVar);
        this.b = new tgv(this.g, (HomeSearchBarBgView) relativeLayout.findViewById(R.id.search_bg_view));
        this.d = new tgw(this.g, (SearchBarView) relativeLayout.findViewById(R.id.search_view));
        this.e = new tgu((FrameLayout) relativeLayout.findViewById(R.id.multi_tab_container));
        a(this.g);
        k();
    }

    @Override // tb.ohv
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        g();
        l();
        this.e.a();
        this.d.a();
        this.b.a();
    }

    @Override // tb.ohv
    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.d.b();
    }

    @Override // tb.ohv
    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        lap.a("SearchBar", "refreshDxSearchBar", null);
        this.b.a(jSONObject);
        this.d.a(jSONObject);
        f();
        j();
        r();
        b(jSONObject);
    }

    @Override // tb.ohv
    public void a(float f, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c10357c", new Object[]{this, new Float(f), new Boolean(z)});
            return;
        }
        lap.a("SearchBar", "setD3BackgroundAlpha", "alpha: " + f + " forceSet: " + z);
        this.d.a(f, z);
    }

    @Override // tb.ohv
    public boolean e() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        if (sqg.i() && a.a()) {
            z = true;
        }
        lap.a("SearchBar", "isD3ClearSearchBar", "isD3ClearSearchBar: " + z);
        return z;
    }

    @Override // tb.ohv
    public int i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5dd2863", new Object[]{this})).intValue();
        }
        int measuredHeight = this.f.getMeasuredHeight();
        if (measuredHeight <= 0) {
            measuredHeight = com.taobao.homepage.utils.d.b("searchBarContainerHeight", DensityUtil.dip2px(this.f.getContext(), 77.0f) + STATUS_HEIGHT_PX);
        }
        lap.a("SearchBar", "getCurrentHeightPX", "currentHeightPX: " + measuredHeight);
        return measuredHeight;
    }

    @Override // tb.ohv
    @Deprecated
    public DXRootView a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXRootView) ipChange.ipc$dispatch("a106546f", new Object[]{this}) : this.d.c();
    }

    @Override // tb.ohv
    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
            return;
        }
        JSONObject d = HomePageUtility.d();
        if (d == null) {
            lap.a("SearchBar", "forceRefreshSearchBar", "searchBarSection == null");
            return;
        }
        SectionModel sectionModel = new SectionModel(d);
        sqg.a(sectionModel);
        a(sectionModel);
        lap.a("SearchBar", "forceRefreshSearchBar", "强制刷新搜索栏");
    }

    @Override // tb.ohv
    public void a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
        } else {
            this.f.setAlpha(f);
        }
    }

    @Override // tb.ohv
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        lap.a("SearchBar", "setSearchBarVisibility", "visibility: " + i);
        if (this.f.getVisibility() == i) {
            lap.a("SearchBar", "setSearchBarVisibility", "visibility 没变化");
        } else {
            this.f.setVisibility(i);
        }
    }

    @Override // tb.ohv
    public void a(JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a79284c", new Object[]{this, jSONObject, new Boolean(z)});
            return;
        }
        lap.a("SearchBar", "refreshSearchBox", "isFromHomeRequest: " + z);
        this.d.a(jSONObject, z);
    }

    @Override // tb.ohv
    public Object a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("17307540", new Object[]{this, str}) : this.d.a(str);
    }

    @Override // tb.ohv
    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
            return;
        }
        this.e.a(view);
        f();
        j();
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else if (!b(i())) {
        } else {
            c.a().aa();
            this.i = i();
        }
    }

    private void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        int i = i();
        if (!b(i)) {
            return;
        }
        boolean a2 = com.taobao.homepage.utils.d.a("searchBarContainerHeight", i);
        lap.a("SearchBar", "saveSearchBarContainerHeight", "isSaveSucceed: " + a2);
    }

    private boolean b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9d66c3e", new Object[]{this, new Integer(i)})).booleanValue();
        }
        lap.a("SearchBar", "updateTabViewPadding", "newSearchBarHeight: " + i + "mOldSearchContainerHeight: " + this.i);
        return i != this.i;
    }

    private void a(law lawVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f26e51f6", new Object[]{this, lawVar});
        } else if (lawVar == null) {
        } else {
            this.h = h();
            lawVar.o().a(this.h);
        }
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        law lawVar = this.g;
        if (lawVar == null || this.h == null) {
            return;
        }
        lawVar.o().b(this.h);
    }

    private d h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("96395e74", new Object[]{this}) : new d() { // from class: tb.sfm.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.homepage.view.manager.lifecycle.listener.d
            public void p() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("63fccf7", new Object[]{this});
                    return;
                }
                sfm.a(sfm.this).b();
                sfm.b(sfm.this).d();
                sfm.c(sfm.this);
            }
        };
    }

    private law a(lbq lbqVar) {
        lbo homePageManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (law) ipChange.ipc$dispatch("45460b47", new Object[]{this, lbqVar});
        }
        if (lbqVar != null && (homePageManager = lbqVar.getHomePageManager()) != null) {
            return homePageManager.y();
        }
        return null;
    }

    private void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
            return;
        }
        c a2 = c.a();
        JSONObject a3 = sqg.a(jSONObject);
        if (a3 == null) {
            return;
        }
        a2.b(a3.getJSONObject("item"));
    }

    private void r() {
        lbo homePageManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65bfbf9", new Object[]{this});
            return;
        }
        lbq lbqVar = this.c;
        if (lbqVar == null || (homePageManager = lbqVar.getHomePageManager()) == null || homePageManager.d() == null) {
            return;
        }
        homePageManager.d().c();
    }

    private void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        this.f33523a = m();
        this.f.getViewTreeObserver().addOnGlobalLayoutListener(this.f33523a);
    }

    private void l() {
        RelativeLayout relativeLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
        } else if (this.f33523a == null || (relativeLayout = this.f) == null) {
        } else {
            relativeLayout.getViewTreeObserver().removeOnGlobalLayoutListener(this.f33523a);
        }
    }

    private ViewTreeObserver.OnGlobalLayoutListener m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewTreeObserver.OnGlobalLayoutListener) ipChange.ipc$dispatch("7c7b13d0", new Object[]{this}) : new ViewTreeObserver.OnGlobalLayoutListener() { // from class: tb.sfm.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("df7e7eb3", new Object[]{this});
                    return;
                }
                lap.a("SearchBar", "onGlobalLayout", null);
                sfm.d(sfm.this);
                sfm.e(sfm.this);
            }
        };
    }
}
