package android.support.design.widget;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
class l {

    /* renamed from: a  reason: collision with root package name */
    private static l f1221a;
    private final Object b = new Object();
    private final Handler c = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: android.support.design.widget.l.1
        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            l.this.a((b) message.obj);
            return true;
        }
    });
    private b d;
    private b e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public interface a {
        void a();

        void a(int i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        final WeakReference<a> f1223a;
        int b;
        boolean c;

        b(int i, a aVar) {
            this.f1223a = new WeakReference<>(aVar);
            this.b = i;
        }

        boolean a(a aVar) {
            return aVar != null && this.f1223a.get() == aVar;
        }
    }

    private l() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static l a() {
        if (f1221a == null) {
            f1221a = new l();
        }
        return f1221a;
    }

    private boolean a(b bVar, int i) {
        a aVar = bVar.f1223a.get();
        if (aVar != null) {
            this.c.removeCallbacksAndMessages(bVar);
            aVar.a(i);
            return true;
        }
        return false;
    }

    private void b() {
        b bVar = this.e;
        if (bVar != null) {
            this.d = bVar;
            this.e = null;
            a aVar = this.d.f1223a.get();
            if (aVar != null) {
                aVar.a();
            } else {
                this.d = null;
            }
        }
    }

    private void b(b bVar) {
        if (bVar.b == -2) {
            return;
        }
        int i = 2750;
        if (bVar.b > 0) {
            i = bVar.b;
        } else if (bVar.b == -1) {
            i = 1500;
        }
        this.c.removeCallbacksAndMessages(bVar);
        Handler handler = this.c;
        handler.sendMessageDelayed(Message.obtain(handler, 0, bVar), i);
    }

    private boolean f(a aVar) {
        b bVar = this.d;
        return bVar != null && bVar.a(aVar);
    }

    private boolean g(a aVar) {
        b bVar = this.e;
        return bVar != null && bVar.a(aVar);
    }

    public void a(int i, a aVar) {
        synchronized (this.b) {
            if (f(aVar)) {
                this.d.b = i;
                this.c.removeCallbacksAndMessages(this.d);
                b(this.d);
                return;
            }
            if (g(aVar)) {
                this.e.b = i;
            } else {
                this.e = new b(i, aVar);
            }
            if (this.d != null && a(this.d, 4)) {
                return;
            }
            this.d = null;
            b();
        }
    }

    public void a(a aVar) {
        synchronized (this.b) {
            if (f(aVar)) {
                this.d = null;
                if (this.e != null) {
                    b();
                }
            }
        }
    }

    public void a(a aVar, int i) {
        b bVar;
        synchronized (this.b) {
            if (f(aVar)) {
                bVar = this.d;
            } else if (g(aVar)) {
                bVar = this.e;
            }
            a(bVar, i);
        }
    }

    void a(b bVar) {
        synchronized (this.b) {
            if (this.d == bVar || this.e == bVar) {
                a(bVar, 2);
            }
        }
    }

    public void b(a aVar) {
        synchronized (this.b) {
            if (f(aVar)) {
                b(this.d);
            }
        }
    }

    public void c(a aVar) {
        synchronized (this.b) {
            if (f(aVar) && !this.d.c) {
                this.d.c = true;
                this.c.removeCallbacksAndMessages(this.d);
            }
        }
    }

    public void d(a aVar) {
        synchronized (this.b) {
            if (f(aVar) && this.d.c) {
                this.d.c = false;
                b(this.d);
            }
        }
    }

    public boolean e(a aVar) {
        boolean z;
        synchronized (this.b) {
            if (!f(aVar) && !g(aVar)) {
                z = false;
            }
            z = true;
        }
        return z;
    }

    public boolean h(a aVar) {
        boolean f;
        synchronized (this.b) {
            f = f(aVar);
        }
        return f;
    }
}
