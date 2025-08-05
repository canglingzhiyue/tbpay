package com.taobao.search.sf.newsearch.widgets;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.os.Handler;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
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
import com.taobao.android.searchbaseframe.util.j;
import com.taobao.android.weex_framework.p;
import com.taobao.android.weex_framework.util.i;
import com.taobao.search.common.util.r;
import com.taobao.search.mmd.datasource.bean.SFPromotionBean;
import com.taobao.search.refactor.m;
import com.taobao.search.sf.datasource.CommonSearchResult;
import com.taobao.search.sf.widgets.list.listcell.weex.SearchSceneEnhancedMuiseModWidget;
import kotlin.TypeCastException;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.iqt;
import tb.irp;
import tb.iru;
import tb.ise;
import tb.itn;
import tb.iul;
import tb.ium;
import tb.iur;
import tb.kge;
import tb.nom;
import tb.nsy;
import tb.nsz;
import tb.nta;
import tb.ntx;

/* loaded from: classes8.dex */
public final class NSSceneHeaderMuiseWidget extends SearchSceneEnhancedMuiseModWidget {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;
    private static final ise<irp, ? extends itn> r;
    private Integer g_;
    private boolean h;
    private int i;
    private int j;
    private int k;
    private nsy l;
    private Integer m;
    private Integer n;
    private int p;
    private Boolean q;

    /* loaded from: classes8.dex */
    public static final class c implements nsz {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // tb.nsz
        public void a(boolean z) {
            p e;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put((JSONObject) "sticky", String.valueOf(z));
            com.taobao.android.xsearchplugin.muise.a g = NSSceneHeaderMuiseWidget.g(NSSceneHeaderMuiseWidget.this);
            if (g == null || (e = g.e()) == null) {
                return;
            }
            e.sendInstanceMessage("MUISE", "stickychange", jSONObject);
        }
    }

    /* loaded from: classes8.dex */
    public static final class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ int b;

