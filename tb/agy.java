package tb;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.m;
import com.airbnb.lottie.model.content.PolystarShape;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.model.d;
import com.airbnb.lottie.model.layer.a;
import java.util.List;
import tb.ahg;
import tb.mto;

/* loaded from: classes2.dex */
public class agy implements agv, agx, ahg.a {
    private final String b;
    private final LottieDrawable c;
    private final PolystarShape.Type d;
    private final boolean e;
    private final boolean f;
    private final ahg<?, Float> g;
    private final ahg<?, PointF> h;
    private final ahg<?, Float> i;
    private final ahg<?, Float> j;
    private final ahg<?, Float> k;
    private final ahg<?, Float> l;
    private final ahg<?, Float> m;
    private boolean o;

    /* renamed from: a  reason: collision with root package name */
    private final Path f25331a = new Path();
    private final agm n = new agm();

    /* renamed from: tb.agy$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f25332a = new int[PolystarShape.Type.values().length];

        static {
            try {
                f25332a[PolystarShape.Type.STAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f25332a[PolystarShape.Type.POLYGON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public agy(LottieDrawable lottieDrawable, a aVar, PolystarShape polystarShape) {
        ahg<Float, Float> ahgVar;
        this.c = lottieDrawable;
        this.b = polystarShape.a();
        this.d = polystarShape.b();
        this.e = polystarShape.j();
        this.f = polystarShape.k();
        this.g = polystarShape.c().a();
        this.h = polystarShape.d().a();
        this.i = polystarShape.e().a();
        this.k = polystarShape.g().a();
        this.m = polystarShape.i().a();
        if (this.d == PolystarShape.Type.STAR) {
            this.j = polystarShape.f().a();
            ahgVar = polystarShape.h().a();
        } else {
            ahgVar = null;
            this.j = null;
        }
        this.l = ahgVar;
        aVar.a(this.g);
        aVar.a(this.h);
        aVar.a(this.i);
        aVar.a(this.k);
        aVar.a(this.m);
        if (this.d == PolystarShape.Type.STAR) {
            aVar.a(this.j);
            aVar.a(this.l);
        }
        this.g.a(this);
        this.h.a(this);
        this.i.a(this);
        this.k.a(this);
        this.m.a(this);
        if (this.d == PolystarShape.Type.STAR) {
            this.j.a(this);
            this.l.a(this);
        }
    }

    private void b() {
        this.o = false;
        this.c.invalidateSelf();
    }

    private void c() {
        ahg<?, Float> ahgVar;
        double d;
        int i;
        double d2;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float floatValue = this.g.g().floatValue();
        double radians = Math.toRadians((this.i == null ? mto.a.GEO_NOT_SUPPORT : ahgVar.g().floatValue()) - 90.0d);
        double d3 = floatValue;
        float f13 = (float) (6.283185307179586d / d3);
        if (this.f) {
            f13 = -f13;
        }
        float f14 = f13 / 2.0f;
        float f15 = floatValue - ((int) floatValue);
        int i2 = (f15 > 0.0f ? 1 : (f15 == 0.0f ? 0 : -1));
        if (i2 != 0) {
            radians += (1.0f - f15) * f14;
        }
        float floatValue2 = this.k.g().floatValue();
        float floatValue3 = this.j.g().floatValue();
        ahg<?, Float> ahgVar2 = this.l;
        float floatValue4 = ahgVar2 != null ? ahgVar2.g().floatValue() / 100.0f : 0.0f;
        ahg<?, Float> ahgVar3 = this.m;
        float floatValue5 = ahgVar3 != null ? ahgVar3.g().floatValue() / 100.0f : 0.0f;
        if (i2 != 0) {
            f3 = ((floatValue2 - floatValue3) * f15) + floatValue3;
            i = i2;
            double d4 = f3;
            d = d3;
            f = (float) (d4 * Math.cos(radians));
            f2 = (float) (d4 * Math.sin(radians));
            this.f25331a.moveTo(f, f2);
            d2 = radians + ((f13 * f15) / 2.0f);
        } else {
            d = d3;
            i = i2;
            double d5 = floatValue2;
            float cos = (float) (Math.cos(radians) * d5);
            float sin = (float) (d5 * Math.sin(radians));
            this.f25331a.moveTo(cos, sin);
            d2 = radians + f14;
            f = cos;
            f2 = sin;
            f3 = 0.0f;
        }
        double ceil = Math.ceil(d) * 2.0d;
        boolean z = false;
        double d6 = d2;
        float f16 = f14;
        int i3 = 0;
        while (true) {
            double d7 = i3;
            if (d7 >= ceil) {
                PointF g = this.h.g();
                this.f25331a.offset(g.x, g.y);
                this.f25331a.close();
                return;
            }
            float f17 = z ? floatValue2 : floatValue3;
            int i4 = (f3 > 0.0f ? 1 : (f3 == 0.0f ? 0 : -1));
            if (i4 == 0 || d7 != ceil - 2.0d) {
                f4 = f16;
            } else {
                f4 = f16;
                f16 = (f13 * f15) / 2.0f;
            }
            if (i4 == 0 || d7 != ceil - 1.0d) {
                f5 = f13;
                f6 = floatValue3;
                f7 = f17;
                f8 = floatValue2;
            } else {
                f5 = f13;
                f8 = floatValue2;
                f6 = floatValue3;
                f7 = f3;
            }
            double d8 = f7;
            float f18 = f16;
            float cos2 = (float) (d8 * Math.cos(d6));
            float sin2 = (float) (d8 * Math.sin(d6));
            if (floatValue4 == 0.0f && floatValue5 == 0.0f) {
                this.f25331a.lineTo(cos2, sin2);
                f12 = sin2;
                f9 = floatValue4;
                f10 = floatValue5;
                f11 = f3;
            } else {
                f9 = floatValue4;
                f10 = floatValue5;
                double atan2 = (float) (Math.atan2(f2, f) - 1.5707963267948966d);
                float cos3 = (float) Math.cos(atan2);
                float sin3 = (float) Math.sin(atan2);
                f11 = f3;
                f12 = sin2;
                float f19 = f;
                double atan22 = (float) (Math.atan2(sin2, cos2) - 1.5707963267948966d);
                float cos4 = (float) Math.cos(atan22);
                float sin4 = (float) Math.sin(atan22);
                float f20 = z ? f9 : f10;
                float f21 = z ? f10 : f9;
                float f22 = (z ? f6 : f8) * f20 * 0.47829f;
                float f23 = cos3 * f22;
                float f24 = f22 * sin3;
                float f25 = (z ? f8 : f6) * f21 * 0.47829f;
                float f26 = cos4 * f25;
                float f27 = f25 * sin4;
                if (i != 0) {
                    if (i3 == 0) {
                        f23 *= f15;
                        f24 *= f15;
                    } else if (d7 == ceil - 1.0d) {
                        f26 *= f15;
                        f27 *= f15;
                    }
                }
                this.f25331a.cubicTo(f19 - f23, f2 - f24, cos2 + f26, f12 + f27, cos2, f12);
            }
            d6 += f18;
            z = !z;
            i3++;
            f = cos2;
            f3 = f11;
            floatValue2 = f8;
            f13 = f5;
            f16 = f4;
            floatValue3 = f6;
            floatValue4 = f9;
            floatValue5 = f10;
            f2 = f12;
        }
    }

    private void e() {
        ahg<?, Float> ahgVar;
        double d;
        double d2;
        double d3;
        int i;
        int floor = (int) Math.floor(this.g.g().floatValue());
        double radians = Math.toRadians((this.i == null ? mto.a.GEO_NOT_SUPPORT : ahgVar.g().floatValue()) - 90.0d);
        double d4 = floor;
        float floatValue = this.m.g().floatValue() / 100.0f;
        float floatValue2 = this.k.g().floatValue();
        double d5 = floatValue2;
        float cos = (float) (Math.cos(radians) * d5);
        float sin = (float) (Math.sin(radians) * d5);
        this.f25331a.moveTo(cos, sin);
        double d6 = (float) (6.283185307179586d / d4);
        double d7 = radians + d6;
        double ceil = Math.ceil(d4);
        int i2 = 0;
        while (i2 < ceil) {
            float cos2 = (float) (Math.cos(d7) * d5);
            double d8 = ceil;
            float sin2 = (float) (d5 * Math.sin(d7));
            if (floatValue != 0.0f) {
                d2 = d5;
                i = i2;
                d = d7;
                double atan2 = (float) (Math.atan2(sin, cos) - 1.5707963267948966d);
                float cos3 = (float) Math.cos(atan2);
                d3 = d6;
                double atan22 = (float) (Math.atan2(sin2, cos2) - 1.5707963267948966d);
                float f = floatValue2 * floatValue * 0.25f;
                this.f25331a.cubicTo(cos - (cos3 * f), sin - (((float) Math.sin(atan2)) * f), cos2 + (((float) Math.cos(atan22)) * f), sin2 + (f * ((float) Math.sin(atan22))), cos2, sin2);
            } else {
                d = d7;
                d2 = d5;
                d3 = d6;
                i = i2;
                this.f25331a.lineTo(cos2, sin2);
            }
            d7 = d + d3;
            i2 = i + 1;
            sin = sin2;
            cos = cos2;
            ceil = d8;
            d5 = d2;
            d6 = d3;
        }
        PointF g = this.h.g();
        this.f25331a.offset(g.x, g.y);
        this.f25331a.close();
    }

    @Override // tb.agn
    public String a() {
        return this.b;
    }

    @Override // com.airbnb.lottie.model.e
    public void a(d dVar, int i, List<d> list, d dVar2) {
        akk.a(dVar, i, list, dVar2, this);
    }

    @Override // com.airbnb.lottie.model.e
    public <T> void a(T t, ako<T> akoVar) {
        ahg<?, Float> ahgVar;
        ahg ahgVar2;
        ahg<?, Float> ahgVar3;
        if (t == m.POLYSTAR_POINTS) {
            ahgVar2 = this.g;
        } else if (t == m.POLYSTAR_ROTATION) {
            ahgVar2 = this.i;
        } else if (t == m.POSITION) {
            ahgVar2 = this.h;
        } else if (t == m.POLYSTAR_INNER_RADIUS && (ahgVar3 = this.j) != null) {
            ahgVar3.a((ako<Float>) akoVar);
            return;
        } else if (t != m.POLYSTAR_OUTER_RADIUS) {
            if (t == m.POLYSTAR_INNER_ROUNDEDNESS && (ahgVar = this.l) != null) {
                ahgVar.a((ako<Float>) akoVar);
                return;
            } else if (t != m.POLYSTAR_OUTER_ROUNDEDNESS) {
                return;
            } else {
                this.m.a((ako<Float>) akoVar);
                return;
            }
        } else {
            ahgVar2 = this.k;
        }
        ahgVar2.a(akoVar);
    }

    @Override // tb.agn
    public void a(List<agn> list, List<agn> list2) {
        for (int i = 0; i < list.size(); i++) {
            agn agnVar = list.get(i);
            if (agnVar instanceof ahf) {
                ahf ahfVar = (ahf) agnVar;
                if (ahfVar.b() == ShapeTrimPath.Type.SIMULTANEOUSLY) {
                    this.n.a(ahfVar);
                    ahfVar.a(this);
                }
            }
        }
    }

    @Override // tb.agx
    public Path d() {
        if (this.o) {
            return this.f25331a;
        }
        this.f25331a.reset();
        if (!this.e) {
            int i = AnonymousClass1.f25332a[this.d.ordinal()];
            if (i == 1) {
                c();
            } else if (i == 2) {
                e();
            }
            this.f25331a.close();
            this.n.a(this.f25331a);
        }
        this.o = true;
        return this.f25331a;
    }

    @Override // tb.ahg.a
    public void onValueChanged() {
        b();
    }
}
