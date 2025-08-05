package okio;

import com.alipay.mobile.intelligentdecision.model.IDecisionResult;
import java.io.IOException;
import java.nio.ByteBuffer;
import tb.riy;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public final class h implements c {

    /* renamed from: a  reason: collision with root package name */
    public final b f25057a = new b();
    public final l b;
    boolean c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(l lVar) {
        if (lVar != null) {
            this.b = lVar;
            return;
        }
        throw new NullPointerException("sink == null");
    }

    public c a() throws IOException {
        if (!this.c) {
            long f = this.f25057a.f();
            if (f > 0) {
                this.b.a(this.f25057a, f);
            }
            return this;
        }
        throw new IllegalStateException(IDecisionResult.STATE_CLOSED);
    }

    @Override // okio.l
    public void a(b bVar, long j) throws IOException {
        if (!this.c) {
            this.f25057a.a(bVar, j);
            a();
            return;
        }
        throw new IllegalStateException(IDecisionResult.STATE_CLOSED);
    }

    @Override // okio.c
    public c b(String str) throws IOException {
        if (!this.c) {
            this.f25057a.b(str);
            return a();
        }
        throw new IllegalStateException(IDecisionResult.STATE_CLOSED);
    }

    @Override // okio.c
    public c b(String str, int i, int i2) throws IOException {
        if (!this.c) {
            this.f25057a.b(str, i, i2);
            return a();
        }
        throw new IllegalStateException(IDecisionResult.STATE_CLOSED);
    }

    @Override // okio.c
    public c c(byte[] bArr) throws IOException {
        if (!this.c) {
            this.f25057a.c(bArr);
            return a();
        }
        throw new IllegalStateException(IDecisionResult.STATE_CLOSED);
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable, okio.l, okio.m
    public void close() throws IOException {
        if (this.c) {
            return;
        }
        Throwable th = null;
        try {
            if (this.f25057a.b > 0) {
                this.b.a(this.f25057a, this.f25057a.b);
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            this.b.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.c = true;
        if (th == null) {
            return;
        }
        o.a(th);
    }

    @Override // okio.c
    public c e(int i) throws IOException {
        if (!this.c) {
            this.f25057a.e(i);
            return a();
        }
        throw new IllegalStateException(IDecisionResult.STATE_CLOSED);
    }

    @Override // okio.c, okio.l, java.io.Flushable
    public void flush() throws IOException {
        if (!this.c) {
            if (this.f25057a.b > 0) {
                l lVar = this.b;
                b bVar = this.f25057a;
                lVar.a(bVar, bVar.b);
            }
            this.b.flush();
            return;
        }
        throw new IllegalStateException(IDecisionResult.STATE_CLOSED);
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.c;
    }

    public String toString() {
        return "buffer(" + this.b + riy.BRACKET_END_STR;
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        if (!this.c) {
            int write = this.f25057a.write(byteBuffer);
            a();
            return write;
        }
        throw new IllegalStateException(IDecisionResult.STATE_CLOSED);
    }
}
