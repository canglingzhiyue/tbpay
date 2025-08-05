package tao.reactivex.b;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import tb.kge;

/* loaded from: classes9.dex */
public final class a extends RuntimeException {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final List<Throwable> f25088a;
    private final String b;
    private Throwable c;

    /* renamed from: tao.reactivex.b.a$a  reason: collision with other inner class name */
    /* loaded from: classes9.dex */
    public static final class C1075a extends RuntimeException {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1472865324);
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c8c32fc8", new Object[]{this}) : "Chain of Causes for CompositeException In Order Received =>";
        }
    }

    /* loaded from: classes9.dex */
    public static abstract class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1472865323);
        }

        public abstract void a(Object obj);
    }

    /* loaded from: classes9.dex */
    public static final class c extends b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final PrintStream f25089a;

        static {
            kge.a(-1472865322);
        }

        public c(PrintStream printStream) {
            this.f25089a = printStream;
        }

        @Override // tao.reactivex.b.a.b
        public void a(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
            } else {
                this.f25089a.println(obj);
            }
        }
    }

    /* loaded from: classes9.dex */
    public static final class d extends b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final PrintWriter f25090a;

        static {
            kge.a(-1472865321);
        }

        public d(PrintWriter printWriter) {
            this.f25090a = printWriter;
        }

        @Override // tao.reactivex.b.a.b
        public void a(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
            } else {
                this.f25090a.println(obj);
            }
        }
    }

    static {
        kge.a(1964945623);
    }

    public a(Iterable<? extends Throwable> iterable) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        if (iterable != null) {
            for (Object obj : iterable) {
                if (obj instanceof a) {
                    linkedHashSet.addAll(((a) obj).a());
                } else {
                    linkedHashSet.add(obj == null ? new NullPointerException("Throwable was null!") : obj);
                }
            }
        } else {
            linkedHashSet.add(new NullPointerException("errors was null"));
        }
        if (!linkedHashSet.isEmpty()) {
            arrayList.addAll(linkedHashSet);
            this.f25088a = Collections.unmodifiableList(arrayList);
            this.b = this.f25088a.size() + " exceptions occurred. ";
            return;
        }
        throw new IllegalArgumentException("errors is empty");
    }

    public a(Throwable... thArr) {
        this(thArr == null ? Collections.singletonList(new NullPointerException("exceptions was null")) : Arrays.asList(thArr));
    }

    private List<Throwable> a(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("ae372e1a", new Object[]{this, th});
        }
        ArrayList arrayList = new ArrayList();
        Throwable cause = th.getCause();
        if (cause != null && cause != th) {
            while (true) {
                arrayList.add(cause);
                Throwable cause2 = cause.getCause();
                if (cause2 == null || cause2 == cause) {
                    break;
                }
                cause = cause2;
            }
        }
        return arrayList;
    }

    private void a(StringBuilder sb, Throwable th, String str) {
        StackTraceElement[] stackTrace;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b5c745c", new Object[]{this, sb, th, str});
            return;
        }
        sb.append(str);
        sb.append(th);
        sb.append('\n');
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            sb.append("\t\tat ");
            sb.append(stackTraceElement);
            sb.append('\n');
        }
        if (th.getCause() == null) {
            return;
        }
        sb.append("\tCaused by: ");
        a(sb, th.getCause(), "");
    }

    private void a(b bVar) {
        StackTraceElement[] stackTrace;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae9821e4", new Object[]{this, bVar});
            return;
        }
        StringBuilder sb = new StringBuilder(128);
        sb.append(this);
        sb.append('\n');
        for (StackTraceElement stackTraceElement : getStackTrace()) {
            sb.append("\tat ");
            sb.append(stackTraceElement);
            sb.append('\n');
        }
        int i = 1;
        for (Throwable th : this.f25088a) {
            sb.append("  ComposedException ");
            sb.append(i);
            sb.append(" :\n");
            a(sb, th, "\t");
            i++;
        }
        bVar.a(sb.toString());
    }

    private Throwable b(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Throwable) ipChange.ipc$dispatch("a063f291", new Object[]{this, th});
        }
        Throwable cause = th.getCause();
        if (cause == null || this.c == cause) {
            return th;
        }
        while (true) {
            Throwable cause2 = cause.getCause();
            if (cause2 == null || cause2 == cause) {
                break;
            }
            cause = cause2;
        }
        return cause;
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public List<Throwable> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("627608df", new Object[]{this}) : this.f25088a;
    }

    @Override // java.lang.Throwable
    public synchronized Throwable getCause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Throwable) ipChange.ipc$dispatch("fa19c19f", new Object[]{this});
        }
        if (this.c == null) {
            C1075a c1075a = new C1075a();
            HashSet hashSet = new HashSet();
            Iterator<Throwable> it = this.f25088a.iterator();
            C1075a c1075a2 = c1075a;
            while (it.hasNext()) {
                Throwable next = it.next();
                if (!hashSet.contains(next)) {
                    hashSet.add(next);
                    for (Throwable th : a(next)) {
                        if (hashSet.contains(th)) {
                            next = new RuntimeException("Duplicate found in causal chain so cropping to prevent loop ...");
                        } else {
                            hashSet.add(th);
                        }
                    }
                    try {
                        c1075a2.initCause(next);
                    } catch (Throwable unused) {
                    }
                    c1075a2 = b(c1075a2);
                }
            }
            this.c = c1075a;
        }
        return this.c;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c8c32fc8", new Object[]{this}) : this.b;
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c78ccdb1", new Object[]{this});
        } else {
            printStackTrace(System.err);
        }
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5de159ff", new Object[]{this, printStream});
        } else {
            a(new c(printStream));
        }
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cebfc2c", new Object[]{this, printWriter});
        } else {
            a(new d(printWriter));
        }
    }
}
