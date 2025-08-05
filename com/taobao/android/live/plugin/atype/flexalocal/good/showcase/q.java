package com.taobao.android.live.plugin.atype.flexalocal.good.showcase;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.ItemActionQueryData;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.ItemActionQueryResponse;
import com.taobao.taobao.R;
import com.taobao.taolive.room.utils.ad;
import com.taobao.taolive.room.utils.aw;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.model.common.LiveItem;
import com.taobao.taolive.sdk.utils.u;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.HashMap;
import tb.dae;
import tb.ddw;
import tb.hin;
import tb.hir;
import tb.hit;
import tb.hix;
import tb.hkk;
import tb.kge;
import tb.pmd;
import tb.pnj;
import tb.pqj;
import tb.rhu;
import tb.tpm;
import tb.xkw;

/* loaded from: classes5.dex */
public class q implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "SabItemAtmosphereController";

    /* renamed from: a  reason: collision with root package name */
    private Context f13812a;
    private ViewGroup b;
    private View c;
    private LottieAnimationView d;
    private LottieAnimationView e;
    private TUrlImageView f;
    private TextView g;
    private TextView h;
    private ObjectAnimator i;
    private ObjectAnimator j;
    private boolean k;
    private LiveItem l;
    private int n;
    private com.taobao.alilive.aliliveframework.frame.a p;
    private boolean q;
    private int m = 2;
    private Runnable o = new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.good.showcase.q.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!q.a(q.this)) {
            } else {
                q.this.b();
            }
        }
    };

    static {
        kge.a(2099369398);
        kge.a(-1201612728);
    }

    public static /* synthetic */ int a(q qVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6d9f2832", new Object[]{qVar, new Integer(i)})).intValue();
        }
        qVar.m = i;
        return i;
    }

    public static /* synthetic */ void a(q qVar, LottieAnimationView lottieAnimationView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e7627ae", new Object[]{qVar, lottieAnimationView});
        } else {
            qVar.a(lottieAnimationView);
        }
    }

    public static /* synthetic */ void a(q qVar, LiveItem liveItem, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c65db055", new Object[]{qVar, liveItem, new Boolean(z)});
        } else {
            qVar.c(liveItem, z);
        }
    }

    public static /* synthetic */ boolean a(q qVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3d57b348", new Object[]{qVar})).booleanValue() : qVar.k;
    }

    public static /* synthetic */ boolean a(q qVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6d9f6814", new Object[]{qVar, new Boolean(z)})).booleanValue();
        }
        qVar.k = z;
        return z;
    }

    public static /* synthetic */ void b(q qVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("763813e3", new Object[]{qVar});
        } else {
            qVar.h();
        }
    }

    public static /* synthetic */ View c(q qVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("6667b044", new Object[]{qVar}) : qVar.c;
    }

    public static /* synthetic */ int d(q qVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e7f8d514", new Object[]{qVar})).intValue() : qVar.n;
    }

    public static /* synthetic */ LottieAnimationView e(q qVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LottieAnimationView) ipChange.ipc$dispatch("f0c78c22", new Object[]{qVar}) : qVar.d;
    }

    public static /* synthetic */ LottieAnimationView f(q qVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LottieAnimationView) ipChange.ipc$dispatch("b5f97d81", new Object[]{qVar}) : qVar.e;
    }

    public static /* synthetic */ Runnable g(q qVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Runnable) ipChange.ipc$dispatch("8dbba1d6", new Object[]{qVar}) : qVar.o;
    }

    public static /* synthetic */ void h(q qVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb7a579d", new Object[]{qVar});
        } else {
            qVar.j();
        }
    }

    public static /* synthetic */ Context i(q qVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("a9112334", new Object[]{qVar}) : qVar.f13812a;
    }

    public static void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{new Long(j)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("bizTopItemId", String.valueOf(j));
        hashMap.put(aw.PARAM_CATEGORY_ID, "9999");
        ddw.a().a(xkw.EVENT_SHOW_GOODSPACKAGE, hashMap, null);
    }

    public static boolean a(LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f1232887", new Object[]{liveItem})).booleanValue() : (liveItem == null || liveItem.itemExtData == null || !TextUtils.equals(liveItem.itemExtData.getString("smallCardItemType"), "itemZone")) ? false : true;
    }

    public static boolean b(LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("34ae4648", new Object[]{liveItem})).booleanValue() : (liveItem == null || liveItem.liveItemStatusData == null || !liveItem.liveItemStatusData.getBooleanValue("isHotItemPreheat")) ? false : true;
    }

    public q(Context context, com.taobao.alilive.aliliveframework.frame.a aVar, ViewGroup viewGroup) {
        this.f13812a = context;
        this.p = aVar;
        this.b = viewGroup;
        this.c = LayoutInflater.from(context).inflate(R.layout.taolive_sab_atmosphere_layout_flexallocal, viewGroup, false);
        this.e = (LottieAnimationView) this.c.findViewById(R.id.bg);
        this.d = (LottieAnimationView) this.c.findViewById(R.id.postmark);
        this.f = (TUrlImageView) this.c.findViewById(R.id.main_title_img);
        this.g = (TextView) this.c.findViewById(R.id.main_title_txt);
        this.h = (TextView) this.c.findViewById(R.id.sub_title);
        View findViewById = viewGroup.findViewById(R.id.taolive_bottom_bar);
        if (findViewById != null) {
            viewGroup.addView(this.c, viewGroup.indexOfChild(findViewById) - 1);
        } else {
            viewGroup.addView(this.c, 0);
        }
        e();
    }

    private void a(final LottieAnimationView lottieAnimationView, String str, int i, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccf04485", new Object[]{this, lottieAnimationView, str, new Integer(i), new Boolean(z)});
            return;
        }
        lottieAnimationView.setRepeatCount(i);
        try {
            com.airbnb.lottie.h.a(this.f13812a, str).a(new com.airbnb.lottie.j<com.airbnb.lottie.g>() { // from class: com.taobao.android.live.plugin.atype.flexalocal.good.showcase.q.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.airbnb.lottie.j
                public /* synthetic */ void onResult(com.airbnb.lottie.g gVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8251d27f", new Object[]{this, gVar});
                    } else {
                        a(gVar);
                    }
                }

                public void a(com.airbnb.lottie.g gVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("471c924d", new Object[]{this, gVar});
                    } else if (gVar == null) {
                        pmd.a().m().a(q.TAG, "loadLottieAnimation#onResult success, lottieComposition is null");
                    } else {
                        lottieAnimationView.setComposition(gVar);
                        if (z) {
                            q.b(q.this);
                        } else {
                            q.a(q.this, lottieAnimationView);
                        }
                    }
                }
            }).c(new com.airbnb.lottie.j<Throwable>() { // from class: com.taobao.android.live.plugin.atype.flexalocal.good.showcase.q.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.airbnb.lottie.j
                public /* synthetic */ void onResult(Throwable th) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8251d27f", new Object[]{this, th});
                    } else {
                        a(th);
                    }
                }

                public void a(Throwable th) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("fb9ad88d", new Object[]{this, th});
                        return;
                    }
                    q.a(q.this, 2);
                    pnj m = pmd.a().m();
                    m.a(q.TAG, "loadLottieAnimation#onResult fail, msg=" + th.getMessage());
                }
            });
        } catch (Throwable unused) {
            pmd.a().m().a(TAG, "loadLottieAnimation error");
        }
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        this.i = ObjectAnimator.ofFloat(this.c, "translationY", this.b.getMeasuredWidth(), 0.0f);
        this.i.setDuration(250L);
        this.i.addListener(new Animator.AnimatorListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.good.showcase.q.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("90a3af63", new Object[]{this, animator});
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4388ea84", new Object[]{this, animator});
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3a405721", new Object[]{this, animator});
                    return;
                }
                if (q.c(q.this) != null) {
                    q.c(q.this).setVisibility(0);
                }
                q.a(q.this, true);
                ddw.a().a("com.taobao.taolive.room.sab_atmosphere_show", Integer.valueOf(q.d(q.this)));
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                    return;
                }
                q qVar = q.this;
                q.a(qVar, q.e(qVar));
                q qVar2 = q.this;
                q.a(qVar2, q.f(qVar2));
                if (q.c(q.this) == null) {
                    return;
                }
                q.c(q.this).postDelayed(q.g(q.this), 10000L);
            }
        });
        this.j = ObjectAnimator.ofFloat(this.c, "translationY", 0.0f, this.b.getMeasuredWidth());
        this.j.setDuration(250L);
        this.j.addListener(new Animator.AnimatorListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.good.showcase.q.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("90a3af63", new Object[]{this, animator});
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4388ea84", new Object[]{this, animator});
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3a405721", new Object[]{this, animator});
                } else {
                    ddw.a().a("com.taobao.taolive.room.sab_atmosphere_dismiss");
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                } else {
                    q.h(q.this);
                }
            }
        });
    }

    public void a(LiveItem liveItem, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33429ab1", new Object[]{this, liveItem, new Boolean(z)});
        } else if (liveItem == null || this.p == null) {
        } else {
            LiveItem.SabItemAtmosphere sabItemAtmosphere = b(liveItem) ? liveItem.sabItemAtmospherePreHeat : liveItem.sabItemAtmosphere;
            if (sabItemAtmosphere == null) {
                return;
            }
            this.l = liveItem;
            if (u.aU() && com.taobao.taolive.sdk.utils.p.a("enableBanShowBigHotAtmosphere", false)) {
                return;
            }
            if (this.p.R() != null) {
                this.p.R().a("hasShowBigHotAtmosphere", "true");
            }
            if (!b(liveItem, z)) {
                this.p.F = true;
                return;
            }
            this.l = liveItem;
            d(liveItem);
            f();
            a(this.e, sabItemAtmosphere.atmosphereBgImg, -1, true);
            a(this.d, sabItemAtmosphere.posterMark, 0, true);
            if (!TextUtils.isEmpty(sabItemAtmosphere.benefitTitleImg)) {
                this.f.setImageUrl(sabItemAtmosphere.benefitTitleImg);
                this.f.setVisibility(0);
                this.g.setVisibility(8);
            } else if (!TextUtils.isEmpty(sabItemAtmosphere.benefitTitle)) {
                this.g.setText(sabItemAtmosphere.benefitTitle);
                this.g.setVisibility(0);
                this.f.setVisibility(8);
            }
            this.g.setText(sabItemAtmosphere.benefitTitle);
            this.h.setText(sabItemAtmosphere.subBenefitTitle);
            this.c.setOnClickListener(this);
        }
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        ViewGroup viewGroup = this.b;
        if (viewGroup == null || this.g == null || this.h == null) {
            return;
        }
        float width = viewGroup.getWidth() / 750.0f;
        this.n = (int) (450.0f * width);
        rhu.a(this.c, this.b.getWidth(), this.n);
        rhu.a(this.e, this.b.getWidth(), this.n);
        rhu.a(this.d, (int) (210.0f * width), (int) (260.0f * width), 0, 0, 0, (int) (58.0f * width));
        this.g.setTextSize(0, 46.0f * width);
        this.h.setTextSize(0, 26.0f * width);
        if (b(this.l)) {
            rhu.a(this.f, -2, (int) (64.0f * width));
        } else {
            rhu.a(this.f, -2, (int) (44.0f * width));
        }
        rhu.a(this.h, 0, (int) (width * 16.0f), 0, hin.a(this.f13812a, 66.0f));
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        ObjectAnimator objectAnimator = this.j;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            this.j.cancel();
        }
        ObjectAnimator objectAnimator2 = this.i;
        if (objectAnimator2 == null) {
            return;
        }
        objectAnimator2.start();
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        View view = this.c;
        if (view != null) {
            view.removeCallbacks(this.o);
        }
        ObjectAnimator objectAnimator = this.i;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            this.i.cancel();
        }
        ObjectAnimator objectAnimator2 = this.j;
        if (objectAnimator2 == null) {
            return;
        }
        objectAnimator2.start();
    }

    public void c(LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78396405", new Object[]{this, liveItem});
        } else if (liveItem == null) {
        } else {
            LiveItem.SabItemAtmosphere sabItemAtmosphere = b(liveItem) ? liveItem.sabItemAtmospherePreHeat : liveItem.sabItemAtmosphere;
            if (sabItemAtmosphere == null) {
                return;
            }
            this.l = liveItem;
            d(liveItem);
            f();
            a(this.d, sabItemAtmosphere.posterMark, 0, false);
            this.f.setImageUrl(sabItemAtmosphere.benefitTitleImg);
            this.h.setText(sabItemAtmosphere.subBenefitTitle);
            View view = this.c;
            if (view == null) {
                return;
            }
            view.removeCallbacks(this.o);
            this.c.postDelayed(this.o, 5000L);
        }
    }

    public void a(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b26fb7", new Object[]{this, strArr});
        } else if (strArr.length != 3) {
        } else {
            LiveItem liveItem = (LiveItem) pqj.a(strArr[0], LiveItem.class);
            String str = strArr[1];
            String str2 = strArr[2];
            if (liveItem == null) {
                return;
            }
            if (c() && !this.q) {
                c(liveItem);
            } else if (!TextUtils.equals(str, "SUCCESS") || !TextUtils.equals(str2, "showcase")) {
            } else {
                a(liveItem, true);
            }
        }
    }

    private void d(LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbc481c6", new Object[]{this, liveItem});
            return;
        }
        if (b(liveItem) && liveItem.personalityData != null && liveItem.personalityData.getIntValue("hotItemPreheatSubscribeStatus") == 1) {
            z = true;
        }
        this.q = z;
    }

    private boolean b(LiveItem liveItem, boolean z) {
        com.taobao.alilive.aliliveframework.frame.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("611b3514", new Object[]{this, liveItem, new Boolean(z)})).booleanValue();
        }
        if (!b(liveItem) || (aVar = this.p) == null || !(aVar.c() instanceof com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c)) {
            return g();
        }
        return !com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.a.a((com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c) this.p.c()) && liveItem.personalityData != null && (liveItem.personalityData.getIntValue("hotItemPreheatSubscribeStatus") == 0 || z);
    }

    private boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - ad.b("sab_atmosphere_limit_start_time") > hkk.as() * 60 * 1000) {
            ad.a("sab_atmosphere_limit_start_time", currentTimeMillis);
            ad.a("sab_atmosphere_show_frequency", 1);
            return true;
        }
        int b = ad.b("sab_atmosphere_show_frequency", 0);
        if (b >= hkk.Q()) {
            return false;
        }
        ad.a("sab_atmosphere_show_frequency", b + 1);
        return true;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.k;
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        this.m--;
        if (this.m != 0) {
            return;
        }
        a();
        this.m = 2;
    }

    private void a(LottieAnimationView lottieAnimationView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b292e0a", new Object[]{this, lottieAnimationView});
        } else if (lottieAnimationView == null) {
        } else {
            lottieAnimationView.cancelAnimation();
            lottieAnimationView.playAnimation();
        }
    }

    private void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        LottieAnimationView lottieAnimationView = this.e;
        if (lottieAnimationView != null) {
            lottieAnimationView.cancelAnimation();
        }
        LottieAnimationView lottieAnimationView2 = this.d;
        if (lottieAnimationView2 != null) {
            lottieAnimationView2.cancelAnimation();
        }
        ObjectAnimator objectAnimator = this.i;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        ObjectAnimator objectAnimator2 = this.j;
        if (objectAnimator2 != null) {
            objectAnimator2.cancel();
        }
        View view = this.c;
        if (view != null) {
            view.removeCallbacks(this.o);
            this.c.setVisibility(8);
        }
        this.l = null;
        this.q = false;
        this.k = false;
        this.m = 2;
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        j();
        this.p.F = false;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (hir.Z()) {
            c(this.l, false);
        } else {
            e(this.l);
        }
    }

    private void c(final LiveItem liveItem, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ef3cf6f", new Object[]{this, liveItem, new Boolean(z)});
        } else if (liveItem == null) {
        } else {
            LiveItem.SabItemAtmosphere sabItemAtmosphere = b(liveItem) ? liveItem.sabItemAtmospherePreHeat : liveItem.sabItemAtmosphere;
            if (sabItemAtmosphere == null || liveItem.extendVal == null) {
                return;
            }
            String str = sabItemAtmosphere.clickAction;
            try {
                JSONObject b = pqj.b(liveItem.extendVal.secKillInfo);
                JSONObject jSONObject = b != null ? b.getJSONObject("threshold") : null;
                if (jSONObject != null && jSONObject.getBooleanValue(aw.PARAM_VRPASS)) {
                    a(liveItem, str);
                } else if (jSONObject != null && z) {
                    hix.a(this.f13812a, jSONObject.getString("denyMsg"));
                } else if (this.p == null || !(this.p.c() instanceof com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c) || z) {
                } else {
                    new com.taobao.android.live.plugin.atype.flexalocal.good.business.i(new com.taobao.taolive.sdk.adapter.network.d() { // from class: com.taobao.android.live.plugin.atype.flexalocal.good.showcase.q.6
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.taobao.taolive.sdk.adapter.network.d
                        public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
                                return;
                            }
                            ItemActionQueryData mo1437getData = ((ItemActionQueryResponse) netBaseOutDo).mo1437getData();
                            liveItem.extendVal.business = mo1437getData.business;
                            liveItem.extendVal.secKillInfo = mo1437getData.secKillInfo;
                            q.a(q.this, liveItem, true);
                        }

                        @Override // com.taobao.taolive.sdk.adapter.network.d
                        public void onError(int i, NetResponse netResponse, Object obj) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
                            } else {
                                hix.a(q.i(q.this), dae.MSG_TOAST_DEFAULT);
                            }
                        }

                        @Override // com.taobao.taolive.sdk.adapter.network.d
                        public void onSystemError(int i, NetResponse netResponse, Object obj) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
                            } else {
                                onError(i, netResponse, obj);
                            }
                        }
                    }).a((com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c) this.p.c(), liveItem);
                }
            } catch (JSONException e) {
                com.taobao.taolive.sdk.utils.q.b(TAG, e.getMessage());
            }
        }
    }

    private void a(LiveItem liveItem, String str) {
        com.taobao.alilive.aliliveframework.frame.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e9e578d", new Object[]{this, liveItem, str});
        } else if (liveItem == null || str == null || (aVar = this.p) == null || !(aVar.c() instanceof com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c)) {
        } else {
            char c = 65535;
            switch (str.hashCode()) {
                case -1335224239:
                    if (str.equals("detail")) {
                        c = 3;
                        break;
                    }
                    break;
                case -1048872762:
                    if (str.equals("newBuy")) {
                        c = 0;
                        break;
                    }
                    break;
                case 514841930:
                    if (str.equals("subscribe")) {
                        c = 2;
                        break;
                    }
                    break;
                case 1394352404:
                    if (str.equals("goodsList")) {
                        c = 1;
                        break;
                    }
                    break;
            }
            if (c != 0) {
                if (c != 1) {
                    if (c == 2) {
                        if (hkk.au()) {
                            tpm.a((com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c) this.p.c(), liveItem, "sabAtmosphere");
                        }
                    } else if (c == 3 && com.taobao.android.live.plugin.atype.flexalocal.good.a.a().i() != null) {
                        com.taobao.android.live.plugin.atype.flexalocal.good.a.a().i().a(this.p, (Activity) this.f13812a, liveItem, "detail", new HashMap());
                    }
                } else if (hkk.ab()) {
                    a(liveItem.itemId);
                }
            } else if (com.taobao.android.live.plugin.atype.flexalocal.good.a.a().i() != null) {
                com.taobao.android.live.plugin.atype.flexalocal.good.a.a().i().a(this.p, this.f13812a, 10000, liveItem, new HashMap());
            }
            if (com.taobao.android.live.plugin.atype.flexalocal.good.a.a().j() == null) {
                return;
            }
            com.taobao.android.live.plugin.atype.flexalocal.good.a.a().j().a("dynamicEffect", hit.a((com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c) this.p.c(), liveItem));
        }
    }

    private void e(LiveItem liveItem) {
        com.taobao.alilive.aliliveframework.frame.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff4f9f87", new Object[]{this, liveItem});
        } else if (liveItem == null || (aVar = this.p) == null || !(aVar.c() instanceof com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c)) {
        } else {
            if (hkk.au() && b(liveItem)) {
                tpm.a((com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c) this.p.c(), liveItem, "sabAtmosphere");
            } else if (hkk.ab() && a(liveItem)) {
                a(liveItem.itemId);
            } else if (com.taobao.android.live.plugin.atype.flexalocal.good.a.a().i() != null) {
                com.taobao.android.live.plugin.atype.flexalocal.good.a.a().i().a(this.p, this.f13812a, 10000, liveItem, new HashMap());
            }
            if (com.taobao.android.live.plugin.atype.flexalocal.good.a.a().j() == null) {
                return;
            }
            com.taobao.android.live.plugin.atype.flexalocal.good.a.a().j().a("dynamicEffect", hit.a((com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c) this.p.c(), liveItem));
        }
    }
}
