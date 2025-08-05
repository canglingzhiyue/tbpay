package com.loc;

/* loaded from: classes4.dex */
public abstract class cs implements Runnable {
    a e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public interface a {
        void a(cs csVar);
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (Thread.interrupted()) {
                return;
            }
            a();
            if (Thread.interrupted() || this.e == null) {
                return;
            }
            this.e.a(this);
        } catch (Throwable th) {
            av.b(th, "ThreadTask", "run");
            th.printStackTrace();
        }
    }
}
