package com.meizu.cloud.pushsdk.e.h;

import com.alipay.mobile.intelligentdecision.model.IDecisionResult;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.io.IOException;
import tb.riy;

/* loaded from: classes4.dex */
final class h implements c {

    /* renamed from: a  reason: collision with root package name */
    private final b f7940a;
    private final l b;
    private boolean c;

    public h(l lVar) {
        this(lVar, new b());
    }

    public h(l lVar, b bVar) {
        if (lVar != null) {
            this.f7940a = bVar;
            this.b = lVar;
            return;
        }
        throw new IllegalArgumentException("sink == null");
    }

    @Override // com.meizu.cloud.pushsdk.e.h.c
    public long a(m mVar) throws IOException {
        if (mVar != null) {
            long j = 0;
            while (true) {
                long b = mVar.b(this.f7940a, ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX);
                if (b == -1) {
                    return j;
                }
                j += b;
                e();
            }
        } else {
            throw new IllegalArgumentException("source == null");
        }
    }

    @Override // com.meizu.cloud.pushsdk.e.h.c
    public c a(long j) throws IOException {
        if (!this.c) {
            this.f7940a.a(j);
            return e();
        }
        throw new IllegalStateException(IDecisionResult.STATE_CLOSED);
    }

    @Override // com.meizu.cloud.pushsdk.e.h.c
    public c a(e eVar) throws IOException {
        if (!this.c) {
            this.f7940a.a(eVar);
            return e();
        }
        throw new IllegalStateException(IDecisionResult.STATE_CLOSED);
    }

    @Override // com.meizu.cloud.pushsdk.e.h.c
    public c a(String str) throws IOException {
        if (!this.c) {
            this.f7940a.a(str);
            return e();
        }
        throw new IllegalStateException(IDecisionResult.STATE_CLOSED);
    }

    @Override // com.meizu.cloud.pushsdk.e.h.c
    public c a(byte[] bArr) throws IOException {
        if (!this.c) {
            this.f7940a.a(bArr);
            return e();
        }
        throw new IllegalStateException(IDecisionResult.STATE_CLOSED);
    }

    @Override // com.meizu.cloud.pushsdk.e.h.c
    public c a(byte[] bArr, int i, int i2) throws IOException {
        if (!this.c) {
            this.f7940a.a(bArr, i, i2);
            return e();
        }
        throw new IllegalStateException(IDecisionResult.STATE_CLOSED);
    }

    @Override // com.meizu.cloud.pushsdk.e.h.l
    public void a(b bVar, long j) throws IOException {
        if (!this.c) {
            this.f7940a.a(bVar, j);
            e();
            return;
        }
        throw new IllegalStateException(IDecisionResult.STATE_CLOSED);
    }

    @Override // com.meizu.cloud.pushsdk.e.h.c
    public b c() {
        return this.f7940a;
    }

    @Override // com.meizu.cloud.pushsdk.e.h.l, java.io.Closeable, java.lang.AutoCloseable, com.meizu.cloud.pushsdk.e.h.m
    public void close() {
        if (this.c) {
            return;
        }
        Throwable th = null;
        try {
            b bVar = this.f7940a;
            long j = bVar.c;
            if (j > 0) {
                this.b.a(bVar, j);
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

    public c e() throws IOException {
        if (!this.c) {
            long g = this.f7940a.g();
            if (g > 0) {
                this.b.a(this.f7940a, g);
            }
            return this;
        }
        throw new IllegalStateException(IDecisionResult.STATE_CLOSED);
    }

    @Override // com.meizu.cloud.pushsdk.e.h.l, java.io.Flushable
    public void flush() throws IOException {
        if (!this.c) {
            b bVar = this.f7940a;
            long j = bVar.c;
            if (j > 0) {
                this.b.a(bVar, j);
            }
            this.b.flush();
            return;
        }
        throw new IllegalStateException(IDecisionResult.STATE_CLOSED);
    }

    public String toString() {
        return "buffer(" + this.b + riy.BRACKET_END_STR;
    }
}
