package tb;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.support.v4.util.LruCache;
import android.support.v4.util.Pools;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.facebook.yoga.YogaNode;
import com.taobao.monitor.procedure.v;
import com.taobao.tao.flexbox.layoutmanager.component.BrowserViewPager;
import com.taobao.tao.flexbox.layoutmanager.core.Component;
import com.taobao.tao.flexbox.layoutmanager.core.ab;
import com.taobao.tao.flexbox.layoutmanager.drawable.b;
import com.taobao.tao.flexbox.layoutmanager.drawable.c;
import com.taobao.tao.flexbox.layoutmanager.drawable.d;
import com.taobao.tao.flexbox.layoutmanager.uikit.view.TIconFontTextView;
import com.taobao.tao.flexbox.layoutmanager.view.FlatViewGroup;
import com.taobao.tao.flexbox.layoutmanager.view.ObservableHorizontalScrollView;
import com.taobao.tao.flexbox.layoutmanager.view.RoundedCornerLayout;
import com.taobao.tao.flexbox.layoutmanager.view.StaticLayoutView;
import com.taobao.tao.flexbox.layoutmanager.view.TNodeImageView;
import com.taobao.taobao.R;
import com.taobao.uikit.utils.IFeatureList;
import java.lang.ref.SoftReference;
import java.util.HashMap;

