package com.taobao.tlog.adapter;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TTraceLog;

/* loaded from: classes9.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f22962a = false;

    static {
        try {
            Class.forName("com.taobao.tao.log.TTraceLog");
            f22962a = true;
        } catch (ClassNotFoundException unused) {
            f22962a = false;
        }
    }

    public static void a(String str, String str2, String str3, String str4, long j, String str5, String str6, String str7, int i, String str8, String str9) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d28d9ec5", new Object[]{str, str2, str3, str4, new Long(j), str5, str6, str7, new Integer(i), str8, str9});
        } else if (!f22962a) {
        } else {
            TTraceLog.event(str, str2, str3, str4, j, str5, str6, str7, i, str8, str9);
        }
    }

    public static void a(String str, String str2, String str3, long j, String str4, String str5, String str6, String str7) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24b71166", new Object[]{str, str2, str3, new Long(j), str4, str5, str6, str7});
        } else {
            a(str, str2, str3, "", j, str4, str5, str6, 0, "", str7);
        }
    }

    public static void b(String str, String str2, String str3, String str4, long j, String str5, String str6, String str7, int i, String str8, String str9) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("553cb9c6", new Object[]{str, str2, str3, str4, new Long(j), str5, str6, str7, new Integer(i), str8, str9});
        } else if (!f22962a) {
        } else {
            TTraceLog.debugEvent(str, str2, str3, str4, j, str5, str6, str7, i, str9);
        }
    }
}
