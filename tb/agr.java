package tb;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.f;
import com.airbnb.lottie.m;
import com.airbnb.lottie.model.content.k;
import com.airbnb.lottie.model.d;
import com.airbnb.lottie.model.layer.a;
import java.util.ArrayList;
import java.util.List;
import tb.ahg;

/* loaded from: classes2.dex */
public class agr implements agp, agv, ahg.a {

    /* renamed from: a  reason: collision with root package name */
    float f25327a;
    private final a d;
    private final String e;
    private final boolean f;
    private final ahg<Integer, Integer> h;
    private final ahg<Integer, Integer> i;
    private ahg<ColorFilter, ColorFilter> j;
    private final LottieDrawable k;
    private ahg<Float, Float> l;
    private ahi m;
    private final Path b = new Path();
    private final Paint c = new agk(1);
    private final List<agx> g = new ArrayList();

    public agr(LottieDrawable lottieDrawable, a aVar, k kVar) {
        this.d = aVar;
        this.e = kVar.a();
        this.f = kVar.e();
        this.k = lottieDrawable;
        if (aVar.e() != null) {
            this.l = aVar.e().a().a();
            this.l.a(this);
            aVar.a(this.l);
        }
        if (aVar.f() != null) {
            this.m = new ahi(this, aVar, aVar.f());
        }
        if (kVar.b() == null || kVar.c() == null) {
            this.h = null;
            this.i = null;
            return;
        }
        this.b.setFillType(kVar.d());
        this.h = kVar.b().a();
        this.h.a(this);
        aVar.a(this.h);
        this.i = kVar.c().a();
        this.i.a(this);
        aVar.a(this.i);
    }

    @Override // tb.agn
    public String a() {
        return this.e;
    }

    @Override // tb.agp
    public void a(Canvas canvas, Matrix matrix, int i) {
        if (this.f) {
            return;
        }
        f.a("FillContent#draw");
        this.c.setColor((akk.a((int) ((((i / 255.0f) * this.i.g().intValue()) / 100.0f) * 255.0f), 0, 255) << 24) | (((ahh) this.h).i() & 16777215));
        ahg<ColorFilter, ColorFilter> ahgVar = this.j;
        if (ahgVar != null) {
            this.c.setColorFilter(ahgVar.g());
        }
        ahg<Float, Float> ahgVar2 = this.l;
        if (ahgVar2 != null) {
            float floatValue = ahgVar2.g().floatValue();
            if (floatValue == 0.0f) {
                this.c.setMaskFilter(null);
            } else if (floatValue != this.f25327a) {
                this.c.setMaskFilter(this.d.b(floatValue));
            }
            this.f25327a = floatValue;
        }
        ahi ahiVar = this.m;
        if (ahiVar != null) {
            ahiVar.a(this.c);
        }
        this.b.reset();
        for (int i2 = 0; i2 < this.g.size(); i2++) {
            this.b.addPath(this.g.get(i2).d(), matrix);
        }
        canvas.drawPath(this.b, this.c);
        f.b("FillContent#draw");
    }

    @Override // tb.agp
    public void a(RectF rectF, Matrix matrix, boolean z) {
        this.b.reset();
        for (int i = 0; i < this.g.size(); i++) {
            this.b.addPath(this.g.get(i).d(), matrix);
        }
        this.b.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
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
        if (t == m.COLOR) {
            this.h.a((ako<Integer>) akoVar);
        } else if (t == m.OPACITY) {
            this.i.a((ako<Integer>) akoVar);
        } else if (t == m.COLOR_FILTER) {
            ahg<ColorFilter, ColorFilter> ahgVar = this.j;
            if (ahgVar != null) {
                this.d.b(ahgVar);
            }
            if (akoVar == null) {
                this.j = null;
                return;
            }
            this.j = new ahw(akoVar);
            this.j.a(this);
            this.d.a(this.j);
        } else if (t == m.BLUR_RADIUS) {
            ahg<Float, Float> ahgVar2 = this.l;
            if (ahgVar2 != null) {
                ahgVar2.a((ako<Float>) akoVar);
                return;
            }
            this.l = new ahw(akoVar);
            this.l.a(this);
            this.d.a(this.l);
        } else if (t == m.DROP_SHADOW_COLOR && (ahiVar5 = this.m) != null) {
            ahiVar5.a((ako<Integer>) akoVar);
        } else if (t == m.DROP_SHADOW_OPACITY && (ahiVar4 = this.m) != null) {
            ahiVar4.b(akoVar);
        } else if (t == m.DROP_SHADOW_DIRECTION && (ahiVar3 = this.m) != null) {
            ahiVar3.c(akoVar);
        } else if (t == m.DROP_SHADOW_DISTANCE && (ahiVar2 = this.m) != null) {
            ahiVar2.d(akoVar);
        } else if (t != m.DROP_SHADOW_RADIUS || (ahiVar = this.m) == null) {
        } else {
            ahiVar.e(akoVar);
        }
    }

    @Override // tb.agn
    public void a(List<agn> list, List<agn> list2) {
        for (int i = 0; i < list2.size(); i++) {
            agn agnVar = list2.get(i);
            if (agnVar instanceof agx) {
                this.g.add((agx) agnVar);
            }
        }
    }

    @Override // tb.ahg.a
    public void onValueChanged() {
        this.k.invalidateSelf();
    }
}
