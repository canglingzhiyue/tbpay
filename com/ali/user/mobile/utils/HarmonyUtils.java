package com.ali.user.mobile.utils;

import android.os.Build;
import mtopsdk.common.util.StringUtils;
import com.ali.user.mobile.harmony.HarmonyLoginBackupImpl;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.config.LoginSwitch;
import com.taobao.tlog.adapter.AdapterForTLog;
import tb.kge;

/* loaded from: classes2.dex */
public class HarmonyUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-115233999);
    }

    public static boolean isSupportInitHarmony() {
        String[] split;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1f67c15c", new Object[0])).booleanValue();
        }
        try {
            AdapterForTLog.loge(HarmonyLoginBackupImpl.TAG, "isSupportInitHarmony");
            String config = LoginSwitch.getConfig("support_init_backup_harmony_brand", "huawei");
            for (String str : config.split(";")) {
                String str2 = Build.BRAND;
                String str3 = Build.MANUFACTURER;
                AdapterForTLog.loge(HarmonyLoginBackupImpl.TAG, "currentBrand:" + str2 + " manufacturer:" + str3);
                if (!str.equalsIgnoreCase(str2) && !str.equalsIgnoreCase(str3)) {
                }
                z = true;
                break;
            }
            UserTrackAdapter.sendUT(HarmonyLoginBackupImpl.TAG, "isSupportInitHarmony", String.valueOf(z), config, null);
        } catch (Exception e) {
            AdapterForTLog.loge(HarmonyLoginBackupImpl.TAG, "isSupportInitHarmony error", e);
        }
        AdapterForTLog.loge(HarmonyLoginBackupImpl.TAG, "isSupportInitHarmony " + z);
        return z;
    }

    public static boolean isHarmonyOs() {
        try {
            Class<?> cls = Class.forName("com.huawei.system.BuildEx");
            return "Harmony".equalsIgnoreCase(cls.getMethod("getOsBrand", new Class[0]).invoke(cls, new Object[0]).toString());
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String getHarmonyVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("592cda11", new Object[0]) : !isHarmonyOs() ? "-1" : getProp("hw_sc.build.platform.version", "");
    }

    private static String getProp(String str, String str2) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            String str3 = (String) cls.getDeclaredMethod("get", String.class).invoke(cls, str);
            return StringUtils.isEmpty(str3) ? str2 : str3;
        } catch (Throwable th) {
            th.printStackTrace();
            return str2;
        }
    }
}
