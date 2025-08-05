package tb;

import android.graphics.PointF;
import java.util.List;

/* loaded from: classes2.dex */
public class aid implements ail<PointF, PointF> {

    /* renamed from: a  reason: collision with root package name */
    private final List<akm<PointF>> f25348a;

    public aid(List<akm<PointF>> list) {
        this.f25348a = list;
    }

    @Override // tb.ail
    public ahg<PointF, PointF> a() {
        return this.f25348a.get(0).e() ? new ahq(this.f25348a) : new ahp(this.f25348a);
    }

    @Override // tb.ail
    public boolean b() {
        return this.f25348a.size() == 1 && this.f25348a.get(0).e();
    }

    @Override // tb.ail
    public List<akm<PointF>> c() {
        return this.f25348a;
    }
}
