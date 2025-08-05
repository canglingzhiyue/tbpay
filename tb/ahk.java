package tb;

import com.airbnb.lottie.model.content.d;
import java.util.List;

/* loaded from: classes2.dex */
public class ahk extends ahm<d> {
    private final d d;

    public ahk(List<akm<d>> list) {
        super(list);
        int i = 0;
        d dVar = list.get(0).f25395a;
        i = dVar != null ? dVar.c() : i;
        this.d = new d(new float[i], new int[i]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // tb.ahg
    /* renamed from: b */
    public d a(akm<d> akmVar, float f) {
        this.d.a(akmVar.f25395a, akmVar.b, f);
        return this.d;
    }
}
