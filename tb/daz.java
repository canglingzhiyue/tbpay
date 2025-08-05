package tb;

import com.nirvana.tools.requestqueue.strategy.CallbackStrategy;
import com.nirvana.tools.requestqueue.strategy.ThreadStrategy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.RunnableScheduledFuture;
import tb.dbb;

/* loaded from: classes4.dex */
final class daz<T extends dbb> {

    /* renamed from: a  reason: collision with root package name */
    List<dax<T>> f26649a = new ArrayList();
    daz<T>.b b;
    day<T> c;
    private a d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: tb.daz$4  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass4 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f26653a;
        static final /* synthetic */ int[] b = new int[CallbackStrategy.values().length];

        static {
            try {
                b[CallbackStrategy.LIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[CallbackStrategy.COVER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f26653a = new int[ThreadStrategy.values().length];
            try {
                f26653a[ThreadStrategy.THREAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f26653a[ThreadStrategy.THREAD_MAIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f26653a[ThreadStrategy.SAME_WITH_CALLABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* loaded from: classes4.dex */
    public interface a {
        void a(daz dazVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements Runnable {
        private Runnable d;
        private volatile boolean c = false;

        /* renamed from: a  reason: collision with root package name */
        RunnableScheduledFuture<?> f26654a = null;

        public b(Runnable runnable) {
            this.d = null;
            this.d = runnable;
        }

        public final synchronized void a() {
            if (this.d != null) {
                czp.a().c(this.d);
            }
            if (this.f26654a != null) {
                czp.a().d(this.f26654a);
            }
            this.c = true;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.c) {
                return;
            }
            try {
                T call = daz.this.c.getAction().call();
                if (this.c) {
                    return;
                }
                daz.this.a((daz) call);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public daz(day<T> dayVar, a aVar) {
        this.c = dayVar;
        this.d = aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        if (this.b == null) {
            Runnable runnable = new Runnable() { // from class: tb.daz.3
                @Override // java.lang.Runnable
                public final void run() {
                    daz.this.a((daz) daz.this.c.getAction().onTimeout());
                }
            };
            this.b = new b(runnable);
            int i = AnonymousClass4.f26653a[this.c.getThreadStrategy().ordinal()];
            if (i == 1) {
                czp.a().a(this.b);
                this.b.f26654a = czp.a().a(runnable, this.c.getTimeout());
            } else if (i != 2) {
                throw new IllegalArgumentException("Request Callable ThreadStrategy Illegal");
            } else {
                czp.a().b(this.b);
                czp.a().b(runnable, this.c.getTimeout());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0042 A[Catch: all -> 0x004d, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:11:0x003a, B:13:0x0042, B:8:0x0024, B:9:0x002f, B:10:0x0033), top: B:19:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void a(tb.day<T> r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            tb.dax r0 = r6.getCallback()     // Catch: java.lang.Throwable -> L4d
            long r1 = r6.getTimeout()     // Catch: java.lang.Throwable -> L4d
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L4d
            long r1 = r1 + r3
            r0.setExpiredTime(r1)     // Catch: java.lang.Throwable -> L4d
            int[] r0 = tb.daz.AnonymousClass4.b     // Catch: java.lang.Throwable -> L4d
            com.nirvana.tools.requestqueue.strategy.CallbackStrategy r1 = r6.getCallbackStrategy()     // Catch: java.lang.Throwable -> L4d
            int r1 = r1.ordinal()     // Catch: java.lang.Throwable -> L4d
            r0 = r0[r1]     // Catch: java.lang.Throwable -> L4d
            r1 = 1
            if (r0 == r1) goto L33
            r1 = 2
            if (r0 == r1) goto L24
            goto L3a
        L24:
            java.util.List<tb.dax<T extends tb.dbb>> r0 = r5.f26649a     // Catch: java.lang.Throwable -> L4d
            r0.clear()     // Catch: java.lang.Throwable -> L4d
            java.util.List<tb.dax<T extends tb.dbb>> r0 = r5.f26649a     // Catch: java.lang.Throwable -> L4d
            tb.dax r1 = r6.getCallback()     // Catch: java.lang.Throwable -> L4d
        L2f:
            r0.add(r1)     // Catch: java.lang.Throwable -> L4d
            goto L3a
        L33:
            java.util.List<tb.dax<T extends tb.dbb>> r0 = r5.f26649a     // Catch: java.lang.Throwable -> L4d
            tb.dax r1 = r6.getCallback()     // Catch: java.lang.Throwable -> L4d
            goto L2f
        L3a:
            java.util.List<tb.dax<T extends tb.dbb>> r0 = r5.f26649a     // Catch: java.lang.Throwable -> L4d
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L4d
            if (r0 == 0) goto L4b
            java.util.List<tb.dax<T extends tb.dbb>> r0 = r5.f26649a     // Catch: java.lang.Throwable -> L4d
            tb.dax r6 = r6.getCallback()     // Catch: java.lang.Throwable -> L4d
            r0.add(r6)     // Catch: java.lang.Throwable -> L4d
        L4b:
            monitor-exit(r5)
            return
        L4d:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.daz.a(tb.day):void");
    }

    final synchronized void a(final T t) {
        long j = 0;
        if (this.f26649a.size() > 0) {
            ArrayList<dax> arrayList = new ArrayList(this.f26649a.size());
            Iterator<dax<T>> it = this.f26649a.iterator();
            while (it.hasNext()) {
                final dax<T> next = it.next();
                if (t.isTimeout()) {
                    long currentTimeMillis = System.currentTimeMillis() - next.getExpiredTime();
                    if (currentTimeMillis > next.getThreshold()) {
                        if (j > currentTimeMillis) {
                            j = currentTimeMillis;
                        }
                    }
                }
                int i = AnonymousClass4.f26653a[next.getThreadStrategy().ordinal()];
                if (i == 1) {
                    czp.a().a(new Runnable() { // from class: tb.daz.1
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.lang.Runnable
                        public final void run() {
                            next.onResult(t);
                        }
                    });
                } else if (i == 2) {
                    czp.a().b(new Runnable() { // from class: tb.daz.2
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.lang.Runnable
                        public final void run() {
                            next.onResult(t);
                        }
                    });
                } else if (i == 3) {
                    arrayList.add(next);
                }
                it.remove();
            }
            for (dax daxVar : arrayList) {
                daxVar.onResult(t);
            }
            arrayList.clear();
            if (this.f26649a.isEmpty()) {
                if (this.d != null) {
                    this.d.a(this);
                }
                return;
            }
            if (this.c != null) {
                this.c.setTimeout(j);
            }
            a();
        }
    }
}
