package tb;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.e;
import com.taobao.android.home.component.view.HImageView;
import com.taobao.homepage.business.getconfig.a;
import com.taobao.homepage.dinamic3.view.HStretchView;
import com.taobao.homepage.page.weexv2.WeexSecondFloorFragment;
import com.taobao.homepage.view.widgets.bgcontainer.c;
import com.taobao.tao.TBMainHost;
import com.taobao.tao.homepage.HomepageFragment;
import com.taobao.taobao.R;
import java.lang.ref.WeakReference;

/* loaded from: classes7.dex */
public class ohp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final View f32067a;
    private FrameLayout b;
    private FrameLayout c;
    private FrameLayout d;
    private final lbo e;
    private final Activity f;
    private WeexSecondFloorFragment g;
    private WeakReference<Bitmap> h;
    private WeakReference<Fragment> i;
    private HImageView j;
    private HStretchView k;
    private HImageView l;
    private double m;
    private double n;
    private double o;

    static {
        kge.a(-1019754760);
    }

    public ohp(View view, Activity activity, lbo lboVar) {
        this.f = activity;
        this.e = lboVar;
        this.f32067a = view;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            b();
        }
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d8eef2e", new Object[]{this, aVar});
        } else if (aVar == null || !aVar.d()) {
            e.e("StraightSecondFloorWidget", "show secondFloorConfig == null");
        } else if (this.g != null) {
            e.e("StraightSecondFloorWidget", "show mWeexFragment != null");
        } else if (!k()) {
            e.e("StraightSecondFloorWidget", "show mWeexFragment 初始化失败了");
        } else {
            this.g = b(aVar);
            a(this.g, this.b);
            a(aVar, this.c);
            this.j = e();
            this.d.addView(this.j, new ViewGroup.LayoutParams(-1, h()));
            this.l = g();
            this.c.addView(this.l, new ViewGroup.LayoutParams(-1, -1));
            this.k = f();
            this.d.addView(this.k, new ViewGroup.LayoutParams(-1, fpr.a(this.f, 30.0f)));
            this.c.setVisibility(0);
            this.d.setVisibility(0);
            i();
            e.e("StraightSecondFloorWidget", "show");
        }
    }

    public void b() {
        Fragment currentFragment;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.g == null || j()) {
            e.e("StraightSecondFloorWidget", "hide mWeexFragment == null 或者有容器没有初始化，mWeexFragment: " + this.g);
        } else {
            this.c.setVisibility(8);
            this.d.setVisibility(8);
            this.d.removeAllViews();
            this.c.removeView(this.l);
            WeakReference<Fragment> weakReference = this.i;
            if (weakReference != null && weakReference.get() != null) {
                currentFragment = this.i.get();
            } else {
                currentFragment = TBMainHost.a().getCurrentFragment();
            }
            if (!(currentFragment instanceof HomepageFragment)) {
                return;
            }
            FragmentTransaction beginTransaction = currentFragment.getChildFragmentManager().beginTransaction();
            beginTransaction.remove(this.g);
            beginTransaction.commitAllowingStateLoss();
            this.g = null;
            e.e("StraightSecondFloorWidget", "hide");
        }
    }

    public void a(int i, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb0bf6eb", new Object[]{this, new Integer(i), str, jSONObject});
        } else if (this.g == null) {
            e.e("StraightSecondFloorWidget", "mWeexFragment == null");
        } else {
            e.e("StraightSecondFloorWidget", "dispatchEvent,eventName: " + str);
            this.g.dispatchEvent(i, str, jSONObject);
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.h == null) {
        } else {
            e.e("StraightSecondFloorWidget", "clearSplashBitmap");
            this.h.clear();
        }
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else if (j()) {
            e.e("StraightSecondFloorWidget", "pullDistance 当前有容器没有初始化");
        } else {
            float b = fpr.b(this.f);
            a(i, b);
            b(i, b);
            ohv e = this.e.e();
            HImageView hImageView = this.j;
            if (hImageView != null && e != null) {
                hImageView.setTranslationY(e.i() + i);
            }
            HStretchView hStretchView = this.k;
            if (hStretchView == null || e == null) {
                return;
            }
            hStretchView.setTranslationY((i + e.i()) - fpr.a(this.f, 30.0f));
        }
    }

    public void d() {
        WeexSecondFloorFragment weexSecondFloorFragment;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (j()) {
            e.e("StraightSecondFloorWidget", "stateToSecondFloor 当前容器没有初始化");
        } else {
            HImageView hImageView = this.l;
            if (hImageView != null) {
                hImageView.setVisibility(8);
            }
            FrameLayout frameLayout = this.b;
            if (frameLayout != null) {
                frameLayout.setScaleX(1.0f);
                this.b.setScaleY(1.0f);
                this.b.setAlpha(1.0f);
                if (com.taobao.homepage.page.weexv2.a.f() && (weexSecondFloorFragment = this.g) != null) {
                    weexSecondFloorFragment.convertToSurfaceView();
                }
            }
            this.d.setVisibility(8);
            e.e("StraightSecondFloorWidget", "在二楼");
        }
    }

    private WeexSecondFloorFragment b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexSecondFloorFragment) ipChange.ipc$dispatch("bc943d39", new Object[]{this, aVar});
        }
        String a2 = ohs.a(aVar.c());
        WeexSecondFloorFragment newInstance = WeexSecondFloorFragment.newInstance(ohs.b(a2), a2, aVar.a(), aVar.b());
        newInstance.setNavigationAdapter(new com.taobao.weex.weexv2.page.a((AppCompatActivity) this.f));
        newInstance.setRenderListener(new oho(this.e));
        return newInstance;
    }

    private void a(WeexSecondFloorFragment weexSecondFloorFragment, FrameLayout frameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8abaf235", new Object[]{this, weexSecondFloorFragment, frameLayout});
            return;
        }
        Fragment currentFragment = TBMainHost.a().getCurrentFragment();
        if (!(currentFragment instanceof HomepageFragment)) {
            e.e("StraightSecondFloorWidget", "addWeexFragmentToContainer 当前不是首页");
            return;
        }
        WeakReference<Fragment> weakReference = this.i;
        if (weakReference == null || weakReference.get() == null) {
            this.i = new WeakReference<>(currentFragment);
        }
        FragmentTransaction beginTransaction = currentFragment.getChildFragmentManager().beginTransaction();
        beginTransaction.add(frameLayout.getId(), weexSecondFloorFragment);
        beginTransaction.commitAllowingStateLoss();
    }

    private HImageView e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HImageView) ipChange.ipc$dispatch("1f16c24a", new Object[]{this});
        }
        HImageView hImageView = new HImageView(this.f);
        hImageView.setScaleType(ImageView.ScaleType.FIT_XY);
        hImageView.setBackgroundColor(Color.parseColor("#F2F2F2"));
        WeakReference<Bitmap> weakReference = this.h;
        if (weakReference != null && weakReference.get() != null) {
            hImageView.setImageBitmap(this.h.get());
            return hImageView;
        }
        try {
            c d = this.e.d();
            ohv e = this.e.e();
            if (d != null && e != null) {
                int i = e.i();
                Bitmap f = d.f();
                Bitmap createBitmap = Bitmap.createBitmap(f, 0, i, f.getWidth(), f.getHeight() - i);
                this.h = new WeakReference<>(createBitmap);
                hImageView.setImageBitmap(createBitmap);
            }
        } catch (Exception e2) {
            e.e("StraightSecondFloorWidget", "createSecondFloorCoverImage：" + e2);
        }
        return hImageView;
    }

    private HStretchView f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HStretchView) ipChange.ipc$dispatch("f00716a9", new Object[]{this});
        }
        HStretchView hStretchView = new HStretchView(this.f);
        hStretchView.setScaleType(ImageView.ScaleType.FIT_XY);
        String a2 = ohs.a();
        if (!TextUtils.isEmpty(a2)) {
            hStretchView.setImageUrl(a2);
        }
        return hStretchView;
    }

    private HImageView g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HImageView) ipChange.ipc$dispatch("71bf6ccc", new Object[]{this});
        }
        HImageView hImageView = new HImageView(this.f);
        hImageView.setBackgroundColor(-1);
        hImageView.setScaleType(ImageView.ScaleType.FIT_XY);
        hImageView.setVisibility(0);
        String b = ohs.b();
        if (!TextUtils.isEmpty(b)) {
            hImageView.setImageUrl(b);
        }
        return hImageView;
    }

    private void a(int i, float f) {
        FrameLayout frameLayout;
        float f2;
        double d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c114785", new Object[]{this, new Integer(i), new Float(f)});
            return;
        }
        double d2 = f;
        float f3 = (float) (0.05d * d2);
        float f4 = i;
        if (f4 <= f3 || (frameLayout = this.b) == null) {
            return;
        }
        float f5 = (f4 - f3) / (f - f3);
        frameLayout.setAlpha(f5);
        float f6 = (float) ((f5 * 0.3d) + 0.7d);
        if (f6 > 0.95d) {
            this.b.setScaleX(1.0f);
            this.b.setScaleY(1.0f);
        } else {
            this.b.setScaleX(f6);
            this.b.setScaleY(f6);
        }
        if (d2 * 0.6d >= i) {
            this.b.setTranslationY((-((float) ((((float) (f2 / (d - f3))) * (-0.2d)) + 0.2d))) * f);
        } else {
            this.b.setTranslationY(0.0f);
        }
    }

    private void b(int i, float f) {
        float f2;
        double d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90f782c6", new Object[]{this, new Integer(i), new Float(f)});
        } else if (this.l == null) {
            e.e("StraightSecondFloorWidget", "mWeexShadeView == null");
        } else {
            mjx i2 = this.e.i();
            if (i2 == null) {
                e.e("StraightSecondFloorWidget", "pullDownUpManager == null");
                return;
            }
            float c = i2.c();
            if (i <= c) {
                double d2 = this.m;
                d = d2 - (((d2 - this.n) * i) / c);
            } else {
                double d3 = this.n;
                double d4 = d3 - (((d3 - this.o) * (f2 - c)) / (f - c));
                d = d4 < 0.05d ? 0.0d : d4;
            }
            this.l.setAlpha((float) d);
        }
    }

    private int h() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5cf10e2", new Object[]{this})).intValue();
        }
        if (this.e.e() != null) {
            i = this.e.e().i();
        }
        if (i == 0) {
            com.taobao.tao.linklog.a.a("componentRender", "secondFloorRenderFailed", "1.0", "Page_Home", null, null, "二楼渲染异常", "searchBarContainerHeight == 0");
        }
        return gbg.c(this.f) - i;
    }

    private void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        this.m = ohs.c();
        this.n = ohs.d();
        this.o = ohs.e();
    }

    private void a(a aVar, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba7eee4", new Object[]{this, aVar, view});
            return;
        }
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{aVar.e(), aVar.f()});
        if (Build.VERSION.SDK_INT < 16) {
            view.setBackgroundDrawable(gradientDrawable);
        } else {
            view.setBackground(gradientDrawable);
        }
    }

    private boolean j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[]{this})).booleanValue() : this.b == null || this.c == null || this.d == null;
    }

    private boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[]{this})).booleanValue();
        }
        if (!j()) {
            return true;
        }
        try {
            this.b = (FrameLayout) this.f32067a.findViewById(R.id.homepage_container_second_floor);
            this.c = (FrameLayout) this.f32067a.findViewById(R.id.layout_home_weex_container);
            this.d = (FrameLayout) this.f32067a.findViewById(R.id.layout_second_floor_cover);
            return true;
        } catch (Exception e) {
            e.e("StraightSecondFloorWidget", "初始化异常");
            ksr.a("secondFloor", e);
            return false;
        }
    }
}
