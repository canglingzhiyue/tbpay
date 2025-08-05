package tb;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.f;
import com.airbnb.lottie.m;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.model.d;
import java.util.ArrayList;
import java.util.List;
import tb.ahg;

/* loaded from: classes2.dex */
public abstract class agl implements agp, agv, ahg.a {

    /* renamed from: a  reason: collision with root package name */
    protected final com.airbnb.lottie.model.layer.a f25322a;
    private final LottieDrawable h;
    private final float[] j;
    private final ahg<?, Float> k;
    private final ahg<?, Integer> l;
    private final List<ahg<?, Float>> m;
    private final ahg<?, Float> n;
    private ahg<ColorFilter, ColorFilter> o;
    private ahg<Float, Float> p;
    private ahi q;
    private final PathMeasure d = new PathMeasure();
    private final Path e = new Path();
    private final Path f = new Path();
    private final RectF g = new RectF();
    private final List<a> i = new ArrayList();
    final Paint b = new agk(1);
    float c = 0.0f;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final List<agx> f25323a;
        private final ahf b;

        private a(ahf ahfVar) {
            this.f25323a = new ArrayList();
            this.b = ahfVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public agl(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.a aVar, Paint.Cap cap, Paint.Join join, float f, aic aicVar, aia aiaVar, List<aia> list, aia aiaVar2) {
        this.h = lottieDrawable;
        this.f25322a = aVar;
        this.b.setStyle(Paint.Style.STROKE);
        this.b.setStrokeCap(cap);
        this.b.setStrokeJoin(join);
        this.b.setStrokeMiter(f);
        this.l = aicVar.a();
        this.k = aiaVar.a();
        this.n = aiaVar2 == null ? null : aiaVar2.a();
        this.m = new ArrayList(list.size());
        this.j = new float[list.size()];
        for (int i = 0; i < list.size(); i++) {
            this.m.add(list.get(i).a());
        }
        aVar.a(this.l);
        aVar.a(this.k);
        for (int i2 = 0; i2 < this.m.size(); i2++) {
            aVar.a(this.m.get(i2));
        }
        ahg<?, Float> ahgVar = this.n;
        if (ahgVar != null) {
            aVar.a(ahgVar);
        }
        this.l.a(this);
        this.k.a(this);
        for (int i3 = 0; i3 < list.size(); i3++) {
            this.m.get(i3).a(this);
        }
        ahg<?, Float> ahgVar2 = this.n;
        if (ahgVar2 != null) {
            ahgVar2.a(this);
        }
        if (aVar.e() != null) {
            this.p = aVar.e().a().a();
            this.p.a(this);
            aVar.a(this.p);
        }
        if (aVar.f() != null) {
            this.q = new ahi(this, aVar, aVar.f());
        }
    }

    private void a(Canvas canvas, a aVar, Matrix matrix) {
        float f;
        float f2;
        f.a("StrokeContent#applyTrimPath");
        if (aVar.b == null) {
            f.b("StrokeContent#applyTrimPath");
            return;
        }
        this.e.reset();
        for (int size = aVar.f25323a.size() - 1; size >= 0; size--) {
            this.e.addPath(((agx) aVar.f25323a.get(size)).d(), matrix);
        }
        float floatValue = aVar.b.c().g().floatValue() / 100.0f;
        float floatValue2 = aVar.b.d().g().floatValue() / 100.0f;
        float floatValue3 = aVar.b.e().g().floatValue() / 360.0f;
        if (floatValue < 0.01f && floatValue2 > 0.99f) {
            canvas.drawPath(this.e, this.b);
            f.b("StrokeContent#applyTrimPath");
            return;
        }
        this.d.setPath(this.e, false);
        float length = this.d.getLength();
        while (this.d.nextContour()) {
            length += this.d.getLength();
        }
        float f3 = floatValue3 * length;
        float f4 = (floatValue * length) + f3;
        float min = Math.min((floatValue2 * length) + f3, (f4 + length) - 1.0f);
        float f5 = 0.0f;
        for (int size2 = aVar.f25323a.size() - 1; size2 >= 0; size2--) {
            this.f.set(((agx) aVar.f25323a.get(size2)).d());
            this.f.transform(matrix);
            this.d.setPath(this.f, false);
            float length2 = this.d.getLength();
            if (min > length) {
                float f6 = min - length;
                if (f6 < f5 + length2 && f5 < f6) {
                    f = f4 > length ? (f4 - length) / length2 : 0.0f;
                    f2 = Math.min(f6 / length2, 1.0f);
                    akl.a(this.f, f, f2, 0.0f);
                    canvas.drawPath(this.f, this.b);
                    f5 += length2;
                }
            }
            float f7 = f5 + length2;
            if (f7 >= f4 && f5 <= min) {
                if (f7 > min || f4 >= f5) {
                    f = f4 < f5 ? 0.0f : (f4 - f5) / length2;
                    f2 = min > f7 ? 1.0f : (min - f5) / length2;
                    akl.a(this.f, f, f2, 0.0f);
                }
                canvas.drawPath(this.f, this.b);
            }
            f5 += length2;
        }
        f.b("StrokeContent#applyTrimPath");
    }

    private void a(Matrix matrix) {
        f.a("StrokeContent#applyDashPattern");
        if (this.m.isEmpty()) {
            f.b("StrokeContent#applyDashPattern");
            return;
        }
        float a2 = akl.a(matrix);
        for (int i = 0; i < this.m.size(); i++) {
            this.j[i] = this.m.get(i).g().floatValue();
            if (i % 2 == 0) {
                float[] fArr = this.j;
                if (fArr[i] < 1.0f) {
                    fArr[i] = 1.0f;
                }
            } else {
                float[] fArr2 = this.j;
                if (fArr2[i] < 0.1f) {
                    fArr2[i] = 0.1f;
                }
            }
            float[] fArr3 = this.j;
            fArr3[i] = fArr3[i] * a2;
        }
        ahg<?, Float> ahgVar = this.n;
        this.b.setPathEffect(new DashPathEffect(this.j, ahgVar == null ? 0.0f : a2 * ahgVar.g().floatValue()));
        f.b("StrokeContent#applyDashPattern");
    }

    @Override // tb.agp
    public void a(Canvas canvas, Matrix matrix, int i) {
        f.a("StrokeContent#draw");
        if (akl.b(matrix)) {
            f.b("StrokeContent#draw");
            return;
        }
        this.b.setAlpha(akk.a((int) ((((i / 255.0f) * ((ahl) this.l).i()) / 100.0f) * 255.0f), 0, 255));
        this.b.setStrokeWidth(((ahj) this.k).i() * akl.a(matrix));
        if (this.b.getStrokeWidth() <= 0.0f) {
            f.b("StrokeContent#draw");
            return;
        }
        a(matrix);
        ahg<ColorFilter, ColorFilter> ahgVar = this.o;
        if (ahgVar != null) {
            this.b.setColorFilter(ahgVar.g());
        }
        ahg<Float, Float> ahgVar2 = this.p;
        if (ahgVar2 != null) {
            float floatValue = ahgVar2.g().floatValue();
            if (floatValue == 0.0f) {
                this.b.setMaskFilter(null);
            } else if (floatValue != this.c) {
                this.b.setMaskFilter(this.f25322a.b(floatValue));
            }
            this.c = floatValue;
        }
        ahi ahiVar = this.q;
        if (ahiVar != null) {
            ahiVar.a(this.b);
        }
        for (int i2 = 0; i2 < this.i.size(); i2++) {
            a aVar = this.i.get(i2);
            if (aVar.b != null) {
                a(canvas, aVar, matrix);
            } else {
                f.a("StrokeContent#buildPath");
                this.e.reset();
                for (int size = aVar.f25323a.size() - 1; size >= 0; size--) {
                    this.e.addPath(((agx) aVar.f25323a.get(size)).d(), matrix);
                }
                f.b("StrokeContent#buildPath");
                f.a("StrokeContent#drawPath");
                canvas.drawPath(this.e, this.b);
                f.b("StrokeContent#drawPath");
            }
        }
        f.b("StrokeContent#draw");
    }

    @Override // tb.agp
    public void a(RectF rectF, Matrix matrix, boolean z) {
        f.a("StrokeContent#getBounds");
        this.e.reset();
        for (int i = 0; i < this.i.size(); i++) {
            a aVar = this.i.get(i);
            for (int i2 = 0; i2 < aVar.f25323a.size(); i2++) {
                this.e.addPath(((agx) aVar.f25323a.get(i2)).d(), matrix);
            }
        }
        this.e.computeBounds(this.g, false);
        float i3 = ((ahj) this.k).i();
        RectF rectF2 = this.g;
        float f = i3 / 2.0f;
        rectF2.set(rectF2.left - f, this.g.top - f, this.g.right + f, this.g.bottom + f);
        rectF.set(this.g);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        f.b("StrokeContent#getBounds");
    }

    @Override // com.airbnb.lottie.model.e
    public void a(d dVar, int i, List<d> list, d dVar2) {
        akk.a(dVar, i, list, dVar2, this);
    }

    @Override // com.airbnb.lottie.model.e
    public <T> void a(T t, ako<T> akoVar) {
        ahi ahiVar;
        ahi ahiVar2;
        ahi ahiVar3;
        ahi ahiVar4;
        ahi ahiVar5;
        if (t == m.OPACITY) {
            this.l.a((ako<Integer>) akoVar);
        } else if (t == m.STROKE_WIDTH) {
            this.k.a((ako<Float>) akoVar);
        } else if (t == m.COLOR_FILTER) {
            ahg<ColorFilter, ColorFilter> ahgVar = this.o;
            if (ahgVar != null) {
                this.f25322a.b(ahgVar);
            }
            if (akoVar == null) {
                this.o = null;
                return;
            }
            this.o = new ahw(akoVar);
            this.o.a(this);
            this.f25322a.a(this.o);
        } else if (t == m.BLUR_RADIUS) {
            ahg<Float, Float> ahgVar2 = this.p;
            if (ahgVar2 != null) {
                ahgVar2.a((ako<Float>) akoVar);
                return;
            }
            this.p = new ahw(akoVar);
            this.p.a(this);
            this.f25322a.a(this.p);
        } else if (t == m.DROP_SHADOW_COLOR && (ahiVar5 = this.q) != null) {
            ahiVar5.a((ako<Integer>) akoVar);
        } else if (t == m.DROP_SHADOW_OPACITY && (ahiVar4 = this.q) != null) {
            ahiVar4.b(akoVar);
        } else if (t == m.DROP_SHADOW_DIRECTION && (ahiVar3 = this.q) != null) {
            ahiVar3.c(akoVar);
        } else if (t == m.DROP_SHADOW_DISTANCE && (ahiVar2 = this.q) != null) {
            ahiVar2.d(akoVar);
        } else if (t != m.DROP_SHADOW_RADIUS || (ahiVar = this.q) == null) {
        } else {
            ahiVar.e(akoVar);
        }
    }

    @Override // tb.agn
    public void a(List<agn> list, List<agn> list2) {
        ahf ahfVar = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            agn agnVar = list.get(size);
            if (agnVar instanceof ahf) {
                ahf ahfVar2 = (ahf) agnVar;
                if (ahfVar2.b() == ShapeTrimPath.Type.INDIVIDUALLY) {
                    ahfVar = ahfVar2;
                }
            }
        }
        if (ahfVar != null) {
            ahfVar.a(this);
        }
        a aVar = null;
        for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
            agn agnVar2 = list2.get(size2);
            if (agnVar2 instanceof ahf) {
                ahf ahfVar3 = (ahf) agnVar2;
                if (ahfVar3.b() == ShapeTrimPath.Type.INDIVIDUALLY) {
                    if (aVar != null) {
                        this.i.add(aVar);
                    }
                    aVar = new a(ahfVar3);
                    ahfVar3.a(this);
                }
            }
            if (agnVar2 instanceof agx) {
                if (aVar == null) {
                    aVar = new a(ahfVar);
                }
                aVar.f25323a.add((agx) agnVar2);
            }
        }
        if (aVar != null) {
            this.i.add(aVar);
        }
    }

    @Override // tb.ahg.a
    public void onValueChanged() {
        this.h.invalidateSelf();
    }
}
