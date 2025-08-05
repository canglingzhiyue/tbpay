package tb;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.content.c;
import com.airbnb.lottie.model.content.l;
import com.airbnb.lottie.model.d;
import com.airbnb.lottie.model.e;
import com.airbnb.lottie.model.layer.a;
import java.util.ArrayList;
import java.util.List;
import tb.ahg;

/* loaded from: classes2.dex */
public class ago implements e, agp, agx, ahg.a {

    /* renamed from: a  reason: collision with root package name */
    private final Paint f25325a;
    private final RectF b;
    private final Matrix c;
    private final Path d;
    private final RectF e;
    private final String f;
    private final boolean g;
    private final List<agn> h;
    private final LottieDrawable i;
    private List<agx> j;
    private ahv k;

    public ago(LottieDrawable lottieDrawable, a aVar, l lVar) {
        this(lottieDrawable, aVar, lVar.a(), lVar.c(), a(lottieDrawable, aVar, lVar.b()), a(lVar.b()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ago(LottieDrawable lottieDrawable, a aVar, String str, boolean z, List<agn> list, aik aikVar) {
        this.f25325a = new agk();
        this.b = new RectF();
        this.c = new Matrix();
        this.d = new Path();
        this.e = new RectF();
        this.f = str;
        this.i = lottieDrawable;
        this.g = z;
        this.h = list;
        if (aikVar != null) {
            this.k = aikVar.j();
            this.k.a(aVar);
            this.k.a(this);
        }
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            agn agnVar = list.get(size);
            if (agnVar instanceof agu) {
                arrayList.add((agu) agnVar);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ((agu) arrayList.get(size2)).a(list.listIterator(list.size()));
        }
    }

    private static List<agn> a(LottieDrawable lottieDrawable, a aVar, List<c> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            agn a2 = list.get(i).a(lottieDrawable, aVar);
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        return arrayList;
    }

    static aik a(List<c> list) {
        for (int i = 0; i < list.size(); i++) {
            c cVar = list.get(i);
            if (cVar instanceof aik) {
                return (aik) cVar;
            }
        }
        return null;
    }

    private boolean e() {
        int i = 0;
        for (int i2 = 0; i2 < this.h.size(); i2++) {
            if ((this.h.get(i2) instanceof agp) && (i = i + 1) >= 2) {
                return true;
            }
        }
        return false;
    }

    @Override // tb.agn
    public String a() {
        return this.f;
    }

    @Override // tb.agp
    public void a(Canvas canvas, Matrix matrix, int i) {
        if (this.g) {
            return;
        }
        this.c.set(matrix);
        ahv ahvVar = this.k;
        if (ahvVar != null) {
            this.c.preConcat(ahvVar.d());
            i = (int) (((((this.k.a() == null ? 100 : this.k.a().g().intValue()) / 100.0f) * i) / 255.0f) * 255.0f);
        }
        boolean z = this.i.j() && e() && i != 255;
        if (z) {
            this.b.set(0.0f, 0.0f, 0.0f, 0.0f);
            a(this.b, this.c, true);
            this.f25325a.setAlpha(i);
            akl.a(canvas, this.b, this.f25325a);
        }
        if (z) {
            i = 255;
        }
        for (int size = this.h.size() - 1; size >= 0; size--) {
            agn agnVar = this.h.get(size);
            if (agnVar instanceof agp) {
                ((agp) agnVar).a(canvas, this.c, i);
            }
        }
        if (!z) {
            return;
        }
        canvas.restore();
    }

    @Override // tb.agp
    public void a(RectF rectF, Matrix matrix, boolean z) {
        this.c.set(matrix);
        ahv ahvVar = this.k;
        if (ahvVar != null) {
            this.c.preConcat(ahvVar.d());
        }
        this.e.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.h.size() - 1; size >= 0; size--) {
            agn agnVar = this.h.get(size);
            if (agnVar instanceof agp) {
                ((agp) agnVar).a(this.e, this.c, z);
                rectF.union(this.e);
            }
        }
    }

    @Override // com.airbnb.lottie.model.e
    public void a(d dVar, int i, List<d> list, d dVar2) {
        if (dVar.a(a(), i) || "__container".equals(a())) {
            if (!"__container".equals(a())) {
                dVar2 = dVar2.a(a());
                if (dVar.c(a(), i)) {
                    list.add(dVar2.a(this));
                }
            }
            if (!dVar.d(a(), i)) {
                return;
            }
            int b = i + dVar.b(a(), i);
            for (int i2 = 0; i2 < this.h.size(); i2++) {
                agn agnVar = this.h.get(i2);
                if (agnVar instanceof e) {
                    ((e) agnVar).a(dVar, b, list, dVar2);
                }
            }
        }
    }

    @Override // com.airbnb.lottie.model.e
    public <T> void a(T t, ako<T> akoVar) {
        ahv ahvVar = this.k;
        if (ahvVar != null) {
            ahvVar.a(t, akoVar);
        }
    }

    @Override // tb.agn
    public void a(List<agn> list, List<agn> list2) {
        ArrayList arrayList = new ArrayList(list.size() + this.h.size());
        arrayList.addAll(list);
        for (int size = this.h.size() - 1; size >= 0; size--) {
            agn agnVar = this.h.get(size);
            agnVar.a(arrayList, this.h.subList(0, size));
            arrayList.add(agnVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<agx> b() {
        if (this.j == null) {
            this.j = new ArrayList();
            for (int i = 0; i < this.h.size(); i++) {
                agn agnVar = this.h.get(i);
                if (agnVar instanceof agx) {
                    this.j.add((agx) agnVar);
                }
            }
        }
        return this.j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Matrix c() {
        ahv ahvVar = this.k;
        if (ahvVar != null) {
            return ahvVar.d();
        }
        this.c.reset();
        return this.c;
    }

    @Override // tb.agx
    public Path d() {
        this.c.reset();
        ahv ahvVar = this.k;
        if (ahvVar != null) {
            this.c.set(ahvVar.d());
        }
        this.d.reset();
        if (this.g) {
            return this.d;
        }
        for (int size = this.h.size() - 1; size >= 0; size--) {
            agn agnVar = this.h.get(size);
            if (agnVar instanceof agx) {
                this.d.addPath(((agx) agnVar).d(), this.c);
            }
        }
        return this.d;
    }

    @Override // tb.ahg.a
    public void onValueChanged() {
        this.i.invalidateSelf();
    }
}
