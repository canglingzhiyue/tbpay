package com.taobao.search.sf.widgets.list.listcell.weex;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.support.v4.util.ArrayMap;
import android.support.v4.view.NestedScrollingParent2;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseBean;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.android.searchbaseframe.util.g;
import com.taobao.android.weex_framework.p;
import com.taobao.search.common.util.l;
import com.taobao.search.common.util.r;
import com.taobao.search.common.util.y;
import com.taobao.search.mmd.datasource.bean.SFPromotionBean;
import com.taobao.search.musie.q;
import com.taobao.tao.util.SystemBarDecorator;
import com.taobao.taobao.R;
import com.taobao.taolive.room.utils.aw;
import java.util.HashMap;
import java.util.Map;
import tb.iom;
import tb.iqt;
import tb.irr;
import tb.iru;
import tb.iul;
import tb.ium;
import tb.iur;
import tb.kge;
import tb.nom;
import tb.ntx;
import tb.nww;

/* loaded from: classes8.dex */
public class SearchSceneEnhancedMuiseModWidget extends q implements iom {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final int HIDDEN_THRESHOLD;
    private Integer A;
    private int B;
    private a C;
    private boolean D;
    private boolean E;
    private View H;
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    private String h;
    private int h_;
    private String i;
    private String j;
    private String k;
    private com.taobao.search.sf.widgets.onesearch.e l;
    private int m;
    private int n;
    private int p;
    private int q;
    private int r;
    private int s;
    private boolean t;
    private boolean u;
    private FrameLayout v;
    private View w;
    public View x;
    private Integer y;
    private Integer z;

    public static /* synthetic */ Object ipc$super(SearchSceneEnhancedMuiseModWidget searchSceneEnhancedMuiseModWidget, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -504750508:
                return super.c((MuiseBean) objArr[0]);
            case 66974264:
                super.onRenderSuccess((p) objArr[0]);
                return null;
            case 189826977:
                super.a((MuiseBean) objArr[0]);
                return null;
            case 236387257:
                super.a((p) objArr[0], (String) objArr[1], (String) objArr[2]);
                return null;
            case 653105475:
                return super.h();
            case 1514279453:
                super.a((Map) objArr[0]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad401d78", new Object[]{this, new Integer(i)});
        }
    }

