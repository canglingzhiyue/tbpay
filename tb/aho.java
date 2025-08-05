package tb;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.g;

/* loaded from: classes2.dex */
public class aho extends akm<PointF> {
    private Path j;
    private final akm<PointF> k;

    public aho(g gVar, akm<PointF> akmVar) {
        super(gVar, akmVar.f25395a, akmVar.b, akmVar.c, akmVar.d, akmVar.e, akmVar.f, akmVar.g);
        this.k = akmVar;
        a();
    }

    public void a() {
        boolean z = (this.b == 0 || this.f25395a == 0 || !((PointF) this.f25395a).equals(((PointF) this.b).x, ((PointF) this.b).y)) ? false : true;
        if (this.f25395a == 0 || this.b == 0 || z) {
            return;
        }
        this.j = akl.a((PointF) this.f25395a, (PointF) this.b, this.k.h, this.k.i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Path b() {
        return this.j;
    }
}
