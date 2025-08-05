package com.taobao.tab2interact.core.component.browser.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.support.v4.view.GravityCompat;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.LinearInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.animate.b;
import com.taobao.phenix.animate.c;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.tab2interact.core.component.browser.data.BrowserBadgeModel;
import com.taobao.tab2interact.core.component.browser.view.AmountRollView;
import com.taobao.tab2interact.core.component.browser.view.BrowserBadgeRootView;
import com.taobao.tab2interact.core.component.browser.view.CircleProgressView;
import com.taobao.tab2interact.core.component.browser.view.CroppedRoundCornerFrameLayout;
import com.taobao.tab2interact.core.utils.e;
import com.taobao.tao.Globals;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import tb.kge;
import tb.oec;
import tb.ohd;
import tb.ohj;
import tb.skq;

/* loaded from: classes8.dex */
public class a implements AmountRollView.a, CircleProgressView.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static int K = 0;
    private static int L = 0;
    public static final int LAYOUT_BOTTOM_COMPONENT_TO_PROGRESS_BAR_HORIZONTAL_DISTANCE = 0;
    public static final int LAYOUT_BOTTOM_COMPONENT_TO_PROGRESS_BAR_VERTICAL_DISTANCE = 34;
    private static final int LAYOUT_CENTER_COMPONENT_WIDTH_HEIGHT_PX;
    private List<TextSwitcher> A;
    private TextView B;
    private long C;
    private long D;
    private BrowserBadgeModel.TaskType F;
    private boolean G;
    private boolean H;
    private CroppedRoundCornerFrameLayout I;

    /* renamed from: a */
    private Context f19756a;
    private BrowserBadgeRootView b;
    private LinearLayout c;
    private TUrlImageView d;
    private TextView e;
    private FrameLayout f;
    private CircleProgressView g;
    private LinearLayout h;
    private TUrlImageView i;
    private b j;
    private TextView k;
    private AmountRollView l;
    private FrameLayout m;
    private TextView n;
    private TUrlImageView o;
    private TUrlImageView p;
    private TUrlImageView q;
    private InterfaceC0821a r;
    private BrowserBadgeModel.BrowserBadgeViewModel s;
    private BrowserBadgeModel.BrowserBadgeViewModel.PicModel t;
    private boolean v;
    private TUrlImageView w;
    private TextView x;
    private FrameLayout y;
    private TextView z;
    private boolean J = true;
    private int u = -1;
    private long E = Long.MAX_VALUE;

    /* renamed from: com.taobao.tab2interact.core.component.browser.view.a$a */
    /* loaded from: classes8.dex */
    public interface InterfaceC0821a {
        void a(float f, long j, long j2, long j3);

        void a(int i, int i2, long j, long j2, long j3);

        void a(BrowserBadgeModel.TaskType taskType);

        void b(boolean z);

        void bU_();

        void z();
    }

    public static /* synthetic */ b a(a aVar, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("a3c51780", new Object[]{aVar, bVar});
        }
        aVar.j = bVar;
        return bVar;
    }

    public static /* synthetic */ InterfaceC0821a a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (InterfaceC0821a) ipChange.ipc$dispatch("c534763f", new Object[]{aVar}) : aVar.r;
    }

    public static /* synthetic */ void a(a aVar, TextView textView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a73d022", new Object[]{aVar, textView});
        } else {
            aVar.a(textView);
        }
    }

    public static /* synthetic */ void a(a aVar, TextView textView, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da392b17", new Object[]{aVar, textView, str, new Integer(i)});
        } else {
            aVar.b(textView, str, i);
        }
    }

    public static /* synthetic */ void a(a aVar, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b80ccc0", new Object[]{aVar, str, str2, str3});
        } else {
            aVar.b(str, str2, str3);
        }
    }

    public static /* synthetic */ b b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("cc14e94a", new Object[]{aVar}) : aVar.j;
    }

    public static /* synthetic */ BrowserBadgeModel.BrowserBadgeViewModel.PicModel c(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BrowserBadgeModel.BrowserBadgeViewModel.PicModel) ipChange.ipc$dispatch("d1333150", new Object[]{aVar}) : aVar.t;
    }

    public static /* synthetic */ TUrlImageView d(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TUrlImageView) ipChange.ipc$dispatch("3af84f1d", new Object[]{aVar}) : aVar.w;
    }

    public static /* synthetic */ TUrlImageView e(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TUrlImageView) ipChange.ipc$dispatch("9dfed5e", new Object[]{aVar}) : aVar.i;
    }

    public static /* synthetic */ Context f(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("90301935", new Object[]{aVar}) : aVar.f19756a;
    }

    static {
        kge.a(-430862906);
        kge.a(587256569);
        kge.a(-1657868662);
        LAYOUT_CENTER_COMPONENT_WIDTH_HEIGHT_PX = ohd.a((Context) Globals.getApplication(), 90);
        K = Integer.MIN_VALUE;
        L = Integer.MIN_VALUE;
    }

    public a(Context context) {
        this.f19756a = context;
        a(context);
    }

    public static int v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("69459f0", new Object[0])).intValue();
        }
        if (K < 0) {
            y();
        }
        return Math.max(0, K);
    }

    public static int w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6a27171", new Object[0])).intValue();
        }
        if (L < 0) {
            y();
        }
        return Math.max(0, L);
    }

    @Override // com.taobao.tab2interact.core.component.browser.view.CircleProgressView.a
    public void a(float f, long j, long j2, long j3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("980626ec", new Object[]{this, new Float(f), new Long(j), new Long(j2), new Long(j3)});
            return;
        }
        BrowserBadgeModel.BrowserBadgeViewModel browserBadgeViewModel = this.s;
        if (browserBadgeViewModel != null && browserBadgeViewModel.b != null && this.s.b.h != null) {
            this.C -= j3;
            r();
            if (this.D < this.E) {
                a(this.A, s());
                InterfaceC0821a interfaceC0821a = this.r;
                if (interfaceC0821a != null && this.D == 0) {
                    interfaceC0821a.a(this.s.b.h.c);
                }
            }
            this.E = this.D;
        }
        InterfaceC0821a interfaceC0821a2 = this.r;
        if (interfaceC0821a2 == null) {
            return;
        }
        interfaceC0821a2.a(f, j, j2, j3);
    }

    @Override // com.taobao.tab2interact.core.component.browser.view.AmountRollView.a
    public void a(int i, int i2, long j, long j2, long j3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bd067c", new Object[]{this, new Integer(i), new Integer(i2), new Long(j), new Long(j2), new Long(j3)});
            return;
        }
        BrowserBadgeModel.BrowserBadgeViewModel browserBadgeViewModel = this.s;
        if (browserBadgeViewModel != null && browserBadgeViewModel.b != null && this.s.b.b != null) {
            BrowserBadgeModel.BrowserBadgeViewModel.b bVar = this.s.b.b;
            if (i != this.u && i > 0 && bVar.f19727a > 0 && i % bVar.f19727a == 0) {
                i();
            }
        }
        this.u = i;
        InterfaceC0821a interfaceC0821a = this.r;
        if (interfaceC0821a == null) {
            return;
        }
        interfaceC0821a.a(i, i2, j, j2, j3);
    }

    public void c(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b40669c8", new Object[]{this, str, str2, str3});
            return;
        }
        a(this.w, str2, str3, 17);
        this.w.setImageUrl(str);
    }

    public void a(BrowserBadgeModel.BrowserBadgeViewModel browserBadgeViewModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4ad0a8b", new Object[]{this, browserBadgeViewModel});
        } else if (browserBadgeViewModel == null) {
            com.taobao.tab2interact.core.utils.a.b(this, "BrowserBadgeViewController", "【setData】BrowserBadgeViewModel is null");
        } else {
            this.s = browserBadgeViewModel;
            com.taobao.tab2interact.core.utils.a.b(this, "BrowserBadgeViewController", "【setData】BrowserBadgeViewModel");
            b(browserBadgeViewModel);
            c(browserBadgeViewModel);
            d(browserBadgeViewModel);
            e(browserBadgeViewModel);
        }
    }

    private void b(BrowserBadgeModel.BrowserBadgeViewModel browserBadgeViewModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bdc56aa", new Object[]{this, browserBadgeViewModel});
        } else if (browserBadgeViewModel.b == null) {
        } else {
            if (browserBadgeViewModel.b.e != null) {
                this.k.setVisibility(0);
                String str = browserBadgeViewModel.b.e.f19731a;
                int a2 = e.INSTANCE.a(browserBadgeViewModel.b.e.b);
                if (str != null) {
                    if (TextUtils.isEmpty(this.k.getText())) {
                        b(this.k, str, a2);
                        a(this.k);
                    } else {
                        a(this.k, str, a2);
                    }
                }
                this.G = true;
            } else {
                this.k.setVisibility(8);
                this.G = false;
            }
            if (browserBadgeViewModel.b.f != null) {
                this.x.setVisibility(0);
                String str2 = browserBadgeViewModel.b.f.f19731a;
                int a3 = e.INSTANCE.a(browserBadgeViewModel.b.f.b);
                if (str2 != null) {
                    if (TextUtils.isEmpty(this.x.getText())) {
                        b(this.x, str2, a3);
                        a(this.x);
                    } else {
                        a(this.x, str2, a3);
                    }
                }
            } else {
                this.x.setVisibility(8);
            }
            if (browserBadgeViewModel.b.g != null && browserBadgeViewModel.b.h != null) {
                this.C = browserBadgeViewModel.b.h.f19733a;
                this.F = browserBadgeViewModel.b.h.c;
                r();
                if (!this.H) {
                    q();
                    this.y.setAlpha(0.0f);
                    b(this.z, browserBadgeViewModel.b.g.f19731a, e.INSTANCE.a(browserBadgeViewModel.b.g.b));
                    int a4 = e.INSTANCE.a(browserBadgeViewModel.b.h.b);
                    a(this.A, s(), a4);
                    this.B.setTextColor(a4);
                    if (TextUtils.isEmpty(browserBadgeViewModel.b.h.d)) {
                        t();
                    }
                }
            } else if (this.H) {
                u();
                InterfaceC0821a interfaceC0821a = this.r;
                if (interfaceC0821a != null && this.D > 0) {
                    interfaceC0821a.a(this.F);
                }
            }
            if (browserBadgeViewModel.b.f19730a != null) {
                if (browserBadgeViewModel.b.f19730a.b == BrowserBadgeModel.BrowserBadgeViewModel.PicModel.Type.APNG) {
                    a(browserBadgeViewModel.b.f19730a.c, browserBadgeViewModel.b.f19730a.d, browserBadgeViewModel.b.f19730a.e);
                } else {
                    this.t = browserBadgeViewModel.b.f19730a;
                    b(browserBadgeViewModel.b.f19730a.c, browserBadgeViewModel.b.f19730a.d, browserBadgeViewModel.b.f19730a.e);
                }
            }
            if (browserBadgeViewModel.b.c != null) {
                this.g.setProgressColor(e.INSTANCE.a(browserBadgeViewModel.b.c.f19729a));
            }
            if (browserBadgeViewModel.b.d != null) {
                this.l.init();
                this.l.setVisibility(0);
                this.l.setAmountUnit(browserBadgeViewModel.b.d.d);
                this.l.setDecimalPoint(".");
                return;
            }
            this.l.setVisibility(8);
        }
    }

    private void c(BrowserBadgeModel.BrowserBadgeViewModel browserBadgeViewModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("630ba2c9", new Object[]{this, browserBadgeViewModel});
        } else if (browserBadgeViewModel.f19725a == null) {
        } else {
            o();
            this.c.setPadding(0, ohd.a(this.f19756a, 48), 0, 0);
            if (this.c.getLayoutParams() instanceof FrameLayout.LayoutParams) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.c.getLayoutParams();
                layoutParams.gravity = 1;
                this.c.setLayoutParams(layoutParams);
            }
            if (browserBadgeViewModel.f19725a.b != null) {
                this.d.setImageUrl(browserBadgeViewModel.f19725a.b.c);
                a(this.d, browserBadgeViewModel.f19725a.b.d, browserBadgeViewModel.f19725a.b.e, GravityCompat.END);
            }
            if (browserBadgeViewModel.f19725a.f19732a != null) {
                this.e.setText(browserBadgeViewModel.f19725a.f19732a.f19731a);
                this.e.setTextColor(e.INSTANCE.a(browserBadgeViewModel.f19725a.f19732a.b));
            }
            if (this.G && !this.H) {
                return;
            }
            h();
        }
    }

    private void d(BrowserBadgeModel.BrowserBadgeViewModel browserBadgeViewModel) {
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a3aeee8", new Object[]{this, browserBadgeViewModel});
        } else if (skq.g() && browserBadgeViewModel.c != null && !this.v) {
            p();
            int i3 = 34;
            if (browserBadgeViewModel.c.d != null) {
                this.q.setVisibility(0);
                this.q.setImageUrl(browserBadgeViewModel.c.d.c);
                a(this.q, browserBadgeViewModel.c.d.d, browserBadgeViewModel.c.d.e, GravityCompat.END);
                i = oec.a((Object) browserBadgeViewModel.c.d.d, 86);
                i2 = oec.a((Object) browserBadgeViewModel.c.d.e, 34);
                this.p.setVisibility(8);
                this.n.setVisibility(8);
                this.o.setVisibility(8);
            } else {
                this.q.setVisibility(8);
                if (browserBadgeViewModel.c.c != null) {
                    this.p.setVisibility(0);
                    this.p.setImageUrl(browserBadgeViewModel.c.c.c);
                    a(this.p, browserBadgeViewModel.c.c.d, browserBadgeViewModel.c.c.e, GravityCompat.END);
                    int a2 = oec.a((Object) browserBadgeViewModel.c.c.d, 86);
                    i3 = oec.a((Object) browserBadgeViewModel.c.c.e, 34);
                    i = a2;
                } else {
                    this.p.setVisibility(8);
                    i = 86;
                }
                if (browserBadgeViewModel.c.f19728a != null) {
                    this.n.setVisibility(0);
                    this.n.setText(browserBadgeViewModel.c.f19728a.f19731a);
                    this.n.setTextColor(e.INSTANCE.a(browserBadgeViewModel.c.f19728a.b));
                } else {
                    this.n.setVisibility(8);
                }
                if (browserBadgeViewModel.c.b != null) {
                    this.o.setVisibility(0);
                    this.o.setImageUrl(browserBadgeViewModel.c.b.c);
                    a(this.o, browserBadgeViewModel.c.b.d, browserBadgeViewModel.c.b.e, GravityCompat.END);
                } else {
                    this.o.setVisibility(8);
                }
                this.m.setVisibility(8);
                i2 = i3;
            }
            if (!(this.m.getLayoutParams() instanceof FrameLayout.LayoutParams)) {
                return;
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.m.getLayoutParams();
            layoutParams.gravity = GravityCompat.END;
            layoutParams.topMargin = ohd.a(this.f19756a, 127 - (i2 / 2));
            layoutParams.rightMargin = ohd.a(this.f19756a, 45 - (i / 2));
            this.m.setLayoutParams(layoutParams);
        } else {
            FrameLayout frameLayout = this.m;
            if (frameLayout == null) {
                return;
            }
            frameLayout.setVisibility(8);
        }
    }

    private void e(BrowserBadgeModel.BrowserBadgeViewModel browserBadgeViewModel) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f16a3b07", new Object[]{this, browserBadgeViewModel});
        } else if (!this.J) {
        } else {
            if (browserBadgeViewModel == null || browserBadgeViewModel.d == null || TextUtils.isEmpty(browserBadgeViewModel.d.f19734a) || TextUtils.isEmpty(browserBadgeViewModel.d.b)) {
                z = false;
            }
            if (z) {
                if (this.I == null) {
                    ViewStub viewStub = (ViewStub) this.b.findViewById(R.id.browser_badge_left_component_stub);
                    viewStub.setLayoutResource(R.layout.browser_badge_left_component_layout);
                    this.I = (CroppedRoundCornerFrameLayout) viewStub.inflate();
                    this.I.initView(ohd.a(this.f19756a, 10), LAYOUT_CENTER_COMPONENT_WIDTH_HEIGHT_PX, ohd.a(this.f19756a, 48), ohd.a(this.f19756a, 8));
                    this.I.setVisibilityChangeListener(new CroppedRoundCornerFrameLayout.d() { // from class: com.taobao.tab2interact.core.component.browser.view.a.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        {
                            a.this = this;
                        }

                        @Override // com.taobao.tab2interact.core.component.browser.view.CroppedRoundCornerFrameLayout.d
                        public void a(boolean z2) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z2)});
                            } else if (a.a(a.this) == null) {
                            } else {
                                a.a(a.this).b(z2);
                            }
                        }
                    });
                    this.I.setEnable(this.J);
                }
                this.I.updateText(browserBadgeViewModel.d.f19734a, browserBadgeViewModel.d.b);
                return;
            }
            CroppedRoundCornerFrameLayout croppedRoundCornerFrameLayout = this.I;
            if (croppedRoundCornerFrameLayout == null) {
                return;
            }
            croppedRoundCornerFrameLayout.updateText(null, null);
        }
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else if (this.J == z) {
        } else {
            this.J = z;
            CroppedRoundCornerFrameLayout croppedRoundCornerFrameLayout = this.I;
            if (croppedRoundCornerFrameLayout == null) {
                return;
            }
            croppedRoundCornerFrameLayout.setEnable(z);
        }
    }

    public boolean x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6b08903", new Object[]{this})).booleanValue();
        }
        CroppedRoundCornerFrameLayout croppedRoundCornerFrameLayout = this.I;
        return croppedRoundCornerFrameLayout != null && croppedRoundCornerFrameLayout.isVisible() && this.J;
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        BrowserBadgeModel.BrowserBadgeViewModel browserBadgeViewModel = this.s;
        if (browserBadgeViewModel == null || browserBadgeViewModel.b == null || this.s.b.h == null || !TextUtils.equals(this.s.b.h.d, "BROWSE_WITHDRAW_BUBBLE_HIDDEN")) {
            return;
        }
        t();
    }

    public View a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("195fbaaa", new Object[]{this}) : this.b;
    }

    public FrameLayout.LayoutParams b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout.LayoutParams) ipChange.ipc$dispatch("b58c6a32", new Object[]{this});
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = GravityCompat.END;
        layoutParams.topMargin = ohd.a(this.f19756a, v() - 93) + ohd.h(this.f19756a);
        layoutParams.rightMargin = ohd.a(this.f19756a, w() - 45);
        return layoutParams;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        BrowserBadgeRootView browserBadgeRootView = this.b;
        if (browserBadgeRootView == null) {
            return;
        }
        if (z) {
            browserBadgeRootView.setVisibility(0);
        } else {
            browserBadgeRootView.setVisibility(8);
        }
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        BrowserBadgeRootView browserBadgeRootView = this.b;
        return browserBadgeRootView != null && browserBadgeRootView.getVisibility() == 0;
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.v = true;
        FrameLayout frameLayout = this.m;
        if (frameLayout == null) {
            return;
        }
        frameLayout.setVisibility(8);
    }

    public void f() {
        BrowserBadgeModel.BrowserBadgeViewModel browserBadgeViewModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else if (this.g == null || (browserBadgeViewModel = this.s) == null || browserBadgeViewModel.b == null || this.s.b.c == null) {
        } else {
            this.g.init(0L, this.s.b.c.b, true);
        }
    }

    public void a(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c11cae8", new Object[]{this, new Long(j), new Long(j2)});
            return;
        }
        CircleProgressView circleProgressView = this.g;
        if (circleProgressView == null) {
            return;
        }
        circleProgressView.init(j, j2, false);
        com.taobao.tab2interact.core.utils.a.b(this, "BrowserBadgeViewController", "初始化进度条，totalDuration=" + j2 + "，accumulatedDuration=" + j + "，hashcode=" + hashCode());
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        com.taobao.tab2interact.core.utils.a.b(this, "BrowserBadgeViewController", "开启进度条");
        CircleProgressView circleProgressView = this.g;
        if (circleProgressView == null) {
            return;
        }
        circleProgressView.start();
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        com.taobao.tab2interact.core.utils.a.b(this, "BrowserBadgeViewController", "暂停进度条");
        CircleProgressView circleProgressView = this.g;
        if (circleProgressView == null) {
            return;
        }
        circleProgressView.pause();
    }

    public void b(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90f80629", new Object[]{this, new Long(j), new Long(j2)});
            return;
        }
        com.taobao.tab2interact.core.utils.a.b(this, "BrowserBadgeViewController", "初始化金额翻滚动画");
        if (this.l == null) {
            return;
        }
        BrowserBadgeModel.BrowserBadgeViewModel browserBadgeViewModel = this.s;
        if (browserBadgeViewModel != null && browserBadgeViewModel.b != null && this.s.b.d != null) {
            BrowserBadgeModel.BrowserBadgeViewModel.a aVar = this.s.b.d;
            com.taobao.tab2interact.core.utils.a.b(this, "BrowserBadgeViewController", "初始化金额翻滚动画，mAmountRollViewModel不为空，mStartValue: " + aVar.f19726a + "，mEndValue: " + aVar.f19726a + "，mSingleChangeDuration: " + aVar.c + "，currentDuration: " + j + "，totalDuration: " + j2);
            this.l.initAmountRoll(aVar.f19726a, aVar.b, j, j2, aVar.c);
            return;
        }
        this.l.initAmountRoll(-1, -1, j, j2, 0L);
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        AmountRollView amountRollView = this.l;
        if (amountRollView == null) {
            return;
        }
        amountRollView.startAmountRoll();
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        AmountRollView amountRollView = this.l;
        if (amountRollView == null) {
            return;
        }
        amountRollView.pauseAmountRoll();
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        AmountRollView amountRollView = this.l;
        if (amountRollView == null) {
            return;
        }
        amountRollView.addAmount(i);
    }

    public void a(InterfaceC0821a interfaceC0821a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7dd005", new Object[]{this, interfaceC0821a});
        } else {
            this.r = interfaceC0821a;
        }
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
            return;
        }
        this.u = -1;
        this.C = 0L;
        this.D = 0L;
        this.E = Long.MAX_VALUE;
        this.F = null;
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        AmountRollView amountRollView = this.l;
        if (amountRollView != null) {
            amountRollView.destroyView();
        }
        CroppedRoundCornerFrameLayout croppedRoundCornerFrameLayout = this.I;
        if (croppedRoundCornerFrameLayout == null) {
            return;
        }
        croppedRoundCornerFrameLayout.clear();
    }

    private void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        this.b = (BrowserBadgeRootView) LayoutInflater.from(context).inflate(R.layout.browser_badge_layout, (ViewGroup) null);
        this.f = (FrameLayout) this.b.findViewById(R.id.browser_badge_center_component);
        this.h = (LinearLayout) this.b.findViewById(R.id.browser_badge_center_component_text_container);
        this.k = (TextView) this.b.findViewById(R.id.browser_badge_center_component_text);
        this.x = (TextView) this.b.findViewById(R.id.browser_badge_center_component_text_description);
        this.g = (CircleProgressView) this.b.findViewById(R.id.browser_badge_center_component_circle_progress_view);
        this.i = (TUrlImageView) this.b.findViewById(R.id.browser_badge_center_component_image_apng);
        this.w = (TUrlImageView) this.b.findViewById(R.id.browser_badge_center_component_image_png);
        this.l = (AmountRollView) this.b.findViewById(R.id.browser_badge_center_component_amount_roll_view);
        this.i.setSkipAutoSize(true);
        final c cVar = new c() { // from class: com.taobao.tab2interact.core.component.browser.view.a.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                a.this = this;
            }

            @Override // com.taobao.phenix.animate.c
            public boolean onLoopCompleted(int i, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("a7565d93", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
                }
                com.taobao.tab2interact.core.utils.a.b(this, "BrowserBadgeViewController", "初始化View，中部组件动图drawable播放完成，completedLoop=" + i + "，totalLoop=" + i2);
                if (i2 <= 0 || i < i2) {
                    return true;
                }
                if (a.b(a.this) != null) {
                    a.b(a.this).f();
                }
                if (a.c(a.this) != null) {
                    a aVar = a.this;
                    a.a(aVar, a.c(aVar).c, a.c(a.this).d, a.c(a.this).e);
                }
                return false;
            }
        };
        this.i.succListener(new com.taobao.phenix.intf.event.a<SuccPhenixEvent>() { // from class: com.taobao.tab2interact.core.component.browser.view.a.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                a.this = this;
            }

            @Override // com.taobao.phenix.intf.event.a
            public /* synthetic */ boolean onHappen(SuccPhenixEvent succPhenixEvent) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, succPhenixEvent})).booleanValue() : a(succPhenixEvent);
            }

            public boolean a(SuccPhenixEvent succPhenixEvent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("3b4dd374", new Object[]{this, succPhenixEvent})).booleanValue();
                }
                BitmapDrawable drawable = succPhenixEvent.getDrawable();
                if (drawable instanceof b) {
                    com.taobao.tab2interact.core.utils.a.b(this, "BrowserBadgeViewController", "初始化View，中部组件动图加载完毕");
                    a.d(a.this).setVisibility(4);
                    a.e(a.this).setVisibility(0);
                    a.a(a.this, (b) drawable);
                    a.b(a.this).a(cVar);
                }
                return false;
            }
        });
        FrameLayout frameLayout = this.f;
        int i = LAYOUT_CENTER_COMPONENT_WIDTH_HEIGHT_PX;
        a(frameLayout, i, i, GravityCompat.END);
        CircleProgressView circleProgressView = this.g;
        int i2 = LAYOUT_CENTER_COMPONENT_WIDTH_HEIGHT_PX;
        a(circleProgressView, i2, i2, 17);
        if (this.f.getLayoutParams() instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f.getLayoutParams();
            layoutParams.topMargin = ohd.a(this.f19756a, 48);
            layoutParams.bottomMargin = ohd.a(this.f19756a, 8);
            this.f.setLayoutParams(layoutParams);
        }
        this.k.setTextSize(0, ohd.a(this.f19756a, 26));
        this.k.setTypeface(ohj.a(this.f19756a, e.ALI_SANS_TYPEFACE_ASSET_PATH, null, false, false));
        this.x.setTextSize(0, ohd.a(this.f19756a, 18));
        this.k.setVisibility(8);
        this.x.setVisibility(8);
        this.l.setVisibility(8);
        this.g.setProgressListener(this);
        this.l.setAmountRollChangedListener(this);
        this.b.setOnVisibilityChangedListener(new BrowserBadgeRootView.a() { // from class: com.taobao.tab2interact.core.component.browser.view.a.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                a.this = this;
            }

            @Override // com.taobao.tab2interact.core.component.browser.view.BrowserBadgeRootView.a
            public void a(int i3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a821939b", new Object[]{this, new Integer(i3)});
                } else if (i3 != 0 || a.a(a.this) == null) {
                } else {
                    a.a(a.this).z();
                }
            }
        });
        this.b.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.tab2interact.core.component.browser.view.BrowserBadgeViewController$5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else if (a.a(a.this) == null) {
                } else {
                    a.a(a.this).bU_();
                }
            }
        });
    }

    private void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
        } else if (this.c != null) {
        } else {
            ViewStub viewStub = (ViewStub) this.b.findViewById(R.id.browser_badge_top_component_stub);
            viewStub.setLayoutResource(R.layout.browser_badge_top_component_layout);
            this.c = (LinearLayout) viewStub.inflate();
            this.d = (TUrlImageView) this.c.findViewById(R.id.browser_badge_top_component_icon);
            this.e = (TextView) this.c.findViewById(R.id.browser_badge_top_component_text);
            this.e.setTextSize(0, ohd.a(this.f19756a, 32));
        }
    }

    private void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
        } else if (this.m != null) {
        } else {
            ViewStub viewStub = (ViewStub) this.b.findViewById(R.id.browser_badge_bottom_component_stub);
            viewStub.setLayoutResource(R.layout.browser_badge_bottom_component_layout);
            this.m = (FrameLayout) viewStub.inflate();
            this.n = (TextView) this.m.findViewById(R.id.browser_badge_bottom_component_text);
            this.o = (TUrlImageView) this.m.findViewById(R.id.browser_badge_bottom_component_arrow);
            this.p = (TUrlImageView) this.m.findViewById(R.id.browser_badge_bottom_component_background);
            this.q = (TUrlImageView) this.m.findViewById(R.id.browser_badge_bottom_component_image);
        }
    }

    private void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
        } else if (this.y == null) {
            ViewStub viewStub = (ViewStub) this.b.findViewById(R.id.browser_badge_center_component_top_bottom_stub);
            viewStub.setLayoutResource(R.layout.browser_badge_center_component_top_bottom_layout);
            this.y = (FrameLayout) viewStub.inflate();
            this.z = (TextView) this.y.findViewById(R.id.top_text);
            this.A = new ArrayList();
            this.A.add((TextSwitcher) this.y.findViewById(R.id.bottom_countdown_minute_tens));
            this.A.add((TextSwitcher) this.y.findViewById(R.id.bottom_countdown_minute_ones));
            this.A.add((TextSwitcher) this.y.findViewById(R.id.bottom_countdown_second_tens));
            this.A.add((TextSwitcher) this.y.findViewById(R.id.bottom_countdown_second_ones));
            this.B = (TextView) this.y.findViewById(R.id.bottom_countdown_colon);
            ((FrameLayout.LayoutParams) this.z.getLayoutParams()).topMargin = ohd.a(this.f19756a, 12);
            this.z.setTextSize(0, ohd.a(this.f19756a, 20));
            ((FrameLayout.LayoutParams) ((LinearLayout) this.y.findViewById(R.id.bottom_countdown)).getLayoutParams()).topMargin = ohd.a(this.f19756a, 38);
            ViewSwitcher.ViewFactory viewFactory = new ViewSwitcher.ViewFactory() { // from class: com.taobao.tab2interact.core.component.browser.view.BrowserBadgeViewController$6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.widget.ViewSwitcher.ViewFactory
                public View makeView() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (View) ipChange2.ipc$dispatch("f2361e7c", new Object[]{this});
                    }
                    TextView textView = new TextView(a.f(a.this));
                    textView.setLayoutParams(new FrameLayout.LayoutParams(-2, ohd.a(a.f(a.this), 18)));
                    textView.setTextSize(0, ohd.a(a.f(a.this), 20));
                    textView.setTypeface(Typeface.defaultFromStyle(1));
                    textView.setPadding(0, ohd.a(a.f(a.this), -6), 0, 0);
                    return textView;
                }
            };
            for (TextSwitcher textSwitcher : this.A) {
                if (textSwitcher != null) {
                    textSwitcher.setFactory(viewFactory);
                }
            }
            ((LinearLayout.LayoutParams) this.B.getLayoutParams()).height = ohd.a(this.f19756a, 18);
            this.B.setTextSize(0, ohd.a(this.f19756a, 20));
            this.B.setPadding(0, ohd.a(this.f19756a, -6), 0, 0);
        }
    }

    private void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65bfbf9", new Object[]{this});
            return;
        }
        this.D = (long) Math.ceil(this.C / 1000.0d);
        if (this.D >= 0) {
            return;
        }
        this.D = 0L;
    }

    private String s() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("255e0466", new Object[]{this}) : String.format(Locale.US, "%02d%02d", Long.valueOf(this.D / 60), Long.valueOf(this.D % 60));
    }

    private void a(final TextView textView, final String str, final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c92be1d", new Object[]{this, textView, str, new Integer(i)});
        } else if (textView == null) {
        } else {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, "alpha", 1.0f, 0.0f);
            ofFloat.setDuration(300L);
            ofFloat.addListener(new AnimatorListenerAdapter() { // from class: com.taobao.tab2interact.core.component.browser.view.a.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    a.this = this;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                        return;
                    }
                    a.a(a.this, textView, str, i);
                    a.a(a.this, textView);
                }
            });
            ofFloat.start();
        }
    }

    private void b(TextView textView, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c1c581e", new Object[]{this, textView, str, new Integer(i)});
        } else if (textView == null) {
        } else {
            textView.setText(str);
            textView.setTextColor(i);
        }
    }

    private void a(TextView textView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a92d3edc", new Object[]{this, textView});
        } else if (textView == null) {
        } else {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, "alpha", 0.0f, 1.0f);
            ofFloat.setDuration(300L);
            ofFloat.start();
        }
    }

    private void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6782afb", new Object[]{this});
            return;
        }
        com.taobao.tab2interact.core.utils.a.b(this, "BrowserBadgeViewController", "展示中部组件的顶部底部布局容器");
        if (this.H) {
            return;
        }
        a((View) this.y, true, 300L);
        a((View) this.h, false, 0L);
        a((View) this.i, false, 0L);
        a((View) this.w, false, 0L);
        this.H = true;
    }

    private void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("686427c", new Object[]{this});
            return;
        }
        com.taobao.tab2interact.core.utils.a.b(this, "BrowserBadgeViewController", "隐藏中部组件的顶部底部布局容器");
        if (!this.H) {
            return;
        }
        a((View) this.y, false, 0L);
        a((View) this.h, true, 300L);
        a((View) this.i, true, 300L);
        a((View) this.w, true, 300L);
        this.H = false;
    }

    private void a(View view, boolean z, long j) {
        float[] fArr;
        float[] fArr2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c2ccf5a", new Object[]{this, view, new Boolean(z), new Long(j)});
        } else if (view == null) {
        } else {
            if (z) {
                fArr = new float[]{0.0f, 1.12f, 1.0f};
                fArr2 = new float[]{0.0f, 1.0f};
            } else {
                fArr = new float[]{1.0f, 1.12f, 0.0f};
                fArr2 = new float[]{1.0f, 0.0f};
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleX", fArr[0], fArr[1]);
            ofFloat.setDuration(200L);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "scaleX", fArr[1], fArr[2]);
            ofFloat2.setDuration(200L);
            ofFloat2.setStartDelay(200L);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, "scaleY", fArr[0], fArr[1]);
            ofFloat3.setDuration(200L);
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view, "scaleY", fArr[1], fArr[2]);
            ofFloat4.setDuration(200L);
            ofFloat4.setStartDelay(200L);
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(view, "alpha", fArr2[0], fArr2[1]);
            ofFloat5.setDuration(400L);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5);
            animatorSet.setStartDelay(j);
            animatorSet.start();
        }
    }

    private void a(List<TextSwitcher> list, String str, int i) {
        int size;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51544080", new Object[]{this, list, str, new Integer(i)});
        } else if (list != null && str != null && (size = list.size()) <= str.length()) {
            for (int i2 = 0; i2 < size; i2++) {
                TextSwitcher textSwitcher = list.get(i2);
                if (textSwitcher != null) {
                    textSwitcher.setCurrentText(str.substring(i2, i2 + 1));
                    TextView textView = (TextView) textSwitcher.getCurrentView();
                    if (textView != null) {
                        textView.setTextColor(i);
                    }
                    TextView textView2 = (TextView) textSwitcher.getNextView();
                    if (textView2 != null) {
                        textView2.setTextColor(i);
                    }
                }
            }
        }
    }

    private void a(List<TextSwitcher> list, String str) {
        int size;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c6e0ee3", new Object[]{this, list, str});
            return;
        }
        com.taobao.tab2interact.core.utils.a.b(this, "BrowserBadgeViewController", "执行文本切换器列表的位移动画，targetValue=" + str);
        if (list == null || str == null || (size = list.size()) > str.length()) {
            return;
        }
        for (int i = 0; i < size; i++) {
            TextSwitcher textSwitcher = list.get(i);
            if (textSwitcher != null) {
                TextView textView = (TextView) textSwitcher.getCurrentView();
                String substring = str.substring(i, i + 1);
                if (textView != null && !TextUtils.equals(textView.getText(), substring)) {
                    TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
                    TranslateAnimation translateAnimation2 = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, -1.0f);
                    translateAnimation.setDuration(1000L);
                    translateAnimation2.setDuration(1000L);
                    textSwitcher.setInAnimation(translateAnimation);
                    textSwitcher.setOutAnimation(translateAnimation2);
                    textSwitcher.setText(substring);
                }
            }
        }
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        com.taobao.tab2interact.core.utils.a.b(this, "BrowserBadgeViewController", "执行顶部组件动画");
        float top = this.f.getTop();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.c, "translationY", top, top - (ohd.a(this.f19756a, 48) + ohd.a(this.f19756a, 48)));
        ofFloat.setDuration(300L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.c, "alpha", 0.0f, 1.0f);
        ofFloat2.setDuration(300L);
        ofFloat2.setInterpolator(new LinearInterpolator());
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.c, "scaleX", 0.8f, 1.0f);
        ofFloat3.setDuration(300L);
        ofFloat3.setInterpolator(new LinearInterpolator());
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.c, "alpha", 1.0f, 0.0f);
        ofFloat4.setDuration(300L);
        ofFloat4.setInterpolator(new LinearInterpolator());
        ofFloat4.setStartDelay(1700L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.taobao.tab2interact.core.component.browser.view.a.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                a.this = this;
            }

            public static /* synthetic */ Object ipc$super(AnonymousClass6 anonymousClass6, String str, Object... objArr) {
                if (str.hashCode() == -2145066406) {
                    super.onAnimationEnd((Animator) objArr[0]);
                    return null;
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                } else {
                    super.onAnimationEnd(animator);
                }
            }
        });
        animatorSet.start();
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        com.taobao.tab2interact.core.utils.a.b(this, "BrowserBadgeViewController", "展示由金额触发的中间图片");
        BrowserBadgeModel.BrowserBadgeViewModel browserBadgeViewModel = this.s;
        if (browserBadgeViewModel == null || browserBadgeViewModel.b == null || this.s.b.b == null) {
            return;
        }
        BrowserBadgeModel.BrowserBadgeViewModel.b bVar = this.s.b.b;
        if (bVar.b != BrowserBadgeModel.BrowserBadgeViewModel.PicModel.Type.APNG) {
            return;
        }
        a(bVar.c, bVar.d, bVar.e);
    }

    private void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
            return;
        }
        com.taobao.tab2interact.core.utils.a.b(this, "BrowserBadgeViewController", "设置中部组件动图");
        this.w.setVisibility(4);
        this.i.setVisibility(0);
        a(this.i, str2, str3, 17);
        if (TextUtils.equals(this.i.getImageUrl(), str)) {
            b bVar = this.j;
            if (bVar == null) {
                return;
            }
            bVar.b();
            com.taobao.tab2interact.core.utils.a.b(this, "BrowserBadgeViewController", "设置中部组件动图，url未发生变化，执行动画");
            return;
        }
        this.i.setImageUrl(str);
        com.taobao.tab2interact.core.utils.a.b(this, "BrowserBadgeViewController", "设置中部组件动图，url发生变化，url=" + str);
    }

    private void b(String str, String str2, String str3) {
        b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3509d07", new Object[]{this, str, str2, str3});
            return;
        }
        com.taobao.tab2interact.core.utils.a.b(this, "BrowserBadgeViewController", "设置中部组件静图");
        if (TextUtils.equals(this.w.getImageUrl(), str) && (bVar = this.j) != null && bVar.c()) {
            return;
        }
        this.i.setVisibility(4);
        this.w.setVisibility(0);
        b bVar2 = this.j;
        if (bVar2 != null) {
            bVar2.f();
        }
        a(this.w, str2, str3, 17);
        this.w.setImageUrl(str);
        com.taobao.tab2interact.core.utils.a.b(this, "BrowserBadgeViewController", "设置中部组件静图，满足条件，url=" + str);
    }

    private void a(View view, String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70b8b745", new Object[]{this, view, str, str2, new Integer(i)});
        } else {
            a(view, ohd.a(this.f19756a, str), ohd.a(this.f19756a, str2), i);
        }
    }

    private void a(View view, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("287d8af9", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams.width == i && layoutParams.height == i2) {
            return;
        }
        layoutParams.width = i;
        layoutParams.height = i2;
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = i3;
        }
        view.setLayoutParams(layoutParams);
        com.taobao.tab2interact.core.utils.a.b(this, "BrowserBadgeViewController", "设置布局参数，pixelWidth=" + i + "，pixelHeight=" + i2);
    }

    private static void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bea080", new Object[0]);
            return;
        }
        Pair<Integer, Integer> c = skq.c();
        if (c == null || c.first == null || c.second == null) {
            return;
        }
        K = ((Integer) c.first).intValue();
        L = ((Integer) c.second).intValue();
    }
}
