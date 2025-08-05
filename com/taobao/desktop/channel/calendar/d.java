package com.taobao.desktop.channel.calendar;

import android.content.Context;
import android.content.pm.PackageManager;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.khc;
import tb.khu;

/* loaded from: classes7.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1959050060);
    }

    public static String a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{context});
        }
        if (!khc.b()) {
            return "error: oppo calender service orange disable";
        }
        if (!b(context)) {
            return "error: not support oppo calender service";
        }
        if (!c(context)) {
            return "error: not support oppo calender push service";
        }
        khu.a("CalenderOppoManager serviceEnable true");
        return "";
    }

    public static boolean b(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9eca1003", new Object[]{context})).booleanValue() : a(context, b.OPPO_AUTHORITY, "support_event_instant_link");
    }

    public static boolean c(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9f76bba2", new Object[]{context})).booleanValue() : a(context, b.OPPO_AUTHORITY, "support_reminder_instant_link");
    }

    private static boolean a(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d18de978", new Object[]{context, str, str2})).booleanValue();
        }
        try {
            return context.getPackageManager().getApplicationInfo(str, 128).metaData.getBoolean(str2);
        } catch (PackageManager.NameNotFoundException e) {
            khu.a("CalenderHuaweiManager.isFixCalendarVersion error：" + e);
            return false;
        }
    }
}
