package okio;

import com.alipay.mobile.intelligentdecision.model.IDecisionResult;
import java.io.IOException;

/* loaded from: classes9.dex */
final class g implements m {

    /* renamed from: a  reason: collision with root package name */
    private final d f25056a;
    private final b b;
    private j c;
    private int d;
    private boolean e;
    private long f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(d dVar) {
        this.f25056a = dVar;
        this.b = dVar.b();
        this.c = this.b.f25050a;
        j jVar = this.c;
        this.d = jVar != null ? jVar.b : -1;
    }

    @Override // okio.m
    public long b(b bVar, long j) throws IOException {
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        } else if (this.e) {
            throw new IllegalStateException(IDecisionResult.STATE_CLOSED);
        } else {
            j jVar = this.c;
            if (jVar != null && (jVar != this.b.f25050a || this.d != this.b.f25050a.b)) {
                throw new IllegalStateException("Peek source is invalid because upstream source was used");
            }
            if (i == 0) {
                return 0L;
            }
            if (!this.f25056a.b(this.f + 1)) {
                return -1L;
            }
            if (this.c == null && this.b.f25050a != null) {
                this.c = this.b.f25050a;
                this.d = this.b.f25050a.b;
            }
            long min = Math.min(j, this.b.b - this.f);
            this.b.a(bVar, this.f, min);
            this.f += min;
            return min;
        }
    }

    @Override // okio.m, java.lang.AutoCloseable, okio.l
    public void close() throws IOException {
        this.e = true;
    }
}
