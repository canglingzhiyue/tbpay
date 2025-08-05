package tb;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public class aaw extends aay {

    /* renamed from: a  reason: collision with root package name */
    private static volatile aaw f25196a;
    private static final Executor d = new Executor() { // from class: tb.aaw.1
        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            aaw.a().b(runnable);
        }
    };
    private static final Executor e = new Executor() { // from class: tb.aaw.2
        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            aaw.a().a(runnable);
        }
    };
    private aay c = new aax();
    private aay b = this.c;

    private aaw() {
    }

    public static aaw a() {
        if (f25196a != null) {
            return f25196a;
        }
        synchronized (aaw.class) {
            if (f25196a == null) {
                f25196a = new aaw();
            }
        }
        return f25196a;
    }

    @Override // tb.aay
    public void a(Runnable runnable) {
        this.b.a(runnable);
    }

    public void a(aay aayVar) {
        if (aayVar == null) {
            aayVar = this.c;
        }
        this.b = aayVar;
    }

    @Override // tb.aay
    public void b(Runnable runnable) {
        this.b.b(runnable);
    }

    @Override // tb.aay
    public boolean b() {
        return this.b.b();
    }
}
