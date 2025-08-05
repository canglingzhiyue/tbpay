package com.meizu.cloud.pushsdk.e.h;

import java.io.IOException;
import java.io.InterruptedIOException;

/* loaded from: classes4.dex */
public class n {

    /* renamed from: a  reason: collision with root package name */
    public static final n f7945a = new a();
    private boolean b;
    private long c;

    /* loaded from: classes4.dex */
    class a extends n {
        a() {
        }

        @Override // com.meizu.cloud.pushsdk.e.h.n
        public void a() {
        }
    }

    public void a() throws IOException {
        if (!Thread.interrupted()) {
            if (this.b && this.c - System.nanoTime() <= 0) {
                throw new InterruptedIOException("deadline reached");
            }
            return;
        }
        throw new InterruptedIOException("thread interrupted");
    }
}
