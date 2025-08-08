package com.taobao.android.searchbaseframe.util;

import android.os.Handler;
import android.os.Looper;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import android.widget.Toast;
import com.alibaba.android.icart.core.QueryParamsManager;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import java.io.PrintWriter;
import java.io.StringWriter;
import tb.imo;
import tb.kge;

/* loaded from: classes6.dex */
public class k {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final k f15017a;
    private static a d;
    private String b = "LibSF.";
    private boolean c;
    private volatile Handler e;

    /* loaded from: classes6.dex */
    public interface a {
        void a(String str, String str2);

        void a(String str, String str2, Throwable th);
    }

    static {
        kge.a(-1182079747);
        f15017a = new k();
        try {
            d = new a() { // from class: com.taobao.android.searchbaseframe.util.k.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.searchbaseframe.util.k.a
                public void a(String str, String str2) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                        return;
                    }
                    try {
                        TLog.loge(QueryParamsManager.CartFeedFlowType.search, str, str2);
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }

                @Override // com.taobao.android.searchbaseframe.util.k.a
                public void a(String str, String str2, Throwable th) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("c430ebf9", new Object[]{this, str, str2, th});
                        return;
                    }
                    try {
                        TLog.loge(QueryParamsManager.CartFeedFlowType.search, str, str2, th);
                    } catch (Throwable th2) {
                        th2.printStackTrace();
                    }
                }
            };
        } catch (Throwable unused) {
            Log.e("[XS.base]", "no tlog");
        }
    }

    public static k a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (k) ipChange.ipc$dispatch("3af7668d", new Object[0]) : f15017a;
    }

    public static void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{new Boolean(z)});
        } else {
            f15017a.b(z);
        }
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : f15017a.c;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        this.b = str;
        if (!StringUtils.isEmpty(str)) {
            return;
        }
        this.b = "SET_YOUR_TAG_IN_CONFIG.";
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            this.c = z;
        }
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.c;
    }

    private Handler d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("a41b85fb", new Object[]{this});
        }
        if (this.e == null) {
            synchronized (k.class) {
                if (this.e == null) {
                    this.e = new Handler(Looper.getMainLooper());
                }
            }
        }
        return this.e;
    }

    public void b(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            d().post(new Runnable() { // from class: com.taobao.android.searchbaseframe.util.k.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        Toast.makeText(imo.c(), str, 0).show();
                    }
                }
            });
        }
    }

    public static void a(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c430ebf9", new Object[]{str, str2, th});
        } else {
            f15017a.b(str, str2, th);
        }
    }

    public void b(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("586f5b98", new Object[]{this, str, str2, th});
        } else {
            a(str, str2, th, true);
        }
    }

    public void a(String str, String str2, Throwable th, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1ed45fb", new Object[]{this, str, str2, th, new Boolean(z)});
            return;
        }
        String str3 = this.b + str;
        String str4 = "[error] " + str2;
        c(str3, str4, th);
        d(str3, str4, th);
        if (!z) {
            return;
        }
        g(str3, str4);
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        } else {
            f15017a.b(str, str2);
        }
    }

    public void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
        } else {
            a(str, str2, null, false);
        }
    }

    public void a(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5cd3435", new Object[]{this, str, str2, objArr});
        } else {
            a(str, String.format(str2, objArr), null, false);
        }
    }

    public static void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f277e37e", new Object[]{str, str2});
        } else {
            f15017a.d(str, str2);
        }
    }

    public void d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f180e7f", new Object[]{this, str, str2});
        } else if (!this.c) {
        } else {
            String str3 = this.b + str;
            String str4 = "[warning] " + str2;
        }
    }

    public static void e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb83980", new Object[]{str, str2});
        } else {
            f15017a.f(str, str2);
        }
    }

    public void f(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98586481", new Object[]{this, str, str2});
        } else if (!this.c) {
        } else {
            String str3 = this.b + str;
            String str4 = "[debug] " + str2;
        }
    }

    public void c(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d4caf3", new Object[]{this, str, str2, objArr});
        } else if (!this.c) {
        } else {
            String str3 = this.b + str;
            String str4 = "[debug] " + String.format(str2, objArr);
        }
    }

    private void c(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecadcb37", new Object[]{this, str, str2, th});
        } else {
            Log.e(str, str2, th);
        }
    }

    private void g(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24f88f82", new Object[]{this, str, str2});
        } else if (!this.c) {
        } else {
            b(str + "  " + str2);
        }
    }

    private void d(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80ec3ad6", new Object[]{this, str, str2, th});
            return;
        }
        a aVar = d;
        if (aVar == null) {
            return;
        }
        try {
            if (th == null) {
                aVar.a(str, str2);
            } else {
                aVar.a(str, str2, th);
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    public static String a(Throwable th, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("edf08c69", new Object[]{th, str});
        }
        if (th == null) {
            return str;
        }
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        if (str != null) {
            printWriter.append((CharSequence) str);
        }
        printWriter.append(":");
        th.printStackTrace(printWriter);
        return stringWriter.toString();
    }

    public static void d(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d89652", new Object[]{str, str2, objArr});
        } else if (!f15017a.c || objArr == null) {
        } else {
            try {
                if (objArr.length == 0) {
                    return;
                }
                String.format(str2, objArr);
            } catch (Exception e) {
                k kVar = f15017a;
                kVar.c(str, "Format err: " + str2, e);
            }
        }
    }

    public static void e(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddc61b1", new Object[]{str, str2, objArr});
        } else if (!f15017a.c) {
        } else {
            try {
                String.format(str2, objArr);
            } catch (Exception e) {
                k kVar = f15017a;
                kVar.c(str, "Format err: " + str2, e);
            }
        }
    }

    public static void f(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13e02d10", new Object[]{str, str2, objArr});
        } else if (!f15017a.c) {
        } else {
            try {
                String format = String.format(str2, objArr);
                f15017a.c(str, format, (Throwable) null);
                if (d == null) {
                    return;
                }
                d.a(str, format);
            } catch (Exception e) {
                k kVar = f15017a;
                kVar.c(str, "Format err: " + str2, e);
            }
        }
    }

    public static void a(String str, String str2, JSON json) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("578c98f3", new Object[]{str, str2, json});
        } else if (!f15017a.c) {
        } else {
            try {
                String str3 = str2 + "\n" + json;
            } catch (Exception e) {
                f15017a.c(str, "Format err: " + str2, e);
            }
        }
    }
}