        public d(int i) {
            this.b = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            FrameLayout it = (FrameLayout) NSSceneHeaderMuiseWidget.this.getView();
            if (it == null) {
                return;
            }
            NSSceneHeaderMuiseWidget.a(NSSceneHeaderMuiseWidget.this, this.b);
            q.a((Object) it, "it");
            it.getLayoutParams().height = this.b;
            it.requestLayout();
            if (!q.a((Object) NSSceneHeaderMuiseWidget.e(NSSceneHeaderMuiseWidget.this), (Object) true)) {
                return;
            }
            iru<? extends com.taobao.android.searchbaseframe.datasource.impl.a<? extends BaseSearchResult, ?>> model = NSSceneHeaderMuiseWidget.this.getModel();
            q.a((Object) model, "model");
            com.taobao.android.searchbaseframe.datasource.impl.a<? extends BaseSearchResult, ?> d = model.d();
            q.a((Object) d, "model.scopeDatasource");
            BaseSearchResult baseSearchResult = (BaseSearchResult) d.getTotalSearchResult();
            if (!(baseSearchResult instanceof CommonSearchResult)) {
                baseSearchResult = null;
            }
            CommonSearchResult commonSearchResult = (CommonSearchResult) baseSearchResult;
            if (commonSearchResult == null) {
                return;
            }
            commonSearchResult.sceneStickyHeight = this.b - NSSceneHeaderMuiseWidget.f(NSSceneHeaderMuiseWidget.this);
        }
    }

    /* loaded from: classes8.dex */
    public static final class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ int b;
        public final /* synthetic */ int c;

        public e(int i, int i2) {
            this.b = i;
            this.c = i2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            nsy c = NSSceneHeaderMuiseWidget.c(NSSceneHeaderMuiseWidget.this);
            if (c == null) {
                return;
            }
            c.e(NSSceneHeaderMuiseWidget.this.y() - ((NSSceneHeaderMuiseWidget.d(NSSceneHeaderMuiseWidget.this) - this.b) + this.c));
        }
    }

    /* loaded from: classes8.dex */
    public static final class f implements com.taobao.search.sf.newsearch.widgets.e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // com.taobao.search.sf.newsearch.widgets.e
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            View mMaskView = NSSceneHeaderMuiseWidget.h(NSSceneHeaderMuiseWidget.this);
            q.a((Object) mMaskView, "mMaskView");
            mMaskView.setVisibility(8);
        }
    }

    public static /* synthetic */ Object ipc$super(NSSceneHeaderMuiseWidget nSSceneHeaderMuiseWidget, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1984641760:
                super.aG_();
                return null;
            case -1956012609:
                super.aH_();
                return null;
            case -589790522:
                super.onEventMainThread((iqt.g) objArr[0]);
                return null;
            case -589760731:
                super.onEventMainThread((iqt.h) objArr[0]);
                return null;
            case -207205339:
                return new Integer(super.a((String) objArr[0]));
            case 105768056:
                super.q();
                return null;
            case 111309182:
                super.w();
                return null;
            case 112232703:
                super.x();
                return null;
            case 189826977:
                super.a((MuiseBean) objArr[0]);
                return null;
            case 1545142740:
                super.a(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).floatValue());
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.taobao.search.sf.widgets.list.listcell.weex.SearchSceneEnhancedMuiseModWidget
    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        }
    }

    @Override // com.taobao.search.sf.widgets.list.listcell.weex.SearchSceneEnhancedMuiseModWidget
    public int c(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ab8b44cc", new Object[]{this, new Integer(i)})).intValue() : i;
    }

    @Override // com.taobao.search.sf.widgets.list.listcell.weex.SearchSceneEnhancedMuiseModWidget
    public void e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef4f617", new Object[]{this, new Integer(i)});
        }
    }

    public static final /* synthetic */ void a(NSSceneHeaderMuiseWidget nSSceneHeaderMuiseWidget, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb7cb3fc", new Object[]{nSSceneHeaderMuiseWidget, new Integer(i)});
        } else {
            nSSceneHeaderMuiseWidget.k = i;
        }
    }

    public static final /* synthetic */ boolean a(NSSceneHeaderMuiseWidget nSSceneHeaderMuiseWidget) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("41eb3beb", new Object[]{nSSceneHeaderMuiseWidget})).booleanValue() : nSSceneHeaderMuiseWidget.d;
    }

    public static final /* synthetic */ boolean b(NSSceneHeaderMuiseWidget nSSceneHeaderMuiseWidget) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7acb9c8a", new Object[]{nSSceneHeaderMuiseWidget})).booleanValue() : nSSceneHeaderMuiseWidget.f;
    }

    public static final /* synthetic */ nsy c(NSSceneHeaderMuiseWidget nSSceneHeaderMuiseWidget) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (nsy) ipChange.ipc$dispatch("664f4ed", new Object[]{nSSceneHeaderMuiseWidget}) : nSSceneHeaderMuiseWidget.l;
    }

    public static final /* synthetic */ int d(NSSceneHeaderMuiseWidget nSSceneHeaderMuiseWidget) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ec8c5db7", new Object[]{nSSceneHeaderMuiseWidget})).intValue() : nSSceneHeaderMuiseWidget.k;
    }

    public static final /* synthetic */ Boolean e(NSSceneHeaderMuiseWidget nSSceneHeaderMuiseWidget) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Boolean) ipChange.ipc$dispatch("a761d20", new Object[]{nSSceneHeaderMuiseWidget}) : nSSceneHeaderMuiseWidget.q;
    }

    public static final /* synthetic */ int f(NSSceneHeaderMuiseWidget nSSceneHeaderMuiseWidget) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5e4d1ef5", new Object[]{nSSceneHeaderMuiseWidget})).intValue() : nSSceneHeaderMuiseWidget.j;
    }

    public static final /* synthetic */ com.taobao.android.xsearchplugin.muise.a g(NSSceneHeaderMuiseWidget nSSceneHeaderMuiseWidget) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.xsearchplugin.muise.a) ipChange.ipc$dispatch("7d26b5ce", new Object[]{nSSceneHeaderMuiseWidget}) : nSSceneHeaderMuiseWidget.f16263a;
    }

    public static final /* synthetic */ View h(NSSceneHeaderMuiseWidget nSSceneHeaderMuiseWidget) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("ef6ce882", new Object[]{nSSceneHeaderMuiseWidget}) : nSSceneHeaderMuiseWidget.x;
    }

    @Override // com.taobao.search.sf.widgets.list.listcell.weex.SearchSceneEnhancedMuiseModWidget, com.taobao.search.musie.q, com.taobao.android.xsearchplugin.muise.o, tb.iup, tb.iui
    public /* synthetic */ void bindWithData(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2491dd0", new Object[]{this, obj});
        } else {
            a((MuiseBean) obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NSSceneHeaderMuiseWidget(Activity activity, ium parent, iru<? extends com.taobao.android.searchbaseframe.datasource.impl.a<? extends BaseSearchResult, ?>> model, TemplateBean bean, ViewGroup viewGroup, iur iurVar) {
        super(activity, parent, model, bean, viewGroup, iurVar);
        q.c(activity, "activity");
        q.c(parent, "parent");
        q.c(model, "model");
        q.c(bean, "bean");
        this.i = -1;
    }

    @Override // com.taobao.search.sf.widgets.list.listcell.weex.SearchSceneEnhancedMuiseModWidget, tb.iom
    public int aK_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9088278f", new Object[]{this})).intValue();
        }
        if (getView() == 0) {
            return 0;
        }
        FrameLayout frameLayout = (FrameLayout) getView();
        if (frameLayout == null) {
            q.a();
        }
        q.a((Object) frameLayout, "view!!");
        return frameLayout.getMeasuredHeight();
    }

    @Override // com.taobao.search.sf.widgets.list.listcell.weex.SearchSceneEnhancedMuiseModWidget
    public void onEventMainThread(iqt.h event) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcd8f725", new Object[]{this, event});
            return;
        }
        q.c(event, "event");
        super.onEventMainThread(event);
        nsy nsyVar = this.l;
        if (nsyVar == null) {
            return;
        }
        nsyVar.i();
    }

    @Override // com.taobao.search.sf.widgets.list.listcell.weex.SearchSceneEnhancedMuiseModWidget, tb.iom
    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.h;
    }

    @Override // com.taobao.search.sf.widgets.list.listcell.weex.SearchSceneEnhancedMuiseModWidget
    public void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad401d78", new Object[]{this, new Integer(i)});
        } else {
            new Handler().post(new d(i));
        }
    }

    @Override // com.taobao.search.sf.widgets.list.listcell.weex.SearchSceneEnhancedMuiseModWidget, tb.iom
    public Integer e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Integer) ipChange.ipc$dispatch("2ea92693", new Object[]{this}) : this.m;
    }

    @Override // com.taobao.search.sf.widgets.list.listcell.weex.SearchSceneEnhancedMuiseModWidget, tb.iom
    public Integer f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Integer) ipChange.ipc$dispatch("78dabfd4", new Object[]{this}) : this.n;
    }

    @Override // com.taobao.search.sf.widgets.list.listcell.weex.SearchSceneEnhancedMuiseModWidget, tb.iom
    public Integer g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Integer) ipChange.ipc$dispatch("c30c5915", new Object[]{this}) : this.g_;
    }

    @Override // com.taobao.search.sf.widgets.list.listcell.weex.SearchSceneEnhancedMuiseModWidget
    public int a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{this, str})).intValue();
        }
        int a2 = super.a(str);
        return a2 == -1 ? (int) g.a(str, -1.0f) : a2;
    }

    @Override // com.taobao.search.sf.widgets.list.listcell.weex.SearchSceneEnhancedMuiseModWidget
    public void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a2717e", new Object[]{this});
            return;
        }
        super.w();
        this.b = this.j;
    }

    @Override // com.taobao.search.musie.q, tb.itl
    public void a(boolean z, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1901d4", new Object[]{this, new Boolean(z), new Float(f2)});
            return;
        }
        FrameLayout frameLayout = (FrameLayout) getView();
        if (frameLayout != null) {
            if (frameLayout != null) {
                NSSceneHeaderContainer nSSceneHeaderContainer = (NSSceneHeaderContainer) frameLayout;
                com.taobao.search.sf.newsearch.widgets.f maskHelper = nSSceneHeaderContainer.getMaskHelper();
                if (maskHelper.a()) {
                    maskHelper.a(f2);
                    float f3 = 1.0f - f2;
                    FrameLayout frameLayout2 = (FrameLayout) getView();
                    if (frameLayout2 == null) {
                        q.a();
                    }
                    q.a((Object) frameLayout2, "view!!");
                    postEvent(iqt.a.a((int) (f3 * frameLayout2.getMeasuredHeight())));
                } else if (z) {
                    Boolean bool = this.q;
                    if ((bool == null || q.a((Object) bool, (Object) false)) && this.p <= 0) {
                        nSSceneHeaderContainer.setAlpha(f2);
                        frameLayout.invalidate();
                    }
                    float f4 = 1.0f - f2;
                    FrameLayout frameLayout3 = (FrameLayout) getView();
                    if (frameLayout3 == null) {
                        q.a();
                    }
                    q.a((Object) frameLayout3, "view!!");
                    postEvent(iqt.a.a((int) (f4 * frameLayout3.getMeasuredHeight())));
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.taobao.search.sf.newsearch.widgets.NSSceneHeaderMuiseWidget.NSSceneHeaderContainer");
            }
        }
        if (f2 < 1) {
            B();
        }
        super.a(z, f2);
    }

    @Override // com.taobao.search.sf.widgets.list.listcell.weex.SearchSceneEnhancedMuiseModWidget, com.taobao.search.musie.q, com.taobao.android.xsearchplugin.muise.o
    public void a(MuiseBean muiseBean) {
        FrameLayout frameLayout;
        ViewGroup.LayoutParams layoutParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5087a1", new Object[]{this, muiseBean});
            return;
        }
        d(muiseBean);
        super.a(muiseBean);
        if (!this.d && (frameLayout = (FrameLayout) getView()) != null && (layoutParams = frameLayout.getLayoutParams()) != null) {
            layoutParams.height = this.k;
        }
        FrameLayout frameLayout2 = (FrameLayout) getView();
        if (frameLayout2 == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.taobao.search.sf.newsearch.widgets.NSSceneHeaderMuiseWidget.NSSceneHeaderContainer");
        }
        com.taobao.search.sf.newsearch.widgets.f maskHelper = ((NSSceneHeaderContainer) frameLayout2).getMaskHelper();
        maskHelper.a(this.h);
        maskHelper.b(this.d);
        maskHelper.a(new f());
    }

    @Override // com.taobao.search.sf.widgets.list.listcell.weex.SearchSceneEnhancedMuiseModWidget
    public void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b088ff", new Object[]{this});
            return;
        }
        super.x();
        nsy nsyVar = this.l;
        if (nsyVar == null) {
            return;
        }
        nsyVar.a(false);
    }

    @Override // com.taobao.search.sf.widgets.list.listcell.weex.SearchSceneEnhancedMuiseModWidget
    public void a(int i, int i2) {
        FrameLayout frameLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (getView() == 0 || (frameLayout = (FrameLayout) getView()) == null) {
        } else {
            frameLayout.post(new e(i2, i));
        }
    }

    private final void d(MuiseBean muiseBean) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d5be9be", new Object[]{this, muiseBean});
        } else if (getView() == 0 || muiseBean == null) {
        } else {
            JSONObject jSONObject = muiseBean.model;
            q.a((Object) jSONObject, "bean.model");
            JSONObject b2 = com.taobao.android.searchbaseframe.util.a.b(jSONObject, "style");
            if (b2 == null) {
                return;
            }
            q.a((Object) b2, "FastJsonParseUtil.optJSO…model, \"style\") ?: return");
            this.h = TextUtils.equals(b2.getString(nom.KEY_IMMERSE_STYLE), nom.VALUE_YES);
            JSONObject jSONObject2 = muiseBean.extraStatus;
            q.a((Object) jSONObject2, "bean.extraStatus");
            jSONObject2.put((JSONObject) nom.KEY_IMMERSE_STYLE, String.valueOf(this.h));
            this.n = g.a(b2.getString("tabTextSelectedColor"), (Integer) null);
            this.m = g.a(b2.getString("tabTextNormalColor"), (Integer) null);
            this.g_ = Integer.valueOf(SFPromotionBean.a(b2.getString("statusBarStyle")));
            String string = b2.getString("width");
            String string2 = b2.getString("height");
            if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2)) {
                return;
            }
            int b3 = g.b(string, -1);
            int b4 = g.b(string2, -1);
            if (b3 <= 0 || b4 <= 0) {
                b3 = (int) g.a(string, -1.0f);
                b4 = (int) g.a(string2, -1.0f);
                if (b3 <= 0 || b4 <= 0) {
                    return;
                }
            }
            this.i = (int) (((b4 * 1.0f) * ntx.a()) / b3);
            this.k = (this.h ? this.j : 0) + this.i + (this.h ? j() : 0);
            String string3 = b2.getString("stickyHeight");
            this.q = b2.getBoolean("sticky");
            if (TextUtils.isEmpty(string3)) {
                return;
            }
            try {
                i = (int) i.a(string3);
            } catch (Exception unused) {
            }
            this.p = i;
            iru<? extends com.taobao.android.searchbaseframe.datasource.impl.a<? extends BaseSearchResult, ?>> model = getModel();
            q.a((Object) model, "getModel()");
            com.taobao.android.searchbaseframe.datasource.impl.a<? extends BaseSearchResult, ?> d2 = model.d();
            q.a((Object) d2, "getModel().scopeDatasource");
            BaseSearchResult baseSearchResult = (BaseSearchResult) d2.getTotalSearchResult();
            if (!(baseSearchResult instanceof CommonSearchResult)) {
                baseSearchResult = null;
            }
            CommonSearchResult commonSearchResult = (CommonSearchResult) baseSearchResult;
            if (commonSearchResult != null) {
                commonSearchResult.sceneStickyHeight = this.p;
            }
            if (!q.a((Object) this.q, (Object) true)) {
                return;
            }
            iru<? extends com.taobao.android.searchbaseframe.datasource.impl.a<? extends BaseSearchResult, ?>> model2 = getModel();
            q.a((Object) model2, "getModel()");
            com.taobao.android.searchbaseframe.datasource.impl.a<? extends BaseSearchResult, ?> d3 = model2.d();
            q.a((Object) d3, "getModel().scopeDatasource");
            BaseSearchResult baseSearchResult2 = (BaseSearchResult) d3.getTotalSearchResult();
            if (!(baseSearchResult2 instanceof CommonSearchResult)) {
                baseSearchResult2 = null;
            }
            CommonSearchResult commonSearchResult2 = (CommonSearchResult) baseSearchResult2;
            if (commonSearchResult2 == null) {
                return;
            }
            commonSearchResult2.sceneStickyHeight = this.i - this.j;
        }
    }

    @Override // com.taobao.search.musie.q, tb.itl
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.j = i;
        }
    }

    @Override // com.taobao.search.musie.q, tb.itl
    public int j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5eb3fe4", new Object[]{this})).intValue();
        }
        if (!this.h) {
            return 0;
        }
        if (this.g) {
            return this.c;
        }
        return j.a(10.0f);
    }

    @Override // com.taobao.search.sf.widgets.list.listcell.weex.SearchSceneEnhancedMuiseModWidget
    public void onEventMainThread(iqt.g event) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcd882c6", new Object[]{this, event});
            return;
        }
        q.c(event, "event");
        super.onEventMainThread(event);
        nsy nsyVar = this.l;
        if (nsyVar == null) {
            return;
        }
        nsyVar.a(!event.b);
    }

    @Override // com.taobao.search.sf.widgets.list.listcell.weex.SearchSceneEnhancedMuiseModWidget
    public SearchSceneEnhancedMuiseModWidget.SceneHeaderContainer a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SearchSceneEnhancedMuiseModWidget.SceneHeaderContainer) ipChange.ipc$dispatch("b907fe04", new Object[]{this, activity});
        }
        q.c(activity, "activity");
        return new NSSceneHeaderContainer(this, activity);
    }

    @Override // com.taobao.search.sf.widgets.list.listcell.weex.SearchSceneEnhancedMuiseModWidget, com.taobao.android.xsearchplugin.muise.o
    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
        } else if (this.i > 0) {
        } else {
            super.q();
        }
    }

    @Override // com.taobao.search.musie.q, tb.itl
    public void aG_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89b4c520", new Object[]{this});
            return;
        }
        super.aG_();
        k();
    }

    @Override // com.taobao.search.musie.q, tb.itl
    public void aH_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b699dbf", new Object[]{this});
            return;
        }
        super.aH_();
        l();
    }

    @Override // com.taobao.search.sf.widgets.list.listcell.weex.SearchSceneEnhancedMuiseModWidget
    public int y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6bea073", new Object[]{this})).intValue();
        }
        iul root = getRoot();
        q.a((Object) root, "root");
        if (!(root instanceof m)) {
            return 0;
        }
        FrameLayout frameLayout = (FrameLayout) ((m) root).getView();
        if (frameLayout == null) {
            q.a();
        }
        q.a((Object) frameLayout, "rootWidget.view!!");
        return frameLayout.getMeasuredHeight();
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.view.View] */
    @Override // com.taobao.search.sf.widgets.list.listcell.weex.SearchSceneEnhancedMuiseModWidget, com.taobao.search.musie.q, tb.itl
    public com.taobao.android.searchbaseframe.meta.uikit.header.behavior.a h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.searchbaseframe.meta.uikit.header.behavior.a) ipChange.ipc$dispatch("26ed9943", new Object[]{this});
        }
        if (this.d) {
            this.l = new nsy(getView(), this);
            nsy nsyVar = this.l;
            if (nsyVar != null) {
                nsyVar.a(this);
            }
            nsy nsyVar2 = this.l;
            if (nsyVar2 != null) {
                nsyVar2.d(this.c);
            }
            nsy nsyVar3 = this.l;
            if (nsyVar3 != null) {
                nsyVar3.c((y() - this.k) + j());
            }
            return this.l;
        } else if (this.p <= 0 && !q.a((Object) this.q, (Object) true)) {
            return null;
        } else {
            return new nta(getView(), this.q, this, this.h, this.p, new c());
        }
    }

    /* loaded from: classes8.dex */
    public final class NSSceneHeaderContainer extends SearchSceneEnhancedMuiseModWidget.SceneHeaderContainer {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private boolean intercepted;
        private final com.taobao.search.sf.newsearch.widgets.f maskHelper;
        public final /* synthetic */ NSSceneHeaderMuiseWidget this$0;

        static {
            kge.a(-1632388769);
        }

        public static /* synthetic */ Object ipc$super(NSSceneHeaderContainer nSSceneHeaderContainer, String str, Object... objArr) {
            switch (str.hashCode()) {
                case -1533054272:
                    return new Boolean(super.onNestedPreFling((View) objArr[0], ((Number) objArr[1]).floatValue(), ((Number) objArr[2]).floatValue()));
                case 623593120:
                    super.dispatchDraw((Canvas) objArr[0]);
                    return null;
                case 1389530587:
                    super.onSizeChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
                    return null;
                case 2075560917:
                    return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
                case 2114251219:
                    return new Boolean(super.onNestedFling((View) objArr[0], ((Number) objArr[1]).floatValue(), ((Number) objArr[2]).floatValue(), ((Boolean) objArr[3]).booleanValue()));
                default:
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
        }

        @Override // com.taobao.search.sf.widgets.list.listcell.weex.SearchSceneEnhancedMuiseModWidget.SceneHeaderContainer, android.support.v4.view.NestedScrollingParent2
        public boolean onStartNestedScroll(View child, View target, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3643ce32", new Object[]{this, child, target, new Integer(i), new Integer(i2)})).booleanValue();
            }
            q.c(child, "child");
            q.c(target, "target");
            return i == 2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NSSceneHeaderContainer(NSSceneHeaderMuiseWidget nSSceneHeaderMuiseWidget, Context context) {
            super(context);
            q.c(context, "context");
            this.this$0 = nSSceneHeaderMuiseWidget;
            NSSceneHeaderContainer nSSceneHeaderContainer = this;
            this.maskHelper = new com.taobao.search.sf.newsearch.widgets.f(nSSceneHeaderContainer);
            ViewCompat.setNestedScrollingEnabled(nSSceneHeaderContainer, true);
        }

        public final com.taobao.search.sf.newsearch.widgets.f getMaskHelper() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (com.taobao.search.sf.newsearch.widgets.f) ipChange.ipc$dispatch("7a90ef57", new Object[]{this}) : this.maskHelper;
        }

        @Override // android.view.View
        public void onSizeChanged(int i, int i2, int i3, int i4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("52d28ddb", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
                return;
            }
            super.onSizeChanged(i, i2, i3, i4);
            this.maskHelper.a(i2);
        }

        @Override // com.taobao.search.sf.widgets.list.listcell.weex.SearchSceneEnhancedMuiseModWidget.SceneHeaderContainer, android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent ev) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, ev})).booleanValue();
            }
            q.c(ev, "ev");
            if (this.mInterceptTouchListener != null) {
                this.mInterceptTouchListener.onTouch(this, ev);
            }
            return originInterceptTouch(ev);
        }

        @Override // android.view.ViewGroup, android.view.View
        public void dispatchDraw(Canvas canvas) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("252b46a0", new Object[]{this, canvas});
                return;
            }
            q.c(canvas, "canvas");
            super.dispatchDraw(canvas);
            this.maskHelper.a(canvas);
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchTouchEvent(MotionEvent ev) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, ev})).booleanValue();
            }
            q.c(ev, "ev");
            int actionMasked = ev.getActionMasked();
            if (actionMasked == 0) {
                if (NSSceneHeaderMuiseWidget.a(this.this$0) || com.taobao.search.sf.newsearch.widgets.c.a((int) ev.getRawX(), (int) ev.getRawY(), this)) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                    this.intercepted = true;
                }
                if (!NSSceneHeaderMuiseWidget.b(this.this$0) && NSSceneHeaderMuiseWidget.a(this.this$0)) {
                    nsy c = NSSceneHeaderMuiseWidget.c(this.this$0);
                    if (c != null) {
                        nsy.a(c, false, 1, null);
                    }
                    this.this$0.postScopeEvent(iqt.g.a("clickCoverExpand"), "childPageWidget");
                }
            } else if (actionMasked != 1) {
                if (actionMasked == 3 && this.intercepted) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                }
            } else if (this.intercepted) {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
            return super.dispatchTouchEvent(ev);
        }

        @Override // com.taobao.search.sf.widgets.list.listcell.weex.SearchSceneEnhancedMuiseModWidget.SceneHeaderContainer, android.support.v4.view.NestedScrollingParent2
        public void onStopNestedScroll(View target, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eaf68c3d", new Object[]{this, target, new Integer(i)});
                return;
            }
            q.c(target, "target");
            if (i != 0) {
                return;
            }
            this.mAccY = 0;
            if (this.mHideSceneLayer && !this.mSkipIntercept) {
                nsy c = NSSceneHeaderMuiseWidget.c(this.this$0);
                if (c != null) {
                    c.j();
                }
                this.this$0.postScopeEvent(iqt.i.a("fromWeex"), "childPageWidget");
            }
            this.mHideSceneLayer = false;
        }

        @Override // com.taobao.search.sf.widgets.list.listcell.weex.SearchSceneEnhancedMuiseModWidget.SceneHeaderContainer, android.support.v4.view.NestedScrollingParent2
        public void onNestedScroll(View target, int i, int i2, int i3, int i4, int i5) {
            IpChange ipChange = $ipChange;
            boolean z = true;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("64bba3db", new Object[]{this, target, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5)});
                return;
            }
            q.c(target, "target");
            if (i5 != 0) {
                if (!r.bP() || i2 != 0 || i4 <= 0 || !(target instanceof RecyclerView)) {
                    return;
                }
                ((RecyclerView) target).stopScroll();
                return;
            }
            this.mAccY += i4;
            if (i4 == 0 && i2 < 0) {
                this.mAccY = 0;
            }
            if (this.mAccY <= 0 || Math.abs(this.mAccY) <= SearchSceneEnhancedMuiseModWidget.HIDDEN_THRESHOLD) {
                z = false;
            }
            this.mHideSceneLayer = z;
        }

        @Override // com.taobao.search.sf.widgets.list.listcell.weex.SearchSceneEnhancedMuiseModWidget.SceneHeaderContainer, android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.NestedScrollingParent
        public boolean onNestedFling(View target, float f, float f2, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7e04e9d3", new Object[]{this, target, new Float(f), new Float(f2), new Boolean(z)})).booleanValue();
            }
            q.c(target, "target");
            if (Build.VERSION.SDK_INT >= 21) {
                return super.onNestedFling(target, f, f2, z);
            }
            return false;
        }

        @Override // com.taobao.search.sf.widgets.list.listcell.weex.SearchSceneEnhancedMuiseModWidget.SceneHeaderContainer, android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.NestedScrollingParent
        public boolean onNestedPreFling(View target, float f, float f2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a49f72c0", new Object[]{this, target, new Float(f), new Float(f2)})).booleanValue();
            }
            q.c(target, "target");
            if (Build.VERSION.SDK_INT >= 21) {
                return super.onNestedPreFling(target, f, f2);
            }
            return false;
        }
    }

    /* loaded from: classes8.dex */
    public static final class a {
        static {
            kge.a(-501536774);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    /* loaded from: classes8.dex */
    public static final class b<PARAMS, RESULT> implements ise<irp, itn> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final b INSTANCE = new b();

        @Override // tb.ise
        public final NSSceneHeaderMuiseWidget a(irp irpVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (NSSceneHeaderMuiseWidget) ipChange.ipc$dispatch("6296c450", new Object[]{this, irpVar});
            }
            Activity activity = irpVar.c;
            q.a((Object) activity, "param.activity");
            ium iumVar = irpVar.d;
            q.a((Object) iumVar, "param.parent");
            iru<? extends com.taobao.android.searchbaseframe.datasource.impl.a<? extends BaseSearchResult, ?>> iruVar = irpVar.e;
            q.a((Object) iruVar, "param.modelAdapter");
            TemplateBean templateBean = irpVar.f29258a;
            q.a((Object) templateBean, "param.templateBean");
            return new NSSceneHeaderMuiseWidget(activity, iumVar, iruVar, templateBean, irpVar.f, irpVar.g);
        }
    }

    static {
        kge.a(-1449389262);
        Companion = new a(null);
        r = b.INSTANCE;
    }
}
