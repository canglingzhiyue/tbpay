package com.taobao.android.interactive_common.video;

import android.content.Intent;
import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.log.TLog;

/* loaded from: classes5.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        try {
            return Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("ShortVideo", "isBlackLightVideoDrawableEnabled", "false"));
        } catch (Throwable th) {
            TLog.loge("TBVideoConfig", "isBlackLightVideoDrawableEnabled error", th);
            return false;
        }
    }

    private static boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[0])).booleanValue();
        }
        try {
            return Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("ShortVideo", "isNativeFullScreenEnabled", "true"));
        } catch (Throwable th) {
            TLog.loge("TBVideoConfig", "isNativeFullScreenEnabled error", th);
            return false;
        }
    }

    private static boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[0])).booleanValue();
        }
        try {
            return Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("ShortVideo", "isNativeFullScreenForceEnabled", "false"));
        } catch (Throwable th) {
            TLog.loge("TBVideoConfig", "isNativeFullScreenForceEnabled error", th);
            return false;
        }
    }

    private static boolean b(String str) {
        JSONArray parseArray;
        int size;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{str})).booleanValue();
        }
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        try {
            String config = OrangeConfig.getInstance().getConfig("ShortVideo", "degradeToOldTypeList", "[\"taobaoerlou\",\"taolive\",\"taobaolive\",\"shop2018_double11\",\"gohi_home\",\"default\",\"preview\",\"shop_collect\",\"contentPlat\"]");
            if (StringUtils.isEmpty(config) || (parseArray = JSONArray.parseArray(config)) == null || (size = parseArray.size()) <= 0) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (str.equalsIgnoreCase(parseArray.getString(i))) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            TLog.loge("TBVideoConfig", "isDegradeToOld error", th);
            return false;
        }
    }

    private static boolean a(String str, String str2) {
        JSONArray parseArray;
        int size;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{str, str2})).booleanValue();
        }
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        if (StringUtils.isEmpty(str2) || (parseArray = JSONArray.parseArray(str2)) == null || (size = parseArray.size()) <= 0) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (str.equalsIgnoreCase(parseArray.getString(i))) {
                return true;
            }
        }
        return false;
    }

    public static boolean a(Intent intent) {
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d8033c29", new Object[]{intent})).booleanValue();
        }
        if (intent == null || (data = intent.getData()) == null) {
            return false;
        }
        if (!h()) {
            return true;
        }
        if (i()) {
            return false;
        }
        String queryParameter = data.getQueryParameter("type");
        return !StringUtils.isEmpty(queryParameter) && b(queryParameter);
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue();
        }
        try {
            return Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("ShortVideo", "transferAnimationEnable", "false"));
        } catch (Throwable th) {
            TLog.loge("TBVideoConfig", "isTransferAnimationEnabled error", th);
            return false;
        }
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue();
        }
        try {
            return Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("ShortVideo", "isWaterDisable", "false"));
        } catch (Throwable th) {
            TLog.loge("TBVideoConfig", "isWaterDisable error", th);
            return false;
        }
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue();
        }
        try {
            return Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("ShortVideo", "degradeNavBeforeProcess", "false"));
        } catch (Throwable th) {
            TLog.loge("TBVideoConfig", "isWaterDisable error", th);
            return false;
        }
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[0])).booleanValue();
        }
        try {
            return Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("ShortVideo", "isPullLeftPersonalEnabled", "false"));
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue() : a(str, OrangeConfig.getInstance().getConfig("ShortVideo", "ggSourceList", "[\"guangguang\",\"guangguang_follow\"]"));
    }
}
