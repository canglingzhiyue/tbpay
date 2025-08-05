package com.taobao.search.common.util;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import com.taobao.tlog.adapter.AdapterForTLog;
import tb.kge;

@Deprecated
/* loaded from: classes7.dex */
public class q {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f19042a;
    private static volatile Handler b;

    static {
        kge.a(-2031815233);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : f19042a;
    }

    public static void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{new Boolean(z)});
        } else {
            f19042a = z;
        }
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        } else if (str == null || str2 == null || !f19042a) {
        } else {
            String str3 = "TBSearch." + str;
        }
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{str, str2});
        } else if (str == null || str2 == null || !f19042a) {
        } else {
            Log.e("TBSearch." + str, str2);
        }
    }

    public static void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f277e37e", new Object[]{str, str2});
        } else if (str == null || str2 == null || !f19042a) {
        } else {
            String str3 = "TBSearch." + str;
        }
    }

    public static void d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f180e7f", new Object[]{str, str2});
        } else if (str == null || str2 == null || !f19042a) {
        } else {
            String str3 = "TBSearch." + str;
        }
    }

    private static Handler b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("ac18683d", new Object[0]);
        }
        if (b == null) {
            synchronized (q.class) {
                if (b == null) {
                    b = new Handler(Looper.getMainLooper());
                }
            }
        }
        return b;
    }

    private static void a(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else {
            b().post(new Runnable() { // from class: com.taobao.search.common.util.q.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        Toast.makeText(Globals.getApplication(), str, 0).show();
                    }
                }
            });
        }
    }

    public static void a(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c430ebf9", new Object[]{str, str2, th});
            return;
        }
        String str3 = "TBSearch." + str;
        String str4 = "[mainFailure] " + str2;
        d(str3, str4, th);
        e(str3, str4, th);
        l(str3, str4);
    }

    public static void e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb83980", new Object[]{str, str2});
        } else {
            a(str, str2, null);
        }
    }

    public static void f(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98586481", new Object[]{str, str2});
            return;
        }
        String str3 = "TBSearch." + str;
        String str4 = "[paramError] " + str2;
        d(str3, str4, null);
        e(str3, str4, null);
        l(str3, str4);
    }

    public static void g(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24f88f82", new Object[]{str, str2});
            return;
        }
        String str3 = "TBSearch." + str;
        String str4 = "[dataError] " + str2;
        d(str3, str4, null);
        e(str3, str4, null);
        l(str3, str4);
    }

    public static void b(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("586f5b98", new Object[]{str, str2, th});
            return;
        }
        String str3 = "TBSearch." + str;
        String str4 = "[dataError] " + str2;
        d(str3, str4, th);
        e(str3, str4, th);
        l(str3, str4);
    }

    public static void c(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecadcb37", new Object[]{str, str2, th});
            return;
        }
        String str3 = "TBSearch." + str;
        String str4 = "[resumableFailure] " + str2;
        d(str3, str4, th);
        e(str3, str4, th);
    }

    public static void h(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b198ba83", new Object[]{str, str2});
        } else {
            c(str, str2, null);
        }
    }

    public static void i(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e38e584", new Object[]{str, str2});
            return;
        }
        String str3 = "TBSearch." + str;
        String str4 = "[debugInfo] " + str2;
    }

    public static void j(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cad91085", new Object[]{str, str2});
            return;
        }
        String str3 = "TBSearch." + str;
        String str4 = "[decisionBranch] " + str2;
    }

    public static void k(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57793b86", new Object[]{str, str2});
            return;
        }
        e("TBSearch." + str, "[pageInfo] " + str2, null);
    }

    private static void d(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80ec3ad6", new Object[]{str, str2, th});
        } else {
            Log.e(str, str2, th);
        }
    }

    private static void l(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4196687", new Object[]{str, str2});
        } else if (!f19042a) {
        } else {
            a(str + "  " + str2);
        }
    }

    private static void e(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("152aaa75", new Object[]{str, str2, th});
            return;
        }
        try {
            if (th == null) {
                AdapterForTLog.loge(str, str2);
            } else {
                AdapterForTLog.loge(str, str2, th);
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }
}
