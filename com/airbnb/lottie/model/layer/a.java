package com.airbnb.lottie.model.layer;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.content.Mask;
import com.airbnb.lottie.model.content.j;
import com.airbnb.lottie.model.layer.Layer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import tb.agk;
import tb.agn;
import tb.agp;
import tb.ahg;
import tb.ahj;
import tb.ahn;
import tb.ahv;
import tb.aiz;
import tb.akh;
import tb.akl;
import tb.ako;

/* loaded from: classes2.dex */
public abstract class a implements com.airbnb.lottie.model.e, agp, ahg.a {
    private boolean B;
    private Paint C;
    final LottieDrawable b;
    final Layer c;
    final ahv d;
    BlurMaskFilter f;
    private final String t;
    private ahn u;
    private ahj v;
    private a w;
    private a x;
    private List<a> y;
    private final Path g = new Path();
    private final Matrix h = new Matrix();
    private final Matrix i = new Matrix();
    private final Paint j = new agk(1);
    private final Paint k = new agk(1, PorterDuff.Mode.DST_IN);
    private final Paint l = new agk(1, PorterDuff.Mode.DST_OUT);
    private final Paint m = new agk(1);
    private final Paint n = new agk(PorterDuff.Mode.CLEAR);
    private final RectF o = new RectF();
    private final RectF p = new RectF();
    private final RectF q = new RectF();
    private final RectF r = new RectF();
    private final RectF s = new RectF();

    /* renamed from: a */
    final Matrix f1775a = new Matrix();
    private final List<ahg<?, ?>> z = new ArrayList();
    private boolean A = true;
    float e = 0.0f;

