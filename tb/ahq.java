package tb;

import android.graphics.PointF;
import java.util.List;

/* loaded from: classes2.dex */
public class ahq extends ahm<PointF> {
    private final PointF d;

    public ahq(List<akm<PointF>> list) {
        super(list);
        this.d = new PointF();
    }

    @Override // tb.ahg
    /* renamed from: b */
    public PointF a(akm<PointF> akmVar, float f) {
        return a(akmVar, f, f, f);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tb.ahg
    /* renamed from: b */
    public PointF a(akm<PointF> akmVar, float f, float f2, float f3) {
        PointF pointF;
        if (akmVar.f25395a == null || akmVar.b == null) {
            akh.c("Missing values for keyframe.");
            return new PointF();
        }
        PointF pointF2 = akmVar.f25395a;
        PointF pointF3 = akmVar.b;
        if (this.c != null && (pointF = (PointF) this.c.a(akmVar.f, akmVar.g.floatValue(), pointF2, pointF3, f, d(), h())) != null) {
            return pointF;
        }
        this.d.set(pointF2.x + (f2 * (pointF3.x - pointF2.x)), pointF2.y + (f3 * (pointF3.y - pointF2.y)));
        return this.d;
    }
}
