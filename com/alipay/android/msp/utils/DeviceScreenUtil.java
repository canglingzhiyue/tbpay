package com.alipay.android.msp.utils;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import mtopsdk.common.util.StringUtils;
import com.alipay.android.msp.framework.helper.GlobalHelper;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import tb.nom;

/* loaded from: classes3.dex */
public class DeviceScreenUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String HUAWEI_BRAND = "HUAWEI";
    private static final List<String> HUAWEI_FOLD_DEVICES;
    private static final List<String> HUAWEI_FOLD_MODELS;
    private static final String SAMSUNG_BRAND = "samsung";

    static {
        ArrayList arrayList = new ArrayList();
        HUAWEI_FOLD_DEVICES = arrayList;
        arrayList.add("unknownRLI");
        HUAWEI_FOLD_DEVICES.add("HWTAH");
        HUAWEI_FOLD_DEVICES.add("MRX-AL09");
        HUAWEI_FOLD_DEVICES.add("HWMRX");
        HUAWEI_FOLD_DEVICES.add("TAH-AN00m");
        HUAWEI_FOLD_DEVICES.add("HWTAH-C");
        HUAWEI_FOLD_DEVICES.add("RHA-AN00m");
        HUAWEI_FOLD_DEVICES.add("unknowRHA");
        HUAWEI_FOLD_DEVICES.add("unknownTXL");
        HUAWEI_FOLD_DEVICES.add("HWTET");
        HUAWEI_FOLD_DEVICES.add("PAL-AL00");
        HUAWEI_FOLD_DEVICES.add("PAL-LX9");
        HUAWEI_FOLD_DEVICES.add("DHF-AL00");
        HUAWEI_FOLD_DEVICES.add("DHF-LX9");
        ArrayList arrayList2 = new ArrayList();
        HUAWEI_FOLD_MODELS = arrayList2;
        arrayList2.add("TAH-N29m");
        HUAWEI_FOLD_MODELS.add("ALT-AL00");
        HUAWEI_FOLD_MODELS.add("TGW-AL00");
        HUAWEI_FOLD_MODELS.add("ALT-L29");
        HUAWEI_FOLD_MODELS.add("TGW-L29");
        HUAWEI_FOLD_MODELS.add("ALT-AL10");
        HUAWEI_FOLD_MODELS.add("TWH-AL10");
    }

    public static boolean isFoldDevice() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1d70aa8c", new Object[0])).booleanValue();
        }
        if ("samsung".equalsIgnoreCase(Build.BRAND) && StringUtils.equals("SM-F9000", Build.MODEL)) {
            return true;
        }
        if ((HUAWEI_BRAND.equalsIgnoreCase(Build.BRAND) && (HUAWEI_FOLD_DEVICES.contains(Build.DEVICE) || HUAWEI_FOLD_MODELS.contains(Build.MODEL))) || StringUtils.equals(PhoneCashierMspEngine.getMspWallet().getWalletConfig("MQP_foldable_device_model_10550"), nom.VALUE_YES)) {
            return true;
        }
        if (StringUtils.equals(PhoneCashierMspEngine.getMspWallet().getWalletConfig("MQP_degrade_foldable_device_10550"), nom.VALUE_YES)) {
            return false;
        }
        return isOPPOFold() || isVivoFoldableDevice() || isXiaomiFold() || isHwFoldableDevice(GlobalHelper.getInstance().getContext()) || isHonorFoldableDevice(GlobalHelper.getInstance().getContext());
    }

    public static boolean isPadWindow(Resources resources) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("19517105", new Object[]{resources})).booleanValue() : (resources.getConfiguration().screenLayout & 15) >= 3;
    }

    private static boolean isOPPOFold() {
        try {
            Class<?> cls = Class.forName("com.oplus.content.OplusFeatureConfigManager");
            Object invoke = cls.getDeclaredMethod("hasFeature", String.class).invoke(cls.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]), "oplus.hardware.type.fold");
            if (!(invoke instanceof Boolean)) {
                return false;
            }
            return ((Boolean) invoke).booleanValue();
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
            return false;
        }
    }

    private static boolean isVivoFoldableDevice() {
        try {
            Class<?> cls = Class.forName("android.util.FtDeviceInfo");
            return "foldable".equals(cls.getMethod("getDeviceType", new Class[0]).invoke(cls, new Object[0]));
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
            return false;
        }
    }

    private static boolean isXiaomiFold() {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return ((Integer) cls.getMethod("getInt", String.class, Integer.TYPE).invoke(cls, "persist.sys.muiltdisplay_type", 0)).intValue() == 2;
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
            return false;
        }
    }

    public static boolean isPadDevice() {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return ((String) cls.getMethod("get", String.class, String.class).invoke(cls, "ro.build.characteristics", "")).contains("tablet");
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
            return false;
        }
    }

    private static boolean isHwFoldableDevice(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6edc561b", new Object[]{context})).booleanValue();
        }
        if (context == null) {
            return false;
        }
        try {
            if (HUAWEI_BRAND.equalsIgnoreCase(Build.MANUFACTURER)) {
                if (context.getPackageManager().hasSystemFeature("com.huawei.hardware.sensor.posture")) {
                    return true;
                }
            }
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
        return false;
    }

    private static boolean isHonorFoldableDevice(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7aa5e234", new Object[]{context})).booleanValue();
        }
        if (context == null) {
            return false;
        }
        try {
            if ("HONOR".equalsIgnoreCase(Build.MANUFACTURER)) {
                if (context.getPackageManager().hasSystemFeature("com.hihonor.hardware.sensor.posture")) {
                    return true;
                }
            }
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
        return false;
    }
}
