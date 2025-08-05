package tb;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.support.v4.util.LongSparseArray;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.m;
import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.model.content.d;
import com.airbnb.lottie.model.content.f;
import com.airbnb.lottie.model.layer.a;

/* loaded from: classes2.dex */
public class agt extends agl {
    private final String d;
    private final boolean e;
    private final LongSparseArray<LinearGradient> f;
    private final LongSparseArray<RadialGradient> g;
    private final RectF h;
    private final GradientType i;
    private final int j;
    private final ahg<d, d> k;
    private final ahg<PointF, PointF> l;
    private final ahg<PointF, PointF> m;
    private ahw n;

    public agt(LottieDrawable lottieDrawable, a aVar, f fVar) {
        super(lottieDrawable, aVar, fVar.h().toPaintCap(), fVar.i().toPaintJoin(), fVar.l(), fVar.d(), fVar.g(), fVar.j(), fVar.k());
        this.f = new LongSparseArray<>();
        this.g = new LongSparseArray<>();
        this.h = new RectF();
        this.d = fVar.a();
        this.i = fVar.b();
        this.e = fVar.m();
        this.j = (int) (lottieDrawable.B().e() / 32.0f);
        this.k = fVar.c().a();
        this.k.a(this);
        aVar.a(this.k);
        this.l = fVar.e().a();
        this.l.a(this);
        aVar.a(this.l);
        this.m = fVar.f().a();
        this.m.a(this);
        aVar.a(this.m);
    }

    private int[] a(int[] iArr) {
        ahw ahwVar = this.n;
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
        LinearGradient linearGradient = this.f.get(d);
        if (linearGradient != null) {
            return linearGradient;
        }
        PointF g = this.l.g();
        PointF g2 = this.m.g();
        d g3 = this.k.g();
        LinearGradient linearGradient2 = new LinearGradient(g.x, g.y, g2.x, g2.y, a(g3.b()), g3.a(), Shader.TileMode.CLAMP);
        this.f.put(d, linearGradient2);
        return linearGradient2;
    }

    private RadialGradient c() {
        float f;
        float f2;
        long d = d();
        RadialGradient radialGradient = this.g.get(d);
        if (radialGradient != null) {
            return radialGradient;
        }
        PointF g = this.l.g();
        PointF g2 = this.m.g();
        d g3 = this.k.g();
        int[] a2 = a(g3.b());
        float[] a3 = g3.a();
        RadialGradient radialGradient2 = new RadialGradient(g.x, g.y, (float) Math.hypot(g2.x - f, g2.y - f2), a2, a3, Shader.TileMode.CLAMP);
        this.g.put(d, radialGradient2);
        return radialGradient2;
    }

    private int d() {
        int round = Math.round(this.l.h() * this.j);
        int round2 = Math.round(this.m.h() * this.j);
        int round3 = Math.round(this.k.h() * this.j);
        int i = round != 0 ? 527 * round : 17;
        if (round2 != 0) {
            i = i * 31 * round2;
        }
        return round3 != 0 ? i * 31 * round3 : i;
    }

    @Override // tb.agn
    public String a() {
        return this.d;
    }

    @Override // tb.agl, tb.agp
    public void a(Canvas canvas, Matrix matrix, int i) {
        if (this.e) {
            return;
        }
        a(this.h, matrix, false);
        Shader b = this.i == GradientType.LINEAR ? b() : c();
        b.setLocalMatrix(matrix);
        this.b.setShader(b);
        super.a(canvas, matrix, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // tb.agl, com.airbnb.lottie.model.e
    public <T> void a(T t, ako<T> akoVar) {
        super.a((agt) t, (ako<agt>) akoVar);
        if (t == m.GRADIENT_COLOR) {
            if (this.n != null) {
                this.f25322a.b(this.n);
            }
            if (akoVar == null) {
                this.n = null;
                return;
            }
            this.n = new ahw(akoVar);
            this.n.a(this);
            this.f25322a.a(this.n);
        }
    }
}
