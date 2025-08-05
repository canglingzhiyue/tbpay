package com.ta.utdid2.android.utils;

import com.android.alibaba.ip.runtime.IpChange;
import com.ta.audid.utils.UtdidLogger;
import tb.kge;

/* loaded from: classes4.dex */
public class SystemProperties {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1419817929);
    }

    public static String get(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f6158a19", new Object[]{str}) : get(str, "");
    }

    public static String get(String str, String str2) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class, String.class).invoke(cls, str, str2);
        } catch (Exception e) {
            UtdidLogger.se("", e, new Object[0]);
            return str2;
        }
    }
}
