package tb;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.support.v4.util.LongSparseArray;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.f;
import com.airbnb.lottie.m;
import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.model.content.d;
import com.airbnb.lottie.model.content.e;
import com.airbnb.lottie.model.layer.a;
import java.util.ArrayList;
import java.util.List;
import tb.ahg;

/* loaded from: classes2.dex */
public class ags implements agp, agv, ahg.a {
    private final String b;
    private final boolean c;
    private final a d;
    private final GradientType k;
    private final ahg<d, d> l;
    private final ahg<Integer, Integer> m;
    private final ahg<PointF, PointF> n;
    private final ahg<PointF, PointF> o;
    private ahg<ColorFilter, ColorFilter> p;
    private ahw q;
    private final LottieDrawable r;
    private final int s;
    private ahg<Float, Float> t;
    private ahi u;
    private final LongSparseArray<LinearGradient> e = new LongSparseArray<>();
    private final LongSparseArray<RadialGradient> f = new LongSparseArray<>();
    private final Path g = new Path();
    private final Paint h = new agk(1);
    private final RectF i = new RectF();
    private final List<agx> j = new ArrayList();

    /* renamed from: a  reason: collision with root package name */
    float f25328a = 0.0f;

    public ags(LottieDrawable lottieDrawable, a aVar, e eVar) {
        this.d = aVar;
        this.b = eVar.a();
        this.c = eVar.h();
        this.r = lottieDrawable;
        this.k = eVar.b();
        this.g.setFillType(eVar.c());
        this.s = (int) (lottieDrawable.B().e() / 32.0f);
        this.l = eVar.d().a();
        this.l.a(this);
        aVar.a(this.l);
        this.m = eVar.e().a();
        this.m.a(this);
        aVar.a(this.m);
        this.n = eVar.f().a();
        this.n.a(this);
        aVar.a(this.n);
        this.o = eVar.g().a();
        this.o.a(this);
        aVar.a(this.o);
        if (aVar.e() != null) {
            this.t = aVar.e().a().a();
            this.t.a(this);
            aVar.a(this.t);
        }
        if (aVar.f() != null) {
            this.u = new ahi(this, aVar, aVar.f());
        }
    }

