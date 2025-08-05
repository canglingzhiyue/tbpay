package tb;

import android.graphics.PointF;
import java.util.List;

/* loaded from: classes2.dex */
public class aih implements ail<PointF, PointF> {

    /* renamed from: a  reason: collision with root package name */
    private final aia f25349a;
    private final aia b;

    public aih(aia aiaVar, aia aiaVar2) {
        this.f25349a = aiaVar;
        this.b = aiaVar2;
    }

    @Override // tb.ail
    public ahg<PointF, PointF> a() {
        return new aht(this.f25349a.a(), this.b.a());
    }

    @Override // tb.ail
    public boolean b() {
        return this.f25349a.b() && this.b.b();
    }

    @Override // tb.ail
    public List<akm<PointF>> c() {
        akh.c("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
        return null;
    }
}
