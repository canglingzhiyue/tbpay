package com.meizu.cloud.pushsdk.e.h;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.logging.Logger;
import tb.riy;

/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    private static final Logger f7937a = Logger.getLogger(g.class.getName());

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f7938a;
        final /* synthetic */ OutputStream b;

        a(n nVar, OutputStream outputStream) {
            this.f7938a = nVar;
            this.b = outputStream;
        }

        @Override // com.meizu.cloud.pushsdk.e.h.l
        public void a(com.meizu.cloud.pushsdk.e.h.b bVar, long j) throws IOException {
            o.a(bVar.c, 0L, j);
            while (j > 0) {
                this.f7938a.a();
                j jVar = bVar.b;
                int min = (int) Math.min(j, jVar.c - jVar.b);
                this.b.write(jVar.f7943a, jVar.b, min);
                int i = jVar.b + min;
                jVar.b = i;
                long j2 = min;
                j -= j2;
                bVar.c -= j2;
                if (i == jVar.c) {
                    bVar.b = jVar.b();
                    k.a(jVar);
                }
            }
        }

        @Override // com.meizu.cloud.pushsdk.e.h.l, java.io.Closeable, java.lang.AutoCloseable, com.meizu.cloud.pushsdk.e.h.m
        public void close() throws IOException {
            this.b.close();
        }

        @Override // com.meizu.cloud.pushsdk.e.h.l, java.io.Flushable
        public void flush() throws IOException {
            this.b.flush();
        }

        public String toString() {
            return "sink(" + this.b + riy.BRACKET_END_STR;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f7939a;
        final /* synthetic */ InputStream b;

        b(n nVar, InputStream inputStream) {
            this.f7939a = nVar;
            this.b = inputStream;
        }

        @Override // com.meizu.cloud.pushsdk.e.h.m
        public long b(com.meizu.cloud.pushsdk.e.h.b bVar, long j) throws IOException {
            int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            if (i < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            } else if (i == 0) {
                return 0L;
            } else {
                this.f7939a.a();
                j a2 = bVar.a(1);
                int read = this.b.read(a2.f7943a, a2.c, (int) Math.min(j, 2048 - a2.c));
                if (read == -1) {
                    return -1L;
                }
                a2.c += read;
                long j2 = read;
                bVar.c += j2;
                return j2;
            }
        }

        @Override // com.meizu.cloud.pushsdk.e.h.m, java.lang.AutoCloseable
        public void close() throws IOException {
            this.b.close();
        }

        public String toString() {
            return "source(" + this.b + riy.BRACKET_END_STR;
        }
    }

    private g() {
    }

    public static c a(l lVar) {
        if (lVar != null) {
            return new h(lVar);
        }
        throw new IllegalArgumentException("sink == null");
    }

    public static d a(m mVar) {
        if (mVar != null) {
            return new i(mVar);
        }
        throw new IllegalArgumentException("source == null");
    }

    public static l a(OutputStream outputStream) {
        return a(outputStream, new n());
    }

    private static l a(OutputStream outputStream, n nVar) {
        if (outputStream != null) {
            if (nVar == null) {
                throw new IllegalArgumentException("timeout == null");
            }
            return new a(nVar, outputStream);
        }
        throw new IllegalArgumentException("out == null");
    }

    public static m a(File file) throws FileNotFoundException {
        if (file != null) {
            return a(new FileInputStream(file));
        }
        throw new IllegalArgumentException("file == null");
    }

    public static m a(InputStream inputStream) {
        return a(inputStream, new n());
    }

    private static m a(InputStream inputStream, n nVar) {
        if (inputStream != null) {
            if (nVar == null) {
                throw new IllegalArgumentException("timeout == null");
            }
            return new b(nVar, inputStream);
        }
        throw new IllegalArgumentException("in == null");
    }
}
