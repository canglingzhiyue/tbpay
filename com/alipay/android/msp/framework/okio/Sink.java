package com.alipay.android.msp.framework.okio;

import java.io.Closeable;
import java.io.IOException;

/* loaded from: classes3.dex */
public interface Sink extends Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close() throws IOException;

    void flush() throws IOException;

    Timeout timeout();

    void write(Buffer buffer, long j) throws IOException;
}
