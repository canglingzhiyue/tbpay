package tb;

import android.content.Context;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.phone.wallet.spmtracker.Constant;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.util.i;
import com.taobao.homepage.utils.HomePageUtility;
import com.taobao.homepage.utils.b;
import com.taobao.tao.recommend4.manager.weex2.container.drawer.impl.NewScrollLogic;
import com.taobao.tao.recommend4.manager.weex2.container.drawer.impl.ScrollInterceptView;
import com.taobao.tao.recommend4.manager.weex2.container.drawer.impl.a;
import com.taobao.tao.recommend4.recyclerview.HomeChildRecyclerView;
import com.taobao.tao.recommend4.recyclerview.h;
import java.util.Map;
import java.util.Set;
import tb.otk;

/* loaded from: classes8.dex */
public class otl extends otk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Context f32396a;
    private ScrollInterceptView b;
    private LinearLayout c;
    private osd d;
    private RecyclerView e;
    private boolean f;
    private FrameLayout g;
    private boolean h;
    private boolean i;
    private boolean j;
    private int k;
    private boolean l;
    private boolean m;
    private a n;
    private long o;
    private boolean p;
    private final osc q;

    static {
        kge.a(-829695664);
    }

    public static /* synthetic */ Object ipc$super(otl otlVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1416936231:
                super.c(((Number) objArr[0]).intValue());
                return null;
            case 92838762:
                super.c();
                return null;
            case 1514279453:
                super.a((Map) objArr[0]);
                return null;
            case 1689867607:
                super.a((Set) objArr[0]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static /* synthetic */ int a(otl otlVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("19e022c5", new Object[]{otlVar, new Integer(i)})).intValue();
        }
        otlVar.k = i;
        return i;
    }

    public static /* synthetic */ ScrollInterceptView a(otl otlVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ScrollInterceptView) ipChange.ipc$dispatch("ecf4c67e", new Object[]{otlVar}) : otlVar.b;
    }

    public static /* synthetic */ void a(otl otlVar, NewScrollLogic.PullState pullState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99555551", new Object[]{otlVar, pullState});
        } else {
            otlVar.a(pullState);
        }
    }

    public static /* synthetic */ boolean a(otl otlVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("19e062a7", new Object[]{otlVar, new Boolean(z)})).booleanValue();
        }
        otlVar.i = z;
        return z;
    }

    public static /* synthetic */ boolean b(otl otlVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e716a0d6", new Object[]{otlVar})).booleanValue() : otlVar.h;
    }

    public static /* synthetic */ boolean c(otl otlVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d599a757", new Object[]{otlVar})).booleanValue() : otlVar.j;
    }

    public static /* synthetic */ boolean d(otl otlVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c41cadd8", new Object[]{otlVar})).booleanValue() : otlVar.i;
    }

    public static /* synthetic */ Context e(otl otlVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("3fd9a44d", new Object[]{otlVar}) : otlVar.f32396a;
    }

    public static /* synthetic */ int f(otl otlVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a122bac9", new Object[]{otlVar})).intValue() : otlVar.k;
    }

    public static /* synthetic */ osd g(otl otlVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (osd) ipChange.ipc$dispatch("20a1e64f", new Object[]{otlVar}) : otlVar.d;
    }

    public static /* synthetic */ void h(otl otlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e28c7d8", new Object[]{otlVar});
        } else {
            otlVar.g();
        }
    }

    public static /* synthetic */ void i(otl otlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cabce59", new Object[]{otlVar});
        } else {
            otlVar.h();
        }
    }

    public static /* synthetic */ RecyclerView j(otl otlVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView) ipChange.ipc$dispatch("7f5782aa", new Object[]{otlVar}) : otlVar.e;
    }

    public otl(Context context, otk.a aVar) {
        super(context, aVar);
        this.h = false;
        this.i = false;
        this.j = false;
        this.l = true;
        this.m = true;
        this.q = new osc() { // from class: tb.otl.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.osc
            public void a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                otl.h(otl.this);
                otl.i(otl.this);
            }

            @Override // tb.osc
            public void b() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                } else {
                    ksp.c("DrawerContainerCreator", "IRecommendCallback onError");
                }
            }
        };
        this.f32396a = context;
        this.n = new a();
        this.g = new FrameLayout(context);
        this.b = new ScrollInterceptView(context);
        this.c = new LinearLayout(context);
        this.c.setOrientation(1);
        this.c.addView(this.n.a(context));
        this.b.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.n.a(this.c);
        this.b.addView(this.c, new ViewGroup.LayoutParams(-1, -1));
        this.b.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: tb.otl.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("899df952", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
                } else if (i8 - i6 == i4 - i2 || otl.a(otl.this).getChildState() != 0) {
                } else {
                    otl.a(otl.this).moveChildTo(otl.a(otl.this).getDownStateOffset());
                }
            }
        });
        this.g.addView(this.b);
        this.b.setStateProvider(new ScrollInterceptView.a() { // from class: tb.otl.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.recommend4.manager.weex2.container.drawer.impl.ScrollInterceptView.a
            public boolean a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
                }
                if (!otl.b(otl.this)) {
                    return otl.this.f();
                }
                return false;
            }
        });
        this.b.setOffsetCallback(new ScrollInterceptView.b() { // from class: tb.otl.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.recommend4.manager.weex2.container.drawer.impl.ScrollInterceptView.b
            public void a(int i, int i2, int i3, int i4, int i5, float f) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("b020cc45", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Float(f)});
                } else if (!otl.c(otl.this) || !otl.d(otl.this)) {
                } else {
                    int a2 = (int) i.a(otl.e(otl.this), i2);
                    if (a2 != otl.f(otl.this)) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("y", (Object) Integer.valueOf(a2));
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("offset", (Object) jSONObject);
                        otl.this.a("dragging", jSONObject2);
                    }
                    otl.a(otl.this, a2);
                }
            }

            @Override // com.taobao.tao.recommend4.manager.weex2.container.drawer.impl.ScrollInterceptView.b
            public void a(NewScrollLogic.PullState pullState, NewScrollLogic.PullState pullState2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("722f4868", new Object[]{this, pullState, pullState2});
                    return;
                }
                otl.a(otl.this, true);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("oldState", (Object) pullState.toString());
                jSONObject.put("newState", (Object) pullState2.toString());
                otl.this.a("pullchanged", jSONObject);
                otl.a(otl.this, pullState2);
                if (otl.g(otl.this) == null) {
                    return;
                }
                otl.g(otl.this).a(pullState, pullState2);
            }

            @Override // com.taobao.tao.recommend4.manager.weex2.container.drawer.impl.ScrollInterceptView.b
            public void a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                } else {
                    otl.this.a("dismiss", new JSONObject());
                }
            }
        });
    }

    @Override // tb.otk
    public void a(Set<String> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64b95557", new Object[]{this, set});
            return;
        }
        super.a(set);
        this.j = set.contains("dragging");
    }

    @Override // tb.otk
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        super.c();
        ScrollInterceptView scrollInterceptView = this.b;
        if (scrollInterceptView != null) {
            scrollInterceptView.destroy();
        }
        osd osdVar = this.d;
        if (osdVar == null) {
            return;
        }
        osdVar.e();
    }

    public boolean f() {
        View childAt;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue();
        }
        RecyclerView recyclerView = this.e;
        return (recyclerView == null || (childAt = recyclerView.getLayoutManager().getChildAt(0)) == null || this.e.getChildViewHolder(childAt).getLayoutPosition() != 0) ? false : true;
    }

    @Override // tb.otk
    public View a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("195fbaaa", new Object[]{this}) : this.g;
    }

    @Override // tb.otk
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        com.taobao.tao.linklog.a.a("recommendWeex", "DrawerContainerCreator", "setBizParams : " + str);
        try {
            c(str);
        } catch (Throwable unused) {
            ksr.b("weexSetBizParamsError", "1.0", "weexSetBizParamsError", "weexSetBizParamsError", null, null);
            ksp.c("DrawerContainerCreator", "parseBizParamsAndPerform error params :" + str);
        }
    }

    @Override // tb.otk
    public void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            return;
        }
        super.a(map);
        if (map == null) {
            return;
        }
        if (map.get("enable-close-enter-anim") != null) {
            this.b.closeEnterAnim("true".equals(map.get("enable-close-enter-anim")));
        } else if (map.get("enable-enter-anim-duration") == null) {
        } else {
            try {
                this.b.setEnterAnimDuration(Integer.parseInt(map.get("enable-enter-anim-duration")));
            } catch (Exception unused) {
            }
        }
    }

    @Override // tb.otk
    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            this.b.setTargetHeight(str);
        }
    }

    @Override // tb.otk
    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else {
            this.b.setFlyChildDuration(i);
        }
    }

    @Override // tb.otk
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.b.setSwitchScrollClose(z);
        }
    }

    @Override // tb.otk
    public void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
            return;
        }
        this.o = j;
        this.p = a(this.d, j);
    }

    @Override // tb.otk
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        com.taobao.tao.linklog.a.a("recommendWeex", "DrawerContainerCreator", Constant.KEY_PAGEBACK);
        osd osdVar = this.d;
        if (osdVar == null) {
            return;
        }
        osdVar.a((Map<String, Object>) null);
    }

    @Override // tb.otk
    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
            return;
        }
        super.c(i);
        if (this.d == null) {
            return;
        }
        if (!b.b() && !b.c()) {
            return;
        }
        this.d.b(i);
    }

    @Override // tb.otk
    public void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad401d78", new Object[]{this, new Integer(i)});
        } else {
            this.b.updateWindowMoveY(i);
        }
    }

    private boolean a(Context context, ksk kskVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("83c72bf1", new Object[]{this, context, kskVar})).booleanValue();
        }
        if (this.d != null) {
            return false;
        }
        try {
            this.d = osd.a(kskVar);
        } catch (Throwable unused) {
            ksp.c("DrawerContainerCreator", "RecommendContainer.newInstance error");
        }
        osd osdVar = this.d;
        if (osdVar != null) {
            osdVar.a(b());
            this.d.a(this.q);
            if (this.e == null) {
                this.e = this.d.a(context);
                this.e.setBackgroundColor(0);
            }
            if (this.f && (this.e.getAdapter() instanceof h)) {
                ((h) this.e.getAdapter()).b(0);
            }
            if (!this.p) {
                a(this.d, this.o);
            }
        }
        g();
        return true;
    }

    private boolean a(osd osdVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("17ba91f0", new Object[]{this, osdVar, new Long(j)})).booleanValue();
        }
        if (osdVar == null) {
            ksp.c("DrawerContainerCreator", "recommendContainer == null");
            return false;
        }
        otc a2 = osdVar.a();
        if (a2 == null) {
            ksp.c("DrawerContainerCreator", "recommendLifeCycleReport == null");
            return false;
        }
        a2.a(j);
        return true;
    }

    private void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            JSONObject parseObject = JSON.parseObject(str);
            ksk b = ksk.b(parseObject.getString("channel"));
            if (b == null) {
                ksp.c("DrawerContainerCreator", "containerType is null");
                return;
            }
            String string = parseObject.getString("api");
            String string2 = parseObject.getString("version");
            String string3 = parseObject.getString("queryParams");
            this.f = HomePageUtility.a(parseObject.getString("showLoading"));
            Map<String, Object> map = null;
            try {
                if (!TextUtils.isEmpty(string3)) {
                    map = (Map) JSON.parseObject(string3, Map.class);
                }
            } catch (Throwable unused) {
                ksp.c("DrawerContainerCreator", "queryParamsStr parse error , queryParamsStr :" + string3);
            }
            a(b, string, string2, map);
        }
    }

    private void a(ksk kskVar, String str, String str2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41fb8ddc", new Object[]{this, kskVar, str, str2, map});
        } else if (kskVar == null) {
        } else {
            if (!a(this.f32396a, kskVar) && kskVar == ksk.REC_FAVORITE) {
                return;
            }
            a(new ksn(str, str2), map);
        }
    }

    private void a(ksn ksnVar, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("474d4c33", new Object[]{this, ksnVar, map});
        } else if (this.d == null) {
        } else {
            JSONObject jSONObject = null;
            if (map != null) {
                try {
                    jSONObject = JSONObject.parseObject(JSON.toJSONString(map));
                } catch (Exception e) {
                    e.printStackTrace();
                    return;
                }
            }
            this.d.a(ksnVar, jSONObject);
        }
    }

    private void g() {
        LinearLayout linearLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else if (this.d == null || (linearLayout = this.c) == null || this.e == null) {
        } else {
            if (linearLayout.getChildCount() == 1) {
                ViewGroup.LayoutParams layoutParams = this.e.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = -1;
                    this.e.setLayoutParams(layoutParams);
                } else {
                    this.e.setLayoutParams(new RecyclerView.LayoutParams(-1, -1));
                }
                if (this.e.getParent() != null) {
                    ((ViewGroup) this.e.getParent()).removeView(this.e);
                }
                this.c.addView(this.e);
                a(this.e);
            }
            this.e.setVisibility(0);
            this.e.getAdapter().notifyDataSetChanged();
            this.e.post(new Runnable() { // from class: tb.otl.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    otl.j(otl.this).invalidateItemDecorations();
                    ((HomeChildRecyclerView) otl.j(otl.this)).onScrolledByNestedParent(null);
                }
            });
        }
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("rendertime", (Object) String.valueOf(System.currentTimeMillis()));
        jSONObject.put("optimizeType", (Object) opr.b());
        a("infoflowrendered", jSONObject);
    }

    private void a(final RecyclerView recyclerView) {
        ViewParent b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46606596", new Object[]{this, recyclerView});
        } else if (!(recyclerView instanceof HomeChildRecyclerView) || (b = b(recyclerView)) == null || !(b instanceof CoordinatorLayout)) {
        } else {
            View childAt = ((CoordinatorLayout) b).getChildAt(0);
            if (!(childAt instanceof AppBarLayout)) {
                return;
            }
            ((AppBarLayout) childAt).addOnOffsetChangedListener(new AppBarLayout.a() { // from class: tb.otl.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.support.design.widget.AppBarLayout.a
                public void onOffsetChanged(AppBarLayout appBarLayout, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f4cc97e1", new Object[]{this, appBarLayout, new Integer(i)});
                    } else {
                        ((HomeChildRecyclerView) recyclerView).onScrolledByNestedParent(null);
                    }
                }
            });
        }
    }

    private ViewParent b(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewParent) ipChange.ipc$dispatch("c5c6ee8f", new Object[]{this, recyclerView});
        }
        if (recyclerView == null) {
            return null;
        }
        for (ViewParent parent = recyclerView.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof CoordinatorLayout) {
                return parent;
            }
        }
        return null;
    }

    private void a(NewScrollLogic.PullState pullState) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d7ada68", new Object[]{this, pullState});
        } else if (this.e == null) {
        } else {
            if (pullState != NewScrollLogic.PullState.PULL_MEDIUM || !this.l) {
                z = false;
            } else {
                this.l = false;
                z = true;
            }
            if (pullState == NewScrollLogic.PullState.PULL_TOP && this.m) {
                this.m = false;
                z = true;
            }
            if (z) {
                ((HomeChildRecyclerView) this.e).onScrolledByNestedParent(null);
            } else {
                ((HomeChildRecyclerView) this.e).onScrolledByNestedParentEach(null);
            }
        }
    }
}
