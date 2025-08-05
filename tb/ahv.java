package tb;

import android.graphics.Matrix;
import android.graphics.PointF;
import com.airbnb.lottie.m;
import com.airbnb.lottie.model.layer.a;
import java.util.Collections;
import tb.ahg;

/* loaded from: classes2.dex */
public class ahv {

    /* renamed from: a  reason: collision with root package name */
    private final Matrix f25345a = new Matrix();
    private final Matrix b;
    private final Matrix c;
    private final Matrix d;
    private final float[] e;
    private ahg<PointF, PointF> f;
    private ahg<?, PointF> g;
    private ahg<akp, akp> h;
    private ahg<Float, Float> i;
    private ahg<Integer, Integer> j;
    private ahj k;
    private ahj l;
    private ahg<?, Float> m;
    private ahg<?, Float> n;

    public ahv(aik aikVar) {
        this.f = aikVar.a() == null ? null : aikVar.a().a();
        this.g = aikVar.b() == null ? null : aikVar.b().a();
        this.h = aikVar.c() == null ? null : aikVar.c().a();
        this.i = aikVar.d() == null ? null : aikVar.d().a();
        this.k = aikVar.h() == null ? null : (ahj) aikVar.h().a();
        if (this.k != null) {
            this.b = new Matrix();
            this.c = new Matrix();
            this.d = new Matrix();
            this.e = new float[9];
        } else {
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
        }
        this.l = aikVar.i() == null ? null : (ahj) aikVar.i().a();
        if (aikVar.e() != null) {
            this.j = aikVar.e().a();
        }
        if (aikVar.f() != null) {
            this.m = aikVar.f().a();
        } else {
            this.m = null;
        }
        if (aikVar.g() != null) {
            this.n = aikVar.g().a();
        } else {
            this.n = null;
        }
    }

    private void e() {
        for (int i = 0; i < 9; i++) {
            this.e[i] = 0.0f;
        }
    }

    public ahg<?, Integer> a() {
        return this.j;
    }

    public void a(float f) {
        ahg<Integer, Integer> ahgVar = this.j;
        if (ahgVar != null) {
            ahgVar.a(f);
        }
        ahg<?, Float> ahgVar2 = this.m;
        if (ahgVar2 != null) {
            ahgVar2.a(f);
        }
        ahg<?, Float> ahgVar3 = this.n;
        if (ahgVar3 != null) {
            ahgVar3.a(f);
        }
        ahg<PointF, PointF> ahgVar4 = this.f;
        if (ahgVar4 != null) {
            ahgVar4.a(f);
        }
        ahg<?, PointF> ahgVar5 = this.g;
        if (ahgVar5 != null) {
            ahgVar5.a(f);
        }
        ahg<akp, akp> ahgVar6 = this.h;
        if (ahgVar6 != null) {
            ahgVar6.a(f);
        }
        ahg<Float, Float> ahgVar7 = this.i;
        if (ahgVar7 != null) {
            ahgVar7.a(f);
        }
        ahj ahjVar = this.k;
        if (ahjVar != null) {
            ahjVar.a(f);
        }
        ahj ahjVar2 = this.l;
        if (ahjVar2 != null) {
            ahjVar2.a(f);
        }
    }

    public void a(a aVar) {
        aVar.a(this.j);
        aVar.a(this.m);
        aVar.a(this.n);
        aVar.a(this.f);
        aVar.a(this.g);
        aVar.a(this.h);
        aVar.a(this.i);
        aVar.a(this.k);
        aVar.a(this.l);
    }

