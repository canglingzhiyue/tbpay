package com.etao.feimagesearch.videosearch;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableString;
import mtopsdk.common.util.StringUtils;
import android.text.style.AbsoluteSizeSpan;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.security.bio.api.BioDetector;
import com.alipay.zoloz.hardware.camera.preview.utils.SPManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.VideoIrpActivity;
import com.etao.feimagesearch.util.s;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.Set;
import tb.cox;
import tb.coy;
import tb.cuc;
import tb.cud;
import tb.kge;

/* loaded from: classes4.dex */
public class f extends b<cud> implements com.taobao.android.weex_framework.g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final int f7048a;
    private static final int b;
    private static final int c;
    private static final int d;
    private static final int e;
    private TUrlImageView f;
    private TUrlImageView g;
    private VideoAnimateLayout h;
    private TextView i;
    private FrameLayout j;
    private View k;
    private e l;
    private com.taobao.android.weex_framework.p m;
    private cud n;
    private cud o;
    private boolean p;
    private int q;
    private int r;
    private Set<com.taobao.android.weex_framework.p> s;
    private VideoIrpActivity t;

    public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.weex_framework.g
    public void onDestroyed(MUSDKInstance mUSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32f7f995", new Object[]{this, mUSDKInstance});
        }
    }

    @Override // com.taobao.android.weex_framework.g
    public void onFatalException(com.taobao.android.weex_framework.p pVar, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcd71451", new Object[]{this, pVar, new Integer(i), str});
        }
    }

    @Override // com.taobao.android.weex_framework.g
    public void onForeground(com.taobao.android.weex_framework.p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fafc624", new Object[]{this, pVar});
        }
    }

    @Override // com.taobao.android.weex_framework.g
    public void onJSException(com.taobao.android.weex_framework.p pVar, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("831fc52e", new Object[]{this, pVar, new Integer(i), str});
        }
    }

    @Override // com.taobao.android.weex_framework.g
    public void onPrepareSuccess(com.taobao.android.weex_framework.p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9635d60b", new Object[]{this, pVar});
        }
    }

    @Override // com.taobao.android.weex_framework.g
    public void onRefreshFailed(com.taobao.android.weex_framework.p pVar, int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f63c5f14", new Object[]{this, pVar, new Integer(i), str, new Boolean(z)});
        }
    }

    @Override // com.taobao.android.weex_framework.g
    public void onRenderFailed(com.taobao.android.weex_framework.p pVar, int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4253181b", new Object[]{this, pVar, new Integer(i), str, new Boolean(z)});
        }
    }

    public static /* synthetic */ VideoIrpActivity a(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (VideoIrpActivity) ipChange.ipc$dispatch("bd3a093", new Object[]{fVar}) : fVar.t;
    }

    public static /* synthetic */ TUrlImageView b(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TUrlImageView) ipChange.ipc$dispatch("838dd20f", new Object[]{fVar}) : fVar.f;
    }

    static {
        kge.a(1176416175);
        kge.a(-311268728);
        f7048a = com.etao.feimagesearch.util.g.a(75.0f);
        b = com.etao.feimagesearch.util.g.a(91.0f);
        c = com.etao.feimagesearch.util.g.a(3.0f);
        d = f7048a;
        e = com.etao.feimagesearch.util.g.a(2.0f);
    }

    public f(View view, e eVar, Set<com.taobao.android.weex_framework.p> set, VideoIrpActivity videoIrpActivity) {
        super(view);
        this.t = videoIrpActivity;
        this.s = set;
        this.l = eVar;
        this.f = (TUrlImageView) view.findViewById(R.id.iv_detect_native);
        this.g = (TUrlImageView) view.findViewById(R.id.iv_detect_online);
        this.h = (VideoAnimateLayout) view;
        this.i = (TextView) view.findViewById(R.id.tv_price);
        this.k = view.findViewById(R.id.view_bg);
        this.k.setAlpha(0.9f);
        this.k.getLayoutParams().width = f7048a;
        this.k.getLayoutParams().height = d;
        this.k.setPivotY(0.0f);
        this.j = (FrameLayout) view.findViewById(R.id.fl_muise_container);
        if (eVar == null) {
            this.q = f7048a;
            this.r = d;
            return;
        }
        this.q = eVar.f7047a;
        this.r = eVar.b;
    }

    private void a(View view, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c25114a", new Object[]{this, view, new Integer(i), new Integer(i2)});
            return;
        }
        view.getLayoutParams().width = i;
        view.getLayoutParams().height = i2;
        view.requestLayout();
    }

    public void a(final cud cudVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e423e766", new Object[]{this, cudVar});
            return;
        }
        if (!cudVar.n) {
            cudVar.n = true;
            cox.c("VideoSearchDetect", "CardExpose", "index", String.valueOf(cudVar.o), BioDetector.EXT_KEY_BOX_ID, String.valueOf(cudVar.o), "boxType", "item", "item_id", cudVar.l, com.etao.feimagesearch.util.h.KEY_VIDEO_ID, String.valueOf(this.t.g()));
            cox.c("VideoSearchDetect", "CardAriseFrameIndex", com.etao.feimagesearch.util.h.KEY_VIDEO_ID, String.valueOf(this.t.g()), "time", String.valueOf(this.t.h()), SPManager.FPS_KEY, String.valueOf(this.t.d()));
        }
        if (!StringUtils.isEmpty(cudVar.k)) {
            if (this.l != null) {
                this.f.setImageUrl(cudVar.f);
                this.f.setVisibility(0);
                c(cudVar);
            } else {
                e(cudVar);
            }
        } else {
            TUrlImageView tUrlImageView = this.f;
            int i = this.q;
            int i2 = c;
            a(tUrlImageView, i - (i2 * 2), this.r - (i2 * 2));
            a(this.k, this.q, this.r);
            this.f.setImageUrl(cudVar.e);
            this.i.setVisibility(8);
            this.g.setVisibility(8);
        }
        if (!cudVar.f26536a) {
            cudVar.f26536a = true;
            this.h.startAnimation();
        }
        final int adapterPosition = getAdapterPosition();
        this.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.etao.feimagesearch.videosearch.f.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                cox.a("SingleObjectClickon", com.etao.feimagesearch.util.h.KEY_VIDEO_ID, String.valueOf(f.a(f.this).g()));
                coy.a("Page_VideoSearchDetect", "CardClick", BioDetector.EXT_KEY_BOX_ID, String.valueOf(cudVar.o), "boxType", "item", "item_id", cudVar.l, com.etao.feimagesearch.util.h.KEY_VIDEO_ID, String.valueOf(f.a(f.this).g()));
                com.etao.feimagesearch.f.a().d(new cuc(cudVar.f, cudVar.g, adapterPosition));
            }
        });
        cudVar.b = true;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (!(this.k.getBackground() instanceof GradientDrawable)) {
        } else {
            GradientDrawable gradientDrawable = (GradientDrawable) this.k.getBackground();
            if (z) {
                gradientDrawable.setStroke(e, Color.parseColor("#FF5F00"));
            } else {
                gradientDrawable.setStroke(e, Color.parseColor("#FFFFFF"));
            }
        }
    }

    private JSONObject b(cud cudVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f99c3d07", new Object[]{this, cudVar});
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("containerWidth", (Object) this.l.c);
        jSONObject2.put("containerHeight", (Object) this.l.d);
        jSONObject2.put("cropRect", (Object) cudVar.g.toShortString());
        jSONObject.put("model", (Object) cudVar.m);
        jSONObject.put("status", (Object) jSONObject2);
        return jSONObject;
    }

    private void c(cud cudVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c129f468", new Object[]{this, cudVar});
            return;
        }
        String str = this.l.e;
        if (this.p) {
            this.n = cudVar;
        }
        this.o = cudVar;
        this.p = true;
        com.taobao.android.weex_framework.p pVar = this.m;
        if (pVar == null) {
            this.m = com.taobao.android.weex_framework.q.a().a(this.itemView.getContext());
            s.a(this.m, str, str, b(cudVar), null);
            this.m.registerRenderListener(this);
            this.j.addView(this.m.getRenderRoot());
            this.s.add(this.m);
            return;
        }
        pVar.refresh(b(cudVar), null);
    }

    private void d(cud cudVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afacfae9", new Object[]{this, cudVar});
        } else if (cudVar.b && !cudVar.c) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f, View.ALPHA, 1.0f, 0.0f);
            ofFloat.setDuration(600L);
            ofFloat.addListener(new AnimatorListenerAdapter() { // from class: com.etao.feimagesearch.videosearch.f.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                        return;
                    }
                    f.b(f.this).setVisibility(8);
                    f.b(f.this).setAlpha(1.0f);
                }
            });
            ofFloat.start();
            cudVar.c = true;
        } else {
            this.f.setVisibility(8);
        }
    }

    private void e(cud cudVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e30016a", new Object[]{this, cudVar});
            return;
        }
        if (com.etao.feimagesearch.config.b.p()) {
            this.g.setImageUrl(cudVar.e);
        } else {
            this.g.setImageUrl(cudVar.k);
        }
        this.g.setVisibility(0);
        TUrlImageView tUrlImageView = this.g;
        int i = this.q;
        int i2 = c;
        a(tUrlImageView, i - (i2 * 2), this.r - (i2 * 2));
        String str = cudVar.j;
        int indexOf = str.indexOf(".");
        SpannableString spannableString = new SpannableString("¥" + str);
        spannableString.setSpan(new AbsoluteSizeSpan(10, true), 0, 1, 33);
        if (indexOf >= 0) {
            spannableString.setSpan(new AbsoluteSizeSpan(9, true), indexOf + 1, spannableString.length(), 33);
        }
        this.i.setText(spannableString);
        this.i.setVisibility(0);
        this.k.getLayoutParams().height = b;
        if (!cudVar.b || cudVar.c) {
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.g, View.ALPHA, 0.0f, 1.0f);
        ofFloat.setDuration(600L);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.i, View.ALPHA, 0.0f, 1.0f);
        ofFloat2.setDuration(600L);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f, View.ALPHA, 1.0f, 0.0f);
        ofFloat3.setDuration(600L);
        ofFloat3.addListener(new AnimatorListenerAdapter() { // from class: com.etao.feimagesearch.videosearch.f.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                    return;
                }
                f.b(f.this).setVisibility(8);
                f.b(f.this).setAlpha(1.0f);
            }
        });
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.k, View.SCALE_Y, (d * 1.0f) / b, 1.0f);
        ofFloat4.setDuration(300L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat3, ofFloat2, ofFloat4);
        animatorSet.start();
        cudVar.c = true;
    }

    @Override // com.taobao.android.weex_framework.g
    public void onRenderSuccess(com.taobao.android.weex_framework.p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fdf238", new Object[]{this, pVar});
            return;
        }
        cud cudVar = this.n;
        if (cudVar != null) {
            this.p = false;
            c(cudVar);
            this.n = null;
            return;
        }
        d(this.o);
    }

    @Override // com.taobao.android.weex_framework.g
    public void onRefreshSuccess(com.taobao.android.weex_framework.p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cd7e3df", new Object[]{this, pVar});
            return;
        }
        cud cudVar = this.n;
        if (cudVar != null) {
            this.p = false;
            c(cudVar);
            this.n = null;
            return;
        }
        d(this.o);
    }
}
