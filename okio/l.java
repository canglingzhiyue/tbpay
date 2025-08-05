package okio;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;

/* loaded from: classes9.dex */
public interface l extends Closeable, Flushable {
    void a(b bVar, long j) throws IOException;

    @Override // java.io.Closeable, java.lang.AutoCloseable, okio.l, okio.m
    void close() throws IOException;

    void flush() throws IOException;
}
