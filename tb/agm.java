package tb;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class agm {

    /* renamed from: a  reason: collision with root package name */
    private final List<ahf> f25324a = new ArrayList();

    public void a(Path path) {
        for (int size = this.f25324a.size() - 1; size >= 0; size--) {
            akl.a(path, this.f25324a.get(size));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(ahf ahfVar) {
        this.f25324a.add(ahfVar);
    }
}
