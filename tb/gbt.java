package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes5.dex */
public class gbt implements gbq<Float> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final float f28297a;
    public final float b;

    static {
        kge.a(1570586583);
        kge.a(-1096866309);
    }

    public static gbt a(float f, float f2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (gbt) ipChange.ipc$dispatch("5f17b745", new Object[]{new Float(f), new Float(f2)}) : new gbt(f, f2);
    }

    public gbt(float f, float f2) {
        this.f28297a = f;
        this.b = f2;
    }

    @Override // tb.gbq
    public gbp<Float> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (gbp) ipChange.ipc$dispatch("f04f4c9", new Object[]{this}) : new gbr(this);
    }
}
