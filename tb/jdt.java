package tb;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.PrintStream;
import java.util.Map;
import java.util.UUID;
import tb.jfv;

/* loaded from: classes6.dex */
public class jdt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final StringBuilder f29484a = new StringBuilder();

    public jdt a(jdy jdyVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jdt) ipChange.ipc$dispatch("2440061f", new Object[]{this, jdyVar, str, str2});
        }
        String b = jdyVar.b();
        b("*** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***\n");
        b(String.format("Basic Information: 'pid: %d/tid: %d/logver: 2/time: %s/cpu: %s/cpu hardware: %s'\n", Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()), Long.valueOf(System.currentTimeMillis()), Build.CPU_ABI, Build.HARDWARE));
        b(String.format("Mobile Information: 'model: %s/version: %s/sdk: %d'\n", Build.MODEL, Build.VERSION.RELEASE, Integer.valueOf(Build.VERSION.SDK_INT)));
        b(String.format("Build fingerprint: '" + Build.FINGERPRINT + "'\n", new Object[0]));
        b(String.format("Runtime Information: 'start: %s/maxheap: %s'\n", jdyVar.a("STARTUP_TIME", ""), Long.valueOf(Runtime.getRuntime().maxMemory())));
        b(String.format("Application Information: 'version: %s/subversion: %s/buildseq: %s'\n", jdyVar.a("APP_VERSION", b), jdyVar.a("APP_SUBVERSION", ""), jdyVar.a("APP_BUILD", "")));
        b(String.format("%s Information: 'version: %s/nativeseq: %s/javaseq: %s/target: %s'\n", jfv.a._MAGIC, jfv.a._VERSION, "160509105620", "", "beta"));
        b("Report Name: " + str + "\n");
        b("UUID: " + UUID.randomUUID().toString().toLowerCase() + "\n");
        b("Log Type: " + str2 + "\n");
        d();
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.io.Closeable] */
    public jdt a(String str, Throwable th, Thread thread) {
        Throwable th2;
        ByteArrayOutputStream byteArrayOutputStream;
        Exception e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jdt) ipChange.ipc$dispatch("4343358", new Object[]{this, str, th, thread});
        }
        b(String.format("Process Name: '%s' \n", str));
        Object[] objArr = {thread.getName()};
        ?? r8 = "Thread Name: '%s' \n";
        b(String.format(r8, objArr));
        b("Back traces starts.\n");
        try {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
            } catch (Exception e2) {
                byteArrayOutputStream = null;
                e = e2;
            } catch (Throwable th3) {
                r8 = 0;
                th2 = th3;
                byy.a((Closeable) r8);
                b("Back traces end.\n");
                throw th2;
            }
            try {
                th.printStackTrace(new PrintStream(byteArrayOutputStream));
                b(byteArrayOutputStream.toString());
                r8 = byteArrayOutputStream;
            } catch (Exception e3) {
                e = e3;
                jfj.b("print throwable", e);
                r8 = byteArrayOutputStream;
                byy.a((Closeable) r8);
                b("Back traces end.\n");
                d();
                return this;
            }
            byy.a((Closeable) r8);
            b("Back traces end.\n");
            d();
            return this;
        } catch (Throwable th4) {
            th2 = th4;
            byy.a((Closeable) r8);
            b("Back traces end.\n");
            throw th2;
        }
    }

    public jdt a(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jdt) ipChange.ipc$dispatch("24b1ce8f", new Object[]{this, map});
        }
        if (map != null && !map.isEmpty()) {
            try {
                b("extrainfo:\n");
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    b(String.format("%s: %s\n", entry.getKey(), entry.getValue()));
                }
            } catch (Exception e) {
                jfj.b("write extral info", e);
            }
            d();
        }
        return this;
    }

    public jdt a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jdt) ipChange.ipc$dispatch("f0659e4", new Object[]{this});
        }
        try {
            b("meminfo:\n");
            b(bzh.a(byy.c(), "") + "\n");
            d();
        } catch (Exception e) {
            jfj.b("write meminfo.", e);
        }
        try {
            b("status:\n");
            b(bzh.a(byy.b(), "") + "\n");
            d();
        } catch (Exception e2) {
            jfj.b("write status.", e2);
        }
        try {
            b("virtual machine:\nMaxMemory: " + Runtime.getRuntime().maxMemory() + " TotalMemory: " + Runtime.getRuntime().totalMemory() + " FreeMemory: " + Runtime.getRuntime().freeMemory() + "\n");
        } catch (Exception e3) {
            jfj.b("write virtual machine info.", e3);
        }
        d();
        return this;
    }

    public jdt a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jdt) ipChange.ipc$dispatch("34c4faec", new Object[]{this, context});
        }
        b("storageinfo:\n");
        b(byy.c(context));
        d();
        return this;
    }

    public jdt b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jdt) ipChange.ipc$dispatch("16b7ff43", new Object[]{this});
        }
        File[] fileArr = null;
        try {
            fileArr = new File("/proc/self/fd").listFiles();
            if (fileArr != null) {
                b(String.format("opened file count: %d, write limit: %d.\n", Integer.valueOf(fileArr.length), 900));
            } else {
                b("[DEBUG] listFiles failed!\n");
            }
        } catch (Exception e) {
            jfj.b("print file descriptor.", e);
        }
        if (fileArr != null) {
            try {
                if (fileArr.length >= 900) {
                    b("opened files:\n");
                    StringBuilder sb = new StringBuilder();
                    try {
                        for (File file : fileArr) {
                            sb.append(file.getName());
                            sb.append(" -> ");
                            sb.append(file.getCanonicalPath());
                            sb.append("\n");
                        }
                    } catch (Exception e2) {
                        jfj.b("print file descriptor.", e2);
                    }
                    b(sb.toString());
                }
            } catch (Exception e3) {
                jfj.b("print file descriptor.", e3);
            }
        }
        d();
        return this;
    }

    public jdt a(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jdt) ipChange.ipc$dispatch("b1594658", new Object[]{this, context, new Boolean(z)});
        }
        if (z) {
            b("appliction meminfo:\n");
            b(byy.b(context) + "\n");
            d();
        }
        return this;
    }

    public jdt c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jdt) ipChange.ipc$dispatch("1e69a4a2", new Object[]{this});
        }
        b(jgm.a(null, 2000));
        b(jgm.a("events", 200));
        return this;
    }

    public jdt a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jdt) ipChange.ipc$dispatch("7c7102da", new Object[]{this, str});
        }
        b(str);
        return this;
    }

    public jdt a(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jdt) ipChange.ipc$dispatch("9917a28d", new Object[]{this, file});
        }
        b(jgl.a(file));
        return this;
    }

    public jdt d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jdt) ipChange.ipc$dispatch("261b4a01", new Object[]{this});
        }
        b("--- --- --- --- --- --- --- --- --- --- --- --- --- --- --- ---\n");
        return this;
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        b(String.format("Full: %d bytes, write: %d bytes, limit: %d bytes, reject: %d bytes.\n", 0, 0, 0, 0));
        b(String.format("log end: %s\n", byy.a(System.currentTimeMillis())));
    }

    private void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            this.f29484a.append(str);
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this}) : this.f29484a.toString();
    }
}
