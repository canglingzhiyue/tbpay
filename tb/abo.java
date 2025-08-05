package tb;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.support.v4.util.SimpleArrayMap;
import android.view.Choreographer;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class abo {
    public static final ThreadLocal<abo> sAnimatorHandler = new ThreadLocal<>();
    private c d;

    /* renamed from: a  reason: collision with root package name */
    private final SimpleArrayMap<b, Long> f25207a = new SimpleArrayMap<>();
    private final ArrayList<b> b = new ArrayList<>();
    private final a c = new a();
    private long e = 0;
    private boolean f = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a {
        a() {
        }

        void a() {
            abo.this.e = SystemClock.uptimeMillis();
            abo aboVar = abo.this;
            aboVar.a(aboVar.e);
            if (abo.this.b.size() > 0) {
                abo.this.b().a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public interface b {
        boolean a(long j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        final a f25209a;

        c(a aVar) {
            this.f25209a = aVar;
        }

        abstract void a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class d extends c {
        private final Runnable b;
        private final Handler c;
        private long d;

        d(a aVar) {
            super(aVar);
            this.d = -1L;
            this.b = new Runnable() { // from class: tb.abo.d.1
                @Override // java.lang.Runnable
                public void run() {
                    d.this.d = SystemClock.uptimeMillis();
                    d.this.f25209a.a();
                }
            };
            this.c = new Handler(Looper.myLooper());
        }

        @Override // tb.abo.c
        void a() {
            this.c.postDelayed(this.b, Math.max(10 - (SystemClock.uptimeMillis() - this.d), 0L));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class e extends c {
        private final Choreographer b;
        private final Choreographer.FrameCallback c;

        e(a aVar) {
            super(aVar);
            this.b = Choreographer.getInstance();
            this.c = new Choreographer.FrameCallback() { // from class: tb.abo.e.1
                @Override // android.view.Choreographer.FrameCallback
                public void doFrame(long j) {
                    e.this.f25209a.a();
                }
            };
        }

        @Override // tb.abo.c
        void a() {
            this.b.postFrameCallback(this.c);
        }
    }

    abo() {
    }

    public static abo a() {
        if (sAnimatorHandler.get() == null) {
            sAnimatorHandler.set(new abo());
        }
        return sAnimatorHandler.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(long j) {
        long uptimeMillis = SystemClock.uptimeMillis();
        for (int i = 0; i < this.b.size(); i++) {
            b bVar = this.b.get(i);
            if (bVar != null && b(bVar, uptimeMillis)) {
                bVar.a(j);
            }
        }
        c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public c b() {
        if (this.d == null) {
            this.d = Build.VERSION.SDK_INT >= 16 ? new e(this.c) : new d(this.c);
        }
        return this.d;
    }

    private boolean b(b bVar, long j) {
        Long l = this.f25207a.get(bVar);
        if (l == null) {
            return true;
        }
        if (l.longValue() >= j) {
            return false;
        }
        this.f25207a.remove(bVar);
        return true;
    }

    private void c() {
        if (this.f) {
            for (int size = this.b.size() - 1; size >= 0; size--) {
                if (this.b.get(size) == null) {
                    this.b.remove(size);
                }
            }
            this.f = false;
        }
    }

    public void a(b bVar) {
        this.f25207a.remove(bVar);
        int indexOf = this.b.indexOf(bVar);
        if (indexOf >= 0) {
            this.b.set(indexOf, null);
            this.f = true;
        }
    }

    public void a(b bVar, long j) {
        if (this.b.size() == 0) {
            b().a();
        }
        if (!this.b.contains(bVar)) {
            this.b.add(bVar);
        }
        if (j > 0) {
            this.f25207a.put(bVar, Long.valueOf(SystemClock.uptimeMillis() + j));
        }
    }
}
