package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.editionswitcher.g;
import com.taobao.android.trade.event.Event;
import com.taobao.android.trade.event.ThreadMode;
import com.taobao.android.trade.event.i;
import com.taobao.android.trade.event.j;
import com.taobao.homepage.utils.HomePageUtility;

/* loaded from: classes7.dex */
public class kxw implements j<Event> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final lbo f30386a;

    static {
        kge.a(-206028421);
        kge.a(-1453870097);
    }

    public kxw(lbo lboVar) {
        this.f30386a = lboVar;
    }

    @Override // com.taobao.android.trade.event.j
    public i handleEvent(Event event) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("caa7474e", new Object[]{this, event});
        }
        if (event == null) {
            lap.a("SearchBar", "handleEvent", "event为空");
            return i.FAILURE;
        }
        int eventId = event.getEventId();
        lap.a("SearchBar", "handleEvent", "event： " + eventId);
        if (eventId == 50001) {
            a();
        } else if (eventId != 50020) {
            switch (eventId) {
                case 50033:
                    c();
                    break;
                case 50034:
                    b();
                    break;
                case 50035:
                    f();
                    break;
            }
        } else {
            e();
        }
        return i.SUCCESS;
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        JSONObject d = HomePageUtility.d();
        ohv e = this.f30386a.e();
        if (e == null) {
            lap.a("SearchBar", "SearchBarRefreshSubscriber", "updateSearchBarByNewData searchBarManager == null");
            return;
        }
        String a2 = a(d);
        if (e.b() && !TextUtils.isEmpty(a2)) {
            e.a(b(d), true);
            lap.a("SearchBar", "SearchBarRefreshSubscriber", "updateSearchBarByNewData refreshSearchBox");
            return;
        }
        e.a(d);
        lap.a("SearchBar", "SearchBarRefreshSubscriber", "updateSearchBarByNewData setSearchSection");
    }

    private JSONObject b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("7b75e747", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            lap.a("SearchBar", "SearchBarRefreshSubscriber", "getSearchBoxData searchBarData == null");
            return null;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("subSection");
        if (jSONObject2 == null) {
            lap.a("SearchBar", "SearchBarRefreshSubscriber", "getSearchBoxData subSection == null");
            return null;
        }
        JSONObject jSONObject3 = jSONObject2.getJSONObject("home");
        if (jSONObject3 == null) {
            lap.a("SearchBar", "SearchBarRefreshSubscriber", "getSearchBoxData subSectionHome == null");
            return null;
        }
        JSONObject jSONObject4 = jSONObject3.getJSONObject("subSection");
        if (jSONObject4 == null) {
            lap.a("SearchBar", "SearchBarRefreshSubscriber", "getSearchBoxData homeSubSection == null");
            return null;
        }
        return jSONObject4.getJSONObject("searchBox");
    }

    private String a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("15c87a18", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            lap.a("SearchBar", "getPartialRefreshNode", "searchBarSection == null");
            return "";
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("ext");
        if (jSONObject2 == null) {
            lap.a("SearchBar", "getPartialRefreshNode", "ext == null");
            return "";
        }
        return jSONObject2.getString("refreshWidgetNode");
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.f30386a.y().p();
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            d();
        }
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else {
            d();
        }
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else {
            g.a(this.f30386a.a(), 1);
        }
    }

    @Override // com.taobao.android.trade.event.j
    public ThreadMode getThreadMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this}) : ThreadMode.MainThread;
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        ohv e = this.f30386a.e();
        if (e == null) {
            return;
        }
        lap.a("SearchBar", "updateSearchBar", null);
        e.a(HomePageUtility.d());
    }
}
