package tb;

import android.app.ActivityManager;
import android.app.AppOpsManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import android.provider.Settings;
import mtopsdk.common.util.StringUtils;
import android.util.DisplayMetrics;
import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.lang.reflect.Field;

/* loaded from: classes7.dex */
public class kgy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static String f30063a;
    private static int b;
    private static int c;

    public static float a(Context context, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("258f8f50", new Object[]{context, new Float(f)})).floatValue();
        }
        if (Float.isNaN(f)) {
            return f;
        }
        float intValue = (f * ((Integer) e(context).first).intValue()) / 750.0f;
        double d = intValue;
        if (d > 0.005d && intValue < 1.0f) {
            return 1.0f;
        }
        return (float) Math.rint(d);
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue();
        }
        try {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses()) {
                if (runningAppProcessInfo.importance == 100 && runningAppProcessInfo.processName.startsWith(context.getPackageName())) {
                    return true;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean b(Context context) {
        boolean z = true;
        if (Build.VERSION.SDK_INT < 19) {
            kgz.a("TableUtils.checkFloatPermission.小于19.true", new Object[0]);
            return true;
        }
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                if (Build.VERSION.SDK_INT >= 26) {
                    AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
                    if (appOpsManager == null) {
                        return false;
                    }
                    int checkOpNoThrow = appOpsManager.checkOpNoThrow("android:system_alert_window", Process.myUid(), context.getPackageName());
                    if (!Settings.canDrawOverlays(context) && checkOpNoThrow != 0) {
                        z = false;
                    }
                    kgz.a("TableUtils.checkFloatPermission.大于26.b=" + z, new Object[0]);
                    return z;
                }
                boolean canDrawOverlays = Settings.canDrawOverlays(context);
                kgz.a("TableUtils.checkFloatPermission.大于23.小于26，b=" + canDrawOverlays, new Object[0]);
                String str = Build.BRAND;
                if (canDrawOverlays && !StringUtils.isEmpty(str) && str.toLowerCase().contains("vivo")) {
                    canDrawOverlays = c(context) == 0;
                    kgz.a("TableUtils.checkFloatPermission.isVivo.结果为" + canDrawOverlays, new Object[0]);
                }
                return canDrawOverlays;
            }
            Class<?> cls = Class.forName("android.content.Context");
            Field declaredField = cls.getDeclaredField("APP_OPS_SERVICE");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(cls);
            if (!(obj instanceof String)) {
                return false;
            }
            Object invoke = cls.getMethod("getSystemService", String.class).invoke(context, (String) obj);
            Class<?> cls2 = Class.forName("android.app.AppOpsManager");
            Field declaredField2 = cls2.getDeclaredField("MODE_ALLOWED");
            declaredField2.setAccessible(true);
            int intValue = ((Integer) cls2.getMethod("checkOp", Integer.TYPE, Integer.TYPE, String.class).invoke(invoke, 24, Integer.valueOf(Binder.getCallingUid()), context.getPackageName())).intValue();
            kgz.a("TableUtils.checkFloatPermission.小于23版本.b = " + declaredField2.getInt(cls2), new Object[0]);
            return intValue == declaredField2.getInt(cls2);
        } catch (Throwable th) {
            kgz.a("TableUtils.checkFloatPermission.error.", th);
            return false;
        }
    }

    public static int c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9f76bb91", new Object[]{context})).intValue();
        }
        if (context == null) {
            throw new IllegalArgumentException("context is null");
        }
        Cursor cursor = null;
        try {
            Cursor query = context.getContentResolver().query(Uri.parse("content://com.iqoo.secure.provider.secureprovider/allowfloatwindowapp"), null, "pkgname = ?", new String[]{context.getPackageName()}, null);
            if (query != null) {
                query.getColumnNames();
                if (query.moveToFirst()) {
                    int i = query.getInt(query.getColumnIndex("currentlmode"));
                    query.close();
                    return i;
                }
                query.close();
                return f(context);
            }
            return f(context);
        } catch (Throwable th) {
            kgz.a("TableUtils.getFloatPermissionStatus.error.", th);
            if (0 == 0 || cursor.isClosed()) {
                return -1;
            }
            cursor.close();
            return -1;
        }
    }

    private static int f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a17cbe6e", new Object[]{context})).intValue();
        }
        Cursor cursor = null;
        try {
            Cursor query = context.getContentResolver().query(Uri.parse("content://com.vivo.permissionmanager.provider.permission/float_window_apps"), null, "pkgname = ?", new String[]{context.getPackageName()}, null);
            if (query != null) {
                if (query.moveToFirst()) {
                    int i = query.getInt(query.getColumnIndex("currentmode"));
                    query.close();
                    return i;
                }
                query.close();
            }
            return 1;
        } catch (Throwable th) {
            kgz.a("TableUtils.getFloatPermissionStatus2.error.", th);
            if (0 == 0 || cursor.isClosed()) {
                return -1;
            }
            cursor.close();
            return -1;
        }
    }

    static {
        kge.a(-1097655175);
        f30063a = "";
        b = 0;
        c = 0;
    }

    public static String d(Context context) {
        String valueOf;
        if (!StringUtils.isEmpty(f30063a)) {
            return f30063a;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                valueOf = String.valueOf(((NotificationManager) context.getSystemService(RemoteMessageConst.NOTIFICATION)).areNotificationsEnabled());
            } catch (Throwable th) {
                kgz.a("Android above 7.0 isNotificationEnabled.error.", th);
            }
        } else {
            if (Build.VERSION.SDK_INT >= 19) {
                try {
                    AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
                    ApplicationInfo applicationInfo = context.getApplicationInfo();
                    String packageName = context.getApplicationContext().getPackageName();
                    int i = applicationInfo.uid;
                    Class<?> cls = Class.forName(AppOpsManager.class.getName());
                    boolean z = false;
                    if (((Integer) cls.getMethod("checkOpNoThrow", Integer.TYPE, Integer.TYPE, String.class).invoke(appOpsManager, Integer.valueOf(((Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(appOpsManager)).intValue()), Integer.valueOf(i), packageName)).intValue() == 0) {
                        z = true;
                    }
                    valueOf = String.valueOf(z);
                } catch (Throwable th2) {
                    kgz.a("Android below 7.0 isNotificationEnabled.error.", th2);
                }
            }
            valueOf = "unknown";
        }
        f30063a = valueOf;
        return valueOf;
    }

    public static Pair<Integer, Integer> e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("32898626", new Object[]{context});
        }
        int i = b;
        if (i > 0 && c > 0) {
            return new Pair<>(Integer.valueOf(i), Integer.valueOf(c));
        }
        if (context != null) {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            b = displayMetrics.widthPixels;
            c = displayMetrics.heightPixels;
        }
        return new Pair<>(Integer.valueOf(b), Integer.valueOf(c));
    }
}
