package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tcrash.TCrashSDK;
import com.taobao.android.tcrash.UncaughtCrashType;

/* loaded from: classes6.dex */
public class ihc {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f29020a = false;
    private static b b = new a();

    /* loaded from: classes6.dex */
    public interface b {
        void a(String str, Object... objArr);

        void a(Throwable th);
    }

    public static void a(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82c81dbf", new Object[]{str, objArr});
            return;
        }
        TCrashSDK.instance().getCrashCaughtHeaderByType(UncaughtCrashType.JAVA_ONLY).addHeaderInfo(str, a(objArr));
        b.a(str, objArr);
    }

    public static void a(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb9ad88d", new Object[]{th});
        } else {
            b.a(th);
        }
    }

    public static String a(Object... objArr) {
        Object[] objArr2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2583e9f7", new Object[]{objArr});
        }
        if (objArr == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (Object obj : objArr) {
            if (obj.getClass().isArray()) {
                for (Object obj2 : (Object[]) obj) {
                    sb.append("->");
                    sb.append(obj2);
                }
            } else {
                sb.append("->");
                sb.append(obj);
            }
        }
        return sb.toString();
    }

    /* loaded from: classes6.dex */
    public static class a implements b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private a() {
        }

        @Override // tb.ihc.b
        public void a(String str, Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("82c81dbf", new Object[]{this, str, objArr});
            } else {
                Log.e("RProxy", b(str, objArr));
            }
        }

        @Override // tb.ihc.b
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
            ihc.a("exception", th.getClass().getSimpleName(), th.getMessage());
            for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                ihc.a("exception", stackTraceElement.getClassName(), stackTraceElement.getMethodName(), Integer.valueOf(stackTraceElement.getLineNumber()));
            }
            ihc.a("exception", "-----------");
        }

        private static String b(String str, Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("ef9cf982", new Object[]{str, objArr});
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
