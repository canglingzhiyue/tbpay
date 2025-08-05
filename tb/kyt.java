package tb;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.SystemClock;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.goodprice.minidetail.GoodPriceWeex2Manager;
import com.taobao.android.home.component.utils.e;
import com.taobao.android.home.component.utils.j;
import com.taobao.tao.log.TLog;
import com.taobao.tao.tbmainfragment.d;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes7.dex */
public class kyt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static WeakReference<Activity> f30409a;
    private static boolean b;
    private static fmh c;
    private static AtomicBoolean d;

    static {
        kge.a(1184796045);
        b = false;
        d = new AtomicBoolean(false);
    }

    public static void a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a25ba", new Object[]{activity});
        } else if ((!d.b(activity) && !d.c(activity)) || activity == null) {
        } else {
            f30409a = new WeakReference<>(activity);
        }
    }

    public static void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{new Boolean(z)});
            return;
        }
        d.set(z);
        TLog.loge("preloadWeex", "preLoadNewDetailWeex", "setPreloadStatus: " + z);
    }

    public static Activity a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("2162bf40", new Object[0]);
        }
        WeakReference<Activity> weakReference = f30409a;
        Activity activity = weakReference == null ? null : weakReference.get();
        if (activity == null) {
            return null;
        }
        if (!d.b(activity) && !d.c(activity)) {
            return null;
        }
        return activity;
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
            return;
        }
        lap.a("preloadWeex", "preLoadNewDetailWeex", "preloadNextPageWeex start");
        Activity a2 = a();
        if (a2 == null) {
            return;
        }
        if (!d.get()) {
            lap.a("preloadWeex", "preLoadNewDetailWeex", "can't preload, discard preload");
            return;
        }
        c(a2);
        if (!d()) {
            lap.a("preloadWeex", "preLoadNewDetailWeex", "mini场景/双列流newdetail场景/首页沉浸式场景开关都没开，不进行预加载");
            return;
        }
        a((Context) a2);
        if (c()) {
            b(a2);
        }
        lap.a("preloadWeex", "preLoadNewDetailWeex", "preloadNextPageWeex end");
    }

    private static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
            return;
        }
        b = b(context);
        c(context);
    }

    private static void b(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fdb367b", new Object[]{activity});
            return;
        }
        if (c == null) {
            c = new fmh(fmr.f28066a);
        }
        c.a(activity);
        lap.a("basement", "preLoadNewDetailWeex", "preloadDoubleRowNewDetailWeex executed");
    }

    public static String a(String str, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b7da5f8a", new Object[]{str, context});
        }
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        if (str.contains("market.wapa.taobao.com/app/mini-detail/mini-detail/index") || str.contains("market.m.taobao.com/app/mini-detail/mini-detail/index")) {
            return b(str, context);
        }
        return str.contains("//item.taobao.com/item.htm") ? c(str, context) : str;
    }

    private static String b(String str, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("599d78b", new Object[]{str, context});
        }
        a(context, "homeMiniDetailCount");
        lap.a("preloadWeex", "preLoadNewDetailWeex", "onClick, nav to mini fragment targetUrl:" + str);
        return str;
    }

    private static String c(String str, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("53594f8c", new Object[]{str, context});
        }
        a(context, "homeNewDetailCount");
        if (c == null) {
            c = new fmh(fmr.f28066a);
        }
        if (!c.a()) {
            return str;
        }
        lap.a("preloadWeex", "preLoadNewDetailWeex", "onClick, nav to new fragment targetUrl" + str);
        return str;
    }

    private static void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{context, str});
            return;
        }
        lap.a("preloadWeex", "preLoadNewDetailWeex", "addTapCount start countKey: " + str);
        if (context == null) {
            return;
        }
        if (!(context instanceof Application)) {
            context = context.getApplicationContext();
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("homeDoubleRowTapCount", 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putInt(str, sharedPreferences.getInt(str, 0) + 1);
        edit.apply();
        lap.a("preloadWeex", "preLoadNewDetailWeex", "addTapCount end countKey: " + str);
    }

    private static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue();
        }
        if (c == null) {
            c = new fmh(fmr.f28066a);
        }
        return b && c.a();
    }

    private static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue();
        }
        if (c == null) {
            c = new fmh(fmr.f28066a);
        }
        return c.a();
    }

    private static boolean b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9eca1003", new Object[]{context})).booleanValue();
        }
        if (context == null) {
            return false;
        }
        if (!(context instanceof Application)) {
            context = context.getApplicationContext();
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("homeDoubleRowTapCount", 0);
        int i = sharedPreferences.getInt("homeMiniDetailCount", 0);
        int i2 = sharedPreferences.getInt("homeNewDetailCount", 0);
        if (i == 0 && i2 == 0) {
            lap.a("preloadWeex", "preLoadNewDetailWeex", "isDoubleRowInNewDetailBucket: false, miniCount: " + i + ", newCount: " + i2);
            return false;
        } else if (i2 > i) {
            lap.a("preloadWeex", "preLoadNewDetailWeex", "isDoubleRowInNewDetailBucket: true, miniCount: " + i + ", newCount: " + i2);
            return true;
        } else {
            lap.a("preloadWeex", "preLoadNewDetailWeex", "isDoubleRowInNewDetailBucket: false, miniCount: " + i + ", newCount: " + i2);
            return false;
        }
    }

    private static void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f76bb9e", new Object[]{context});
        } else if (context == null) {
        } else {
            if (!(context instanceof Application)) {
                context = context.getApplicationContext();
            }
            SharedPreferences.Editor edit = context.getSharedPreferences("homeDoubleRowTapCount", 0).edit();
            edit.putInt("homeMiniDetailCount", 0);
            edit.putInt("homeNewDetailCount", 0);
            edit.apply();
        }
    }

    private static void c(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("792c473c", new Object[]{activity});
            return;
        }
        boolean a2 = j.a("enableGoodPricePreloadMiniDetail", true);
        e.e("home.HomePluginManager", "preloadGoodPriceMiniDetail, enablePreLoadMiniDetail : " + a2);
        if (!a2) {
            return;
        }
        try {
            long uptimeMillis = SystemClock.uptimeMillis();
            GoodPriceWeex2Manager.getInstance().preloadMiniDetailInstance(activity);
            e.e("home.HomePluginManager", "preloadGoodPriceMiniDetail 耗时 : " + (SystemClock.uptimeMillis() - uptimeMillis));
        } catch (Throwable th) {
            e.a("home.HomePluginManager", "preloadGoodPriceMiniDetail exception : " + th.getMessage(), th);
        }
    }
}
