package com.taobao.android.change.app.icon.utils;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tlog.adapter.AdapterForTLog;
import com.ut.device.UTDevice;
import tb.igc;
import tb.kge;

/* loaded from: classes4.dex */
public class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1434206615);
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str}) : a(str, a());
    }

    public static int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[0])).intValue() : c.a(c.ORANGE_KEY_CHANGE_APP_ICON_ERROR_MSG_UT_MAX_LENGTH, 300);
    }

    public static String a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("75f5ebaf", new Object[]{str, new Integer(i)});
        }
        try {
            return TextUtils.isEmpty(str) ? str : str.substring(0, Math.min(str.length(), i));
        } catch (Exception e) {
            e.printStackTrace();
            return "-1";
        }
    }

    public static boolean a(int i) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821939f", new Object[]{new Integer(i)})).booleanValue();
        }
        try {
            int abs = Math.abs(UTDevice.getUtdid(igc.b()).hashCode()) % 10000;
            if (abs < i) {
                z = true;
            }
            AdapterForTLog.logd(igc.TAG, "isABTest : value=" + i + " flagIndex=" + abs);
            return z;
        } catch (Exception e) {
            AdapterForTLog.loge(igc.TAG, "error " + e.getMessage(), e);
            return z;
        }
    }

    public static <T> T a(String str, Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("21de4147", new Object[]{str, cls});
        }
        try {
            return (T) JSON.parseObject(str, cls);
        } catch (Exception e) {
            AdapterForTLog.loge(igc.TAG, "jsonParseObject error " + e.getMessage(), e);
            return null;
        }
    }

    public static boolean b() {
        try {
            Class<?> cls = Class.forName("com.huawei.system.BuildEx");
            return "Harmony".equalsIgnoreCase(cls.getMethod("getOsBrand", new Class[0]).invoke(cls, new Object[0]).toString());
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[0]) : !b() ? "-1" : a("hw_sc.build.platform.version", "");
    }

    private static String a(String str, String str2) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            String str3 = (String) cls.getDeclaredMethod("get", String.class).invoke(cls, str);
            return TextUtils.isEmpty(str3) ? str2 : str3;
        } catch (Throwable th) {
            th.printStackTrace();
            return str2;
        }
    }
}
