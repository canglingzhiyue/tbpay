package com.taobao.search.sf.widgets.list.floatbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Build;
import android.preference.PreferenceManager;
import android.support.v4.util.ArrayMap;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.OvershootInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavix.h;
import com.taobao.android.nav.Nav;
import com.taobao.android.searchbaseframe.datasource.impl.BaseTypedBean;
import com.taobao.android.searchbaseframe.datasource.impl.bean.ResultMainInfoBean;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.android.searchbaseframe.util.i;
import com.taobao.search.common.util.k;
import com.taobao.search.common.util.q;
import com.taobao.search.common.util.y;
import com.taobao.search.mmd.datasource.bean.ReviewBean;
import com.taobao.search.sf.datasource.CommonSearchResult;
import com.taobao.search.sf.widgets.list.listcell.crosstips.b;
import com.taobao.tao.Globals;
import com.taobao.tao.util.DensityUtil;
import com.taobao.taobao.R;
import com.taobao.taolive.room.utils.aw;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.irp;
import tb.irq;
import tb.ise;
import tb.isj;
import tb.isu;
import tb.isv;
import tb.itn;
import tb.ito;
import tb.iug;
import tb.iuk;
import tb.ium;
import tb.iur;
import tb.ius;
import tb.kge;
import tb.ntw;
import tb.poq;

