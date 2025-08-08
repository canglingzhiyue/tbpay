package com.alibaba.analytics.core.logbuilder;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import tb.aob;
import tb.kge;

/* loaded from: classes.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static String f2085a;
    private static boolean b;

    static {
        kge.a(-1378984263);
        f2085a = "";
        b = false;
    }

    public static String a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{context});
        }
        if (b || context == null) {
            String Q = aob.a().Q();
            if (StringUtils.isEmpty(Q)) {
                return f2085a + ",oaid=" + aob.a().L();
            }
            return f2085a + ",oaid=" + aob.a().L() + ",oaid2=" + Q;
        }
        synchronized (e.class) {
            if (b) {
                return f2085a;
            }
            if (a()) {
                String b2 = b();
                f2085a = "hmos=1,hmv=" + b2;
            } else {
                f2085a = "hmos=0";
            }
            b = true;
            return f2085a + ",oaid=" + aob.a().L();
        }
    }

    private static boolean a() {
        try {
            Class<?> cls = Class.forName("com.huawei.system.BuildEx");
            return "harmony".equalsIgnoreCase(cls.getMethod("getOsBrand", new Class[0]).invoke(cls, new Object[0]).toString());
        } catch (Throwable unused) {
            return false;
        }
    }

    private static String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]) : a("hw_sc.build.platform.version", "");
    }

    private static String a(String str, String str2) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            String str3 = (String) cls.getDeclaredMethod("get", String.class).invoke(cls, str);
            return StringUtils.isEmpty(str3) ? str2 : str3;
        } catch (Throwable unused) {
            return str2;
        }
    }
}
