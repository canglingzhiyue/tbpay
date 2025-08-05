package tb;

import android.graphics.Path;
import com.airbnb.lottie.model.content.j;
import java.util.List;

/* loaded from: classes2.dex */
public class ahs extends ahg<j, Path> {
    private final j d;
    private final Path e;
    private List<ahd> f;

    public ahs(List<akm<j>> list) {
        super(list);
        this.d = new j();
        this.e = new Path();
    }

    public void a(List<ahd> list) {
        this.f = list;
    }

    @Override // tb.ahg
    /* renamed from: b */
    public Path a(akm<j> akmVar, float f) {
        this.d.a(akmVar.f25395a, akmVar.b, f);
        j jVar = this.d;
        List<ahd> list = this.f;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                jVar = this.f.get(size).a(jVar);
            }
        }
        akk.a(jVar, this.e);
        return this.e;
    }
}
