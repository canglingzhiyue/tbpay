package tb;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.m;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.model.content.b;
import com.airbnb.lottie.model.d;
import com.airbnb.lottie.model.layer.a;
import java.util.List;
import tb.ahg;

/* loaded from: classes2.dex */
public class agq implements agv, agx, ahg.a {
    private final String b;
    private final LottieDrawable c;
    private final ahg<?, PointF> d;
    private final ahg<?, PointF> e;
    private final b f;
    private boolean h;

    /* renamed from: a  reason: collision with root package name */
    private final Path f25326a = new Path();
    private final agm g = new agm();

    public agq(LottieDrawable lottieDrawable, a aVar, b bVar) {
        this.b = bVar.a();
        this.c = lottieDrawable;
        this.d = bVar.c().a();
        this.e = bVar.b().a();
        this.f = bVar;
        aVar.a(this.d);
        aVar.a(this.e);
        this.d.a(this);
        this.e.a(this);
    }

    private void b() {
        this.h = false;
        this.c.invalidateSelf();
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
        if (t == m.ELLIPSE_SIZE) {
            this.d.a((ako<PointF>) akoVar);
        } else if (t != m.POSITION) {
        } else {
            this.e.a((ako<PointF>) akoVar);
        }
    }

    @Override // tb.agn
    public void a(List<agn> list, List<agn> list2) {
        for (int i = 0; i < list.size(); i++) {
            agn agnVar = list.get(i);
            if (agnVar instanceof ahf) {
                ahf ahfVar = (ahf) agnVar;
                if (ahfVar.b() == ShapeTrimPath.Type.SIMULTANEOUSLY) {
                    this.g.a(ahfVar);
                    ahfVar.a(this);
                }
            }
        }
    }

    @Override // tb.agx
    public Path d() {
        if (this.h) {
            return this.f25326a;
        }
        this.f25326a.reset();
        if (!this.f.e()) {
            PointF g = this.d.g();
            float f = g.x / 2.0f;
            float f2 = g.y / 2.0f;
            float f3 = f * 0.55228f;
            float f4 = 0.55228f * f2;
            this.f25326a.reset();
            if (this.f.d()) {
                float f5 = -f2;
                this.f25326a.moveTo(0.0f, f5);
                float f6 = 0.0f - f3;
                float f7 = -f;
                float f8 = 0.0f - f4;
                this.f25326a.cubicTo(f6, f5, f7, f8, f7, 0.0f);
                float f9 = f4 + 0.0f;
                this.f25326a.cubicTo(f7, f9, f6, f2, 0.0f, f2);
                float f10 = f3 + 0.0f;
                this.f25326a.cubicTo(f10, f2, f, f9, f, 0.0f);
                this.f25326a.cubicTo(f, f8, f10, f5, 0.0f, f5);
            } else {
                float f11 = -f2;
                this.f25326a.moveTo(0.0f, f11);
                float f12 = f3 + 0.0f;
                float f13 = 0.0f - f4;
                this.f25326a.cubicTo(f12, f11, f, f13, f, 0.0f);
                float f14 = f4 + 0.0f;
                this.f25326a.cubicTo(f, f14, f12, f2, 0.0f, f2);
                float f15 = 0.0f - f3;
                float f16 = -f;
                this.f25326a.cubicTo(f15, f2, f16, f14, f16, 0.0f);
                this.f25326a.cubicTo(f16, f13, f15, f11, 0.0f, f11);
            }
            PointF g2 = this.e.g();
            this.f25326a.offset(g2.x, g2.y);
            this.f25326a.close();
            this.g.a(this.f25326a);
        }
        this.h = true;
        return this.f25326a;
    }

    @Override // tb.ahg.a
    public void onValueChanged() {
        b();
    }
}
