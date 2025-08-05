package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.DXResult;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.DXWidgetRefreshOption;
import com.taobao.android.riverlogger.RVLLevel;
import com.taobao.android.riverlogger.e;
import com.taobao.themis.kernel.container.ui.titlebar.c;
import com.taobao.themis.kernel.metaInfo.manifest.TabBar;
import com.taobao.themis.kernel.metaInfo.manifest.TabBarItem;
import com.taobao.themis.kernel.utils.n;
import com.taobao.themis.open.ability.calendar.TMSCalendarBridge;
import com.taobao.themis.utils.k;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.i;
import kotlin.jvm.internal.q;
import kotlin.t;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u001aH\u0017J\b\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u0016H\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0002J\b\u0010 \u001a\u00020!H\u0002J\b\u0010\"\u001a\u00020#H\u0016J\b\u0010$\u001a\u00020\bH\u0016J\b\u0010%\u001a\u00020\bH\u0002J\b\u0010&\u001a\u00020\u001cH\u0016J\b\u0010'\u001a\u00020\u0016H\u0016J\u0010\u0010(\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\bH\u0016J\u0010\u0010)\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\bH\u0017J\u0018\u0010*\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010+\u001a\u00020\u001c2\u0006\u0010,\u001a\u00020-H\u0016J\u0018\u0010.\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010/\u001a\u00020\u001fH\u0016J\u0010\u00100\u001a\u00020\u00162\u0006\u00101\u001a\u00020\u001fH\u0016J\u0010\u00102\u001a\u00020\u001c2\u0006\u00103\u001a\u000204H\u0016J\b\u00105\u001a\u00020\u001cH\u0016J\u0010\u00106\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\bH\u0016J\u0018\u00107\u001a\u00020\u001c2\u0006\u00108\u001a\u00020\b2\u0006\u00109\u001a\u00020\bH\u0016J\b\u0010:\u001a\u00020\u001cH\u0003R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006;"}, d2 = {"Lcom/taobao/themis/taobao/view/act/TMSActTabBar;", "Lcom/taobao/themis/kernel/container/ui/titlebar/ITabBar;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "contentRootView", "Landroid/widget/FrameLayout;", "currentSelectedIndex", "", "dxRootView", "Lcom/taobao/android/dinamicx/DXRootView;", "dxTemplateItem", "Lcom/taobao/android/dinamicx/template/download/DXTemplateItem;", "engine", "Lcom/taobao/android/dinamicx/DinamicXEngine;", "model", "Lcom/alibaba/fastjson/JSONObject;", "renderResult", "Lcom/taobao/android/dinamicx/DXResult;", "tapEventHandler", "Lcom/taobao/themis/taobao/view/act/DXHTapEventHandler;", "updateShadowSuccess", "", "addTabItem", "index", "tabBarItemModel", "Lcom/taobao/themis/kernel/metaInfo/manifest/TabBarItem;", "addTabItemShadow", "", "enableFixTabBarShadow", "getActTabBarTemplateUrl", "", "getActTabBarTemplateVersion", "", "getContentView", "Landroid/view/View;", "getHeight", "getTabNumber", "hideTabBar", "isGenericTabBar", "removeTabBarBadge", "removeTabItem", "replace", "setOnTabClickListener", DataReceiveMonitor.CB_LISTENER, "Lcom/taobao/themis/kernel/container/ui/titlebar/ITabBar$TabClickListener;", "setTabBarBadge", "text", "setTabBarMode", "mode", "setUp", "tabBar", "Lcom/taobao/themis/kernel/metaInfo/manifest/TabBar;", "showTabBar", "switchTo", "swizzleTab", "originIndex", "targetIndex", "updateView", "themis_taobao_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class tma implements c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final JSONObject f34206a;
    private DinamicXEngine b;
    private DXTemplateItem c;
    private DXRootView d;
    private DXResult<DXRootView> e;
    private tlz f;
    private FrameLayout g;
    private int h;
    private final Context i;
    private boolean j;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/taobao/themis/taobao/view/act/TMSActTabBar$setOnTabClickListener$1", "Lcom/taobao/themis/kernel/container/ui/titlebar/ITabBar$TabClickListener;", "onTabClick", "", "index", "", "themis_taobao_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a implements c.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c.a f34207a;

        public a(c.a aVar) {
            this.f34207a = aVar;
        }

        @Override // com.taobao.themis.kernel.container.ui.titlebar.c.a
        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            } else {
                this.f34207a.a(i);
            }
        }
    }

    static {
        kge.a(1942500370);
        kge.a(1289404388);
    }

    @Override // com.taobao.themis.kernel.container.ui.titlebar.c
    public boolean a(int i, String text) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("20f12ca9", new Object[]{this, new Integer(i), text})).booleanValue();
        }
        q.d(text, "text");
        return false;
    }

    @Override // com.taobao.themis.kernel.container.ui.titlebar.c
    public boolean a(String mode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, mode})).booleanValue();
        }
        q.d(mode, "mode");
        return false;
    }

    @Override // com.taobao.themis.kernel.container.ui.titlebar.c
    public boolean b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9d66c3e", new Object[]{this, new Integer(i)})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.themis.kernel.container.ui.titlebar.c
    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public tma(Context context) {
        q.d(context, "context");
        this.i = context;
        this.f34206a = new JSONObject();
        this.f = new tlz();
        this.g = new FrameLayout(this.i);
    }

    private final int e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[]{this})).intValue();
        }
        Object obj = this.f34206a.get("items");
        if (!(obj instanceof JSONArray)) {
            obj = null;
        }
        JSONArray jSONArray = (JSONArray) obj;
        if (jSONArray == null) {
            return 0;
        }
        return jSONArray.size();
    }

    @Override // com.taobao.themis.kernel.container.ui.titlebar.c
    public void a(TabBar tabBar) {
        DXTemplateItem dXTemplateItem;
        DXResult<DXRootView> dXResult;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b86b8f1b", new Object[]{this, tabBar});
            return;
        }
        q.d(tabBar, "tabBar");
        boolean z = !tabBar.getInvisible();
        this.f34206a.put((JSONObject) "background", "#FFFFFFFF");
        this.f34206a.put((JSONObject) "currentIndex", (String) 0);
        JSONArray jSONArray = new JSONArray();
        List<TabBarItem> items = tabBar.getItems();
        if (items != null) {
            for (TabBarItem tabBarItem : items) {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = jSONObject;
                jSONObject2.put((JSONObject) "iconNormal", tabBarItem.getIconNormal());
                jSONObject2.put((JSONObject) "iconSelected", tabBarItem.getIconSelected());
                jSONArray.add(jSONObject);
            }
        }
        this.f34206a.put((JSONObject) "items", (String) jSONArray);
        DinamicXEngine dinamicXEngine = new DinamicXEngine(new DXEngineConfig.a(TMSCalendarBridge.namespace).a());
        dinamicXEngine.a(34696035233L, this.f);
        t tVar = t.INSTANCE;
        this.b = dinamicXEngine;
        DinamicXEngine dinamicXEngine2 = this.b;
        if (dinamicXEngine2 != null) {
            DXTemplateItem dXTemplateItem2 = new DXTemplateItem();
            dXTemplateItem2.f11925a = "uniapp_act_tabbar";
            dXTemplateItem2.b = j();
            String k = k();
            if (!TextUtils.isEmpty(k)) {
                dXTemplateItem2.c = k;
            }
            t tVar2 = t.INSTANCE;
            dXTemplateItem = dinamicXEngine2.a(dXTemplateItem2);
        } else {
            dXTemplateItem = null;
        }
        this.c = dXTemplateItem;
        if (this.c == null) {
            e.a(RVLLevel.Error, "Themis/TMSActTabBar").a("fetchTemplate", (Object) "dxTemplateItem is null").a();
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("version is ");
        DXTemplateItem dXTemplateItem3 = this.c;
        sb.append(dXTemplateItem3 != null ? Long.valueOf(dXTemplateItem3.b) : null);
        sb.append(", url: ");
        DXTemplateItem dXTemplateItem4 = this.c;
        sb.append(dXTemplateItem4 != null ? dXTemplateItem4.c : null);
        e.a("Themis/TMSActTabBar", "fetchTemplate", sb.toString());
        DinamicXEngine dinamicXEngine3 = this.b;
        DXResult<DXRootView> b = dinamicXEngine3 != null ? dinamicXEngine3.b(this.i, this.c) : null;
        if (b == null) {
            e.a(RVLLevel.Error, "Themis/TMSActTabBar").a(ept.SUB_CREATE_VIEW, (Object) "createViewResult is null").a();
            return;
        }
        this.d = b.f11780a;
        DXRootView dXRootView = this.d;
        if (dXRootView == null) {
            e.a(RVLLevel.Error, "Themis/TMSActTabBar").a(ept.SUB_CREATE_VIEW, (Object) "dxRootView is null").a();
            return;
        }
        DinamicXEngine dinamicXEngine4 = this.b;
        if (dinamicXEngine4 == null) {
            e.a(RVLLevel.Error, "Themis/TMSActTabBar").a(ept.SUB_CREATE_VIEW, (Object) "engine is null").a();
            return;
        }
        if (dinamicXEngine4 == null || (dXResult = dinamicXEngine4.a(dXRootView, this.f34206a)) == null) {
            dXResult = null;
        } else {
            if (dXResult.b()) {
                e.a(RVLLevel.Error, "Themis/TMSActTabBar").a(ept.SUB_CREATE_VIEW, (Object) "renderResult is null").a();
            }
            t tVar3 = t.INSTANCE;
        }
        this.e = dXResult;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, k.a(this.i, 64));
        DXRootView dXRootView2 = this.d;
        if (dXRootView2 != null) {
            dXRootView2.setClipChildren(false);
            dXRootView2.setClipToPadding(false);
        }
        FrameLayout frameLayout = this.g;
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        if (!i()) {
            h();
        }
        layoutParams.bottomMargin = k.a(frameLayout.getContext(), 25.0f);
        frameLayout.addView(this.d, layoutParams);
        if (!z) {
            i = 8;
        }
        frameLayout.setVisibility(i);
    }

    @Override // com.taobao.themis.kernel.container.ui.titlebar.c
    public View a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("195fbaaa", new Object[]{this}) : this.g;
    }

    @Override // com.taobao.themis.kernel.container.ui.titlebar.c
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        int e = e();
        if (i < 0 || e <= i) {
            return;
        }
        this.f34206a.put((JSONObject) "currentIndex", (String) Integer.valueOf(i));
        this.h = i;
        f();
    }

    @Override // com.taobao.themis.kernel.container.ui.titlebar.c
    public void a(c.a listener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5e0c39a", new Object[]{this, listener});
            return;
        }
        q.d(listener, "listener");
        this.f.a(new a(listener));
    }

    @Override // com.taobao.themis.kernel.container.ui.titlebar.c
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.g.setVisibility(0);
        }
    }

    @Override // com.taobao.themis.kernel.container.ui.titlebar.c
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            this.g.setVisibility(8);
        }
    }

    @Override // com.taobao.themis.kernel.container.ui.titlebar.c
    public int d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue() : this.d != null ? 64 : 0;
    }

    @Override // com.taobao.themis.kernel.container.ui.titlebar.c
    public boolean a(int i, TabBarItem tabBarItemModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3e88f9", new Object[]{this, new Integer(i), tabBarItemModel})).booleanValue();
        }
        q.d(tabBarItemModel, "tabBarItemModel");
        int e = e();
        if (i >= 0 && e > i) {
            try {
                Object obj = this.f34206a.get("items");
                if (!(obj instanceof JSONArray)) {
                    obj = null;
                }
                JSONArray jSONArray = (JSONArray) obj;
                if (jSONArray != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("iconNormal", (Object) tabBarItemModel.getIconNormal());
                    jSONObject.put("iconSelected", (Object) tabBarItemModel.getIconSelected());
                    t tVar = t.INSTANCE;
                    jSONArray.set(i, jSONObject);
                    f();
                }
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @Override // com.taobao.themis.kernel.container.ui.titlebar.c
    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        int e = e();
        if (i < 0 || i2 < 0 || i >= e || i2 >= e) {
            return;
        }
        Object obj = this.f34206a.get("items");
        if (!(obj instanceof JSONArray)) {
            obj = null;
        }
        JSONArray jSONArray = (JSONArray) obj;
        if (jSONArray == null) {
            return;
        }
        Object obj2 = jSONArray.get(i);
        jSONArray.set(i, jSONArray.get(i2));
        jSONArray.set(i2, obj2);
        int i3 = this.h;
        if (i3 == i) {
            a(i2);
        } else if (i3 == i2) {
            a(i);
        } else {
            f();
        }
    }

    @Override // com.taobao.themis.kernel.container.ui.titlebar.c
    public boolean b(int i, TabBarItem tabBarItemModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c5b4297a", new Object[]{this, new Integer(i), tabBarItemModel})).booleanValue();
        }
        q.d(tabBarItemModel, "tabBarItemModel");
        Object obj = this.f34206a.get("items");
        if (!(obj instanceof JSONArray)) {
            obj = null;
        }
        JSONArray jSONArray = (JSONArray) obj;
        if (jSONArray == null || jSONArray.size() >= 5 || i < 0 || i > jSONArray.size()) {
            return false;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("iconNormal", (Object) tabBarItemModel.getIconNormal());
        jSONObject.put("iconSelected", (Object) tabBarItemModel.getIconSelected());
        t tVar = t.INSTANCE;
        jSONArray.add(i, jSONObject);
        int i2 = this.h;
        if (i <= i2) {
            i2++;
        }
        a(i2);
        return true;
    }

    @Override // com.taobao.themis.kernel.container.ui.titlebar.c
    public boolean c(int i) {
        JSONArray jSONArray;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab8b44dd", new Object[]{this, new Integer(i)})).booleanValue();
        }
        try {
            Object obj = this.f34206a.get("items");
            if (!(obj instanceof JSONArray)) {
                obj = null;
            }
            jSONArray = (JSONArray) obj;
        } catch (Exception unused) {
        }
        if (jSONArray == null || jSONArray.size() <= 2) {
            return false;
        }
        int e = e();
        if (i >= 0 && e > i) {
            jSONArray.mo1572remove(i);
            if (i < this.h) {
                i2 = this.h - 1;
            } else {
                i2 = this.h;
            }
            a(i2);
            return true;
        }
        return false;
    }

    private final void f() {
        DXWidgetNode expandWidgetNode;
        DXWidgetNode queryRootWidgetNode;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        DXRootView dXRootView = this.d;
        if (dXRootView != null && (expandWidgetNode = dXRootView.getExpandWidgetNode()) != null && (queryRootWidgetNode = expandWidgetNode.queryRootWidgetNode()) != null) {
            DXWidgetRefreshOption a2 = new DXWidgetRefreshOption.a().a(true).b(true).a(1).a();
            DinamicXEngine dinamicXEngine = this.b;
            if (dinamicXEngine != null) {
                dinamicXEngine.a(queryRootWidgetNode, 0, a2);
            }
        }
        if (this.j || !i()) {
            return;
        }
        DXRootView dXRootView2 = this.d;
        if (dXRootView2 != null && dXRootView2.getChildCount() == 2) {
            z = true;
        }
        this.j = z;
        e.a(RVLLevel.Error, "Themis/TMSActTabBar").a("updateShadow").a("updateShadowSuccess", Boolean.valueOf(this.j)).a();
        h();
    }

    private final void h() {
        t tVar;
        View childAt;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        try {
            Result.a aVar = Result.Companion;
            DXRootView dXRootView = this.d;
            if (dXRootView != null) {
                int childCount = dXRootView.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    DXRootView dXRootView2 = this.d;
                    if (dXRootView2 != null && (childAt = dXRootView2.getChildAt(i)) != null) {
                        childAt.setElevation(k.a(childAt.getContext(), 15.0f));
                    }
                }
                tVar = t.INSTANCE;
            } else {
                tVar = null;
            }
            Result.m2371constructorimpl(tVar);
        } catch (Throwable th) {
            Result.a aVar2 = Result.Companion;
            Result.m2371constructorimpl(i.a(th));
        }
    }

    private final boolean i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue() : n.b(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "enableFixTabBarShadow", (Boolean) true);
    }

    private final long j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5eb3fe5", new Object[]{this})).longValue() : n.b(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "actTabBarTemplateVersion", 6);
    }

    private final String k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f1302f6e", new Object[]{this}) : n.b(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "actTabBarTemplateUrl", "");
    }
}
