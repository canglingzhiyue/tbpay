package tb;

import android.graphics.Path;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.model.content.m;
import com.airbnb.lottie.model.layer.a;
import java.util.ArrayList;
import java.util.List;
import tb.ahg;

/* loaded from: classes2.dex */
public class ahc implements agx, ahg.a {
    private final String b;
    private final boolean c;
    private final LottieDrawable d;
    private final ahs e;
    private boolean f;

    /* renamed from: a  reason: collision with root package name */
    private final Path f25336a = new Path();
    private final agm g = new agm();

    public ahc(LottieDrawable lottieDrawable, a aVar, m mVar) {
        this.b = mVar.a();
        this.c = mVar.c();
        this.d = lottieDrawable;
        this.e = mVar.b().a();
        aVar.a(this.e);
        this.e.a(this);
    }

    private void b() {
        this.f = false;
        this.d.invalidateSelf();
    }

    @Override // tb.agn
    public String a() {
        return this.b;
    }

    @Override // tb.agn
    public void a(List<agn> list, List<agn> list2) {
        ArrayList arrayList = null;
        for (int i = 0; i < list.size(); i++) {
            agn agnVar = list.get(i);
            if (agnVar instanceof ahf) {
                ahf ahfVar = (ahf) agnVar;
                if (ahfVar.b() == ShapeTrimPath.Type.SIMULTANEOUSLY) {
                    this.g.a(ahfVar);
                    ahfVar.a(this);
                }
            }
            if (agnVar instanceof ahd) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add((ahd) agnVar);
            }
        }
        this.e.a((List<ahd>) arrayList);
    }

    @Override // tb.agx
    public Path d() {
        if (this.f) {
            return this.f25336a;
        }
        this.f25336a.reset();
        if (!this.c) {
            Path g = this.e.g();
            if (g == null) {
                return this.f25336a;
            }
            this.f25336a.set(g);
            this.f25336a.setFillType(Path.FillType.EVEN_ODD);
            this.g.a(this.f25336a);
        }
        this.f = true;
        return this.f25336a;
    }

    @Override // tb.ahg.a
    public void onValueChanged() {
        b();
    }
}
