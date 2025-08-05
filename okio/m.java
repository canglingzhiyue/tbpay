package okio;

import java.io.Closeable;
import java.io.IOException;

/* loaded from: classes9.dex */
public interface m extends Closeable {
    long b(b bVar, long j) throws IOException;

    @Override // java.lang.AutoCloseable, okio.l, okio.m
    void close() throws IOException;
}
