package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.PrintWriter;
import java.io.StringWriter;

/* loaded from: classes4.dex */
public class tco {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f34027a;
    private static b b;

    /* loaded from: classes4.dex */
    public interface b {
        void a(String str, Object... objArr);

        void a(Throwable th);

        void b(String str, Object... objArr);

        void b(Throwable th);

        void c(String str, Object... objArr);
    }

    public static /* synthetic */ boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : f34027a;
    }

    static {
        kge.a(-301261287);
        f34027a = false;
        b = new a();
    }

    public static void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{new Boolean(z)});
        } else {
            f34027a = z;
        }
    }

    public static void a(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82c81dbf", new Object[]{str, objArr});
        } else if (!f34027a) {
        } else {
            b.a(str, objArr);
        }
    }

    public static void b(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a2d52de", new Object[]{str, objArr});
        } else if (!f34027a) {
        } else {
            b.b(str, objArr);
        }
    }

    public static void c(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("919287fd", new Object[]{str, objArr});
        } else {
            b.c(str, objArr);
        }
    }

    public static void b(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd742bac", new Object[]{th});
        } else if (!f34027a) {
        } else {
            b.b(th);
        }
    }

    public static void a(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb9ad88d", new Object[]{th});
            return;
        }
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        tcr.a().a("exception", "exception", "e", th.getMessage(), stringWriter.toString(), 0L);
        b.a(th);
    }

    /* loaded from: classes4.dex */
    public static class a implements b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1173885913);
            kge.a(-916068576);
        }

        private a() {
        }

        @Override // tb.tco.b
        public void a(String str, Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("82c81dbf", new Object[]{this, str, objArr});
            } else {
                d(str, objArr);
            }
        }

        @Override // tb.tco.b
        public void b(String str, Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8a2d52de", new Object[]{this, str, objArr});
            } else {
                d(str, objArr);
            }
        }

        @Override // tb.tco.b
        public void c(String str, Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("919287fd", new Object[]{this, str, objArr});
            } else {
                Log.e("FastSp", d(str, objArr));
            }
        }

        @Override // tb.tco.b
        public void b(Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fd742bac", new Object[]{this, th});
            } else if (tco.a()) {
                throw new RuntimeException(th);
            }
        }

        @Override // tb.tco.b
        public void a(Throwable th) {
            StackTraceElement[] stackTrace;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb9ad88d", new Object[]{this, th});
                return;
            }
            th.printStackTrace();
            if (th.getMessage() == null) {
                return;
            }
            tco.c("exception", th.getClass().getSimpleName(), th.getMessage());
            for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                tco.c("exception", stackTraceElement.getClassName(), stackTraceElement.getMethodName(), Integer.valueOf(stackTraceElement.getLineNumber()));
            }
            tco.c("exception", "-----------");
        }

        private static String d(String str, Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("11089304", new Object[]{str, objArr});
            }
            StringBuilder sb = new StringBuilder();
            sb.append(" ");
            sb.append(str);
            if (objArr == null) {
                return "";
            }
            for (Object obj : objArr) {
                if (obj != null) {
                    sb.append("->");
                    sb.append(obj.toString());
                }
            }
            return sb.toString();
        }
    }
}
