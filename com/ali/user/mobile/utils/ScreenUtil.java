package com.ali.user.mobile.utils;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.util.a;
import tb.kge;
import tb.mto;

/* loaded from: classes2.dex */
public class ScreenUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static int sFoldScreen;
    public static int sPad;

    public static int dip2px(Context context, float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8536afc1", new Object[]{context, new Float(f)})).intValue() : (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int pxTodip(Context context, float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ba36d7ba", new Object[]{context, new Float(f)})).intValue() : (int) ((f / context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static void setOrientation(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9b46727", new Object[]{activity});
        } else if (DataProviderFactory.getDataProvider().getOrientation() == 0) {
            if (activity.getResources().getConfiguration().orientation != 1) {
                return;
            }
            activity.setRequestedOrientation(0);
        } else {
            if (activity.getResources().getConfiguration().orientation == 2) {
                activity.setRequestedOrientation(1);
            }
            activity.getWindow().setSoftInputMode(18);
        }
    }

    static {
        kge.a(-1128300556);
        sPad = -1;
        sFoldScreen = -1;
    }

    public static boolean isPad(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b55c22bc", new Object[]{context})).booleanValue();
        }
        if (sPad == -1) {
            boolean isPadBySystemProperties = isPadBySystemProperties();
            if (!isPadBySystemProperties) {
                isPadBySystemProperties = isPadByPhoneType(context);
            }
            if (!isPadBySystemProperties) {
                isPadBySystemProperties = isPadBySize(context);
            }
            if (isPadBySystemProperties && isFoldScreen(context)) {
                isPadBySystemProperties = false;
            }
            if (!isPadBySystemProperties) {
                sPad = 0;
            } else {
                sPad = 1;
            }
        }
        return sPad == 1;
    }

    public static boolean isPadByPhoneType(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5fff41bd", new Object[]{context})).booleanValue() : ((TelephonyManager) context.getSystemService("phone")).getPhoneType() == 0;
    }

    public static boolean isFoldScreen(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("541ca7ee", new Object[]{context})).booleanValue();
        }
        if (sFoldScreen == -1) {
            if (!isFoldScreenByDevice(context)) {
                sFoldScreen = 0;
            } else {
                sFoldScreen = 1;
            }
        }
        return sFoldScreen == 1;
    }

    private static boolean isFoldScreenByDevice(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("38f4c61", new Object[]{context})).booleanValue() : isHwFoldScreen(context) || isHonorFoldScreen(context) || isSmFoldScreen(context) || isXiaomiFoldScreen() || isOppoFoldScreen(context) || isOPPOFoldForAndroidT() || isVivoFoldScreen(context);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static boolean isHwFoldScreen(Context context) {
        char c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ea3c2a5f", new Object[]{context})).booleanValue();
        }
        if ("HUAWEI".equalsIgnoreCase(Build.MANUFACTURER)) {
            if (context != null && context.getPackageManager() != null && context.getPackageManager().hasSystemFeature("com.huawei.hardware.sensor.posture")) {
                return true;
            }
            String str = Build.MODEL;
            char c2 = 65535;
            switch (str.hashCode()) {
                case -1737858118:
                    if (str.equals("RHA-N29m")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case -830296637:
                    if (str.equals("TAH-N29")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 30247423:
                    if (str.equals("TAH-AN00")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 30608138:
                    if (str.equals("TAH-N29m")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 937670222:
                    if (str.equals("TAH-AN00m")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 1949791134:
                    if (str.equals("RHA-AN00m")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 2005507479:
                    if (str.equals("RLI-N29")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 2040829099:
                    if (str.equals("RLI-AN00")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    return true;
                default:
                    String str2 = Build.DEVICE;
                    switch (str2.hashCode()) {
                        case 69168140:
                            if (str2.equals("HWTAH")) {
                                c2 = 0;
                                break;
                            }
                            break;
                        case 1160623169:
                            if (str2.equals("unknownRHA")) {
                                c2 = 3;
                                break;
                            }
                            break;
                        case 1160623301:
                            if (str2.equals("unknownRLI")) {
                                c2 = 2;
                                break;
                            }
                            break;
                        case 2046074562:
                            if (str2.equals("HWTAH-C")) {
                                c2 = 1;
                                break;
                            }
                            break;
                    }
                    if (c2 == 0 || c2 == 1 || c2 == 2 || c2 == 3) {
                        return true;
                    }
            }
        }
        return false;
    }

    private static boolean isSmFoldScreen(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8df29ab4", new Object[]{context})).booleanValue();
        }
        if ("samsung".equalsIgnoreCase(Build.BRAND) && "winner".equalsIgnoreCase(Build.DEVICE)) {
            return true;
        }
        String str = Build.MODEL;
        return !TextUtils.isEmpty(str) && (str.startsWith("SM-F9") || str.startsWith("SM-W202") || str.startsWith("SM-W90"));
    }

    public static boolean isXiaomiFoldScreen() {
        if ("Xiaomi".equalsIgnoreCase(Build.MANUFACTURER)) {
            try {
                Class<?> cls = Class.forName("android.os.SystemProperties");
                String str = (String) cls.getMethod("get", String.class).invoke(cls, "persist.sys.muiltdisplay_type");
                if (str == null) {
                    return false;
                }
                return str.equalsIgnoreCase("2");
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public static boolean isOppoFoldScreen(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c7a1992e", new Object[]{context})).booleanValue();
        }
        int identifier = context.getResources().getIdentifier("config_lidControlsDisplayFold", "bool", "android");
        if (identifier <= 0) {
            return false;
        }
        return context.getResources().getBoolean(identifier);
    }

    public static boolean isOPPOFoldForAndroidT() {
        if ("oppo".equalsIgnoreCase(Build.MANUFACTURER)) {
            try {
                Class<?> cls = Class.forName("com.oplus.content.OplusFeatureConfigManager");
                Object invoke = cls.getDeclaredMethod("hasFeature", String.class).invoke(cls.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]), "oplus.hardware.type.fold");
                if (!(invoke instanceof Boolean)) {
                    return false;
                }
                return ((Boolean) invoke).booleanValue();
            } catch (Throwable unused) {
                return false;
            }
        }
        return false;
    }

    public static boolean isVivoFoldScreen(Context context) {
        if ("vivo".equalsIgnoreCase(Build.MANUFACTURER)) {
            try {
                Class<?> cls = Class.forName("android.util.FtDeviceInfo");
                String str = (String) cls.getMethod("getDeviceType", new Class[0]).invoke(cls, new Object[0]);
                if (str == null) {
                    return false;
                }
                return str.equalsIgnoreCase("foldable");
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }
        return false;
    }

    private static boolean isHonorFoldScreen(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3859aaf8", new Object[]{context})).booleanValue() : "HONOR".equalsIgnoreCase(Build.MANUFACTURER) && context != null && context.getPackageManager() != null && context.getPackageManager().hasSystemFeature("com.hihonor.hardware.sensor.posture");
    }

    private static boolean isPadBySize(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f431c364", new Object[]{context})).booleanValue();
        }
        if (isPadByGoogle(context)) {
            double screenInches = getScreenInches(context);
            if (screenInches > mto.a.GEO_NOT_SUPPORT && screenInches >= 8.0d) {
                return true;
            }
        }
        return false;
    }

    public static boolean isPadByGoogle(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7476682c", new Object[]{context})).booleanValue() : (context.getResources().getConfiguration().screenLayout & 15) >= 3;
    }

    public static double getScreenInches(Context context) {
        WindowManager windowManager;
        Display defaultDisplay;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9e48e2d5", new Object[]{context})).doubleValue();
        }
        if (context == null || (windowManager = (WindowManager) context.getSystemService(a.ATOM_EXT_window)) == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null) {
            return mto.a.GEO_NOT_SUPPORT;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        return (displayMetrics.xdpi <= 0.0f || displayMetrics.ydpi <= 0.0f) ? mto.a.GEO_NOT_SUPPORT : Math.sqrt(Math.pow(displayMetrics.widthPixels / displayMetrics.xdpi, 2.0d) + Math.pow(displayMetrics.heightPixels / displayMetrics.ydpi, 2.0d));
    }

    public static boolean isPadBySystemProperties() {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            String str = (String) cls.getMethod("get", String.class).invoke(cls, "ro.build.characteristics");
            if (str == null) {
                return false;
            }
            return str.equalsIgnoreCase("tablet");
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
