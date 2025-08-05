package tb;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.android.searchbaseframe.nx3.bean.WeexBean;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.android.searchbaseframe.util.i;
import com.taobao.android.searchbaseframe.util.k;
import com.taobao.android.xsearchplugin.weex.weex.a;
import com.taobao.android.xsearchplugin.weex.weex.b;
import com.taobao.android.xsearchplugin.weex.weex.d;
import com.taobao.taobao.R;
import com.taobao.weex.bridge.JSCallback;
import java.util.Map;
import tb.isr;

/* loaded from: classes6.dex */
public abstract class jzd<BEAN, MODEL> extends itd<BEAN, MODEL> implements a.InterfaceC0626a, d.a, Cint {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public a f29876a;
    public View e;
    public ViewGroup f;
    public BEAN g;
    public boolean h;
    public int i;
    public boolean j;
    public boolean k;
    private boolean l;
    private boolean m;
    private int n;
    private int o;
    private JSONObject p;
    private i q;

    static {
        kge.a(-196134670);
        kge.a(367364596);
        kge.a(1995568207);
        kge.a(-11697002);
    }

    public static /* synthetic */ Object ipc$super(jzd jzdVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case 61439048:
                super.A();
                return null;
            case 62362569:
                super.B();
                return null;
            case 107615098:
                super.s();
                return null;
            case 108538619:
                super.t();
                return null;
            case 114079745:
                super.z();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public abstract void E();

    public void H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40c20cf", new Object[]{this});
        }
    }

    public void I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41a3850", new Object[]{this});
        }
    }

    public abstract int a(WeexBean weexBean);

    public abstract Map<String, Object> a(BEAN bean, int i, boolean z, ListStyle listStyle);

    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
        }
    }

    public abstract int b(WeexBean weexBean);

    public abstract WeexBean d(BEAN bean);

    public jzd(Activity activity, ium iumVar, ListStyle listStyle, ViewGroup viewGroup, int i, MODEL model) {
        this(activity, a(activity, viewGroup), iumVar, listStyle, i, model);
    }

    public jzd(Activity activity, View view, ium iumVar, ListStyle listStyle, int i, MODEL model) {
        super(view, activity, iumVar, listStyle, i, model);
        this.g = null;
        this.h = true;
        this.i = -1;
        this.j = false;
        this.k = false;
        this.l = false;
        this.m = false;
        this.n = -1;
        this.o = -1;
        this.q = new i() { // from class: tb.jzd.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.searchbaseframe.util.i
            public void a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                jzd.this.f29876a.i();
                jzd.this.H();
            }
        };
        J();
        v().c().j();
        if (getParent() instanceof inu) {
            this.k = ((inu) getParent()).m();
        }
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e61c425", new Object[]{this, aVar});
        } else {
            this.f29876a = aVar;
        }
    }

    public static View a(Context context, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("f1543f21", new Object[]{context, viewGroup}) : LayoutInflater.from(context).inflate(R.layout.libsf_search_item_weex, viewGroup, false);
    }

    public void J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4284fd1", new Object[]{this});
        } else if (this.itemView == null) {
        } else {
            this.e = this.itemView.findViewById(R.id.placeholder_img);
            this.e.setVisibility(8);
            this.f = (ViewGroup) this.itemView.findViewById(R.id.dynamic_container);
            a(0);
            a(this.e);
        }
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.itemView.setBackgroundColor(i);
        }
    }

    public void c(WeexBean weexBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e4fd7fd", new Object[]{this, weexBean});
            return;
        }
        int cachedHeight = weexBean != null ? weexBean.getCachedHeight(u()) : -1;
        int d = d(weexBean);
        if (cachedHeight > 0) {
            v().b().c("AbsWeexViewHolder", "using cached height: %d, tyep: %s", Integer.valueOf(cachedHeight), weexBean);
            ViewGroup viewGroup = this.f;
            if (viewGroup == null) {
                return;
            }
            viewGroup.setLayoutParams(new FrameLayout.LayoutParams(-1, cachedHeight));
            return;
        }
        if (d > 0) {
            v().b().c("AbsWeexViewHolder", "using fixed height: %d, type: %s", Integer.valueOf(d), weexBean);
        } else {
            d = u() == ListStyle.LIST ? a(weexBean) : b(weexBean);
            v().b().c("AbsWeexViewHolder", "using sub size: %d, type: %s", Integer.valueOf(d), weexBean);
        }
        ViewGroup viewGroup2 = this.f;
        if (viewGroup2 == null) {
            return;
        }
        viewGroup2.setLayoutParams(new FrameLayout.LayoutParams(-1, d));
    }

    public int d(WeexBean weexBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("af05a4b1", new Object[]{this, weexBean})).intValue();
        }
        if (weexBean == null) {
            v().b().b("AbsWeexViewHolder", "obtainFixHeightFromTemplate:weex bean is null");
            return 0;
        }
        TemplateBean a2 = this.f29876a.a(weexBean);
        if (a2 != null) {
            return u() == ListStyle.LIST ? a2.listHeight : a2.midHeight;
        }
        v().b().b("AbsWeexViewHolder", "obtainFixHeightFromTemplate:template is null");
        return 0;
    }

    public void K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4366752", new Object[]{this});
            return;
        }
        ViewGroup viewGroup = this.f;
        if (viewGroup != null) {
            viewGroup.setVisibility(4);
        }
        View view = this.e;
        if (view == null) {
            return;
        }
        view.setVisibility(0);
    }

    public void L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4447ed3", new Object[]{this});
            return;
        }
        ViewGroup viewGroup = this.f;
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
        }
        View view = this.e;
        if (view == null) {
            return;
        }
        view.setVisibility(4);
    }

    @Override // tb.itd
    public void a(int i, BEAN bean) {
        StaggeredGridLayoutManager.LayoutParams layoutParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d36ff2b7", new Object[]{this, new Integer(i), bean});
        } else if (this.f29876a == null) {
            throw new IllegalStateException("you must call onCreateRender in subclass constructor by hand");
        } else {
            WeexBean d = d((jzd<BEAN, MODEL>) bean);
            TemplateBean a2 = this.f29876a.a(d);
            if (a2 != null) {
                this.j = a2.binary;
            }
            c(d);
            boolean a3 = a(e(d));
            ViewGroup.LayoutParams layoutParams2 = this.itemView.getLayoutParams();
            if (layoutParams2 instanceof StaggeredGridLayoutManager.LayoutParams) {
                layoutParams = (StaggeredGridLayoutManager.LayoutParams) layoutParams2;
            } else {
                layoutParams = new StaggeredGridLayoutManager.LayoutParams(layoutParams2);
            }
            layoutParams.setFullSpan(a3);
            if (n() == bean && o() == i) {
                return;
            }
            if (this.h) {
                e((jzd<BEAN, MODEL>) bean);
            } else {
                this.g = bean;
            }
            b();
        }
    }

    public boolean a(ListStyle listStyle) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6b84a969", new Object[]{this, listStyle})).booleanValue() : listStyle == ListStyle.LIST;
    }

    @Override // tb.itd
    public void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6782afb", new Object[]{this});
            return;
        }
        super.t();
        b();
    }

    public void G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fe094e", new Object[]{this});
            return;
        }
        ViewGroup viewGroup = this.f;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        View view = this.e;
        if (view == null) {
            return;
        }
        view.setVisibility(8);
    }

    public ListStyle e(WeexBean weexBean) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (ListStyle) ipChange.ipc$dispatch("b9a4c0bc", new Object[]{this, weexBean});
        }
        TemplateBean a2 = this.f29876a.a(weexBean);
        if (a2 == null) {
            return u();
        }
        int[] iArr = a2.supportedStyle;
        int[] f = f(weexBean);
        if (f == null) {
            f = iArr;
        }
        ListStyle u = u();
        if (f == null) {
            return u;
        }
        int length = f.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                z = false;
                break;
            } else if (f[i2] == u.ordinal()) {
                break;
            } else {
                i2++;
            }
        }
        if (z) {
            return u;
        }
        if (f.length > 0) {
            i = f[0];
        }
        return i == 0 ? ListStyle.LIST : ListStyle.WATERFALL;
    }

    public int[] f(WeexBean weexBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("3db68aa4", new Object[]{this, weexBean});
        }
        int[] iArr = null;
        if (weexBean == null) {
            return null;
        }
        JSONArray jSONArray = weexBean.status.getJSONArray("supportedStyle");
        if (jSONArray != null && jSONArray.size() > 0) {
            iArr = new int[jSONArray.size()];
            for (int i = 0; i < iArr.length; i++) {
                iArr[i] = jSONArray.getIntValue(i);
            }
        }
        return iArr;
    }

    public void a(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e632142", new Object[]{this, dVar});
            return;
        }
        this.h = true;
        N();
        M();
        this.f29876a.a(this.f, dVar);
        L();
        if (!this.k) {
            this.f29876a.i();
            H();
        } else {
            d();
        }
        BEAN bean = this.g;
        if (bean == null) {
            return;
        }
        this.g = null;
        e((jzd<BEAN, MODEL>) bean);
    }

    public void b(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1ee3f03", new Object[]{this, dVar});
            return;
        }
        this.h = true;
        N();
        M();
        this.f29876a.a(this.f, dVar);
        L();
        if (!this.k) {
            this.f29876a.i();
            H();
        } else {
            d();
        }
        BEAN bean = this.g;
        if (bean == null) {
            return;
        }
        this.g = null;
        e((jzd<BEAN, MODEL>) bean);
    }

    @Override // tb.itd
    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a137a", new Object[]{this});
            return;
        }
        super.s();
        c();
        if (!this.k) {
            this.f29876a.j();
            I();
            return;
        }
        e();
    }

    public void e(BEAN bean) {
        boolean b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceeb7748", new Object[]{this, bean});
            return;
        }
        this.h = false;
        this.i = m();
        K();
        ListStyle e = e(d((jzd<BEAN, MODEL>) bean));
        Map<String, Object> a2 = a((jzd<BEAN, MODEL>) bean, m(), a(e), e);
        if (v().a().c()) {
            this.p = v().e().b(a2);
        }
        if (!this.f29876a.b()) {
            k b2 = v().b();
            b2.f("AbsWeexViewHolder", "render weex cell：" + this);
            b = this.f29876a.a(d((jzd<BEAN, MODEL>) bean), a2);
        } else {
            k b3 = v().b();
            b3.f("AbsWeexViewHolder", "refresh weex cell：：" + this);
            b = this.f29876a.b(d((jzd<BEAN, MODEL>) bean), a2);
        }
        if (b) {
            return;
        }
        this.h = true;
        G();
    }

    @Override // com.taobao.android.xsearchplugin.weex.weex.a.InterfaceC0626a
    public void a(d dVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cce5d56", new Object[]{this, dVar, str, str2});
            return;
        }
        if ((w() instanceof itu) && l() != null) {
            ((itu) w()).a(this, d((jzd<BEAN, MODEL>) l()).type, dVar, str, str2);
        }
        if (!this.h) {
            G();
        }
        this.h = true;
        BEAN bean = this.g;
        if (bean == null) {
            return;
        }
        this.g = null;
        e((jzd<BEAN, MODEL>) bean);
    }

    public void M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4529654", new Object[]{this});
            return;
        }
        ViewGroup viewGroup = this.f;
        if (viewGroup == null) {
            v().b().b("AbsWeexViewHolder", "setCellHeightAutoChange:mDynamicContainer is null");
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
        if (layoutParams == null) {
            v().b().b("AbsWeexViewHolder", "setCellHeightAutoChange:layoutParams is null");
        } else {
            layoutParams.height = -2;
        }
    }

    @Override // tb.itd
    public void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b793c9", new Object[]{this});
            return;
        }
        super.B();
        this.f29876a.f();
    }

    @Override // tb.itd
    public void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a97c48", new Object[]{this});
            return;
        }
        super.A();
        this.f29876a.g();
    }

    @Override // tb.itd
    public void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ccb801", new Object[]{this});
            return;
        }
        super.z();
        this.f29876a.h();
    }

    @Override // tb.itd
    public void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bea080", new Object[]{this});
        } else {
            this.f29876a.f();
        }
    }

    @Override // com.taobao.android.xsearchplugin.weex.weex.d.a
    public void a(String str, JSONObject jSONObject, JSCallback jSCallback, JSCallback jSCallback2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfcc897e", new Object[]{this, str, jSONObject, jSCallback, jSCallback2});
        } else {
            postEvent(isr.c.a(str, jSONObject, b.a(jSCallback), b.a(jSCallback2)));
        }
    }

    public void N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("460add5", new Object[]{this});
            return;
        }
        BEAN l = l();
        if (l == null || !this.h) {
            return;
        }
        WeexBean d = d((jzd<BEAN, MODEL>) l);
        int e = this.f29876a.e();
        if (e < 0) {
            e = this.itemView.getHeight();
        }
        ListStyle e2 = e(d);
        if (d.getCachedHeight(e2) > 0) {
            return;
        }
        d.updateCachedHeight(e2, e);
    }

    @Override // tb.Cint
    public void a(inu inuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee0610e8", new Object[]{this, inuVar});
        } else if (!this.k) {
        } else {
            this.m = true;
            d();
        }
    }

    @Override // tb.Cint
    public void b(inu inuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc891769", new Object[]{this, inuVar});
        } else if (!this.k) {
        } else {
            this.m = false;
            e();
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (!this.k) {
        } else {
            this.l = true;
            d();
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (!this.k) {
        } else {
            this.l = false;
            this.m = false;
            e();
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (!this.l || !this.m || !this.h) {
        } else {
            if (m() == this.i && this.o == 0) {
                return;
            }
            this.itemView.removeCallbacks(this.q);
            this.itemView.postDelayed(this.q, 100L);
            this.o = 0;
            this.n = this.i;
        }
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        this.itemView.removeCallbacks(this.q);
        if (this.o == 0) {
            this.f29876a.j();
            I();
        }
        this.o = 1;
        this.n = -1;
    }
}
