package com.taobao.android.editionswitcher;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import tb.kge;

/* loaded from: classes.dex */
public class l {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static PositionInfo f12307a;
    private static PositionInfo b;
    private static String c;
    private static String d;
    private static boolean e;

    static {
        kge.a(1581127844);
        e = false;
    }

    public static String a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{context});
        }
        if (!e) {
            return b.m(context);
        }
        if (d == null) {
            d = b.m(context);
        }
        return d;
    }

    public static PositionInfo b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PositionInfo) ipChange.ipc$dispatch("6c9fea16", new Object[]{context});
        }
        if (!e) {
            return b.b(context);
        }
        if (f12307a == null) {
            f12307a = b.b(context);
        }
        return f12307a;
    }

    public static PositionInfo c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PositionInfo) ipChange.ipc$dispatch("85a13bb5", new Object[]{context});
        }
        if (!e) {
            return b.c(context);
        }
        if (b == null) {
            b = b.c(context);
        }
        return b;
    }

    public static boolean d(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a0236741", new Object[]{context})).booleanValue() : !f(context) && !g(context) && !e(context);
    }

    public static boolean e(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a0d012e0", new Object[]{context})).booleanValue() : TextUtils.equals("OLD", a(context));
    }

    public static boolean f(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a17cbe7f", new Object[]{context})).booleanValue() : b(a(context));
    }

    public static boolean g(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a2296a1e", new Object[]{context})).booleanValue() : TextUtils.equals("CUN", a(context));
    }

    public static boolean i(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a382c15c", new Object[]{context})).booleanValue() : TextUtils.equals("OLD", c(context).editionCode);
    }

    public static boolean j(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a42f6cfb", new Object[]{context})).booleanValue() : b(c(context).editionCode);
    }

    private static boolean b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{str})).booleanValue() : TextUtils.isEmpty(str) || TextUtils.equals("CN", str);
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue() : !TextUtils.isEmpty(str) && !TextUtils.equals("CN", str) && !TextUtils.equals("CUN", str) && !TextUtils.equals("OLD", str);
    }

    public static void m(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6356fd4", new Object[]{context});
        } else if (!e) {
        } else {
            if (!(context instanceof Application)) {
                context = Globals.getApplication();
            }
            if (context == null) {
                return;
            }
            b = b.c(context);
            f12307a = b.b(context);
            d = b.m(context);
            c = b.c();
        }
    }
}
