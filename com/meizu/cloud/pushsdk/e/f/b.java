package com.meizu.cloud.pushsdk.e.f;

import com.meizu.cloud.pushsdk.e.d.j;
import com.meizu.cloud.pushsdk.e.h.f;
import com.meizu.cloud.pushsdk.e.h.g;
import com.meizu.cloud.pushsdk.e.h.l;
import java.io.IOException;

/* loaded from: classes4.dex */
public class b extends j {

    /* renamed from: a  reason: collision with root package name */
    private final j f7929a;
    private com.meizu.cloud.pushsdk.e.h.c b;
    private d c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a extends f {
        long b;
        long c;

        a(l lVar) {
            super(lVar);
            this.b = 0L;
            this.c = 0L;
        }

        @Override // com.meizu.cloud.pushsdk.e.h.f, com.meizu.cloud.pushsdk.e.h.l
        public void a(com.meizu.cloud.pushsdk.e.h.b bVar, long j) throws IOException {
            super.a(bVar, j);
            if (this.c == 0) {
                this.c = b.this.a();
            }
            this.b += j;
            if (b.this.c != null) {
                b.this.c.obtainMessage(1, new com.meizu.cloud.pushsdk.e.g.a(this.b, this.c)).sendToTarget();
            }
        }
    }

    public b(j jVar, com.meizu.cloud.pushsdk.e.e.a aVar) {
        this.f7929a = jVar;
        if (aVar != null) {
            this.c = new d(aVar);
        }
    }

    private l a(l lVar) {
        return new a(lVar);
    }

    @Override // com.meizu.cloud.pushsdk.e.d.j
    public long a() throws IOException {
        return this.f7929a.a();
    }

    @Override // com.meizu.cloud.pushsdk.e.d.j
    public void a(com.meizu.cloud.pushsdk.e.h.c cVar) throws IOException {
        if (this.b == null) {
            this.b = g.a(a((l) cVar));
        }
        this.f7929a.a(this.b);
        this.b.flush();
    }

    @Override // com.meizu.cloud.pushsdk.e.d.j
    public com.meizu.cloud.pushsdk.e.d.g b() {
        return this.f7929a.b();
    }
}
