package org.android.netutil;

import android.app.Application;
import android.content.Context;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavix.feature.a;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicBoolean;
import org.android.spdy.spduLog;

/* loaded from: classes.dex */
public class UtilTool {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String HARMONY_OS = "harmony";
    public static final String TAG = "tnetsdk.UtilTool";

    /* renamed from: a  reason: collision with root package name */
    private static int f25065a = -1;
    private static String b = null;
    private static boolean c = false;
    private static Context d;
    private static AtomicBoolean isValidEnv;

    public static String a() {
        try {
            Method declaredMethod = Class.forName(ProcessUtils.ACTIVITY_THREAD, false, Application.class.getClassLoader()).getDeclaredMethod("currentProcessName", new Class[0]);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(null, new Object[0]);
            if (!(invoke instanceof String)) {
                return null;
            }
            return (String) invoke;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Context b() {
        if (c) {
            return d;
        }
        try {
            Class<?> cls = Class.forName(ProcessUtils.ACTIVITY_THREAD);
            Object invoke = cls.getMethod(ProcessUtils.CURRENT_ACTIVITY_THREAD, new Class[0]).invoke(cls, new Object[0]);
            d = (Context) invoke.getClass().getMethod("getApplication", new Class[0]).invoke(invoke, new Object[0]);
        } catch (Throwable th) {
            spduLog.Tloge(TAG, null, "invoke currentApplication failed:", th);
            try {
                Class<?> cls2 = Class.forName("android.app.AppGlobals");
                d = (Context) cls2.getMethod("getInitialApplication", new Class[0]).invoke(cls2, new Object[0]);
            } catch (Throwable th2) {
                spduLog.Tloge(TAG, null, "invoke getInitialApplication failed:", th2);
            }
        }
        c = true;
        return d;
    }

    public static boolean c() {
        boolean z;
        if (f25065a == -1) {
            try {
                Class<?> cls = Class.forName("com.huawei.system.BuildEx");
                z = HARMONY_OS.equals(cls.getMethod("getOsBrand", new Class[0]).invoke(cls, new Object[0]));
            } catch (Exception unused) {
                z = false;
            }
            f25065a = z ? 1 : 0;
        }
        return f25065a == 1;
    }

    public static String d() {
        String str = b;
        if (str != null) {
            return str;
        }
        String str2 = null;
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            str2 = (String) cls.getDeclaredMethod("get", String.class).invoke(cls, "hw_sc.build.platform.version");
        } catch (Throwable unused) {
        }
        if (str2 == null) {
            str2 = "";
        }
        b = str2;
        return str2;
    }

    public static Boolean isABGlobalFeatureOpened(Context context, String str) {
        try {
            Class<?> cls = Class.forName("com.taobao.android.ab.api.ABGlobal");
            boolean booleanValue = ((Boolean) cls.getDeclaredMethod("isFeatureOpened", Context.class, String.class).invoke(cls, context, str)).booleanValue();
            spduLog.Tloge(TAG, null, "[isABGlobalFeatureOpened]", a.FEATURE_NAME, str, "status", Boolean.valueOf(booleanValue));
            return Boolean.valueOf(booleanValue);
        } catch (Throwable th) {
            spduLog.Tloge(TAG, null, "[isABGlobalFeatureOpened]", th);
            return null;
        }
    }

    public static boolean isValidPathEnv(Context context) {
        if (isValidEnv == null) {
            isValidEnv = new AtomicBoolean(false);
            try {
                long currentTimeMillis = System.currentTimeMillis();
                Class<?> cls = Class.forName("tb.jgk");
                boolean booleanValue = ((Boolean) cls.getDeclaredMethod("checkValidInstrumentation", Context.class).invoke(cls, context)).booleanValue();
                isValidEnv.set(booleanValue);
                spduLog.Tloge(TAG, null, "isValidPathEnv=" + booleanValue, "cost", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
            } catch (Throwable th) {
                spduLog.Tloge(TAG, null, "[isValidPathEnv]", th);
            }
        }
        return isValidEnv.get();
    }
}
