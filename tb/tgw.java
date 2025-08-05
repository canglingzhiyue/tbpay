package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.homepage.utils.HomePageUtility;
import com.taobao.homepage.utils.o;
import com.taobao.homepage.view.manager.searchbar.impl.searchview.SearchBarView;
import com.taobao.homepage.view.manager.searchbar.impl.searchview.b;
import com.taobao.homepage.view.manager.searchbar.impl.searchview.d;
import com.taobao.tao.topmultitab.c;

/* loaded from: classes7.dex */
public class tgw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final SearchBarView f34089a;
    private final d b;
    private final b c;

    static {
        kge.a(836394687);
    }

    public tgw(law lawVar, SearchBarView searchBarView) {
        this.f34089a = searchBarView;
        this.f34089a.setHomeLifeCycleManager(lawVar);
        this.b = new d();
        this.c = new b(lawVar, searchBarView);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.c.a();
        }
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.f34089a.isDX3SearchViewReady();
    }

    public DXRootView c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXRootView) ipChange.ipc$dispatch("26df272d", new Object[]{this}) : this.f34089a.getDX3SearchView();
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        laq c = laq.a().a("SearchBar").b("refreshDxSearchBar").c("SearchBarViewObserver.setSearchSection");
        if (c.a().a(jSONObject)) {
            lap.a("OverseaTopMultiTab", "SearchBarViewObserver", "发生单/多TAB热切，直接返回");
            return;
        }
        if (b(jSONObject)) {
            jSONObject = sqg.a();
            c.c("参数不合法，使用预置数据").c("使用预置数据");
        }
        if (!o.a(jSONObject.getJSONObject("template")).a()) {
            c.c("不支持dx3，使用预置数据;");
            jSONObject = sqg.a();
        }
        JSONObject a2 = this.b.a(jSONObject);
        this.f34089a.refreshDxSearchBarView(a2);
        this.c.a(a2);
        c.b();
    }

    public void a(JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a79284c", new Object[]{this, jSONObject, new Boolean(z)});
        } else {
            this.c.a(jSONObject, z);
        }
    }

    public Object a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("17307540", new Object[]{this, str});
        }
        JSONObject b = this.c.b();
        if (b != null) {
            return HomePageUtility.a(b, str);
        }
        return null;
    }

    public void a(float f, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c10357c", new Object[]{this, new Float(f), new Boolean(z)});
        } else {
            this.f34089a.setD3BackgroundAlpha(f, z);
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            this.f34089a.updateWhenFestivalChanged();
        }
    }

    private boolean b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("63b9982b", new Object[]{this, jSONObject})).booleanValue() : jSONObject == null || !sqv.a(jSONObject) || !jSONObject.containsKey("template") || sqg.a(jSONObject) == null;
    }
}
