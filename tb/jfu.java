package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.ha.bizerrorreporter.d;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.common.LauncherRuntime;
import java.io.File;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import tb.jfs;

/* loaded from: classes6.dex */
public class jfu implements jfs {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final Set<String> b;

    /* renamed from: a */
    private final jdy f29527a;

    /* renamed from: lambda$-eVlu7G1kZ9q3Dc1uiTpJaieS5Y */
    public static /* synthetic */ void m2450lambda$eVlu7G1kZ9q3Dc1uiTpJaieS5Y(jfu jfuVar, String str, File file, jfs.a aVar) {
        jfuVar.a(str, file, aVar);
    }

    /* renamed from: lambda$QH904JHbnWLUh-obZifgFtlOthU */
    public static /* synthetic */ String m2451lambda$QH904JHbnWLUhobZifgFtlOthU(File file) {
        return c(file);
    }

    /* renamed from: lambda$dgp_Q7WaH5UgSKwh5ZFxk-dePEk */
    public static /* synthetic */ String m2452lambda$dgp_Q7WaH5UgSKwh5ZFxkdePEk(File file) {
        return a(file);
    }

    /* renamed from: lambda$jrusM0QHBsez-Z0EebR9gq1WtcI */
    public static /* synthetic */ String m2453lambda$jrusM0QHBsezZ0EebR9gq1WtcI(File file) {
        return b(file);
    }

    static {
        HashSet hashSet = new HashSet();
        b = hashSet;
        hashSet.add(LauncherRuntime.PROCESS_UC_SUFFIX);
        b.add(":gpu_process");
    }

    private static int a(String str) {
        char c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{str})).intValue();
        }
        int hashCode = str.hashCode();
        if (hashCode == -1052618729) {
            if (str.equals("native")) {
                c = 2;
            }
            c = 65535;
        } else if (hashCode != 96741) {
            if (hashCode == 3254818 && str.equals("java")) {
                c = 0;
            }
            c = 65535;
        } else {
            if (str.equals("anr")) {
                c = 1;
            }
            c = 65535;
        }
        if (c == 0) {
            return 1;
        }
        if (c == 1 || c == 2) {
            return 61006;
        }
        jfj.b("Not Support Type", str);
        return -1;
    }

    private void a(File file, int i, jfs.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f9ae040", new Object[]{this, file, new Integer(i), aVar});
            return;
        }
        try {
            aVar.a(file, a(i, file));
        } catch (Throwable th) {
            try {
                jfj.b(th);
            } finally {
                aVar.a(file, false);
            }
        }
    }

    private static boolean c(File file, jdy jdyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("19e9bdf6", new Object[]{file, jdyVar})).booleanValue();
        }
        if (!jdyVar.d().a("OpenLogcatCrash", false)) {
            return false;
        }
        String name = file.getName();
        return name.endsWith("jni.log") || name.endsWith("native.log");
    }

    private static boolean a(File file, jdy jdyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a7479c74", new Object[]{file, jdyVar})).booleanValue();
        }
        if (file.getName().endsWith("anr.log") && jdyVar.d().a("ignoreAnr", false)) {
            String c = jdyVar.c();
            for (String str : b) {
                if (c.contains(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static Callable<String> b(final File file, jdy jdyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Callable) ipChange.ipc$dispatch("68076532", new Object[]{file, jdyVar});
        }
        if (c(file, jdyVar)) {
            return new Callable() { // from class: tb.-$$Lambda$jfu$jrusM0QHBsez-Z0EebR9gq1WtcI
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return jfu.m2453lambda$jrusM0QHBsezZ0EebR9gq1WtcI(file);
                }
            };
        }
        return a(file, jdyVar) ? new Callable() { // from class: tb.-$$Lambda$jfu$dgp_Q7WaH5UgSKwh5ZFxk-dePEk
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return jfu.m2452lambda$dgp_Q7WaH5UgSKwh5ZFxkdePEk(file);
            }
        } : new Callable() { // from class: tb.-$$Lambda$jfu$QH904JHbnWLUh-obZifgFtlOthU
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return jfu.m2451lambda$QH904JHbnWLUhobZifgFtlOthU(file);
            }
        };
    }

    public static /* synthetic */ String b(File file) throws Exception {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aa476700", new Object[]{file}) : xkc.a(file);
    }

    public static /* synthetic */ String a(File file) throws Exception {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("36082ea1", new Object[]{file}) : scz.a(file);
    }

    public static /* synthetic */ String c(File file) throws Exception {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1e869f5f", new Object[]{file}) : jgl.a(file);
    }

    public jfu(jdy jdyVar) {
        this.f29527a = jdyVar;
    }

    private boolean a(int i, File file) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2072b1d6", new Object[]{this, new Integer(i), file})).booleanValue();
        }
        String call = b(file, this.f29527a).call();
        if (StringUtils.isEmpty(call)) {
            jfj.b("TCrashFileSender", "file content is empty");
            jfr.a().a("EMPTY_FILE", "TCrash", file.getName());
            return false;
        }
        if (call != null && call.length() < 1024) {
            call = call + "\nReport Name:" + file.getName() + "\n" + jgm.a(2000) + "\n";
        }
        jdw a2 = jdw.a();
        String a3 = a2.a(jdw.adashxServerHost, "h-adashx.ut.taobao.com");
        boolean a4 = a2.a(jdw.enableReportContentCompress, true);
        String str = a4 ? d.SEND_FLAG : "MOTU_REPORTER_SDK_3.0.0_PRIVATE";
        if (a4) {
            call = byz.b(bzc.a(call.getBytes()));
        }
        return a(a3, i, str, call);
    }

    public boolean a(String str, int i, String str2, String str3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f4196da9", new Object[]{this, str, new Integer(i), str2, str3})).booleanValue() : jgi.a(this.f29527a, str, i, str2, str3);
    }

    @Override // tb.jfs
    public void a(final File file, final String str, final jfs.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b55826e5", new Object[]{this, file, str, aVar});
        } else {
            jdu.a().b().execute(new Runnable() { // from class: tb.-$$Lambda$jfu$-eVlu7G1kZ9q3Dc1uiTpJaieS5Y
                @Override // java.lang.Runnable
                public final void run() {
                    jfu.m2450lambda$eVlu7G1kZ9q3Dc1uiTpJaieS5Y(jfu.this, str, file, aVar);
                }
            });
        }
    }

    public /* synthetic */ void a(String str, File file, jfs.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6a03d25", new Object[]{this, str, file, aVar});
        } else {
            a(file, a(str), aVar);
        }
    }
}