/* loaded from: classes8.dex */
public class ogu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Pools.SynchronizedPool<YogaNode> f32046a;
    private static Pools.SimplePool<d> b;
    private static Pools.SimplePool<b.a> c;
    private static Pools.SimplePool<GradientDrawable> d;
    private static Pools.SimplePool<c> e;
    private static HashMap<Context, Pools.SimplePool<TNodeImageView>> f;
    private static HashMap<Context, Pools.SimplePool<ObservableHorizontalScrollView>> g;
    private static HashMap<Context, Pools.SimplePool<TextView>> h;
    private static HashMap<Context, Pools.SimplePool<StaticLayoutView>> i;
    private static HashMap<Context, Pools.SimplePool<TIconFontTextView>> j;
    private static HashMap<Context, Pools.SimplePool<FlatViewGroup>> k;
    private static HashMap<Context, Pools.SimplePool<RoundedCornerLayout>> l;
    private static HashMap<Context, Pools.SimplePool<BrowserViewPager>> m;
    private static LruCache<String, Bitmap> n;
    private static LruCache<String, SoftReference<Drawable>> o;
    private static HashMap<String, Component.b> p;
    private static LruCache<String, String> q;

    static {
        kge.a(-609706432);
        f32046a = new Pools.SynchronizedPool<>(256);
        b = new Pools.SynchronizedPool(64);
        c = new Pools.SynchronizedPool(64);
        d = new Pools.SynchronizedPool(16);
        e = new Pools.SynchronizedPool(16);
        f = new HashMap<>();
        g = new HashMap<>();
        h = new HashMap<>();
        i = new HashMap<>();
        j = new HashMap<>();
        k = new HashMap<>();
        l = new HashMap<>();
        m = new HashMap<>();
        n = new LruCache<>(5);
        o = new LruCache<>(5);
        p = new HashMap<>();
        q = new LruCache<>(20);
    }

    public static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2});
        }
        if (StringUtils.isEmpty(str) || StringUtils.isEmpty(str2)) {
            return null;
        }
        LruCache<String, String> lruCache = q;
        return lruCache.get(str + str2);
    }

    public static void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{str, str2, str3});
        } else if (StringUtils.isEmpty(str) || StringUtils.isEmpty(str2) || StringUtils.isEmpty(str3)) {
        } else {
            LruCache<String, String> lruCache = q;
            lruCache.put(str + str2, str3);
        }
    }

    public static YogaNode a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (YogaNode) ipChange.ipc$dispatch("ab85d5a7", new Object[0]);
        }
        YogaNode acquire = f32046a.acquire();
        if (acquire != null) {
            return acquire;
        }
        try {
            return YogaNode.create();
        } catch (UnsatisfiedLinkError e2) {
            ogg.b("acquireYogaNode " + e2.getMessage());
            return acquire;
        }
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
            return;
        }
        try {
            f32046a.release(YogaNode.create());
        } catch (Throwable th) {
            ogg.b(th.getMessage());
        }
    }

    public static void a(YogaNode yogaNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e690e8a1", new Object[]{yogaNode});
        } else if (yogaNode != null) {
            if (yogaNode.mo644getParent() != null) {
                yogaNode.mo644getParent().mo645removeChildAt(yogaNode.mo644getParent().indexOf(yogaNode));
            }
            for (int childCount = yogaNode.getChildCount() - 1; childCount >= 0; childCount--) {
                yogaNode.mo645removeChildAt(childCount);
            }
            yogaNode.reset();
            try {
                f32046a.release(yogaNode);
            } catch (Throwable unused) {
            }
        }
    }

    public static TNodeImageView a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TNodeImageView) ipChange.ipc$dispatch("2735fe7a", new Object[]{context});
        }
        TNodeImageView tNodeImageView = null;
        Pools.SimplePool<TNodeImageView> simplePool = f.get(context);
        if (simplePool != null) {
            tNodeImageView = simplePool.acquire();
        }
        if (tNodeImageView == null) {
            tNodeImageView = new TNodeImageView(context);
        }
        tNodeImageView.setInCachePool(false);
        return tNodeImageView;
    }

    public static void a(TNodeImageView tNodeImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd507eec", new Object[]{tNodeImageView});
        } else if (tNodeImageView == null) {
        } else {
            a((View) tNodeImageView);
            if (Build.VERSION.SDK_INT >= 21) {
                tNodeImageView.setElevation(0.0f);
            }
            Context context = tNodeImageView.getContext();
            if ((context instanceof Activity) && ((Activity) context).isFinishing()) {
                return;
            }
            Pools.SimplePool<TNodeImageView> simplePool = f.get(context);
            if (simplePool == null) {
                simplePool = new Pools.SynchronizedPool<>(32);
                f.put(tNodeImageView.getContext(), simplePool);
            }
            simplePool.release(tNodeImageView);
            tNodeImageView.setInCachePool(true);
        }
    }

    public static void a(TextView textView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a92d3edc", new Object[]{textView});
        } else if (textView == null) {
        } else {
            a((View) textView);
            Context context = textView.getContext();
            if ((context instanceof Activity) && ((Activity) context).isFinishing()) {
                return;
            }
            Pools.SimplePool<TextView> simplePool = h.get(context);
            if (simplePool == null) {
                simplePool = new Pools.SynchronizedPool<>(64);
                h.put(textView.getContext(), simplePool);
            }
            simplePool.release(textView);
        }
    }

    public static BrowserViewPager b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BrowserViewPager) ipChange.ipc$dispatch("93e71d7f", new Object[]{context});
        }
        BrowserViewPager browserViewPager = null;
        Pools.SimplePool<BrowserViewPager> simplePool = m.get(context);
        if (simplePool != null) {
            browserViewPager = simplePool.acquire();
        }
        if (browserViewPager != null) {
            return browserViewPager;
        }
        BrowserViewPager browserViewPager2 = new BrowserViewPager(context);
        browserViewPager2.setId(oec.g());
        return browserViewPager2;
    }

    public static void a(BrowserViewPager browserViewPager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("642c91e8", new Object[]{browserViewPager});
        } else if (browserViewPager == null) {
        } else {
            a((View) browserViewPager);
            Context context = browserViewPager.getContext();
            if ((context instanceof Activity) && ((Activity) context).isFinishing()) {
                return;
            }
            Pools.SimplePool<BrowserViewPager> simplePool = m.get(context);
            if (simplePool == null) {
                simplePool = new Pools.SynchronizedPool<>(3);
                m.put(browserViewPager.getContext(), simplePool);
            }
            simplePool.release(browserViewPager);
        }
    }

    public static ObservableHorizontalScrollView c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ObservableHorizontalScrollView) ipChange.ipc$dispatch("dbcb934d", new Object[]{context});
        }
        ObservableHorizontalScrollView observableHorizontalScrollView = null;
        Pools.SimplePool<ObservableHorizontalScrollView> simplePool = g.get(context);
        if (simplePool != null) {
            observableHorizontalScrollView = simplePool.acquire();
        }
        return observableHorizontalScrollView == null ? new ObservableHorizontalScrollView(context) : observableHorizontalScrollView;
    }

    public static void a(ObservableHorizontalScrollView observableHorizontalScrollView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcbefafd", new Object[]{observableHorizontalScrollView});
        } else if (observableHorizontalScrollView == null) {
        } else {
            if (oeb.ci()) {
                observableHorizontalScrollView.clear();
                observableHorizontalScrollView.scrollTo(0, 0);
            }
            a((View) observableHorizontalScrollView);
            Context context = observableHorizontalScrollView.getContext();
            if ((context instanceof Activity) && ((Activity) context).isFinishing()) {
                return;
            }
            Pools.SimplePool<ObservableHorizontalScrollView> simplePool = g.get(context);
            if (simplePool == null) {
                simplePool = new Pools.SynchronizedPool<>(16);
                g.put(observableHorizontalScrollView.getContext(), simplePool);
            }
            simplePool.release(observableHorizontalScrollView);
        }
    }

    public static StaticLayoutView d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StaticLayoutView) ipChange.ipc$dispatch("91a6464a", new Object[]{context});
        }
        StaticLayoutView staticLayoutView = null;
        Pools.SimplePool<StaticLayoutView> simplePool = i.get(context);
        if (simplePool != null) {
            staticLayoutView = simplePool.acquire();
        }
        return staticLayoutView == null ? new StaticLayoutView(context) : staticLayoutView;
    }

    public static void a(StaticLayoutView staticLayoutView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b308a339", new Object[]{staticLayoutView});
        } else if (staticLayoutView == null) {
        } else {
            a((View) staticLayoutView);
            staticLayoutView.clear();
            Context context = staticLayoutView.getContext();
            if ((context instanceof Activity) && ((Activity) context).isFinishing()) {
                return;
            }
            Pools.SimplePool<StaticLayoutView> simplePool = i.get(context);
            if (simplePool == null) {
                simplePool = new Pools.SynchronizedPool<>(64);
                i.put(staticLayoutView.getContext(), simplePool);
            }
            simplePool.release(staticLayoutView);
        }
    }

    public static FlatViewGroup e(Context context) {
        Pools.SimplePool<FlatViewGroup> simplePool;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FlatViewGroup) ipChange.ipc$dispatch("da7c3ead", new Object[]{context});
        }
        FlatViewGroup flatViewGroup = null;
        if (oeb.V() && (simplePool = k.get(context)) != null) {
            flatViewGroup = simplePool.acquire();
        }
        return flatViewGroup == null ? new FlatViewGroup(context) : flatViewGroup;
    }

    public static void a(View view) {
        Drawable foreground;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{view});
            return;
        }
        Drawable background = view.getBackground();
        if (background != null) {
            a(background);
            view.setBackgroundDrawable(null);
        }
        if (Build.VERSION.SDK_INT >= 23 || (view instanceof TNodeImageView)) {
            if (view instanceof TNodeImageView) {
                TNodeImageView tNodeImageView = (TNodeImageView) view;
                Drawable foreground2 = tNodeImageView.getForeground();
                if (foreground2 != null) {
                    a(foreground2);
                    tNodeImageView.setForeground(null);
                }
            } else if (Build.VERSION.SDK_INT >= 23 && (foreground = view.getForeground()) != null) {
                a(foreground);
                view.setForeground(null);
            }
        }
        if (view instanceof ImageView) {
            ImageView imageView = (ImageView) view;
            a(imageView.getDrawable());
            imageView.setImageDrawable(null);
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
        view.setOnClickListener(null);
        view.setClickable(false);
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        if (view instanceof IFeatureList) {
            ((IFeatureList) view).clearFeatures();
        }
        view.clearAnimation();
        view.setTag(null);
        view.setTag(R.id.layout_manager_pending_animations, null);
        view.setTag(R.id.layout_manager_transition_card_view, null);
        view.setTag(R.id.layout_manager_tnode, null);
        view.setTag(v.APM_VIEW_TOKEN, null);
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        view.setOnTouchListener(null);
        if (Build.VERSION.SDK_INT >= 28) {
            view.resetPivot();
        } else {
            view.setPivotX(0.0f);
            view.setPivotY(0.0f);
        }
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        if (Build.VERSION.SDK_INT >= 21) {
            view.setTranslationZ(0.0f);
            view.setZ(0.0f);
        }
        view.setRotation(0.0f);
        view.setRotationX(0.0f);
        view.setRotationY(0.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setAlpha(1.0f);
        if (Build.VERSION.SDK_INT >= 21) {
            view.setTransitionName(null);
        }
        view.setVisibility(0);
        if (!(view instanceof ViewGroup)) {
            return;
        }
        ((ViewGroup) view).setClipChildren(true);
    }

    public static void a(FlatViewGroup flatViewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("456b76f9", new Object[]{flatViewGroup});
        } else if (flatViewGroup == null) {
        } else {
            a((View) flatViewGroup);
            flatViewGroup.clear();
            Context context = flatViewGroup.getContext();
            if (((context instanceof Activity) && ((Activity) context).isFinishing()) || !oeb.V()) {
                return;
            }
            Pools.SimplePool<FlatViewGroup> simplePool = k.get(context);
            if (simplePool == null) {
                simplePool = new Pools.SynchronizedPool<>(128);
                k.put(flatViewGroup.getContext(), simplePool);
            }
            simplePool.release(flatViewGroup);
        }
    }

    public static RoundedCornerLayout f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RoundedCornerLayout) ipChange.ipc$dispatch("df448761", new Object[]{context});
        }
        RoundedCornerLayout roundedCornerLayout = null;
        Pools.SimplePool<RoundedCornerLayout> simplePool = l.get(context);
        if (simplePool != null) {
            roundedCornerLayout = simplePool.acquire();
        }
        return roundedCornerLayout == null ? new RoundedCornerLayout(context) : roundedCornerLayout;
    }

    public static void a(RoundedCornerLayout roundedCornerLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60e543ce", new Object[]{roundedCornerLayout});
        } else if (roundedCornerLayout == null) {
        } else {
            a((View) roundedCornerLayout);
            roundedCornerLayout.clear();
            Context context = roundedCornerLayout.getContext();
            if ((context instanceof Activity) && ((Activity) context).isFinishing()) {
                return;
            }
            Pools.SimplePool<RoundedCornerLayout> simplePool = l.get(context);
            if (simplePool == null) {
                simplePool = new Pools.SynchronizedPool<>(8);
                l.put(roundedCornerLayout.getContext(), simplePool);
            }
            simplePool.release(roundedCornerLayout);
        }
    }

    public static void a(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd037b8c", new Object[]{drawable});
            return;
        }
        try {
            if (drawable instanceof b.a) {
                ((b.a) drawable).setColor(0);
                c.release((b.a) drawable);
            } else if (drawable instanceof d) {
                ((d) drawable).a();
                b.release((d) drawable);
            } else if (drawable instanceof oee) {
                ((oee) drawable).b();
            } else if (drawable instanceof GradientDrawable) {
                if (Build.VERSION.SDK_INT < 16) {
                }
            } else if (!(drawable instanceof c)) {
            } else {
                ((c) drawable).d();
                ((c) drawable).b(true);
                e.release((c) drawable);
            }
        } catch (Throwable th) {
            ogg.b("releaseDrawable:" + th.getMessage());
        }
    }

    public static d c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("d0e11ddf", new Object[0]);
        }
        d acquire = b.acquire();
        return acquire == null ? new d() : acquire;
    }

    public static ColorDrawable a(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ColorDrawable) ipChange.ipc$dispatch("543c9b98", new Object[]{new Integer(i2)});
        }
        b.a acquire = c.acquire();
        if (acquire == null) {
            acquire = new b.a();
        }
        acquire.setColor(i2);
        return acquire;
    }

    public static GradientDrawable d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (GradientDrawable) ipChange.ipc$dispatch("e8ac839f", new Object[0]) : new b.C0848b();
    }

    public static c a(Resources resources) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("34687c4f", new Object[]{resources});
        }
        c acquire = e.acquire();
        if (acquire == null) {
            acquire = new c(resources);
        }
        acquire.b(false);
        return acquire;
    }

    public static Bitmap a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Bitmap) ipChange.ipc$dispatch("30dda510", new Object[]{str}) : n.get(str);
    }

    public static Drawable a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("11b28198", new Object[]{str, new Boolean(z)});
        }
        if (str == null) {
            return null;
        }
        if (z) {
            SoftReference<Drawable> remove = o.remove(str);
            if (remove != null) {
                return remove.get();
            }
        } else {
            SoftReference<Drawable> softReference = o.get(str);
            if (softReference != null) {
                return softReference.get();
            }
        }
        return null;
    }

    public static void a(String str, View view, Drawable drawable) {
        BitmapDrawable bitmapDrawable;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d6dbe84", new Object[]{str, view, drawable});
        } else if (str == null) {
        } else {
            if ((view instanceof ImageView) && ((ImageView) view).getScaleType() == ImageView.ScaleType.CENTER_CROP && (drawable instanceof BitmapDrawable)) {
                int width = view.getWidth();
                int height = view.getHeight();
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
                float f2 = (width * 1.0f) / height;
                float f3 = intrinsicWidth;
                float f4 = intrinsicHeight;
                float f5 = (1.0f * f3) / f4;
                if (width >= ohd.b(view.getContext()) / 2) {
                    z = false;
                }
                if (!z) {
                    try {
                        if (f2 > f5) {
                            int i2 = (int) ((f4 - (f3 / f2)) / 2.0f);
                            bitmapDrawable = new BitmapDrawable(view.getResources(), Bitmap.createBitmap(bitmap, 0, i2, intrinsicWidth, intrinsicHeight - (i2 * 2)));
                        } else if (f2 < f5) {
                            int i3 = (int) ((f3 - (f4 * f2)) / 2.0f);
                            bitmapDrawable = new BitmapDrawable(view.getResources(), Bitmap.createBitmap(bitmap, i3, 0, intrinsicWidth - (i3 * 2), intrinsicHeight));
                        }
                        drawable = bitmapDrawable;
                    } catch (Throwable unused) {
                    }
                }
            }
            o.put(str, new SoftReference<>(drawable));
        }
    }

    public static void a(String str, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c58b8a3c", new Object[]{str, bitmap});
        } else {
            n.put(str, bitmap);
        }
    }

    public static Component.b b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Component.b) ipChange.ipc$dispatch("bf114c30", new Object[]{str}) : p.remove(str);
    }

    public static void a(String str, Component.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f2036db", new Object[]{str, bVar});
        } else {
            p.put(str, bVar);
        }
    }

    public static void g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2296a1a", new Object[]{context});
            return;
        }
        f.remove(context);
        h.remove(context);
        i.remove(context);
        j.remove(context);
        k.remove(context);
        l.remove(context);
        g.remove(context);
        m.remove(context);
        f.remove(ab.f20303a);
        h.remove(ab.f20303a);
        i.remove(ab.f20303a);
        j.remove(ab.f20303a);
        k.remove(ab.f20303a);
        l.remove(ab.f20303a);
        g.remove(ab.f20303a);
        m.remove(ab.f20303a);
    }
}
