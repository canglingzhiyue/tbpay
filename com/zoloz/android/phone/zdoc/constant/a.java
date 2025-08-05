package com.zoloz.android.phone.zdoc.constant;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.cji;
import tb.kge;

/* loaded from: classes9.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static String f24737a;
    public static String b;
    public static String c;
    public static String d;
    public static String e;
    public static String f;
    public static String g;
    public static String h;
    private static Map i;

    static {
        kge.a(-2079104256);
        f24737a = "Z2000";
        b = "Z2001";
        c = "Z2002";
        d = "Z2003";
        e = "Z2004";
        f = "Z2005";
        g = "Z2006";
        h = "Z2007";
        i = new HashMap() { // from class: com.zoloz.android.phone.zdoc.constant.DocCodeConstants$1
            {
                put(a.f24737a, cji.SYSTEM_ERROR_MSG);
                put(a.b, "Failed to access the camera");
                put(a.c, "User quit");
                put(a.d, "Not connected to Internet");
                put(a.e, "Time out");
                put(a.f, "Verification Interrupted");
                put(a.g, "Too many attempts");
                put(a.h, "Quality check failed");
            }
        };
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str}) : String.format("%s(%s)", i.get(str), str);
    }
}
