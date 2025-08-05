package tb;

import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.config.b;
import com.taobao.android.searchbaseframe.util.k;
import com.taobao.search.sf.util.tlog.TLogTracker;
import java.io.PrintWriter;
import java.io.StringWriter;

/* loaded from: classes3.dex */
public class cot {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static String f26360a;
    private static boolean b;
    private static boolean c;
    private static a d;
    private static volatile Handler e;
    private static Boolean f;

    /* loaded from: classes3.dex */
    public interface a {
        void a(String str, String str2);

        void a(String str, String str2, Throwable th);
    }

    static {
        kge.a(1563311351);
        f26360a = "FEIS.";
        c = true;
        d = new a() { // from class: tb.cot.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.cot.a
            public void a(String str, String str2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                } else {
                    k.d(str, "%s", str2);
                }
            }

            @Override // tb.cot.a
            public void a(String str, String str2, Throwable th) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("c430ebf9", new Object[]{this, str, str2, th});
                } else {
                    k.f(str, "%s", k.a(th, str2));
                }
            }
        };
        f = null;
        k.a().b(com.a());
    }

    public static void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{new Boolean(z)});
        } else {
            b = z;
        }
    }

    private static Handler a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("b016d95e", new Object[0]);
        }
        if (e == null) {
            synchronized (cot.class) {
                if (e == null) {
                    e = new Handler(Looper.getMainLooper());
                }
            }
        }
        return e;
    }

    private static void a(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else {
            a().post(new Runnable() { // from class: tb.cot.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        Toast.makeText(com.b(), str, 0).show();
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
            a(str, str2, th, true);
        }
    }

    private static void a(String str, String str2, Throwable th, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1ed45fb", new Object[]{str, str2, th, new Boolean(z)});
            return;
        }
        String str3 = f26360a + str;
        String str4 = "[error] " + str2;
        if (b && z) {
            e(str3, str4);
        }
        if (!c) {
            return;
        }
        a(str3, str3, str4, th);
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{str, str2});
        } else {
            a(str, str2, (Throwable) null, true);
        }
    }

    public static void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f277e37e", new Object[]{str, str2});
        } else if (!b) {
        } else {
            b(f26360a + str, "[info] " + str2, (Throwable) null);
        }
    }

    public static void d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f180e7f", new Object[]{str, str2});
        } else if (!b) {
        } else {
            String str3 = f26360a + str;
            String str4 = "[debug] " + str2;
        }
    }

    public static void b(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbd0ff94", new Object[]{str, str2, objArr});
        } else if (!b) {
        } else {
            String str3 = f26360a + str;
            String str4 = "[debug] " + String.format(str2, objArr);
        }
    }

    public static void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{str, str2, str3});
            return;
        }
        if (b) {
            b(str + "|" + str2, str3, (Throwable) null);
        }
        if (!c) {
            return;
        }
        b(str, str2, str3);
    }

    private static void e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb83980", new Object[]{str, str2});
        } else if (!b) {
        } else {
            a(str + "  " + str2);
        }
    }

    private static void b(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("586f5b98", new Object[]{str, str2, th});
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

    private static void a(String str, String str2, String str3, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76502b6f", new Object[]{str, str2, str3, th});
            return;
        }
        try {
            if (th == null) {
                b(str, str2, str3);
                return;
            }
            c(str + "|" + str2 + "|" + str3, "-1", a("", th));
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    private static void b(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3509d07", new Object[]{str, str2, str3});
        } else {
            TLogTracker.b(str, str2, str3);
        }
    }

    private static void c(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b40669c8", new Object[]{str, str2, str3});
        } else {
            TLogTracker.a(str, str2, str3);
        }
    }

    public static String a(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fda15ffd", new Object[]{str, th});
        }
        if (th == null) {
            return str == null ? "" : str;
        }
        if (f == null) {
            f = Boolean.valueOf(b.bI());
        }
        if (f.booleanValue()) {
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            if (str != null) {
                printWriter.append((CharSequence) str);
            }
            printWriter.append(":");
            th.printStackTrace(printWriter);
            return stringWriter.toString();
        } else if (str == null) {
            return th.getMessage();
        } else {
            return str + ":" + th.getMessage();
        }
    }
}
