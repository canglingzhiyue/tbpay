package com.taobao.taolive.room.utils;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.pmd;
import tb.pnj;
import tb.riy;

/* loaded from: classes8.dex */
public class ab {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static final String f21754a = "TaoLive";
    private static String b;
    private static String c;
    private static int d;

    static {
        kge.a(1482635924);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : d.a();
    }

    private static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(riy.ARRAY_START_STR);
        stringBuffer.append(b);
        stringBuffer.append("-");
        stringBuffer.append(c);
        stringBuffer.append(":");
        stringBuffer.append(d);
        stringBuffer.append(riy.ARRAY_END_STR);
        stringBuffer.append(str);
        return stringBuffer.toString();
    }

    private static void a(StackTraceElement[] stackTraceElementArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cccacb29", new Object[]{stackTraceElementArr});
            return;
        }
        b = stackTraceElementArr[1].getFileName();
        c = stackTraceElementArr[1].getMethodName();
        d = stackTraceElementArr[1].getLineNumber();
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        } else if (!a()) {
        } else {
            a(new Throwable().getStackTrace());
            pnj m = pmd.a().m();
            if (str == null) {
                str = f21754a;
            }
            m.a(str, a(str2));
        }
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{str, str2});
        } else if (a()) {
            a(new Throwable().getStackTrace());
            pnj m = pmd.a().m();
            if (str == null) {
                str = f21754a;
            }
            m.a(str, a(str2));
        } else if (pmd.a().m() == null) {
        } else {
            pnj m2 = pmd.a().m();
            if (str == null) {
                str = f21754a;
            }
            m2.a(str, str2);
        }
    }

    public static void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f277e37e", new Object[]{str, str2});
        } else if (pmd.a().m() == null) {
        } else {
            pnj m = pmd.a().m();
            if (str == null) {
                str = f21754a;
            }
            m.a(str, str2);
        }
    }

    public static void d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f180e7f", new Object[]{str, str2});
        } else if (!a()) {
        } else {
            a(new Throwable().getStackTrace());
            pnj m = pmd.a().m();
            if (str == null) {
                str = f21754a;
            }
            m.b(str, a(str2));
        }
    }

    public static void e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb83980", new Object[]{str, str2});
        } else if (a()) {
            a(new Throwable().getStackTrace());
            pnj m = pmd.a().m();
            if (str == null) {
                str = f21754a;
            }
            m.b(str, a(str2));
        } else {
            pnj m2 = pmd.a().m();
            if (str == null) {
                str = f21754a;
            }
            m2.b(str, str2);
        }
    }

    public static void f(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98586481", new Object[]{str, str2});
        } else if (a()) {
            a(new Throwable().getStackTrace());
            pnj m = pmd.a().m();
            if (str == null) {
                str = f21754a;
            }
            m.c(str, a(str2));
        } else {
            pnj m2 = pmd.a().m();
            if (str == null) {
                str = f21754a;
            }
            m2.c(str, str2);
        }
    }
}
