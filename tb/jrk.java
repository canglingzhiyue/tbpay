package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public class jrk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f29731a;
    private static b b;

    /* loaded from: classes6.dex */
    public interface b {
        void a(String str, Object... objArr);

        void a(Throwable th);

        void b(String str, Object... objArr);
    }

    static {
        kge.a(343695569);
        f29731a = false;
        b = new a();
    }

    public static void a(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82c81dbf", new Object[]{str, objArr});
        } else if (!f29731a) {
        } else {
            b.a(str, objArr);
        }
    }

    public static void b(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a2d52de", new Object[]{str, objArr});
        } else {
            b.b(str, objArr);
        }
    }

    public static void a(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb9ad88d", new Object[]{th});
        } else {
            b.a(th);
        }
    }

    /* loaded from: classes6.dex */
    public static class a implements b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1590223215);
            kge.a(-403124376);
        }

        private a() {
        }

        @Override // tb.jrk.b
        public void a(String str, Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("82c81dbf", new Object[]{this, str, objArr});
            } else {
                c(str, objArr);
            }
        }

        @Override // tb.jrk.b
        public void b(String str, Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8a2d52de", new Object[]{this, str, objArr});
            } else {
                Log.e("VThread", c(str, objArr));
            }
        }

        @Override // tb.jrk.b
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
            jrk.b("exception", th.getClass().getSimpleName(), th.getMessage());
            for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                jrk.b("exception", stackTraceElement.getClassName(), stackTraceElement.getMethodName(), Integer.valueOf(stackTraceElement.getLineNumber()));
            }
            jrk.b("exception", "-----------");
        }

        private static String c(String str, Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("52c643", new Object[]{str, objArr});
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
