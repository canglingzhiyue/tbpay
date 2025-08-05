package tb;

import java.util.List;

/* loaded from: classes2.dex */
public class ahl extends ahm<Integer> {
    public ahl(List<akm<Integer>> list) {
        super(list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // tb.ahg
    /* renamed from: b */
    public Integer a(akm<Integer> akmVar, float f) {
        return Integer.valueOf(c(akmVar, f));
    }

    int c(akm<Integer> akmVar, float f) {
        Integer num;
        if (akmVar.f25395a != null && akmVar.b != null) {
            return (this.c == null || (num = (Integer) this.c.a(akmVar.f, akmVar.g.floatValue(), akmVar.f25395a, akmVar.b, f, d(), h())) == null) ? akk.a(akmVar.h(), akmVar.i(), f) : num.intValue();
        }
        akh.c("Missing values for keyframe.");
        return 0;
    }

    public int i() {
        return c(c(), e());
    }
}
