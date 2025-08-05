package tb;

import android.app.ActivityManager;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.BatteryManager;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import anet.channel.status.NetworkStatusHelper;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.taobao.aop.ANDROID_TELEPHONY_TELEPHONYMANAGER_PROXY;
import com.taobao.muniontaobaosdk.util.MunionDeviceUtil;
import com.taobao.muniontaobaosdk.util.TaoLog;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;

/* loaded from: classes7.dex */
public class mtn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final String f31250a;

    /* loaded from: classes7.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1582565255);
        }

        public static byte[] a(byte[] bArr) {
            String f;
            StringBuilder sb;
            String exc;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (byte[]) ipChange.ipc$dispatch("27137f8e", new Object[]{bArr});
            }
            if (bArr == null || bArr.length <= 0) {
                return null;
            }
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
                messageDigest.update(bArr);
                return messageDigest.digest();
            } catch (NoSuchAlgorithmException e) {
                f = mtn.f();
                sb = new StringBuilder();
                sb.append("SHA-1 encode exception,info:");
                exc = e.toString();
                sb.append(exc);
                TaoLog.Logd(f, sb.toString());
                return null;
            } catch (Exception e2) {
                f = mtn.f();
                sb = new StringBuilder();
                sb.append("SHA-1 encode exception,info:");
                exc = e2.toString();
                sb.append(exc);
                TaoLog.Logd(f, sb.toString());
                return null;
            }
        }
    }

    public static String a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{context}) : "-1";
    }

    public static String b(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("31400281", new Object[]{context}) : "-1";
    }

    public static /* synthetic */ String f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[0]) : f31250a;
    }

    static {
        kge.a(1658213683);
        f31250a = mtn.class.getName();
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        if (str == null) {
            return null;
        }
        return str.replace("\r\n", "").replace("\r", "").replace("\n", "");
    }

    public static double a(double d) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a82180c4", new Object[]{new Double(d)})).doubleValue() : new BigDecimal(Double.toString(d)).subtract(new BigDecimal(Integer.toString((int) d))).floatValue();
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : Build.MODEL;
    }

    public static int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[0])).intValue() : Build.VERSION.SDK_INT & 255;
    }

    public static String c(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a6ba28c2", new Object[]{context}) : MunionDeviceUtil.getUtdid();
    }

    public static String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd025a76", new Object[0]);
        }
        String str = Build.MANUFACTURER;
        return (str == null || str.length() <= 32) ? str : str.substring(0, 32);
    }

    public static int d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a0236730", new Object[]{context})).intValue();
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getSystemService(com.taobao.android.weex_framework.util.a.ATOM_EXT_window)).getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.widthPixels;
    }

    public static int e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a0d012cf", new Object[]{context})).intValue();
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getSystemService(com.taobao.android.weex_framework.util.a.ATOM_EXT_window)).getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    public static int f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a17cbe6e", new Object[]{context})).intValue();
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getSystemService(com.taobao.android.weex_framework.util.a.ATOM_EXT_window)).getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.densityDpi;
    }

    public static int g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a2296a0d", new Object[]{context})).intValue();
        }
        try {
            return Settings.System.getInt(context.getContentResolver(), "screen_brightness");
        } catch (Settings.SettingNotFoundException e) {
            String str = f31250a;
            TaoLog.Logd(str, "Get screen bright exception,info:" + e.toString());
            return 0;
        }
    }

    public static int h(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a2d615ac", new Object[]{context})).intValue();
        }
        NetworkStatusHelper.NetworkStatus status = NetworkStatusHelper.getStatus();
        if (status == NetworkStatusHelper.NetworkStatus.WIFI) {
            return 1;
        }
        if (status == NetworkStatusHelper.NetworkStatus.NO || status == NetworkStatusHelper.NetworkStatus.NONE) {
            return -1;
        }
        if (status == NetworkStatusHelper.NetworkStatus.G2) {
            return 2;
        }
        if (status == NetworkStatusHelper.NetworkStatus.G3) {
            return 3;
        }
        if (status == NetworkStatusHelper.NetworkStatus.G4) {
            return 4;
        }
        return status == NetworkStatusHelper.NetworkStatus.G5 ? 5 : 0;
    }

    public static int i(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a382c14b", new Object[]{context})).intValue();
        }
        try {
            int proxy_getNetworkType = ANDROID_TELEPHONY_TELEPHONYMANAGER_PROXY.proxy_getNetworkType((TelephonyManager) context.getSystemService("phone"));
            if (proxy_getNetworkType == 4) {
                return 0;
            }
            if (proxy_getNetworkType == 2) {
                return 1;
            }
            if (proxy_getNetworkType == 5) {
                return 2;
            }
            if (proxy_getNetworkType == 6) {
                return 3;
            }
            if (proxy_getNetworkType == 1) {
                return 4;
            }
            if (proxy_getNetworkType == 8) {
                return 5;
            }
            if (proxy_getNetworkType == 10) {
                return 6;
            }
            if (proxy_getNetworkType == 9) {
                return 7;
            }
            return proxy_getNetworkType == 3 ? 8 : 9;
        } catch (Exception unused) {
            return -1;
        }
    }

    public static int j(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a42f6cea", new Object[]{context})).intValue();
        }
        if (Build.VERSION.SDK_INT < 16) {
            return -1;
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        return Long.valueOf(memoryInfo.totalMem / 1048576).intValue();
    }

    public static int k(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a4dc1889", new Object[]{context})).intValue();
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        return new Long(memoryInfo.availMem / 1048576).intValue();
    }

    public static int l(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a588c428", new Object[]{context})).intValue();
        }
        if (Build.VERSION.SDK_INT < 21) {
            return -1;
        }
        return ((BatteryManager) context.getSystemService("batterymanager")).getIntProperty(4);
    }

    public static String m(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3d7fa74c", new Object[]{context});
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            if (packageInfo == null) {
                return null;
            }
            return packageInfo.packageName;
        } catch (PackageManager.NameNotFoundException e) {
            String str = f31250a;
            TaoLog.Logd(str, "Get package name exception,info:" + e.toString());
            return null;
        }
    }

    public static int n(Context context) {
        List<Sensor> sensorList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a6e21b66", new Object[]{context})).intValue();
        }
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        if (sensorManager != null && (sensorList = sensorManager.getSensorList(-1)) != null) {
            return sensorList.size();
        }
        return -1;
    }

    public static String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[0]) : NetworkStatusHelper.getWifiSSID();
    }

    public static String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[0]) : NetworkStatusHelper.getWifiBSSID();
    }

    public static int o(Context context) {
        boolean canDrawOverlays;
        if (Build.VERSION.SDK_INT < 19) {
            return -1;
        }
        if (Build.VERSION.SDK_INT < 23) {
            try {
                Class<?> cls = Class.forName("android.content.Context");
                Field declaredField = cls.getDeclaredField("APP_OPS_SERVICE");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(cls);
                if (!(obj instanceof String)) {
                    return -1;
                }
                Object invoke = cls.getMethod("getSystemService", String.class).invoke(context, (String) obj);
                Class<?> cls2 = Class.forName("android.app.AppOpsManager");
                Field declaredField2 = cls2.getDeclaredField("MODE_ALLOWED");
                declaredField2.setAccessible(true);
                return ((Integer) cls2.getMethod("checkOp", Integer.TYPE, Integer.TYPE, String.class).invoke(invoke, 24, Integer.valueOf(Binder.getCallingUid()), context.getPackageName())).intValue() == declaredField2.getInt(cls2) ? 1 : 0;
            } catch (Exception unused) {
                return -1;
            }
        }
        if (Build.VERSION.SDK_INT >= 26) {
            AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
            if (appOpsManager == null) {
                return -1;
            }
            int checkOpNoThrow = appOpsManager.checkOpNoThrow("android:system_alert_window", Process.myUid(), context.getPackageName());
            canDrawOverlays = Settings.canDrawOverlays(context) || checkOpNoThrow == 0 || checkOpNoThrow == 1;
        } else {
            canDrawOverlays = Settings.canDrawOverlays(context);
        }
        return canDrawOverlays ? 1 : 0;
    }

    public static int p(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a83b72a4", new Object[]{context})).intValue();
        }
        if (context == null) {
            return -1;
        }
        try {
            AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
            return accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled() ? 1 : 0;
        } catch (Throwable unused) {
            return -1;
        }
    }
}
