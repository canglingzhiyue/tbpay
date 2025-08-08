package tb;

import android.animation.ValueAnimator;
import android.app.Activity;
import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.LinearInterpolator;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.alipay.mobile.common.logging.api.LogContext;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.capture.dynamic.msg.TipShowMsg;
import com.etao.feimagesearch.capture.dynamic.msg.c;
import com.etao.feimagesearch.model.b;
import com.etao.feimagesearch.structure.capture.CaptureManager;
import com.etao.feimagesearch.structure.capture.a;
import com.etao.feimagesearch.structure.capture.h;
import com.etao.feimagesearch.util.ac;
import com.etao.feimagesearch.util.ad;
import com.etao.feimagesearch.util.g;
import com.taobao.android.detail.core.detail.kit.view.widget.main.BlackLightIndicatorBar;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import tb.cpe;

/* loaded from: classes3.dex */
public class cpw extends ctc<cpv, b, CaptureManager> implements View.OnClickListener, h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private View f26420a;
    private TUrlImageView f;
    private TUrlImageView g;
    private TUrlImageView h;
    private TUrlImageView i;
    private TUrlImageView j;
    private View k;
    private TUrlImageView l;
    private TextView m;
    private View n;
    private TextView o;
    private TextView p;
    private View q;
    private ValueAnimator r;
    private TextView s;
    private String t;
    private int u;
    private final cpt v;
    private boolean w;

    static {
        kge.a(1622121348);
        kge.a(-1201612728);
        kge.a(-1765150492);
    }

    public static /* synthetic */ Object ipc$super(cpw cpwVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1474194533:
                super.a(((Number) objArr[0]).intValue());
                return null;
            case 92838762:
                super.c();
                return null;
            case 93762283:
                super.d();
                return null;
            case 1978668644:
                super.B_();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static /* synthetic */ ValueAnimator a(cpw cpwVar, ValueAnimator valueAnimator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ValueAnimator) ipChange.ipc$dispatch("9bd10a6a", new Object[]{cpwVar, valueAnimator});
        }
        cpwVar.r = valueAnimator;
        return valueAnimator;
    }

    public static /* synthetic */ View a(cpw cpwVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("22ee8db0", new Object[]{cpwVar}) : cpwVar.f26420a;
    }

    public static /* synthetic */ void a(cpw cpwVar, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a96f7a9c", new Object[]{cpwVar, str, new Boolean(z)});
        } else {
            cpwVar.a(str, z);
        }
    }

    public static /* synthetic */ boolean a(cpw cpwVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("98dd3baa", new Object[]{cpwVar, new Boolean(z)})).booleanValue();
        }
        cpwVar.w = z;
        return z;
    }

    public static /* synthetic */ TUrlImageView b(cpw cpwVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TUrlImageView) ipChange.ipc$dispatch("3dcab82d", new Object[]{cpwVar}) : cpwVar.h;
    }

    public static /* synthetic */ void b(cpw cpwVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7abb0545", new Object[]{cpwVar, new Boolean(z)});
        } else {
            cpwVar.c(z);
        }
    }

    public static /* synthetic */ TUrlImageView c(cpw cpwVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TUrlImageView) ipChange.ipc$dispatch("bc2bbc0c", new Object[]{cpwVar}) : cpwVar.g;
    }

    public static /* synthetic */ View d(cpw cpwVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("61a8e673", new Object[]{cpwVar}) : cpwVar.n;
    }

    public static /* synthetic */ Activity e(cpw cpwVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("5980d6f6", new Object[]{cpwVar}) : cpwVar.d;
    }

    public static /* synthetic */ Activity f(cpw cpwVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("96a09b15", new Object[]{cpwVar}) : cpwVar.d;
    }

    public static /* synthetic */ ctb g(cpw cpwVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ctb) ipChange.ipc$dispatch("39854021", new Object[]{cpwVar}) : cpwVar.b;
    }

    public static /* synthetic */ ctb h(cpw cpwVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ctb) ipChange.ipc$dispatch("21271680", new Object[]{cpwVar}) : cpwVar.b;
    }

    public static /* synthetic */ ValueAnimator i(cpw cpwVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ValueAnimator) ipChange.ipc$dispatch("43495a5a", new Object[]{cpwVar}) : cpwVar.r;
    }

    public static /* synthetic */ View j(cpw cpwVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("df1d97f9", new Object[]{cpwVar}) : cpwVar.q;
    }

    public static /* synthetic */ View k(cpw cpwVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("f406603a", new Object[]{cpwVar}) : cpwVar.k;
    }

    public static /* synthetic */ TextView l(cpw cpwVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("ce1069ed", new Object[]{cpwVar}) : cpwVar.s;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [tb.cpv, tb.ctb] */
    @Override // tb.ctc
    public /* synthetic */ cpv b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ctb) ipChange.ipc$dispatch("16b50a8c", new Object[]{this}) : a();
    }

    public cpw(Activity activity, cte<b, CaptureManager> cteVar) {
        super(activity, cteVar);
        this.t = "";
        this.u = -1;
        this.v = cpe.a(activity);
        j().a(this);
    }

    public cpv a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (cpv) ipChange.ipc$dispatch("f035895", new Object[]{this}) : new cpv();
    }

    @Override // tb.ctc
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        super.c();
        final ViewGroup viewGroup = (ViewGroup) this.d.findViewById(R.id.fl_capture_ui);
        this.f26420a = LayoutInflater.from(this.d).inflate(R.layout.feis_view_capture_degrade, (ViewGroup) null);
        this.f = (TUrlImageView) this.f26420a.findViewById(R.id.feis_capture_btn_back);
        this.f.setImageResource(R.drawable.feis_ic_back);
        this.f.setOnClickListener(this);
        this.g = (TUrlImageView) this.f26420a.findViewById(R.id.iv_album);
        this.g.setImageResource(R.drawable.feis_ic_album_entrance);
        this.g.setOnClickListener(this);
        this.h = (TUrlImageView) this.f26420a.findViewById(R.id.feis_capture_btn_history);
        this.h.setImageUrl("https://img.alicdn.com/imgextra/i4/O1CN01H6jO9D1VgrPqPAd8d_!!6000000002683-2-tps-132-132.png");
        this.h.setOnClickListener(this);
        this.i = (TUrlImageView) this.f26420a.findViewById(R.id.feis_capture_btn_change);
        this.i.setImageUrl("https://gw.alicdn.com/imgextra/i4/O1CN01jIDvMX1KBktying3g_!!6000000001126-2-tps-144-144.png");
        this.i.setOnClickListener(this);
        this.k = this.f26420a.findViewById(R.id.ll_flashlight);
        this.k.setOnClickListener(this);
        this.l = (TUrlImageView) this.f26420a.findViewById(R.id.feis_capture_btn_light);
        this.m = (TextView) this.f26420a.findViewById(R.id.feis_capture_btn_light_alert);
        this.j = (TUrlImageView) this.f26420a.findViewById(R.id.iv_take);
        this.j.setImageResource(R.drawable.feis_ic_take);
        this.j.setContentDescription(com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_1_18964));
        this.j.setOnClickListener(this);
        this.s = (TextView) this.f26420a.findViewById(R.id.tv_user_hint);
        ((TUrlImageView) this.f26420a.findViewById(R.id.iv_tab_mask)).setImageUrl("https://img.alicdn.com/imgextra/i2/O1CN01fTWwds1z7XIgX2X6C_!!6000000006667-2-tps-750-400.png");
        this.n = this.f26420a.findViewById(R.id.view_tab);
        this.o = (TextView) this.f26420a.findViewById(R.id.tab_scan);
        this.o.setOnClickListener(this);
        this.p = (TextView) this.f26420a.findViewById(R.id.tab_pai);
        this.p.setOnClickListener(this);
        viewGroup.post(new Runnable() { // from class: tb.cpw.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                viewGroup.addView(cpw.a(cpw.this), new ViewGroup.LayoutParams(-1, -1));
                cpw cpwVar = cpw.this;
                cpw.a(cpwVar, cpwVar.h().getInitScene(), true);
                cpw.a(cpw.this, true);
                if (com.etao.feimagesearch.config.b.co()) {
                    cuk.a(cpw.this.s(), com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_1_18954), 0);
                }
                if (cpw.this.j().o()) {
                    cpw.b(cpw.this).setVisibility(0);
                    cpw.c(cpw.this).setVisibility(0);
                    return;
                }
                cpw.b(cpw.this).setVisibility(8);
                cpw.c(cpw.this).setVisibility(8);
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) cpw.d(cpw.this).getLayoutParams();
                layoutParams.bottomMargin = cpr.Companion.a(cpw.e(cpw.this), com.etao.feimagesearch.config.b.a(cpw.f(cpw.this)));
                cpw.d(cpw.this).setLayoutParams(layoutParams);
            }
        });
    }

    @Override // tb.ctc
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        super.d();
        b(false);
    }

    @Override // tb.ctc
    public void B_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75f01664", new Object[]{this});
            return;
        }
        super.B_();
        b(true);
    }

    @Override // tb.ctc
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        super.a(i);
        if (j().o()) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.n.getLayoutParams();
        layoutParams.bottomMargin = cpr.Companion.a(this.d, com.etao.feimagesearch.config.b.a(this.d));
        this.n.setLayoutParams(layoutParams);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (view == this.g) {
            cpt cptVar = this.v;
            if (cptVar == null) {
                return;
            }
            cptVar.h();
        } else if (view == this.h) {
            cpt cptVar2 = this.v;
            if (cptVar2 == null) {
                return;
            }
            cptVar2.g();
        } else if (view == this.i) {
            cpt cptVar3 = this.v;
            if (cptVar3 == null) {
                return;
            }
            cptVar3.i();
        } else if (view == this.f) {
            cpt cptVar4 = this.v;
            if (cptVar4 == null) {
                return;
            }
            cptVar4.o().finish();
        } else if (view == this.j) {
            coy.a(a.f6987a, "clickTakePhotoOnDegrade", 19999, new String[0]);
            cpt cptVar5 = this.v;
            if (cptVar5 == null) {
                return;
            }
            cptVar5.j();
        } else if (view == this.o) {
            a("scan", false);
        } else if (view == this.p) {
            a(cpe.a.SCENE_AUTO_DETECT, false);
        } else if (view != this.k) {
        } else {
            if (j().P()) {
                c(false);
            } else if (j().v()) {
            } else {
                c(true);
            }
        }
    }

    private void a(String str, boolean z) {
        cpt cptVar;
        cpt cptVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ece2", new Object[]{this, str, new Boolean(z)});
        } else if (StringUtils.isEmpty(str) || str.equals(this.t)) {
        } else {
            if (!str.equals("scan") && !str.equals(cpe.a.SCENE_AUTO_DETECT)) {
                return;
            }
            if (str.equals("scan")) {
                a(true);
                this.o.setTextColor(-1);
                this.p.setTextColor(BlackLightIndicatorBar.DEFAULT_UNSELECTED_TEXT_COLOR);
                this.j.setVisibility(8);
                this.i.setVisibility(8);
                this.s.setVisibility(0);
                this.s.setText(com.etao.feimagesearch.config.b.b(j().W()));
                if (j().v() && (cptVar2 = this.v) != null) {
                    cptVar2.i();
                }
            } else {
                a(false);
                this.p.setTextColor(-1);
                this.o.setTextColor(BlackLightIndicatorBar.DEFAULT_UNSELECTED_TEXT_COLOR);
                this.j.setVisibility(0);
                this.i.setVisibility(0);
                this.s.setVisibility(8);
            }
            if (!z && (cptVar = this.v) != null) {
                cptVar.a(str);
            }
            this.t = str;
        }
    }

    private void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (z) {
            if (this.q == null) {
                this.q = ((ViewStub) this.f26420a.findViewById(R.id.vs_scan)).inflate();
                ((TUrlImageView) this.q.findViewById(R.id.iv_animate_line)).setImageUrl("https://img.alicdn.com/imgextra/i2/O1CN013pVK8s1rRfmsKZSpl_!!6000000005628-2-tps-751-298.png");
                this.q.findViewById(R.id.tv_hint).setVisibility(4);
            }
            this.q.setVisibility(0);
            b(false);
        } else {
            View view = this.q;
            if (view == null) {
                return;
            }
            view.setVisibility(8);
            b(true);
        }
    }

    private void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        View view = this.q;
        if (view == null) {
            return;
        }
        if (z) {
            ValueAnimator valueAnimator = this.r;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                return;
            }
            this.r.cancel();
            this.r.removeAllUpdateListeners();
            this.r = null;
        } else if (view.getVisibility() != 0) {
        } else {
            ValueAnimator valueAnimator2 = this.r;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                return;
            }
            this.q.post(new Runnable() { // from class: tb.cpw.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (cpw.g(cpw.this) != null && ((cpv) cpw.h(cpw.this)).g()) {
                    } else {
                        if (cpw.i(cpw.this) != null && cpw.i(cpw.this).isRunning()) {
                            return;
                        }
                        final TUrlImageView tUrlImageView = (TUrlImageView) cpw.j(cpw.this).findViewById(R.id.iv_animate_line);
                        tUrlImageView.setVisibility(0);
                        float bottom = (((TextView) cpw.j(cpw.this).findViewById(R.id.tv_hint)).getRootView().getBottom() - g.a(190.0f)) - tUrlImageView.getBottom();
                        float f = -g.a(149.0f);
                        final float a2 = g.a(75.0f);
                        final float f2 = bottom - a2;
                        final float a3 = g.a(40.0f);
                        final float f3 = f + a3;
                        cpw.a(cpw.this, ValueAnimator.ofFloat(f, bottom));
                        cpw.i(cpw.this).addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: tb.cpw.2.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public void onAnimationUpdate(ValueAnimator valueAnimator3) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator3});
                                    return;
                                }
                                Float f4 = (Float) valueAnimator3.getAnimatedValue();
                                if (f4 == null) {
                                    return;
                                }
                                tUrlImageView.setTranslationY(f4.floatValue());
                                float floatValue = f4.floatValue();
                                float f5 = f3;
                                if (floatValue <= f5) {
                                    tUrlImageView.setAlpha(1.0f - ((f5 - f4.floatValue()) / a3));
                                    return;
                                }
                                float floatValue2 = f4.floatValue() - f2;
                                if (floatValue2 < 0.0f) {
                                    tUrlImageView.setAlpha(1.0f);
                                } else {
                                    tUrlImageView.setAlpha(1.0f - (floatValue2 / a2));
                                }
                            }
                        });
                        cpw.i(cpw.this).setRepeatCount(-1);
                        cpw.i(cpw.this).setDuration(2000L);
                        cpw.i(cpw.this).setInterpolator(new LinearInterpolator());
                        cpw.i(cpw.this).start();
                    }
                }
            });
            this.q.invalidate();
        }
    }

    private void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
        } else if (this.u == z) {
        } else {
            j().f(z);
            coy.a("Page_PhotoSearchTake", "actionTrigger", LogContext.LOCAL_STORAGE_ACTIONID, "5");
            if (z) {
                this.l.setImageUrl("https://img.alicdn.com/tfs/TB1OVsH0hz1gK0jSZSgXXavwpXa-33-39.png");
                this.l.setContentDescription(com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_1_18931));
                this.m.setText(com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_1_18927));
                cpt cptVar = this.v;
                if (cptVar != null) {
                    cptVar.b(true);
                }
            } else {
                this.l.setImageUrl("https://img.alicdn.com/tfs/TB1y83HnjMZ7e4jSZFOXXX7epXa-41-53.png");
                this.l.setContentDescription(com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_1_18913));
                this.m.setText(com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_1_18937));
                cpt cptVar2 = this.v;
                if (cptVar2 != null) {
                    cptVar2.b(false);
                }
            }
            this.u = z ? 1 : 0;
        }
    }

    public void a(String str, final com.etao.feimagesearch.capture.dynamic.msg.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51e92575", new Object[]{this, str, bVar});
        } else {
            ad.c("CaptureDegradeUIView_sendMsg", new ac() { // from class: tb.cpw.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.etao.feimagesearch.util.ac
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    int i = 0;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    com.etao.feimagesearch.capture.dynamic.msg.b bVar2 = bVar;
                    if (bVar2 instanceof c) {
                        View k = cpw.k(cpw.this);
                        if (!((c) bVar).c()) {
                            i = 8;
                        }
                        k.setVisibility(i);
                        cpw.b(cpw.this, ((c) bVar).d());
                    } else if (!(bVar2 instanceof TipShowMsg) || StringUtils.isEmpty(((TipShowMsg) bVar2).a())) {
                    } else {
                        cpw.l(cpw.this).setText(((TipShowMsg) bVar).a());
                        if (((TipShowMsg) bVar).b() != 0) {
                            return;
                        }
                        cpw.l(cpw.this).setVisibility(0);
                    }
                }
            });
        }
    }

    @Override // com.etao.feimagesearch.structure.capture.h
    public void a(com.etao.feimagesearch.capture.dynamic.msg.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45bb572b", new Object[]{this, bVar});
        } else {
            a("", bVar);
        }
    }

    @Override // com.etao.feimagesearch.structure.capture.h
    public boolean i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue() : this.w;
    }
}
