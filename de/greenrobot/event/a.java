package de.greenrobot.event;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final h f24766a = new h();
    private final c b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(c cVar) {
        this.b = cVar;
    }

    public void a(l lVar, Object obj) {
        this.f24766a.a(g.a(lVar, obj));
        this.b.c().execute(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        g a2 = this.f24766a.a();
        if (a2 != null) {
            this.b.a(a2);
            return;
        }
        throw new IllegalStateException("No pending post available");
    }
}