    @Override // com.taobao.android.xsearchplugin.muise.o
    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
        }
    }

    public void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a2717e", new Object[]{this});
        }
    }

    public static /* synthetic */ int a(SearchSceneEnhancedMuiseModWidget searchSceneEnhancedMuiseModWidget) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a6981da7", new Object[]{searchSceneEnhancedMuiseModWidget})).intValue() : searchSceneEnhancedMuiseModWidget.q;
    }

    public static /* synthetic */ int a(SearchSceneEnhancedMuiseModWidget searchSceneEnhancedMuiseModWidget, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2c6c0bc2", new Object[]{searchSceneEnhancedMuiseModWidget, new Integer(i)})).intValue();
        }
        searchSceneEnhancedMuiseModWidget.q = i;
        return i;
    }

    public static /* synthetic */ void a(SearchSceneEnhancedMuiseModWidget searchSceneEnhancedMuiseModWidget, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c3cc27e", new Object[]{searchSceneEnhancedMuiseModWidget, str});
        } else {
            searchSceneEnhancedMuiseModWidget.c(str);
        }
    }

    public static /* synthetic */ void a(SearchSceneEnhancedMuiseModWidget searchSceneEnhancedMuiseModWidget, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb5c0045", new Object[]{searchSceneEnhancedMuiseModWidget, str, new Integer(i)});
        } else {
            searchSceneEnhancedMuiseModWidget.a(str, i);
        }
    }

    public static /* synthetic */ String b(SearchSceneEnhancedMuiseModWidget searchSceneEnhancedMuiseModWidget) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("665a186d", new Object[]{searchSceneEnhancedMuiseModWidget}) : searchSceneEnhancedMuiseModWidget.i;
    }

    public static /* synthetic */ int c(SearchSceneEnhancedMuiseModWidget searchSceneEnhancedMuiseModWidget) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6b4e4b65", new Object[]{searchSceneEnhancedMuiseModWidget})).intValue() : searchSceneEnhancedMuiseModWidget.r;
    }

    public static /* synthetic */ int d(SearchSceneEnhancedMuiseModWidget searchSceneEnhancedMuiseModWidget) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("cda96244", new Object[]{searchSceneEnhancedMuiseModWidget})).intValue() : searchSceneEnhancedMuiseModWidget.h_;
    }

    public static /* synthetic */ int e(SearchSceneEnhancedMuiseModWidget searchSceneEnhancedMuiseModWidget) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("30047923", new Object[]{searchSceneEnhancedMuiseModWidget})).intValue() : searchSceneEnhancedMuiseModWidget.p;
    }

    public static /* synthetic */ int f(SearchSceneEnhancedMuiseModWidget searchSceneEnhancedMuiseModWidget) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("925f9002", new Object[]{searchSceneEnhancedMuiseModWidget})).intValue() : searchSceneEnhancedMuiseModWidget.B;
    }

    @Override // com.taobao.search.musie.q, com.taobao.android.xsearchplugin.muise.o, tb.iup, tb.iui
    public /* synthetic */ void bindWithData(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2491dd0", new Object[]{this, obj});
        } else {
            a((MuiseBean) obj);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.widget.FrameLayout, android.view.View] */
    @Override // com.taobao.search.musie.q, com.taobao.android.xsearchplugin.muise.o, tb.ius
    public /* synthetic */ FrameLayout onCreateView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("ebecba09", new Object[]{this}) : s();
    }

    static {
        kge.a(-288189883);
        kge.a(2125559488);
        HIDDEN_THRESHOLD = l.a(40);
    }

    public SearchSceneEnhancedMuiseModWidget(Activity activity, ium iumVar, iru<? extends com.taobao.android.searchbaseframe.datasource.impl.a<? extends BaseSearchResult, ?>> iruVar, TemplateBean templateBean, ViewGroup viewGroup, iur iurVar) {
        super(activity, iumVar, iruVar, templateBean, viewGroup, iurVar);
        this.h = "";
        this.r = 0;
        this.s = 0;
        this.d = false;
        this.e = false;
        this.f = false;
        this.u = true;
        this.g = false;
        this.y = null;
        this.z = null;
        this.A = null;
        this.B = 10001;
        this.D = true;
        this.E = false;
        subscribeEvent(this);
        subscribeScopeEvent(this, "childPageWidget");
        a(false);
    }

    @Override // com.taobao.search.musie.q, com.taobao.android.xsearchplugin.muise.o
    public void a(MuiseBean muiseBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5087a1", new Object[]{this, muiseBean});
            return;
        }
        d(muiseBean);
        C();
        super.a(muiseBean);
        k();
        if (!A() || this.E) {
            return;
        }
        this.E = true;
        ((FrameLayout) getView()).addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.taobao.search.sf.widgets.list.listcell.weex.SearchSceneEnhancedMuiseModWidget.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                int c;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("899df952", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
                    return;
                }
                int z = SearchSceneEnhancedMuiseModWidget.this.z();
                if (z == 0 || SearchSceneEnhancedMuiseModWidget.a(SearchSceneEnhancedMuiseModWidget.this) == (c = SearchSceneEnhancedMuiseModWidget.this.c(z))) {
                    return;
                }
                SearchSceneEnhancedMuiseModWidget.a(SearchSceneEnhancedMuiseModWidget.this, c);
                SearchSceneEnhancedMuiseModWidget.this.d(c);
            }
        });
    }

    public int c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ab8b44cc", new Object[]{this, new Integer(i)})).intValue();
        }
        if (!this.g) {
            return i;
        }
        int i2 = i - this.c;
        return (!this.u || ((com.taobao.search.sf.datasource.c) getModel().d()).isMetaMode()) ? i2 : i2 - this.b;
    }

    public int z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6ccb7f4", new Object[]{this})).intValue();
        }
        if (this.f16263a != null && this.f16263a.e() != null) {
            return this.f16263a.e().getRootHeight();
        }
        return 0;
    }

    @Override // com.taobao.search.musie.q, com.taobao.android.xsearchplugin.muise.o
    public Map<String, Object> c(MuiseBean muiseBean) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e1ea1e54", new Object[]{this, muiseBean});
        }
        Map<String, Object> c = super.c(muiseBean);
        if (c != null && (c.get("model") instanceof JSONObject) && (jSONObject = (JSONObject) c.get("model")) != null) {
            jSONObject.put("offsettop", (Object) Integer.valueOf(this.m));
            if (A() && !this.u) {
                return c;
            }
            jSONObject.put("offsetbottom", (Object) Integer.valueOf(this.n));
        }
        return c;
    }

    public boolean A() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3a97c4c", new Object[]{this})).booleanValue() : r.bO() && !this.d && (!this.u || this.g);
    }

    public int a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{this, str})).intValue() : g.b(str, -1);
    }

    private void a(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c194ce8", new Object[]{this, new Boolean(z), new Boolean(z2)});
        } else if (z) {
            this.x.setVisibility(8);
        } else {
            this.x.setVisibility(0);
            View view = this.w;
            if (view != null && view.getLayoutParams() != null) {
                this.w.getLayoutParams().height = this.b;
            }
            if (z2) {
                this.H.setVisibility(0);
                this.w.setBackgroundResource(R.drawable.tbsearch_layered_srp_onesearch_mask_non_gradient);
                return;
            }
            this.H.setVisibility(8);
            this.w.setBackgroundResource(R.drawable.tbsearch_layered_srp_onesearch_mask_no_tab);
        }
    }

    private void d(MuiseBean muiseBean) {
        JSONObject b;
        IpChange ipChange = $ipChange;
        boolean z = true;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d5be9be", new Object[]{this, muiseBean});
        } else if (muiseBean == null || getView() == 0 || (b = com.taobao.android.searchbaseframe.util.a.b(muiseBean.model, "style")) == null) {
        } else {
            this.g = b.getBooleanValue("autoFit");
            String string = b.getString("width");
            String string2 = b.getString("height");
            if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2)) {
                return;
            }
            int a2 = a(string);
            int a3 = a(string2);
            if (a2 <= 0 || a3 <= 0) {
                return;
            }
            this.d = TextUtils.equals(b.getString("isGiraffe"), nom.VALUE_YES);
            this.i = b.getString("showType");
            this.k = b.getString("enterAnimation");
            this.r = g.b(b.getString("collapseSecond"), -1);
            this.s = g.b(b.getString("repeatCollapseSecond"), -1);
            this.e = TextUtils.equals(nom.VALUE_YES, b.getString("enableGuide"));
            this.q = (int) ((a3 / a2) * (this.o > 0 ? this.o : ntx.a()));
            this.b = l.a(48);
            if ((getActivity() instanceof com.taobao.android.searchbaseframe.uikit.a) && ((com.taobao.android.searchbaseframe.uikit.a) getActivity()).aF_()) {
                this.b += SystemBarDecorator.getStatusBarHeight(getActivity());
            }
            BaseSearchResult baseSearchResult = (BaseSearchResult) getModel().c().getTotalSearchResult();
            if (baseSearchResult == null || baseSearchResult.getTabs() == null || baseSearchResult.getTabs().size() <= 1) {
                z = false;
            }
            a(TextUtils.equals(b.getString("hideMaskView"), nom.VALUE_YES), z);
            if (z) {
                this.b += l.a(48);
            }
            this.c = l.a(TextUtils.equals(b.getString("enableSlide"), nom.VALUE_YES) ? 54 : 40);
            w();
            this.m = l.b(this.b);
            this.n = l.b(this.c);
            int a4 = ntx.a(getActivity());
            this.p = a4 - l.a(g.b(b.getString("fullBottomSearchListHeight"), 0));
            this.p -= this.b + this.c;
            int b2 = g.b(b.getString("advanceBottomSearchListHeight"), -1);
            if (b2 > 0) {
                this.h_ = a4 - l.a(b2);
                this.h_ -= this.b + this.c;
            }
            this.h_ = Math.min(this.h_, this.p);
            this.h_ = Math.max(this.h_, this.q);
            this.h = b.getString(com.taobao.linkmanager.flowout.c.DEGTAGE_H5URL);
            if (!TextUtils.isEmpty(this.h)) {
                this.h = y.a(this.h, "offsetbottom", String.valueOf(this.n));
            }
            this.f = TextUtils.equals(b.getString("disableAutoExpand"), nom.VALUE_YES);
            this.u = TextUtils.equals(b.getString(nom.KEY_IMMERSE_STYLE), nom.VALUE_YES);
            if (!this.u) {
                this.x.setVisibility(8);
            }
            if (!this.u) {
                i = this.b;
            }
            e(i);
            this.y = g.a(b.getString("tabTextNormalColor"), (Integer) null);
            this.z = g.a(b.getString("tabTextSelectedColor"), (Integer) null);
            this.A = Integer.valueOf(SFPromotionBean.a(b.getString("statusBarStyle")));
        }
    }

    public void e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef4f617", new Object[]{this, new Integer(i)});
        } else {
            ((FrameLayout) getView()).setPadding(((FrameLayout) getView()).getPaddingLeft(), i, ((FrameLayout) getView()).getPaddingRight(), ((FrameLayout) getView()).getPaddingBottom());
        }
    }

    private void C() {
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c5ab4a", new Object[]{this});
            return;
        }
        String str = this.i;
        this.j = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String str2 = this.i;
        char c = 65535;
        int hashCode = str2.hashCode();
        if (hashCode != -1131566974) {
            if (hashCode == 3154575 && str2.equals("full")) {
                c = 0;
            }
        } else if (str2.equals("advance")) {
            c = 1;
        }
        if (c == 0) {
            ((FrameLayout) getView()).post(new Runnable() { // from class: com.taobao.search.sf.widgets.list.listcell.weex.SearchSceneEnhancedMuiseModWidget.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        SearchSceneEnhancedMuiseModWidget.this.x();
                    }
                }
            });
        } else if (c != 1 || (i = this.h_) <= (i2 = this.q)) {
        } else {
            a(i, i2);
        }
    }

    public void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b088ff", new Object[]{this});
        } else {
            postScopeEvent(iqt.g.a("", true), "childPageWidget");
        }
    }

    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            postScopeEvent(nww.b.a(i - i2), "childPageWidget");
        }
    }

    @Override // com.taobao.search.musie.q, com.taobao.android.xsearchplugin.muise.o
    public void a(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            return;
        }
        super.a(map);
        if (r.bn()) {
            if (this.u) {
                i = this.m;
            }
            map.put("immersedTopHeight", Integer.valueOf(i));
        } else {
            map.put("immersedTopHeight", Integer.valueOf(this.m));
        }
        if (!A() || this.u) {
            map.put("immersedBottomHeight", Integer.valueOf(this.n));
        }
        int y = y();
        if (y <= 0) {
            return;
        }
        map.put("containerHeight", String.valueOf(l.b(y)));
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.view.View] */
    public int y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6bea073", new Object[]{this})).intValue();
        }
        iul root = getRoot();
        if (!(root instanceof irr)) {
            return 0;
        }
        return ((irr) root).getView().getMeasuredHeight();
    }

    public SceneHeaderContainer a(Activity activity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SceneHeaderContainer) ipChange.ipc$dispatch("b907fe04", new Object[]{this, activity}) : new SceneHeaderContainer(activity);
    }

    @Override // com.taobao.search.musie.q, com.taobao.android.xsearchplugin.muise.o
    public FrameLayout s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("d9f7991f", new Object[]{this});
        }
        SceneHeaderContainer a2 = a(getActivity());
        a2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.v = new FrameLayout(getActivity());
        this.v.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        a2.addView(this.v);
        this.x = LayoutInflater.from(getActivity()).inflate(R.layout.tbsearch_scene_layer_mask, (ViewGroup) a2, false);
        this.w = this.x.findViewById(R.id.v_non_gradient_mask);
        this.H = this.x.findViewById(R.id.v_gradient_mask_bottom);
        a2.addView(this.x);
        return a2;
    }

    @Override // com.taobao.android.xsearchplugin.muise.o
    public com.taobao.android.xsearchplugin.muise.a p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.xsearchplugin.muise.a) ipChange.ipc$dispatch("974ee138", new Object[]{this}) : new com.taobao.android.xsearchplugin.muise.p(this.mActivity, c(), this, this, r(), getModel());
    }

    @Override // com.taobao.android.xsearchplugin.muise.o, com.taobao.android.weex_framework.g
    public void onRenderSuccess(p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fdf238", new Object[]{this, pVar});
            return;
        }
        super.onRenderSuccess(pVar);
        this.t = true;
        this.f16263a.a(this.v, pVar, false, -1, -1);
        if (!this.e) {
            a(this.i, this.r);
        } else if (TextUtils.equals(this.k, "drop")) {
            ((FrameLayout) getView()).postDelayed(new Runnable() { // from class: com.taobao.search.sf.widgets.list.listcell.weex.SearchSceneEnhancedMuiseModWidget.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    SearchSceneEnhancedMuiseModWidget searchSceneEnhancedMuiseModWidget = SearchSceneEnhancedMuiseModWidget.this;
                    SearchSceneEnhancedMuiseModWidget.a(searchSceneEnhancedMuiseModWidget, SearchSceneEnhancedMuiseModWidget.b(searchSceneEnhancedMuiseModWidget), SearchSceneEnhancedMuiseModWidget.c(SearchSceneEnhancedMuiseModWidget.this));
                    if (SearchSceneEnhancedMuiseModWidget.d(SearchSceneEnhancedMuiseModWidget.this) > 0) {
                        SearchSceneEnhancedMuiseModWidget.a(SearchSceneEnhancedMuiseModWidget.this, "");
                    } else {
                        SearchSceneEnhancedMuiseModWidget.a(SearchSceneEnhancedMuiseModWidget.this, "");
                    }
                }
            }, 500L);
        } else {
            a(this.i, this.r);
        }
    }

    public void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b793c9", new Object[]{this});
            return;
        }
        a aVar = this.C;
        if (aVar == null) {
            return;
        }
        aVar.destroyAndRemoveFromParent();
        this.C = null;
    }

    private void a(final String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ad11", new Object[]{this, str, new Integer(i)});
        } else if (i <= 0) {
        } else {
            B();
            this.C = new a(getActivity(), this, getModel(), (ViewGroup) getView(), new iur() { // from class: com.taobao.search.sf.widgets.list.listcell.weex.SearchSceneEnhancedMuiseModWidget.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.iur
                public void a(View view) {
                    int d;
                    int a2;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9501e36a", new Object[]{this, view});
                        return;
                    }
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
                    layoutParams.gravity = 49;
                    int a3 = (SearchSceneEnhancedMuiseModWidget.a(SearchSceneEnhancedMuiseModWidget.this) + SearchSceneEnhancedMuiseModWidget.this.b) - l.a(41);
                    if (TextUtils.equals(str, "full")) {
                        d = SearchSceneEnhancedMuiseModWidget.e(SearchSceneEnhancedMuiseModWidget.this);
                        a2 = SearchSceneEnhancedMuiseModWidget.a(SearchSceneEnhancedMuiseModWidget.this);
                    } else {
                        if (TextUtils.equals(str, "advance")) {
                            d = SearchSceneEnhancedMuiseModWidget.d(SearchSceneEnhancedMuiseModWidget.this);
                            a2 = SearchSceneEnhancedMuiseModWidget.a(SearchSceneEnhancedMuiseModWidget.this);
                        }
                        ((FrameLayout) SearchSceneEnhancedMuiseModWidget.this.getView()).addView(view, layoutParams);
                        view.setTranslationY(a3);
                    }
                    a3 += d - a2;
                    ((FrameLayout) SearchSceneEnhancedMuiseModWidget.this.getView()).addView(view, layoutParams);
                    view.setTranslationY(a3);
                }

                @Override // tb.iur
                public void b(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("91037249", new Object[]{this, view});
                    } else {
                        ((FrameLayout) SearchSceneEnhancedMuiseModWidget.this.getView()).removeView(view);
                    }
                }
            });
            this.C.a(Integer.valueOf(i));
            this.C.attachToContainer();
            this.C.b();
        }
    }

    @Override // com.taobao.android.xsearchplugin.muise.o
    public void a(p pVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e16fbb9", new Object[]{this, pVar, str, str2});
            return;
        }
        super.a(pVar, str, str2);
        if (this.t) {
            return;
        }
        if (!TextUtils.isEmpty(this.h)) {
            b(this.h);
        } else {
            ((FrameLayout) getView()).setVisibility(8);
        }
        this.d = false;
    }

    private void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        this.v.setVisibility(8);
        postScopeEvent(iqt.h.a("degrade"), "childPageWidget");
        c("degrade");
        if (this.l == null) {
            this.l = new com.taobao.search.sf.widgets.onesearch.e(getActivity(), this, (com.taobao.search.sf.a) getModel(), (ViewGroup) getView(), new iur() { // from class: com.taobao.search.sf.widgets.list.listcell.weex.SearchSceneEnhancedMuiseModWidget.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.iur
                public void a(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9501e36a", new Object[]{this, view});
                    } else {
                        ((FrameLayout) SearchSceneEnhancedMuiseModWidget.this.getView()).addView(view, 0);
                    }
                }

                @Override // tb.iur
                public void b(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("91037249", new Object[]{this, view});
                    } else {
                        ((FrameLayout) SearchSceneEnhancedMuiseModWidget.this.getView()).removeView(view);
                    }
                }
            }, null);
            this.l.a(new com.taobao.search.mmd.onesearch.c());
            this.l.attachToContainer();
        }
        this.l.a(this.b + this.q + this.c);
        this.l.a(str);
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        FrameLayout frameLayout = this.v;
        if (frameLayout != null) {
            frameLayout.setTranslationY(i * 0.5f);
        }
        if ("advance".equals(this.j) && i != 0) {
            this.j = "normal";
            postScopeEvent(iqt.h.a("userScroll"), "childPageWidget");
        }
        f(Math.abs(i));
    }

    public void onEventMainThread(iqt.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcd5c88c", new Object[]{this, aVar});
        } else if (!getModel().g()) {
        } else {
            b(aVar.f29233a);
        }
    }

    private void f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0a9ceb6", new Object[]{this, new Integer(i)});
        } else if (this.f16263a.e() == null) {
        } else {
            if (i >= this.q && this.D) {
                this.D = false;
                l();
            } else if (i >= this.q || this.D) {
            } else {
                this.D = true;
                k();
            }
        }
    }

    public void onEventMainThread(iqt.g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcd882c6", new Object[]{this, gVar});
        } else if (!this.d) {
        } else {
            this.j = "full";
            this.B = 10002;
            c(gVar.f29234a);
            int i = this.s;
            if (i <= 0) {
                return;
            }
            a("full", i);
        }
    }

    public void onEventMainThread(iqt.h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcd8f725", new Object[]{this, hVar});
        } else if (!this.d) {
        } else {
            this.j = "normal";
            B();
            this.B = 10001;
            c(hVar.f29235a);
        }
    }

    public void onEventMainThread(iqt.i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcd96b84", new Object[]{this, iVar});
        } else if (!this.d) {
        } else {
            this.j = "hidden";
            B();
            this.B = 10003;
            c(iVar.f29236a);
        }
    }

    private void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        int i = this.B;
        String str2 = i == 10002 ? "full" : i == 10003 ? "hidden" : "normal";
        jSONObject.put("showType", (Object) str2);
        if (!TextUtils.isEmpty(str)) {
            jSONObject.put("triggerSource", (Object) str);
        }
        HashMap hashMap = new HashMap();
        String str3 = getModel().d().getTotalSearchResult() != 0 ? ((BaseSearchResult) getModel().d().getTotalSearchResult()).getMainInfo().rn : "";
        if (!TextUtils.isEmpty(str3)) {
            hashMap.put(aw.PARAM_SEARCH_KEYWORD_RN, str3);
        }
        jSONObject.put("trace", (Object) hashMap);
        if (this.f16263a.e() != null) {
            this.f16263a.e().sendInstanceMessage("onOperateSearchList", jSONObject);
        }
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put("showType", str2);
        if (!TextUtils.isEmpty(str3)) {
            arrayMap.put(aw.PARAM_SEARCH_KEYWORD_RN, str3);
        }
        if (!TextUtils.isEmpty(this.i)) {
            arrayMap.put("defaultShowType", this.i);
        }
        arrayMap.put("q", getModel().c().getKeyword());
        com.taobao.search.mmd.util.e.a("OperateGiraffe", (ArrayMap<String, String>) arrayMap);
    }

    public int aK_() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9088278f", new Object[]{this})).intValue() : this.q;
    }

    /* loaded from: classes8.dex */
    public class SceneHeaderContainer extends FrameLayout implements NestedScrollingParent2, com.taobao.android.searchbaseframe.uikit.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public int mAccY;
        public boolean mHideSceneLayer;
        public View.OnTouchListener mInterceptTouchListener;
        public boolean mSkipIntercept;

        static {
            kge.a(-1258175641);
            kge.a(-2000658237);
            kge.a(-1593312073);
        }

        public static /* synthetic */ Object ipc$super(SceneHeaderContainer sceneHeaderContainer, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode != -1533054272) {
                if (hashCode == -407533570) {
                    return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
                }
                if (hashCode != 2114251219) {
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                }
                return new Boolean(super.onNestedFling((View) objArr[0], ((Number) objArr[1]).floatValue(), ((Number) objArr[2]).floatValue(), ((Boolean) objArr[3]).booleanValue()));
            }
            return new Boolean(super.onNestedPreFling((View) objArr[0], ((Number) objArr[1]).floatValue(), ((Number) objArr[2]).floatValue()));
        }

        @Override // android.support.v4.view.NestedScrollingParent2
        public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("472edc84", new Object[]{this, view, new Integer(i), new Integer(i2), iArr, new Integer(i3)});
            }
        }

        @Override // android.support.v4.view.NestedScrollingParent2
        public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("da61a091", new Object[]{this, view, view2, new Integer(i), new Integer(i2)});
            }
        }

        public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3643ce32", new Object[]{this, view, view2, new Integer(i), new Integer(i2)})).booleanValue() : i2 == 0 && i == 2;
        }

        public SceneHeaderContainer(Context context) {
            super(context);
            this.mAccY = 0;
            this.mHideSceneLayer = false;
            this.mSkipIntercept = false;
        }

        public boolean originInterceptTouch(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8de33d03", new Object[]{this, motionEvent})).booleanValue() : super.onInterceptTouchEvent(motionEvent);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
            }
            View.OnTouchListener onTouchListener = this.mInterceptTouchListener;
            if (onTouchListener != null) {
                onTouchListener.onTouch(this, motionEvent);
            }
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            if (SearchSceneEnhancedMuiseModWidget.this.d && SearchSceneEnhancedMuiseModWidget.f(SearchSceneEnhancedMuiseModWidget.this) != 10002) {
                this.mSkipIntercept = true;
                if (!SearchSceneEnhancedMuiseModWidget.this.f) {
                    SearchSceneEnhancedMuiseModWidget.this.postEvent(iqt.g.a("clickCoverExpand"));
                }
                return false;
            } else if (motionEvent.getActionMasked() == 0) {
                this.mSkipIntercept = false;
                this.mHideSceneLayer = false;
                this.mAccY = 0;
                return false;
            } else {
                return super.onInterceptTouchEvent(motionEvent);
            }
        }

        public void onStopNestedScroll(View view, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eaf68c3d", new Object[]{this, view, new Integer(i)});
                return;
            }
            this.mAccY = 0;
            if (!this.mHideSceneLayer || this.mSkipIntercept) {
                return;
            }
            SearchSceneEnhancedMuiseModWidget.this.postEvent(iqt.i.a("fromWeex"));
        }

        public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("64bba3db", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5)});
                return;
            }
            this.mAccY += i4;
            int i6 = this.mAccY;
            if (i6 > 0 && Math.abs(i6) > SearchSceneEnhancedMuiseModWidget.HIDDEN_THRESHOLD) {
                this.mHideSceneLayer = true;
            } else {
                this.mHideSceneLayer = false;
            }
        }

        @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.NestedScrollingParent
        public boolean onNestedFling(View view, float f, float f2, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7e04e9d3", new Object[]{this, view, new Float(f), new Float(f2), new Boolean(z)})).booleanValue();
            }
            if (Build.VERSION.SDK_INT >= 21) {
                return super.onNestedFling(view, f, f2, z);
            }
            return false;
        }

        @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.NestedScrollingParent
        public boolean onNestedPreFling(View view, float f, float f2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a49f72c0", new Object[]{this, view, new Float(f), new Float(f2)})).booleanValue();
            }
            if (Build.VERSION.SDK_INT >= 21) {
                return super.onNestedPreFling(view, f, f2);
            }
            return false;
        }

        @Override // com.taobao.android.searchbaseframe.uikit.b
        public void setOnInterceptTouchEventListener(View.OnTouchListener onTouchListener) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e8c5b00b", new Object[]{this, onTouchListener});
            } else {
                this.mInterceptTouchListener = onTouchListener;
            }
        }
    }

    @Override // com.taobao.search.musie.q, tb.itl
    public boolean i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue() : this.u;
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.u;
    }

    public Integer e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Integer) ipChange.ipc$dispatch("2ea92693", new Object[]{this}) : this.y;
    }

    public Integer f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Integer) ipChange.ipc$dispatch("78dabfd4", new Object[]{this}) : this.z;
    }

    @Override // com.taobao.search.musie.q, tb.itl
    public com.taobao.android.searchbaseframe.meta.uikit.header.behavior.a h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.searchbaseframe.meta.uikit.header.behavior.a) ipChange.ipc$dispatch("26ed9943", new Object[]{this}) : super.h();
    }

    public Integer g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Integer) ipChange.ipc$dispatch("c30c5915", new Object[]{this}) : this.A;
    }
}
