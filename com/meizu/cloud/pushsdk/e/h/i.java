package com.meizu.cloud.pushsdk.e.h;

import com.alipay.mobile.intelligentdecision.model.IDecisionResult;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.io.IOException;
import java.io.InputStream;
import tb.riy;

/* loaded from: classes4.dex */
final class i implements d {

    /* renamed from: a  reason: collision with root package name */
    private final b f7941a;
    private final m b;
    private boolean c;

    /* loaded from: classes4.dex */
    class a extends InputStream {
        a() {
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            if (!i.this.c) {
                return (int) Math.min(i.this.f7941a.c, 2147483647L);
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
                if (i.this.f7941a.c != 0 || i.this.b.b(i.this.f7941a, ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX) != -1) {
                    return i.this.f7941a.i() & 255;
                }
                return -1;
            }
            throw new IOException(IDecisionResult.STATE_CLOSED);
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            if (!i.this.c) {
                o.a(bArr.length, i, i2);
                if (i.this.f7941a.c != 0 || i.this.b.b(i.this.f7941a, ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX) != -1) {
                    return i.this.f7941a.b(bArr, i, i2);
                }
                return -1;
            }
            throw new IOException(IDecisionResult.STATE_CLOSED);
        }

        public String toString() {
            return i.this + ".inputStream()";
        }
    }

    public i(m mVar) {
        this(mVar, new b());
    }

    public i(m mVar, b bVar) {
        if (mVar != null) {
            this.f7941a = bVar;
            this.b = mVar;
            return;
        }
        throw new IllegalArgumentException("source == null");
    }

    @Override // com.meizu.cloud.pushsdk.e.h.d
    public String a() throws IOException {
        this.f7941a.a(this.b);
        return this.f7941a.a();
    }

    @Override // com.meizu.cloud.pushsdk.e.h.m
    public long b(b bVar, long j) throws IOException {
        if (bVar != null) {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            } else if (this.c) {
                throw new IllegalStateException(IDecisionResult.STATE_CLOSED);
            } else {
                b bVar2 = this.f7941a;
                if (bVar2.c == 0 && this.b.b(bVar2, ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX) == -1) {
                    return -1L;
                }
                return this.f7941a.b(bVar, Math.min(j, this.f7941a.c));
            }
        }
        throw new IllegalArgumentException("sink == null");
    }

    @Override // com.meizu.cloud.pushsdk.e.h.d
    public byte[] b() throws IOException {
        this.f7941a.a(this.b);
        return this.f7941a.b();
    }

    @Override // com.meizu.cloud.pushsdk.e.h.m, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.c) {
            return;
        }
        this.c = true;
        this.b.close();
        this.f7941a.e();
    }

    @Override // com.meizu.cloud.pushsdk.e.h.d
    public InputStream d() {
        return new a();
    }

    public String toString() {
        return "buffer(" + this.b + riy.BRACKET_END_STR;
    }
}
