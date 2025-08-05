package tb;

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.infoflow.multitab.b;
import com.taobao.tao.infoflow.multitab.e;
import com.taobao.tao.infoflow.multitab.g;
import com.taobao.tao.infoflow.multitab.protocol.IMultiTabPerformanceListener;
import com.taobao.tao.infoflow.multitab.viewprovider.IMultiTabStabilityListener;
import com.taobao.tao.navigation.model.NavigationTabConstraints;
import com.taobao.tao.topmultitab.c;
import com.taobao.tao.topmultitab.protocol.IHomeSubTabController;
import java.lang.ref.WeakReference;

/* loaded from: classes8.dex */
public class syc implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DX_CONTAINER = "dxContainer";
    public static final String MULTI_NATIVE_INFOFLOW_CID_PREFIX = "recommend_multi_channel_";
    private static final ksn e;

    /* renamed from: a  reason: collision with root package name */
    private osd f33938a;
    private WeakReference<FrameLayout> b;
    private JSONObject c;
    private IMultiTabPerformanceListener g;
    private IMultiTabStabilityListener h;
    private String i;
    private int j;
    private tkb o;
    private volatile boolean d = false;
    private int f = -1;
    private int k = 0;
    private int l = 0;
    private final RecyclerView.OnChildAttachStateChangeListener m = new RecyclerView.OnChildAttachStateChangeListener() { // from class: tb.syc.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.support.v7.widget.RecyclerView.OnChildAttachStateChangeListener
        public void onChildViewDetachedFromWindow(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8a66017d", new Object[]{this, view});
            }
        }

        @Override // android.support.v7.widget.RecyclerView.OnChildAttachStateChangeListener
        public void onChildViewAttachedToWindow(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("517542da", new Object[]{this, view});
            } else {
                syc.f(syc.this);
            }
        }
    };
    private final View.OnLayoutChangeListener n = new View.OnLayoutChangeListener() { // from class: tb.syc.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("899df952", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
            } else if (syc.a(syc.this) < syc.b(syc.this).i().getChildCount()) {
            } else {
                if (syc.c(syc.this) != null) {
                    if (syc.d(syc.this) == 1) {
                        syc.e(syc.this);
                        syc.c(syc.this).b(IMultiTabPerformanceListener.ON_FCP_END, System.currentTimeMillis());
                    }
                    if (syc.d(syc.this) == 2) {
                        syc.c(syc.this).b(IMultiTabPerformanceListener.ON_FSP_END, System.currentTimeMillis());
                    }
                }
                syc.a(syc.this, 0);
            }
        }
    };

    @Override // com.taobao.tao.infoflow.multitab.b
    public String j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6aaa74cf", new Object[]{this}) : DX_CONTAINER;
    }

    public static /* synthetic */ int a(syc sycVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ffa95aee", new Object[]{sycVar})).intValue() : sycVar.k;
    }

    public static /* synthetic */ int a(syc sycVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f582775b", new Object[]{sycVar, new Integer(i)})).intValue();
        }
        sycVar.k = i;
        return i;
    }

    public static /* synthetic */ int b(syc sycVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d76040fa", new Object[]{sycVar, new Integer(i)})).intValue();
        }
        sycVar.l = i;
        return i;
    }

    public static /* synthetic */ osd b(syc sycVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (osd) ipChange.ipc$dispatch("3ef2c28a", new Object[]{sycVar}) : sycVar.f33938a;
    }

    public static /* synthetic */ IMultiTabPerformanceListener c(syc sycVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IMultiTabPerformanceListener) ipChange.ipc$dispatch("f3ef97d2", new Object[]{sycVar}) : sycVar.g;
    }

    public static /* synthetic */ int d(syc sycVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("cb326e71", new Object[]{sycVar})).intValue() : sycVar.l;
    }

    public static /* synthetic */ void e(syc sycVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9b574ff", new Object[]{sycVar});
        } else {
            sycVar.m();
        }
    }

    public static /* synthetic */ int f(syc sycVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a8387b73", new Object[]{sycVar})).intValue();
        }
        int i = sycVar.k;
        sycVar.k = i + 1;
        return i;
    }

    public static /* synthetic */ void g(syc sycVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96bb8201", new Object[]{sycVar});
        } else {
            sycVar.p();
        }
    }

    public static /* synthetic */ void h(syc sycVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("853e8882", new Object[]{sycVar});
        } else {
            sycVar.o();
        }
    }

    public static /* synthetic */ IMultiTabStabilityListener i(syc sycVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IMultiTabStabilityListener) ipChange.ipc$dispatch("c7462871", new Object[]{sycVar}) : sycVar.h;
    }

    public static /* synthetic */ String j(syc sycVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7b4a979c", new Object[]{sycVar}) : sycVar.i;
    }

    public static /* synthetic */ int k(syc sycVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("50c79bf8", new Object[]{sycVar})).intValue() : sycVar.j;
    }

    static {
        kge.a(2048641322);
        kge.a(-1279537406);
        e = new ksn("mtop.taobao.wireless.home.category", "1.0");
    }

    @Override // com.taobao.tao.infoflow.multitab.b
    public View a(Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("5dd7f6d2", new Object[]{this, context, jSONObject});
        }
        WeakReference<FrameLayout> weakReference = this.b;
        if (weakReference == null || weakReference.get() == null) {
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
            this.b = new WeakReference<>(frameLayout);
            this.c = jSONObject;
            b(context);
            RecyclerView i = this.f33938a.i();
            if (i != null) {
                i.addOnScrollListener(l());
                i.addOnLayoutChangeListener(this.n);
                i.addOnChildAttachStateChangeListener(this.m);
                a(i, -2);
                frameLayout.removeAllViews();
                frameLayout.addView(i);
            }
            return frameLayout;
        }
        return this.b.get();
    }

    private RecyclerView.OnScrollListener l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView.OnScrollListener) ipChange.ipc$dispatch("107f02a1", new Object[]{this}) : new RecyclerView.OnScrollListener() { // from class: tb.syc.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass3 anonymousClass3, String str, Object... objArr) {
                if (str.hashCode() == 2142696127) {
                    super.onScrollStateChanged((RecyclerView) objArr[0], ((Number) objArr[1]).intValue());
                    return null;
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            @Override // android.support.v7.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7fb6f2bf", new Object[]{this, recyclerView, new Integer(i)});
                    return;
                }
                super.onScrollStateChanged(recyclerView, i);
                if (i != 0) {
                    return;
                }
                syc.g(syc.this);
                syc.e(syc.this);
            }
        };
    }

    private void m() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        if (r() == 0) {
            z = true;
        }
        IHomeSubTabController z2 = c.a().z();
        if (!(z2 instanceof qut)) {
            return;
        }
        ((qut) z2).b(z);
    }

    private void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{this, context});
            return;
        }
        t();
        this.g.b(IMultiTabPerformanceListener.ON_CONTAINER_INIT_START, System.currentTimeMillis());
        a(context, this.i);
        this.g.b(IMultiTabPerformanceListener.ON_CONTAINER_INIT_END, System.currentTimeMillis());
        u();
        v();
    }

    private void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6782afb", new Object[]{this});
        } else {
            this.i = b(false).getString("guessChannelId");
        }
    }

    private View a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f74757ec", new Object[]{this, context, str});
        }
        this.f33938a = a(str);
        View a2 = a(context);
        this.o = new tkb(this.f33938a);
        return a2;
    }

    private void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("686427c", new Object[]{this});
            return;
        }
        this.g.a(true);
        this.f33938a.r();
    }

    private void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69459fd", new Object[]{this});
            return;
        }
        this.g.b(IMultiTabPerformanceListener.ON_REQUEST_START, System.currentTimeMillis());
        this.f33938a.a(e, a(this.c));
    }

    private JSONObject a(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("429586a8", new Object[]{this, jSONObject});
        }
        JSONObject jSONObject3 = new JSONObject();
        if (jSONObject == null) {
            return jSONObject3;
        }
        try {
            return (!jSONObject.containsKey(e.KEY_SMART_CONTENT) || (jSONObject2 = jSONObject.getJSONObject(e.KEY_SMART_CONTENT)) == null || !jSONObject2.containsKey("categoryTabBizParams")) ? jSONObject3 : jSONObject2.getJSONObject("categoryTabBizParams");
        } catch (Exception e2) {
            g.a(DX_CONTAINER, "get bizparams from tabInfo failed:" + Log.getStackTraceString(e2));
            return jSONObject3;
        }
    }

    private View a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("876fa4a2", new Object[]{this, context});
        }
        if (this.f33938a == null) {
            return new View(context);
        }
        g.a("NativeContainerProvider", "createInfoFlowView context" + context);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        RecyclerView a2 = this.f33938a.a(context);
        a2.setBackgroundColor(Color.parseColor("#F0F0F0"));
        a(a2, -1);
        ldf.e("NativeContainerProvider", "构建信息流视图耗时：" + (SystemClock.elapsedRealtime() - elapsedRealtime));
        return a2;
    }

    private osd a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (osd) ipChange.ipc$dispatch("7c737f14", new Object[]{this, str});
        }
        osd a2 = osd.a(new ksk(MULTI_NATIVE_INFOFLOW_CID_PREFIX + str, "newface_home_sub_" + str, "Page_Home"));
        a2.a(n());
        return a2;
    }

    private osc n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (osc) ipChange.ipc$dispatch("730e3bd2", new Object[]{this}) : new osb() { // from class: tb.syc.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass4 anonymousClass4, String str, Object... objArr) {
                if (str.hashCode() == -1474178196) {
                    super.a(((Boolean) objArr[0]).booleanValue());
                    return null;
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            @Override // tb.osb
            public void a(boolean z) {
                IpChange ipChange2 = $ipChange;
                int i = 1;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
                    return;
                }
                super.a(z);
                syc sycVar = syc.this;
                if (!z) {
                    i = 2;
                }
                syc.b(sycVar, i);
                syc.h(syc.this);
            }

            @Override // tb.osc
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                syc.h(syc.this);
                if (syc.d(syc.this) != 2) {
                    return;
                }
                syc.c(syc.this).b(IMultiTabPerformanceListener.ON_REQUEST_END, System.currentTimeMillis());
            }

            @Override // tb.osc
            public void b() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                    return;
                }
                if (syc.i(syc.this) != null) {
                    IMultiTabStabilityListener i = syc.i(syc.this);
                    i.a(IMultiTabStabilityListener.ON_RENDER, syc.j(syc.this) + "_" + syc.k(syc.this), "renderError");
                }
                syc.h(syc.this);
                g.a("NativeContainerProvider", "信息流首屏或分页存在错误");
            }
        };
    }

    private void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
            return;
        }
        mjx i = oiy.a().b().getHomePageManager().i();
        if (!this.d || i == null) {
            return;
        }
        i.a(false);
        a(false);
        this.d = false;
    }

    private void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        IHomeSubTabController z2 = c.a().z();
        if (!(z2 instanceof qut)) {
            return;
        }
        ((qut) z2).a(z);
    }

    private void a(RecyclerView recyclerView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85acc02d", new Object[]{this, recyclerView, new Integer(i)});
            return;
        }
        ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = i;
            recyclerView.setLayoutParams(layoutParams);
            return;
        }
        recyclerView.setLayoutParams(new RecyclerView.LayoutParams(-1, i));
    }

    @Override // com.taobao.tao.infoflow.multitab.b
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        WeakReference<FrameLayout> weakReference = this.b;
        if (weakReference != null) {
            weakReference.clear();
            this.b = null;
        }
        osd osdVar = this.f33938a;
        if (osdVar == null) {
            return;
        }
        osdVar.e();
    }

    @Override // com.taobao.tao.infoflow.multitab.b
    public void a(IMultiTabPerformanceListener iMultiTabPerformanceListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53e8b881", new Object[]{this, iMultiTabPerformanceListener});
        } else {
            this.g = iMultiTabPerformanceListener;
        }
    }

    @Override // com.taobao.tao.infoflow.multitab.b
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.j = i;
        }
    }

    @Override // com.taobao.tao.infoflow.multitab.b
    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : q();
    }

    private void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
            return;
        }
        tik w = w();
        if (w == null) {
            return;
        }
        if (TextUtils.equals(q(), NavigationTabConstraints.TAB_ALIEN_EFFECTIVE_ROCKET)) {
            w.b();
        } else {
            w.c();
        }
    }

    private String q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("18528f28", new Object[]{this}) : r() > 4 ? NavigationTabConstraints.TAB_ALIEN_EFFECTIVE_ROCKET : com.taobao.share.taopassword.busniess.model.g.TAO;
    }

    private int r() {
        int i;
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("65bfbec", new Object[]{this})).intValue();
        }
        RecyclerView i3 = this.f33938a.i();
        if (i3 == null) {
            g.a("NativeContainerProvider", "getFirstVisiblePosition recyclerView null 0");
            return 0;
        }
        RecyclerView.LayoutManager layoutManager = i3.getLayoutManager();
        if (!(layoutManager instanceof com.taobao.tao.recommend4.recyclerview.c)) {
            g.a("NativeContainerProvider", "getFirstVisiblePosition layoutManager error 0");
            return 0;
        }
        int[] findFirstCompletelyVisibleItemPositions = ((com.taobao.tao.recommend4.recyclerview.c) layoutManager).findFirstCompletelyVisibleItemPositions(null);
        if (findFirstCompletelyVisibleItemPositions.length > 0 && findFirstCompletelyVisibleItemPositions[0] != 0) {
            i2 = findFirstCompletelyVisibleItemPositions[0];
        }
        if (i2 == -1 && (i = this.f) != -1) {
            i2 = i;
        }
        this.f = i2;
        g.a("NativeContainerProvider", "getFirstVisiblePosition " + i2);
        return i2;
    }

    @Override // com.taobao.tao.infoflow.multitab.b
    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
        } else {
            s();
        }
    }

    private void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a137a", new Object[]{this});
            return;
        }
        this.d = true;
        this.f33938a.e(b(true));
    }

    private JSONObject b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("24aa6b2b", new Object[]{this, new Boolean(z)});
        }
        JSONObject a2 = a(this.c);
        a2.put("isPullRefresh", (Object) Boolean.valueOf(z));
        return a2;
    }

    @Override // com.taobao.tao.infoflow.multitab.b
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        m();
        p();
        ldf.d("NativeContainerProvider", "onTabEnter " + x());
        tkb tkbVar = this.o;
        if (tkbVar == null) {
            return;
        }
        tkbVar.a();
    }

    @Override // com.taobao.tao.infoflow.multitab.b
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        ldf.d("NativeContainerProvider", "onTabLeave " + x());
        this.l = 0;
        tkb tkbVar = this.o;
        if (tkbVar == null) {
            return;
        }
        tkbVar.b();
    }

    @Override // com.taobao.tao.infoflow.multitab.b
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        ldf.d("NativeContainerProvider", "onPause " + x());
        tkb tkbVar = this.o;
        if (tkbVar == null) {
            return;
        }
        tkbVar.c();
    }

    @Override // com.taobao.tao.infoflow.multitab.b
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        ldf.d("NativeContainerProvider", "onResume " + x());
        tkb tkbVar = this.o;
        if (tkbVar == null) {
            return;
        }
        tkbVar.d();
    }

    @Override // com.taobao.tao.infoflow.multitab.b
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        ldf.d("NativeContainerProvider", "onStart " + x());
    }

    @Override // com.taobao.tao.infoflow.multitab.b
    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        ldf.d("NativeContainerProvider", "onStop " + x());
    }

    @Override // com.taobao.tao.infoflow.multitab.b
    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        } else if (TextUtils.equals(q(), NavigationTabConstraints.TAB_ALIEN_EFFECTIVE_ROCKET)) {
            this.f33938a.i().smoothScrollToPosition(0);
        } else {
            a(true);
        }
    }

    private tik w() {
        lbo homePageManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tik) ipChange.ipc$dispatch("b84f2d72", new Object[]{this});
        }
        lbq b = oiy.a().b();
        if (b != null && (homePageManager = b.getHomePageManager()) != null) {
            return homePageManager.g();
        }
        return null;
    }

    private String x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c5faa981", new Object[]{this});
        }
        osd osdVar = this.f33938a;
        return osdVar != null ? osdVar.g() : "unknown";
    }
}
