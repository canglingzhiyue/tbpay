package com.huawei.hms.push;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.support.log.HMSLog;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import org.json.JSONObject;
import tb.cwx;

/* loaded from: classes4.dex */
public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f7519a = new Object();
    private static int b = -1;

    private static boolean a() {
        String str;
        try {
            Class<?> cls = Class.forName("huawei.cust.HwCfgFilePolicy");
            File file = (File) cls.getDeclaredMethod("getCfgFile", String.class, Integer.TYPE).invoke(cls, "jars/hwpush.jar", Integer.valueOf(((Integer) cls.getDeclaredField("CUST_TYPE_CONFIG").get(cls)).intValue()));
            if (file != null && file.exists()) {
                HMSLog.d("CommFun", "get push cust File path success.");
                return true;
            }
        } catch (ClassNotFoundException unused) {
            str = "HwCfgFilePolicy ClassNotFoundException";
            HMSLog.e("CommFun", str);
            return false;
        } catch (IllegalAccessException unused2) {
            str = "check cust exist push IllegalAccessException.";
            HMSLog.e("CommFun", str);
            return false;
        } catch (IllegalArgumentException unused3) {
            str = "check cust exist push IllegalArgumentException.";
            HMSLog.e("CommFun", str);
            return false;
        } catch (NoSuchFieldException unused4) {
            str = "check cust exist push NoSuchFieldException.";
            HMSLog.e("CommFun", str);
            return false;
        } catch (NoSuchMethodException unused5) {
            str = "check cust exist push NoSuchMethodException.";
            HMSLog.e("CommFun", str);
            return false;
        } catch (SecurityException unused6) {
            str = "check cust exist push SecurityException.";
            HMSLog.e("CommFun", str);
            return false;
        } catch (InvocationTargetException unused7) {
            str = "check cust exist push InvocationTargetException.";
            HMSLog.e("CommFun", str);
            return false;
        }
        return false;
    }

    private static boolean a(Context context) {
        HMSLog.d("CommFun", "existFrameworkPush:" + b);
        try {
            File file = new File("/system/framework/hwpush.jar");
            if (!a() && !file.isFile()) {
                return false;
            }
            HMSLog.d("CommFun", "push jarFile is exist");
            return true;
        } catch (Exception e) {
            HMSLog.e("CommFun", "get Apk version faild ,Exception e= " + e.toString());
            return false;
        }
    }

    public static boolean a(JSONObject jSONObject, JSONObject jSONObject2, String str) {
        if (jSONObject != null) {
            return StringUtils.isEmpty(str) && jSONObject2 == null;
        }
        return true;
    }

    public static long b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.huawei.android.pushagent", 16384).versionCode;
        } catch (Exception unused) {
            HMSLog.e("CommFun", "get nc versionCode error");
            return -1L;
        }
    }

    public static boolean b() {
        return HwBuildEx.VERSION.EMUI_SDK_INT >= 21;
    }

    public static String c(Context context) {
        return cwx.a(context).a("client/project_id");
    }

    public static boolean c() {
        return HwBuildEx.VERSION.EMUI_SDK_INT < 19;
    }

    public static boolean d(Context context) {
        HMSLog.d("CommFun", "existFrameworkPush:" + b);
        synchronized (f7519a) {
            int i = b;
            boolean z = false;
            if (-1 != i) {
                if (1 == i) {
                    z = true;
                }
                return z;
            }
            if (a(context)) {
                b = 1;
            } else {
                b = 0;
            }
            return 1 == b;
        }
    }
}
