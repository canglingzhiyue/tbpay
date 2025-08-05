package anet.channel.util;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.monitor.BandWidthSampler;
import anet.channel.monitor.NetworkSpeed;
import anet.channel.statist.ExceptionStatistic;
import anet.channel.status.NetworkStatusHelper;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.ta.utdid2.device.UTDevice;
import java.lang.reflect.Method;
import java.util.List;
import tb.kge;

/* loaded from: classes.dex */
public class Utils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String HARMONY_OS = "harmony";
    private static final String TAG = "awcn.Utils";
    public static Context context;
    private static String harmonyVersion;
    private static Boolean isHarmony;

    public static String getAbStrategy() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bafc428f", new Object[0]) : "";
    }

    static {
        kge.a(1246012451);
        context = null;
        isHarmony = null;
    }

    public static String getDeviceId(Context context2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ad7270e6", new Object[]{context2}) : UTDevice.getUtdid(context2);
    }

    public static String getMainProcessName(Context context2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("78984e4a", new Object[]{context2});
        }
        if (context2 == null) {
            return "";
        }
        try {
            return context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).applicationInfo.processName;
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    public static String getProcessName(Context context2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6ec675fa", new Object[]{context2, new Integer(i)});
        }
        String str = "";
        try {
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context2.getSystemService("activity")).getRunningAppProcesses();
            if (runningAppProcesses != null && runningAppProcesses.size() > 0) {
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (runningAppProcessInfo.pid == i) {
                        str = runningAppProcessInfo.processName;
                        break;
                    }
                }
            } else {
                AppMonitor.getInstance().commitStat(new ExceptionStatistic(ErrorConstant.ERROR_GET_PROCESS_NULL, ErrorConstant.formatMsg(ErrorConstant.ERROR_GET_PROCESS_NULL, "BuildVersion=" + String.valueOf(Build.VERSION.SDK_INT)), "rt"));
            }
        } catch (Exception e) {
            AppMonitor.getInstance().commitStat(new ExceptionStatistic(ErrorConstant.ERROR_GET_PROCESS_NULL, e.toString(), "rt"));
        }
        return TextUtils.isEmpty(str) ? getProcessNameNew(i) : str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a3, code lost:
        r11 = r3[8];
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a7, code lost:
        r8.close();
        r9.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ae, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00af, code lost:
        anet.channel.util.ALog.e(anet.channel.util.Utils.TAG, "getProcessNameNew ", null, r0, new java.lang.Object[0]);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String getProcessNameNew(int r11) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: anet.channel.util.Utils.getProcessNameNew(int):java.lang.String");
    }

    public static Context getAppContext() {
        Context context2 = context;
        if (context2 != null) {
            return context2;
        }
        synchronized (Utils.class) {
            if (context != null) {
                return context;
            }
            try {
                Class<?> cls = Class.forName(ProcessUtils.ACTIVITY_THREAD);
                Object invoke = cls.getMethod(ProcessUtils.CURRENT_ACTIVITY_THREAD, new Class[0]).invoke(cls, new Object[0]);
                context = (Context) invoke.getClass().getMethod("getApplication", new Class[0]).invoke(invoke, new Object[0]);
            } catch (Exception e) {
                ALog.w(TAG, "getAppContext", null, e, new Object[0]);
            }
            return context;
        }
    }

    public static Object invokeStaticMethodThrowException(String str, String str2, Class<?>[] clsArr, Object... objArr) throws Exception {
        Method declaredMethod;
        if (str == null || str2 == null) {
            return null;
        }
        Class<?> cls = Class.forName(str);
        if (clsArr != null) {
            declaredMethod = cls.getDeclaredMethod(str2, clsArr);
        } else {
            declaredMethod = cls.getDeclaredMethod(str2, new Class[0]);
        }
        if (declaredMethod == null) {
            return null;
        }
        declaredMethod.setAccessible(true);
        if (objArr != null) {
            return declaredMethod.invoke(cls, objArr);
        }
        return declaredMethod.invoke(cls, new Object[0]);
    }

    public static Object invokeStaticFieldThrowException(String str, String str2) throws Exception {
        if (str == null || str2 == null) {
            return null;
        }
        return Class.forName(str).getDeclaredField(str2).get(null);
    }

    public static float getNetworkTimeFactor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3c26a10b", new Object[0])).floatValue();
        }
        float f = 1.0f;
        NetworkStatusHelper.NetworkStatus status = NetworkStatusHelper.getStatus();
        if (status == NetworkStatusHelper.NetworkStatus.G4 || status == NetworkStatusHelper.NetworkStatus.G5 || status == NetworkStatusHelper.NetworkStatus.WIFI) {
            f = 0.8f;
        }
        return BandWidthSampler.getInstance().getNetworkSpeed() == NetworkSpeed.Fast.getCode() ? f * 0.75f : f;
    }

    public static boolean isHarmonyOS() {
        Boolean bool = isHarmony;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z = false;
        try {
            Class<?> cls = Class.forName("com.huawei.system.BuildEx");
            z = HARMONY_OS.equals(cls.getMethod("getOsBrand", new Class[0]).invoke(cls, new Object[0]));
        } catch (Throwable unused) {
        }
        Boolean bool2 = new Boolean(z);
        isHarmony = bool2;
        return bool2.booleanValue();
    }

    public static String getHarmonyVersion() {
        String str = harmonyVersion;
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
        harmonyVersion = str2;
        return str2;
    }
}
