package tb;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.framework.statisticsv2.model.StEvent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.live.plugin.proxy.f;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.utils.q;

/* loaded from: classes5.dex */
public class krb implements krc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f30244a;
    private Handler b = new Handler(Looper.getMainLooper());
    private DXRootView c;
    private FrameLayout d;
    private JSONObject e;
    private String f;
    private long g;
    private long h;
    private String i;
    private boolean j;

    /* renamed from: tb.krb$2  reason: invalid class name */
    /* loaded from: classes5.dex */
    public class AnonymousClass2 implements View.OnLayoutChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f30246a = 0;
        public int b = 0;
        public final /* synthetic */ ViewGroup c;

        public AnonymousClass2(ViewGroup viewGroup) {
            this.c = viewGroup;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("899df952", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
            } else if (this.f30246a != 0 || krb.a(krb.this).getMeasuredWidth() <= 0) {
            } else {
                this.f30246a = krb.a(krb.this).getMeasuredWidth();
                this.b = krb.a(krb.this).getMeasuredHeight();
                his.a("GoodsBtnGuide", "showInternal | measuredGuideWidth=" + this.f30246a + " measuredGuideHeight=" + this.b);
                ValueAnimator ofInt = ValueAnimator.ofInt(0, 400);
                ofInt.setDuration(400L);
                ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: tb.krb.2.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                            return;
                        }
                        AnonymousClass2.this.c.getLayoutParams().width = (int) (AnonymousClass2.this.f30246a * (((Integer) valueAnimator.getAnimatedValue()).intValue() / 400.0f));
                        AnonymousClass2.this.c.requestLayout();
                    }
                });
                ofInt.start();
            }
        }
    }

    static {
        kge.a(-626175457);
        kge.a(67378224);
    }

    public static /* synthetic */ DXRootView a(krb krbVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXRootView) ipChange.ipc$dispatch("a8ac921a", new Object[]{krbVar}) : krbVar.c;
    }

    public static /* synthetic */ void a(krb krbVar, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5841e25c", new Object[]{krbVar, viewGroup});
        } else {
            krbVar.a(viewGroup);
        }
    }

    public static /* synthetic */ boolean a(krb krbVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4250d95b", new Object[]{krbVar, new Boolean(z)})).booleanValue();
        }
        krbVar.j = z;
        return z;
    }

    public static /* synthetic */ void b(krb krbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e022839e", new Object[]{krbVar});
        } else {
            krbVar.fb_();
        }
    }

    public static /* synthetic */ Handler c(krb krbVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("ec36da47", new Object[]{krbVar}) : krbVar.b;
    }

    public krb(Context context, FrameLayout frameLayout) {
        this.f30244a = context;
        this.d = frameLayout;
    }

    @Override // tb.krc
    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.j;
    }

    @Override // tb.krc
    public void a(final ViewGroup viewGroup, TBLiveDataModel tBLiveDataModel) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3487dae0", new Object[]{this, viewGroup, tBLiveDataModel});
            return;
        }
        if (tBLiveDataModel != null && tBLiveDataModel.mVideoInfo != null && tBLiveDataModel.mVideoInfo.originalData != null) {
            this.e = tBLiveDataModel.mVideoInfo.originalData.getJSONObject("goodsBtnPopInfo");
        }
        if (viewGroup == null || (jSONObject = this.e) == null || jSONObject.isEmpty()) {
            his.b("GoodsBtnGuide", "init | no data.");
            return;
        }
        this.f = this.e.getString("type");
        this.g = this.e.getLongValue(StEvent.SHOW_TIME);
        this.h = this.e.getLongValue("showDelay");
        this.i = this.e.getString("templateName");
        his.b("GoodsBtnGuide", "init | type=" + this.f + "  mShowTime=" + this.g + " mShowDelay=" + this.h + " mTemplateName=" + this.i + " data=" + this.e.getJSONObject("data"));
        if (StringUtils.isEmpty(this.f) || StringUtils.isEmpty(this.i) || this.g <= 0 || this.h < 0) {
            return;
        }
        this.j = true;
        this.b.postDelayed(new Runnable() { // from class: tb.krb.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    krb.a(krb.this, viewGroup);
                }
            }
        }, this.h);
    }

    private void a(ViewGroup viewGroup) {
        View findViewById;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a1860a7", new Object[]{this, viewGroup});
            return;
        }
        if (this.c == null) {
            this.c = f.m().createDX(this.f30244a, this.i);
        }
        if (this.c == null || !(viewGroup instanceof FrameLayout)) {
            q.b("GoodsBtnGuide", "showInternal | params empty.");
            return;
        }
        Context context = this.f30244a;
        if ((context instanceof Activity) && (findViewById = ((Activity) context).findViewById(R.id.taolive_bottombar_mute)) != null && findViewById.getVisibility() == 0) {
            q.b("GoodsBtnGuide", "showInternal | muteView show not show guide.");
            return;
        }
        q.b("GoodsBtnGuide", "showInternal ｜ type=" + this.f + "  mTemplateName=" + this.i);
        viewGroup.addView(this.c, new FrameLayout.LayoutParams(-2, -2));
        JSONObject jSONObject = this.e.getJSONObject("data");
        if (jSONObject != null) {
            jSONObject.put("isV2", (Object) "1");
        }
        JSONObject jSONObject2 = this.e.getJSONObject("utParams");
        if (jSONObject != null && jSONObject2 != null) {
            jSONObject.put("utParams", (Object) jSONObject2);
        }
        f.m().renderDX(this.c, jSONObject);
        this.c.addOnLayoutChangeListener(new AnonymousClass2(viewGroup));
        if (phg.a() != null) {
            phg.a().a("taobaoLive_goods_Show-btnGuide", hgp.a(jSONObject2 == null ? null : jSONObject2.getString("showParams")));
        }
        this.b.postDelayed(new Runnable() { // from class: tb.krb.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    krb.this.a();
                }
            }
        }, this.g);
    }

    @Override // tb.krc
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        q.a("GoodsBtnGuide", "dismiss | dismiss pop.");
        this.b.removeCallbacksAndMessages(null);
        a((View) this.c);
    }

    @Override // tb.krc
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        q.a("GoodsBtnGuide", "destroy.");
        this.j = false;
        this.b.removeCallbacksAndMessages(null);
        fb_();
    }

    private void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
        } else if (view == null) {
        } else {
            Animation loadAnimation = AnimationUtils.loadAnimation(this.f30244a, R.anim.taolive_goods_btn_guide_out_flexalocal);
            loadAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: tb.krb.4
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
                    krb.a(krb.this, false);
                    krb.c(krb.this).post(new Runnable() { // from class: tb.krb.4.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                krb.b(krb.this);
                            }
                        }
                    });
                }
            });
            view.clearAnimation();
            view.startAnimation(loadAnimation);
        }
    }

    private void fb_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c046c62a", new Object[]{this});
            return;
        }
        DXRootView dXRootView = this.c;
        if (dXRootView == null) {
            return;
        }
        View view = (View) dXRootView.getParent();
        if (view != null) {
            view.getLayoutParams().width = 0;
        }
        this.c.setVisibility(8);
        if (!(this.c.getParent() instanceof ViewGroup)) {
            return;
        }
        ((ViewGroup) this.c.getParent()).removeView(this.c);
        q.b("GoodsBtnGuild", "removeView:" + this.c);
    }
}
