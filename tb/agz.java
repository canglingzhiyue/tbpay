package tb;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.m;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.model.content.g;
import com.airbnb.lottie.model.d;
import com.airbnb.lottie.model.layer.a;
import java.util.List;
import tb.ahg;

/* loaded from: classes2.dex */
public class agz implements agv, agx, ahg.a {
    private final String c;
    private final boolean d;
    private final LottieDrawable e;
    private final ahg<?, PointF> f;
    private final ahg<?, PointF> g;
    private final ahg<?, Float> h;
    private boolean k;

    /* renamed from: a  reason: collision with root package name */
    private final Path f25333a = new Path();
    private final RectF b = new RectF();
    private final agm i = new agm();
    private ahg<Float, Float> j = null;

    public agz(LottieDrawable lottieDrawable, a aVar, g gVar) {
        this.c = gVar.a();
        this.d = gVar.e();
        this.e = lottieDrawable;
        this.f = gVar.d().a();
        this.g = gVar.c().a();
        this.h = gVar.b().a();
        aVar.a(this.f);
        aVar.a(this.g);
        aVar.a(this.h);
        this.f.a(this);
        this.g.a(this);
        this.h.a(this);
    }

    private void b() {
        this.k = false;
        this.e.invalidateSelf();
    }

    @Override // tb.agn
    public String a() {
        return this.c;
    }

    @Override // com.airbnb.lottie.model.e
    public void a(d dVar, int i, List<d> list, d dVar2) {
        akk.a(dVar, i, list, dVar2, this);
    }

    @Override // com.airbnb.lottie.model.e
    public <T> void a(T t, ako<T> akoVar) {
        ahg<?, PointF> ahgVar;
        if (t == m.RECTANGLE_SIZE) {
            ahgVar = this.g;
        } else if (t != m.POSITION) {
            if (t != m.CORNER_RADIUS) {
                return;
            }
            this.h.a((ako<Float>) akoVar);
            return;
        } else {
            ahgVar = this.f;
        }
        ahgVar.a((ako<PointF>) akoVar);
    }

    @Override // tb.agn
    public void a(List<agn> list, List<agn> list2) {
        for (int i = 0; i < list.size(); i++) {
            agn agnVar = list.get(i);
            if (agnVar instanceof ahf) {
                ahf ahfVar = (ahf) agnVar;
                if (ahfVar.b() == ShapeTrimPath.Type.SIMULTANEOUSLY) {
                    this.i.a(ahfVar);
                    ahfVar.a(this);
                }
            }
            if (agnVar instanceof ahb) {
                this.j = ((ahb) agnVar).b();
            }
        }
    }

    @Override // tb.agx
    public Path d() {
        ahg<Float, Float> ahgVar;
        if (this.k) {
            return this.f25333a;
        }
        this.f25333a.reset();
        if (!this.d) {
            PointF g = this.g.g();
            float f = g.x / 2.0f;
            float f2 = g.y / 2.0f;
            ahg<?, Float> ahgVar2 = this.h;
            float i = ahgVar2 == null ? 0.0f : ((ahj) ahgVar2).i();
            if (i == 0.0f && (ahgVar = this.j) != null) {
                i = Math.min(ahgVar.g().floatValue(), Math.min(f, f2));
            }
            float min = Math.min(f, f2);
            if (i > min) {
                i = min;
            }
            PointF g2 = this.f.g();
            this.f25333a.moveTo(g2.x + f, (g2.y - f2) + i);
            this.f25333a.lineTo(g2.x + f, (g2.y + f2) - i);
            int i2 = (i > 0.0f ? 1 : (i == 0.0f ? 0 : -1));
            if (i2 > 0) {
                float f3 = i * 2.0f;
                this.b.set((g2.x + f) - f3, (g2.y + f2) - f3, g2.x + f, g2.y + f2);
                this.f25333a.arcTo(this.b, 0.0f, 90.0f, false);
            }
            this.f25333a.lineTo((g2.x - f) + i, g2.y + f2);
            if (i2 > 0) {
                float f4 = i * 2.0f;
                this.b.set(g2.x - f, (g2.y + f2) - f4, (g2.x - f) + f4, g2.y + f2);
                this.f25333a.arcTo(this.b, 90.0f, 90.0f, false);
            }
            this.f25333a.lineTo(g2.x - f, (g2.y - f2) + i);
            if (i2 > 0) {
                float f5 = i * 2.0f;
                this.b.set(g2.x - f, g2.y - f2, (g2.x - f) + f5, (g2.y - f2) + f5);
                this.f25333a.arcTo(this.b, 180.0f, 90.0f, false);
            }
            this.f25333a.lineTo((g2.x + f) - i, g2.y - f2);
            if (i2 > 0) {
                float f6 = i * 2.0f;
                this.b.set((g2.x + f) - f6, g2.y - f2, g2.x + f, (g2.y - f2) + f6);
                this.f25333a.arcTo(this.b, 270.0f, 90.0f, false);
            }
            this.f25333a.close();
            this.i.a(this.f25333a);
        }
        this.k = true;
        return this.f25333a;
    }

    @Override // tb.ahg.a
    public void onValueChanged() {
        b();
    }
}
