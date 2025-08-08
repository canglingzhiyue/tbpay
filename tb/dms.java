package tb;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.os.Build;
import mtopsdk.common.util.StringUtils;
import android.util.ArrayMap;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.WindowManager;
import android.view.WindowMetrics;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.l;
import com.taobao.android.weex_framework.util.a;
import com.taobao.tao.log.TLog;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class dms {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1385545763);
    }

    public static Context a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("a75aa358", new Object[]{context});
        }
        for (Context context2 = context; context2 instanceof ContextWrapper; context2 = ((ContextWrapper) context2).getBaseContext()) {
            if (context2 instanceof Activity) {
                return context2;
            }
        }
        return context;
    }

    public static Context a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("52552462", new Object[]{view});
        }
        if (view == null) {
            return null;
        }
        if (view.getContext() instanceof Activity) {
            return view.getContext();
        }
        while (view.getParent() != null && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
            if (view.getContext() instanceof Activity) {
                return view.getContext();
            }
        }
        return null;
    }

    public static String a(Map map, String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("35277888", new Object[]{map, str, strArr});
        }
        if (map != null && !map.isEmpty() && strArr != null && strArr.length > 0) {
            for (String str2 : strArr) {
                Object obj = map.get(str2);
                if (obj != null) {
                    return obj.toString();
                }
            }
        }
        return str;
    }

    public static boolean b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9eca1003", new Object[]{context})).booleanValue();
        }
        return (Build.VERSION.SDK_INT >= 19 ? l.d(context) : false) || l.b(context);
    }

    public static int c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9f76bb91", new Object[]{context})).intValue();
        }
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
        if (identifier <= 0) {
            return 0;
        }
        return resources.getDimensionPixelSize(identifier);
    }

    public static Bitmap a(Resources resources, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("f43ecce8", new Object[]{resources, new Integer(i), new Integer(i2), new Integer(i3)});
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        try {
            BitmapFactory.decodeResource(resources, i, options);
            options.inSampleSize = a(options, i2, i3);
            options.inJustDecodeBounds = false;
            return BitmapFactory.decodeResource(resources, i, options);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static int a(BitmapFactory.Options options, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("860e8a99", new Object[]{options, new Integer(i), new Integer(i2)})).intValue();
        }
        int i3 = options.outHeight;
        int i4 = options.outWidth;
        if (i3 <= i2 && i4 <= i) {
            return 1;
        }
        return Math.min(Math.round(i3 / i2), Math.round(i4 / i));
    }

    public static String a(Intent intent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f0dec1d1", new Object[]{intent, str});
        }
        if (intent == null || StringUtils.isEmpty(str)) {
            return "";
        }
        String stringExtra = intent.getStringExtra(str);
        if (StringUtils.isEmpty(stringExtra)) {
            stringExtra = b(intent, str);
        }
        return stringExtra == null ? "" : stringExtra;
    }

    public static String b(Intent intent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6f3fc5b0", new Object[]{intent, str});
        }
        if (intent.getData() == null) {
            return null;
        }
        try {
            return intent.getData().getQueryParameter(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static List<Activity> a() {
        ArrayList arrayList = new ArrayList();
        try {
            Class<?> cls = Class.forName(ProcessUtils.ACTIVITY_THREAD);
            Method declaredMethod = cls.getDeclaredMethod(ProcessUtils.CURRENT_ACTIVITY_THREAD, new Class[0]);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(null, new Object[0]);
            Field declaredField = cls.getDeclaredField("mActivities");
            boolean isAccessible = declaredField.isAccessible();
            declaredField.setAccessible(true);
            ArrayMap arrayMap = (ArrayMap) declaredField.get(invoke);
            declaredField.setAccessible(isAccessible);
            for (Object obj : arrayMap.keySet()) {
                Object obj2 = arrayMap.get(obj);
                if (obj2 != null) {
                    Field declaredField2 = obj2.getClass().getDeclaredField("activity");
                    boolean isAccessible2 = declaredField2.isAccessible();
                    declaredField2.setAccessible(true);
                    Object obj3 = declaredField2.get(obj2);
                    StringBuilder sb = new StringBuilder();
                    sb.append("current stack activity = ");
                    sb.append(obj3 == null ? "" : obj3.getClass().getName());
                    sb.append(" isFinish = ");
                    sb.append(((Activity) obj3).isFinishing());
                    TLog.loge("stdPopTag", "stdPopTag", sb.toString());
                    declaredField2.setAccessible(isAccessible2);
                    if (!((Activity) obj3).isFinishing()) {
                        arrayList.add(obj3);
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return arrayList;
    }

    public static boolean a(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        boolean z2 = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("258fda78", new Object[]{context, new Boolean(z)})).booleanValue();
        }
        if (context == null || !dmr.a(context) || z) {
            return true;
        }
        Point d = d(context);
        int i = d.x;
        int i2 = d.y;
        float f = i / (i2 * 2.0f);
        if (f > dmr.u()) {
            z2 = true;
        }
        TLog.loge("stdPopTag", "stdPopTag", "current ScreenRatio : " + f + " isLargeScreenRatio = " + z2 + " width = " + i + " height = " + i2);
        if (!z2) {
            AppMonitor.Counter.commit("AbilityKit", "AndroidSmallScreenRatio", Build.BRAND + "|" + Build.DEVICE + "|" + Build.MANUFACTURER + "|" + Build.MODEL + "|" + Build.PRODUCT + "|" + f, 1.0d);
        }
        return z2;
    }

    public static Point d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Point) ipChange.ipc$dispatch("e059009c", new Object[]{context});
        }
        WindowManager windowManager = (WindowManager) context.getSystemService(a.ATOM_EXT_window);
        Point point = new Point();
        if (dmr.w() && Build.VERSION.SDK_INT >= 30) {
            WindowMetrics currentWindowMetrics = windowManager.getCurrentWindowMetrics();
            point.x = currentWindowMetrics.getBounds().width();
            point.y = currentWindowMetrics.getBounds().height();
        } else {
            windowManager.getDefaultDisplay().getRealSize(point);
        }
        return point;
    }

    public static boolean a(Activity activity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cabb445e", new Object[]{activity, new Boolean(z)})).booleanValue();
        }
        if (!dmr.F() || activity == null || Build.VERSION.SDK_INT < 30) {
            return false;
        }
        return activity.setTranslucent(z);
    }

    public static boolean a(Activity activity) {
        Class<?>[] declaredClasses;
        try {
            Method declaredMethod = Activity.class.getDeclaredMethod("getActivityOptions", new Class[0]);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(activity, new Object[0]);
            Class<?> cls = null;
            for (Class<?> cls2 : Activity.class.getDeclaredClasses()) {
                if (cls2.getSimpleName().contains("TranslucentConversionListener")) {
                    cls = cls2;
                }
            }
            Method declaredMethod2 = Activity.class.getDeclaredMethod("convertToTranslucent", cls, ActivityOptions.class);
            declaredMethod2.setAccessible(true);
            declaredMethod2.invoke(activity, null, invoke);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean a(ActivityInfo activityInfo, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fb5f042c", new Object[]{activityInfo, context})).booleanValue();
        }
        if (activityInfo == null) {
            return true;
        }
        return new ContextThemeWrapper(context.getApplicationContext(), activityInfo.getThemeResource()).getTheme().obtainStyledAttributes(new int[]{16842840}).getBoolean(0, false);
    }

    public static int b(ActivityInfo activityInfo, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("eeee885c", new Object[]{activityInfo, context})).intValue();
        }
        if (context != null && activityInfo != null) {
            try {
                ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context.getApplicationContext(), activityInfo.getThemeResource());
                TypedArray obtainStyledAttributes = contextThemeWrapper.getTheme().obtainStyledAttributes(new int[]{16842836});
                int resourceId = obtainStyledAttributes.getResourceId(0, 0);
                obtainStyledAttributes.recycle();
                if (resourceId != 0 && "color".equals(contextThemeWrapper.getResources().getResourceTypeName(resourceId)) && Build.VERSION.SDK_INT >= 23) {
                    return contextThemeWrapper.getResources().getColor(resourceId, null);
                }
            } catch (Exception unused) {
            }
        }
        return 0;
    }
}