    public void a(ahg.a aVar) {
        ahg<Integer, Integer> ahgVar = this.j;
        if (ahgVar != null) {
            ahgVar.a(aVar);
        }
        ahg<?, Float> ahgVar2 = this.m;
        if (ahgVar2 != null) {
            ahgVar2.a(aVar);
        }
        ahg<?, Float> ahgVar3 = this.n;
        if (ahgVar3 != null) {
            ahgVar3.a(aVar);
        }
        ahg<PointF, PointF> ahgVar4 = this.f;
        if (ahgVar4 != null) {
            ahgVar4.a(aVar);
        }
        ahg<?, PointF> ahgVar5 = this.g;
        if (ahgVar5 != null) {
            ahgVar5.a(aVar);
        }
        ahg<akp, akp> ahgVar6 = this.h;
        if (ahgVar6 != null) {
            ahgVar6.a(aVar);
        }
        ahg<Float, Float> ahgVar7 = this.i;
        if (ahgVar7 != null) {
            ahgVar7.a(aVar);
        }
        ahj ahjVar = this.k;
        if (ahjVar != null) {
            ahjVar.a(aVar);
        }
        ahj ahjVar2 = this.l;
        if (ahjVar2 != null) {
            ahjVar2.a(aVar);
        }
    }

    public <T> boolean a(T t, ako<T> akoVar) {
        ahj ahjVar;
        ahg ahgVar;
        if (t == m.TRANSFORM_ANCHOR_POINT) {
            ahgVar = this.f;
            if (ahgVar == null) {
                this.f = new ahw(akoVar, new PointF());
                return true;
            }
        } else if (t == m.TRANSFORM_POSITION) {
            ahgVar = this.g;
            if (ahgVar == null) {
                this.g = new ahw(akoVar, new PointF());
                return true;
            }
        } else {
            if (t == m.TRANSFORM_POSITION_X) {
                ahg<?, PointF> ahgVar2 = this.g;
                if (ahgVar2 instanceof aht) {
                    ((aht) ahgVar2).b(akoVar);
                    return true;
                }
            }
            if (t == m.TRANSFORM_POSITION_Y) {
                ahg<?, PointF> ahgVar3 = this.g;
                if (ahgVar3 instanceof aht) {
                    ((aht) ahgVar3).c(akoVar);
                    return true;
                }
            }
            if (t == m.TRANSFORM_SCALE) {
                ahgVar = this.h;
                if (ahgVar == null) {
                    this.h = new ahw(akoVar, new akp());
                    return true;
                }
            } else if (t == m.TRANSFORM_ROTATION) {
                ahgVar = this.i;
                if (ahgVar == null) {
                    this.i = new ahw(akoVar, Float.valueOf(0.0f));
                    return true;
                }
            } else if (t == m.TRANSFORM_OPACITY) {
                ahgVar = this.j;
                if (ahgVar == null) {
                    this.j = new ahw(akoVar, 100);
                    return true;
                }
            } else if (t == m.TRANSFORM_START_OPACITY) {
                ahgVar = this.m;
                if (ahgVar == null) {
                    this.m = new ahw(akoVar, Float.valueOf(100.0f));
                    return true;
                }
            } else if (t != m.TRANSFORM_END_OPACITY) {
                if (t == m.TRANSFORM_SKEW) {
                    if (this.k == null) {
                        this.k = new ahj(Collections.singletonList(new akm(Float.valueOf(0.0f))));
                    }
                    ahjVar = this.k;
                } else if (t != m.TRANSFORM_SKEW_ANGLE) {
                    return false;
                } else {
                    if (this.l == null) {
                        this.l = new ahj(Collections.singletonList(new akm(Float.valueOf(0.0f))));
                    }
                    ahjVar = this.l;
                }
                ahjVar.a(akoVar);
                return true;
            } else {
                ahgVar = this.n;
                if (ahgVar == null) {
                    this.n = new ahw(akoVar, Float.valueOf(100.0f));
                    return true;
                }
            }
        }
        ahgVar.a(akoVar);
        return true;
    }

