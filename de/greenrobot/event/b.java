package de.greenrobot.event;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public final class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final h f24767a = new h();
    private final c b;
    private volatile boolean c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(c cVar) {
        this.b = cVar;
    }

    public void a(l lVar, Object obj) {
        g a2 = g.a(lVar, obj);
        synchronized (this) {
            this.f24767a.a(a2);
            if (!this.c) {
                this.c = true;
                this.b.c().execute(this);
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        while (true) {
            try {
                g a2 = this.f24767a.a(1000);
                if (a2 == null) {
                    synchronized (this) {
                        a2 = this.f24767a.a();
                        if (a2 == null) {
                            return;
                        }
                    }
                }
                this.b.a(a2);
            } catch (InterruptedException unused) {
                String str = Thread.currentThread().getName() + " was interruppted";
                return;
            } finally {
                this.c = false;
            }
        }
    }
}
