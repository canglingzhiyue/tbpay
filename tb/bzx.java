package tb;

import android.app.AppOpsManager;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import android.provider.Settings;
import mtopsdk.common.util.StringUtils;
import com.alibaba.poplayer.utils.c;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;

/* loaded from: classes3.dex */
public class bzx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(599653515);
    }

    public static boolean a(Context context) {
        boolean z = true;
        if (Build.VERSION.SDK_INT < 19) {
            c.a("TableUtils.checkFloatPermission.小于19.true", new Object[0]);
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
                    c.a("TableUtils.checkFloatPermission.大于26.b=" + z, new Object[0]);
                    return z;
                }
                boolean canDrawOverlays = Settings.canDrawOverlays(context);
                c.a("TableUtils.checkFloatPermission.大于23.小于26，b=" + canDrawOverlays, new Object[0]);
                if (canDrawOverlays && a()) {
                    canDrawOverlays = b(context) == 0;
                    c.a("TableUtils.checkFloatPermission.isVivo.结果为" + canDrawOverlays, new Object[0]);
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
            c.a("TableUtils.checkFloatPermission.小于23版本.b = " + declaredField2.getInt(cls2), new Object[0]);
            return intValue == declaredField2.getInt(cls2);
        } catch (Throwable th) {
            c.a("TableUtils.checkFloatPermission.error.", th);
            return false;
        }
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        String str = Build.BRAND;
        return !StringUtils.isEmpty(str) && str.toLowerCase().contains("vivo");
    }

    public static int b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9eca0ff2", new Object[]{context})).intValue();
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
                return c(context);
            }
            return c(context);
        } catch (Throwable th) {
            c.a("TableUtils.getFloatPermissionStatus.error.", th);
            if (0 == 0 || cursor.isClosed()) {
                return -1;
            }
            cursor.close();
            return -1;
        }
    }

    private static int c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9f76bb91", new Object[]{context})).intValue();
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
            c.a("TableUtils.getFloatPermissionStatus2.error.", th);
            if (0 == 0 || cursor.isClosed()) {
                return -1;
            }
            cursor.close();
            return -1;
        }
    }
}
