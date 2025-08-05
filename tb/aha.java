package tb;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.m;
import com.airbnb.lottie.model.content.h;
import com.airbnb.lottie.model.d;
import com.airbnb.lottie.model.layer.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import tb.ahg;

/* loaded from: classes2.dex */
public class aha implements agp, agu, agv, agx, ahg.a {

    /* renamed from: a  reason: collision with root package name */
    private final Matrix f25334a = new Matrix();
    private final Path b = new Path();
    private final LottieDrawable c;
    private final a d;
    private final String e;
    private final boolean f;
    private final ahg<Float, Float> g;
    private final ahg<Float, Float> h;
    private final ahv i;
    private ago j;

    public aha(LottieDrawable lottieDrawable, a aVar, h hVar) {
        this.c = lottieDrawable;
        this.d = aVar;
        this.e = hVar.a();
        this.f = hVar.e();
        this.g = hVar.b().a();
        aVar.a(this.g);
        this.g.a(this);
        this.h = hVar.c().a();
        aVar.a(this.h);
        this.h.a(this);
        this.i = hVar.d().j();
        this.i.a(aVar);
        this.i.a(this);
    }

    @Override // tb.agn
    public String a() {
        return this.e;
    }

    @Override // tb.agp
    public void a(Canvas canvas, Matrix matrix, int i) {
        float floatValue = this.g.g().floatValue();
        float floatValue2 = this.h.g().floatValue();
        float floatValue3 = this.i.b().g().floatValue() / 100.0f;
        float floatValue4 = this.i.c().g().floatValue() / 100.0f;
        for (int i2 = ((int) floatValue) - 1; i2 >= 0; i2--) {
            this.f25334a.set(matrix);
            float f = i2;
            this.f25334a.preConcat(this.i.b(f + floatValue2));
            this.j.a(canvas, this.f25334a, (int) (i * akk.a(floatValue3, floatValue4, f / floatValue)));
        }
    }

    @Override // tb.agp
    public void a(RectF rectF, Matrix matrix, boolean z) {
        this.j.a(rectF, matrix, z);
    }

    @Override // com.airbnb.lottie.model.e
    public void a(d dVar, int i, List<d> list, d dVar2) {
        akk.a(dVar, i, list, dVar2, this);
    }

    @Override // com.airbnb.lottie.model.e
    public <T> void a(T t, ako<T> akoVar) {
        if (this.i.a(t, akoVar)) {
            return;
        }
        if (t == m.REPEATER_COPIES) {
            this.g.a((ako<Float>) akoVar);
        } else if (t != m.REPEATER_OFFSET) {
        } else {
            this.h.a((ako<Float>) akoVar);
        }
    }

    @Override // tb.agn
    public void a(List<agn> list, List<agn> list2) {
        this.j.a(list, list2);
    }

    @Override // tb.agu
    public void a(ListIterator<agn> listIterator) {
        if (this.j != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add(listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.j = new ago(this.c, this.d, "Repeater", this.f, arrayList, null);
    }

    @Override // tb.agx
    public Path d() {
        Path d = this.j.d();
        this.b.reset();
        float floatValue = this.g.g().floatValue();
        float floatValue2 = this.h.g().floatValue();
        for (int i = ((int) floatValue) - 1; i >= 0; i--) {
            this.f25334a.set(this.i.b(i + floatValue2));
            this.b.addPath(d, this.f25334a);
        }
        return this.b;
    }

    @Override // tb.ahg.a
    public void onValueChanged() {
        this.c.invalidateSelf();
    }
}