    private int[] a(int[] iArr) {
        ahw ahwVar = this.q;
        if (ahwVar != null) {
            Integer[] numArr = (Integer[]) ahwVar.g();
            int i = 0;
            if (iArr.length == numArr.length) {
                while (i < iArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i < numArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            }
        }
        return iArr;
    }

    private LinearGradient b() {
        long d = d();
        LinearGradient linearGradient = this.e.get(d);
        if (linearGradient != null) {
            return linearGradient;
        }
        PointF g = this.n.g();
        PointF g2 = this.o.g();
        d g3 = this.l.g();
        LinearGradient linearGradient2 = new LinearGradient(g.x, g.y, g2.x, g2.y, a(g3.b()), g3.a(), Shader.TileMode.CLAMP);
        this.e.put(d, linearGradient2);
        return linearGradient2;
    }

    private RadialGradient c() {
        long d = d();
        RadialGradient radialGradient = this.f.get(d);
        if (radialGradient != null) {
            return radialGradient;
        }
        PointF g = this.n.g();
        PointF g2 = this.o.g();
        d g3 = this.l.g();
        int[] a2 = a(g3.b());
        float[] a3 = g3.a();
        float f = g.x;
        float f2 = g.y;
        float hypot = (float) Math.hypot(g2.x - f, g2.y - f2);
        RadialGradient radialGradient2 = new RadialGradient(f, f2, hypot <= 0.0f ? 0.001f : hypot, a2, a3, Shader.TileMode.CLAMP);
        this.f.put(d, radialGradient2);
        return radialGradient2;
    }

    private int d() {
        int round = Math.round(this.n.h() * this.s);
        int round2 = Math.round(this.o.h() * this.s);
        int round3 = Math.round(this.l.h() * this.s);
        int i = round != 0 ? 527 * round : 17;
        if (round2 != 0) {
            i = i * 31 * round2;
        }
        return round3 != 0 ? i * 31 * round3 : i;
    }

    @Override // tb.agn
    public String a() {
        return this.b;
    }

    @Override // tb.agp
    public void a(Canvas canvas, Matrix matrix, int i) {
        if (this.c) {
            return;
        }
        f.a("GradientFillContent#draw");
        this.g.reset();
        for (int i2 = 0; i2 < this.j.size(); i2++) {
            this.g.addPath(this.j.get(i2).d(), matrix);
        }
        this.g.computeBounds(this.i, false);
        Shader b = this.k == GradientType.LINEAR ? b() : c();
        b.setLocalMatrix(matrix);
        this.h.setShader(b);
        ahg<ColorFilter, ColorFilter> ahgVar = this.p;
        if (ahgVar != null) {
            this.h.setColorFilter(ahgVar.g());
        }
        ahg<Float, Float> ahgVar2 = this.t;
        if (ahgVar2 != null) {
            float floatValue = ahgVar2.g().floatValue();
            if (floatValue == 0.0f) {
                this.h.setMaskFilter(null);
            } else if (floatValue != this.f25328a) {
                this.h.setMaskFilter(new BlurMaskFilter(floatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.f25328a = floatValue;
        }
        ahi ahiVar = this.u;
        if (ahiVar != null) {
            ahiVar.a(this.h);
        }
        this.h.setAlpha(akk.a((int) ((((i / 255.0f) * this.m.g().intValue()) / 100.0f) * 255.0f), 0, 255));
        canvas.drawPath(this.g, this.h);
        f.b("GradientFillContent#draw");
    }

    @Override // tb.agp
    public void a(RectF rectF, Matrix matrix, boolean z) {
        this.g.reset();
        for (int i = 0; i < this.j.size(); i++) {
            this.g.addPath(this.j.get(i).d(), matrix);
        }
        this.g.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // com.airbnb.lottie.model.e
    public void a(com.airbnb.lottie.model.d dVar, int i, List<com.airbnb.lottie.model.d> list, com.airbnb.lottie.model.d dVar2) {
        akk.a(dVar, i, list, dVar2, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.model.e
    public <T> void a(T t, ako<T> akoVar) {
        ahi ahiVar;
        ahi ahiVar2;
        ahi ahiVar3;
        ahi ahiVar4;
        ahi ahiVar5;
        if (t == m.OPACITY) {
            this.m.a((ako<Integer>) akoVar);
        } else if (t == m.COLOR_FILTER) {
            ahg<ColorFilter, ColorFilter> ahgVar = this.p;
            if (ahgVar != null) {
                this.d.b(ahgVar);
            }
            if (akoVar == null) {
                this.p = null;
                return;
            }
            this.p = new ahw(akoVar);
            this.p.a(this);
            this.d.a(this.p);
        } else if (t == m.GRADIENT_COLOR) {
            ahw ahwVar = this.q;
            if (ahwVar != null) {
                this.d.b(ahwVar);
            }
            if (akoVar == null) {
                this.q = null;
                return;
            }
            this.e.clear();
            this.f.clear();
            this.q = new ahw(akoVar);
            this.q.a(this);
            this.d.a(this.q);
        } else if (t == m.BLUR_RADIUS) {
            ahg<Float, Float> ahgVar2 = this.t;
            if (ahgVar2 != null) {
                ahgVar2.a((ako<Float>) akoVar);
                return;
            }
            this.t = new ahw(akoVar);
            this.t.a(this);
            this.d.a(this.t);
        } else if (t == m.DROP_SHADOW_COLOR && (ahiVar5 = this.u) != null) {
            ahiVar5.a((ako<Integer>) akoVar);
        } else if (t == m.DROP_SHADOW_OPACITY && (ahiVar4 = this.u) != null) {
            ahiVar4.b(akoVar);
        } else if (t == m.DROP_SHADOW_DIRECTION && (ahiVar3 = this.u) != null) {
            ahiVar3.c(akoVar);
        } else if (t == m.DROP_SHADOW_DISTANCE && (ahiVar2 = this.u) != null) {
            ahiVar2.d(akoVar);
        } else if (t != m.DROP_SHADOW_RADIUS || (ahiVar = this.u) == null) {
        } else {
            ahiVar.e(akoVar);
        }
    }

    @Override // tb.agn
    public void a(List<agn> list, List<agn> list2) {
        for (int i = 0; i < list2.size(); i++) {
            agn agnVar = list2.get(i);
            if (agnVar instanceof agx) {
                this.j.add((agx) agnVar);
            }
        }
    }

    @Override // tb.ahg.a
    public void onValueChanged() {
        this.r.invalidateSelf();
    }
}
