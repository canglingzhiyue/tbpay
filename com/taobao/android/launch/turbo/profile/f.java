package com.taobao.android.launch.turbo.profile;

import android.util.Pair;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;
import tb.gsv;
import tb.kge;

/* loaded from: classes5.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes5.dex */
    public interface e {
        void a();

        void b();
    }

    static {
        kge.a(718061544);
    }

    public static /* synthetic */ Object a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("bd3407ca", new Object[0]) : b();
    }

    public static Pair<Boolean, Long> a(int i, String str, String str2, e eVar) {
        Pair<Boolean, Long> create;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("cde4f555", new Object[]{new Integer(i), str, str2, eVar});
        }
        if (i >= 28) {
            create = c.a(str, str2, eVar);
        } else if (i >= 27) {
            create = b.a(str, str2, eVar);
        } else if (i >= 24) {
            create = a.a(str, str2, eVar);
        } else {
            create = Pair.create(false, -1L);
        }
        gsv.a("ProfileCompiler", "performCompile with result = " + create);
        return create;
    }

    /* loaded from: classes5.dex */
    public static class d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1133411421);
        }

        public static /* synthetic */ Pair a(String str, String str2, e eVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Pair) ipChange.ipc$dispatch("77612968", new Object[]{str, str2, eVar}) : b(str, str2, eVar);
        }

        private static Pair<Boolean, Long> b(String str, String str2, e eVar) {
            IpChange ipChange = $ipChange;
            boolean z = true;
            if (ipChange instanceof IpChange) {
                return (Pair) ipChange.ipc$dispatch("a0c8a247", new Object[]{str, str2, eVar});
            }
            try {
                String format = String.format("cmd package compile -m %s -f %s", str2, str);
                gsv.a("ProfileCompiler", "compile cmd: " + format);
                long nanoTime = System.nanoTime();
                Process exec = Runtime.getRuntime().exec(format);
                eVar.a();
                int waitFor = exec.waitFor();
                eVar.b();
                long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime);
                gsv.a("ProfileCompiler", "compile cmd with code: " + waitFor + ", duration:" + millis);
                if (waitFor != 0) {
                    z = false;
                }
                return Pair.create(Boolean.valueOf(z), Long.valueOf(millis));
            } catch (Throwable th) {
                gsv.a("ProfileCompiler", "AndroidShell.compile failed:" + th.getMessage());
                return Pair.create(false, -1L);
            }
        }
    }

    /* loaded from: classes5.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1046060054);
        }

        public static /* synthetic */ Pair a(String str, String str2, e eVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Pair) ipChange.ipc$dispatch("77612968", new Object[]{str, str2, eVar}) : b(str, str2, eVar);
        }

        private static Pair<Boolean, Long> b(String str, String str2, e eVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Pair) ipChange.ipc$dispatch("a0c8a247", new Object[]{str, str2, eVar}) : d.a(str, str2, eVar);
        }
    }

    /* loaded from: classes5.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1046060084);
        }

        public static /* synthetic */ Pair a(String str, String str2, e eVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Pair) ipChange.ipc$dispatch("77612968", new Object[]{str, str2, eVar}) : b(str, str2, eVar);
        }

        private static Pair<Boolean, Long> b(String str, String str2, e eVar) {
            Object a2 = f.a();
            if (a2 == null) {
                return Pair.create(false, -1L);
            }
            try {
                Method declaredMethod = a2.getClass().getDeclaredMethod("performDexOptMode", String.class, Boolean.TYPE, String.class, Boolean.TYPE, Boolean.TYPE, String.class);
                long nanoTime = System.nanoTime();
                boolean booleanValue = ((Boolean) declaredMethod.invoke(a2, str, true, str2, true, true, null)).booleanValue();
                eVar.a();
                eVar.b();
                long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime);
                gsv.a("ProfileCompiler", "compile with result: " + booleanValue + ", duration:" + millis);
                return Pair.create(Boolean.valueOf(booleanValue), Long.valueOf(millis));
            } catch (Throwable th) {
                gsv.a("ProfileCompiler", "error occurred when performDexOptMode, fallback with shell:" + th.getMessage());
                return d.a(str, str2, eVar);
            }
        }
    }

    /* loaded from: classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(243350788);
        }

        public static /* synthetic */ Pair a(String str, String str2, e eVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Pair) ipChange.ipc$dispatch("77612968", new Object[]{str, str2, eVar}) : b(str, str2, eVar);
        }

        private static Pair<Boolean, Long> b(String str, String str2, e eVar) {
            Object a2 = f.a();
            if (a2 == null) {
                return Pair.create(false, -1L);
            }
            try {
                Method declaredMethod = a2.getClass().getDeclaredMethod("performDexOptMode", String.class, Boolean.TYPE, String.class, Boolean.TYPE);
                long nanoTime = System.nanoTime();
                boolean booleanValue = ((Boolean) declaredMethod.invoke(a2, str, true, str2, true)).booleanValue();
                eVar.a();
                eVar.b();
                long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime);
                gsv.a("ProfileCompiler", "compile with result: " + booleanValue + ", duration:" + millis);
                return Pair.create(Boolean.valueOf(booleanValue), Long.valueOf(millis));
            } catch (Throwable th) {
                gsv.a("ProfileCompiler", "error occurred when performDexOptMode, fallback with shell:" + th.getMessage());
                return d.a(str, str2, eVar);
            }
        }
    }

    private static Object b() {
        try {
            Method declaredMethod = Class.forName(ProcessUtils.ACTIVITY_THREAD).getDeclaredMethod("getPackageManager", new Class[0]);
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke(null, new Object[0]);
        } catch (Throwable unused) {
            return null;
        }
    }
}
