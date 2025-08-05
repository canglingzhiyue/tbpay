package tb;

import java.util.List;

/* loaded from: classes2.dex */
public class ahr extends ahm<akp> {
    private final akp d;

    public ahr(List<akm<akp>> list) {
        super(list);
        this.d = new akp();
    }

    @Override // tb.ahg
    /* renamed from: b */
    public akp a(akm<akp> akmVar, float f) {
        akp akpVar;
        if (akmVar.f25395a == null || akmVar.b == null) {
            akh.c("Missing values for keyframe.");
            return new akp();
        }
        akp akpVar2 = akmVar.f25395a;
        akp akpVar3 = akmVar.b;
        if (this.c != null && (akpVar = (akp) this.c.a(akmVar.f, akmVar.g.floatValue(), akpVar2, akpVar3, f, d(), h())) != null) {
            return akpVar;
        }
        this.d.a(akk.a(akpVar2.a(), akpVar3.a(), f), akk.a(akpVar2.b(), akpVar3.b(), f));
        return this.d;
    }
}
