package com.meizu.cloud.pushsdk.e.h;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;

/* loaded from: classes4.dex */
public interface l extends Closeable, Flushable {
    void a(b bVar, long j) throws IOException;

    @Override // java.io.Closeable, java.lang.AutoCloseable, com.meizu.cloud.pushsdk.e.h.m
    void close() throws IOException;

    void flush() throws IOException;
}
