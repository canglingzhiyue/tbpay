package com.taobao.search.sf.widgets.list.listcell.weex;

import android.app.Activity;
import android.content.Context;
import android.support.v4.util.ArrayMap;
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
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.android.searchbaseframe.nx3.bean.WeexBean;
import com.taobao.android.searchbaseframe.util.g;
import com.taobao.search.common.util.l;
import com.taobao.search.common.util.y;
import com.taobao.search.mmd.datasource.bean.SFPromotionBean;
import com.taobao.tao.util.SystemBarDecorator;
import com.taobao.taobao.R;
import com.taobao.taolive.room.utils.aw;
import com.taobao.weex.WXSDKInstance;
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
public class SearchSceneEnhancedWeexModWidget extends e implements iom {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final int HIDDEN_THRESHOLD;
    private int A;
    private a B;
    private boolean C;
    private View D;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean f;
    public boolean g;
    private String h;
    private String i;
    private String j;
    private String k;
    private com.taobao.search.sf.widgets.onesearch.e l;
    private int m;
    private int n;
    private int o;
    private int p;
    private int q;
    private boolean r;
    private boolean s;
    private boolean t;
    private FrameLayout u;
    private View v;
    private View w;
    private Integer x;
    private Integer y;
    private Integer z;

    public static /* synthetic */ Object ipc$super(SearchSceneEnhancedWeexModWidget searchSceneEnhancedWeexModWidget, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1429617551:
                return super.b((WeexBean) objArr[0]);
            case 751721814:
                super.a((com.taobao.android.xsearchplugin.weex.weex.d) objArr[0], (String) objArr[1], (String) objArr[2]);
                return null;
            case 1514279453:
                super.a((Map) objArr[0]);
                return null;
            case 1583554882:
                super.a((com.taobao.android.xsearchplugin.weex.weex.d) objArr[0]);
                return null;
            case 2095332987:
                super.a((WeexBean) objArr[0]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // tb.jzf
    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a137a", new Object[]{this});
        }
    }

