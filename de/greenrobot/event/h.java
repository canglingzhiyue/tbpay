package de.greenrobot.event;

/* loaded from: classes9.dex */
final class h {

    /* renamed from: a  reason: collision with root package name */
    private g f24776a;
    private g b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized g a() {
        g gVar;
        gVar = this.f24776a;
        if (this.f24776a != null) {
            this.f24776a = this.f24776a.c;
            if (this.f24776a == null) {
                this.b = null;
            }
        }
        return gVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized g a(int i) throws InterruptedException {
        if (this.f24776a == null) {
            wait(i);
        }
        return a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void a(g gVar) {
        try {
            if (gVar == null) {
                throw new NullPointerException("null cannot be enqueued");
            }
            if (this.b != null) {
                this.b.c = gVar;
                this.b = gVar;
            } else if (this.f24776a != null) {
                throw new IllegalStateException("Head present, but no tail");
            } else {
                this.b = gVar;
                this.f24776a = gVar;
            }
            notifyAll();
        } catch (Throwable th) {
            throw th;
        }
    }
}
