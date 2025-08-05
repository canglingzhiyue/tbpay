package com.meizu.cloud.pushsdk.e.h;

import java.io.IOException;
import tb.riy;

/* loaded from: classes4.dex */
public abstract class f implements l {

    /* renamed from: a  reason: collision with root package name */
    private final l f7936a;

    public f(l lVar) {
        if (lVar != null) {
            this.f7936a = lVar;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    @Override // com.meizu.cloud.pushsdk.e.h.l
    public void a(b bVar, long j) throws IOException {
        this.f7936a.a(bVar, j);
    }

    @Override // com.meizu.cloud.pushsdk.e.h.l, java.io.Closeable, java.lang.AutoCloseable, com.meizu.cloud.pushsdk.e.h.m
    public void close() throws IOException {
        this.f7936a.close();
    }

    @Override // com.meizu.cloud.pushsdk.e.h.l, java.io.Flushable
    public void flush() throws IOException {
        this.f7936a.flush();
    }

    public String toString() {
        return getClass().getSimpleName() + riy.BRACKET_START_STR + this.f7936a.toString() + riy.BRACKET_END_STR;
    }
}
