package tb;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.res.Configuration;
import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.birdnest.util.UiUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.OnScreenChangedListener;
import com.taobao.android.autosize.h;
import com.taobao.android.detail2.core.framework.base.volume.VolumeChangeManager;
import com.taobao.android.detail2.core.framework.data.global.NewDetailScreenConfig;
import com.taobao.android.detail2.core.framework.e;
import com.taobao.android.detail2.core.framework.view.NewDetailMaskFrameLayout;
import com.taobao.android.detail2.core.framework.view.feeds.DetailVerticalRecyclerView;
import com.taobao.android.detail2.core.framework.view.feeds.c;
import com.taobao.android.detail2.core.framework.view.feeds.g;
import com.taobao.android.detail2.core.framework.view.manager.ListViewManager;
import com.taobao.android.detail2.core.framework.view.manager.NavBarViewManager;
import com.taobao.android.detail2.core.framework.view.manager.a;
import com.taobao.android.detail2.core.optimize.prerender.b;
import com.taobao.android.tbsku.container.TBXSkuContainer;
import com.taobao.android.trade.event.ThreadMode;
import com.taobao.android.trade.event.i;
import com.taobao.android.trade.event.j;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes5.dex */
public class fmd implements j<fir> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public RelativeLayout f28050a;
    private FrameLayout b;
    private View c;
    private com.taobao.android.detail2.core.framework.view.manager.a d;
    private ListViewManager e;
    private NavBarViewManager f;
    private ImageView g;
    private FrameLayout h;
    private e.a i;
    private com.taobao.android.detail2.core.framework.base.weex.e k;
    private com.taobao.android.detail2.core.framework.b l;
    private flz m;
    private View n;
    private boolean o;
    private TBXSkuContainer p;
    private int t;
    private int u;
    private com.taobao.android.detail2.core.framework.floatwindow.c v;
    private fjb w;
    private NewDetailScreenConfig.ScreenType z;
    private List<fls> j = new ArrayList();
    private a q = new a();
    private List<d> r = new ArrayList();
    private e A = new e();
    private List<c> s = new ArrayList();
    private List<f> B = new ArrayList();
    private NavBarViewManager.a x = new NavBarViewManager.a() { // from class: tb.fmd.3
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.detail2.core.framework.view.manager.NavBarViewManager.a
        public void a(NavBarViewManager.NavOperation navOperation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("459ddb3d", new Object[]{this, navOperation});
            } else if (AnonymousClass5.f28057a[navOperation.ordinal()] != 1 || fmd.this.p()) {
            } else {
                fmd.a(fmd.this).f().finishNewDetailContainer();
            }
        }
    };
    private com.taobao.android.detail2.core.framework.view.feeds.b y = new com.taobao.android.detail2.core.framework.view.feeds.b() { // from class: tb.fmd.4
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass4 anonymousClass4, String str, Object... objArr) {
            str.hashCode();
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        @Override // com.taobao.android.detail2.core.framework.view.feeds.b, com.taobao.android.detail2.core.framework.view.feeds.DetailVerticalRecyclerView.a
        public void a(float f2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f2)});
                return;
            }
            b(f2);
            if (!fmd.b(fmd.this).a()) {
                return;
            }
            fmd.a(fmd.this).f().finishNewDetailContainer();
        }

        private void b(float f2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a9d660f7", new Object[]{this, new Float(f2)});
            } else if (f2 <= 160.0f) {
            } else {
                HashMap hashMap = new HashMap();
                com.taobao.android.detail2.core.framework.data.model.d d2 = fmd.this.d();
                if (d2 == null) {
                    return;
                }
                hashMap.put("spm", fjh.a(d2, d2.P()) + ".slide");
                fmd.c(fmd.this).a("", "SlideUp_PartialScreen", "", "", hashMap, d2);
            }
        }

        @Override // com.taobao.android.detail2.core.framework.view.feeds.b, com.taobao.android.detail2.core.framework.view.feeds.DetailVerticalRecyclerView.a
        public void a(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5f37b47d", new Object[]{this, motionEvent});
                return;
            }
            for (f fVar : fmd.d(fmd.this)) {
                if (fVar != null) {
                    fVar.a(motionEvent);
                }
            }
        }
    };

    /* renamed from: tb.fmd$5  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class AnonymousClass5 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f28057a = new int[NavBarViewManager.NavOperation.values().length];

        static {
            try {
                f28057a[NavBarViewManager.NavOperation.OPERATION_BACK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* loaded from: classes5.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public float f28059a;
        public float b;
        public int c;
        public int d;
        public int e;
        public int f;

        static {
            kge.a(1629174136);
        }
    }

    /* loaded from: classes5.dex */
    public interface c {
        void a(String str, b bVar);

        void a(b bVar);
    }

    /* loaded from: classes5.dex */
    public interface d {
        void a(int i, int i2, boolean z);
    }

    /* loaded from: classes5.dex */
    public interface f {
        void a(MotionEvent motionEvent);
    }

    static {
        kge.a(-1174510430);
        kge.a(-1453870097);
    }

    public static /* synthetic */ int a(fmd fmdVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3165651b", new Object[]{fmdVar, new Integer(i)})).intValue();
        }
        fmdVar.u = i;
        return i;
    }

    public static /* synthetic */ com.taobao.android.detail2.core.framework.b a(fmd fmdVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail2.core.framework.b) ipChange.ipc$dispatch("202441ea", new Object[]{fmdVar}) : fmdVar.l;
    }

    public static /* synthetic */ NewDetailScreenConfig.ScreenType a(fmd fmdVar, NewDetailScreenConfig.ScreenType screenType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NewDetailScreenConfig.ScreenType) ipChange.ipc$dispatch("5f1be21b", new Object[]{fmdVar, screenType});
        }
        fmdVar.z = screenType;
        return screenType;
    }

    public static /* synthetic */ int b(fmd fmdVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("13432eba", new Object[]{fmdVar, new Integer(i)})).intValue();
        }
        fmdVar.t = i;
        return i;
    }

    public static /* synthetic */ fkr b(fmd fmdVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (fkr) ipChange.ipc$dispatch("5ad82c9d", new Object[]{fmdVar}) : fmdVar.G();
    }

    public static /* synthetic */ flz c(fmd fmdVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (flz) ipChange.ipc$dispatch("427a07b5", new Object[]{fmdVar}) : fmdVar.m;
    }

    public static /* synthetic */ List d(fmd fmdVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("6c84b5c9", new Object[]{fmdVar}) : fmdVar.B;
    }

    public static /* synthetic */ View e(fmd fmdVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("9014b5c1", new Object[]{fmdVar}) : fmdVar.c;
    }

    public static /* synthetic */ int f(fmd fmdVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9160d5b3", new Object[]{fmdVar})).intValue() : fmdVar.t;
    }

    public static /* synthetic */ NewDetailScreenConfig g(fmd fmdVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (NewDetailScreenConfig) ipChange.ipc$dispatch("3fa0e8da", new Object[]{fmdVar}) : fmdVar.J();
    }

    public static /* synthetic */ List h(fmd fmdVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("2fc8d345", new Object[]{fmdVar}) : fmdVar.r;
    }

    public static /* synthetic */ int i(fmd fmdVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5ce9e936", new Object[]{fmdVar})).intValue() : fmdVar.u;
    }

    public static /* synthetic */ void j(fmd fmdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b6cefc4", new Object[]{fmdVar});
        } else {
            fmdVar.C();
        }
    }

    public static /* synthetic */ NewDetailScreenConfig.ScreenType k(fmd fmdVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (NewDetailScreenConfig.ScreenType) ipChange.ipc$dispatch("d901c3ee", new Object[]{fmdVar}) : fmdVar.z;
    }

    @Override // com.taobao.android.trade.event.j
    public /* synthetic */ i handleEvent(fir firVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("caa7474e", new Object[]{this, firVar}) : a(firVar);
    }

    public fmd(com.taobao.android.detail2.core.framework.b bVar, FrameLayout frameLayout, VolumeChangeManager volumeChangeManager) {
        ctu.a("new_DetailViewEngine");
        this.l = bVar;
        this.b = frameLayout;
        ctu.a(mxf.initView);
        B();
        ctu.a();
        I();
        A();
        a(volumeChangeManager);
        this.z = G().K().f();
        if (this.l.h().ae()) {
            fky.a(com.taobao.tao.navigation.a.b(), this.l.h().U().h() + 1);
        }
        ctu.a();
    }

    private void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a97c48", new Object[]{this});
            return;
        }
        this.m = new flz(this.l, this);
        this.m.a("item", new fhn(this.l, this, "Page_NewDetail"));
        this.m.a(fhp.VIEWHOLDER_KEY, new fhn(this.l, this, "Page_NewDetail"));
    }

    private void L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4447ed3", new Object[]{this});
        } else if (ipa.e()) {
            this.c = LayoutInflater.from(this.l.g()).inflate(R.layout.detail_instance_layout_for_lower, (ViewGroup) this.b, true);
        } else {
            this.c = LayoutInflater.from(this.l.g()).inflate(R.layout.detail_instance_layout, (ViewGroup) this.b, true);
        }
    }

    private void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b793c9", new Object[]{this});
            return;
        }
        this.k = new com.taobao.android.detail2.core.framework.base.weex.e();
        b.a c2 = com.taobao.android.detail2.core.optimize.prerender.b.a().c();
        if (c2 != null && c2.a() != null && G().r().e(G().k().W)) {
            synchronized (c2.a()) {
                try {
                    if (c2.b() == null) {
                        c2.a().wait(1000L);
                    }
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    fjt.a(fjt.TAG_RENDER, "主线程被中断");
                }
            }
            if (c2.b() != null) {
                c2.a(this.l.g());
                this.c = c2.b();
                this.b.addView(this.c, new FrameLayout.LayoutParams(-1, -1));
            } else {
                L();
            }
        } else {
            L();
        }
        if (this.l.k() != null && this.l.k().c() && this.l.h().b().aE()) {
            final View findViewById = this.c.findViewById(R.id.half_screen_second_card_default_text);
            findViewById.setVisibility(8);
            this.l.k().a(new NewDetailMaskFrameLayout.b() { // from class: tb.fmd.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.detail2.core.framework.view.NewDetailMaskFrameLayout.b
                public String b() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("367c9fd7", new Object[]{this}) : "HalfCardDefaultText";
                }

                @Override // com.taobao.android.detail2.core.framework.view.NewDetailMaskFrameLayout.b
                public long c() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Number) ipChange2.ipc$dispatch("5889b5e", new Object[]{this})).longValue();
                    }
                    return 200L;
                }

                @Override // com.taobao.android.detail2.core.framework.view.NewDetailMaskFrameLayout.b
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    findViewById.setAlpha(0.001f);
                    findViewById.setVisibility(0);
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.001f, 0.5f);
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: tb.fmd.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public void onAnimationUpdate(ValueAnimator valueAnimator) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                            } else {
                                findViewById.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                            }
                        }
                    });
                    ofFloat.addListener(new Animator.AnimatorListener() { // from class: tb.fmd.1.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.animation.Animator.AnimatorListener
                        public void onAnimationCancel(Animator animator) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("90a3af63", new Object[]{this, animator});
                            }
                        }

                        @Override // android.animation.Animator.AnimatorListener
                        public void onAnimationRepeat(Animator animator) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("4388ea84", new Object[]{this, animator});
                            }
                        }

                        @Override // android.animation.Animator.AnimatorListener
                        public void onAnimationStart(Animator animator) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("3a405721", new Object[]{this, animator});
                            }
                        }

                        @Override // android.animation.Animator.AnimatorListener
                        public void onAnimationEnd(Animator animator) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("8024e25a", new Object[]{this, animator});
                            } else {
                                findViewById.setAlpha(0.5f);
                            }
                        }
                    });
                    ofFloat.setInterpolator(new LinearInterpolator());
                    ofFloat.setDuration(2000L);
                    ofFloat.start();
                }
            });
        }
        this.c.addOnLayoutChangeListener(this.q);
        h.a().c(this.A);
        this.d = new com.taobao.android.detail2.core.framework.view.manager.a(this.l, this.c);
        ctu.a("init_ListViewManager");
        this.e = new ListViewManager(this.l, this);
        ctu.a();
        this.e.b(this.y);
        ctu.a("NavBarViewManager");
        this.f = new NavBarViewManager(this.l, this);
        ctu.a();
        this.f.a(this.x);
        this.f28050a = (RelativeLayout) this.c.findViewById(R.id.instance_default_layout);
        this.h = (FrameLayout) this.c.findViewById(R.id.half_screen_second_card_default_fl);
        this.g = (ImageView) this.c.findViewById(R.id.half_screen_second_card_default_img);
        H();
        F();
    }

    private void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c5ab4a", new Object[]{this});
        } else if (!E()) {
        } else {
            D();
            this.e.r();
            this.o = true;
        }
    }

    private void D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d3c2cb", new Object[]{this});
            return;
        }
        this.h.setVisibility(0);
        Activity g = this.l.g();
        if (g == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.g.getLayoutParams();
        layoutParams.height = (int) g.a(this.l);
        this.g.setLayoutParams(layoutParams);
        int b2 = g.b(this.l);
        if (b2 == -1) {
            this.h.setVisibility(8);
        } else {
            this.g.setImageDrawable(g.getResources().getDrawable(b2));
        }
    }

    private boolean E() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3e1da50", new Object[]{this})).booleanValue() : G().ac() && G().S() && !this.o;
    }

    private void F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3eff1cd", new Object[]{this});
            return;
        }
        this.n = this.c.findViewById(R.id.instance_bottom_stub);
        if (!G().z()) {
            return;
        }
        this.n.setVisibility(0);
    }

    private fkr G() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (fkr) ipChange.ipc$dispatch("46f9d6cb", new Object[]{this}) : this.l.h();
    }

    public com.taobao.android.detail2.core.framework.b a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail2.core.framework.b) ipChange.ipc$dispatch("570aa997", new Object[]{this}) : this.l;
    }

    public com.taobao.android.detail2.core.framework.floatwindow.c b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail2.core.framework.floatwindow.c) ipChange.ipc$dispatch("94a4d0da", new Object[]{this}) : this.v;
    }

    private void H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40c20cf", new Object[]{this});
        } else if (this.l.g() == null || !fhp.VIEWHOLDER_KEY.equals(G().I())) {
        } else {
            this.f28050a.setBackgroundColor(fme.b(this.l));
        }
    }

    private void a(VolumeChangeManager volumeChangeManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fccac96d", new Object[]{this, volumeChangeManager});
        } else if (volumeChangeManager == null) {
        } else {
            volumeChangeManager.a(new VolumeChangeManager.a() { // from class: tb.fmd.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.detail2.core.framework.base.volume.VolumeChangeManager.a
                public void a(int i, int i2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
                        return;
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("newVolume", (Object) Integer.valueOf(i));
                    jSONObject.put("oldVolume", (Object) Integer.valueOf(i2));
                    fmd.this.a("volumeChanged", jSONObject);
                }
            });
        }
    }

    private void I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41a3850", new Object[]{this});
        } else {
            fim.a(this.l.f(), G().y(), fil.a(fir.class, ""), this);
        }
    }

    public View c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("adc2ed2c", new Object[]{this}) : this.c;
    }

    public void a(ListViewManager.ListStatus listStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2e87ba3", new Object[]{this, listStatus});
        } else {
            this.e.a(listStatus);
        }
    }

    public void a(List<? extends com.taobao.android.detail2.core.framework.data.model.d> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else {
            this.e.a(list);
        }
    }

    public void b(List<? extends com.taobao.android.detail2.core.framework.data.model.d> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d39e1eda", new Object[]{this, list});
            return;
        }
        this.e.c(0);
        this.e.a(true);
        this.e.a(list);
        this.e.b(0);
    }

    public c.b a(List<? extends com.taobao.android.detail2.core.framework.data.model.d> list, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c.b) ipChange.ipc$dispatch("e63469fe", new Object[]{this, list, new Integer(i)}) : this.e.a(list, i);
    }

    public void c(List<? extends com.taobao.android.detail2.core.framework.data.model.d> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e037145b", new Object[]{this, list});
        } else {
            this.e.b(list);
        }
    }

    public void d(List<? extends com.taobao.android.detail2.core.framework.data.model.d> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecd009dc", new Object[]{this, list});
        } else {
            this.e.c(list);
        }
    }

    public void a(boolean z, String str, com.taobao.android.detail2.core.framework.data.model.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ba5438c", new Object[]{this, new Boolean(z), str, dVar});
        } else {
            this.e.a(z, str, dVar);
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.e.a(str);
        }
    }

    public com.taobao.android.detail2.core.framework.data.model.d d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.detail2.core.framework.data.model.d) ipChange.ipc$dispatch("bd38ffa1", new Object[]{this});
        }
        ListViewManager listViewManager = this.e;
        if (listViewManager != null) {
            return listViewManager.a();
        }
        return null;
    }

    public com.taobao.android.detail2.core.framework.view.feeds.d K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.detail2.core.framework.view.feeds.d) ipChange.ipc$dispatch("880a67d3", new Object[]{this});
        }
        ListViewManager listViewManager = this.e;
        if (listViewManager != null) {
            return listViewManager.g();
        }
        return null;
    }

    public int e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[]{this})).intValue();
        }
        ListViewManager listViewManager = this.e;
        if (listViewManager != null) {
            return listViewManager.d();
        }
        return -1;
    }

    public com.taobao.android.detail2.core.framework.data.model.d f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.detail2.core.framework.data.model.d) ipChange.ipc$dispatch("c940965f", new Object[]{this});
        }
        ListViewManager listViewManager = this.e;
        if (listViewManager != null) {
            return listViewManager.e();
        }
        return null;
    }

    public com.taobao.android.detail2.core.framework.data.model.d a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail2.core.framework.data.model.d) ipChange.ipc$dispatch("e54b18f1", new Object[]{this, new Integer(i)}) : this.e.e(i);
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else {
            this.e.a(0);
        }
    }

    public com.taobao.android.detail2.core.framework.data.model.d b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.detail2.core.framework.data.model.d) ipChange.ipc$dispatch("d0e39419", new Object[]{this, str});
        }
        if (this.e != null && !StringUtils.isEmpty(str)) {
            return this.e.c(str);
        }
        return null;
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue();
        }
        ListViewManager listViewManager = this.e;
        if (listViewManager != null) {
            return listViewManager.i();
        }
        return false;
    }

    public List<com.taobao.android.detail2.core.framework.data.model.d> i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("9f84bbd7", new Object[]{this});
        }
        ListViewManager listViewManager = this.e;
        if (listViewManager != null) {
            return listViewManager.f();
        }
        return null;
    }

    public void a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6635bcfe", new Object[]{this, str, jSONObject});
            return;
        }
        com.taobao.android.detail2.core.framework.view.feeds.d g = this.e.g();
        if (g == null) {
            return;
        }
        g.c(str, jSONObject);
    }

    public JSONArray a(JSONObject jSONObject, int i) {
        int intValue;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("7017e263", new Object[]{this, jSONObject, new Integer(i)});
        }
        if (jSONObject == null || (intValue = jSONObject.getIntValue(UiUtil.INPUT_TYPE_VALUE_NUM)) > 50) {
            return null;
        }
        String string = jSONObject.getString("type");
        boolean booleanValue = jSONObject.getBooleanValue("currentInclude");
        boolean equals = StringUtils.equals("pre", string);
        if (equals) {
            i2 = booleanValue ? (i - intValue) + 1 : i - intValue;
            if (!booleanValue) {
                i--;
            }
        } else {
            i2 = booleanValue ? i : i + 1;
            i = booleanValue ? (i + intValue) - 1 : i + intValue;
        }
        int max = Math.max(Math.min(this.e.j().size() - 1, i), 0);
        JSONArray jSONArray = new JSONArray();
        for (int max2 = Math.max(0, i2); max2 <= max; max2++) {
            jSONArray.add(this.e.j().get(max2).T);
        }
        if (jSONArray.size() < intValue) {
            int size = intValue - jSONArray.size();
            for (int i3 = 0; i3 < size; i3++) {
                if (equals) {
                    jSONArray.add(0, new JSONObject());
                } else {
                    jSONArray.add(new JSONObject());
                }
            }
        }
        return jSONArray;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.f.a(z);
        }
    }

    public com.taobao.android.detail2.core.framework.base.weex.e j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail2.core.framework.base.weex.e) ipChange.ipc$dispatch("a741fecd", new Object[]{this}) : this.k;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008c, code lost:
        if (r0.equals(tb.fir.OPERATE_OPEN_SKU_WITH_REQUEST) != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.taobao.android.trade.event.i a(tb.fir r8) {
        /*
            Method dump skipped, instructions count: 684
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.fmd.a(tb.fir):com.taobao.android.trade.event.i");
    }

    private DetailVerticalRecyclerView.ScrollSpeed h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DetailVerticalRecyclerView.ScrollSpeed) ipChange.ipc$dispatch("f7ba1125", new Object[]{this, str});
        }
        try {
            return DetailVerticalRecyclerView.ScrollSpeed.valueOf(str.toUpperCase());
        } catch (Exception e2) {
            fjt.a("new_detail异常", "生成scrollSpeed失败，speed：" + str, e2);
            return null;
        }
    }

    public boolean b(boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a9d6ac0f", new Object[]{this, new Boolean(z)})).booleanValue() : a(z, (String) null);
    }

    public boolean a(boolean z, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f7197a3a", new Object[]{this, new Boolean(z), str})).booleanValue() : this.e.a(z, str);
    }

    public ListViewManager.b a(String str, String str2, DetailVerticalRecyclerView.ScrollSpeed scrollSpeed) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ListViewManager.b) ipChange.ipc$dispatch("47f7a149", new Object[]{this, str, str2, scrollSpeed}) : this.e.a(str, str2, scrollSpeed);
    }

    public int[] k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (int[]) ipChange.ipc$dispatch("b93197b2", new Object[]{this}) : this.e.k();
    }

    public com.taobao.android.detail2.core.framework.data.model.d l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.detail2.core.framework.data.model.d) ipChange.ipc$dispatch("ed575a99", new Object[]{this});
        }
        if (this.e != null && m() != null && !m().isEmpty()) {
            return m().get(m().size() - 1);
        }
        return null;
    }

    public List<com.taobao.android.detail2.core.framework.data.model.d> m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("3e0c1553", new Object[]{this});
        }
        ListViewManager listViewManager = this.e;
        if (listViewManager != null) {
            return listViewManager.j();
        }
        return null;
    }

    public void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
        } else {
            this.e.a(j);
        }
    }

    public int n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6239de8", new Object[]{this})).intValue() : this.l.f().getNewDetailContainerStatusBarHeight();
    }

    @Override // com.taobao.android.trade.event.j
    public ThreadMode getThreadMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this}) : ThreadMode.MainThread;
    }

    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
            return;
        }
        com.taobao.android.detail2.core.framework.view.manager.a aVar = this.d;
        if (aVar != null) {
            aVar.g();
        }
        ListViewManager listViewManager = this.e;
        if (listViewManager != null) {
            listViewManager.l();
        }
        this.c.removeOnLayoutChangeListener(this.q);
        this.j.clear();
        this.i = null;
        com.taobao.android.detail2.core.framework.floatwindow.c cVar = this.v;
        if (cVar != null) {
            cVar.e();
        }
        this.v = null;
        TBXSkuContainer tBXSkuContainer = this.p;
        if (tBXSkuContainer != null) {
            tBXSkuContainer.d();
        }
        h.a().d(this.A);
    }

    public void c(String str) {
        ListViewManager listViewManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else if (str.equals(com.taobao.android.detail2.core.framework.view.manager.a.PAGE_TYPE_SECOND_PAGE)) {
            com.taobao.android.detail2.core.framework.view.manager.a aVar = this.d;
            if (aVar == null) {
                return;
            }
            aVar.c();
        } else if (!str.equals("NewDetail") || (listViewManager = this.e) == null) {
        } else {
            listViewManager.m();
        }
    }

    public void d(String str) {
        ListViewManager listViewManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
        } else if (str.equals(com.taobao.android.detail2.core.framework.view.manager.a.PAGE_TYPE_SECOND_PAGE)) {
            com.taobao.android.detail2.core.framework.view.manager.a aVar = this.d;
            if (aVar == null) {
                return;
            }
            aVar.d();
        } else if (!str.equals("NewDetail") || (listViewManager = this.e) == null) {
        } else {
            listViewManager.n();
        }
    }

    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{this, str});
        } else if (str.equals(com.taobao.android.detail2.core.framework.view.manager.a.PAGE_TYPE_SECOND_PAGE)) {
            com.taobao.android.detail2.core.framework.view.manager.a aVar = this.d;
            if (aVar == null) {
                return;
            }
            aVar.e();
        } else if (!str.equals("NewDetail")) {
        } else {
            ListViewManager listViewManager = this.e;
            if (listViewManager != null) {
                listViewManager.o();
            }
            com.taobao.android.detail2.core.framework.floatwindow.c cVar = this.v;
            if (cVar == null) {
                return;
            }
            cVar.a();
        }
    }

    public void a(String str, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35a6232", new Object[]{this, str, new Boolean(z), new Boolean(z2)});
        } else if (str.equals(com.taobao.android.detail2.core.framework.view.manager.a.PAGE_TYPE_SECOND_PAGE)) {
            com.taobao.android.detail2.core.framework.view.manager.a aVar = this.d;
            if (aVar == null) {
                return;
            }
            aVar.f();
        } else if (!str.equals("NewDetail")) {
        } else {
            com.taobao.android.detail2.core.framework.floatwindow.c cVar = this.v;
            if (cVar != null) {
                cVar.a(z, z2);
            }
            ListViewManager listViewManager = this.e;
            if (listViewManager == null) {
                return;
            }
            listViewManager.b(z);
        }
    }

    public boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63fccfb", new Object[]{this})).booleanValue();
        }
        com.taobao.android.detail2.core.framework.view.manager.a aVar = this.d;
        if (aVar != null && aVar.a().equals(com.taobao.android.detail2.core.framework.view.manager.a.PAGE_TYPE_SECOND_PAGE)) {
            this.d.b();
            return true;
        }
        com.taobao.android.detail2.core.framework.view.feeds.d g = this.e.g();
        if (a(g)) {
            g.A();
            fjt.a(fjt.TAG_RENDER, "被preventback拦截，未关闭newdetail instance");
            return true;
        }
        fjt.a(fjt.TAG_RENDER, "未拦截back行为");
        return false;
    }

    private boolean a(com.taobao.android.detail2.core.framework.view.feeds.d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("799501fb", new Object[]{this, dVar})).booleanValue() : dVar != null && dVar.z() && G().N();
    }

    public void a(e.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e67f997", new Object[]{this, aVar});
        } else {
            this.i = aVar;
        }
    }

    public e.a q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e.a) ipChange.ipc$dispatch("f7b98ea7", new Object[]{this}) : this.i;
    }

    public void a(a.InterfaceC0465a interfaceC0465a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fd9e025", new Object[]{this, interfaceC0465a});
            return;
        }
        com.taobao.android.detail2.core.framework.view.manager.a aVar = this.d;
        if (aVar == null) {
            return;
        }
        aVar.a(interfaceC0465a);
    }

    public String r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9ed849c7", new Object[]{this});
        }
        com.taobao.android.detail2.core.framework.view.manager.a aVar = this.d;
        return aVar != null ? aVar.a() : "NewDetail";
    }

    public void a(ListViewManager.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd8a193c", new Object[]{this, aVar});
        } else {
            this.e.a(aVar);
        }
    }

    public void a(com.taobao.android.detail2.core.framework.data.model.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a363f7be", new Object[]{this, dVar});
            return;
        }
        NavBarViewManager navBarViewManager = this.f;
        if (navBarViewManager == null) {
            return;
        }
        navBarViewManager.a(dVar);
    }

    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a137a", new Object[]{this});
            return;
        }
        FrameLayout frameLayout = this.h;
        if (frameLayout == null || frameLayout.getVisibility() == 8) {
            return;
        }
        this.h.setVisibility(8);
    }

    public ListViewManager t() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ListViewManager) ipChange.ipc$dispatch("c864bbec", new Object[]{this}) : this.e;
    }

    public void b(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("676c0fdd", new Object[]{this, str, jSONObject});
        } else {
            this.f.a(str, jSONObject);
        }
    }

    public void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("686427c", new Object[]{this});
        } else {
            this.f.a();
        }
    }

    public List<fls> v() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("62bc9eaa", new Object[]{this}) : this.j;
    }

    public void a(fls flsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8ca6f4b", new Object[]{this, flsVar});
        } else {
            this.j.add(flsVar);
        }
    }

    public int w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6a27171", new Object[]{this})).intValue();
        }
        NavBarViewManager navBarViewManager = this.f;
        if (navBarViewManager != null) {
            return navBarViewManager.d();
        }
        return 0;
    }

    public void a(Animation animation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae1d2928", new Object[]{this, animation});
            return;
        }
        NavBarViewManager navBarViewManager = this.f;
        if (navBarViewManager == null || animation == null) {
            return;
        }
        navBarViewManager.a(animation);
    }

    public void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b088ff", new Object[]{this});
            return;
        }
        NavBarViewManager navBarViewManager = this.f;
        if (navBarViewManager == null) {
            return;
        }
        navBarViewManager.e();
    }

    public void a(DetailVerticalRecyclerView.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("751825ad", new Object[]{this, aVar});
        } else {
            this.e.a(aVar);
        }
    }

    public flz y() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (flz) ipChange.ipc$dispatch("c7ac2812", new Object[]{this}) : this.m;
    }

    public void a(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa0fa7bb", new Object[]{this, dVar});
        } else {
            this.r.add(dVar);
        }
    }

    public void b(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53eb11fc", new Object[]{this, dVar});
        } else {
            this.r.remove(dVar);
        }
    }

    public int f(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("669e4a6a", new Object[]{this, str})).intValue() : this.e.b(str);
    }

    public int a(String str, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8123ad04", new Object[]{this, str, new Integer(i)})).intValue() : this.e.a(str, i);
    }

    public boolean g(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b0cfe3bc", new Object[]{this, str})).booleanValue() : f(str) == this.e.j().size() - 1;
    }

    public int M() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4529647", new Object[]{this})).intValue() : this.e.j().size();
    }

    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
            return;
        }
        ListViewManager listViewManager = this.e;
        if (listViewManager == null) {
            return;
        }
        listViewManager.a(z);
    }

    public void a(fjb fjbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8a685fa", new Object[]{this, fjbVar});
        } else {
            this.w = fjbVar;
        }
    }

    public fjb z() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (fjb) ipChange.ipc$dispatch("cf5dc307", new Object[]{this}) : this.w;
    }

    /* loaded from: classes5.dex */
    public class e implements OnScreenChangedListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1030360261);
            kge.a(825059505);
        }

        @Override // com.taobao.android.autosize.OnScreenChangedListener
        public /* synthetic */ void onActivityChanged(Activity activity, int i, Configuration configuration) {
            OnScreenChangedListener.CC.$default$onActivityChanged(this, activity, i, configuration);
        }

        private e() {
        }

        @Override // com.taobao.android.autosize.OnScreenChangedListener
        public void onScreenChanged(int i, Configuration configuration) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cfdcd1d", new Object[]{this, new Integer(i), configuration});
            } else if (fmd.e(fmd.this) != null) {
                fmd.g(fmd.this).e();
                fmd.g(fmd.this).a(fmd.e(fmd.this).getHeight());
                for (d dVar : fmd.h(fmd.this)) {
                    if (dVar != null) {
                        dVar.a(fmd.e(fmd.this).getWidth(), fmd.e(fmd.this).getHeight(), true);
                    }
                }
                fjt.a(fjt.TAG_RENDER, "onScreenChanged, width: " + fmd.e(fmd.this).getWidth() + ", height: " + fmd.e(fmd.this).getHeight() + ", changeType: " + i);
                fmd fmdVar = fmd.this;
                fmd.b(fmdVar, fmd.e(fmdVar).getHeight());
                fmd fmdVar2 = fmd.this;
                fmd.a(fmdVar2, fmd.e(fmdVar2).getWidth());
            }
        }
    }

    public void a(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa109079", new Object[]{this, fVar});
        } else {
            this.B.add(fVar);
        }
    }

    /* loaded from: classes5.dex */
    public class a implements View.OnLayoutChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1881885322);
            kge.a(-782512414);
        }

        private a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("899df952", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
                return;
            }
            int i9 = i3 - i;
            int i10 = i4 - i2;
            if (i9 != fmd.i(fmd.this) || i10 != fmd.f(fmd.this)) {
                fmd.g(fmd.this).a(i10);
                fmd.g(fmd.this).e();
                fmd.j(fmd.this);
                for (d dVar : fmd.h(fmd.this)) {
                    if (dVar != null) {
                        dVar.a(i9, i10, fmd.k(fmd.this) != fmd.g(fmd.this).f());
                    }
                }
                fjt.a(fjt.TAG_RENDER, "RootView宽高发生变化, width: " + i9 + ", height: " + i10);
            }
            fmd.b(fmd.this, i10);
            fmd.a(fmd.this, i9);
            fmd fmdVar = fmd.this;
            fmd.a(fmdVar, fmd.g(fmdVar).f());
        }
    }

    private NewDetailScreenConfig J() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (NewDetailScreenConfig) ipChange.ipc$dispatch("94e0046a", new Object[]{this}) : this.l.h().K();
    }

    public void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa0ebefd", new Object[]{this, bVar});
        } else if (bVar != null) {
            fjt.a(fjt.TAG_VIDEO_ZOOM, "notifyPopPositionChanged, height: " + bVar.e + ", x: " + bVar.c + ", y: " + bVar.d);
            for (c cVar : this.s) {
                if (cVar != null) {
                    cVar.a(bVar);
                }
            }
        }
    }

    public void a(String str, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e932ea47", new Object[]{this, str, bVar});
        } else if (bVar != null) {
            fjt.a(fjt.TAG_VIDEO_ZOOM, "notifyPopStateChanged, state: " + str + ", startY: " + bVar.f28059a + "endY: " + bVar.b + ", height: " + bVar.e + ", width: " + bVar.f + ", x: " + bVar.c + ", y: " + bVar.d);
            for (c cVar : this.s) {
                if (cVar != null) {
                    cVar.a(str, bVar);
                }
            }
        }
    }

    public void a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa0f335c", new Object[]{this, cVar});
        } else {
            this.s.add(cVar);
        }
    }
}
