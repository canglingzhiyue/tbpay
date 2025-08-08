package com.taobao.android.behavix.utils;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavix.behavixswitch.a;
import tb.kge;

/* loaded from: classes.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String LEVEL_HIGH = "h";
    public static final String LEVEL_LOW = "l";
    public static final String LEVEL_MED = "m";

    /* renamed from: a  reason: collision with root package name */
    private static Boolean f9214a;

    static {
        kge.a(1315706276);
        f9214a = null;
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        Boolean bool = f9214a;
        if (bool != null) {
            return bool.booleanValue();
        }
        String i = a.b.i();
        if (StringUtils.isEmpty(i)) {
            return true;
        }
        String c = c();
        String[] split = i.split(",");
        f9214a = false;
        int length = split.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            } else if (StringUtils.equals(split[i2], c)) {
                f9214a = true;
                break;
            } else {
                i2++;
            }
        }
        Boolean bool2 = f9214a;
        return bool2 != null && bool2.booleanValue();
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
        } else {
            f9214a = null;
        }
    }

    public static String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd025a76", new Object[0]);
        }
        try {
            int a2 = com.taobao.application.common.c.a().a("deviceLevel", -1);
            return a2 == 0 ? "h" : a2 == 1 ? "m" : "l";
        } catch (Throwable th) {
            th.printStackTrace();
            return "h";
        }
    }
}
