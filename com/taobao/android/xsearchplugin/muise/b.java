package com.taobao.android.xsearchplugin.muise;

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
import com.taobao.android.searchbaseframe.nx3.bean.MuiseBean;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.android.searchbaseframe.uikit.screentype.ScreenType;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.android.searchbaseframe.util.i;
import com.taobao.android.searchbaseframe.util.q;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.taobao.R;
import java.util.Map;
import tb.Cint;
import tb.inu;
import tb.iob;
import tb.itd;
import tb.itu;
import tb.ium;
import tb.kge;

/* loaded from: classes6.dex */
public abstract class b<BEAN, MODEL> extends itd<BEAN, MODEL> implements com.taobao.android.searchbaseframe.uikit.screentype.a, com.taobao.android.weex_framework.g, k, Cint {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public a f16257a;
    public View e;
    public ViewGroup f;
    public BEAN g;
    public int h;
    public boolean i;
    public int j;
    public boolean k;
    private boolean l;
    private boolean m;
    private int n;
    private int o;
    private i p;
    private JSONObject q;
    private boolean r;
    public BEAN s;
    public int w;
    public int x;

    static {
        kge.a(-1524914755);
        kge.a(-311268728);
        kge.a(-11697002);
        kge.a(-956844622);
        kge.a(-1327398134);
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case 61439048:
                super.A();
                return null;
            case 62362569:
                super.B();
                return null;
            case 105768056:
                super.q();
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

    public void L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4447ed3", new Object[]{this});
        }
    }

    public void O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46ec556", new Object[]{this});
        }
    }

    public void P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47cdcd7", new Object[]{this});
        }
    }

    public abstract int a(MuiseBean muiseBean);

    public abstract Map<String, Object> a(BEAN bean, int i, boolean z, ListStyle listStyle);

    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
        }
    }

    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
        }
    }

    public abstract int b(MuiseBean muiseBean);

    public boolean b(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a9d66c3e", new Object[]{this, new Integer(i)})).booleanValue() : i > 0;
    }

    public boolean d(BEAN bean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("84b9de0b", new Object[]{this, bean})).booleanValue();
        }
        return false;
    }

    public abstract MuiseBean e(BEAN bean);

    public void f(BEAN bean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("191d1089", new Object[]{this, bean});
        }
    }

    public void g(BEAN bean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("634ea9ca", new Object[]{this, bean});
        }
    }

    @Override // com.taobao.android.weex_framework.g
    public void onDestroyed(MUSDKInstance mUSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32f7f995", new Object[]{this, mUSDKInstance});
        }
    }

    @Override // com.taobao.android.weex_framework.g
    public void onForeground(com.taobao.android.weex_framework.p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fafc624", new Object[]{this, pVar});
        }
    }

    @Override // com.taobao.android.weex_framework.g
    public void onPrepareSuccess(com.taobao.android.weex_framework.p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9635d60b", new Object[]{this, pVar});
        }
    }

    public static /* synthetic */ void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbf74980", new Object[]{bVar});
        } else {
            bVar.S();
        }
    }

    public b(Activity activity, ium iumVar, ListStyle listStyle, ViewGroup viewGroup, int i, MODEL model) {
        this(activity, a(activity, viewGroup), iumVar, listStyle, i, model);
    }

    public b(Activity activity, View view, ium iumVar, ListStyle listStyle, int i, MODEL model) {
        super(view, activity, iumVar, listStyle, i, model);
        this.g = null;
        this.h = -1;
        this.i = true;
        this.j = -1;
        this.x = -1;
        this.k = false;
        this.l = false;
        this.m = false;
        this.n = -1;
        this.o = -1;
        this.p = new i() { // from class: com.taobao.android.xsearchplugin.muise.b.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.searchbaseframe.util.i
            public void a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                b.this.f16257a.j();
                b.this.O();
            }
        };
        this.r = false;
        this.w = 0;
        F();
        if (getParent() instanceof inu) {
            this.k = ((inu) getParent()).m();
        }
        if (getParent() instanceof j) {
            ((j) getParent()).a(this);
        }
        ScreenType a2 = ScreenType.a(activity);
        if (a2 != null) {
            a2.a(this);
        }
        R();
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbf6d521", new Object[]{this, aVar});
        } else {
            this.f16257a = aVar;
        }
    }

    public static View a(Context context, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("f1543f21", new Object[]{context, viewGroup}) : LayoutInflater.from(context).inflate(R.layout.libsf_search_item_muise, viewGroup, false);
    }

    public void F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3eff1cd", new Object[]{this});
            return;
        }
        if (this.itemView != null) {
            this.e = this.itemView.findViewById(R.id.placeholder_img);
            this.f = (ViewGroup) this.itemView.findViewById(R.id.dynamic_container);
            g_(0);
            a(this.e);
        }
        if (!(this.b instanceof f)) {
            return;
        }
        ((f) this.b).closeViewDarkMode(this.itemView);
    }

    public void G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fe094e", new Object[]{this});
        } else {
            this.f16257a.g();
        }
    }

    public void H() {
        BEAN bean;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40c20cf", new Object[]{this});
        } else if (this.f16257a.e() != null || this.f16257a.m() || (bean = this.s) == null) {
        } else {
            a((b<BEAN, MODEL>) bean, m());
        }
    }

    @Override // tb.itd
    public void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c5ab4a", new Object[]{this});
        } else {
            t();
        }
    }

    @Override // tb.itd
    public void D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d3c2cb", new Object[]{this});
        } else {
            s();
        }
    }

    public void g_(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed59b984", new Object[]{this, new Integer(i)});
        } else {
            this.itemView.setBackgroundColor(i);
        }
    }

    public int a(MuiseBean muiseBean, BEAN bean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3e483130", new Object[]{this, muiseBean, bean})).intValue();
        }
        if (muiseBean == null) {
            return -1;
        }
        return muiseBean.getCachedHeight(u());
    }

    public void b(MuiseBean muiseBean, BEAN bean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("574982dc", new Object[]{this, muiseBean, bean});
            return;
        }
        int a2 = a(muiseBean, (MuiseBean) bean);
        int d = d(muiseBean, bean);
        if (b(a2)) {
            v().b().c("AbsMuiseViewHolder", "using cached height: %d, type: %s", Integer.valueOf(a2), muiseBean);
            ViewGroup viewGroup = this.f;
            if (viewGroup == null) {
                return;
            }
            viewGroup.setLayoutParams(new FrameLayout.LayoutParams(-1, a2));
            return;
        }
        if (d > 0) {
            v().b().c("AbsMuiseViewHolder", "using fixed height: %d, type: %s", Integer.valueOf(d), muiseBean);
        } else {
            d = c(muiseBean, (MuiseBean) bean);
            v().b().c("AbsMuiseViewHolder", "using sub size: %d, type: %s", Integer.valueOf(d), muiseBean);
        }
        ViewGroup viewGroup2 = this.f;
        if (viewGroup2 == null) {
            return;
        }
        viewGroup2.setLayoutParams(new FrameLayout.LayoutParams(-1, d));
    }

    @Override // tb.itd
    public void b(BEAN bean) {
        StaggeredGridLayoutManager.LayoutParams layoutParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f056ab85", new Object[]{this, bean});
            return;
        }
        MuiseBean e = e(bean);
        b(e, (MuiseBean) bean);
        boolean a2 = a(e(e, bean), (ListStyle) bean);
        ViewGroup.LayoutParams layoutParams2 = this.itemView.getLayoutParams();
        if (layoutParams2 instanceof StaggeredGridLayoutManager.LayoutParams) {
            layoutParams = (StaggeredGridLayoutManager.LayoutParams) layoutParams2;
        } else {
            layoutParams = new StaggeredGridLayoutManager.LayoutParams(layoutParams2);
        }
        layoutParams.setFullSpan(a2);
    }

    public int c(MuiseBean muiseBean, BEAN bean) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("704ad46e", new Object[]{this, muiseBean, bean})).intValue() : u() == ListStyle.LIST ? a(muiseBean) : b(muiseBean);
    }

    public int d(MuiseBean muiseBean, BEAN bean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("894c260d", new Object[]{this, muiseBean, bean})).intValue();
        }
        if (muiseBean == null) {
            v().b().b("AbsMuiseViewHolder", "obtainFixHeightFromTemplate:muise bean is null");
            return 0;
        }
        TemplateBean a2 = this.f16257a.a(muiseBean);
        if (a2 != null) {
            return u() == ListStyle.LIST ? a2.listHeight : a2.midHeight;
        }
        v().b().b("AbsMuiseViewHolder", "obtainFixHeightFromTemplate:template is null");
        return 0;
    }

    public void I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41a3850", new Object[]{this});
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

    public void J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4284fd1", new Object[]{this});
            return;
        }
        ViewGroup viewGroup = this.f;
        if (viewGroup != null) {
            viewGroup.setDescendantFocusability(393216);
            this.f.setVisibility(0);
            this.f.setDescendantFocusability(262144);
        }
        View view = this.e;
        if (view == null) {
            return;
        }
        view.setVisibility(4);
    }

    @Override // tb.itd
    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
            return;
        }
        super.q();
        this.s = null;
    }

    public boolean c(int i, BEAN bean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb731079", new Object[]{this, new Integer(i), bean})).booleanValue();
        }
        if (n() == bean && o() == i) {
            return true;
        }
        return this.s == bean && !d(bean);
    }

    @Override // tb.itd
    public void a(int i, BEAN bean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d36ff2b7", new Object[]{this, new Integer(i), bean});
        } else if (this.f16257a == null) {
            throw new IllegalStateException("you must call onCreateRender in subclass constructor by hand");
        } else {
            if (c(i, (int) bean)) {
                return;
            }
            f(bean);
            MuiseBean e = e(bean);
            a((b<BEAN, MODEL>) bean);
            if (this.i) {
                a((b<BEAN, MODEL>) bean, i);
            } else {
                com.taobao.android.searchbaseframe.util.k.f("[XS.render]", "[Muise refresh] Skip redundant data bind: tItemType: %s, form index: %d to index: %d", e.getdItemType(), Integer.valueOf(this.j), Integer.valueOf(i));
                this.g = bean;
                this.h = i;
            }
            b();
        }
    }

    @Override // tb.itd
    public void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6782afb", new Object[]{this});
            return;
        }
        H();
        super.t();
        this.r = true;
        if (!this.k) {
            if (this.f16257a.e() != null) {
                this.f16257a.e().updateNativeState("visibility", "appear");
            }
            this.f16257a.j();
            O();
        }
        b();
    }

    public void K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4366752", new Object[]{this});
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

    public ListStyle e(MuiseBean muiseBean, BEAN bean) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (ListStyle) ipChange.ipc$dispatch("a3ee0476", new Object[]{this, muiseBean, bean});
        }
        TemplateBean a2 = this.f16257a.a(muiseBean);
        if (a2 == null) {
            return u();
        }
        int[] iArr = a2.supportedStyle;
        int[] c = c(muiseBean);
        if (c == null) {
            c = iArr;
        }
        ListStyle u = u();
        if (c == null) {
            return u;
        }
        int length = c.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                z = false;
                break;
            } else if (c[i2] == u.ordinal()) {
                break;
            } else {
                i2++;
            }
        }
        if (z) {
            return u;
        }
        if (c.length > 0) {
            i = c[0];
        }
        return i == 0 ? ListStyle.LIST : ListStyle.WATERFALL;
    }

    public int[] c(MuiseBean muiseBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("d3abae65", new Object[]{this, muiseBean});
        }
        int[] iArr = null;
        if (muiseBean == null) {
            return null;
        }
        JSONArray jSONArray = muiseBean.status.getJSONArray("supportedStyle");
        if (jSONArray != null && jSONArray.size() > 0) {
            iArr = new int[jSONArray.size()];
            for (int i = 0; i < iArr.length; i++) {
                iArr[i] = jSONArray.getIntValue(i);
            }
        }
        return iArr;
    }

    @Override // com.taobao.android.weex_framework.g
    public void onRenderSuccess(com.taobao.android.weex_framework.p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fdf238", new Object[]{this, pVar});
        } else {
            c(pVar);
        }
    }

    private void c(com.taobao.android.weex_framework.p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20b31f63", new Object[]{this, pVar});
            return;
        }
        int i = this.x;
        if (i >= 0) {
            pVar.addInstanceEnv("columnIndex", String.valueOf(i));
        }
        if (getParent() instanceof iob) {
            ((iob) getParent()).F();
        }
        this.i = true;
        N();
        M();
        this.f16257a.a(this.f, pVar);
        J();
        if (!this.k) {
            if (this.r) {
                if (this.f16257a.e() != null) {
                    this.f16257a.e().updateNativeState("visibility", "appear");
                }
                this.f16257a.j();
                O();
            }
        } else {
            d();
        }
        if (this.g == null || b(pVar)) {
            return;
        }
        BEAN bean = this.g;
        int i2 = this.h;
        this.g = null;
        this.h = -1;
        a((b<BEAN, MODEL>) bean, i2);
    }

    @Override // com.taobao.android.weex_framework.g
    public void onRenderFailed(com.taobao.android.weex_framework.p pVar, int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4253181b", new Object[]{this, pVar, new Integer(i), str, new Boolean(z)});
            return;
        }
        if (getParent() instanceof iob) {
            ((iob) getParent()).F();
        }
        a aVar = this.f16257a;
        if (aVar != null) {
            aVar.g();
        }
        a(pVar, String.valueOf(i), str);
    }

    @Override // com.taobao.android.weex_framework.g
    public void onRefreshSuccess(com.taobao.android.weex_framework.p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cd7e3df", new Object[]{this, pVar});
        } else {
            c(pVar);
        }
    }

    @Override // com.taobao.android.weex_framework.g
    public void onRefreshFailed(com.taobao.android.weex_framework.p pVar, int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f63c5f14", new Object[]{this, pVar, new Integer(i), str, new Boolean(z)});
            return;
        }
        if (getParent() instanceof iob) {
            ((iob) getParent()).F();
        }
        a aVar = this.f16257a;
        if (aVar != null) {
            aVar.g();
        }
        a(pVar, String.valueOf(i), str);
    }

    @Override // com.taobao.android.weex_framework.g
    public void onJSException(com.taobao.android.weex_framework.p pVar, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("831fc52e", new Object[]{this, pVar, new Integer(i), str});
        } else {
            a(pVar, String.valueOf(i), str);
        }
    }

    @Override // com.taobao.android.weex_framework.g
    public void onFatalException(com.taobao.android.weex_framework.p pVar, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcd71451", new Object[]{this, pVar, new Integer(i), str});
        } else {
            a(pVar, String.valueOf(i), str);
        }
    }

    @Override // tb.itd
    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a137a", new Object[]{this});
            return;
        }
        super.s();
        this.r = false;
        c();
        if (!this.k) {
            if (this.f16257a.e() != null) {
                this.f16257a.e().updateNativeState("visibility", "disappear");
            }
            this.f16257a.k();
            P();
            return;
        }
        e();
    }

    public void a(BEAN bean, int i) {
        boolean b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e7da93f", new Object[]{this, bean, new Integer(i)});
            return;
        }
        this.i = false;
        int i2 = this.j;
        this.j = i;
        I();
        MuiseBean e = e(bean);
        ListStyle e2 = e(e, bean);
        Map<String, Object> a2 = a(bean, i, a(e2, (ListStyle) bean), e2);
        if (v().a().c()) {
            this.q = v().e().b(a2);
        }
        if (!this.f16257a.c()) {
            com.taobao.android.searchbaseframe.util.k.d("[XS.render]", "[Muise render] Start, tItemType: %s, index: %d", e.type, Integer.valueOf(this.j));
            this.f16257a.a(i);
            b = this.f16257a.a(e, a2);
            this.s = bean;
            g(bean);
        } else {
            com.taobao.android.searchbaseframe.util.k.d("[XS.render]", "[Muise refresh] Start, tItemType: %s, from index: %d, to index: %d", e.type, Integer.valueOf(i2), Integer.valueOf(this.j));
            this.f16257a.a(i);
            b = this.f16257a.b(e, a2);
            this.s = bean;
            g(bean);
        }
        if (b && (getParent() instanceof iob)) {
            ((iob) getParent()).E();
        }
        if (b) {
            return;
        }
        L();
        this.i = true;
        K();
    }

    public boolean a(ListStyle listStyle, BEAN bean) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e688ea05", new Object[]{this, listStyle, bean})).booleanValue() : listStyle == ListStyle.LIST;
    }

    public void a(com.taobao.android.weex_framework.p pVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e16fbb9", new Object[]{this, pVar, str, str2});
            return;
        }
        com.taobao.android.searchbaseframe.util.k.f("[XS.render]", "render failed at %i, code: %s, msg: %s", Integer.valueOf(m()), str, str2);
        if ((w() instanceof itu) && l() != null) {
            ((itu) w()).a(this, e(l()).type, pVar, str, str2);
        }
        if (!this.i) {
            K();
        }
        this.i = true;
        if (this.g == null || b(pVar)) {
            return;
        }
        BEAN bean = this.g;
        int i = this.h;
        this.g = null;
        this.h = -1;
        a((b<BEAN, MODEL>) bean, i);
    }

    private boolean b(com.taobao.android.weex_framework.p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("194dea48", new Object[]{this, pVar})).booleanValue();
        }
        a aVar = this.f16257a;
        if (aVar == null || pVar == null || !aVar.a(pVar)) {
            return false;
        }
        if (this.b instanceof g) {
            ((g) this.b).a("cell leak");
        }
        return true;
    }

    public void M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4529654", new Object[]{this});
            return;
        }
        ViewGroup viewGroup = this.f;
        if (viewGroup == null) {
            v().b().b("AbsMuiseViewHolder", "setCellHeightAutoChange:mDynamicContainer is null");
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
        if (layoutParams == null) {
            v().b().b("AbsMuiseViewHolder", "setCellHeightAutoChange:layoutParams is null");
            return;
        }
        layoutParams.height = -2;
        if (this.itemView.getLayoutParams() == null) {
            return;
        }
        this.itemView.getLayoutParams().height = -2;
        this.itemView.requestLayout();
    }

    @Override // tb.itd
    public void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b793c9", new Object[]{this});
            return;
        }
        super.B();
        this.f16257a.g();
    }

    @Override // tb.itd
    public void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a97c48", new Object[]{this});
            return;
        }
        super.A();
        this.f16257a.h();
    }

    @Override // tb.itd
    public void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ccb801", new Object[]{this});
            return;
        }
        super.z();
        this.f16257a.i();
    }

    @Override // tb.itd
    public void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bea080", new Object[]{this});
        } else {
            this.f16257a.g();
        }
    }

    public void N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("460add5", new Object[]{this});
            return;
        }
        BEAN l = l();
        if (l == null || !this.i) {
            return;
        }
        MuiseBean e = e(l);
        int l2 = this.f16257a.l();
        if (l2 < 0) {
            l2 = this.itemView.getHeight();
        }
        ListStyle e2 = e(e, l);
        a(e.getCachedHeight(e2), l2);
        e.updateCachedHeight(e2, l2);
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
            return;
        }
        if (this.f16257a.e() != null) {
            this.f16257a.e().updateNativeState("visibility", "appear");
        }
        if (!this.l || !this.m || !this.i) {
            return;
        }
        if (m() == this.j && this.o == 0) {
            return;
        }
        this.itemView.removeCallbacks(this.p);
        this.itemView.postDelayed(this.p, 100L);
        this.o = 0;
        this.n = this.j;
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        if (this.f16257a.e() != null) {
            this.f16257a.e().updateNativeState("visibility", "disappear");
        }
        this.itemView.removeCallbacks(this.p);
        if (this.o == 0) {
            this.f16257a.k();
            P();
        }
        this.o = 1;
        this.n = -1;
    }

    public boolean Q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("48af45c", new Object[]{this})).booleanValue() : this.r;
    }

    public void ag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab470dad", new Object[]{this});
            return;
        }
        this.itemView.getLayoutParams().height = this.itemView.getMeasuredHeight();
        a((b<BEAN, MODEL>) this.s, m());
    }

    @Override // com.taobao.android.searchbaseframe.uikit.screentype.a
    public void i_(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57263006", new Object[]{this, new Integer(i)});
        } else if (this.s == null || this.j < 0) {
        } else {
            ag();
        }
    }

    private void R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4990bd9", new Object[]{this});
        } else {
            this.itemView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.taobao.android.xsearchplugin.muise.b.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("899df952", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
                        return;
                    }
                    int i9 = i3 - i;
                    if (i9 == 0) {
                        return;
                    }
                    int i10 = i7 - i5;
                    if (i10 != i9 || b.this.w != i9) {
                        b bVar = b.this;
                        bVar.w = i9;
                        if (bVar.s != null && b.this.j >= 0 && i10 != 0) {
                            com.taobao.android.searchbaseframe.util.k.d("ScreenTypeAdapt", "itemView width changed, refresh", new Object[0]);
                            b.this.ag();
                        }
                    }
                    if (((ViewGroup) view.getParent()) == null || i == i5 || !q.d()) {
                        return;
                    }
                    b.a(b.this);
                }
            });
        }
    }

    private void S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a7235a", new Object[]{this});
            return;
        }
        com.taobao.android.weex_framework.p e = this.f16257a.e();
        int ak = ak();
        this.x = ak;
        if (ScreenType.IS_FOLDABLE || ScreenType.IS_PAD || e == null) {
            return;
        }
        e.addInstanceEnv("columnIndex", String.valueOf(ak));
    }
}
