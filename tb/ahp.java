package tb;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;

/* loaded from: classes2.dex */
public class ahp extends ahm<PointF> {
    private final PointF d;
    private final float[] e;
    private final PathMeasure f;
    private aho g;

    public ahp(List<? extends akm<PointF>> list) {
        super(list);
        this.d = new PointF();
        this.e = new float[2];
        this.f = new PathMeasure();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // tb.ahg
    /* renamed from: b */
    public PointF a(akm<PointF> akmVar, float f) {
        PointF pointF;
        aho ahoVar = (aho) akmVar;
        Path b = ahoVar.b();
        if (b == null) {
            return akmVar.f25395a;
        }
        if (this.c != null && (pointF = (PointF) this.c.a(ahoVar.f, ahoVar.g.floatValue(), ahoVar.f25395a, ahoVar.b, d(), f, h())) != null) {
            return pointF;
        }
        if (this.g != ahoVar) {
            this.f.setPath(b, false);
            this.g = ahoVar;
        }
        PathMeasure pathMeasure = this.f;
        pathMeasure.getPosTan(f * pathMeasure.getLength(), this.e, null);
        PointF pointF2 = this.d;
        float[] fArr = this.e;
        pointF2.set(fArr[0], fArr[1]);
        return this.d;
    }
}
