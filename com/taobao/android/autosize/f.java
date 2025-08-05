package com.taobao.android.autosize;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.orientation.b;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.tao.log.TLog;
import java.util.ArrayList;
import java.util.Iterator;
import tb.apv;
import tb.lsk;
import tb.riy;
import tb.rmq;

/* loaded from: classes.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final ArrayList<a> f9100a = new ArrayList<>();
    private static int b = -1;
    private static int c = -1;
    private static int d = -1;
    private static Pair<Integer, Integer> e = new Pair<>(0, 0);

    /* loaded from: classes.dex */
    public interface a {
        void a(Context context, Configuration configuration);
    }

    public static boolean a(Context context, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8c646c95", new Object[]{context, new Integer(i), new Boolean(z)})).booleanValue();
        }
        if (i <= 0) {
            Log.e("TBAutoSize", "autoSize: screenInDp can't be negative, exit!");
            return false;
        } else if (context.getResources().getConfiguration().screenWidthDp == i && !z) {
            return false;
        } else {
            int a2 = h.a().a(context);
            if (a2 == -1) {
                Log.e("TBAutoSize", "autoSize: screenWidth can't be negative, exit!");
                return false;
            }
            int i2 = (int) ((a2 / i) * 160.0f);
            if (com.taobao.android.autosize.config.a.a().d() || com.taobao.android.autosize.config.a.a().e().contains(Build.BRAND)) {
                a(context, i2, i);
            }
            a(context);
            synchronized (f9100a) {
                Iterator<a> it = f9100a.iterator();
                while (it.hasNext()) {
                    it.next().a(context, context.getResources().getConfiguration());
                }
            }
            Log.e("TBAutoSize", "autoSize for " + context.getClass().getName() + " and targetDensityDpi is " + i2);
            return true;
        }
    }

    public static boolean a(Context context, float f, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8c62cfa7", new Object[]{context, new Float(f), new Integer(i)})).booleanValue();
        }
        if (f <= 0.0f || i <= 0) {
            Log.e("TBAutoSize", "autoSize: density or screenInDp can't be negative, exit!");
            return false;
        }
        if (com.taobao.android.autosize.config.a.a().d() || com.taobao.android.autosize.config.a.a().e().contains(Build.BRAND)) {
            a(context, (int) (160.0f * f), i);
        }
        a(context);
        synchronized (f9100a) {
            Iterator<a> it = f9100a.iterator();
            while (it.hasNext()) {
                it.next().a(context, context.getResources().getConfiguration());
            }
        }
        Log.e("TBAutoSize", "reset for " + context.getClass().getName() + " density=" + f);
        return true;
    }

    private static void a(Context context, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c642cc0", new Object[]{context, new Integer(i), new Integer(i2)});
            return;
        }
        try {
            if (context instanceof Activity) {
                Configuration configuration = context.getResources().getConfiguration();
                configuration.densityDpi = i;
                configuration.screenWidthDp = i2;
                context.getResources().updateConfiguration(configuration, context.getResources().getDisplayMetrics());
                Configuration configuration2 = ((Activity) context).getApplication().getResources().getConfiguration();
                configuration2.densityDpi = i;
                configuration2.screenWidthDp = i2;
                ((Activity) context).getApplication().getResources().updateConfiguration(configuration2, ((Activity) context).getApplication().getResources().getDisplayMetrics());
                ((Activity) context).getApplication().getResources().getDisplayMetrics().widthPixels = context.getResources().getDisplayMetrics().widthPixels;
            } else if (context instanceof Application) {
                Configuration configuration3 = context.getResources().getConfiguration();
                configuration3.densityDpi = i;
                configuration3.screenWidthDp = i2;
                context.getResources().updateConfiguration(configuration3, context.getResources().getDisplayMetrics());
            }
            Resources system = Resources.getSystem();
            Configuration configuration4 = system.getConfiguration();
            configuration4.densityDpi = i;
            configuration4.screenWidthDp = i2;
            system.updateConfiguration(configuration4, system.getDisplayMetrics());
        } catch (Exception e2) {
            TLog.loge("TBAutoSize", "updateConfiguration", e2);
        }
    }

    public static int c(Context context, boolean z) {
        DisplayMetrics displayMetrics;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4f616ae9", new Object[]{context, new Boolean(z)})).intValue();
        }
        if (d < 0 || z) {
            if (context == null || context.getResources() == null || (displayMetrics = context.getResources().getDisplayMetrics()) == null) {
                return 0;
            }
            d = displayMetrics.widthPixels;
        }
        return d;
    }

    public static int a(Context context, boolean z) {
        DisplayMetrics displayMetrics;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("258fda67", new Object[]{context, new Boolean(z)})).intValue();
        }
        int i = b;
        if (i >= 0 && !z) {
            return i;
        }
        if ((context instanceof Application) && com.taobao.android.autosize.config.a.a().x()) {
            Activity h = h.a().h();
            if (h == null || h.isDestroyed() || h.isFinishing()) {
                return h.a().a(context);
            }
            context = h;
        }
        if (context == null || context.getResources() == null || (displayMetrics = context.getResources().getDisplayMetrics()) == null) {
            return 0;
        }
        Pair<Integer, Integer> d2 = d(context, true);
        b = displayMetrics.widthPixels + ((Integer) d2.first).intValue() > ((Integer) d2.second).intValue() ? displayMetrics.widthPixels : displayMetrics.widthPixels + ((Integer) d2.first).intValue();
        c = displayMetrics.heightPixels;
        TLog.loge("TBAutoSize", context + " getScreenWidth: " + b + " " + d2);
        return b;
    }

    public static Pair<Integer, Integer> d(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("334c65c1", new Object[]{context, new Boolean(z)});
        }
        if (!l.d(context) || !com.taobao.android.autosize.config.a.a().o() || context == null) {
            Pair<Integer, Integer> pair = new Pair<>(0, 0);
            e = pair;
            return pair;
        } else if (!z) {
            return e;
        } else {
            String lowerCase = Build.MANUFACTURER.toLowerCase();
            if (!"huawei".equals(lowerCase) && !"honor".equals(lowerCase) && !"xiaomi".equals(lowerCase) && !l.REDMI_MANUFACTURE_LOWER_CASE.equals(lowerCase)) {
                Pair<Integer, Integer> pair2 = new Pair<>(0, 0);
                e = pair2;
                return pair2;
            }
            Activity h = h.a().h();
            if (context instanceof Activity) {
                h = (Activity) context;
            }
            if (h == null || l.b(h) || l.a(h)) {
                Pair<Integer, Integer> pair3 = new Pair<>(0, 0);
                e = pair3;
                return pair3;
            }
            String configuration = context.getResources().getConfiguration().toString();
            TLog.loge("TBAutoSize", context + "getScreenWidth: " + configuration);
            int indexOf = configuration.indexOf("mAppBounds=Rect(");
            Rect a2 = a(configuration.substring(indexOf + 16, configuration.indexOf(riy.BRACKET_END_STR, indexOf)));
            int indexOf2 = configuration.indexOf("mMaxBounds=Rect(");
            Rect a3 = a(configuration.substring(indexOf2 + 16, configuration.indexOf(riy.BRACKET_END_STR, indexOf2)));
            if (a2 != null && a3 != null && a2.width() != a3.width() && !configuration.contains("mRotation=ROTATION_180")) {
                Pair<Integer, Integer> pair4 = new Pair<>(Integer.valueOf(i.b(h)), Integer.valueOf(a3.width()));
                e = pair4;
                return pair4;
            }
            Pair<Integer, Integer> pair5 = new Pair<>(0, 0);
            e = pair5;
            return pair5;
        }
    }

    private static Rect a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("3c540bfb", new Object[]{str});
        }
        String[] split = str.replace('-', ',').split(",");
        if (split.length == 4) {
            return new Rect(apv.a(split[0].trim()), apv.a(split[1].trim()), apv.a(split[2].trim()), apv.a(split[3].trim()));
        }
        return null;
    }

    public static int b(Context context, boolean z) {
        DisplayMetrics displayMetrics;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3a78a2a8", new Object[]{context, new Boolean(z)})).intValue();
        }
        if (c < 0 || z) {
            if (context == null || context.getResources() == null || (displayMetrics = context.getResources().getDisplayMetrics()) == null) {
                return 0;
            }
            b = displayMetrics.widthPixels;
            c = displayMetrics.heightPixels;
        }
        return c;
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
            return;
        }
        if (com.taobao.android.autosize.config.a.a().n()) {
            if (context instanceof Activity) {
                DinamicXEngine.a((Activity) context, true);
            } else {
                DinamicXEngine.a(true);
            }
            com.taobao.android.dinamic.e.a(true);
        }
        rmq.a(context);
        if (!context.getClass().getName().equals(lsk.BIZ_NAME)) {
            return;
        }
        com.taobao.tao.navigation.e.i();
    }

    public static void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40278362", new Object[]{aVar});
            return;
        }
        synchronized (f9100a) {
            f9100a.add(aVar);
        }
    }

    public static void a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a25ba", new Object[]{activity});
        } else if (l.b((Context) activity)) {
            com.taobao.android.autosize.orientation.a a2 = com.taobao.android.autosize.orientation.a.a(activity);
            int i = com.taobao.android.autosize.config.a.a().e(activity) ? 4 : -1;
            if (a2 != null) {
                a2.a(i);
            } else if (com.taobao.android.autosize.orientation.a.a(activity.getContentResolver()) != 1) {
            } else {
                b.a(activity, i);
            }
        } else if (l.d((Context) activity) && m.b(activity)) {
            b.b(activity, 3);
        } else {
            b.b(activity, 1);
        }
    }
}