    public void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69459fd", new Object[]{this});
        }
    }

    public static /* synthetic */ String a(SearchSceneEnhancedWeexModWidget searchSceneEnhancedWeexModWidget) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b3bc445c", new Object[]{searchSceneEnhancedWeexModWidget}) : searchSceneEnhancedWeexModWidget.i;
    }

    public static /* synthetic */ void a(SearchSceneEnhancedWeexModWidget searchSceneEnhancedWeexModWidget, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("688cd18e", new Object[]{searchSceneEnhancedWeexModWidget, str});
        } else {
            searchSceneEnhancedWeexModWidget.b(str);
        }
    }

    public static /* synthetic */ void a(SearchSceneEnhancedWeexModWidget searchSceneEnhancedWeexModWidget, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a90dd335", new Object[]{searchSceneEnhancedWeexModWidget, str, new Integer(i)});
        } else {
            searchSceneEnhancedWeexModWidget.a(str, i);
        }
    }

    public static /* synthetic */ int b(SearchSceneEnhancedWeexModWidget searchSceneEnhancedWeexModWidget) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("186fe1f8", new Object[]{searchSceneEnhancedWeexModWidget})).intValue() : searchSceneEnhancedWeexModWidget.p;
    }

    public static /* synthetic */ int c(SearchSceneEnhancedWeexModWidget searchSceneEnhancedWeexModWidget) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("86f6f339", new Object[]{searchSceneEnhancedWeexModWidget})).intValue() : searchSceneEnhancedWeexModWidget.m;
    }

    public static /* synthetic */ int d(SearchSceneEnhancedWeexModWidget searchSceneEnhancedWeexModWidget) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f57e047a", new Object[]{searchSceneEnhancedWeexModWidget})).intValue() : searchSceneEnhancedWeexModWidget.o;
    }

    public static /* synthetic */ int e(SearchSceneEnhancedWeexModWidget searchSceneEnhancedWeexModWidget) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("640515bb", new Object[]{searchSceneEnhancedWeexModWidget})).intValue() : searchSceneEnhancedWeexModWidget.n;
    }

    public static /* synthetic */ int f(SearchSceneEnhancedWeexModWidget searchSceneEnhancedWeexModWidget) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d28c26fc", new Object[]{searchSceneEnhancedWeexModWidget})).intValue() : searchSceneEnhancedWeexModWidget.A;
    }

    @Override // com.taobao.search.sf.widgets.list.listcell.weex.e, tb.jzf, tb.iup, tb.iui
    public /* synthetic */ void bindWithData(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2491dd0", new Object[]{this, obj});
        } else {
            a((WeexBean) obj);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.widget.FrameLayout, android.view.View] */
    @Override // com.taobao.search.sf.widgets.list.listcell.weex.e, tb.jzf, tb.ius
    public /* synthetic */ FrameLayout onCreateView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("ebecba09", new Object[]{this}) : r();
    }

    static {
        kge.a(1994470323);
        kge.a(2125559488);
        HIDDEN_THRESHOLD = l.a(40);
    }

    public SearchSceneEnhancedWeexModWidget(Activity activity, ium iumVar, iru<? extends com.taobao.android.searchbaseframe.datasource.impl.a<? extends BaseSearchResult, ?>> iruVar, TemplateBean templateBean, ViewGroup viewGroup, iur iurVar) {
        super(activity, iumVar, iruVar, templateBean, viewGroup, iurVar);
        this.h = "";
        this.p = 0;
        this.q = 0;
        this.f = false;
        this.s = false;
        this.g = false;
        this.t = true;
        this.x = null;
        this.y = null;
        this.z = 0;
        this.A = 10001;
        this.C = true;
        subscribeEvent(this);
        subscribeScopeEvent(this, "childPageWidget");
    }

    @Override // com.taobao.search.sf.widgets.list.listcell.weex.e, tb.jzf
    public void a(WeexBean weexBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ce43e7b", new Object[]{this, weexBean});
            return;
        }
        d(weexBean);
        h();
        super.a(weexBean);
        this.f29878a.a((ViewGroup) getView(), this.f29878a.c(), false);
    }

    @Override // com.taobao.search.sf.widgets.list.listcell.weex.e, tb.jzf
    public Map<String, Object> b(WeexBean weexBean) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("aac9c471", new Object[]{this, weexBean});
        }
        Map<String, Object> b = super.b(weexBean);
        if (b != null && (b.get("model") instanceof JSONObject) && (jSONObject = (JSONObject) b.get("model")) != null) {
            jSONObject.put("offsetbottom", (Object) Integer.valueOf(this.e));
            jSONObject.put("offsettop", (Object) Integer.valueOf(this.d));
        }
        return b;
    }

    private void a(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c194ce8", new Object[]{this, new Boolean(z), new Boolean(z2)});
        } else if (z) {
            this.w.setVisibility(8);
        } else {
            this.w.setVisibility(0);
            View view = this.v;
            if (view != null && view.getLayoutParams() != null) {
                this.v.getLayoutParams().height = this.b;
            }
            if (z2) {
                this.D.setVisibility(0);
                this.v.setBackgroundResource(R.drawable.tbsearch_layered_srp_onesearch_mask_non_gradient);
                return;
            }
            this.D.setVisibility(8);
            this.v.setBackgroundResource(R.drawable.tbsearch_layered_srp_onesearch_mask_no_tab);
        }
    }

    public void d(WeexBean weexBean) {
        JSONObject b;
        IpChange ipChange = $ipChange;
        boolean z = true;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af05a4be", new Object[]{this, weexBean});
        } else if (weexBean == null || getView() == 0 || (b = com.taobao.android.searchbaseframe.util.a.b(weexBean.model, "style")) == null) {
        } else {
            String string = b.getString("width");
            String string2 = b.getString("height");
            if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2)) {
                return;
            }
            int b2 = g.b(string, -1);
            int b3 = g.b(string2, -1);
            if (b2 <= 0 || b3 <= 0) {
                return;
            }
            this.f = TextUtils.equals(b.getString("isGiraffe"), nom.VALUE_YES);
            this.i = b.getString("showType");
            this.k = b.getString("enterAnimation");
            this.p = g.b(b.getString("collapseSecond"), -1);
            this.q = g.b(b.getString("repeatCollapseSecond"), -1);
            this.s = TextUtils.equals(nom.VALUE_YES, b.getString("enableGuide"));
            this.o = (int) ((b3 / b2) * ntx.a());
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
            v();
            this.d = l.b(this.b);
            this.e = l.b(this.c);
            int a2 = ntx.a(getActivity());
            this.n = a2 - l.a(g.b(b.getString("fullBottomSearchListHeight"), 0));
            this.n -= this.b + this.c;
            int b4 = g.b(b.getString("advanceBottomSearchListHeight"), -1);
            if (b4 > 0) {
                this.m = a2 - l.a(b4);
                this.m -= this.b + this.c;
            }
            this.m = Math.min(this.m, this.n);
            this.m = Math.max(this.m, this.o);
            this.h = b.getString(com.taobao.linkmanager.flowout.c.DEGTAGE_H5URL);
            if (!TextUtils.isEmpty(this.h)) {
                this.h = y.a(this.h, "offsetbottom", String.valueOf(this.e));
            }
            this.g = TextUtils.equals(b.getString("disableAutoExpand"), nom.VALUE_YES);
            this.t = TextUtils.equals(b.getString(nom.KEY_IMMERSE_STYLE), nom.VALUE_YES);
            if (!this.t) {
                this.w.setVisibility(8);
            }
            if (!this.t) {
                i = this.b;
            }
            ((FrameLayout) getView()).setPadding(((FrameLayout) getView()).getPaddingLeft(), i, ((FrameLayout) getView()).getPaddingRight(), ((FrameLayout) getView()).getPaddingBottom());
            this.x = g.a(b.getString("tabTextNormalColor"), (Integer) null);
            this.y = g.a(b.getString("tabTextSelectedColor"), (Integer) null);
            this.z = Integer.valueOf(SFPromotionBean.a(b.getString("statusBarStyle")));
        }
    }

    private void h() {
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
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
            ((FrameLayout) getView()).post(new Runnable() { // from class: com.taobao.search.sf.widgets.list.listcell.weex.SearchSceneEnhancedWeexModWidget.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        SearchSceneEnhancedWeexModWidget.this.u();
                    }
                }
            });
        } else if (c != 1 || (i = this.m) <= (i2 = this.o)) {
        } else {
            a(i, i2);
        }
    }

    public void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("686427c", new Object[]{this});
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

    @Override // com.taobao.search.sf.widgets.list.listcell.weex.e, tb.jzf
    public void a(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            return;
        }
        super.a(map);
        map.put("immersedTopHeight", Integer.valueOf(this.d));
        map.put("immersedBottomHeight", Integer.valueOf(this.e));
        int w = w();
        if (w <= 0) {
            return;
        }
        map.put("containerHeight", String.valueOf(l.b(w)));
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.view.View] */
    public int w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6a27171", new Object[]{this})).intValue();
        }
        iul root = getRoot();
        if (!(root instanceof irr)) {
            return 0;
        }
        return ((irr) root).getView().getMeasuredHeight();
    }

    @Override // com.taobao.search.sf.widgets.list.listcell.weex.e, tb.jzf
    public FrameLayout r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("51c75940", new Object[]{this});
        }
        SceneHeaderContainer x = x();
        x.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.u = new FrameLayout(getActivity());
        this.u.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        x.addView(this.u);
        this.w = LayoutInflater.from(getActivity()).inflate(R.layout.tbsearch_scene_layer_mask, (ViewGroup) x, false);
        this.v = this.w.findViewById(R.id.v_non_gradient_mask);
        this.D = this.w.findViewById(R.id.v_gradient_mask_bottom);
        x.addView(this.w);
        return x;
    }

    public SceneHeaderContainer x() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SceneHeaderContainer) ipChange.ipc$dispatch("d64965d7", new Object[]{this}) : new SceneHeaderContainer(getActivity());
    }

    @Override // tb.jzf
    public com.taobao.android.xsearchplugin.weex.weex.a p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.xsearchplugin.weex.weex.a) ipChange.ipc$dispatch("b97cef3c", new Object[]{this}) : new b(this.mActivity, c(), this, this, q(), getModel());
    }

    @Override // tb.jzf, com.taobao.android.xsearchplugin.weex.weex.a.InterfaceC0626a
    public void a(com.taobao.android.xsearchplugin.weex.weex.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e632142", new Object[]{this, dVar});
            return;
        }
        super.a(dVar);
        this.r = true;
        this.f29878a.a((ViewGroup) this.u, (WXSDKInstance) dVar, false);
        if (!this.s) {
            a(this.i, this.p);
        } else if (TextUtils.equals(this.k, "drop")) {
            ((FrameLayout) getView()).postDelayed(new Runnable() { // from class: com.taobao.search.sf.widgets.list.listcell.weex.SearchSceneEnhancedWeexModWidget.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    SearchSceneEnhancedWeexModWidget searchSceneEnhancedWeexModWidget = SearchSceneEnhancedWeexModWidget.this;
                    SearchSceneEnhancedWeexModWidget.a(searchSceneEnhancedWeexModWidget, SearchSceneEnhancedWeexModWidget.a(searchSceneEnhancedWeexModWidget), SearchSceneEnhancedWeexModWidget.b(SearchSceneEnhancedWeexModWidget.this));
                    if (SearchSceneEnhancedWeexModWidget.c(SearchSceneEnhancedWeexModWidget.this) > 0) {
                        SearchSceneEnhancedWeexModWidget.a(SearchSceneEnhancedWeexModWidget.this, "");
                    } else {
                        SearchSceneEnhancedWeexModWidget.a(SearchSceneEnhancedWeexModWidget.this, "");
                    }
                }
            }, 500L);
        } else {
            a(this.i, this.p);
        }
    }

    public void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ccb801", new Object[]{this});
            return;
        }
        a aVar = this.B;
        if (aVar == null) {
            return;
        }
        aVar.destroyAndRemoveFromParent();
        this.B = null;
    }

    private void a(final String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ad11", new Object[]{this, str, new Integer(i)});
        } else if (i <= 0) {
        } else {
            z();
            this.B = new a(getActivity(), this, getModel(), (ViewGroup) getView(), new iur() { // from class: com.taobao.search.sf.widgets.list.listcell.weex.SearchSceneEnhancedWeexModWidget.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.iur
                public void a(View view) {
                    int c;
                    int d;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9501e36a", new Object[]{this, view});
                        return;
                    }
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
                    layoutParams.gravity = 49;
                    int d2 = (SearchSceneEnhancedWeexModWidget.d(SearchSceneEnhancedWeexModWidget.this) + SearchSceneEnhancedWeexModWidget.this.b) - l.a(41);
                    if (TextUtils.equals(str, "full")) {
                        c = SearchSceneEnhancedWeexModWidget.e(SearchSceneEnhancedWeexModWidget.this);
                        d = SearchSceneEnhancedWeexModWidget.d(SearchSceneEnhancedWeexModWidget.this);
                    } else {
                        if (TextUtils.equals(str, "advance")) {
                            c = SearchSceneEnhancedWeexModWidget.c(SearchSceneEnhancedWeexModWidget.this);
                            d = SearchSceneEnhancedWeexModWidget.d(SearchSceneEnhancedWeexModWidget.this);
                        }
                        ((FrameLayout) SearchSceneEnhancedWeexModWidget.this.getView()).addView(view, layoutParams);
                        view.setTranslationY(d2);
                    }
                    d2 += c - d;
                    ((FrameLayout) SearchSceneEnhancedWeexModWidget.this.getView()).addView(view, layoutParams);
                    view.setTranslationY(d2);
                }

                @Override // tb.iur
                public void b(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("91037249", new Object[]{this, view});
                    } else {
                        ((FrameLayout) SearchSceneEnhancedWeexModWidget.this.getView()).removeView(view);
                    }
                }
            });
            this.B.a(Integer.valueOf(i));
            this.B.attachToContainer();
            this.B.b();
        }
    }

    @Override // tb.jzf, com.taobao.android.xsearchplugin.weex.weex.a.InterfaceC0626a
    public void a(com.taobao.android.xsearchplugin.weex.weex.d dVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cce5d56", new Object[]{this, dVar, str, str2});
            return;
        }
        super.a(dVar, str, str2);
        if (this.r) {
            return;
        }
        if (!TextUtils.isEmpty(this.h)) {
            a(this.h);
        } else {
            ((FrameLayout) getView()).setVisibility(8);
        }
        this.f = false;
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        this.u.setVisibility(8);
        postScopeEvent(iqt.h.a("degrade"), "childPageWidget");
        b("degrade");
        if (this.l == null) {
            this.l = new com.taobao.search.sf.widgets.onesearch.e(getActivity(), this, (com.taobao.search.sf.a) getModel(), (ViewGroup) getView(), new iur() { // from class: com.taobao.search.sf.widgets.list.listcell.weex.SearchSceneEnhancedWeexModWidget.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.iur
                public void a(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9501e36a", new Object[]{this, view});
                    } else {
                        ((FrameLayout) SearchSceneEnhancedWeexModWidget.this.getView()).addView(view, 0);
                    }
                }

                @Override // tb.iur
                public void b(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("91037249", new Object[]{this, view});
                    } else {
                        ((FrameLayout) SearchSceneEnhancedWeexModWidget.this.getView()).removeView(view);
                    }
                }
            }, null);
            this.l.a(new com.taobao.search.mmd.onesearch.c());
            this.l.attachToContainer();
        }
        this.l.a(this.b + this.o + this.c);
        this.l.a(str);
    }

    public void onEventMainThread(iqt.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcd5c88c", new Object[]{this, aVar});
        } else if (!getModel().g()) {
        } else {
            c(aVar.f29233a);
        }
    }

    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
            return;
        }
        FrameLayout frameLayout = this.u;
        if (frameLayout != null) {
            frameLayout.setTranslationY(i * 0.5f);
        }
        if ("advance".equals(this.j) && i != 0) {
            this.j = "normal";
            postScopeEvent(iqt.h.a("userScroll"), "childPageWidget");
        }
        a(Math.abs(i));
    }

    private void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        WXSDKInstance c = this.f29878a.c();
        if (c == null) {
            return;
        }
        if (i >= this.o && this.C) {
            this.C = false;
            c.onActivityPause();
        } else if (i >= this.o || this.C) {
        } else {
            this.C = true;
            c.onActivityResume();
        }
    }

    public void onEventMainThread(iqt.g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcd882c6", new Object[]{this, gVar});
        } else if (!this.f) {
        } else {
            this.j = "full";
            this.A = 10002;
            b(gVar.f29234a);
            int i = this.q;
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
        } else if (!this.f) {
        } else {
            this.j = "normal";
            z();
            this.A = 10001;
            b(hVar.f29235a);
        }
    }

    public void onEventMainThread(iqt.i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcd96b84", new Object[]{this, iVar});
        } else if (!this.f) {
        } else {
            this.j = "hidden";
            z();
            this.A = 10003;
            b(iVar.f29236a);
        }
    }

    private void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        HashMap hashMap = new HashMap();
        int i = this.A;
        String str2 = i == 10002 ? "full" : i == 10003 ? "hidden" : "normal";
        hashMap.put("showType", str2);
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("triggerSource", str);
        }
        HashMap hashMap2 = new HashMap();
        String str3 = getModel().d().getTotalSearchResult() != 0 ? ((BaseSearchResult) getModel().d().getTotalSearchResult()).getMainInfo().rn : "";
        if (!TextUtils.isEmpty(str3)) {
            hashMap2.put(aw.PARAM_SEARCH_KEYWORD_RN, str3);
        }
        hashMap.put("trace", hashMap2);
        if (this.f29878a.c() != null) {
            this.f29878a.c().a("onOperateSearchList", (Map<String, Object>) hashMap);
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
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9088278f", new Object[]{this})).intValue() : this.o;
    }

    public void onEventMainThread(nww.a aVar) {
        WXSDKInstance c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26bf964a", new Object[]{this, aVar});
        } else if (getModel().g() || (c = this.f29878a.c()) == null) {
        } else {
            c.a(aVar.f31822a, aVar.b, aVar.c);
        }
    }

    /* loaded from: classes8.dex */
    public class SceneHeaderContainer extends FrameLayout implements com.taobao.android.searchbaseframe.uikit.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public int mDownY;
        public boolean mHideSceneLayer;
        public View.OnTouchListener mInterceptTouchListener;
        public boolean mSkipIntercept;

        static {
            kge.a(1233646265);
            kge.a(-1593312073);
        }

        public static /* synthetic */ Object ipc$super(SceneHeaderContainer sceneHeaderContainer, String str, Object... objArr) {
            if (str.hashCode() == -407533570) {
                return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public SceneHeaderContainer(Context context) {
            super(context);
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
            if (SearchSceneEnhancedWeexModWidget.this.f && SearchSceneEnhancedWeexModWidget.f(SearchSceneEnhancedWeexModWidget.this) != 10002) {
                this.mSkipIntercept = true;
                if (!SearchSceneEnhancedWeexModWidget.this.g) {
                    SearchSceneEnhancedWeexModWidget.this.postEvent(iqt.g.a("clickCoverExpand"));
                }
                return false;
            }
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                this.mSkipIntercept = false;
                this.mHideSceneLayer = false;
                this.mDownY = (int) motionEvent.getY();
                return false;
            }
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int y = (int) (motionEvent.getY() - this.mDownY);
                    if (y < 0 && Math.abs(y) > SearchSceneEnhancedWeexModWidget.HIDDEN_THRESHOLD) {
                        this.mHideSceneLayer = true;
                    } else {
                        this.mHideSceneLayer = false;
                    }
                }
            } else if (this.mHideSceneLayer && !this.mSkipIntercept) {
                SearchSceneEnhancedWeexModWidget.this.postEvent(iqt.i.a("fromWeex"));
            }
            return super.onInterceptTouchEvent(motionEvent);
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

    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.t;
    }

    public Integer e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Integer) ipChange.ipc$dispatch("2ea92693", new Object[]{this}) : this.x;
    }

    public Integer f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Integer) ipChange.ipc$dispatch("78dabfd4", new Object[]{this}) : this.y;
    }

    public Integer g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Integer) ipChange.ipc$dispatch("c30c5915", new Object[]{this}) : this.z;
    }
}
