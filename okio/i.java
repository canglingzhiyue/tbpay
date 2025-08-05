package okio;

import com.alipay.mobile.intelligentdecision.model.IDecisionResult;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import tb.riy;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public final class i implements d {

    /* renamed from: a  reason: collision with root package name */
    public final b f25058a = new b();
    public final m b;
    boolean c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(m mVar) {
        if (mVar != null) {
            this.b = mVar;
            return;
        }
        throw new NullPointerException("source == null");
    }

    @Override // okio.d
    public int a(f fVar) throws IOException {
        if (!this.c) {
            do {
                int a2 = this.f25058a.a(fVar, true);
                if (a2 == -1) {
                    return -1;
                }
                if (a2 != -2) {
                    this.f25058a.g(fVar.f25055a[a2].size());
                    return a2;
                }
            } while (this.b.b(this.f25058a, 8192L) != -1);
            return -1;
        }
        throw new IllegalStateException(IDecisionResult.STATE_CLOSED);
    }

    @Override // okio.d
    public long a(ByteString byteString) throws IOException {
        return a(byteString, 0L);
    }

    public long a(ByteString byteString, long j) throws IOException {
        if (!this.c) {
            while (true) {
                long a2 = this.f25058a.a(byteString, j);
                if (a2 != -1) {
                    return a2;
                }
                long j2 = this.f25058a.b;
                if (this.b.b(this.f25058a, 8192L) == -1) {
                    return -1L;
                }
                j = Math.max(j, (j2 - byteString.size()) + 1);
            }
        } else {
            throw new IllegalStateException(IDecisionResult.STATE_CLOSED);
        }
    }

    @Override // okio.d
    public long a(l lVar) throws IOException {
        if (lVar != null) {
            long j = 0;
            while (this.b.b(this.f25058a, 8192L) != -1) {
                long f = this.f25058a.f();
                if (f > 0) {
                    j += f;
                    lVar.a(this.f25058a, f);
                }
            }
            if (this.f25058a.a() <= 0) {
                return j;
            }
            long a2 = j + this.f25058a.a();
            b bVar = this.f25058a;
            lVar.a(bVar, bVar.a());
            return a2;
        }
        throw new IllegalArgumentException("sink == null");
    }

    @Override // okio.d
    public String a(long j, Charset charset) throws IOException {
        a(j);
        if (charset != null) {
            return this.f25058a.a(j, charset);
        }
        throw new IllegalArgumentException("charset == null");
    }

    @Override // okio.d
    public void a(long j) throws IOException {
        if (b(j)) {
            return;
        }
        throw new EOFException();
    }

    @Override // okio.d
    public long b(ByteString byteString) throws IOException {
        return b(byteString, 0L);
    }

    public long b(ByteString byteString, long j) throws IOException {
        if (!this.c) {
            while (true) {
                long b = this.f25058a.b(byteString, j);
                if (b != -1) {
                    return b;
                }
                long j2 = this.f25058a.b;
                if (this.b.b(this.f25058a, 8192L) == -1) {
                    return -1L;
                }
                j = Math.max(j, j2);
            }
        } else {
            throw new IllegalStateException(IDecisionResult.STATE_CLOSED);
        }
    }

    @Override // okio.m
    public long b(b bVar, long j) throws IOException {
        if (bVar != null) {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            } else if (this.c) {
                throw new IllegalStateException(IDecisionResult.STATE_CLOSED);
            } else {
                if (this.f25058a.b == 0 && this.b.b(this.f25058a, 8192L) == -1) {
                    return -1L;
                }
                return this.f25058a.b(bVar, Math.min(j, this.f25058a.b));
            }
        }
        throw new IllegalArgumentException("sink == null");
    }

    @Override // okio.d
    public b b() {
        return this.f25058a;
    }

    @Override // okio.d
    public boolean b(long j) throws IOException {
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        } else if (this.c) {
            throw new IllegalStateException(IDecisionResult.STATE_CLOSED);
        } else {
            while (this.f25058a.b < j) {
                if (this.b.b(this.f25058a, 8192L) == -1) {
                    return false;
                }
            }
            return true;
        }
    }

    @Override // okio.d
    public boolean c() throws IOException {
        if (!this.c) {
            return this.f25058a.c() && this.b.b(this.f25058a, 8192L) == -1;
        }
        throw new IllegalStateException(IDecisionResult.STATE_CLOSED);
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable, okio.m, okio.l
    public void close() throws IOException {
        if (this.c) {
            return;
        }
        this.c = true;
        this.b.close();
        this.f25058a.o();
    }

    @Override // okio.d
    public ByteString d(long j) throws IOException {
        a(j);
        return this.f25058a.d(j);
    }

    @Override // okio.d
    public d d() {
        return e.a(new g(this));
    }

    @Override // okio.d
    public InputStream e() {
        return new InputStream() { // from class: okio.i.1
            @Override // java.io.InputStream
            public int available() throws IOException {
                if (!i.this.c) {
                    return (int) Math.min(i.this.f25058a.b, 2147483647L);
                }
                throw new IOException(IDecisionResult.STATE_CLOSED);
            }

            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                i.this.close();
            }

            @Override // java.io.InputStream
            public int read() throws IOException {
                if (!i.this.c) {
                    if (i.this.f25058a.b != 0 || i.this.b.b(i.this.f25058a, 8192L) != -1) {
                        return i.this.f25058a.g() & 255;
                    }
                    return -1;
                }
                throw new IOException(IDecisionResult.STATE_CLOSED);
            }

            @Override // java.io.InputStream
            public int read(byte[] bArr, int i, int i2) throws IOException {
                if (!i.this.c) {
                    o.a(bArr.length, i, i2);
                    if (i.this.f25058a.b != 0 || i.this.b.b(i.this.f25058a, 8192L) != -1) {
                        return i.this.f25058a.a(bArr, i, i2);
                    }
                    return -1;
                }
                throw new IOException(IDecisionResult.STATE_CLOSED);
            }

            public String toString() {
                return i.this + ".inputStream()";
            }
        };
    }

    @Override // okio.d
    public byte g() throws IOException {
        a(1L);
        return this.f25058a.g();
    }

    @Override // okio.d
    public void g(long j) throws IOException {
        if (!this.c) {
            while (j > 0) {
                if (this.f25058a.b == 0 && this.b.b(this.f25058a, 8192L) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j, this.f25058a.a());
                this.f25058a.g(min);
                j -= min;
            }
            return;
        }
        throw new IllegalStateException(IDecisionResult.STATE_CLOSED);
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.c;
    }

    @Override // okio.d
    public int j() throws IOException {
        a(4L);
        return this.f25058a.j();
    }

    @Override // okio.d
    public long k() throws IOException {
        a(8L);
        return this.f25058a.k();
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) throws IOException {
        if (this.f25058a.b == 0 && this.b.b(this.f25058a, 8192L) == -1) {
            return -1;
        }
        return this.f25058a.read(byteBuffer);
    }

    public String toString() {
        return "buffer(" + this.b + riy.BRACKET_END_STR;
    }
}
