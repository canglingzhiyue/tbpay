package com.meizu.cloud.pushsdk.e.h;

import java.io.Closeable;
import java.io.IOException;

/* loaded from: classes4.dex */
public interface m extends Closeable {
    long b(b bVar, long j) throws IOException;

    @Override // java.lang.AutoCloseable, com.meizu.cloud.pushsdk.e.h.m
    void close() throws IOException;
}
