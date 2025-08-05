package com.meizu.cloud.pushsdk.e.d;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import tb.gbx;

/* loaded from: classes4.dex */
public final class h extends j {

    /* renamed from: a  reason: collision with root package name */
    public static final g f7918a = g.a("multipart/mixed");
    public static final g b = g.a("multipart/alternative");
    public static final g c = g.a("multipart/digest");
    public static final g d = g.a("multipart/parallel");
    public static final g e = g.a("multipart/form-data");
    private static final byte[] f = {58, 32};
    private static final byte[] g = {13, 10};
    private static final byte[] h = {gbx.OP_CALL_FUNC, gbx.OP_CALL_FUNC};
    private final com.meizu.cloud.pushsdk.e.h.e i;
    private final g j;
    private final g k;
    private final List<b> l;
    private long m = -1;

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final com.meizu.cloud.pushsdk.e.h.e f7919a;
        private g b;
        private final List<b> c;

        public a() {
            this(UUID.randomUUID().toString());
        }

        public a(String str) {
            this.b = h.f7918a;
            this.c = new ArrayList();
            this.f7919a = com.meizu.cloud.pushsdk.e.h.e.b(str);
        }

        public a a(c cVar, j jVar) {
            return a(b.a(cVar, jVar));
        }

        public a a(g gVar) {
            if (gVar != null) {
                if ("multipart".equals(gVar.b())) {
                    this.b = gVar;
                    return this;
                }
                throw new IllegalArgumentException("multipart != " + gVar);
            }
            throw new NullPointerException("type == null");
        }

        public a a(b bVar) {
            if (bVar != null) {
                this.c.add(bVar);
                return this;
            }
            throw new NullPointerException("part == null");
        }

        public h a() {
            if (!this.c.isEmpty()) {
                return new h(this.f7919a, this.b, this.c);
            }
            throw new IllegalStateException("Multipart body must have at least one part.");
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final c f7920a;
        private final j b;

        private b(c cVar, j jVar) {
            this.f7920a = cVar;
            this.b = jVar;
        }

        public static b a(c cVar, j jVar) {
            if (jVar != null) {
                if (cVar != null && cVar.a("Content-Type") != null) {
                    throw new IllegalArgumentException("Unexpected header: Content-Type");
                }
                if (cVar != null && cVar.a("Content-Length") != null) {
                    throw new IllegalArgumentException("Unexpected header: Content-Length");
                }
                return new b(cVar, jVar);
            }
            throw new NullPointerException("body == null");
        }
    }

    h(com.meizu.cloud.pushsdk.e.h.e eVar, g gVar, List<b> list) {
        this.i = eVar;
        this.j = gVar;
        this.k = g.a(gVar + "; boundary=" + eVar.d());
        this.l = m.a(list);
    }

    private long a(com.meizu.cloud.pushsdk.e.h.c cVar, boolean z) throws IOException {
        com.meizu.cloud.pushsdk.e.h.b bVar;
        com.meizu.cloud.pushsdk.e.h.b bVar2;
        if (z) {
            bVar2 = new com.meizu.cloud.pushsdk.e.h.b();
            bVar = bVar2;
        } else {
            bVar = cVar;
            bVar2 = null;
        }
        int size = this.l.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            b bVar3 = this.l.get(i);
            c cVar2 = bVar3.f7920a;
            j jVar = bVar3.b;
            bVar.a(h);
            bVar.a(this.i);
            bVar.a(g);
            if (cVar2 != null) {
                int c2 = cVar2.c();
                for (int i2 = 0; i2 < c2; i2++) {
                    bVar.a(cVar2.a(i2)).a(f).a(cVar2.b(i2)).a(g);
                }
            }
            g b2 = jVar.b();
            if (b2 != null) {
                bVar.a("Content-Type: ").a(b2.toString()).a(g);
            }
            long a2 = jVar.a();
            if (a2 != -1) {
                bVar.a("Content-Length: ").a(a2).a(g);
            } else if (z) {
                bVar2.e();
                return -1L;
            }
            byte[] bArr = g;
            bVar.a(bArr);
            if (z) {
                j += a2;
            } else {
                jVar.a(bVar);
            }
            bVar.a(bArr);
        }
        byte[] bArr2 = h;
        bVar.a(bArr2);
        bVar.a(this.i);
        bVar.a(bArr2);
        bVar.a(g);
        if (z) {
            long k = j + bVar2.k();
            bVar2.e();
            return k;
        }
        return j;
    }

    @Override // com.meizu.cloud.pushsdk.e.d.j
    public long a() throws IOException {
        long j = this.m;
        if (j != -1) {
            return j;
        }
        long a2 = a((com.meizu.cloud.pushsdk.e.h.c) null, true);
        this.m = a2;
        return a2;
    }

    @Override // com.meizu.cloud.pushsdk.e.d.j
    public void a(com.meizu.cloud.pushsdk.e.h.c cVar) throws IOException {
        a(cVar, false);
    }

    @Override // com.meizu.cloud.pushsdk.e.d.j
    public g b() {
        return this.k;
    }
}
