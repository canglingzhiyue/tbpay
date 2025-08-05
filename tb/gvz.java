package tb;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.flexbox.layoutmanager.container.f;
import tb.ofz;

/* loaded from: classes5.dex */
public abstract class gvz<T extends ofz> extends oga<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int HAS_SET_STATUS_BAR = 2;

    /* renamed from: a  reason: collision with root package name */
    public Activity f28534a;
    public gvy b;
    public ViewPager c;
    private Handler e = new Handler(Looper.getMainLooper());
    private ViewPager.OnPageChangeListener f = new gvx() { // from class: tb.gvz.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.gvx, android.support.v4.view.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i)});
            } else if (i == 1) {
                gvz gvzVar = gvz.this;
                gvzVar.a(gvzVar.i());
            } else if (i != 0) {
            } else {
                gvz gvzVar2 = gvz.this;
                gvzVar2.b(gvzVar2.i());
            }
        }

        @Override // tb.gvx, android.support.v4.view.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
            } else {
                gvz.this.c(i);
            }
        }
    };
    private ViewPager.PageTransformer g = new ViewPager.PageTransformer() { // from class: tb.gvz.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.support.v4.view.ViewPager.PageTransformer
        public void transformPage(View view, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7b6a8f50", new Object[]{this, view, new Float(f)});
                return;
            }
            int width = view.getWidth();
            if (view == gvz.this.b.f28533a) {
                view.setTranslationX(width * (-f) * 0.8f);
            } else if (view != gvz.this.b.b) {
            } else {
                view.setTranslationX((1.0f - f) * width * 0.0f);
            }
        }
    };

    static {
        kge.a(-2108094147);
    }

    public static /* synthetic */ Object ipc$super(gvz gvzVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        }
    }

    public static /* synthetic */ void a(gvz gvzVar, Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5782811f", new Object[]{gvzVar, activity});
        } else {
            gvzVar.a(activity);
        }
    }

    @Override // tb.oga
    public boolean a(final Activity activity, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cabb048d", new Object[]{this, activity, new Integer(i)})).booleanValue();
        }
        T c = c();
        if (c == null) {
            Log.e("SecPageVPWrapper", "second page is null, wrap failed! ");
            return false;
        }
        this.f28534a = activity;
        if (activity instanceof ogb) {
            this.d = (ogb) activity;
        }
        try {
            this.c = b();
            this.c.setAdapter(this.b);
            this.c.setPageTransformer(false, this.g);
            this.c.addOnPageChangeListener(this.f);
            View view = (View) activity.findViewById(16908290).getParent();
            if (i != 2) {
                gwf.a(activity);
                view.setPadding(0, gwf.a((Context) activity), 0, 0);
                view.setBackgroundColor(i);
            }
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            viewGroup.removeView(view);
            viewGroup.addView(this.c, 0);
            this.b = new gvy(view, c.b(this.f28534a));
            this.c.setAdapter(this.b);
            this.e.postDelayed(new Runnable() { // from class: tb.gvz.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        gvz.a(gvz.this, activity);
                    }
                }
            }, oec.a((Object) OrangeConfig.getInstance().getConfig("weitao_switch", "transparent_statusbar_delay", "100"), 100L));
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // tb.oga
    public boolean a(f fVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("db5b67f", new Object[]{this, fVar, new Integer(i)})).booleanValue();
        }
        T c = c();
        if (c == null) {
            Log.e("SecPageVPWrapper", "second page is null, wrap failed! ");
            return false;
        }
        this.f28534a = fVar.getActivity();
        if (fVar instanceof ogb) {
            this.d = (ogb) fVar;
        }
        try {
            this.c = b();
            this.c.setAdapter(this.b);
            this.c.setPageTransformer(false, this.g);
            this.c.addOnPageChangeListener(this.f);
            this.b = new gvy(fVar.getContentView(), c.b(this.f28534a));
            this.c.setAdapter(this.b);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private void a(Activity activity) {
        View findViewById;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a25ba", new Object[]{this, activity});
        } else if (activity != null) {
            try {
                String[] split = OrangeConfig.getInstance().getConfig("weitao_switch", "tansparent_statusbar_model", "V1950A").split(",");
                if (split != null && split.length > 0) {
                    for (String str : split) {
                        if (Build.MODEL.equals(str)) {
                            break;
                        }
                    }
                }
                z = false;
                if (!z || (findViewById = activity.getWindow().getDecorView().findViewById(16908335)) == null) {
                    return;
                }
                findViewById.setAlpha(0.0f);
                findViewById.setBackgroundColor(0);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // tb.oga
    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue();
        }
        ViewPager viewPager = this.c;
        if (viewPager == null || viewPager.getCurrentItem() == 0) {
            return false;
        }
        this.c.setCurrentItem(0);
        return true;
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue();
        }
        ViewPager viewPager = this.c;
        if (viewPager == null || viewPager.getCurrentItem() == 1) {
            return false;
        }
        this.c.setCurrentItem(1);
        return true;
    }

    public ViewPager b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewPager) ipChange.ipc$dispatch("52a73e15", new Object[]{this}) : new ViewPager(this.f28534a);
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        String str = "onScrollStart. curr position:" + i;
    }

    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
            return;
        }
        String str = "onPageChange. curr position:" + i;
    }

    public int i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5dd2863", new Object[]{this})).intValue();
        }
        ViewPager viewPager = this.c;
        if (viewPager == null) {
            return 0;
        }
        return viewPager.getCurrentItem();
    }

    @Override // tb.oga
    public View j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("b51e1df3", new Object[]{this}) : this.c;
    }

    @Override // tb.oga
    public boolean k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[]{this})).booleanValue() : i() == 1;
    }
}
