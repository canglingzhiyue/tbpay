package tb;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.huawei.android.os.SystemPropertiesEx;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes4.dex */
public class cxw {
    public static String a(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getDeclaredMethod("get", String.class).invoke(cls, str);
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | LinkageError | NoSuchMethodException | SecurityException | InvocationTargetException unused) {
            return "";
        }
    }

    public static boolean a() {
        String a2 = a("hw_sc.build.platform.version");
        String str = "hmosVersion=" + a2;
        return !StringUtils.isEmpty(a2) && a2.compareTo("2.0.0") > 0;
    }

    public static boolean a(Context context) {
        String str;
        if (!SystemPropertiesEx.getBoolean("ro.config.hw_globalSearch", true)) {
            str = "ro.config.hw_globalSearch is false, not support HwSearchService";
        } else if (context == null) {
            str = "context is null";
        } else if (a()) {
            return true;
        } else {
            str = "os verson is not support";
        }
        Log.e("SearchClientUtils", str);
        return false;
    }
}
