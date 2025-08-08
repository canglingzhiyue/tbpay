package tb;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.framework.statisticsv2.model.StEvent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.live.plugin.proxy.f;
import com.taobao.taobao.R;
import com.taobao.taolive.room.utils.d;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.utils.q;

/* loaded from: classes5.dex */
public class hfn implements krc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f28592a;
    private Handler b = new Handler(Looper.getMainLooper());
    private DXRootView c;
    private View d;
    private JSONObject e;
    private String f;
    private long g;
    private long h;
    private String i;
    private boolean j;

    static {
        kge.a(949632115);
        kge.a(67378224);
    }

    public static /* synthetic */ void a(hfn hfnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebdd4da8", new Object[]{hfnVar});
        } else {
            hfnVar.d();
        }
    }

    public static /* synthetic */ void a(hfn hfnVar, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b04981e7", new Object[]{hfnVar, viewGroup});
        } else {
            hfnVar.a(viewGroup);
        }
    }

    public static /* synthetic */ boolean a(hfn hfnVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8fcd1a30", new Object[]{hfnVar, new Boolean(z)})).booleanValue();
        }
        hfnVar.j = z;
        return z;
    }

    public static /* synthetic */ Handler b(hfn hfnVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("81b62ffd", new Object[]{hfnVar}) : hfnVar.b;
    }

    public hfn(Context context, View view) {
        this.f28592a = context;
        this.d = view;
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
        this.b.postDelayed(new Runnable() { // from class: tb.hfn.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    hfn.a(hfn.this, viewGroup);
                }
            }
        }, this.h);
    }

    private void a(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a1860a7", new Object[]{this, viewGroup});
            return;
        }
        if (this.c == null) {
            this.c = f.m().createDX(this.f28592a, this.i);
        }
        if (this.c == null || !(viewGroup instanceof RelativeLayout)) {
            q.b("GoodsBtnGuide", "showInternal | params empty.");
            return;
        }
        q.b("GoodsBtnGuide", "showInternal ｜ type=" + this.f + "  mTemplateName=" + this.i);
        this.d.getLocationOnScreen(new int[2]);
        int a2 = d.a(this.f28592a, 2.0f) + this.d.getWidth();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(11);
        layoutParams.addRule(12);
        layoutParams.setMargins(0, 0, a2, 0);
        viewGroup.addView(this.c, layoutParams);
        JSONObject jSONObject = this.e.getJSONObject("data");
        JSONObject jSONObject2 = this.e.getJSONObject("utParams");
        if (jSONObject != null && jSONObject2 != null) {
            jSONObject.put("utParams", (Object) jSONObject2);
        }
        f.m().renderDX(this.c, jSONObject);
        this.c.startAnimation(AnimationUtils.loadAnimation(this.f28592a, R.anim.taolive_goods_btn_guide_in_flexalocal));
        if (phg.a() != null) {
            phg.a().a("taobaoLive_goods_Show-btnGuide", hgp.a(jSONObject2 == null ? null : jSONObject2.getString("showParams")));
        }
        this.b.postDelayed(new Runnable() { // from class: tb.hfn.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    hfn.this.a();
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
        d();
    }

    @Override // tb.krc
    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.j;
    }

    private void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
        } else if (view == null) {
        } else {
            Animation loadAnimation = AnimationUtils.loadAnimation(this.f28592a, R.anim.taolive_goods_btn_guide_out_flexalocal);
            loadAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: tb.hfn.1
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
                    hfn.a(hfn.this, false);
                    hfn.b(hfn.this).post(new Runnable() { // from class: tb.hfn.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                hfn.a(hfn.this);
                            }
                        }
                    });
                }
            });
            view.clearAnimation();
            view.startAnimation(loadAnimation);
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        DXRootView dXRootView = this.c;
        if (dXRootView == null) {
            return;
        }
        dXRootView.setVisibility(8);
        if (!(this.c.getParent() instanceof ViewGroup)) {
            return;
        }
        ((ViewGroup) this.c.getParent()).removeView(this.c);
        q.b("GoodsBtnGuild", "removeView:" + this.c);
    }
}
