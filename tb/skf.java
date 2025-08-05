package tb;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.devtools.IDevToolsService;
import com.taobao.android.fluid.framework.analysis.IAnalysisService;
import com.taobao.android.fluid.framework.back.IBackEventService;
import com.taobao.android.fluid.framework.card.ICardService;
import com.taobao.android.fluid.framework.container.IContainerService;
import com.taobao.android.fluid.framework.container.render.DefaultPageType;
import com.taobao.android.fluid.framework.container.render.view.MultiTabLayout;
import com.taobao.android.fluid.framework.data.datamodel.MediaContentDetailData;
import com.taobao.android.litecreator.util.x;
import com.taobao.android.weex_framework.ui.MUSTouchInterceptWrapperView;
import com.taobao.orange.a;
import com.taobao.taobao.R;
import com.taobao.tbmobilesmartapi.collector.DefaultGestureCollectorDelegateLayout;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.taobao.uikit.feature.features.ImageShapeFeature;
import tb.shm;

/* loaded from: classes5.dex */
public class skf implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int TOPMASK_HEIGHT = 50;

    /* renamed from: a  reason: collision with root package name */
    private final FluidContext f33642a;
    private final MultiTabLayout b;
    private final DefaultGestureCollectorDelegateLayout c;
    private final ViewStub d;
    private FrameLayout e;
    private final FrameLayout f;
    private TUrlImageView g;
    private View h;
    private View i;
    private final Context j;
    @Deprecated
    private ImageView k;
    @Deprecated
    private ImageView l;
    @Deprecated
    private TUrlImageView m;
    private LinearLayout n;
    private ViewGroup o;
    @Deprecated
    private ViewGroup p;
    private DefaultPageType q = DefaultPageType.HIDE;
    private TextView r;
    private TextView s;
    private TextView t;
    private TUrlImageView u;
    private TextView v;
    private psw w;
    private psw x;

    /* renamed from: tb.skf$5  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class AnonymousClass5 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f33646a = new int[DefaultPageType.values().length];

        static {
            try {
                f33646a[DefaultPageType.EMPTY_FOLLOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33646a[DefaultPageType.NO_PERMISSION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f33646a[DefaultPageType.NORMAL_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        kge.a(1392953823);
        kge.a(-1201612728);
    }

    public static /* synthetic */ psw a(skf skfVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (psw) ipChange.ipc$dispatch("aa486fe8", new Object[]{skfVar}) : skfVar.w;
    }

    public static /* synthetic */ psw a(skf skfVar, psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (psw) ipChange.ipc$dispatch("a6ed8b4c", new Object[]{skfVar, pswVar});
        }
        skfVar.x = pswVar;
        return pswVar;
    }

    public static /* synthetic */ psw b(skf skfVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (psw) ipChange.ipc$dispatch("91ea4647", new Object[]{skfVar}) : skfVar.x;
    }

    public static /* synthetic */ psw b(skf skfVar, psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (psw) ipChange.ipc$dispatch("97be92ab", new Object[]{skfVar, pswVar});
        }
        skfVar.w = pswVar;
        return pswVar;
    }

    public static /* synthetic */ TextView c(skf skfVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("5b83c080", new Object[]{skfVar}) : skfVar.v;
    }

    public static /* synthetic */ void c(skf skfVar, psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0168728", new Object[]{skfVar, pswVar});
        } else {
            skfVar.a(pswVar);
        }
    }

    public static /* synthetic */ FluidContext d(skf skfVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FluidContext) ipChange.ipc$dispatch("f4c6bd9b", new Object[]{skfVar}) : skfVar.f33642a;
    }

    public static /* synthetic */ Context e(skf skfVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("29d71e06", new Object[]{skfVar}) : skfVar.j;
    }

    public skf(FluidContext fluidContext) {
        this.f33642a = fluidContext;
        this.j = fluidContext.getContext();
        this.b = a(this.j, this.f33642a.getInstanceConfig().isHideTopLayout());
        this.p = (ViewGroup) this.b.findViewById(R.id.top_layout);
        this.k = (ImageView) this.b.findViewById(R.id.tbvideo_back);
        this.v = (TextView) this.b.findViewById(R.id.tbvideo_top_title);
        this.l = (ImageView) this.b.findViewById(R.id.tbvideo_search);
        this.c = (DefaultGestureCollectorDelegateLayout) this.b.findViewById(R.id.main_content);
        this.m = (TUrlImageView) this.b.findViewById(R.id.tbvideo_more);
        this.d = (ViewStub) this.b.findViewById(R.id.tab_exception_layout);
        this.f = (FrameLayout) this.b.findViewById(R.id.tab_anim_layout);
        ImageView imageView = this.k;
        if (imageView != null) {
            imageView.setOnClickListener(this);
        }
        ViewGroup viewGroup = this.p;
        if (viewGroup != null) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) viewGroup.getLayoutParams();
            layoutParams.height = ohd.a(this.j, soi.b());
            this.p.setLayoutParams(layoutParams);
            this.p.requestLayout();
        }
        a((ViewGroup) this.b);
    }

    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
            return;
        }
        boolean z = false;
        for (int i = 0; i < this.c.getChildCount(); i++) {
            if (this.c.getChildAt(i) instanceof MUSTouchInterceptWrapperView) {
                z = true;
            }
        }
        if (z) {
            DefaultGestureCollectorDelegateLayout defaultGestureCollectorDelegateLayout = this.c;
            defaultGestureCollectorDelegateLayout.addView(view, defaultGestureCollectorDelegateLayout.getChildCount() - 1, new ViewGroup.LayoutParams(-1, -1));
            return;
        }
        this.c.addView(view, new ViewGroup.LayoutParams(-1, -1));
    }

    public ViewStub a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewStub) ipChange.ipc$dispatch("99d7081c", new Object[]{this}) : (ViewStub) this.b.findViewById(R.id.album_detail_view_stub);
    }

    public int a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{this, new Integer(i)})).intValue();
        }
        ViewGroup viewGroup = this.p;
        if (viewGroup == null) {
            return 8;
        }
        return ocf.a(viewGroup, i);
    }

    public ViewGroup b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("7d42400c", new Object[]{this}) : this.f;
    }

    public MultiTabLayout c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MultiTabLayout) ipChange.ipc$dispatch("3b19a6ad", new Object[]{this}) : this.b;
    }

    public View.OnClickListener a(DefaultPageType defaultPageType) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View.OnClickListener) ipChange.ipc$dispatch("88b7db5a", new Object[]{this, defaultPageType}) : AnonymousClass5.f33646a[defaultPageType.ordinal()] != 1 ? this : q();
    }

    public ViewGroup d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("5ee44eca", new Object[]{this}) : (ViewGroup) this.b.findViewById(R.id.global_tnode);
    }

    public ViewStub e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewStub) ipChange.ipc$dispatch("7f1b4b20", new Object[]{this}) : (ViewStub) this.b.findViewById(R.id.good_list_view_stub);
    }

    public ViewGroup f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("40865d88", new Object[]{this});
        }
        c(this.j);
        return this.e;
    }

    public TUrlImageView s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("57a56242", new Object[]{this});
        }
        c(this.j);
        return this.g;
    }

    public View t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("9b0e1a7d", new Object[]{this});
        }
        c(this.j);
        return this.h;
    }

    public View u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("e53fb3be", new Object[]{this});
        }
        c(this.j);
        return this.i;
    }

    public ViewGroup v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("4d96d378", new Object[]{this});
        }
        b(this.j);
        return this.o;
    }

    public TUrlImageView w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("5c7eadbe", new Object[]{this});
        }
        b(this.j);
        return this.u;
    }

    public DefaultGestureCollectorDelegateLayout g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DefaultGestureCollectorDelegateLayout) ipChange.ipc$dispatch("67727028", new Object[]{this}) : this.c;
    }

    public View h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("20baeb71", new Object[]{this}) : this.m;
    }

    public View i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("6aec84b2", new Object[]{this}) : this.r;
    }

    public View j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("b51e1df3", new Object[]{this}) : this.l;
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        LinearLayout linearLayout = this.n;
        if (linearLayout == null) {
            return;
        }
        linearLayout.setVisibility(8);
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        ViewGroup viewGroup = this.o;
        if (viewGroup == null) {
            return;
        }
        viewGroup.setVisibility(8);
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        FrameLayout frameLayout = this.e;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        this.q = DefaultPageType.HIDE;
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
        } else {
            a(DefaultPageType.NORMAL_ERROR, (Object) null);
        }
    }

    public void a(DefaultPageType defaultPageType, Object obj) {
        String string;
        String string2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e44119cd", new Object[]{this, defaultPageType, obj});
            return;
        }
        this.q = defaultPageType;
        try {
            r();
            int i = AnonymousClass5.f33646a[defaultPageType.ordinal()];
            String str = "";
            if (i == 1) {
                string = a.g.getString(R.string.fluid_sdk_error_follow_empty_title);
                str = a.g.getString(R.string.fluid_sdk_error_follow_empty_subtitle);
                string2 = a.g.getString(R.string.fluid_sdk_error_follow_empty_button);
                this.r.setBackground(a.g.getDrawable(R.drawable.fluid_sdk_error_button_orange_background));
            } else if (i == 2) {
                this.r.setVisibility(8);
                this.t.setVisibility(8);
                string = (!(obj instanceof String) || TextUtils.isEmpty((String) obj)) ? "由于作者设置，原分享内容暂时没有权限查看哦~" : (String) obj;
                string2 = str;
            } else {
                string = a.g.getString(R.string.fluid_sdk_error_default_title);
                str = a.g.getString(R.string.fluid_sdk_error_default_subtitle);
                string2 = a.g.getString(R.string.fluid_sdk_error_default_button);
                this.r.setBackground(a.g.getDrawable(R.drawable.fluid_sdk_error_button_background));
            }
            this.s.setText(string);
            this.t.setText(str);
            this.r.setText(string2);
            this.r.setOnClickListener(a(defaultPageType));
            this.n.bringToFront();
        } catch (Exception unused) {
            LinearLayout linearLayout = this.n;
            if (linearLayout == null) {
                return;
            }
            linearLayout.setVisibility(0);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (view.getId() == R.id.tbvideo_back) {
            ((IBackEventService) this.f33642a.getService(IBackEventService.class)).handleExitFullPage();
        } else if (view == i()) {
            ((IAnalysisService) this.f33642a.getService(IAnalysisService.class)).setRetryFetchContent(true);
            ((IContainerService) this.f33642a.getService(IContainerService.class)).refreshWithCallback(null);
        } else if (view == h()) {
            smg.a(this.f33642a);
        } else if (view != j()) {
        } else {
            smg.b(this.f33642a);
        }
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.b.setLockedTouchEvent(z);
        }
    }

    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
            return;
        }
        b(this.j);
        this.o.setVisibility(0);
        Drawable drawable = this.j.getResources().getDrawable(R.drawable.fluid_sdk_tab3_loading);
        int a2 = obx.a(this.j, 35.0f);
        ViewGroup.LayoutParams layoutParams = this.u.getLayoutParams();
        layoutParams.width = a2;
        layoutParams.height = a2;
        this.u.setLayoutParams(layoutParams);
        this.u.setImageDrawable(drawable);
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setInterpolator(new LinearInterpolator());
        rotateAnimation.setDuration(1000L);
        rotateAnimation.setRepeatCount(-1);
        this.u.startAnimation(rotateAnimation);
        this.u.setVisibility(0);
        spz.a("DefaultFluidInstance", "动画开始");
    }

    public void a(RotateAnimation rotateAnimation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7f24f23", new Object[]{this, rotateAnimation});
            return;
        }
        c(this.j);
        TUrlImageView tUrlImageView = this.g;
        if (tUrlImageView == null || rotateAnimation == null || !tUrlImageView.isShown()) {
            return;
        }
        this.g.startAnimation(rotateAnimation);
        this.q = DefaultPageType.LOADING;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (this.m == null) {
        } else {
            if (!TextUtils.isEmpty(str)) {
                this.m.setImageDrawable(null);
                this.m.setImageUrl(str);
                this.m.setScaleType(ImageView.ScaleType.FIT_CENTER);
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.m.getLayoutParams();
                layoutParams.rightMargin = obx.a(this.j, 5.0f);
                int a2 = obx.a(this.j, 23.0f);
                int i = (layoutParams.width - a2) / 2;
                int i2 = (layoutParams.height - a2) / 2;
                this.m.setPadding(i, i2, i, i2);
                obt.a(this.m, 300);
            }
            this.m.setVisibility(0);
            this.m.setOnClickListener(this);
        }
    }

    public void a(Object obj) {
        View findViewById;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
            return;
        }
        TextView textView = this.r;
        if (textView != null) {
            textView.setVisibility(8);
        }
        LinearLayout linearLayout = this.n;
        if (linearLayout != null && (findViewById = linearLayout.findViewById(R.id.tv_error_subtitle)) != null) {
            findViewById.setVisibility(8);
        }
        TextView textView2 = (TextView) this.b.findViewById(R.id.tv_error_title);
        if (textView2 == null) {
            return;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (!TextUtils.isEmpty(str)) {
                textView2.setText(str);
                return;
            }
        }
        textView2.setText("由于作者设置，原分享内容暂时没有权限查看哦~");
    }

    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
            return;
        }
        ImageView imageView = this.l;
        if (imageView == null) {
            return;
        }
        imageView.setVisibility(0);
        this.l.setOnClickListener(this);
    }

    @Deprecated
    private View a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("876fa4a2", new Object[]{this, context});
        }
        ImageView imageView = new ImageView(context);
        imageView.setId(R.id.tbvideo_back);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(obx.a(context, 40.0f), obx.a(context, 40.0f));
        layoutParams.addRule(15);
        imageView.setLayoutParams(layoutParams);
        imageView.setImageResource(R.drawable.fluid_sdk_back);
        imageView.setPadding(obx.a(context, 14.0f), obx.a(context, 12.0f), obx.a(context, 10.0f), obx.a(context, 12.0f));
        return imageView;
    }

    private void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b088ff", new Object[]{this});
            return;
        }
        ICardService iCardService = (ICardService) this.f33642a.getService(ICardService.class);
        if (iCardService == null) {
            spz.c("Container", "initLazyLoadingForTopTitleView: null cardService");
        } else {
            iCardService.addCardLifecycleListener(new shm.a() { // from class: tb.skf.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                    int hashCode = str.hashCode();
                    if (hashCode == -1961121033) {
                        super.onAppear((psw) objArr[0]);
                        return null;
                    } else if (hashCode == -893732120) {
                        super.onActive((psw) objArr[0]);
                        return null;
                    } else if (hashCode != 1933403975) {
                        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                    } else {
                        super.onDisAppear((psw) objArr[0]);
                        return null;
                    }
                }

                @Override // tb.shm.a, tb.shm
                public void onAppear(psw pswVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8b1baaf7", new Object[]{this, pswVar});
                        return;
                    }
                    super.onAppear(pswVar);
                    skf skfVar = skf.this;
                    skf.a(skfVar, skf.a(skfVar));
                    skf.b(skf.this, pswVar);
                }

                @Override // tb.shm.a, tb.shm
                public void onDisAppear(psw pswVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("733d6747", new Object[]{this, pswVar});
                        return;
                    }
                    super.onDisAppear(pswVar);
                    if (pswVar == skf.a(skf.this)) {
                        skf skfVar = skf.this;
                        skf.b(skfVar, skf.b(skfVar));
                    }
                    skf skfVar2 = skf.this;
                    skf.c(skfVar2, skf.a(skfVar2));
                }

                @Override // tb.shm.a, tb.shm
                public void onActive(psw pswVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("cababae8", new Object[]{this, pswVar});
                        return;
                    }
                    super.onActive(pswVar);
                    skf skfVar = skf.this;
                    skf.c(skfVar, skf.a(skfVar));
                }
            });
        }
    }

    private void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bea080", new Object[]{this});
        } else if (this.v != null) {
        } else {
            this.v = new TextView(a.g);
            this.v.setId(R.id.tbvideo_top_title);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(17, R.id.tbvideo_back);
            layoutParams.addRule(15);
            this.v.setLayoutParams(layoutParams);
            int a2 = obx.a(a.g, 16.0f);
            int a3 = obx.a(a.g, 4.0f);
            int i = a3 + 6;
            this.v.setCompoundDrawablePadding(a3);
            this.v.setPadding(i, a3, i, a3);
            this.v.setTextSize(0, a2);
            this.v.setTextColor(-1);
            this.v.setBackgroundResource(R.drawable.fluid_sdk_top_title_bg);
            this.v.setGravity(8388627);
            this.v.setVisibility(4);
            this.v.setOnClickListener(new View.OnClickListener() { // from class: tb.skf.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    }
                }
            });
            this.p.addView(this.v);
            this.p.requestLayout();
        }
    }

    private void a(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa3f5b84", new Object[]{this, pswVar});
        } else if (!(pswVar instanceof sii)) {
            TextView textView = this.v;
            if (textView == null) {
                return;
            }
            textView.setVisibility(4);
        } else {
            MediaContentDetailData.TopTitle M = ((sii) pswVar).D().M();
            if (M == null) {
                TextView textView2 = this.v;
                if (textView2 == null) {
                    return;
                }
                textView2.setVisibility(4);
                spz.c("Container", "updateTopTitleView: null topTitle");
                return;
            }
            y();
            final int a2 = obx.a(a.g, 18.0f);
            final CharSequence ellipsize = TextUtils.ellipsize(M.title, this.v.getPaint(), obx.a(a.g, 216.0f), TextUtils.TruncateAt.END);
            FluidSDK.getImageAdapter().load(M.iconUrl, new com.taobao.android.fluid.framework.adapter.mtop.a<String, BitmapDrawable>() { // from class: tb.skf.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.fluid.framework.adapter.mtop.a
                public void a(String str, BitmapDrawable bitmapDrawable) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("cc1cd0a7", new Object[]{this, str, bitmapDrawable});
                    } else if (bitmapDrawable == null) {
                    } else {
                        int i = a2;
                        bitmapDrawable.setBounds(0, 0, i, i);
                        skf.c(skf.this).setCompoundDrawables(bitmapDrawable, null, null, null);
                        skf.c(skf.this).setText(ellipsize);
                        skf.c(skf.this).setVisibility(0);
                        spz.b("Container", "updateTopTitleView: success");
                    }
                }
            });
        }
    }

    private void a(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a1860a7", new Object[]{this, viewGroup});
        } else if (!sqc.g()) {
            spz.c("Container", "FluidSDK 新架构未集成 fluid-devtools, 不显示调试工具入口");
        } else {
            IDevToolsService iDevToolsService = (IDevToolsService) this.f33642a.getService(IDevToolsService.class);
            if (iDevToolsService == null) {
                spz.c("Container", "FluidSDK 新架构未添加调试服务, 不显示调试工具入口");
            } else {
                iDevToolsService.attachDevToolsEntry(viewGroup);
            }
        }
    }

    private View b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("c13a4681", new Object[]{this, context});
        }
        if (this.o == null) {
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setId(R.id.tab3_had_exposed_loading);
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            frameLayout.setVisibility(8);
            FrameLayout frameLayout2 = new FrameLayout(context);
            frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
            TUrlImageView tUrlImageView = new TUrlImageView(context);
            tUrlImageView.setId(R.id.tab3_had_exposed_loading_image_loading);
            tUrlImageView.setLayoutParams(new FrameLayout.LayoutParams(obx.a(context, 35.0f), obx.a(context, 35.0f), 1));
            frameLayout2.addView(tUrlImageView);
            frameLayout.addView(frameLayout2);
            this.o = frameLayout;
            this.u = tUrlImageView;
            this.b.addView(frameLayout, new ViewGroup.LayoutParams(-1, -1));
        }
        return this.o;
    }

    private View c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("fb04e860", new Object[]{this, context});
        }
        if (this.e == null) {
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setId(R.id.tab_loading_layout);
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            frameLayout.setBackgroundResource(R.color.fluid_sdk_black);
            TUrlImageView tUrlImageView = new TUrlImageView(context);
            tUrlImageView.setId(R.id.image_loading);
            tUrlImageView.setLayoutParams(new FrameLayout.LayoutParams(obx.a(context, 200.0f), obx.a(context, 60.0f), 17));
            if (Build.VERSION.SDK_INT >= 21) {
                tUrlImageView.setTransitionName("share");
            }
            View view = new View(context);
            view.setId(R.id.v_graymask_top);
            view.setLayoutParams(new FrameLayout.LayoutParams(-1, obx.a(context, 50.0f), 48));
            view.setBackgroundResource(R.drawable.fluid_sdk_video_background_top);
            view.setVisibility(4);
            View view2 = new View(context);
            view2.setId(R.id.v_graymask_bottom);
            view2.setLayoutParams(new FrameLayout.LayoutParams(-1, obx.a(context, 285.0f), 80));
            view2.setBackgroundResource(R.drawable.fluid_sdk_video_background_bottom);
            view2.setVisibility(4);
            frameLayout.addView(tUrlImageView);
            frameLayout.addView(view);
            frameLayout.addView(view2);
            this.g = tUrlImageView;
            this.e = frameLayout;
            this.h = view;
            this.i = view2;
            this.b.addView(frameLayout, 0, new ViewGroup.LayoutParams(-1, -1));
        }
        return this.e;
    }

    @Deprecated
    private View d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("34cf8a3f", new Object[]{this, context});
        }
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setId(R.id.top_layout);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, obx.a(context, 1.0f), 0, 0);
        relativeLayout.setLayoutParams(layoutParams);
        relativeLayout.addView(a(context));
        if (sjv.i()) {
            x();
        } else {
            spz.a("Container", "generateTopLayout: remote set invisible");
        }
        ImageView imageView = new ImageView(context);
        imageView.setId(R.id.tbvideo_search);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(obx.a(context, 19.0f), obx.a(context, 20.0f));
        layoutParams2.addRule(11);
        layoutParams2.addRule(15);
        layoutParams2.setMargins(0, 0, obx.a(context, 53.0f), 0);
        imageView.setLayoutParams(layoutParams2);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setImageResource(R.drawable.fluid_sdk_search);
        imageView.setVisibility(8);
        relativeLayout.addView(imageView);
        TUrlImageView tUrlImageView = new TUrlImageView(context);
        tUrlImageView.setId(R.id.avatar);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(obx.a(context, 24.0f), obx.a(context, 24.0f));
        layoutParams3.addRule(11);
        layoutParams3.addRule(15);
        layoutParams3.setMargins(0, 0, obx.a(context, 11.0f), 0);
        tUrlImageView.setLayoutParams(layoutParams3);
        tUrlImageView.setVisibility(8);
        ImageShapeFeature imageShapeFeature = new ImageShapeFeature();
        imageShapeFeature.setShape(0);
        tUrlImageView.addFeature(imageShapeFeature);
        relativeLayout.addView(tUrlImageView);
        TUrlImageView tUrlImageView2 = new TUrlImageView(context);
        tUrlImageView2.setId(R.id.tbvideo_more);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(obx.a(context, 35.0f), obx.a(context, 40.0f));
        layoutParams4.addRule(11);
        layoutParams4.addRule(15);
        tUrlImageView2.setLayoutParams(layoutParams4);
        tUrlImageView2.setPadding(0, obx.a(context, 17.0f), obx.a(context, 15.0f), obx.a(context, 17.0f));
        tUrlImageView2.setScaleType(ImageView.ScaleType.FIT_XY);
        tUrlImageView2.setImageResource(R.drawable.fluid_sdk_more_label);
        tUrlImageView2.setVisibility(8);
        relativeLayout.addView(tUrlImageView2);
        return relativeLayout;
    }

    private MultiTabLayout a(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MultiTabLayout) ipChange.ipc$dispatch("6070ebb7", new Object[]{this, context, new Boolean(z)});
        }
        MultiTabLayout multiTabLayout = new MultiTabLayout(context);
        multiTabLayout.setId(R.id.multi_tab_layout);
        multiTabLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        multiTabLayout.setBackgroundColor(-16777216);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.tab_anim_layout);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        multiTabLayout.addView(frameLayout);
        DefaultGestureCollectorDelegateLayout defaultGestureCollectorDelegateLayout = new DefaultGestureCollectorDelegateLayout(context);
        defaultGestureCollectorDelegateLayout.setId(R.id.main_content);
        defaultGestureCollectorDelegateLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        multiTabLayout.addView(defaultGestureCollectorDelegateLayout);
        ViewStub viewStub = new ViewStub(context);
        viewStub.setId(R.id.tab_exception_layout);
        viewStub.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        viewStub.setBackgroundColor(-16777216);
        viewStub.setLayoutResource(R.layout.fluid_sdk_ly_multi_tab_page_error_layout);
        multiTabLayout.addView(viewStub);
        if (!z) {
            multiTabLayout.addView(d(context));
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setId(R.id.global_tnode);
        frameLayout2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        multiTabLayout.addView(frameLayout2);
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout3.setId(R.id.global_h5);
        frameLayout3.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        multiTabLayout.addView(frameLayout3);
        ViewStub viewStub2 = new ViewStub(context);
        viewStub2.setId(R.id.stub_more_action);
        viewStub2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        multiTabLayout.addView(viewStub2);
        ViewStub viewStub3 = new ViewStub(context);
        viewStub3.setId(R.id.good_list_view_stub);
        viewStub3.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        viewStub3.setVisibility(8);
        multiTabLayout.addView(viewStub3);
        ViewStub viewStub4 = new ViewStub(context);
        viewStub4.setId(R.id.comment_view_stub);
        viewStub4.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        viewStub4.setVisibility(8);
        multiTabLayout.addView(viewStub4);
        ViewStub viewStub5 = new ViewStub(context);
        viewStub5.setId(R.id.album_detail_view_stub);
        viewStub5.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        viewStub5.setVisibility(8);
        multiTabLayout.addView(viewStub5);
        return multiTabLayout;
    }

    private View.OnClickListener q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View.OnClickListener) ipChange.ipc$dispatch("c2b179e1", new Object[]{this}) : new View.OnClickListener() { // from class: tb.skf.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    FluidSDK.getNavAdapter().nav(skf.d(skf.this), skf.e(skf.this), "https://h5.m.taobao.com/guangguang/index.htm?tabid=video", null);
                }
            }
        };
    }

    private void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65bfbf9", new Object[]{this});
            return;
        }
        this.n = (LinearLayout) this.d.inflate();
        this.n.setVisibility(0);
        this.s = (TextView) this.n.findViewById(R.id.tv_error_title);
        this.t = (TextView) this.n.findViewById(R.id.tv_error_subtitle);
        this.r = (TextView) this.n.findViewById(R.id.v_error_action);
        this.s.setVisibility(0);
        this.t.setVisibility(0);
        this.r.setVisibility(0);
        this.n.setBackgroundColor(Color.parseColor(x.ERROR_COLOR_STRING));
        this.n.setClickable(true);
        pio.a(this.n);
    }
}
