package tb;

import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tcrash.JvmUncaughtCrashListener;
import com.taobao.android.tcrash.OnFileCreatedListener;
import com.taobao.android.tcrash.UncaughtCrashHeader;
import java.io.File;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public class jed {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final jdy f29494a;
    private jej e;
    private jek h;
    private final List<JvmUncaughtCrashListener> b = new ArrayList();
    private final List<OnFileCreatedListener> c = new ArrayList();
    private final List<jeo> d = new ArrayList();
    private final a g = new a(new b());
    private final jee f = new jee();

    public static /* synthetic */ List a(jed jedVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("8f66c2b8", new Object[]{jedVar}) : jedVar.d;
    }

    public static /* synthetic */ List b(jed jedVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("8037ca17", new Object[]{jedVar}) : jedVar.b;
    }

    public static /* synthetic */ jek c(jed jedVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jek) ipChange.ipc$dispatch("befaac25", new Object[]{jedVar}) : jedVar.h;
    }

    public static /* synthetic */ jdy d(jed jedVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jdy) ipChange.ipc$dispatch("a69c8075", new Object[]{jedVar}) : jedVar.f29494a;
    }

    public static /* synthetic */ List e(jed jedVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("52aae034", new Object[]{jedVar}) : jedVar.c;
    }

    public static /* synthetic */ jej f(jed jedVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jej) ipChange.ipc$dispatch("75e02f23", new Object[]{jedVar}) : jedVar.e;
    }

    public jed(jdy jdyVar) {
        this.f29494a = jdyVar;
        a(this.f);
    }

    public jed a(jeo jeoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jed) ipChange.ipc$dispatch("558aacd9", new Object[]{this, jeoVar});
        }
        if (jeoVar == null) {
            jfj.a(new IllegalArgumentException("ignore is null"));
            return this;
        }
        synchronized (this.d) {
            if (this.d.contains(jeoVar)) {
                jfj.b("JavaUncaughtCatcher", jeoVar.getClass().getSimpleName(), "already added");
                return this;
            }
            this.d.add(jeoVar);
            return this;
        }
    }

    public jed a(JvmUncaughtCrashListener jvmUncaughtCrashListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jed) ipChange.ipc$dispatch("a19300f4", new Object[]{this, jvmUncaughtCrashListener});
        }
        if (jvmUncaughtCrashListener == null) {
            jfj.a(new IllegalArgumentException("listener is null"));
            return this;
        }
        synchronized (this.b) {
            if (this.b.contains(jvmUncaughtCrashListener)) {
                jfj.b("JavaUncaughtCatcher", jvmUncaughtCrashListener.getClass().getSimpleName(), "already added");
                return this;
            }
            this.b.add(jvmUncaughtCrashListener);
            return this;
        }
    }

    public jed b(JvmUncaughtCrashListener jvmUncaughtCrashListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jed) ipChange.ipc$dispatch("1ff404d3", new Object[]{this, jvmUncaughtCrashListener});
        }
        if (jvmUncaughtCrashListener == null) {
            jfj.a(new IllegalArgumentException("listener is null"));
            return this;
        }
        synchronized (this.b) {
            this.b.remove(jvmUncaughtCrashListener);
        }
        return this;
    }

    public jed a(OnFileCreatedListener onFileCreatedListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jed) ipChange.ipc$dispatch("306cc7bc", new Object[]{this, onFileCreatedListener});
        }
        if (onFileCreatedListener == null) {
            jfj.a(new IllegalArgumentException("listener is null"));
            return this;
        }
        synchronized (this.c) {
            if (this.c.contains(onFileCreatedListener)) {
                jfj.b("JavaUncaughtCatcher", onFileCreatedListener.getClass().getSimpleName(), "already added");
                return this;
            }
            this.c.add(onFileCreatedListener);
            return this;
        }
    }

    public jed b(OnFileCreatedListener onFileCreatedListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jed) ipChange.ipc$dispatch("eae2683d", new Object[]{this, onFileCreatedListener});
        }
        if (onFileCreatedListener == null) {
            jfj.a(new IllegalArgumentException("listener is null"));
            return this;
        }
        synchronized (this.c) {
            this.c.remove(onFileCreatedListener);
        }
        return this;
    }

    public jed a(jek jekVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jed) ipChange.ipc$dispatch("1f7e1d5", new Object[]{this, jekVar});
        }
        this.h = jekVar;
        return this;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.g.a();
        }
    }

    public UncaughtCrashHeader b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (UncaughtCrashHeader) ipChange.ipc$dispatch("8cbbe684", new Object[]{this}) : this.f;
    }

    /* loaded from: classes6.dex */
    public class b implements a.InterfaceC1142a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private b() {
        }

        private boolean b(Thread thread, Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("4813975f", new Object[]{this, thread, th})).booleanValue();
            }
            if (Looper.getMainLooper().getThread() == thread) {
                return false;
            }
            synchronized (jed.a(jed.this)) {
                for (jeo jeoVar : jed.a(jed.this)) {
                    if (jeoVar.a(thread, th)) {
                        return true;
                    }
                }
                return false;
            }
        }

        private Map<String, Object> c(Thread thread, Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("8a1d456f", new Object[]{this, thread, th});
            }
            HashMap hashMap = new HashMap();
            synchronized (jed.b(jed.this)) {
                for (JvmUncaughtCrashListener jvmUncaughtCrashListener : jed.b(jed.this)) {
                    Map<String, Object> onJvmUncaughtCrash = jvmUncaughtCrashListener.onJvmUncaughtCrash(thread, th);
                    if (onJvmUncaughtCrash != null) {
                        hashMap.putAll(onJvmUncaughtCrash);
                    }
                }
            }
            return hashMap;
        }

        private File a(Thread thread, Throwable th, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (File) ipChange.ipc$dispatch("549e25a4", new Object[]{this, thread, th, map});
            }
            jek c = jed.c(jed.this);
            if (c == null) {
                c = new jea(jed.d(jed.this));
            }
            return c.a(thread, th, map);
        }

        private void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
                return;
            }
            synchronized (jed.e(jed.this)) {
                for (OnFileCreatedListener onFileCreatedListener : jed.e(jed.this)) {
                    onFileCreatedListener.onFileCreated(str);
                }
            }
        }

        @Override // tb.jed.a.InterfaceC1142a
        public boolean a(Thread thread, Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("85272e00", new Object[]{this, thread, th})).booleanValue();
            }
            boolean b = b(thread, th);
            Map<String, Object> c = c(thread, th);
            if (b) {
                c.put("REPORT_IGNORE", "true");
            }
            String absolutePath = a(thread, th, c).getAbsolutePath();
            a(absolutePath);
            jej f = jed.f(jed.this);
            if (f != null) {
                try {
                    f.onCompleted(absolutePath);
                } catch (Throwable th2) {
                    jfj.b(th2);
                }
            }
            return b;
        }
    }

    public jed a(jej jejVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jed) ipChange.ipc$dispatch("6d132f14", new Object[]{this, jejVar});
        }
        this.e = jejVar;
        return this;
    }

    /* loaded from: classes6.dex */
    public static class a implements Thread.UncaughtExceptionHandler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final Thread.UncaughtExceptionHandler f29495a = Thread.getDefaultUncaughtExceptionHandler();
        private final InterfaceC1142a b;

        /* renamed from: tb.jed$a$a  reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        private interface InterfaceC1142a {
            boolean a(Thread thread, Throwable th);
        }

        public a(InterfaceC1142a interfaceC1142a) {
            this.b = interfaceC1142a;
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th) {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ca89fd43", new Object[]{this, thread, th});
            } else if (this.b.a(thread, th) || (uncaughtExceptionHandler = this.f29495a) == null) {
            } else {
                uncaughtExceptionHandler.uncaughtException(thread, th);
            }
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else {
                Thread.setDefaultUncaughtExceptionHandler(this);
            }
        }
    }
}
