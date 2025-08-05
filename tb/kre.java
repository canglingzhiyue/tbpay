package tb;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.j;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.live.plugin.atype.flexalocal.good.showcase.hot.AnimationUtils;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.model.common.LiveItem;
import com.taobao.taolive.sdk.utils.p;
import com.taobao.taolive.sdk.utils.u;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public class kre {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public View f30271a;
    public View b;
    public int d;
    private final c e;
    private final Context f;
    private final FrameLayout g;
    private final LottieAnimationView i;
    private final Handler j;
    private boolean m;
    private final AnimationUtils h = new AnimationUtils(this);
    public long c = 0;
    private Runnable k = new Runnable() { // from class: tb.kre.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                kre.a(kre.this).b();
            }
        }
    };

    static {
        kge.a(-703509011);
        kge.a(-379384768);
    }

    public static /* synthetic */ AnimationUtils a(kre kreVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AnimationUtils) ipChange.ipc$dispatch("5af2fbc0", new Object[]{kreVar}) : kreVar.h;
    }

    public static /* synthetic */ void a(kre kreVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc3da984", new Object[]{kreVar, str});
        } else {
            kreVar.a(str);
        }
    }

    public kre(c cVar, Context context, FrameLayout frameLayout, int i) {
        this.d = 0;
        this.e = cVar;
        this.f = context;
        this.g = frameLayout;
        this.g.removeAllViews();
        this.d = i;
        this.i = new LottieAnimationView(context);
        this.i.setId(R.id.animated_icon_flexallocal);
        this.i.setAnimationFromUrl(hir.H());
        this.i.setRepeatCount(-1);
        this.i.setFailureListener(new j<Throwable>() { // from class: tb.kre.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.airbnb.lottie.j
            public /* synthetic */ void onResult(Throwable th) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8251d27f", new Object[]{this, th});
                } else {
                    a(th);
                }
            }

            public void a(Throwable th) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("fb9ad88d", new Object[]{this, th});
                    return;
                }
                kre kreVar = kre.this;
                kre.a(kreVar, "lottie 下载失败：" + th.toString());
            }
        });
        this.j = new Handler(Looper.getMainLooper());
        this.m = hkk.T();
    }

    public View a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("195fbaaa", new Object[]{this});
        }
        if (this.f30271a == null) {
            this.f30271a = LayoutInflater.from(this.f).inflate(R.layout.layout_hot_atmosphere_low_flexalocal, (ViewGroup) null);
            TUrlImageView tUrlImageView = (TUrlImageView) this.f30271a.findViewById(R.id.iv_background);
            if (tUrlImageView != null) {
                tUrlImageView.setImageUrl(hir.J());
            }
            TUrlImageView tUrlImageView2 = (TUrlImageView) this.f30271a.findViewById(R.id.iv_title);
            if (tUrlImageView2 != null) {
                tUrlImageView2.setImageUrl(hir.K());
            }
        }
        if (this.i.getParent() instanceof ViewGroup) {
            ((ViewGroup) this.i.getParent()).removeView(this.i);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a(28), a(31));
        layoutParams.gravity = 83;
        ((FrameLayout) this.f30271a).addView(this.i, layoutParams);
        return this.f30271a;
    }

    public View b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("639153eb", new Object[]{this});
        }
        if (this.b == null) {
            this.b = LayoutInflater.from(this.f).inflate(R.layout.layout_hot_atmosphere_high_flexalocal, (ViewGroup) null);
            TUrlImageView tUrlImageView = (TUrlImageView) this.b.findViewById(R.id.iv_background);
            if (tUrlImageView != null) {
                tUrlImageView.setImageUrl(hir.L());
            }
            TUrlImageView tUrlImageView2 = (TUrlImageView) this.b.findViewById(R.id.iv_title);
            if (tUrlImageView2 != null) {
                tUrlImageView2.setImageUrl(hir.O());
            }
        }
        if (this.i.getParent() instanceof ViewGroup) {
            ((ViewGroup) this.i.getParent()).removeView(this.i);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a(80), a(jzk.INSTALL_PROVIDER));
        layoutParams.gravity = 85;
        layoutParams.bottomMargin = a(-9);
        ((FrameLayout) this.b).addView(this.i, 1, layoutParams);
        return this.b;
    }

    public int a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{this, new Integer(i)})).intValue() : hin.a(this.f, i);
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            pmd.a().m().a("HotAtmosphere", str);
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.d = 0;
        h();
    }

    public void a(long j, int i) {
        View view;
        View view2;
        View view3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c11c727", new Object[]{this, new Long(j), new Integer(i)});
        } else if (i <= this.d && j == this.c) {
        } else {
            if (i == 0) {
                c();
            } else if (u.aU() && p.a("enableBanShowSmallHotAtmosphere", false)) {
            } else {
                c cVar = this.e;
                if (cVar != null && cVar.C() != null && this.e.C().R() != null) {
                    this.e.C().R().a("hasShowSmallHotAtmosphere", "true");
                }
                if (this.d == 0 || ((((view = this.b) == null || view.getParent() == null) && ((view2 = this.f30271a) == null || view2.getParent() == null)) || j != this.c)) {
                    this.c = j;
                    this.d = i;
                    if (this.d > 100) {
                        e();
                        return;
                    } else {
                        d();
                        return;
                    }
                }
                int i2 = this.d;
                int i3 = i - i2;
                if ((i / 100) - (i2 / 100) > 0 || ((view3 = this.b) != null && view3.getParent() != null)) {
                    e();
                    if (i3 >= 20) {
                        this.d = i - 10;
                    }
                    c(i);
                    return;
                }
                if (i3 >= 20) {
                    this.d = i - 10;
                }
                b(i);
            }
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (this.d == 0) {
            c();
        } else {
            c(true);
            g();
            View a2 = a();
            if (a2.getParent() == null) {
                this.g.addView(a2);
            }
            try {
                ((LottieAnimationView) this.f30271a.findViewById(R.id.animated_icon_flexallocal)).playAnimation();
            } catch (Exception e) {
                a(e.getMessage());
            }
            j();
            a(false);
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (this.d == 0) {
            c();
        } else {
            c(true);
            this.j.removeCallbacks(this.k);
            f();
            View b = b();
            if (b.getParent() == null) {
                this.g.addView(b);
            }
            try {
                ((LottieAnimationView) this.b.findViewById(R.id.animated_icon_flexallocal)).playAnimation();
            } catch (Exception e) {
                a(e.getMessage());
            }
            k();
            this.h.a();
            a(true);
            this.j.postDelayed(this.k, TimeUnit.SECONDS.toMillis(6L));
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        View view = this.f30271a;
        if (view == null) {
            return;
        }
        try {
            ((LottieAnimationView) view.findViewById(R.id.animated_icon_flexallocal)).cancelAnimation();
            if (this.f30271a.getParent() == null) {
                return;
            }
            this.g.removeView(this.f30271a);
        } catch (Exception e) {
            a(e.getMessage());
        }
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        View view = this.b;
        if (view == null) {
            return;
        }
        try {
            ((LottieAnimationView) view.findViewById(R.id.animated_icon_flexallocal)).cancelAnimation();
            if (this.b.getParent() == null) {
                return;
            }
            this.g.removeView(this.b);
        } catch (Exception e) {
            a(e.getMessage());
        }
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        c(false);
        g();
        f();
        this.j.removeCallbacks(this.k);
        this.h.c();
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else {
            this.h.a(i);
        }
    }

    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
            return;
        }
        this.j.removeCallbacks(this.k);
        this.h.b(i);
        this.j.postDelayed(this.k, TimeUnit.SECONDS.toMillis(6L) + ((i - this.d) * 250));
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        c(false);
        this.i.cancelAnimation();
        if (this.i.getParent() instanceof ViewGroup) {
            ((ViewGroup) this.i.getParent()).removeView(this.i);
        }
        this.h.c();
        this.j.removeCallbacks(this.k);
        this.b = null;
        this.f30271a = null;
        this.g.removeAllViews();
    }

    private void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        FrameLayout frameLayout = (FrameLayout) ((LinearLayout) this.g.getParent()).findViewById(R.id.fl_show_case_card);
        if (frameLayout.getChildCount() <= 0 || !(frameLayout.getChildAt(0) instanceof DXRootView)) {
            return;
        }
        LiveItem liveItem = (LiveItem) pqj.a(((DXRootView) frameLayout.getChildAt(0)).getData().toJSONString(), LiveItem.class);
        if (liveItem.nativeConfigInfos == null) {
            return;
        }
        liveItem.nativeConfigInfos.put("onHotAtmosphere", (Object) String.valueOf(z));
        ddw.a().a("com.taobao.taolive.goods.showcase.update", liveItem, c.a(this.e));
    }

    private String l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("77b5ea0d", new Object[]{this});
        }
        int i = this.d;
        if (i <= 5000) {
            return String.valueOf(i);
        }
        if (i < 10000) {
            return (this.d / 1000) + "000+";
        } else if (i >= 100000) {
            return "10万+";
        } else {
            return (this.d / 10000) + "万+";
        }
    }

    public void j() {
        TextView textView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        View view = this.f30271a;
        if (view == null || (textView = (TextView) view.findViewById(R.id.tv_items)) == null) {
            return;
        }
        textView.setText(this.f.getString(R.string.taolive_project_show_case_atmosphere_prefix) + l());
    }

    public void k() {
        TextView textView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        View view = this.b;
        if (view == null || (textView = (TextView) view.findViewById(R.id.tv_items)) == null) {
            return;
        }
        textView.setText(this.f.getString(R.string.taolive_project_show_case_atmosphere_prefix) + l());
    }

    private void c(boolean z) {
        c cVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
        } else if (!this.m || (cVar = this.e) == null || cVar.C() == null || this.e.C().z() == null) {
        } else {
            this.e.C().z().a("showHotAtmosphere", Boolean.valueOf(z));
        }
    }

    public void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad401d78", new Object[]{this, new Integer(i)});
            return;
        }
        FrameLayout frameLayout = this.g;
        if (frameLayout == null) {
            return;
        }
        frameLayout.setVisibility(i);
    }
}
