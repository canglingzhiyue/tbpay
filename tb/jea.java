package tb;

import android.os.Build;
import android.os.Process;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.PrintStream;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes6.dex */
public class jea implements jek {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final jdy f29491a;

    public static /* synthetic */ jdy a(jea jeaVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jdy) ipChange.ipc$dispatch("3108e515", new Object[]{jeaVar}) : jeaVar.f29491a;
    }

    public jea(jdy jdyVar) {
        this.f29491a = jdyVar;
    }

    @Override // tb.jek
    public File a(Thread thread, Throwable th, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (File) ipChange.ipc$dispatch("549e25a4", new Object[]{this, thread, th, map}) : b(thread, th, map);
    }

    private File b(Thread thread, Throwable th, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("d6e8da83", new Object[]{this, thread, th, map});
        }
        String str = "crash_" + this.f29491a.b() + "_" + System.currentTimeMillis() + "_java.log";
        File file = new File(new jge(this.f29491a.a(), this.f29491a.c()).e(), str);
        jgl.a(file, a(str, thread, th, map));
        return file;
    }

    private String a(String str, Thread thread, Throwable th, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f8fc2aad", new Object[]{this, str, thread, th, map});
        }
        a aVar = new a();
        aVar.a(str, "java").a(th, thread).a(thread).a(map).b();
        return aVar.toString();
    }

    /* loaded from: classes6.dex */
    public class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final StringBuilder b;

        private a() {
            this.b = new StringBuilder();
        }

        public a a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("34c37067", new Object[]{this, str, str2});
            }
            a("*** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***\n");
            a(String.format("Basic Information: 'pid: %d/tid: %d/logver: 2/time: %s/cpu: %s/cpu hardware: %s'\n", Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()), Long.valueOf(System.currentTimeMillis()), Build.CPU_ABI, Build.HARDWARE));
            a(String.format("Mobile Information: 'model: %s/version: %s/sdk: %d'\n", Build.MODEL, Build.VERSION.RELEASE, Integer.valueOf(Build.VERSION.SDK_INT)));
            a(String.format("Build fingerprint: '" + Build.FINGERPRINT + "'\n", new Object[0]));
            a("Report Name: " + str + "\n");
            a("UUID: " + UUID.randomUUID().toString().toLowerCase() + "\n");
            a("Log Type: " + str2 + "\n");
            a();
            return this;
        }

        public a a(Throwable th, Thread thread) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("100683a5", new Object[]{this, th, thread});
            }
            a(String.format("Process Name: '%s' \n", jea.a(jea.this).c()));
            a(String.format("Thread Name: '%s' \n", thread.getName()));
            a("Back traces starts.\n");
            try {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        th.printStackTrace(new PrintStream(byteArrayOutputStream));
                        a(byteArrayOutputStream.toString());
                        byteArrayOutputStream.close();
                    } finally {
                    }
                } catch (Exception e) {
                    jfj.b("print throwable", e);
                }
                a("Back traces end.\n");
                a();
                return this;
            } catch (Throwable th2) {
                a("Back traces end.\n");
                throw th2;
            }
        }

        public a a(Thread thread) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("75a25eea", new Object[]{this, thread});
            }
            try {
                a(String.format("Thread Name: '%s'\n", thread.getName()));
                a(String.format("\"%s\" prio=%d tid=%d %s\n", thread.getName(), Integer.valueOf(thread.getPriority()), Long.valueOf(thread.getId()), thread.getState()));
            } catch (Exception e) {
                jfj.b("dumpThread", e);
            }
            a();
            return this;
        }

        public a a(Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("bf7d90e6", new Object[]{this, map});
            }
            if (map != null && !map.isEmpty()) {
                try {
                    a("extrainfo:\n");
                    for (Map.Entry<String, Object> entry : map.entrySet()) {
                        a(String.format("%s: %s\n", entry.getKey(), entry.getValue()));
                    }
                } catch (Exception e) {
                    jfj.b("write extral info", e);
                }
                a();
            }
            return this;
        }

        public a a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("66dc9afb", new Object[]{this});
            }
            a("--- --- --- --- --- --- --- --- --- --- --- --- --- --- --- ---\n");
            return this;
        }

        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                return;
            }
            a(String.format("Full: %d bytes, write: %d bytes, limit: %d bytes, reject: %d bytes.\n", 0, 0, 0, 0));
            a(String.format("log end: %d\n", Long.valueOf(System.currentTimeMillis())));
        }

        private void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            } else {
                this.b.append(str);
            }
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this}) : this.b.toString();
        }
    }
}
