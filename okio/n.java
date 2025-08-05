package okio;

import java.io.IOException;
import java.io.InterruptedIOException;

/* loaded from: classes9.dex */
public class n {
    public static final n NONE = new n() { // from class: okio.n.1
        @Override // okio.n
        public void a() throws IOException {
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private boolean f25062a;
    private long b;

    public void a() throws IOException {
        if (Thread.interrupted()) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        } else if (this.f25062a && this.b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }
}
