package tao.reactivex.d.h;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicReference;
import tb.kge;

/* loaded from: classes9.dex */
public final class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Throwable f25145a;

    /* loaded from: classes9.dex */
    public static final class a extends Throwable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-597531213);
        }

        public a() {
            super("No further exceptions");
        }

        @Override // java.lang.Throwable
        public Throwable fillInStackTrace() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Throwable) ipChange.ipc$dispatch("6c8bc0b1", new Object[]{this}) : this;
        }
    }

    static {
        kge.a(-1471011210);
        f25145a = new a();
    }

    public static RuntimeException a(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RuntimeException) ipChange.ipc$dispatch("6e660ded", new Object[]{th});
        }
        if (th instanceof Error) {
            throw ((Error) th);
        }
        return th instanceof RuntimeException ? (RuntimeException) th : new RuntimeException(th);
    }

    public static <T> Throwable a(AtomicReference<Throwable> atomicReference) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Throwable) ipChange.ipc$dispatch("42370c4a", new Object[]{atomicReference});
        }
        Throwable th = atomicReference.get();
        Throwable th2 = f25145a;
        return th != th2 ? atomicReference.getAndSet(th2) : th;
    }

    public static <T> boolean a(AtomicReference<Throwable> atomicReference, Throwable th) {
        Throwable th2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("38462934", new Object[]{atomicReference, th})).booleanValue();
        }
        do {
            th2 = atomicReference.get();
            if (th2 == f25145a) {
                return false;
            }
        } while (!atomicReference.compareAndSet(th2, th2 == null ? th : new tao.reactivex.b.a(th2, th)));
        return true;
    }
}
