package com.taobao.search.sf.newsearch.widgets;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.support.v4.view.NestedScrollingParent2;
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
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.android.searchbaseframe.nx3.bean.WeexBean;
import com.taobao.android.searchbaseframe.util.g;
import com.taobao.android.searchbaseframe.util.j;
import com.taobao.search.common.util.r;
import com.taobao.search.mmd.datasource.bean.SFPromotionBean;
import com.taobao.search.refactor.m;
import com.taobao.search.sf.widgets.list.listcell.weex.SearchSceneEnhancedWeexModWidget;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.iqt;
import tb.irp;
import tb.iru;
import tb.ise;
import tb.itl;
import tb.ito;
import tb.iul;
import tb.ium;
import tb.iur;
import tb.kge;
import tb.nom;
import tb.nsy;
import tb.ntx;

/* loaded from: classes8.dex */
public final class NSSceneHeaderWeexWidget extends SearchSceneEnhancedWeexModWidget implements itl {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;
    private static final ise<irp, ? extends ito> p;
    private boolean h;
    private int i;
    private int j;
    private int k;
    private Integer l;
    private Integer m;
    private Integer n;
    private nsy o;

    /* loaded from: classes8.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ int b;
        public final /* synthetic */ int c;

        public c(int i, int i2) {
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
            nsy a2 = NSSceneHeaderWeexWidget.a(NSSceneHeaderWeexWidget.this);
            if (a2 == null) {
                return;
            }
            a2.e(NSSceneHeaderWeexWidget.this.w() - ((NSSceneHeaderWeexWidget.d(NSSceneHeaderWeexWidget.this) - this.b) + this.c));
        }
    }

    public static /* synthetic */ Object ipc$super(NSSceneHeaderWeexWidget nSSceneHeaderWeexWidget, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -589760731:
                super.onEventMainThread((iqt.h) objArr[0]);
                return null;
            case 107615098:
                super.s();
                return null;
            case 109462140:
                super.u();
                return null;
            case 110385661:
                super.v();
                return null;
            case 2095332987:
                super.a((WeexBean) objArr[0]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.taobao.search.sf.widgets.list.listcell.weex.SearchSceneEnhancedWeexModWidget
    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
        }
    }

    @Override // com.taobao.search.sf.widgets.list.listcell.weex.e
    public String y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4c806420", new Object[]{this});
        }
        return null;
    }

    public static final /* synthetic */ nsy a(NSSceneHeaderWeexWidget nSSceneHeaderWeexWidget) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (nsy) ipChange.ipc$dispatch("ab123f45", new Object[]{nSSceneHeaderWeexWidget}) : nSSceneHeaderWeexWidget.o;
    }

    public static final /* synthetic */ boolean b(NSSceneHeaderWeexWidget nSSceneHeaderWeexWidget) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("82b8b552", new Object[]{nSSceneHeaderWeexWidget})).booleanValue() : nSSceneHeaderWeexWidget.f;
    }

    public static final /* synthetic */ boolean c(NSSceneHeaderWeexWidget nSSceneHeaderWeexWidget) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("740a44d3", new Object[]{nSSceneHeaderWeexWidget})).booleanValue() : nSSceneHeaderWeexWidget.g;
    }

    public static final /* synthetic */ int d(NSSceneHeaderWeexWidget nSSceneHeaderWeexWidget) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("655bd443", new Object[]{nSSceneHeaderWeexWidget})).intValue() : nSSceneHeaderWeexWidget.k;
    }

    @Override // com.taobao.search.sf.widgets.list.listcell.weex.SearchSceneEnhancedWeexModWidget, com.taobao.search.sf.widgets.list.listcell.weex.e, tb.jzf, tb.iup, tb.iui
    public /* synthetic */ void bindWithData(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2491dd0", new Object[]{this, obj});
        } else {
            a((WeexBean) obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NSSceneHeaderWeexWidget(Activity activity, ium parent, iru<? extends com.taobao.android.searchbaseframe.datasource.impl.a<? extends BaseSearchResult, ?>> model, TemplateBean bean, ViewGroup viewGroup, iur iurVar) {
        super(activity, parent, model, bean, viewGroup, iurVar);
        q.c(activity, "activity");
        q.c(parent, "parent");
        q.c(model, "model");
        q.c(bean, "bean");
        this.i = -1;
    }

    @Override // com.taobao.search.sf.widgets.list.listcell.weex.SearchSceneEnhancedWeexModWidget, tb.iom
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

    @Override // com.taobao.search.sf.widgets.list.listcell.weex.SearchSceneEnhancedWeexModWidget
    public void a(int i, int i2) {
        FrameLayout frameLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (getView() == 0 || (frameLayout = (FrameLayout) getView()) == null) {
        } else {
            frameLayout.post(new c(i2, i));
        }
    }

    @Override // com.taobao.search.sf.widgets.list.listcell.weex.SearchSceneEnhancedWeexModWidget
    public void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("686427c", new Object[]{this});
            return;
        }
        super.u();
        nsy nsyVar = this.o;
        if (nsyVar == null) {
            return;
        }
        nsyVar.a(false);
    }

    @Override // com.taobao.search.sf.widgets.list.listcell.weex.SearchSceneEnhancedWeexModWidget, tb.iom
    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.h;
    }

    @Override // com.taobao.search.sf.widgets.list.listcell.weex.SearchSceneEnhancedWeexModWidget, tb.iom
    public Integer e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Integer) ipChange.ipc$dispatch("2ea92693", new Object[]{this}) : this.l;
    }

    @Override // com.taobao.search.sf.widgets.list.listcell.weex.SearchSceneEnhancedWeexModWidget, tb.iom
    public Integer f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Integer) ipChange.ipc$dispatch("78dabfd4", new Object[]{this}) : this.m;
    }

    @Override // com.taobao.search.sf.widgets.list.listcell.weex.SearchSceneEnhancedWeexModWidget, tb.iom
    public Integer g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Integer) ipChange.ipc$dispatch("c30c5915", new Object[]{this}) : this.n;
    }

    @Override // com.taobao.search.sf.widgets.list.listcell.weex.SearchSceneEnhancedWeexModWidget, com.taobao.search.sf.widgets.list.listcell.weex.e, tb.jzf
    public void a(WeexBean weexBean) {
        FrameLayout frameLayout;
        ViewGroup.LayoutParams layoutParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ce43e7b", new Object[]{this, weexBean});
            return;
        }
        e(weexBean);
        super.a(weexBean);
        if (this.f || (frameLayout = (FrameLayout) getView()) == null || (layoutParams = frameLayout.getLayoutParams()) == null) {
            return;
        }
        layoutParams.height = this.k;
    }

    @Override // com.taobao.search.sf.widgets.list.listcell.weex.SearchSceneEnhancedWeexModWidget
    public void onEventMainThread(iqt.h event) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcd8f725", new Object[]{this, event});
            return;
        }
        q.c(event, "event");
        super.onEventMainThread(event);
        nsy nsyVar = this.o;
        if (nsyVar == null) {
            return;
        }
        nsyVar.i();
    }

    @Override // com.taobao.search.sf.widgets.list.listcell.weex.SearchSceneEnhancedWeexModWidget
    public void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69459fd", new Object[]{this});
            return;
        }
        super.v();
        this.b = this.j;
    }

    private final void e(WeexBean weexBean) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfbb717f", new Object[]{this, weexBean});
        } else if (getView() == 0 || weexBean == null) {
        } else {
            JSONObject jSONObject = weexBean.model;
            q.a((Object) jSONObject, "bean.model");
            JSONObject b2 = com.taobao.android.searchbaseframe.util.a.b(jSONObject, "style");
            if (b2 == null) {
                return;
            }
            q.a((Object) b2, "FastJsonParseUtil.optJSO…model, \"style\") ?: return");
            this.h = TextUtils.equals(b2.getString(nom.KEY_IMMERSE_STYLE), nom.VALUE_YES);
            JSONObject jSONObject2 = weexBean.extraStatus;
            q.a((Object) jSONObject2, "bean.extraStatus");
            jSONObject2.put((JSONObject) nom.KEY_IMMERSE_STYLE, String.valueOf(this.h));
            this.m = g.a(b2.getString("tabTextSelectedColor"), (Integer) null);
            this.l = g.a(b2.getString("tabTextNormalColor"), (Integer) null);
            this.n = Integer.valueOf(SFPromotionBean.a(b2.getString("statusBarStyle")));
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
            int i2 = this.h ? this.j : 0;
            if (this.h) {
                i = j();
            }
            this.k = i2 + this.i + i;
        }
    }

    @Override // tb.itl
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.j = i;
        }
    }

    @Override // tb.itl
    public int j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5eb3fe4", new Object[]{this})).intValue();
        }
        if (!this.h) {
            return 0;
        }
        return j.a(10.0f);
    }

    @Override // com.taobao.search.sf.widgets.list.listcell.weex.SearchSceneEnhancedWeexModWidget, tb.jzf
    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a137a", new Object[]{this});
        } else if (this.i > 0) {
        } else {
            super.s();
        }
    }

    @Override // tb.itl
    public void a(boolean z, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1901d4", new Object[]{this, new Boolean(z), new Float(f)});
            return;
        }
        z();
        FrameLayout it = (FrameLayout) getView();
        if (it == null || !z) {
            return;
        }
        q.a((Object) it, "it");
        it.setAlpha(f);
        postEvent(iqt.a.a((int) ((1.0f - f) * it.getMeasuredHeight())));
    }

    @Override // tb.itl
    public void aG_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89b4c520", new Object[]{this});
        } else {
            k();
        }
    }

    @Override // tb.itl
    public void aH_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b699dbf", new Object[]{this});
        } else {
            l();
        }
    }

    @Override // com.taobao.search.sf.widgets.list.listcell.weex.SearchSceneEnhancedWeexModWidget
    public int w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6a27171", new Object[]{this})).intValue();
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

    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.View] */
    @Override // tb.itl
    public com.taobao.android.searchbaseframe.meta.uikit.header.behavior.a h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.searchbaseframe.meta.uikit.header.behavior.a) ipChange.ipc$dispatch("26ed9943", new Object[]{this});
        }
        if (!this.f) {
            return null;
        }
        this.o = new nsy(getView(), this);
        nsy nsyVar = this.o;
        if (nsyVar != null) {
            nsyVar.c((w() - this.k) + j());
        }
        nsy nsyVar2 = this.o;
        if (nsyVar2 != null) {
            nsyVar2.a(this);
        }
        nsy nsyVar3 = this.o;
        if (nsyVar3 != null) {
            nsyVar3.d(this.c);
        }
        return this.o;
    }

    @Override // tb.itl
    public boolean i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue() : d();
    }

    @Override // com.taobao.search.sf.widgets.list.listcell.weex.SearchSceneEnhancedWeexModWidget
    public SearchSceneEnhancedWeexModWidget.SceneHeaderContainer x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SearchSceneEnhancedWeexModWidget.SceneHeaderContainer) ipChange.ipc$dispatch("d64965d7", new Object[]{this});
        }
        Activity activity = getActivity();
        q.a((Object) activity, "activity");
        return new NSSceneHeaderContainer(this, activity);
    }

    /* loaded from: classes8.dex */
    public final class NSSceneHeaderContainer extends SearchSceneEnhancedWeexModWidget.SceneHeaderContainer implements NestedScrollingParent2 {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private boolean intercepted;
        private int mAccY;
        public final /* synthetic */ NSSceneHeaderWeexWidget this$0;

        static {
            kge.a(1111529607);
            kge.a(-2000658237);
        }

        public static /* synthetic */ Object ipc$super(NSSceneHeaderContainer nSSceneHeaderContainer, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode != -1533054272) {
                if (hashCode == 2075560917) {
                    return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
                }
                if (hashCode != 2114251219) {
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                }
                return new Boolean(super.onNestedFling((View) objArr[0], ((Number) objArr[1]).floatValue(), ((Number) objArr[2]).floatValue(), ((Boolean) objArr[3]).booleanValue()));
            }
            return new Boolean(super.onNestedPreFling((View) objArr[0], ((Number) objArr[1]).floatValue(), ((Number) objArr[2]).floatValue()));
        }

        @Override // android.support.v4.view.NestedScrollingParent2
        public void onNestedPreScroll(View target, int i, int i2, int[] iArr, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("472edc84", new Object[]{this, target, new Integer(i), new Integer(i2), iArr, new Integer(i3)});
            } else {
                q.c(target, "target");
            }
        }

        @Override // android.support.v4.view.NestedScrollingParent2
        public void onNestedScrollAccepted(View child, View target, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("da61a091", new Object[]{this, child, target, new Integer(i), new Integer(i2)});
                return;
            }
            q.c(child, "child");
            q.c(target, "target");
        }

        @Override // android.support.v4.view.NestedScrollingParent2
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
        public NSSceneHeaderContainer(NSSceneHeaderWeexWidget nSSceneHeaderWeexWidget, Context context) {
            super(context);
            q.c(context, "context");
            this.this$0 = nSSceneHeaderWeexWidget;
            ViewCompat.setNestedScrollingEnabled(this, true);
        }

        @Override // com.taobao.search.sf.widgets.list.listcell.weex.SearchSceneEnhancedWeexModWidget.SceneHeaderContainer, android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent ev) {
            IpChange ipChange = $ipChange;
            boolean z = true;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, ev})).booleanValue();
            }
            q.c(ev, "ev");
            if (this.mInterceptTouchListener != null) {
                this.mInterceptTouchListener.onTouch(this, ev);
            }
            int actionMasked = ev.getActionMasked();
            if (actionMasked == 0) {
                this.mSkipIntercept = false;
                this.mHideSceneLayer = false;
                this.mDownY = (int) ev.getY();
                return false;
            }
            if (actionMasked == 1) {
                nsy a2 = NSSceneHeaderWeexWidget.a(this.this$0);
                if (a2 != null && this.mHideSceneLayer && !this.mSkipIntercept) {
                    a2.j();
                    this.this$0.postScopeEvent(iqt.i.a("fromWeex"), "childPageWidget");
                    this.mHideSceneLayer = false;
                    return true;
                }
            } else if (actionMasked == 2) {
                int y = (int) (ev.getY() - this.mDownY);
                if (y >= 0 || Math.abs(y) <= SearchSceneEnhancedWeexModWidget.HIDDEN_THRESHOLD) {
                    z = false;
                }
                this.mHideSceneLayer = z;
            }
            return originInterceptTouch(ev);
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
                if (NSSceneHeaderWeexWidget.b(this.this$0) || com.taobao.search.sf.newsearch.widgets.c.a((int) ev.getRawX(), (int) ev.getRawY(), this)) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                    this.intercepted = true;
                }
                if (!NSSceneHeaderWeexWidget.c(this.this$0) && NSSceneHeaderWeexWidget.b(this.this$0)) {
                    nsy a2 = NSSceneHeaderWeexWidget.a(this.this$0);
                    if (a2 != null) {
                        nsy.a(a2, false, 1, null);
                    }
                    this.this$0.postScopeEvent(iqt.g.a("clickCoverExpand"), "childPageWidget");
                }
            } else if (actionMasked == 1 && this.intercepted) {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
            return super.dispatchTouchEvent(ev);
        }

        @Override // android.support.v4.view.NestedScrollingParent2
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
                nsy a2 = NSSceneHeaderWeexWidget.a(this.this$0);
                if (a2 != null) {
                    a2.j();
                }
                this.this$0.postScopeEvent(iqt.i.a("fromWeex"), "childPageWidget");
            }
            this.mHideSceneLayer = false;
        }

        @Override // android.support.v4.view.NestedScrollingParent2
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
            int i6 = this.mAccY;
            if (i6 <= 0 || Math.abs(i6) <= SearchSceneEnhancedWeexModWidget.HIDDEN_THRESHOLD) {
                z = false;
            }
            this.mHideSceneLayer = z;
        }

        @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.NestedScrollingParent
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

        @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.NestedScrollingParent
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
            kge.a(373999570);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    /* loaded from: classes8.dex */
    public static final class b<PARAMS, RESULT> implements ise<irp, ito> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final b INSTANCE = new b();

        @Override // tb.ise
        public final NSSceneHeaderWeexWidget a(irp irpVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (NSSceneHeaderWeexWidget) ipChange.ipc$dispatch("5eacd28a", new Object[]{this, irpVar});
            }
            Activity activity = irpVar.c;
            q.a((Object) activity, "param.activity");
            ium iumVar = irpVar.d;
            q.a((Object) iumVar, "param.parent");
            iru<? extends com.taobao.android.searchbaseframe.datasource.impl.a<? extends BaseSearchResult, ?>> iruVar = irpVar.e;
            q.a((Object) iruVar, "param.modelAdapter");
            TemplateBean templateBean = irpVar.f29258a;
            q.a((Object) templateBean, "param.templateBean");
            return new NSSceneHeaderWeexWidget(activity, iumVar, iruVar, templateBean, irpVar.f, irpVar.g);
        }
    }

    static {
        kge.a(436281610);
        kge.a(733709958);
        Companion = new a(null);
        p = b.INSTANCE;
    }
}
