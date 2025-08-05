package tb;

import android.graphics.PointF;
import java.util.Collections;

/* loaded from: classes2.dex */
public class aht extends ahg<PointF, PointF> {
    protected ako<Float> d;
    protected ako<Float> e;
    private final PointF f;
    private final PointF g;
    private final ahg<Float, Float> h;
    private final ahg<Float, Float> i;

    public aht(ahg<Float, Float> ahgVar, ahg<Float, Float> ahgVar2) {
        super(Collections.emptyList());
        this.f = new PointF();
        this.g = new PointF();
        this.h = ahgVar;
        this.i = ahgVar2;
        a(h());
    }

    @Override // tb.ahg
    public void a(float f) {
        this.h.a(f);
        this.i.a(f);
        this.f.set(this.h.g().floatValue(), this.i.g().floatValue());
        for (int i = 0; i < this.f25338a.size(); i++) {
            this.f25338a.get(i).onValueChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // tb.ahg
    /* renamed from: b */
    public PointF a(akm<PointF> akmVar, float f) {
        Float f2;
        PointF pointF;
        float f3;
        float floatValue;
        akm<Float> c;
        akm<Float> c2;
        Float f4 = null;
        if (this.d == null || (c2 = this.h.c()) == null) {
            f2 = null;
        } else {
            float e = this.h.e();
            Float f5 = c2.g;
            f2 = this.d.a(c2.f, f5 == null ? c2.f : f5.floatValue(), c2.f25395a, c2.b, f, f, e);
        }
        if (this.e != null && (c = this.i.c()) != null) {
            float e2 = this.i.e();
            Float f6 = c.g;
            f4 = this.e.a(c.f, f6 == null ? c.f : f6.floatValue(), c.f25395a, c.b, f, f, e2);
        }
        if (f2 == null) {
            this.g.set(this.f.x, 0.0f);
        } else {
            this.g.set(f2.floatValue(), 0.0f);
        }
        if (f4 == null) {
            pointF = this.g;
            f3 = pointF.x;
            floatValue = this.f.y;
        } else {
            pointF = this.g;
            f3 = pointF.x;
            floatValue = f4.floatValue();
        }
        pointF.set(f3, floatValue);
        return this.g;
    }

    public void b(ako<Float> akoVar) {
        ako<Float> akoVar2 = this.d;
        if (akoVar2 != null) {
            akoVar2.a((ahg<?, ?>) null);
        }
        this.d = akoVar;
        if (akoVar != null) {
            akoVar.a(this);
        }
    }

    public void c(ako<Float> akoVar) {
        ako<Float> akoVar2 = this.e;
        if (akoVar2 != null) {
            akoVar2.a((ahg<?, ?>) null);
        }
        this.e = akoVar;
        if (akoVar != null) {
            akoVar.a(this);
        }
    }

    @Override // tb.ahg
    /* renamed from: i */
    public PointF g() {
        return a(null, 0.0f);
    }
}
