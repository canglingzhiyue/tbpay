package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.v4.util.LongSparseArray;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.m;
import com.airbnb.lottie.model.layer.Layer;
import java.util.ArrayList;
import java.util.List;
import tb.ahg;
import tb.ahw;
import tb.aia;
import tb.akl;
import tb.ako;

/* loaded from: classes2.dex */
public class b extends a {
    private ahg<Float, Float> g;
    private final List<a> h;
    private final RectF i;
    private final RectF j;
    private final Paint k;
    private Boolean l;
    private Boolean m;
    private boolean n;

    /* renamed from: com.airbnb.lottie.model.layer.b$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f1777a = new int[Layer.MatteType.values().length];

        static {
            try {
                f1777a[Layer.MatteType.ADD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1777a[Layer.MatteType.INVERT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public b(LottieDrawable lottieDrawable, Layer layer, List<Layer> list, com.airbnb.lottie.g gVar) {
        super(lottieDrawable, layer);
        int i;
        a aVar;
        this.h = new ArrayList();
        this.i = new RectF();
        this.j = new RectF();
        this.k = new Paint();
        this.n = true;
        aia u = layer.u();
        if (u != null) {
            this.g = u.a();
            a(this.g);
            this.g.a(this);
        } else {
            this.g = null;
        }
        LongSparseArray longSparseArray = new LongSparseArray(gVar.i().size());
        int size = list.size() - 1;
        a aVar2 = null;
        while (true) {
            if (size < 0) {
                break;
            }
            Layer layer2 = list.get(size);
            a a2 = a.a(this, layer2, lottieDrawable, gVar);
            if (a2 != null) {
                longSparseArray.put(a2.b().e(), a2);
                if (aVar2 != null) {
                    aVar2.a(a2);
                    aVar2 = null;
                } else {
                    this.h.add(0, a2);
                    int i2 = AnonymousClass1.f1777a[layer2.l().ordinal()];
                    if (i2 == 1 || i2 == 2) {
                        aVar2 = a2;
                    }
                }
            }
            size--;
        }
        for (i = 0; i < longSparseArray.size(); i++) {
            a aVar3 = (a) longSparseArray.get(longSparseArray.keyAt(i));
            if (aVar3 != null && (aVar = (a) longSparseArray.get(aVar3.b().m())) != null) {
                aVar3.b(aVar);
            }
        }
    }

    @Override // com.airbnb.lottie.model.layer.a
    public void a(float f) {
        super.a(f);
        if (this.g != null) {
            f = ((this.g.g().floatValue() * this.c.a().h()) - this.c.a().f()) / (this.b.B().m() + 0.01f);
        }
        if (this.g == null) {
            f -= this.c.c();
        }
        if (this.c.b() != 0.0f && !"__container".equals(this.c.f())) {
            f /= this.c.b();
        }
        for (int size = this.h.size() - 1; size >= 0; size--) {
            this.h.get(size).a(f);
        }
    }

    @Override // com.airbnb.lottie.model.layer.a, tb.agp
    public void a(RectF rectF, Matrix matrix, boolean z) {
        super.a(rectF, matrix, z);
        for (int size = this.h.size() - 1; size >= 0; size--) {
            this.i.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.h.get(size).a(this.i, this.f1775a, true);
            rectF.union(this.i);
        }
    }

    @Override // com.airbnb.lottie.model.layer.a, com.airbnb.lottie.model.e
    public <T> void a(T t, ako<T> akoVar) {
        super.a((b) t, (ako<b>) akoVar);
        if (t == m.TIME_REMAP) {
            if (akoVar != null) {
                this.g = new ahw(akoVar);
                this.g.a(this);
                a(this.g);
                return;
            }
            ahg<Float, Float> ahgVar = this.g;
            if (ahgVar == null) {
                return;
            }
            ahgVar.a((ako<Float>) null);
        }
    }

    @Override // com.airbnb.lottie.model.layer.a
    public void a(boolean z) {
        super.a(z);
        for (a aVar : this.h) {
            aVar.a(z);
        }
    }

    @Override // com.airbnb.lottie.model.layer.a
    void b(Canvas canvas, Matrix matrix, int i) {
        com.airbnb.lottie.f.a("CompositionLayer#draw");
        this.j.set(0.0f, 0.0f, this.c.h(), this.c.i());
        matrix.mapRect(this.j);
        boolean z = this.b.j() && this.h.size() > 1 && i != 255;
        if (z) {
            this.k.setAlpha(i);
            akl.a(canvas, this.j, this.k);
        } else {
            canvas.save();
        }
        if (z) {
            i = 255;
        }
        for (int size = this.h.size() - 1; size >= 0; size--) {
            if (((!this.n && "__container".equals(this.c.f())) || this.j.isEmpty()) ? true : canvas.clipRect(this.j)) {
                this.h.get(size).a(canvas, matrix, i);
            }
        }
        canvas.restore();
        com.airbnb.lottie.f.b("CompositionLayer#draw");
    }

    @Override // com.airbnb.lottie.model.layer.a
    protected void b(com.airbnb.lottie.model.d dVar, int i, List<com.airbnb.lottie.model.d> list, com.airbnb.lottie.model.d dVar2) {
        for (int i2 = 0; i2 < this.h.size(); i2++) {
            this.h.get(i2).a(dVar, i, list, dVar2);
        }
    }

    public void b(boolean z) {
        this.n = z;
    }

    public boolean g() {
        if (this.m == null) {
            for (int size = this.h.size() - 1; size >= 0; size--) {
                a aVar = this.h.get(size);
                if (!(aVar instanceof e)) {
                    if ((aVar instanceof b) && ((b) aVar).g()) {
                        this.m = true;
                        return true;
                    }
                } else if (aVar.d()) {
                    this.m = true;
                    return true;
                }
            }
            this.m = false;
        }
        return this.m.booleanValue();
    }

    public boolean h() {
        if (this.l == null) {
            if (!c()) {
                for (int size = this.h.size() - 1; size >= 0; size--) {
                    if (!this.h.get(size).c()) {
                    }
                }
                this.l = false;
            }
            this.l = true;
            return true;
        }
        return this.l.booleanValue();
    }
}
