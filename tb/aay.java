package tb;

/* loaded from: classes2.dex */
public abstract class aay {
    public abstract void a(Runnable runnable);

    public abstract void b(Runnable runnable);

    public abstract boolean b();

    public void c(Runnable runnable) {
        if (b()) {
            runnable.run();
        } else {
            b(runnable);
        }
    }
}
