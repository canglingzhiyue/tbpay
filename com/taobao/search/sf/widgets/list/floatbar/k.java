package com.taobao.search.sf.widgets.list.floatbar;

import android.app.Activity;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v4.util.ArrayMap;
import mtopsdk.common.util.StringUtils;
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
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.android.searchbaseframe.datasource.impl.BaseTypedBean;
import com.taobao.android.searchbaseframe.datasource.impl.bean.ResultMainInfoBean;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseBean;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.search.common.util.y;
import com.taobao.search.sf.datasource.CommonSearchResult;
import com.taobao.tao.util.DensityUtil;
import com.taobao.taobao.R;
import com.taobao.taolive.room.utils.aw;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import kotlin.TypeCastException;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.t;
import kotlin.text.n;
import tb.isv;
import tb.iug;
import tb.iul;
import tb.ium;
import tb.iup;
import tb.iur;
import tb.ius;
import tb.kge;
import tb.nwy;
import tb.ruk;

/* loaded from: classes8.dex */
public class k extends ius<com.taobao.search.mmd.datasource.bean.a, LinearLayout, com.taobao.search.sf.a> implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    public static final int HINT_DURATION = 300;

    /* renamed from: a  reason: collision with root package name */
    public com.taobao.search.mmd.datasource.bean.a f19504a;
    private TUrlImageView b;
    private TUrlImageView c;
    private View d;
    private TextView e;
    private FrameLayout f;
    private TUrlImageView g;
    private com.taobao.search.mmd.uikit.d h;
    private ruk<t> i;
    private ruk<t> j;

    /* loaded from: classes8.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (k.i(k.this).getVisibility() == 8) {
            } else {
                AnimationSet animationSet = new AnimationSet(true);
                ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f, 1, 0.5f, 1, 0.5f);
                long j = 300;
                animationSet.setDuration(j);
                animationSet.addAnimation(scaleAnimation);
                animationSet.addAnimation(new AlphaAnimation(1.0f, 0.0f));
                animationSet.setAnimationListener(new Animation.AnimationListener() { // from class: com.taobao.search.sf.widgets.list.floatbar.k.b.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationRepeat(Animation animation) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8f2883e7", new Object[]{this, animation});
                        } else {
                            q.c(animation, "animation");
                        }
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationStart(Animation animation) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("f2d146c4", new Object[]{this, animation});
                        } else {
                            q.c(animation, "animation");
                        }
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationEnd(Animation animation) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("724c33d", new Object[]{this, animation});
                            return;
                        }
                        q.c(animation, "animation");
                        k.i(k.this).setVisibility(8);
                    }
                });
                k.i(k.this).startAnimation(animationSet);
                k.a(k.this).setVisibility(0);
                AnimationSet animationSet2 = new AnimationSet(false);
                ScaleAnimation scaleAnimation2 = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, 0.5f);
                scaleAnimation2.setInterpolator(new OvershootInterpolator(3.0f));
                animationSet2.addAnimation(scaleAnimation2);
                animationSet2.addAnimation(new AlphaAnimation(0.0f, 1.0f));
                animationSet2.setDuration(j);
                animationSet2.setStartOffset(150L);
                k.a(k.this).startAnimation(animationSet2);
            }
        }
    }

    /* loaded from: classes8.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ com.taobao.search.mmd.datasource.bean.a b;

        public c(com.taobao.search.mmd.datasource.bean.a aVar) {
            this.b = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            TextView e;
            int dip2px;
            Activity f;
            float f2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (k.a(k.this).getVisibility() == 8) {
            } else {
                k.c(k.this).setVisibility(0);
                int i = q.a((Object) "promotion", (Object) this.b.l) ? 20 : 10;
                if (!StringUtils.isEmpty(this.b.e)) {
                    k.d(k.this).setVisibility(0);
                    k.d(k.this).setImageUrl(this.b.e);
                    e = k.e(k.this);
                    dip2px = DensityUtil.dip2px(k.f(k.this), i);
                    f = k.f(k.this);
                    f2 = 41.0f;
                } else {
                    k.d(k.this).setVisibility(8);
                    e = k.e(k.this);
                    dip2px = DensityUtil.dip2px(k.f(k.this), i);
                    f = k.f(k.this);
                    f2 = 15.0f;
                }
                e.setPadding(dip2px, 0, DensityUtil.dip2px(f, f2), 0);
                k.e(k.this).setText(this.b.d);
                k.e(k.this).setContentDescription(this.b.d);
                k.c(k.this).startAnimation(k.g(k.this));
                k.c(k.this).postDelayed(new Runnable() { // from class: com.taobao.search.sf.widgets.list.floatbar.k.c.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public final void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else if (k.c(k.this).getVisibility() == 8) {
                        } else {
                            AnimationSet h = k.h(k.this);
                            h.setAnimationListener(new Animation.AnimationListener() { // from class: com.taobao.search.sf.widgets.list.floatbar.k.c.1.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // android.view.animation.Animation.AnimationListener
                                public void onAnimationRepeat(Animation animation) {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("8f2883e7", new Object[]{this, animation});
                                    } else {
                                        q.c(animation, "animation");
                                    }
                                }

                                @Override // android.view.animation.Animation.AnimationListener
                                public void onAnimationStart(Animation animation) {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("f2d146c4", new Object[]{this, animation});
                                    } else {
                                        q.c(animation, "animation");
                                    }
                                }

                                @Override // android.view.animation.Animation.AnimationListener
                                public void onAnimationEnd(Animation animation) {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("724c33d", new Object[]{this, animation});
                                        return;
                                    }
                                    q.c(animation, "animation");
                                    k.c(k.this).setVisibility(8);
                                    k.d(k.this).setVisibility(8);
                                }
                            });
                            k.c(k.this).startAnimation(h);
                        }
                    }
                }, this.b.g * 1000);
            }
        }
    }

    /* loaded from: classes8.dex */
    public static final class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ com.taobao.search.mmd.datasource.bean.a b;

        public d(com.taobao.search.mmd.datasource.bean.a aVar) {
            this.b = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (this.b.s || k.a(k.this).getVisibility() == 8) {
            } else {
                k.b(k.this).setVisibility(0);
                ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 1.0f, 1, 1.0f);
                scaleAnimation.setDuration(150L);
                k.b(k.this).startAnimation(scaleAnimation);
            }
        }
    }

    static {
        kge.a(-2017531841);
        kge.a(-1201612728);
        Companion = new a(null);
    }

    public static /* synthetic */ Object ipc$super(k kVar, String str, Object... objArr) {
        if (str.hashCode() == -1303831088) {
            super.bindWithData(objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.iut
    public String getLogTag() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("55d7c1cd", new Object[]{this}) : "PushButtonWidget";
    }

    public static final /* synthetic */ TUrlImageView a(k kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("9b31941", new Object[]{kVar});
        }
        TUrlImageView tUrlImageView = kVar.b;
        if (tUrlImageView == null) {
            q.b("mNormalFloatButton");
        }
        return tUrlImageView;
    }

    public static final /* synthetic */ View b(k kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("3c52c1de", new Object[]{kVar});
        }
        View view = kVar.d;
        if (view == null) {
            q.b("mHighlightDot");
        }
        return view;
    }

    public static final /* synthetic */ FrameLayout c(k kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("7f04405c", new Object[]{kVar});
        }
        FrameLayout frameLayout = kVar.f;
        if (frameLayout == null) {
            q.b("mHintParent");
        }
        return frameLayout;
    }

    public static final /* synthetic */ TUrlImageView d(k kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("62cd871e", new Object[]{kVar});
        }
        TUrlImageView tUrlImageView = kVar.g;
        if (tUrlImageView == null) {
            q.b("mHintPic");
        }
        return tUrlImageView;
    }

    public static final /* synthetic */ TextView e(k kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("54b0ad53", new Object[]{kVar});
        }
        TextView textView = kVar.e;
        if (textView == null) {
            q.b("mHintText");
        }
        return textView;
    }

    public static final /* synthetic */ Activity f(k kVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("4200cf08", new Object[]{kVar}) : kVar.mActivity;
    }

    public static final /* synthetic */ AnimationSet g(k kVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AnimationSet) ipChange.ipc$dispatch("b2b8625f", new Object[]{kVar}) : kVar.e();
    }

    public static final /* synthetic */ AnimationSet h(k kVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AnimationSet) ipChange.ipc$dispatch("213f73a0", new Object[]{kVar}) : kVar.f();
    }

    public static final /* synthetic */ TUrlImageView i(k kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("4ca43e39", new Object[]{kVar});
        }
        TUrlImageView tUrlImageView = kVar.c;
        if (tUrlImageView == null) {
            q.b("mHighLightImage");
        }
        return tUrlImageView;
    }

    @Override // tb.iup, tb.iui
    public /* synthetic */ void bindWithData(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2491dd0", new Object[]{this, obj});
        } else {
            a((com.taobao.search.mmd.datasource.bean.a) obj);
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [android.widget.LinearLayout, android.view.View] */
    @Override // tb.ius
    public /* synthetic */ LinearLayout onCreateView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("ebecba09", new Object[]{this}) : b();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Activity activity, ium parent, com.taobao.search.sf.a model, ViewGroup viewGroup, iur iurVar) {
        super(activity, parent, model, viewGroup, iurVar);
        q.c(activity, "activity");
        q.c(parent, "parent");
        q.c(model, "model");
        this.h = new com.taobao.search.mmd.uikit.d();
        model.d().subscribe(this);
    }

    /* loaded from: classes8.dex */
    public static final class a {
        static {
            kge.a(-703278905);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    public final com.taobao.search.mmd.datasource.bean.a a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.search.mmd.datasource.bean.a) ipChange.ipc$dispatch("c610c56c", new Object[]{this});
        }
        com.taobao.search.mmd.datasource.bean.a aVar = this.f19504a;
        if (aVar == null) {
            q.b("mPushButtonBean");
        }
        return aVar;
    }

    public final void a(ruk<t> rukVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdbfc750", new Object[]{this, rukVar});
        } else {
            this.i = rukVar;
        }
    }

    public final void b(ruk<t> rukVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec42cdd1", new Object[]{this, rukVar});
        } else {
            this.j = rukVar;
        }
    }

    public LinearLayout b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinearLayout) ipChange.ipc$dispatch("e3daedc0", new Object[]{this});
        }
        View inflate = LayoutInflater.from(getActivity()).inflate(R.layout.tbsearch_push_button, getContainer(), false);
        if (inflate == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        return (LinearLayout) inflate;
    }

    @Override // tb.ius, tb.iup
    public void findAllViews() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1d31fad", new Object[]{this});
            return;
        }
        LinearLayout linearLayout = (LinearLayout) getView();
        if (linearLayout == null) {
            q.a();
        }
        View findViewById = linearLayout.findViewById(R.id.highlight_float_button);
        q.a((Object) findViewById, "findViewById(R.id.highlight_float_button)");
        this.c = (TUrlImageView) findViewById;
        TUrlImageView tUrlImageView = this.c;
        if (tUrlImageView == null) {
            q.b("mHighLightImage");
        }
        tUrlImageView.setVisibility(8);
        TUrlImageView tUrlImageView2 = this.c;
        if (tUrlImageView2 == null) {
            q.b("mHighLightImage");
        }
        k kVar = this;
        tUrlImageView2.setOnClickListener(kVar);
        View findViewById2 = linearLayout.findViewById(R.id.highlight_red_dot);
        q.a((Object) findViewById2, "findViewById(R.id.highlight_red_dot)");
        this.d = findViewById2;
        View findViewById3 = linearLayout.findViewById(R.id.normal_float_button);
        q.a((Object) findViewById3, "findViewById(R.id.normal_float_button)");
        this.b = (TUrlImageView) findViewById3;
        TUrlImageView tUrlImageView3 = this.b;
        if (tUrlImageView3 == null) {
            q.b("mNormalFloatButton");
        }
        tUrlImageView3.setVisibility(8);
        TUrlImageView tUrlImageView4 = this.b;
        if (tUrlImageView4 == null) {
            q.b("mNormalFloatButton");
        }
        tUrlImageView4.setOnClickListener(kVar);
        View findViewById4 = linearLayout.findViewById(R.id.hint_parent);
        q.a((Object) findViewById4, "findViewById(R.id.hint_parent)");
        this.f = (FrameLayout) findViewById4;
        FrameLayout frameLayout = this.f;
        if (frameLayout == null) {
            q.b("mHintParent");
        }
        frameLayout.setOnClickListener(kVar);
        FrameLayout frameLayout2 = this.f;
        if (frameLayout2 == null) {
            q.b("mHintParent");
        }
        frameLayout2.setVisibility(8);
        View findViewById5 = linearLayout.findViewById(R.id.hintText);
        q.a((Object) findViewById5, "findViewById(R.id.hintText)");
        this.e = (TextView) findViewById5;
        TextView textView = this.e;
        if (textView == null) {
            q.b("mHintText");
        }
        textView.setLayerType(1, null);
        this.h = new com.taobao.search.mmd.uikit.d();
        TextView textView2 = this.e;
        if (textView2 == null) {
            q.b("mHintText");
        }
        textView2.setBackgroundDrawable(this.h);
        View findViewById6 = linearLayout.findViewById(R.id.hintPic);
        q.a((Object) findViewById6, "findViewById(R.id.hintPic)");
        this.g = (TUrlImageView) findViewById6;
        TUrlImageView tUrlImageView5 = this.g;
        if (tUrlImageView5 == null) {
            q.b("mHintPic");
        }
        tUrlImageView5.setVisibility(8);
    }

    public void a(com.taobao.search.mmd.datasource.bean.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d155fd6c", new Object[]{this, aVar});
            return;
        }
        super.bindWithData(aVar);
        if (aVar == null) {
            q.a();
        }
        this.f19504a = aVar;
        com.taobao.search.sf.a model = getModel();
        q.a((Object) model, "model");
        com.taobao.search.sf.datasource.c d2 = model.d();
        q.a((Object) d2, "model.scopeDatasource");
        int currentPage = d2.getCurrentPage();
        com.taobao.search.mmd.datasource.bean.a aVar2 = this.f19504a;
        if (aVar2 == null) {
            q.b("mPushButtonBean");
        }
        a(currentPage, aVar2);
    }

    public final void a(int i, com.taobao.search.mmd.datasource.bean.a bean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2824b99", new Object[]{this, new Integer(i), bean});
            return;
        }
        q.c(bean, "bean");
        if (!n.a(com.taobao.search.mmd.datasource.bean.a.MODE_BY_PAGE_WITHOUT_CLICK, bean.k, true)) {
            return;
        }
        int i2 = bean.m;
        if (1 <= i2 && i >= i2 && i < bean.n) {
            boolean a2 = a(bean, i);
            TUrlImageView tUrlImageView = this.b;
            if (tUrlImageView == null) {
                q.b("mNormalFloatButton");
            }
            if (tUrlImageView.getVisibility() != 8) {
                return;
            }
            boolean a3 = q.a((Object) "promotion", (Object) bean.l);
            if (a3) {
                FrameLayout frameLayout = this.f;
                if (frameLayout == null) {
                    q.b("mHintParent");
                }
                frameLayout.getLayoutParams().height = DensityUtil.dip2px(this.mActivity, 39.0f);
                TextView textView = this.e;
                if (textView == null) {
                    q.b("mHintText");
                }
                textView.setTextSize(1, 14.0f);
                FrameLayout frameLayout2 = this.f;
                if (frameLayout2 == null) {
                    q.b("mHintParent");
                }
                ViewGroup.LayoutParams layoutParams = frameLayout2.getLayoutParams();
                if (layoutParams == null) {
                    throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = DensityUtil.dip2px(this.mActivity, 10.0f);
            }
            this.h.a(bean.i);
            this.h.b(bean.j);
            this.h.a(a3);
            this.h.a();
            TextView textView2 = this.e;
            if (textView2 == null) {
                q.b("mHintText");
            }
            textView2.setTextColor(bean.h);
            TUrlImageView tUrlImageView2 = this.b;
            if (tUrlImageView2 == null) {
                q.b("mNormalFloatButton");
            }
            tUrlImageView2.setContentDescription(bean.f19161a);
            TUrlImageView tUrlImageView3 = this.b;
            if (tUrlImageView3 == null) {
                q.b("mNormalFloatButton");
            }
            tUrlImageView3.setImageUrl(bean.b);
            if (!a2 || StringUtils.isEmpty(bean.c)) {
                d();
            }
            com.taobao.search.sf.a model = getModel();
            q.a((Object) model, "model");
            com.taobao.search.sf.datasource.c d2 = model.d();
            q.a((Object) d2, "model.scopeDatasource");
            String keyword = d2.getKeyword();
            ArrayMap arrayMap = new ArrayMap();
            ArrayMap arrayMap2 = arrayMap;
            arrayMap2.put("q", keyword);
            arrayMap2.put("highlighted", String.valueOf(a2));
            com.taobao.search.mmd.util.e.a("PushButton" + bean.p + "Display", (ArrayMap<String, String>) arrayMap);
            ruk<t> rukVar = this.j;
            if (rukVar == null) {
                return;
            }
            rukVar.mo2427invoke();
            return;
        }
        TUrlImageView tUrlImageView4 = this.b;
        if (tUrlImageView4 == null) {
            q.b("mNormalFloatButton");
        }
        if (tUrlImageView4.getVisibility() != 0) {
            return;
        }
        if (!bean.s) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration(300);
            alphaAnimation.setAnimationListener(new e());
            TUrlImageView tUrlImageView5 = this.b;
            if (tUrlImageView5 == null) {
                q.b("mNormalFloatButton");
            }
            tUrlImageView5.startAnimation(alphaAnimation);
        }
        TUrlImageView tUrlImageView6 = this.c;
        if (tUrlImageView6 == null) {
            q.b("mHighLightImage");
        }
        tUrlImageView6.setVisibility(8);
        FrameLayout frameLayout3 = this.f;
        if (frameLayout3 == null) {
            q.b("mHintParent");
        }
        frameLayout3.setVisibility(8);
        View view = this.d;
        if (view == null) {
            q.b("mHighlightDot");
        }
        view.setVisibility(8);
    }

    /* loaded from: classes8.dex */
    public static final class e implements Animation.AnimationListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8f2883e7", new Object[]{this, animation});
            } else {
                q.c(animation, "animation");
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f2d146c4", new Object[]{this, animation});
            } else {
                q.c(animation, "animation");
            }
        }

        public e() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("724c33d", new Object[]{this, animation});
                return;
            }
            q.c(animation, "animation");
            k.a(k.this).setVisibility(8);
            k.b(k.this).setVisibility(8);
        }
    }

    private final boolean a(com.taobao.search.mmd.datasource.bean.a aVar, int i) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596a231b", new Object[]{this, aVar, new Integer(i)})).booleanValue();
        }
        if (aVar.u || aVar.f != i) {
            return false;
        }
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.mActivity);
        if (System.currentTimeMillis() - defaultSharedPreferences.getLong(l.KEY_LAST_TIME_PREFIX + aVar.p, 0L) < aVar.r) {
            aVar.u = true;
            return false;
        }
        if (!StringUtils.isEmpty(aVar.d) || !StringUtils.isEmpty(aVar.e)) {
            b(aVar);
            z = true;
        }
        if (!StringUtils.isEmpty(aVar.c)) {
            c(aVar);
            z = true;
        } else {
            TUrlImageView tUrlImageView = this.c;
            if (tUrlImageView == null) {
                q.b("mHighLightImage");
            }
            tUrlImageView.setVisibility(8);
        }
        if (z) {
            SharedPreferences.Editor edit = defaultSharedPreferences.edit();
            edit.putLong(l.KEY_LAST_TIME_PREFIX + aVar.p, System.currentTimeMillis()).apply();
            View view = this.d;
            if (view == null) {
                q.b("mHighlightDot");
            }
            view.postDelayed(new d(aVar), (aVar.g * 1000) + 600);
            aVar.t = true;
        }
        aVar.u = true;
        return z;
    }

    private final void b(com.taobao.search.mmd.datasource.bean.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8acd8b0b", new Object[]{this, aVar});
            return;
        }
        FrameLayout frameLayout = this.f;
        if (frameLayout == null) {
            q.b("mHintParent");
        }
        frameLayout.postDelayed(new c(aVar), 300);
    }

    private final void c(com.taobao.search.mmd.datasource.bean.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("444518aa", new Object[]{this, aVar});
            return;
        }
        TUrlImageView tUrlImageView = this.c;
        if (tUrlImageView == null) {
            q.b("mHighLightImage");
        }
        tUrlImageView.setImageUrl(aVar.c);
        TUrlImageView tUrlImageView2 = this.c;
        if (tUrlImageView2 == null) {
            q.b("mHighLightImage");
        }
        tUrlImageView2.setVisibility(0);
        AnimationSet animationSet = new AnimationSet(false);
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(new OvershootInterpolator(3.0f));
        animationSet.addAnimation(scaleAnimation);
        animationSet.addAnimation(new AlphaAnimation(0.0f, 1.0f));
        long j = 300;
        animationSet.setDuration(j);
        TUrlImageView tUrlImageView3 = this.c;
        if (tUrlImageView3 == null) {
            q.b("mHighLightImage");
        }
        tUrlImageView3.startAnimation(animationSet);
        TUrlImageView tUrlImageView4 = this.c;
        if (tUrlImageView4 == null) {
            q.b("mHighLightImage");
        }
        tUrlImageView4.postDelayed(new b(), (aVar.g * 1000) + j);
    }

    private final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        TUrlImageView tUrlImageView = this.b;
        if (tUrlImageView == null) {
            q.b("mNormalFloatButton");
        }
        tUrlImageView.setVisibility(0);
        AnimationSet animationSet = new AnimationSet(false);
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(new OvershootInterpolator(3.0f));
        animationSet.addAnimation(scaleAnimation);
        animationSet.addAnimation(new AlphaAnimation(0.0f, 1.0f));
        animationSet.setDuration(300);
        TUrlImageView tUrlImageView2 = this.b;
        if (tUrlImageView2 == null) {
            q.b("mNormalFloatButton");
        }
        tUrlImageView2.startAnimation(animationSet);
    }

    private final AnimationSet e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AnimationSet) ipChange.ipc$dispatch("e11a95ea", new Object[]{this});
        }
        AnimationSet animationSet = new AnimationSet(false);
        animationSet.setDuration(300);
        animationSet.addAnimation(new ScaleAnimation(0.0f, 1.0f, 1.0f, 1.0f, 1, 1.0f, 1, 1.0f));
        animationSet.addAnimation(new AlphaAnimation(0.0f, 1.0f));
        return animationSet;
    }

    private final AnimationSet f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AnimationSet) ipChange.ipc$dispatch("6dbac0eb", new Object[]{this});
        }
        AnimationSet animationSet = new AnimationSet(true);
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.0f, 1.0f, 1.0f, 1, 1.0f, 1, 1.0f);
        animationSet.setDuration(300);
        animationSet.addAnimation(scaleAnimation);
        animationSet.addAnimation(new AlphaAnimation(1.0f, 0.0f));
        return animationSet;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        com.taobao.search.mmd.datasource.bean.a aVar = this.f19504a;
        if (aVar == null) {
            q.b("mPushButtonBean");
        }
        if (StringUtils.equals(aVar.q, "openPk")) {
            g();
        } else {
            h();
        }
        com.taobao.search.mmd.datasource.bean.a aVar2 = this.f19504a;
        if (aVar2 == null) {
            q.b("mPushButtonBean");
        }
        aVar2.s = true;
        com.taobao.search.sf.a model = getModel();
        q.a((Object) model, "model");
        com.taobao.search.sf.datasource.c d2 = model.d();
        q.a((Object) d2, "model.scopeDatasource");
        String keyword = d2.getKeyword();
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = arrayMap;
        arrayMap2.put("q", keyword);
        com.taobao.search.mmd.datasource.bean.a aVar3 = this.f19504a;
        if (aVar3 == null) {
            q.b("mPushButtonBean");
        }
        arrayMap2.put("highlighted", String.valueOf(aVar3.t));
        StringBuilder sb = new StringBuilder();
        sb.append("PushButton");
        com.taobao.search.mmd.datasource.bean.a aVar4 = this.f19504a;
        if (aVar4 == null) {
            q.b("mPushButtonBean");
        }
        sb.append(aVar4.p);
        sb.append("Click");
        com.taobao.search.mmd.util.e.a(sb.toString(), (ArrayMap<String, String>) arrayMap);
        View view2 = this.d;
        if (view2 == null) {
            q.b("mHighlightDot");
        }
        view2.clearAnimation();
        View view3 = this.d;
        if (view3 == null) {
            q.b("mHighlightDot");
        }
        view3.setVisibility(8);
        ruk<t> rukVar = this.i;
        if (rukVar == null) {
            return;
        }
        rukVar.mo2427invoke();
    }

    private final void g() {
        TemplateBean template;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        iul findComponentOfScope = findComponentOfScope("childPageWidget");
        MuiseBean muiseBean = null;
        if (!(findComponentOfScope instanceof iup)) {
            findComponentOfScope = null;
        }
        iup iupVar = (iup) findComponentOfScope;
        if (iupVar == null) {
            return;
        }
        View view = iupVar.getView();
        if (!(view instanceof ViewGroup)) {
            view = null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup == null) {
            return;
        }
        com.taobao.search.sf.a model = getModel();
        q.a((Object) model, "model");
        com.taobao.search.sf.datasource.c d2 = model.d();
        q.a((Object) d2, "model.scopeDatasource");
        CommonSearchResult commonSearchResult = (CommonSearchResult) d2.getTotalSearchResult();
        if (commonSearchResult == null) {
            return;
        }
        q.a((Object) commonSearchResult, "dataSource.totalSearchResult ?: return");
        BaseTypedBean baseTypedBean = commonSearchResult.pkModuleBean;
        if (baseTypedBean instanceof MuiseBean) {
            muiseBean = baseTypedBean;
        }
        MuiseBean muiseBean2 = muiseBean;
        if (muiseBean2 == null || (template = d2.getTemplate(muiseBean2.type)) == null) {
            return;
        }
        q.a((Object) template, "dataSource.getTemplate(p…oduleBean.type) ?: return");
        Activity activity = getActivity();
        q.a((Object) activity, "activity");
        iup iupVar2 = iupVar;
        com.taobao.search.sf.a model2 = getModel();
        q.a((Object) model2, "model");
        nwy nwyVar = new nwy(activity, iupVar2, model2, template, viewGroup, new iug(viewGroup));
        nwyVar.a(muiseBean2);
        nwyVar.attachToContainer();
    }

    private final void h() {
        String str;
        ResultMainInfoBean mainInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        com.taobao.search.mmd.datasource.bean.a aVar = this.f19504a;
        if (aVar == null) {
            q.b("mPushButtonBean");
        }
        if (StringUtils.isEmpty(aVar.o)) {
            return;
        }
        com.taobao.search.sf.a model = getModel();
        q.a((Object) model, "model");
        com.taobao.search.sf.datasource.c d2 = model.d();
        q.a((Object) d2, "model.scopeDatasource");
        CommonSearchResult commonSearchResult = (CommonSearchResult) d2.getLastSearchResult();
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = arrayMap;
        if (commonSearchResult == null || (mainInfo = commonSearchResult.getMainInfo()) == null || (str = mainInfo.rn) == null) {
            str = "";
        }
        arrayMap2.put(aw.PARAM_SEARCH_KEYWORD_RN, str);
        com.taobao.search.sf.a model2 = getModel();
        q.a((Object) model2, "model");
        arrayMap2.put("srpKey", String.valueOf(model2.d().hashCode()));
        Nav from = Nav.from(this.mActivity);
        com.taobao.search.mmd.datasource.bean.a aVar2 = this.f19504a;
        if (aVar2 == null) {
            q.b("mPushButtonBean");
        }
        from.toUri(y.a(aVar2.o, (ArrayMap<String, String>) arrayMap));
    }

    public final void onEventMainThread(isv.a after) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a0bf04c", new Object[]{this, after});
            return;
        }
        q.c(after, "after");
        com.taobao.search.sf.a model = getModel();
        q.a((Object) model, "model");
        com.taobao.search.sf.datasource.c d2 = model.d();
        q.a((Object) d2, "model.scopeDatasource");
        int currentPage = d2.getCurrentPage();
        com.taobao.search.mmd.datasource.bean.a aVar = this.f19504a;
        if (aVar == null) {
            q.b("mPushButtonBean");
        }
        a(currentPage, aVar);
    }
}
