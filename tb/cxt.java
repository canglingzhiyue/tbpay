package tb;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes4.dex */
public final class cxt {

    /* renamed from: a  reason: collision with root package name */
    private static final cxt f26589a = new cxt();
    private final ExecutorService c = com.huawei.hmf.tasks.a.a.a();
    private final Executor b = new a();
    private final Executor d = com.huawei.hmf.tasks.a.a.b();

    /* loaded from: classes4.dex */
    static final class a implements Executor {
        a() {
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            runnable.run();
        }
    }

    private cxt() {
    }

    public static Executor a() {
        return f26589a.d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ExecutorService b() {
        return f26589a.c;
    }
}