/* loaded from: classes8.dex */
public class l extends ius<com.taobao.search.sf.widgets.list.floatbar.b, LinearLayout, com.taobao.search.sf.a> implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final ise<irq, l> CREATOR;
    public static final String KEY_LAST_TIME_PREFIX = "tbsearch_float_toolbar_last_time";
    private iuk A;
    private boolean B;
    private boolean C;
    private int D;
    private com.taobao.search.mmd.uikit.d E;
    private boolean F;
    private boolean G;
    private int H;
    private String I;

    /* renamed from: a  reason: collision with root package name */
    public boolean f19512a;
    private Runnable b;
    private final int c;
    private int d;
    private LinearLayout e;
    private LinearLayout f;
    private TUrlImageView g;
    private TUrlImageView h;
    private TUrlImageView i;
    private TUrlImageView j;
    private View k;
    private FrameLayout l;
    private TextView m;
    private TUrlImageView n;
    private FrameLayout o;
    private ReviewBean p;
    private com.taobao.search.mmd.datasource.bean.a q;
    private View r;
    private ViewGroup s;
    private TextView t;
    private TextView u;
    private LinearLayout v;
    private List<iuk> w;

    /* renamed from: com.taobao.search.sf.widgets.list.floatbar.l$9  reason: invalid class name */
    /* loaded from: classes8.dex */
    public class AnonymousClass9 implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ com.taobao.search.mmd.datasource.bean.a f19519a;

        public AnonymousClass9(com.taobao.search.mmd.datasource.bean.a aVar) {
            this.f19519a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            TextView k;
            int dip2px;
            Activity m;
            float f;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (l.e(l.this).getVisibility() == 8) {
            } else {
                l.g(l.this).setVisibility(0);
                int i = "promotion".equals(this.f19519a.l) ? 20 : 10;
                if (!TextUtils.isEmpty(this.f19519a.e)) {
                    l.h(l.this).setVisibility(0);
                    l.h(l.this).setImageUrl(this.f19519a.e);
                    k = l.k(l.this);
                    dip2px = DensityUtil.dip2px(l.i(l.this), i);
                    m = l.j(l.this);
                    f = 41.0f;
                } else {
                    l.h(l.this).setVisibility(8);
                    k = l.k(l.this);
                    dip2px = DensityUtil.dip2px(l.l(l.this), i);
                    m = l.m(l.this);
                    f = 15.0f;
                }
                k.setPadding(dip2px, 0, DensityUtil.dip2px(m, f), 0);
                l.k(l.this).setText(this.f19519a.d);
                l.k(l.this).setContentDescription(this.f19519a.d);
                l.g(l.this).startAnimation(l.n(l.this));
                l.g(l.this).postDelayed(new Runnable() { // from class: com.taobao.search.sf.widgets.list.floatbar.l.9.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else if (l.g(l.this) == null || l.h(l.this) == null || l.g(l.this).getVisibility() == 8) {
                        } else {
                            AnimationSet o = l.o(l.this);
                            o.setAnimationListener(new Animation.AnimationListener() { // from class: com.taobao.search.sf.widgets.list.floatbar.l.9.1.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // android.view.animation.Animation.AnimationListener
                                public void onAnimationRepeat(Animation animation) {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("8f2883e7", new Object[]{this, animation});
                                    }
                                }

                                @Override // android.view.animation.Animation.AnimationListener
                                public void onAnimationStart(Animation animation) {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("f2d146c4", new Object[]{this, animation});
                                    }
                                }

                                @Override // android.view.animation.Animation.AnimationListener
                                public void onAnimationEnd(Animation animation) {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("724c33d", new Object[]{this, animation});
                                    } else if (l.g(l.this) == null || l.h(l.this) == null) {
                                    } else {
                                        l.g(l.this).setVisibility(8);
                                        l.h(l.this).setVisibility(8);
                                    }
                                }
                            });
                            l.g(l.this).startAnimation(o);
                        }
                    }
                }, this.f19519a.g * 1000);
            }
        }
    }

    /* loaded from: classes8.dex */
    public static class b {
        static {
            kge.a(1715747334);
        }
    }

    /* loaded from: classes8.dex */
    public static class c {
        static {
            kge.a(-489389324);
        }
    }

    /* loaded from: classes8.dex */
    public static class d {
        static {
            kge.a(-1379809383);
        }
    }

    /* loaded from: classes8.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public int f19522a;
        public int b;

        static {
            kge.a(-1198107331);
        }

        public e(int i, int i2) {
            this.f19522a = i;
            this.b = i2;
        }
    }

    public static /* synthetic */ Object ipc$super(l lVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.iut
    public String getLogTag() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("55d7c1cd", new Object[]{this}) : "SearchFloatBarWidget";
    }

    public static /* synthetic */ boolean a(l lVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("83ebef3e", new Object[]{lVar})).booleanValue() : lVar.G;
    }

    public static /* synthetic */ View b(l lVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("c2d87c7d", new Object[]{lVar}) : lVar.r;
    }

    public static /* synthetic */ TUrlImageView c(l lVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TUrlImageView) ipChange.ipc$dispatch("c3c3b7c0", new Object[]{lVar}) : lVar.g;
    }

    public static /* synthetic */ FrameLayout d(l lVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("acee5a3c", new Object[]{lVar}) : lVar.l;
    }

    public static /* synthetic */ TUrlImageView e(l lVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TUrlImageView) ipChange.ipc$dispatch("548000fe", new Object[]{lVar}) : lVar.i;
    }

    public static /* synthetic */ View f(l lVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("881eba81", new Object[]{lVar}) : lVar.k;
    }

    public static /* synthetic */ FrameLayout g(l lVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("f7f24f19", new Object[]{lVar}) : lVar.o;
    }

    public static /* synthetic */ TUrlImageView h(l lVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TUrlImageView) ipChange.ipc$dispatch("ad9a6edb", new Object[]{lVar}) : lVar.n;
    }

    public static /* synthetic */ Activity i(l lVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("4d113aa6", new Object[]{lVar}) : lVar.mActivity;
    }

    public static /* synthetic */ Activity j(l lVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("cf5bef85", new Object[]{lVar}) : lVar.mActivity;
    }

    public static /* synthetic */ TextView k(l lVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("7b96b538", new Object[]{lVar}) : lVar.m;
    }

    public static /* synthetic */ Activity l(l lVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("d3f15943", new Object[]{lVar}) : lVar.mActivity;
    }

    public static /* synthetic */ Activity m(l lVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("563c0e22", new Object[]{lVar}) : lVar.mActivity;
    }

    public static /* synthetic */ AnimationSet n(l lVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AnimationSet) ipChange.ipc$dispatch("f87cc05", new Object[]{lVar}) : lVar.o();
    }

    public static /* synthetic */ AnimationSet o(l lVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AnimationSet) ipChange.ipc$dispatch("7e0edd46", new Object[]{lVar}) : lVar.n();
    }

    public static /* synthetic */ TUrlImageView p(l lVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TUrlImageView) ipChange.ipc$dispatch("f08b93d3", new Object[]{lVar}) : lVar.j;
    }

    public static /* synthetic */ void q(l lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc9dcb4a", new Object[]{lVar});
        } else {
            lVar.j();
        }
    }

    @Override // tb.iup, tb.iui
    public /* synthetic */ void bindWithData(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2491dd0", new Object[]{this, obj});
        } else {
            a((com.taobao.search.sf.widgets.list.floatbar.b) obj);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.widget.LinearLayout, android.view.View] */
    @Override // tb.ius
    public /* synthetic */ LinearLayout onCreateView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("ebecba09", new Object[]{this}) : a();
    }

    static {
        kge.a(1746052466);
        kge.a(-1201612728);
        CREATOR = new ise<irq, l>() { // from class: com.taobao.search.sf.widgets.list.floatbar.l.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.ise
            public l a(irq irqVar) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (l) ipChange.ipc$dispatch("f267fbb8", new Object[]{this, irqVar}) : new l(irqVar.c, irqVar.d, (com.taobao.search.sf.a) irqVar.e, irqVar.f, irqVar.g);
            }
        };
    }

    public l(Activity activity, ium iumVar, com.taobao.search.sf.a aVar, ViewGroup viewGroup, iur iurVar) {
        super(activity, iumVar, aVar, viewGroup, iurVar);
        this.b = new i() { // from class: com.taobao.search.sf.widgets.list.floatbar.l.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.searchbaseframe.util.i
            public void a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                } else if (!l.a(l.this) || l.b(l.this).getVisibility() != 0) {
                } else {
                    int[] iArr = new int[2];
                    l.b(l.this).getLocationInWindow(iArr);
                    l.this.postEvent(new e(iArr[0], iArr[1]));
                }
            }
        };
        this.c = 300;
        this.d = 0;
        this.w = new ArrayList();
        this.F = false;
        this.G = false;
        this.H = 0;
        this.I = "";
        this.f19512a = true;
        subscribeScopeEvent(this, "childPageWidget");
        subscribeEvent(this);
        getModel().d().subscribe(this);
        this.G = getModel().d().z();
    }

    public LinearLayout a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinearLayout) ipChange.ipc$dispatch("660331bf", new Object[]{this});
        }
        this.e = (LinearLayout) LayoutInflater.from(getActivity()).inflate(R.layout.tbsearch_float_toolbar, getContainer(), false);
        this.e.setPadding(0, 0, 0, this.d);
        i();
        h();
        return this.e;
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else if (!"true".equals(getModel().d().getParamValue("show_shopping_cart"))) {
        } else {
            this.f.setVisibility(8);
        }
    }

    private void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        this.g = (TUrlImageView) this.e.findViewById(R.id.toolbar_backtop);
        this.f = (LinearLayout) this.e.findViewById(R.id.ll_float_container);
        this.l = (FrameLayout) this.e.findViewById(R.id.fl_bottom_bar_container);
        this.g.setVisibility(8);
        this.g.setOnClickListener(this);
        if (poq.a(getActivity())) {
            this.g.setImageUrl("https://gw.alicdn.com/imgextra/i3/O1CN01ecAmov1RGWOMJD8kY_!!6000000002084-2-tps-160-160.png");
        } else {
            this.g.setImageUrl("https://gw.alicdn.com/imgextra/i2/O1CN01O8AXxB1wOzoBiOEXV_!!6000000006299-2-tps-120-120.png");
        }
        this.h = (TUrlImageView) this.e.findViewById(R.id.toolbar_review);
        this.h.setVisibility(8);
        this.h.setPlaceHoldImageResId(R.drawable.tbsearch_review_icon);
        this.h.setErrorImageResId(R.drawable.tbsearch_review_icon);
        this.h.setOnClickListener(this);
        this.j = (TUrlImageView) this.e.findViewById(R.id.highlight_float_button);
        this.j.setVisibility(8);
        this.k = this.e.findViewById(R.id.highlight_red_dot);
        this.i = (TUrlImageView) this.e.findViewById(R.id.normal_float_button);
        this.i.setVisibility(8);
        this.i.setOnClickListener(this);
        this.o = (FrameLayout) this.e.findViewById(R.id.hint_parent);
        this.o.setOnClickListener(this);
        this.o.setVisibility(8);
        this.m = (TextView) this.e.findViewById(R.id.hintText);
        this.m.setLayerType(1, null);
        this.E = new com.taobao.search.mmd.uikit.d();
        this.m.setBackgroundDrawable(this.E);
        this.n = (TUrlImageView) this.e.findViewById(R.id.hintPic);
        this.n.setVisibility(8);
        this.r = this.e.findViewById(R.id.open_cart);
        this.r.setVisibility(8);
        this.r.setOnClickListener(this);
        this.s = (ViewGroup) this.e.findViewById(R.id.tool_bar_currentpos);
        ViewGroup viewGroup = this.s;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
            this.t = (TextView) this.s.findViewById(R.id.currentPos);
            this.u = (TextView) this.s.findViewById(R.id.totalNum);
        }
        if (this.mActivity != null && this.mActivity.getResources() != null) {
            this.D = this.mActivity.getResources().getDimensionPixelOffset(R.dimen.tbsearch_feeds_height) + DensityUtil.dip2px(this.mActivity, 8.0f);
        } else {
            this.D = DensityUtil.dip2px(Globals.getApplication(), 47.0f);
        }
        this.v = (LinearLayout) this.e.findViewById(R.id.ll_push_button_container);
        String paramStr = getModel().d().getParamStr("bottomPadding");
        if (TextUtils.isEmpty(paramStr)) {
            return;
        }
        this.e.setPadding(0, 0, 0, com.taobao.search.mmd.util.d.b(paramStr, 0));
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.B || this.g.isInLayout()) {
        } else {
            this.g.setVisibility(0);
            if (!this.C) {
                if (this.f19512a) {
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f, "translationY", this.D, 0.0f);
                    ofFloat.setDuration(400L);
                    ofFloat.start();
                } else {
                    this.f.setTranslationY(0.0f);
                }
            }
            q.a("SearchFloatBarWidget", "show back to top");
            this.B = true;
            j();
        }
    }

    private void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
        } else if (getView() == 0) {
        } else {
            ((LinearLayout) getView()).removeCallbacks(this.b);
            ((LinearLayout) getView()).postDelayed(this.b, 500L);
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.B = true;
        this.g.setVisibility(4);
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (!this.B) {
        } else {
            if (Build.VERSION.SDK_INT >= 18 && this.g.isInLayout()) {
                return;
            }
            if (this.f19512a) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f, "translationY", 0.0f, this.D);
                ofFloat.setDuration(400L);
                ofFloat.addListener(new AnimatorListenerAdapter() { // from class: com.taobao.search.sf.widgets.list.floatbar.l.5
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                        } else {
                            l.c(l.this).setVisibility(4);
                        }
                    }
                });
                ofFloat.start();
            } else {
                this.f.setTranslationY(this.D);
            }
            q.a("SearchFloatBarWidget", "hide back to top");
            this.B = false;
            j();
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        this.s.setVisibility(0);
        this.C = true;
        if (this.g.getVisibility() != 0) {
            return;
        }
        this.g.setVisibility(8);
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        this.s.setVisibility(8);
        this.C = false;
        if (this.g.getVisibility() != 8) {
            return;
        }
        this.g.setVisibility(0);
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (str == null) {
        } else {
            this.t.setText(str);
        }
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else if (str == null) {
        } else {
            if (com.taobao.search.mmd.util.d.a(str, 0, "SearchFloatBarWidget", "当前宝贝总数不是有效数字") > 999) {
                this.u.setText("999+");
            } else {
                this.u.setText(str);
            }
        }
    }

    public void a(com.taobao.search.sf.widgets.list.floatbar.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83e76384", new Object[]{this, bVar});
            return;
        }
        com.taobao.search.sf.datasource.c d2 = getModel().d();
        if (d2.J()) {
            this.r.setVisibility(0);
            a(d2);
        } else {
            this.r.setVisibility(8);
        }
        int currentPage = d2.getCurrentPage();
        if (bVar == null) {
            return;
        }
        if (bVar.b != null) {
            this.q = bVar.b;
            p();
            a(currentPage, bVar.b);
        }
        a(bVar.f19503a);
    }

    private void a(com.taobao.search.sf.datasource.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("141ef998", new Object[]{this, cVar});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        if (cVar.getTotalSearchResult() == 0) {
            return;
        }
        ResultMainInfoBean mainInfo = ((CommonSearchResult) cVar.getTotalSearchResult()).getMainInfo();
        jSONObject.put(k.a.PARAM_KEY_FIRST_RN, (Object) mainInfo.rn);
        jSONObject.put("x_object_type_search", (Object) "srpshoppingcart");
        jSONObject.put("list_param", (Object) (cVar.getKeyword() + "_" + mainInfo.abtest + "_" + mainInfo.rn));
        jSONObject.put("from", (Object) cVar.c("from"));
        jSONObject.put("channelSrp", (Object) cVar.c("channelSrp"));
        JSONObject jSONObject2 = ((CommonSearchResult) cVar.getTotalSearchResult()).pageInfo;
        if (jSONObject2 != null) {
            jSONObject.put("for_bts", (Object) jSONObject2.getString("for_bts"));
        }
        HashMap hashMap = new HashMap();
        Map<String, String> map = mainInfo.pageTraceArgs;
        if (map != null) {
            hashMap.put("spm", map.get("spm-cnt"));
        }
        hashMap.put("utLogMap", y.b(jSONObject.toString()));
        com.taobao.search.mmd.util.e.b("Page_SearchItemList_srpshoppingcart_QueryExposure", hashMap);
    }

    private void a(ReviewBean reviewBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3b1757b", new Object[]{this, reviewBean});
        } else if (reviewBean != null && reviewBean.show) {
            p();
            b(reviewBean);
        } else {
            TUrlImageView tUrlImageView = this.h;
            if (tUrlImageView == null || tUrlImageView.getVisibility() == 8) {
                return;
            }
            this.h.setVisibility(8);
        }
    }

    public void a(List<com.taobao.search.mmd.datasource.bean.a> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            return;
        }
        for (iuk iukVar : this.w) {
            iukVar.destroyAndRemoveFromParent();
        }
        this.w.clear();
        if (list == null) {
            return;
        }
        for (com.taobao.search.mmd.datasource.bean.a aVar : list) {
            LinearLayout linearLayout = this.v;
            k a2 = j.a(aVar, getActivity(), this, getModel(), linearLayout, new iug(linearLayout));
            a2.ensureView();
            a2.a(aVar);
            a2.attachToContainer();
            this.w.add(a2);
        }
    }

    public void a(BaseTypedBean baseTypedBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb896021", new Object[]{this, baseTypedBean});
            return;
        }
        iuk iukVar = this.A;
        if (iukVar != null) {
            iukVar.destroyAndRemoveFromParent();
        }
        if (baseTypedBean == null) {
            return;
        }
        this.A = b(baseTypedBean);
        iuk iukVar2 = this.A;
        if (iukVar2 == null) {
            return;
        }
        iukVar2.bindWithData(baseTypedBean);
        this.A.attachToContainer(new iur() { // from class: com.taobao.search.sf.widgets.list.floatbar.l.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.iur
            public void a(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9501e36a", new Object[]{this, view});
                } else {
                    l.d(l.this).addView(view);
                }
            }

            @Override // tb.iur
            public void b(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("91037249", new Object[]{this, view});
                } else {
                    com.taobao.search.mmd.util.k.a(view);
                }
            }
        });
    }

    private irq l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (irq) ipChange.ipc$dispatch("63a834cb", new Object[]{this}) : new irq(getActivity(), this, getModel());
    }

    private iuk b(BaseTypedBean baseTypedBean) {
        ise<irp, ? extends itn> iseVar;
        ise<irp, ? extends ito> iseVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (iuk) ipChange.ipc$dispatch("59bc9005", new Object[]{this, baseTypedBean});
        }
        if (isj.a(baseTypedBean)) {
            TemplateBean template = getModel().d().getTemplate(baseTypedBean.type);
            if (template != null && (iseVar2 = ((com.taobao.android.searchbaseframe.business.srp.c) c().m().b()).g) != null) {
                return iseVar2.a(new irp(l(), template));
            }
            return null;
        } else if (isj.b(baseTypedBean)) {
            TemplateBean template2 = getModel().d().getTemplate(baseTypedBean.type);
            if (template2 != null && (iseVar = c().m().b.f29267a) != null) {
                return iseVar.a(new irp(l(), template2));
            }
            return null;
        } else {
            irq l = l();
            l.f = new LinearLayout(this.mActivity);
            return c().i().a((Class<? extends BaseTypedBean>) baseTypedBean.getClass(), (Class) l);
        }
    }

    private void a(int i, com.taobao.search.mmd.datasource.bean.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2824b99", new Object[]{this, new Integer(i), aVar});
        } else if (!com.taobao.search.mmd.datasource.bean.a.MODE_BY_PAGE_WITHOUT_CLICK.equalsIgnoreCase(aVar.k)) {
        } else {
            if (aVar.m > 0 && i >= aVar.m && i < aVar.n) {
                boolean a2 = a(aVar, i);
                if (this.i.getVisibility() != 8) {
                    return;
                }
                boolean equals = "promotion".equals(aVar.l);
                if (equals) {
                    this.o.getLayoutParams().height = DensityUtil.dip2px(this.mActivity, 39.0f);
                    this.m.setTextSize(1, 14.0f);
                    ((ViewGroup.MarginLayoutParams) this.o.getLayoutParams()).rightMargin = DensityUtil.dip2px(this.mActivity, 10.0f);
                }
                this.E.a(aVar.i);
                this.E.b(aVar.j);
                this.E.a(equals);
                this.E.a();
                this.m.setTextColor(aVar.h);
                this.i.setContentDescription(aVar.f19161a);
                this.i.setImageUrl(aVar.b);
                if (!a2 || TextUtils.isEmpty(aVar.c)) {
                    m();
                }
                String keyword = getModel().d().getKeyword();
                ArrayMap arrayMap = new ArrayMap();
                arrayMap.put("q", keyword);
                arrayMap.put("highlighted", String.valueOf(a2));
                com.taobao.search.mmd.util.e.a("PushButton" + aVar.p + "Display", (ArrayMap<String, String>) arrayMap);
            } else if (this.i.getVisibility() != 0) {
            } else {
                if (!aVar.s) {
                    AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                    alphaAnimation.setDuration(300L);
                    alphaAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.taobao.search.sf.widgets.list.floatbar.l.7
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.view.animation.Animation.AnimationListener
                        public void onAnimationRepeat(Animation animation) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("8f2883e7", new Object[]{this, animation});
                            }
                        }

                        @Override // android.view.animation.Animation.AnimationListener
                        public void onAnimationStart(Animation animation) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("f2d146c4", new Object[]{this, animation});
                            }
                        }

                        @Override // android.view.animation.Animation.AnimationListener
                        public void onAnimationEnd(Animation animation) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("724c33d", new Object[]{this, animation});
                                return;
                            }
                            if (l.e(l.this) != null) {
                                l.e(l.this).setVisibility(8);
                            }
                            if (l.f(l.this) == null) {
                                return;
                            }
                            l.f(l.this).setVisibility(8);
                        }
                    });
                    this.i.startAnimation(alphaAnimation);
                }
                this.j.setVisibility(8);
                this.o.setVisibility(8);
                this.k.setVisibility(8);
            }
        }
    }

    private void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        this.i.setVisibility(0);
        AnimationSet animationSet = new AnimationSet(false);
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(new OvershootInterpolator(3.0f));
        animationSet.addAnimation(scaleAnimation);
        animationSet.addAnimation(new AlphaAnimation(0.0f, 1.0f));
        animationSet.setDuration(300L);
        this.i.startAnimation(animationSet);
    }

    private boolean a(final com.taobao.search.mmd.datasource.bean.a aVar, int i) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596a231b", new Object[]{this, aVar, new Integer(i)})).booleanValue();
        }
        if (aVar.u || aVar.f != i) {
            return false;
        }
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.mActivity);
        if (System.currentTimeMillis() - defaultSharedPreferences.getLong(KEY_LAST_TIME_PREFIX + aVar.p, 0L) < aVar.r) {
            aVar.u = true;
            return false;
        }
        if (!TextUtils.isEmpty(aVar.d) || !TextUtils.isEmpty(aVar.e)) {
            a(aVar);
            z = true;
        }
        if (!TextUtils.isEmpty(aVar.c)) {
            b(aVar);
            z = true;
        } else {
            this.j.setVisibility(8);
        }
        if (z) {
            SharedPreferences.Editor edit = defaultSharedPreferences.edit();
            edit.putLong(KEY_LAST_TIME_PREFIX + aVar.p, System.currentTimeMillis()).apply();
            this.k.postDelayed(new Runnable() { // from class: com.taobao.search.sf.widgets.list.floatbar.l.8
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (aVar.s || l.e(l.this).getVisibility() == 8) {
                    } else {
                        l.f(l.this).setVisibility(0);
                        ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 1.0f, 1, 1.0f);
                        scaleAnimation.setDuration(150L);
                        l.f(l.this).startAnimation(scaleAnimation);
                    }
                }
            }, (long) ((aVar.g * 1000) + 600));
            aVar.t = true;
        }
        aVar.u = true;
        return z;
    }

    private void a(com.taobao.search.mmd.datasource.bean.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d155fd6c", new Object[]{this, aVar});
        } else {
            this.o.postDelayed(new AnonymousClass9(aVar), 300L);
        }
    }

    private AnimationSet n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AnimationSet) ipChange.ipc$dispatch("d2bc18f3", new Object[]{this});
        }
        AnimationSet animationSet = new AnimationSet(true);
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.0f, 1.0f, 1.0f, 1, 1.0f, 1, 1.0f);
        animationSet.setDuration(300L);
        animationSet.addAnimation(scaleAnimation);
        animationSet.addAnimation(new AlphaAnimation(1.0f, 0.0f));
        return animationSet;
    }

    private AnimationSet o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AnimationSet) ipChange.ipc$dispatch("5f5c43f4", new Object[]{this});
        }
        AnimationSet animationSet = new AnimationSet(false);
        animationSet.setDuration(300L);
        animationSet.addAnimation(new ScaleAnimation(0.0f, 1.0f, 1.0f, 1.0f, 1, 1.0f, 1, 1.0f));
        animationSet.addAnimation(new AlphaAnimation(0.0f, 1.0f));
        return animationSet;
    }

    private void b(com.taobao.search.mmd.datasource.bean.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8acd8b0b", new Object[]{this, aVar});
            return;
        }
        this.j.setImageUrl(aVar.c);
        this.j.setVisibility(0);
        AnimationSet animationSet = new AnimationSet(false);
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(new OvershootInterpolator(3.0f));
        animationSet.addAnimation(scaleAnimation);
        animationSet.addAnimation(new AlphaAnimation(0.0f, 1.0f));
        animationSet.setDuration(300L);
        this.j.startAnimation(animationSet);
        this.j.postDelayed(new Runnable() { // from class: com.taobao.search.sf.widgets.list.floatbar.l.10
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (l.p(l.this) == null || l.p(l.this).getVisibility() == 8) {
                } else {
                    AnimationSet animationSet2 = new AnimationSet(true);
                    ScaleAnimation scaleAnimation2 = new ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f, 1, 0.5f, 1, 0.5f);
                    animationSet2.setDuration(300L);
                    animationSet2.addAnimation(scaleAnimation2);
                    animationSet2.addAnimation(new AlphaAnimation(1.0f, 0.0f));
                    animationSet2.setAnimationListener(new Animation.AnimationListener() { // from class: com.taobao.search.sf.widgets.list.floatbar.l.10.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.view.animation.Animation.AnimationListener
                        public void onAnimationRepeat(Animation animation) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("8f2883e7", new Object[]{this, animation});
                            }
                        }

                        @Override // android.view.animation.Animation.AnimationListener
                        public void onAnimationStart(Animation animation) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("f2d146c4", new Object[]{this, animation});
                            }
                        }

                        @Override // android.view.animation.Animation.AnimationListener
                        public void onAnimationEnd(Animation animation) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("724c33d", new Object[]{this, animation});
                            } else if (l.p(l.this) == null) {
                            } else {
                                l.p(l.this).setVisibility(8);
                            }
                        }
                    });
                    l.p(l.this).startAnimation(animationSet2);
                    l.e(l.this).setVisibility(0);
                    AnimationSet animationSet3 = new AnimationSet(false);
                    ScaleAnimation scaleAnimation3 = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, 0.5f);
                    scaleAnimation3.setInterpolator(new OvershootInterpolator(3.0f));
                    animationSet3.addAnimation(scaleAnimation3);
                    animationSet3.addAnimation(new AlphaAnimation(0.0f, 1.0f));
                    animationSet3.setDuration(300L);
                    animationSet3.setStartOffset(150L);
                    l.e(l.this).startAnimation(animationSet3);
                }
            }
        }, (aVar.g * 1000) + 300);
    }

    private void b(ReviewBean reviewBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd05cabc", new Object[]{this, reviewBean});
            return;
        }
        this.p = reviewBean;
        this.h.setImageUrl(this.p.iconUrl);
        com.taobao.search.mmd.util.e.c("SrpReviewButtonExpose");
        this.h.setVisibility(0);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (view.getId() == this.g.getId()) {
            com.taobao.search.mmd.util.e.a("BackToTop", "a2141.7631709.1999021175.4922318");
            e();
            postEvent(new b.a(false));
            getModel().d().postEvent(isu.a.a());
        } else if (view.getId() == this.h.getId()) {
            ArrayMap arrayMap = new ArrayMap();
            arrayMap.put("query", getModel().d().getKeyword());
            com.taobao.search.mmd.util.e.a("Review", (ArrayMap<String, String>) arrayMap);
            h.a(com.ut.mini.l.getInstance().getCurrentPageName(), "Page_SearchItemList_Button-Review", "", "", com.taobao.search.jarvis.c.a(arrayMap));
            ntw.a(getModel().d(), this.p, this.mActivity);
        } else if (view.getId() == this.r.getId()) {
            Nav.from(this.mActivity).toUri("http://h5.m.taobao.com/awp/base/cart.htm?cartfrom=detail");
        } else if (view != this.i && view != this.o) {
        } else {
            try {
                if (this.q != null && !TextUtils.isEmpty(this.q.o)) {
                    this.q.s = true;
                    String str = this.q.o;
                    ArrayMap arrayMap2 = new ArrayMap();
                    arrayMap2.put("srpKey", String.valueOf(getModel().d().hashCode()));
                    CommonSearchResult commonSearchResult = (CommonSearchResult) getModel().d().getLastSearchResult();
                    if (commonSearchResult != null) {
                        arrayMap2.put(aw.PARAM_SEARCH_KEYWORD_RN, commonSearchResult.getMainInfo().rn);
                    }
                    Nav.from(this.mActivity).toUri(y.a(str, (ArrayMap<String, String>) arrayMap2));
                    String keyword = getModel().d().getKeyword();
                    ArrayMap arrayMap3 = new ArrayMap();
                    arrayMap3.put("q", keyword);
                    arrayMap3.put("highlighted", String.valueOf(this.q.t));
                    com.taobao.search.mmd.util.e.a("PushButton" + this.q.p + "Click", (ArrayMap<String, String>) arrayMap3);
                }
                this.k.clearAnimation();
                this.k.setVisibility(8);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public void onEventMainThread(isv.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a0bf04c", new Object[]{this, aVar});
        } else {
            a(aVar.b());
        }
    }

    public void onEventMainThread(isv.k kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a107c02", new Object[]{this, kVar});
        } else {
            a(true);
        }
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        CommonSearchResult commonSearchResult = (CommonSearchResult) getModel().d().getLastSearchResult();
        if (commonSearchResult == null) {
            return;
        }
        a(commonSearchResult.floatBarBean);
        if (!z) {
            return;
        }
        a(commonSearchResult.floatBarBean.d);
        a(commonSearchResult.floatBarBean.c);
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        a(z);
        CommonSearchResult commonSearchResult = (CommonSearchResult) getModel().d().getLastSearchResult();
        if (commonSearchResult == null || commonSearchResult.floatBarBean == null) {
            return;
        }
        ((LinearLayout) getView()).post(new Runnable() { // from class: com.taobao.search.sf.widgets.list.floatbar.l.11
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    l.q(l.this);
                }
            }
        });
    }

    public void onEventMainThread(isu.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("485874ca", new Object[]{this, dVar});
        } else {
            e();
        }
    }

    public void onEventMainThread(isu.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4858006b", new Object[]{this, cVar});
            return;
        }
        p();
        b();
    }

    public void onEventMainThread(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ef9c7d9", new Object[]{this, bVar});
        } else {
            j();
        }
    }

    public void onEventMainThread(isu.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48578c0c", new Object[]{this, bVar});
            return;
        }
        int totalResultCount = getModel().b().getTotalResultCount();
        if (this.G && bVar.b > 10 && bVar.b <= totalResultCount) {
            a(String.valueOf(bVar.b + 1));
            f();
            b(String.valueOf(totalResultCount));
            return;
        }
        g();
    }

    public void onEventMainThread(isu.f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48595d88", new Object[]{this, fVar});
        } else if (!this.G) {
        } else {
            g();
        }
    }

    public void onEventMainThread(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5efa3c38", new Object[]{this, cVar});
        } else {
            ((LinearLayout) getView()).setVisibility(8);
        }
    }

    public void onEventMainThread(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5efab097", new Object[]{this, dVar});
        } else {
            ((LinearLayout) getView()).setVisibility(0);
        }
    }

    private void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
        } else if (this.F) {
        } else {
            attachToContainer();
            this.F = true;
        }
    }
}
