package com.taobao.android.weex_framework.util;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.util.u;
import com.taobao.tao.log.TLog;
import java.io.PrintWriter;
import java.io.StringWriter;
import tb.kge;
import tb.riy;

/* loaded from: classes6.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int LEVEL_DEBUG = 0;
    public static final int LEVEL_ERROR = 3;
    public static final int LEVEL_LOG = 1;
    public static final int LEVEL_WARN = 2;
    public static final String TAG = "[Weex]";

    /* renamed from: a  reason: collision with root package name */
    public static boolean f16089a;
    private static boolean b;
    private static boolean c;
    private static volatile a d;
    private static volatile b e;

    /* loaded from: classes6.dex */
    public interface a {
    }

    /* loaded from: classes6.dex */
    public interface b {
        void a(String str, String str2, Throwable th);
    }

    static {
        kge.a(-1694320886);
        f16089a = false;
        b = com.taobao.android.weex_framework.m.c();
        c = com.taobao.android.weex_framework.m.c();
        try {
            e = new b() { // from class: com.taobao.android.weex_framework.util.g.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.weex_framework.util.g.b
                public void a(String str, String str2, Throwable th) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("c430ebf9", new Object[]{this, str, str2, th});
                        return;
                    }
                    try {
                        if (th == null) {
                            TLog.loge(g.TAG, str, str2);
                            return;
                        }
                        TLog.loge(g.TAG, str, str2, th);
                        u.b a2 = u.a();
                        a2.a(str + ":" + str2, th);
                    } catch (Throwable th2) {
                        th2.printStackTrace();
                    }
                }
            };
        } catch (Throwable unused) {
            Log.e(TAG, "no tlog");
        }
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else {
            a("", str);
        }
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        } else if (!b) {
        } else {
            String str3 = TAG + str;
        }
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
        } else {
            b("", str);
        }
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{str, str2});
        } else if (!b) {
        } else {
            c(str, str2);
        }
    }

    public static void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f277e37e", new Object[]{str, str2});
        } else if (!b) {
        } else {
            String str3 = TAG + str;
        }
    }

    public static void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{str});
        } else {
            d("", str);
        }
    }

    public static void b(com.taobao.android.weex_framework.p pVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("216e8b0e", new Object[]{pVar, str});
        } else if (!b) {
        } else {
            e(a(pVar), str);
        }
    }

    public static void d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f180e7f", new Object[]{str, str2});
        } else if (!b) {
        } else {
            e(str, str2);
        }
    }

    public static void a(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe179b03", new Object[]{str, th});
        } else if (!b) {
        } else {
            b(str, th);
        }
    }

    public static void a(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c430ebf9", new Object[]{str, str2, th});
        } else if (!b) {
        } else {
            b(str, str2, th);
        }
    }

    public static void e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb83980", new Object[]{str, str2});
        } else {
            b(str, str2, null);
        }
    }

    public static void b(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("586f5b98", new Object[]{str, str2, th});
        } else if (!b) {
        } else {
            String str3 = TAG + str;
        }
    }

    public static void b(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1040462", new Object[]{str, th});
        } else {
            b(str, "", th);
        }
    }

    public static void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{str});
        } else {
            f("", str);
        }
    }

    public static void c(com.taobao.android.weex_framework.p pVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2772566d", new Object[]{pVar, str});
        } else {
            a(pVar, str, (Throwable) null);
        }
    }

    public static void a(com.taobao.android.weex_framework.p pVar, String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("daf527a6", new Object[]{pVar, str, th});
        } else {
            d(a(pVar), str, th);
        }
    }

    public static void a(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb9ad88d", new Object[]{th});
        } else {
            c("", th);
        }
    }

    public static void f(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98586481", new Object[]{str, str2});
        } else {
            c(str, str2, null);
        }
    }

    public static void c(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83f06dc1", new Object[]{str, th});
        } else {
            c(str, "", th);
        }
    }

    public static void c(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecadcb37", new Object[]{str, str2, th});
        } else {
            d(str, str2, th);
        }
    }

    public static void d(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80ec3ad6", new Object[]{str, str2, th});
        } else {
            a(str, str2, th, "Weex2 Java报错, 请查看adb logcat, 过滤'weex': \n");
        }
    }

    public static void a(String str, String str2, Throwable th, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6a6983", new Object[]{str, str2, th, str3});
        } else if (d != null) {
        } else {
            b bVar = e;
            if (bVar != null) {
                bVar.a(str, str2, th);
            }
            if (!a()) {
                e(str, str2, th);
            }
            if (th == null || !b) {
                return;
            }
            e(str3 + str2);
        }
    }

    public static void e(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("152aaa75", new Object[]{str, str2, th});
            return;
        }
        Log.e(TAG + str, str2, th);
    }

    public static void e(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{str});
        } else if (Looper.myLooper() == Looper.getMainLooper()) {
            Toast.makeText(com.taobao.android.weex_framework.m.b(), str, 0).show();
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.taobao.android.weex_framework.util.g.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        Toast.makeText(com.taobao.android.weex_framework.m.b(), str, 0).show();
                    }
                }
            });
        }
    }

    public static String b(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f5451674", new Object[]{th});
        }
        if (th == null) {
            return "";
        }
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static String a(com.taobao.android.weex_framework.p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d2478e1b", new Object[]{pVar});
        }
        return "[InstId " + pVar.getInstanceId() + riy.ARRAY_END_STR;
    }

    public static void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{new Boolean(z)});
        } else {
            b = z;
        }
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : b;
    }
}
