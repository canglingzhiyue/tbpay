package tb;

import java.util.List;

/* loaded from: classes2.dex */
public class ahj extends ahm<Float> {
    public ahj(List<akm<Float>> list) {
        super(list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // tb.ahg
    /* renamed from: b */
    public Float a(akm<Float> akmVar, float f) {
        return Float.valueOf(c(akmVar, f));
    }

    float c(akm<Float> akmVar, float f) {
        Float f2;
        if (akmVar.f25395a != null && akmVar.b != null) {
            return (this.c == null || (f2 = (Float) this.c.a(akmVar.f, akmVar.g.floatValue(), akmVar.f25395a, akmVar.b, f, d(), h())) == null) ? akk.a(akmVar.f(), akmVar.g(), f) : f2.floatValue();
        }
        akh.c("Missing values for keyframe.");
        return 0.0f;
    }

    public float i() {
        return c(c(), e());
    }
}