    /* renamed from: com.airbnb.lottie.model.layer.a$1 */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] b = new int[Mask.MaskMode.values().length];

        static {
            try {
                b[Mask.MaskMode.MASK_MODE_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[Mask.MaskMode.MASK_MODE_SUBTRACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[Mask.MaskMode.MASK_MODE_INTERSECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[Mask.MaskMode.MASK_MODE_ADD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f1776a = new int[Layer.LayerType.values().length];
            try {
                f1776a[Layer.LayerType.SHAPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1776a[Layer.LayerType.PRE_COMP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1776a[Layer.LayerType.SOLID.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1776a[Layer.LayerType.IMAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f1776a[Layer.LayerType.NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f1776a[Layer.LayerType.TEXT.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f1776a[Layer.LayerType.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public a(LottieDrawable lottieDrawable, Layer layer) {
        Paint paint;
        PorterDuffXfermode porterDuffXfermode;
        this.b = lottieDrawable;
        this.c = layer;
        this.t = layer.f() + "#draw";
        if (layer.l() == Layer.MatteType.INVERT) {
            paint = this.m;
            porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);
        } else {
            paint = this.m;
            porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
        }
        paint.setXfermode(porterDuffXfermode);
        this.d = layer.o().j();
        this.d.a((ahg.a) this);
        if (layer.j() != null && !layer.j().isEmpty()) {
            this.u = new ahn(layer.j());
            for (ahg<j, Path> ahgVar : this.u.b()) {
                ahgVar.a(this);
            }
            for (ahg<Integer, Integer> ahgVar2 : this.u.c()) {
                a(ahgVar2);
                ahgVar2.a(this);
            }
        }
        g();
    }

    public static a a(b bVar, Layer layer, LottieDrawable lottieDrawable, com.airbnb.lottie.g gVar) {
        switch (layer.k()) {
            case SHAPE:
                return new e(lottieDrawable, layer, bVar);
            case PRE_COMP:
                return new b(lottieDrawable, layer, gVar.b(layer.g()), gVar);
            case SOLID:
                return new f(lottieDrawable, layer);
            case IMAGE:
                return new c(lottieDrawable, layer);
            case NULL:
                return new d(lottieDrawable, layer);
            case TEXT:
                return new g(lottieDrawable, layer);
            default:
                akh.c("Unknown layer type " + layer.k());
                return null;
        }
    }

    private void a(Canvas canvas) {
        com.airbnb.lottie.f.a("Layer#clearLayer");
        canvas.drawRect(this.o.left - 1.0f, this.o.top - 1.0f, this.o.right + 1.0f, this.o.bottom + 1.0f, this.n);
        com.airbnb.lottie.f.b("Layer#clearLayer");
    }

    private void a(Canvas canvas, Matrix matrix) {
        com.airbnb.lottie.f.a("Layer#saveLayer");
        akl.a(canvas, this.o, this.k, 19);
        if (Build.VERSION.SDK_INT < 28) {
            a(canvas);
        }
        com.airbnb.lottie.f.b("Layer#saveLayer");
        for (int i = 0; i < this.u.a().size(); i++) {
            Mask mask = this.u.a().get(i);
            ahg<j, Path> ahgVar = this.u.b().get(i);
            ahg<Integer, Integer> ahgVar2 = this.u.c().get(i);
            int i2 = AnonymousClass1.b[mask.a().ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    if (i == 0) {
                        this.j.setColor(-16777216);
                        this.j.setAlpha(255);
                        canvas.drawRect(this.o, this.j);
                    }
                    if (mask.d()) {
                        c(canvas, matrix, ahgVar, ahgVar2);
                    } else {
                        a(canvas, matrix, ahgVar);
                    }
                } else if (i2 != 3) {
                    if (i2 == 4) {
                        if (mask.d()) {
                            b(canvas, matrix, ahgVar, ahgVar2);
                        } else {
                            a(canvas, matrix, ahgVar, ahgVar2);
                        }
                    }
                } else if (mask.d()) {
                    e(canvas, matrix, ahgVar, ahgVar2);
                } else {
                    d(canvas, matrix, ahgVar, ahgVar2);
                }
            } else if (i()) {
                this.j.setAlpha(255);
                canvas.drawRect(this.o, this.j);
            }
        }
        com.airbnb.lottie.f.a("Layer#restoreLayer");
        canvas.restore();
        com.airbnb.lottie.f.b("Layer#restoreLayer");
    }

    private void a(Canvas canvas, Matrix matrix, ahg<j, Path> ahgVar) {
        this.g.set(ahgVar.g());
        this.g.transform(matrix);
        canvas.drawPath(this.g, this.l);
    }

    private void a(Canvas canvas, Matrix matrix, ahg<j, Path> ahgVar, ahg<Integer, Integer> ahgVar2) {
        this.g.set(ahgVar.g());
        this.g.transform(matrix);
        this.j.setAlpha((int) (ahgVar2.g().intValue() * 2.55f));
        canvas.drawPath(this.g, this.j);
    }

    private void a(RectF rectF, Matrix matrix) {
        this.q.set(0.0f, 0.0f, 0.0f, 0.0f);
        if (!d()) {
            return;
        }
        int size = this.u.a().size();
        for (int i = 0; i < size; i++) {
            Mask mask = this.u.a().get(i);
            Path g = this.u.b().get(i).g();
            if (g != null) {
                this.g.set(g);
                this.g.transform(matrix);
                int i2 = AnonymousClass1.b[mask.a().ordinal()];
                if (i2 == 1 || i2 == 2) {
                    return;
                }
                if ((i2 == 3 || i2 == 4) && mask.d()) {
                    return;
                }
                this.g.computeBounds(this.s, false);
                if (i == 0) {
                    this.q.set(this.s);
                } else {
                    RectF rectF2 = this.q;
                    rectF2.set(Math.min(rectF2.left, this.s.left), Math.min(this.q.top, this.s.top), Math.max(this.q.right, this.s.right), Math.max(this.q.bottom, this.s.bottom));
                }
            }
        }
        if (rectF.intersect(this.q)) {
            return;
        }
        rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
    }

    private void b(Canvas canvas, Matrix matrix, ahg<j, Path> ahgVar, ahg<Integer, Integer> ahgVar2) {
        akl.a(canvas, this.o, this.j);
        canvas.drawRect(this.o, this.j);
        this.g.set(ahgVar.g());
        this.g.transform(matrix);
        this.j.setAlpha((int) (ahgVar2.g().intValue() * 2.55f));
        canvas.drawPath(this.g, this.l);
        canvas.restore();
    }

    private void b(RectF rectF, Matrix matrix) {
        if (c() && this.c.l() != Layer.MatteType.INVERT) {
            this.r.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.w.a(this.r, matrix, true);
            if (rectF.intersect(this.r)) {
                return;
            }
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    private void b(boolean z) {
        if (z != this.A) {
            this.A = z;
            h();
        }
    }

    private void c(float f) {
        this.b.B().c().a(this.c.f(), f);
    }

    private void c(Canvas canvas, Matrix matrix, ahg<j, Path> ahgVar, ahg<Integer, Integer> ahgVar2) {
        akl.a(canvas, this.o, this.l);
        canvas.drawRect(this.o, this.j);
        this.l.setAlpha((int) (ahgVar2.g().intValue() * 2.55f));
        this.g.set(ahgVar.g());
        this.g.transform(matrix);
        canvas.drawPath(this.g, this.l);
        canvas.restore();
    }

    private void d(Canvas canvas, Matrix matrix, ahg<j, Path> ahgVar, ahg<Integer, Integer> ahgVar2) {
        akl.a(canvas, this.o, this.k);
        this.g.set(ahgVar.g());
        this.g.transform(matrix);
        this.j.setAlpha((int) (ahgVar2.g().intValue() * 2.55f));
        canvas.drawPath(this.g, this.j);
        canvas.restore();
    }

    private void e(Canvas canvas, Matrix matrix, ahg<j, Path> ahgVar, ahg<Integer, Integer> ahgVar2) {
        akl.a(canvas, this.o, this.k);
        canvas.drawRect(this.o, this.j);
        this.l.setAlpha((int) (ahgVar2.g().intValue() * 2.55f));
        this.g.set(ahgVar.g());
        this.g.transform(matrix);
        canvas.drawPath(this.g, this.l);
        canvas.restore();
    }

    private void g() {
        boolean z = true;
        if (this.c.d().isEmpty()) {
            b(true);
            return;
        }
        this.v = new ahj(this.c.d());
        this.v.a();
        this.v.a(new ahg.a() { // from class: com.airbnb.lottie.model.layer.-$$Lambda$a$8fByk9lEp3eJm2H99kxFbyAieQY
            @Override // tb.ahg.a
            public final void onValueChanged() {
                a.lambda$8fByk9lEp3eJm2H99kxFbyAieQY(a.this);
            }
        });
        if (this.v.g().floatValue() != 1.0f) {
            z = false;
        }
        b(z);
        a(this.v);
    }

    private void h() {
        this.b.invalidateSelf();
    }

    private boolean i() {
        if (this.u.b().isEmpty()) {
            return false;
        }
        for (int i = 0; i < this.u.a().size(); i++) {
            if (this.u.a().get(i).a() != Mask.MaskMode.MASK_MODE_NONE) {
                return false;
            }
        }
        return true;
    }

    private void j() {
        if (this.y != null) {
            return;
        }
        if (this.x == null) {
            this.y = Collections.emptyList();
            return;
        }
        this.y = new ArrayList();
        for (a aVar = this.x; aVar != null; aVar = aVar.x) {
            this.y.add(aVar);
        }
    }

    public /* synthetic */ void k() {
        b(this.v.i() == 1.0f);
    }

    public static /* synthetic */ void lambda$8fByk9lEp3eJm2H99kxFbyAieQY(a aVar) {
        aVar.k();
    }

    @Override // tb.agn
    public String a() {
        return this.c.f();
    }

    public void a(float f) {
        this.d.a(f);
        if (this.u != null) {
            for (int i = 0; i < this.u.b().size(); i++) {
                this.u.b().get(i).a(f);
            }
        }
        ahj ahjVar = this.v;
        if (ahjVar != null) {
            ahjVar.a(f);
        }
        a aVar = this.w;
        if (aVar != null) {
            aVar.a(f);
        }
        for (int i2 = 0; i2 < this.z.size(); i2++) {
            this.z.get(i2).a(f);
        }
    }

    @Override // tb.agp
    public void a(Canvas canvas, Matrix matrix, int i) {
        Paint paint;
        com.airbnb.lottie.f.a(this.t);
        if (!this.A || this.c.v()) {
            com.airbnb.lottie.f.b(this.t);
            return;
        }
        j();
        com.airbnb.lottie.f.a("Layer#parentMatrix");
        this.h.reset();
        this.h.set(matrix);
        for (int size = this.y.size() - 1; size >= 0; size--) {
            this.h.preConcat(this.y.get(size).d.d());
        }
        com.airbnb.lottie.f.b("Layer#parentMatrix");
        int intValue = (int) ((((i / 255.0f) * (this.d.a() == null ? 100 : this.d.a().g().intValue())) / 100.0f) * 255.0f);
        if (!c() && !d()) {
            this.h.preConcat(this.d.d());
            com.airbnb.lottie.f.a("Layer#drawLayer");
            b(canvas, this.h, intValue);
            com.airbnb.lottie.f.b("Layer#drawLayer");
            c(com.airbnb.lottie.f.b(this.t));
            return;
        }
        com.airbnb.lottie.f.a("Layer#computeBounds");
        a(this.o, this.h, false);
        b(this.o, matrix);
        this.h.preConcat(this.d.d());
        a(this.o, this.h);
        this.p.set(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
        canvas.getMatrix(this.i);
        if (!this.i.isIdentity()) {
            Matrix matrix2 = this.i;
            matrix2.invert(matrix2);
            this.i.mapRect(this.p);
        }
        if (!this.o.intersect(this.p)) {
            this.o.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
        com.airbnb.lottie.f.b("Layer#computeBounds");
        if (this.o.width() >= 1.0f && this.o.height() >= 1.0f) {
            com.airbnb.lottie.f.a("Layer#saveLayer");
            this.j.setAlpha(255);
            akl.a(canvas, this.o, this.j);
            com.airbnb.lottie.f.b("Layer#saveLayer");
            a(canvas);
            com.airbnb.lottie.f.a("Layer#drawLayer");
            b(canvas, this.h, intValue);
            com.airbnb.lottie.f.b("Layer#drawLayer");
            if (d()) {
                a(canvas, this.h);
            }
            if (c()) {
                com.airbnb.lottie.f.a("Layer#drawMatte");
                com.airbnb.lottie.f.a("Layer#saveLayer");
                akl.a(canvas, this.o, this.m, 19);
                com.airbnb.lottie.f.b("Layer#saveLayer");
                a(canvas);
                this.w.a(canvas, matrix, intValue);
                com.airbnb.lottie.f.a("Layer#restoreLayer");
                canvas.restore();
                com.airbnb.lottie.f.b("Layer#restoreLayer");
                com.airbnb.lottie.f.b("Layer#drawMatte");
            }
            com.airbnb.lottie.f.a("Layer#restoreLayer");
            canvas.restore();
            com.airbnb.lottie.f.b("Layer#restoreLayer");
        }
        if (this.B && (paint = this.C) != null) {
            paint.setStyle(Paint.Style.STROKE);
            this.C.setColor(-251901);
            this.C.setStrokeWidth(4.0f);
            canvas.drawRect(this.o, this.C);
            this.C.setStyle(Paint.Style.FILL);
            this.C.setColor(1357638635);
            canvas.drawRect(this.o, this.C);
        }
        c(com.airbnb.lottie.f.b(this.t));
    }

    @Override // tb.agp
    public void a(RectF rectF, Matrix matrix, boolean z) {
        this.o.set(0.0f, 0.0f, 0.0f, 0.0f);
        j();
        this.f1775a.set(matrix);
        if (z) {
            List<a> list = this.y;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f1775a.preConcat(this.y.get(size).d.d());
                }
            } else {
                a aVar = this.x;
                if (aVar != null) {
                    this.f1775a.preConcat(aVar.d.d());
                }
            }
        }
        this.f1775a.preConcat(this.d.d());
    }

    @Override // com.airbnb.lottie.model.e
    public void a(com.airbnb.lottie.model.d dVar, int i, List<com.airbnb.lottie.model.d> list, com.airbnb.lottie.model.d dVar2) {
        a aVar = this.w;
        if (aVar != null) {
            com.airbnb.lottie.model.d a2 = dVar2.a(aVar.a());
            if (dVar.c(this.w.a(), i)) {
                list.add(a2.a(this.w));
            }
            if (dVar.d(a(), i)) {
                this.w.b(dVar, dVar.b(this.w.a(), i) + i, list, a2);
            }
        }
        if (!dVar.a(a(), i)) {
            return;
        }
        if (!"__container".equals(a())) {
            dVar2 = dVar2.a(a());
            if (dVar.c(a(), i)) {
                list.add(dVar2.a(this));
            }
        }
        if (!dVar.d(a(), i)) {
            return;
        }
        b(dVar, i + dVar.b(a(), i), list, dVar2);
    }

    public void a(a aVar) {
        this.w = aVar;
    }

    @Override // com.airbnb.lottie.model.e
    public <T> void a(T t, ako<T> akoVar) {
        this.d.a(t, akoVar);
    }

    @Override // tb.agn
    public void a(List<agn> list, List<agn> list2) {
    }

    public void a(ahg<?, ?> ahgVar) {
        if (ahgVar == null) {
            return;
        }
        this.z.add(ahgVar);
    }

    public void a(boolean z) {
        if (z && this.C == null) {
            this.C = new agk();
        }
        this.B = z;
    }

    public BlurMaskFilter b(float f) {
        if (this.e == f) {
            return this.f;
        }
        this.f = new BlurMaskFilter(f / 2.0f, BlurMaskFilter.Blur.NORMAL);
        this.e = f;
        return this.f;
    }

    public Layer b() {
        return this.c;
    }

    abstract void b(Canvas canvas, Matrix matrix, int i);

    void b(com.airbnb.lottie.model.d dVar, int i, List<com.airbnb.lottie.model.d> list, com.airbnb.lottie.model.d dVar2) {
    }

    public void b(a aVar) {
        this.x = aVar;
    }

    public void b(ahg<?, ?> ahgVar) {
        this.z.remove(ahgVar);
    }

    public boolean c() {
        return this.w != null;
    }

    public boolean d() {
        ahn ahnVar = this.u;
        return ahnVar != null && !ahnVar.b().isEmpty();
    }

    public com.airbnb.lottie.model.content.a e() {
        return this.c.w();
    }

    public aiz f() {
        return this.c.x();
    }

    @Override // tb.ahg.a
    public void onValueChanged() {
        h();
    }
}
