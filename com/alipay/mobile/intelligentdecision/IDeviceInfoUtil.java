package com.alipay.mobile.intelligentdecision;

import android.content.Context;
import android.hardware.Camera;
import android.hardware.fingerprint.FingerprintManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.alipay.mobile.intelligentdecision.log.DecisionLogcat;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class IDeviceInfoUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static int f5721a = -1;

    /* loaded from: classes3.dex */
    public enum BiometryType {
        NONE,
        TOUCH,
        FACE,
        ALL
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : Build.BRAND;
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]) : Build.MODEL;
    }

    public static String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[0]) : Build.VERSION.RELEASE;
    }

    public static String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43881515", new Object[0]);
        }
        DecisionLogcat.b("IDeviceInfoUtil", "getNetworkName:");
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) DecisionContext.getInstance().getContext().getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isAvailable()) {
            int type = activeNetworkInfo.getType();
            if (type == 1) {
                return "WIFI";
            }
            if (type == 0) {
                return "4G/3G";
            }
        }
        return "-";
    }

    public static String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[0]);
        }
        Context context = DecisionContext.getInstance().getContext();
        if (context == null) {
            DecisionLogcat.a("IDeviceInfoUtil", "getAppName failed!");
            return "";
        }
        return context.getPackageName();
    }

    public static String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("50938a53", new Object[0]);
        }
        Context context = DecisionContext.getInstance().getContext();
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Throwable th) {
            DecisionLogcat.a("IDeviceInfoUtil", th.getMessage());
            return "";
        }
    }

    public static String a(int i, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("cd4d069b", new Object[]{new Integer(i), str}) : (i > 0 && !TextUtils.isEmpty(str) && str.length() > i) ? str.substring(str.length() - i, str.length()) : "";
    }

    public static Object a(Bundle bundle, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("34a853bc", new Object[]{bundle, str});
        }
        if (bundle != null && !TextUtils.isEmpty(str)) {
            return bundle.get(str);
        }
        return null;
    }

    public static int a(Context context) {
        FingerprintManager fingerprintManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9e1d6453", new Object[]{context})).intValue();
        }
        int i = f5721a;
        if (i != -1) {
            return i;
        }
        try {
            f5721a = BiometryType.NONE.ordinal();
            boolean z = Build.VERSION.SDK_INT >= 23 && context.checkSelfPermission("android.permission.USE_FINGERPRINT") == 0 && (fingerprintManager = (FingerprintManager) context.getSystemService(MspFlybirdDefine.FLYBIRD_SETTING_FINGERPRINT)) != null && fingerprintManager.isHardwareDetected();
            int numberOfCameras = Camera.getNumberOfCameras();
            if (z && numberOfCameras > 1) {
                f5721a = BiometryType.ALL.ordinal();
            } else if (z) {
                f5721a = BiometryType.TOUCH.ordinal();
            } else if (numberOfCameras > 1) {
                f5721a = BiometryType.FACE.ordinal();
            }
        } catch (Throwable th) {
            DecisionLogcat.a("IDeviceInfoUtil", th.getMessage());
        }
        return f5721a;
    }
}
