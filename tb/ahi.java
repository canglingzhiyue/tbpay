package tb;

import android.graphics.Color;
import android.graphics.Paint;
import com.airbnb.lottie.model.layer.a;
import tb.ahg;

/* loaded from: classes2.dex */
public class ahi implements ahg.a {

    /* renamed from: a  reason: collision with root package name */
    private final ahg.a f25341a;
    private final ahg<Integer, Integer> b;
    private final ahg<Float, Float> c;
    private final ahg<Float, Float> d;
    private final ahg<Float, Float> e;
    private final ahg<Float, Float> f;
    private boolean g = true;

    public ahi(ahg.a aVar, a aVar2, aiz aizVar) {
        this.f25341a = aVar;
        this.b = aizVar.a().a();
        this.b.a(this);
        aVar2.a(this.b);
        this.c = aizVar.b().a();
        this.c.a(this);
        aVar2.a(this.c);
        this.d = aizVar.c().a();
        this.d.a(this);
        aVar2.a(this.d);
        this.e = aizVar.d().a();
        this.e.a(this);
        aVar2.a(this.e);
        this.f = aizVar.e().a();
        this.f.a(this);
        aVar2.a(this.f);
    }

    public void a(Paint paint) {
        if (!this.g) {
            return;
        }
        this.g = false;
        double floatValue = this.d.g().floatValue() * 0.017453292519943295d;
        float floatValue2 = this.e.g().floatValue();
        float sin = ((float) Math.sin(floatValue)) * floatValue2;
        float cos = ((float) Math.cos(floatValue + 3.141592653589793d)) * floatValue2;
        int intValue = this.b.g().intValue();
        paint.setShadowLayer(this.f.g().floatValue(), sin, cos, Color.argb(Math.round(this.c.g().floatValue()), Color.red(intValue), Color.green(intValue), Color.blue(intValue)));
    }

    public void a(ako<Integer> akoVar) {
        this.b.a(akoVar);
    }

    public void b(final ako<Float> akoVar) {
        if (akoVar == null) {
            this.c.a((ako<Float>) null);
        } else {
            this.c.a(new ako<Float>() { // from class: tb.ahi.1
                @Override // tb.ako
                /* renamed from: b */
                public Float a(akn<Float> aknVar) {
                    Float f = (Float) akoVar.a(aknVar);
                    if (f == null) {
                        return null;
                    }
                    return Float.valueOf(f.floatValue() * 2.55f);
                }
            });
        }
    }

    public void c(ako<Float> akoVar) {
        this.d.a(akoVar);
    }

    public void d(ako<Float> akoVar) {
        this.e.a(akoVar);
    }

    public void e(ako<Float> akoVar) {
        this.f.a(akoVar);
    }

    @Override // tb.ahg.a
    public void onValueChanged() {
        this.g = true;
        this.f25341a.onValueChanged();
    }
}
