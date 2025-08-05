package tb;

import java.util.Collections;

/* loaded from: classes2.dex */
public class ahw<K, A> extends ahg<K, A> {
    private final A d;

    public ahw(ako<A> akoVar) {
        this(akoVar, null);
    }

    public ahw(ako<A> akoVar, A a2) {
        super(Collections.emptyList());
        a(akoVar);
        this.d = a2;
    }

    @Override // tb.ahg
    A a(akm<K> akmVar, float f) {
        return g();
    }

    @Override // tb.ahg
    public void a(float f) {
        this.b = f;
    }

    @Override // tb.ahg
    public void b() {
        if (this.c != null) {
            super.b();
        }
    }

    @Override // tb.ahg
    float f() {
        return 1.0f;
    }

    @Override // tb.ahg
    public A g() {
        ako<A> akoVar = this.c;
        A a2 = this.d;
        return akoVar.a(0.0f, 0.0f, a2, a2, h(), h(), h());
    }
}
