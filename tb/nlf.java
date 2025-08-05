package tb;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.g;
import com.airbnb.lottie.h;
import com.airbnb.lottie.j;
import com.airbnb.lottie.o;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.recommendpop.ItemInfo;
import com.taobao.android.live.plugin.proxy.f;
import com.taobao.taolive.sdk.utils.b;
import tb.qmv;

/* loaded from: classes6.dex */
public abstract class nlf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Context f31547a;
    public hka b;
    public ViewGroup c;
    public JSONObject d;
    public String e;
    public String f;
    public String g;
    private FrameLayout h;
    private LottieAnimationView i;
    private o<g> j;
    private TextView k;
    private TextView l;
    public String s;

    static {
        kge.a(835569412);
    }

    public abstract ItemInfo a(qmv.a aVar);

    public abstract void a();

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        }
    }

    public abstract void a(String str, Object obj);

    public abstract void a(boolean z);

    public abstract View c();

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public String j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6aaa74cf", new Object[]{this}) : "item_right_popview_expousure";
    }

    public String k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f1302f6e", new Object[]{this}) : "item_right_popview_close_click";
    }

    public String l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("77b5ea0d", new Object[]{this}) : "item_right_popview_item_click";
    }

    public String m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fe3ba4ac", new Object[]{this}) : "item_right_popview_button_click";
    }

    public static /* synthetic */ TextView a(nlf nlfVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("5a24a3e4", new Object[]{nlfVar}) : nlfVar.k;
    }

    public static /* synthetic */ void a(nlf nlfVar, TextView textView, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7419b870", new Object[]{nlfVar, textView, new Long(j)});
        } else {
            nlfVar.a(textView, j);
        }
    }

    public static /* synthetic */ TextView b(nlf nlfVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("6dcc7765", new Object[]{nlfVar}) : nlfVar.l;
    }

    public static /* synthetic */ void c(nlf nlfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3715872", new Object[]{nlfVar});
        } else {
            nlfVar.n();
        }
    }

    public static /* synthetic */ o d(nlf nlfVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (o) ipChange.ipc$dispatch("dc5de710", new Object[]{nlfVar}) : nlfVar.j;
    }

    public static /* synthetic */ LottieAnimationView e(nlf nlfVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LottieAnimationView) ipChange.ipc$dispatch("5bf854d6", new Object[]{nlfVar}) : nlfVar.i;
    }

    public nlf(Context context, hka hkaVar, String str) {
        this.f31547a = context;
        this.b = hkaVar;
        this.s = str;
    }

    public boolean a(ViewGroup viewGroup, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("40dacb2d", new Object[]{this, viewGroup, jSONObject})).booleanValue();
        }
        this.c = viewGroup;
        this.d = jSONObject;
        this.e = this.d.getString("type");
        this.f = this.d.getString("code");
        this.g = this.d.getString("dxTemplateName");
        if (!"200".equals(this.f) && !"444".equals(this.f)) {
            return false;
        }
        a();
        JSONObject jSONObject2 = this.d.getJSONObject("displayStyleExtend");
        if (jSONObject2 != null) {
            a(jSONObject2);
        }
        return true;
    }

    private void a(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if (this.c == null || jSONObject == null) {
        } else {
            JSONObject jSONObject3 = jSONObject.getJSONObject("animation");
            if (!hkk.G() || jSONObject3 == null || (jSONObject2 = jSONObject3.getJSONObject("data")) == null || !jSONObject2.containsKey("lottieUrl")) {
                return;
            }
            this.h = new FrameLayout(this.f31547a);
            this.h.setBackgroundColor(-1090519040);
            this.c.addView(this.h, new ViewGroup.LayoutParams(-1, -1));
            this.i = new LottieAnimationView(this.f31547a);
            this.i.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 17;
            this.h.addView(this.i, layoutParams);
            int a2 = hin.a();
            this.k = new TextView(this.f31547a);
            this.k.setTextSize(28.0f);
            this.k.setTextColor(-1);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams2.gravity = 19;
            layoutParams2.setMargins(a(a2, 350), a(a2, 100), 0, 0);
            this.k.setText(jSONObject2.getString("title"));
            this.k.setGravity(17);
            this.k.setTypeface(null, 1);
            this.k.setVisibility(4);
            this.h.addView(this.k, layoutParams2);
            this.l = new TextView(this.f31547a);
            this.l.setTextSize(28.0f);
            this.l.setTextColor(-1);
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams3.gravity = 19;
            layoutParams3.setMargins(a(a2, 310), a(a2, 190), 0, 0);
            this.l.setText(jSONObject2.getString("subtitle"));
            this.l.setGravity(17);
            this.l.setTypeface(null, 1);
            this.l.setVisibility(4);
            this.h.addView(this.l, layoutParams3);
            this.i.addAnimatorListener(new AnimatorListenerAdapter() { // from class: tb.nlf.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                    int hashCode = str.hashCode();
                    if (hashCode == -2145066406) {
                        super.onAnimationEnd((Animator) objArr[0]);
                        return null;
                    } else if (hashCode != 977295137) {
                        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                    } else {
                        super.onAnimationStart((Animator) objArr[0]);
                        return null;
                    }
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3a405721", new Object[]{this, animator});
                        return;
                    }
                    super.onAnimationStart(animator);
                    nlf nlfVar = nlf.this;
                    nlf.a(nlfVar, nlf.a(nlfVar), 0L);
                    nlf nlfVar2 = nlf.this;
                    nlf.a(nlfVar2, nlf.b(nlfVar2), 40L);
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                        return;
                    }
                    super.onAnimationEnd(animator);
                    nlf.c(nlf.this);
                }
            });
            a(jSONObject2.getString("lottieUrl"));
        }
    }

    private int a(int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c1152bb", new Object[]{this, new Integer(i), new Integer(i2)})).intValue() : (i * i2) / 750;
    }

    private void a(final TextView textView, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c7b1368", new Object[]{this, textView, new Long(j)});
        } else if (textView == null) {
        } else {
            int a2 = hin.a();
            final int a3 = a(a2, 310);
            int i = a2 - a3;
            textView.setTranslationX(i);
            textView.setTranslationY((int) (Math.tan(3.0d) * i));
            textView.setRotation(-3.0f);
            textView.setVisibility(0);
            textView.animate().translationX(0.0f).translationY(0.0f).setStartDelay(j + 250).setDuration(250L).withEndAction(new Runnable() { // from class: tb.nlf.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    int measuredWidth = a3 + textView.getMeasuredWidth();
                    textView.animate().translationX(-measuredWidth).translationY(-((int) (Math.tan(3.0d) * measuredWidth))).setStartDelay(1300L).setDuration(150L).start();
                }
            }).start();
        }
    }

    private void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
            return;
        }
        FrameLayout frameLayout = this.h;
        if (frameLayout == null) {
            return;
        }
        frameLayout.setVisibility(8);
        this.h.removeAllViews();
        this.h = null;
        this.i = null;
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        Context context = this.f31547a;
        if (context != null && str != null) {
            try {
                this.j = h.a(context, str);
                this.j.a(new j<g>() { // from class: tb.nlf.4
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.airbnb.lottie.j
                    public /* synthetic */ void onResult(g gVar) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8251d27f", new Object[]{this, gVar});
                        } else {
                            a(gVar);
                        }
                    }

                    public void a(g gVar) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("471c924d", new Object[]{this, gVar});
                        } else if (gVar == null) {
                        } else {
                            if (nlf.e(nlf.this) != null) {
                                nlf.e(nlf.this).setComposition(gVar);
                                nlf.e(nlf.this).playAnimation();
                            }
                            if (nlf.d(nlf.this) == null) {
                                return;
                            }
                            nlf.d(nlf.this).b(this);
                        }
                    }
                }).c(new j<Throwable>() { // from class: tb.nlf.3
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
                        } else if (nlf.d(nlf.this) == null) {
                        } else {
                            nlf.d(nlf.this).d(this);
                        }
                    }
                });
            } catch (Throwable unused) {
            }
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            n();
        }
    }

    public int h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5cf10e2", new Object[]{this})).intValue();
        }
        hka hkaVar = this.b;
        if (hkaVar == null || hkaVar.w == null) {
            return b.a(this.f31547a, 60.0f);
        }
        View viewByName = this.b.w.getViewByName("tl-bottom-bar-native");
        Rect rect = new Rect();
        if (viewByName != null) {
            viewByName.getGlobalVisibleRect(rect);
        }
        if (rect.height() > 0) {
            return rect.height() + b.a(this.f31547a, 12.0f);
        }
        if (f.k().getBottomBarBottomDP() > 0) {
            return f.k().getBottomBarBottomDP();
        }
        return b.a(this.f31547a, 60.0f);
    }

    public JSONObject o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("83cd0896", new Object[]{this});
        }
        JSONObject jSONObject = this.d;
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.getJSONObject("logParams");
    }
}
