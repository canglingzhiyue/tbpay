package tb;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.m;
import com.airbnb.lottie.model.content.ShapeStroke;
import com.airbnb.lottie.model.layer.a;

/* loaded from: classes2.dex */
public class ahe extends agl {
    private final a d;
    private final String e;
    private final boolean f;
    private final ahg<Integer, Integer> g;
    private ahg<ColorFilter, ColorFilter> h;

    public ahe(LottieDrawable lottieDrawable, a aVar, ShapeStroke shapeStroke) {
        super(lottieDrawable, aVar, shapeStroke.g().toPaintCap(), shapeStroke.h().toPaintJoin(), shapeStroke.i(), shapeStroke.c(), shapeStroke.d(), shapeStroke.e(), shapeStroke.f());
        this.d = aVar;
        this.e = shapeStroke.a();
        this.f = shapeStroke.j();
        this.g = shapeStroke.b().a();
        this.g.a(this);
        aVar.a(this.g);
    }

    @Override // tb.agn
    public String a() {
        return this.e;
    }

    @Override // tb.agl, tb.agp
    public void a(Canvas canvas, Matrix matrix, int i) {
        if (this.f) {
            return;
        }
        this.b.setColor(((ahh) this.g).i());
        if (this.h != null) {
            this.b.setColorFilter(this.h.g());
        }
        super.a(canvas, matrix, i);
    }

    @Override // tb.agl, com.airbnb.lottie.model.e
    public <T> void a(T t, ako<T> akoVar) {
        super.a((ahe) t, (ako<ahe>) akoVar);
        if (t == m.STROKE_COLOR) {
            this.g.a((ako<Integer>) akoVar);
        } else if (t != m.COLOR_FILTER) {
        } else {
            ahg<ColorFilter, ColorFilter> ahgVar = this.h;
            if (ahgVar != null) {
                this.d.b(ahgVar);
            }
            if (akoVar == null) {
                this.h = null;
                return;
            }
            this.h = new ahw(akoVar);
            this.h.a(this);
            this.d.a(this.g);
        }
    }
}