    public Matrix b(float f) {
        ahg<?, PointF> ahgVar = this.g;
        PointF pointF = null;
        PointF g = ahgVar == null ? null : ahgVar.g();
        ahg<akp, akp> ahgVar2 = this.h;
        akp g2 = ahgVar2 == null ? null : ahgVar2.g();
        this.f25345a.reset();
        if (g != null) {
            this.f25345a.preTranslate(g.x * f, g.y * f);
        }
        if (g2 != null) {
            double d = f;
            this.f25345a.preScale((float) Math.pow(g2.a(), d), (float) Math.pow(g2.b(), d));
        }
        ahg<Float, Float> ahgVar3 = this.i;
        if (ahgVar3 != null) {
            float floatValue = ahgVar3.g().floatValue();
            ahg<PointF, PointF> ahgVar4 = this.f;
            if (ahgVar4 != null) {
                pointF = ahgVar4.g();
            }
            Matrix matrix = this.f25345a;
            float f2 = floatValue * f;
            float f3 = 0.0f;
            float f4 = pointF == null ? 0.0f : pointF.x;
            if (pointF != null) {
                f3 = pointF.y;
            }
            matrix.preRotate(f2, f4, f3);
        }
        return this.f25345a;
    }

    public ahg<?, Float> b() {
        return this.m;
    }

    public ahg<?, Float> c() {
        return this.n;
    }

    public Matrix d() {
        PointF g;
        this.f25345a.reset();
        ahg<?, PointF> ahgVar = this.g;
        if (ahgVar != null && (g = ahgVar.g()) != null && (g.x != 0.0f || g.y != 0.0f)) {
            this.f25345a.preTranslate(g.x, g.y);
        }
        ahg<Float, Float> ahgVar2 = this.i;
        if (ahgVar2 != null) {
            float floatValue = ahgVar2 instanceof ahw ? ahgVar2.g().floatValue() : ((ahj) ahgVar2).i();
            if (floatValue != 0.0f) {
                this.f25345a.preRotate(floatValue);
            }
        }
        ahj ahjVar = this.k;
        if (ahjVar != null) {
            ahj ahjVar2 = this.l;
            float cos = ahjVar2 == null ? 0.0f : (float) Math.cos(Math.toRadians((-ahjVar2.i()) + 90.0f));
            ahj ahjVar3 = this.l;
            float sin = ahjVar3 == null ? 1.0f : (float) Math.sin(Math.toRadians((-ahjVar3.i()) + 90.0f));
            float tan = (float) Math.tan(Math.toRadians(ahjVar.i()));
            e();
            float[] fArr = this.e;
            fArr[0] = cos;
            fArr[1] = sin;
            float f = -sin;
            fArr[3] = f;
            fArr[4] = cos;
            fArr[8] = 1.0f;
            this.b.setValues(fArr);
            e();
            float[] fArr2 = this.e;
            fArr2[0] = 1.0f;
            fArr2[3] = tan;
            fArr2[4] = 1.0f;
            fArr2[8] = 1.0f;
            this.c.setValues(fArr2);
            e();
            float[] fArr3 = this.e;
            fArr3[0] = cos;
            fArr3[1] = f;
            fArr3[3] = sin;
            fArr3[4] = cos;
            fArr3[8] = 1.0f;
            this.d.setValues(fArr3);
            this.c.preConcat(this.b);
            this.d.preConcat(this.c);
            this.f25345a.preConcat(this.d);
        }
        ahg<akp, akp> ahgVar3 = this.h;
        if (ahgVar3 != null) {
            akp g2 = ahgVar3.g();
            if (g2.a() != 1.0f || g2.b() != 1.0f) {
                this.f25345a.preScale(g2.a(), g2.b());
            }
        }
        ahg<PointF, PointF> ahgVar4 = this.f;
        if (ahgVar4 != null) {
            PointF g3 = ahgVar4.g();
            if (g3.x != 0.0f || g3.y != 0.0f) {
                this.f25345a.preTranslate(-g3.x, -g3.y);
            }
        }
        return this.f25345a;
    }
}
