package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.Callable;

/* loaded from: classes9.dex */
public final class kea {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final jev f30000a;
    public static final jew<Throwable> b;
    public static final Runnable c;
    public static final jew<Object> d;

    /* loaded from: classes9.dex */
    public static final class a implements jev {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-603076183);
            kge.a(1964946584);
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this}) : "EmptyAction";
        }
    }

    /* loaded from: classes9.dex */
    public static final class b implements jew<Object> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-603076182);
            kge.a(1964946585);
        }

        @Override // tb.jew
        public void accept(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b028bfab", new Object[]{this, obj});
            }
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this}) : "EmptyConsumer";
        }
    }

    /* loaded from: classes9.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-603076181);
            kge.a(-1390502639);
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            }
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this}) : "EmptyRunnable";
        }
    }

    /* loaded from: classes9.dex */
    public static final class d<T, U> implements Callable<U>, jgn<T, U> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final U f30001a;

        static {
            kge.a(-603076180);
            kge.a(-119797776);
            kge.a(1964946586);
        }

        public d(U u) {
            this.f30001a = u;
        }

        @Override // tb.jgn
        public U apply(T t) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (U) ipChange.ipc$dispatch("7a74adc1", new Object[]{this, t}) : this.f30001a;
        }

        @Override // java.util.concurrent.Callable
        public U call() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (U) ipChange.ipc$dispatch("6d249ded", new Object[]{this}) : this.f30001a;
        }
    }

    /* loaded from: classes9.dex */
    public static final class e implements jew<Throwable> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-603076179);
            kge.a(1964946585);
        }

        public void a(Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb9ad88d", new Object[]{this, th});
            } else {
                mux.a(new tao.reactivex.b.d(th));
            }
        }

        @Override // tb.jew
        public /* synthetic */ void accept(Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b028bfab", new Object[]{this, th});
            } else {
                a(th);
            }
        }
    }

    static {
        kge.a(-1471016980);
        f30000a = new a();
        b = new e();
        c = new c();
        d = new b();
    }

    public static <T> Callable<T> a(T t) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Callable) ipChange.ipc$dispatch("54dbe705", new Object[]{t}) : new d(t);
    }

    public static <T> jew<T> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jew) ipChange.ipc$dispatch("f065e02", new Object[0]) : (jew<T>) d;
    }
}
