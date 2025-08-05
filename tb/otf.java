package tb;

import android.view.animation.Interpolator;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes8.dex */
public class otf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final int f32385a;
    private final Interpolator b;
    private final int c;

    static {
        kge.a(-1436907228);
    }

    public otf(int i, Interpolator interpolator, int i2) {
        this.f32385a = i;
        this.b = interpolator;
        this.c = i2;
    }

    public int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.f32385a;
    }

    public Interpolator b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Interpolator) ipChange.ipc$dispatch("e37fe77e", new Object[]{this}) : this.b;
    }

    public int c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : this.c;
    }
}
